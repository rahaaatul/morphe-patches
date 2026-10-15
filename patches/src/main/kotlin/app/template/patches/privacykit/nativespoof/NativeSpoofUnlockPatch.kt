package app.template.patches.privacykit.nativespoof

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.extensions.InstructionExtensions.addInstructions
import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.util.proxy.mutableTypes.MutableMethod
import app.template.patches.shared.Constants
import app.template.patches.shared.returnEarly
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

object Db1FeatureGateFingerprint : Fingerprint(
    definingClass = "Ldb1;",
    name = "a",
    returnType = "Z",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    parameters = listOf("Ljc3;"),
    filters = listOf(
        fieldAccess(
            definingClass = "Ldb1;",
            name = "a",
            type = "Z",
            opcode = Opcode.IGET_BOOLEAN,
        )
    )
)

@Suppress("unused")
val nativeSpoofUnlockPatch = bytecodePatch(
    name = "Unlock Native Spoofing (Zygisk)",
    description = "Unlocks Native Spoofing (Zygisk) in Developer Settings",
) {
    compatibleWith(Constants.PRIVACYKIT_COMPATIBILITY)

    execute {
        Db1FeatureGateFingerprint.method.apply {
            val instructions = "invoke-virtual {p1}, Ljc3;->ordinal()I\n" +
                               "move-result v0\n" +
                               "const/4 v1, 0x7\n" +
                               "if-ne v0, v1, :return_false\n" +
                               "const/4 p0, 0x1\n" +
                               "return p0\n" +
                               ":return_false\n" +
                               "const/4 p0, 0x0\n" +
                               "return p0"
            addInstructions(0, instructions)
        }
    }
}
