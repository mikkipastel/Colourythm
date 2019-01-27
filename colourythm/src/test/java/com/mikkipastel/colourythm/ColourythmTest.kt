package com.mikkipastel.colourythm

import org.junit.Test
import org.junit.Assert.*

class ColourythmTest {

    @Test
    fun generateTextColorBlackFromPrimaryBlue() {
        assertEquals("#FFFFFF", Colourythm().genStringTextBWcolorFromBg(63, 81, 181))
    }

    @Test
    fun generateTextColorBlackFromPrimaryDarkBlue() {
        assertEquals("#FFFFFF", Colourythm().genStringTextBWcolorFromBg(48, 63, 159))
    }

    @Test
    fun generateTextColorBlackFromAccentBlue() {
        assertEquals("#000000", Colourythm().genStringTextBWcolorFromBg(21, 192, 255))
    }

    @Test
    fun generateTextColorBlackFromAllPrimaryBlue() {
        assertEquals("#FFFFFF", Colourythm().genStringTextBWcolorFromBg(35, 44, 58))
    }

    @Test
    fun generateTextColorBlackFromWhite() {
        assertEquals("#000000", Colourythm().genStringTextBWcolorFromBg(255, 255, 255))
    }

    @Test
    fun generateTextColorWhiteFromBlack() {
        assertEquals("#FFFFFF", Colourythm().genStringTextBWcolorFromBg(0, 0, 0))
    }

    @Test
    fun generateTextColorBlackFromRed600() {
        assertEquals("#000000", Colourythm().genStringTextBWcolorFromBg(229, 57, 53))
    }

    @Test
    fun generateTextColorWhiteFromRed700() {
        assertEquals("#FFFFFF", Colourythm().genStringTextBWcolorFromBg(211, 47, 47))
    }

    @Test
    fun generateTextColorBlackFromPink500() {
        assertEquals("#000000", Colourythm().genStringTextBWcolorFromBg(233, 30, 99))
    }

    @Test
    fun generateTextColorWhiteFromPink600() {
        assertEquals("#FFFFFF", Colourythm().genStringTextBWcolorFromBg(216, 27, 96))
    }

}