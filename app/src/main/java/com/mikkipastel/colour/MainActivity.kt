package com.mikkipastel.colour


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.mikkipastel.colourythm.Colourythm
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Sample for put rgb color
        layoutSample.setBackgroundColor(Color.rgb(233, 30, 99))
        textSample.setTextColor(Colourythm().genTextBWcolorFromBg(233, 30, 99))

        //Sample for put hex color
        layoutSample2.setBackgroundColor(ContextCompat.getColor(this, R.color.colorRed600))
        textSample2.setTextColor(Colourythm().genTextBWcolorFromBg(0xd32f2f))

        //Sample for put resource color
        layoutSample3.setBackgroundColor(ContextCompat.getColor(this, R.color.colorBrown50))
        textSample3.setTextColor(Colourythm().genTextBWcolorFromBg(this, R.color.colorBrown50))

        val color = ContextCompat.getColor(this, R.color.colorGrey900)
        layoutSample4.setBackgroundColor(color)
        textSample4.setTextColor(Colourythm().genTextBWcolorFromBg(color))
    }
}
