package app.template.patches.remakefaceai.ads

import app.morphe.patcher.patch.bytecodePatch
import app.morphe.patcher.util.proxy.mutableTypes.MutableMethod
import app.template.patches.shared.Constants
import app.template.patches.shared.returnEarly

@Suppress("unused")
val removeAdsPatch = bytecodePatch(
    name = "Remove Ads",
    description = "Removes ads by preventing ad display methods from executing",
) {
    compatibleWith(Constants.REMAKE_FACE_AI_COMPATIBILITY)

    execute {
        ZF1.method.returnEarly(true)
        FF1.method.returnEarly(true)
        QS2.method.returnEarly(true)
        UT2.method.returnEarly(true)
        XG.method.returnEarly(true)
        NH.method.returnEarly(true)
        HF1.method.returnEarly(true)
        UG.method.returnEarly(true)
        CF1.method.returnEarly(true)
    }
}
