package com.yuk.miuihome.view

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Switch

import java.lang.reflect.Field

class CustomSwitch(context: Context) : Switch(context) {

    @SuppressLint("DiscouragedPrivateApi", "DrawAllocation")
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val switchWidth: Field = Switch::class.java.getDeclaredField("mSwitchWidth")
        switchWidth.isAccessible = true
        if (HookSettingsActivity().getDensityDpi() >= 392) switchWidth.setInt(this, 130)
    }
}