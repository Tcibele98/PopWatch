package com.popwatch.mvp

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this).apply {
            text = "PopWatch\n\nAplicativo iniciado com sucesso."
            textSize = 24f
            setTextColor(Color.WHITE)
            setBackgroundColor(Color.rgb(17, 17, 26))
            setPadding(32, 32, 32, 32)
        }

        setContentView(text)
    }
}
