package com.mikkipastel.colourythm

import android.content.Context
import android.graphics.Color
import androidx.core.content.ContextCompat

class Colourythm {

    fun genTextBWcolorFromBg(rgb: Int): Int {
        val hexRGB = ConvertColoury().getRGBFromHEX(rgb)
        val luminance = luminance(hexRGB[0], hexRGB[1], hexRGB[2])

        return Color.parseColor(getWhiteAndBlackTextFromLuminance(luminance))
    }

    fun genTextBWcolorFromBg(r: Int, g: Int, b: Int): Int {
        val luminance = luminance(r, g, b)
        return Color.parseColor(getWhiteAndBlackTextFromLuminance(luminance))
    }

    fun genTextBWcolorFromBg(context: Context, resource: Int): Int {
        val color = ContextCompat.getColor(context, resource)
        val hexRGB = ConvertColoury().getRGBFromHEX(color)
        val luminance = luminance(hexRGB[0], hexRGB[1], hexRGB[2])

        return Color.parseColor(getWhiteAndBlackTextFromLuminance(luminance))
    }

    fun genStringTextBWcolorFromBg(r: Int, g: Int, b: Int): String {
        val luminance = luminance(r, g, b)
        return getWhiteAndBlackTextFromLuminance(luminance)
    }

    private fun getWhiteAndBlackTextFromLuminance(luminance: Double): String {
        return when ((luminance + 0.05) / (0.05) > (1.05) / (luminance + 0.05)) {
            true -> "#000000"
            false -> "#FFFFFF"
        }
    }

    fun luminance(r: Int, g: Int, b: Int): Double {
        val a = listOf(r, g, b)
        val result: MutableList<Double> = arrayListOf()

        a.forEachIndexed { index, i ->
            val newRGB = (i.toDouble()).div(255)
            result.add(index, when (newRGB <= 0.03928) {
                true -> newRGB / 12.92
                false -> Math.pow((newRGB + 0.055) / 1.055, 2.4)
            })
        }

        return (0.2126 * result[0]) + (0.7152 * result[1]) + (0.0722 * result[2])
    }

}
