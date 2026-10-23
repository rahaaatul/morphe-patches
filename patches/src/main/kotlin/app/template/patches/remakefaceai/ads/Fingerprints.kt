package app.template.patches.remakefaceai.ads

import app.morphe.patcher.Fingerprint
import app.morphe.patcher.fieldAccess
import app.morphe.patcher.string
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

// MediationInterstitialAd.showAd wrapper
object ZF1 : Fingerprint(
    definingClass = "Lads_mobile_sdk/zf1;",
    name = "a",
    returnType = "V",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC, AccessFlags.FINAL),
    parameters = listOf("Lads_mobile_sdk/nu2;", "Lads_mobile_sdk/zf1;"),
    filters = listOf(
        string("interstitialAd"),
    ),
)

object FF1 : Fingerprint(
    definingClass = "Lads_mobile_sdk/ff1;",
    name = "a",
    returnType = "V",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC, AccessFlags.FINAL),
    parameters = listOf("Lads_mobile_sdk/ll1;", "Lads_mobile_sdk/ff1;"),
    filters = listOf(
        string("interstitialAd"),
    ),
)

// MediationRewardedAd.showAd wrapper
object QS2 : Fingerprint(
    definingClass = "Lads_mobile_sdk/qs2;",
    name = "a",
    returnType = "V",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC, AccessFlags.FINAL),
    parameters = listOf("Lads_mobile_sdk/ll1;", "Lads_mobile_sdk/qs2;"),
    filters = listOf(
        string("rewardedAd"),
    ),
)

object UT2 : Fingerprint(
    definingClass = "Lads_mobile_sdk/ut2;",
    name = "a",
    returnType = "V",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC, AccessFlags.FINAL),
    parameters = listOf("Lads_mobile_sdk/nu2;", "Lads_mobile_sdk/ut2;"),
    filters = listOf(
        string("rewardedAd"),
    ),
)

// MediationAppOpenAd.showAd wrapper
object XG : Fingerprint(
    definingClass = "Lads_mobile_sdk/xg;",
    name = "a",
    returnType = "V",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC, AccessFlags.FINAL),
    parameters = listOf("Lads_mobile_sdk/ll1;", "Lads_mobile_sdk/xg;"),
    filters = listOf(
        string("appOpenAd"),
    ),
)

object NH : Fingerprint(
    definingClass = "Lads_mobile_sdk/nh;",
    name = "a",
    returnType = "V",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC, AccessFlags.FINAL),
    parameters = listOf("Lads_mobile_sdk/nu2;", "Lads_mobile_sdk/nh;"),
    filters = listOf(
        string("appOpenAd"),
    ),
)

// MediationInterstitialAdapter.showInterstitial wrapper
object HF1 : Fingerprint(
    definingClass = "Lads_mobile_sdk/hf1;",
    name = "a",
    returnType = "V",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.STATIC, AccessFlags.FINAL),
    parameters = listOf("Lads_mobile_sdk/z12;"),
    filters = listOf(
        string("interstitialAd"),
    ),
)

// Mediation wrapper for ug.show
object UG : Fingerprint(
    definingClass = "Lads_mobile_sdk/ug;",
    name = "show",
    returnType = "V",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    parameters = listOf("Landroid/app/Activity;"),
    filters = listOf(
        fieldAccess(definingClass = "Lads_mobile_sdk/ug;", name = "b", type = "Lrn3;", opcode = Opcode.IGET_OBJECT),
    ),
)
object CF1 : Fingerprint(
    definingClass = "Lads_mobile_sdk/cf1;",
    name = "show",
    returnType = "V",
    accessFlags = listOf(AccessFlags.PUBLIC, AccessFlags.FINAL),
    parameters = listOf("Landroid/app/Activity;"),
    filters = listOf(
        fieldAccess(
            definingClass = "Lads_mobile_sdk/cf1;",
            name = "b",
            type = "Lci3;",
            opcode = Opcode.IGET_OBJECT
        ),
    ),
)
