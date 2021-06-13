package com.yuk.miuihome.module

import com.yuk.miuihome.utils.OwnSP
import com.yuk.miuihome.utils.ktx.setReturnConstant

class EnableHideStatusBarWhenEnterRecents {

    fun init() {

        if (OwnSP.ownSP.getBoolean("hideStatusBar", false)){
            "com.miui.home.launcher.common.DeviceLevelUtils".setReturnConstant("isHideStatusBarWhenEnterRecents", result = true)
        } else {
            "com.miui.home.launcher.common.DeviceLevelUtils".setReturnConstant("isHideStatusBarWhenEnterRecents", result = false)
        }
    }

}