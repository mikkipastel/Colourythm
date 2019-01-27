package com.mikkipastel.colourythm

import org.junit.Assert
import org.junit.Test

class GetRGBFromHEX {

    //15C0FF: 21, 192, 255
    //303F9F: 48, 63, 158

    @Test
    fun hexToRed() {
        Assert.assertEquals(48, (0x303F9F).shr(16))
    }

    @Test
    fun hexToGreen() {
        Assert.assertEquals(63, (0x303F9F).and(0xFF00).shr(8))
    }

    @Test
    fun hexToBlue() {
        Assert.assertEquals(159, (0x303F9F).and(0xFF))
    }

}