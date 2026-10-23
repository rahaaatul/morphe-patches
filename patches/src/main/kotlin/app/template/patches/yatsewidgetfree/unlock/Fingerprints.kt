package app.template.patches.yatsewidgetfree.unlock

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.methodCall
import app.morphe.patcher.opcode
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

object LicenseGateFingerprint : Fingerprint(
    definingClass = "Lsd/r;",
    name = "h",
    returnType = "Z",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    parameters = emptyList(),
    filters = listOf(
        fieldAccess(
            definingClass = "Lsd/r;",
            name = "r",
            type = "J",
            opcode = Opcode.SGET_WIDE,
        ),
        opcode(Opcode.CMP_LONG),
    ),
)

object FeatureGateFingerprint : Fingerprint(
    definingClass = "Lbf/u4;",
    name = "e",
    returnType = "Z",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    parameters = listOf("Laf/k;"),
    filters = listOf(
        methodCall(definingClass = "Ljava/lang/Enum;", name = "ordinal", returnType = "I"),
        opcode(Opcode.PACKED_SWITCH),
    ),
)

object LicenseStatusFingerprint : Fingerprint(
    definingClass = "Lqd/e0;",
    name = "h0",
    returnType = "I",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    parameters = emptyList(),
    filters = listOf(
        methodCall(definingClass = "Lm6/m;", name = "q0", returnType = "Ljava/lang/Object;"),
    ),
)

object PurchaseLauncherFingerprint : Fingerprint(
    definingClass = "Lsd/r;",
    name = "j",
    returnType = "V",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC),
    parameters = listOf("Landroid/app/Activity;", "Ljava/lang/String;", "Z"),
    filters = listOf(
        methodCall(definingClass = "Lc5/h;", name = "f", returnType = "V"),
    ),
)
