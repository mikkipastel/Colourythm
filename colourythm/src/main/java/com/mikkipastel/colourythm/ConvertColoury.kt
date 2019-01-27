package com.mikkipastel.colourythm

class ConvertColoury {

    fun getRGBFromHEX(rgb: Int): List<Int> {
        val r = rgb.shr(16)
        val g = rgb.and(0xFF00).shr(8)
        val b = rgb.and(0xFF)

        return listOf(r, g, b)
    }

    fun getGreyScaleFromRGB(r: Int, g: Int, b: Int): Double {
        return ((0.58 * r) + (0.17 * g) + (0.8 * b))
    }

}