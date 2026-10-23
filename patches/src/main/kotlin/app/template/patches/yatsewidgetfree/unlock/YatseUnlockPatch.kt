package app.template.patches.yatsewidgetfree.unlock

import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.util.proxy.mutableTypes.MutableMethod
import app.template.patches.shared.Constants
import app.template.patches.shared.returnEarly

@Suppress("unused")
val yatseUnlockPatch = bytecodePatch(
    name = "Yatse Unlocker",
    description = "Unlocks all premium features",
    default = true,
) {
    compatibleWith(Constants.YATSEWIDGETFREE_COMPATIBILITY)

    execute {
        LicenseGateFingerprint.method.returnEarly(true)
        FeatureGateFingerprint.method.returnEarly(true)
        LicenseStatusFingerprint.method.addInstructions(0, "const/16 v0, 0x22\nreturn v0")
        PurchaseLauncherFingerprint.method.addInstructions(0, "return-void")
    }
}
