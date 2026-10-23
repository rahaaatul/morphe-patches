package app.template.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.SupportedAbi

object Constants {

    val BATTERYGURU_COMPATIBILITY = Compatibility(
        name = "Battery Guru",
        packageName = "com.paget96.batteryguru",
        appIconColor = 0x146478,
        targets = listOf(
            AppTarget(version = "2.5.0.8", versionCode = 732),
        )
    )

    val PRIVACYKIT_COMPATIBILITY = Compatibility(
        name = "Privacy Kit",
        packageName = "com.sal.privacykit",
        appIconColor = 0x1A73E8,
        targets = listOf(
            AppTarget(version = "3.7.1", versionCode = 112),
        )
    )

    val REMAKE_FACE_AI_COMPATIBILITY = Compatibility(
        name = "Remake Face AI",
        packageName = "com.dirgasena.remakefaceai",
        appIconColor = 0x000000,
        targets = listOf(
            AppTarget(version = "1.1.1"),
        )
    )

    val YATSEWIDGETFREE_COMPATIBILITY = Compatibility(
        name = "Yatse",
        packageName = "org.leetzone.android.yatsewidgetfree",
        targets = listOf(
            AppTarget(version = "12.0.0", versionCode = 31108308, minSdk = 24),
        ),
        apkFileType = ApkFileType.APK,
    )
}
