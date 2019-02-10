package com.mikkipastel.colourythm

import org.junit.Test
import org.junit.Assert.*

class LuminanceTest {

    @Test
    fun luminanceTestWithPrimaryBlue() {
        assertEquals(0.102778167442517, Colourythm().luminance(63, 81, 181), 1.0)
    }

    @Test
    fun luminanceTestWithPrimaryDarkBlue() {
        assertEquals(0.0668659518621591, Colourythm().luminance(48, 63, 159), 1.0)
    }

    @Test
    fun luminanceTestWithAccentBlue() {
        assertEquals(0.450787032117187, Colourythm().luminance(21, 192, 255), 1.0)
    }

    @Test
    fun luminanceTestWithAllPrimaryBlue() {
        assertEquals(0.0246417739373754, Colourythm().luminance(35, 44, 58), 1.0)
    }

    @Test
    fun luminanceTestWithWhite() {
        assertEquals(1.0, Colourythm().luminance(255, 255, 255), 0.0)
    }

    @Test
    fun luminanceTestWithBlack() {
        assertEquals(0.0, Colourythm().luminance(0, 0, 0), 0.0)
    }

    @Test
    fun luminanceTestWithRed600() {
        assertEquals(0.198413098240227, Colourythm().luminance(229, 57, 53), 1.0)
    }

    @Test
    fun luminanceTestWithRed700() {
        assertEquals(0.160871502021236, Colourythm().luminance(211, 47, 47), 1.0)
    }

    @Test
    fun luminanceTestWithPink500() {
        assertEquals(0.191530371212166, Colourythm().luminance(233, 30, 99), 1.0)
    }

    @Test
    fun luminanceTestWithPink600() {
        assertEquals(0.162273238869353, Colourythm().luminance(216, 27, 96), 1.0)
    }

}