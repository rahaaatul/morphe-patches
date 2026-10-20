package app.morphe.patches.all.misc.fix.changepackageinstaller

import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.util.proxy.mutableTypes.MutableMethod

/**
 * Changes the installer package name returned by PackageManager.getInstallerPackageName().
 */
@Suppress("unused")
fun changePackageInstallerPatch(installerPackageName: String) = bytecodePatch(
    name = "Change installer package name",
    description = "Changes the installer package name reported by the app."
) {
    execute {
        // PackageManager is a framework class; try to resolve it from the app dex if present.
        val pmClass = mutableClassDefByOrNull("Landroid/content/pm/PackageManager;")
        val method = pmClass?.virtualMethods?.firstOrNull {
            it.name == "getInstallerPackageName"
        } as? MutableMethod
        method?.addInstructions(
            0,
            "const-string v0, \"$installerPackageName\"\nreturn-object v0"
        )
    }
}
