package com.example.tea_adviser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val findTea = findViewById<Button>(R.id.find_tea)
        // val color = teaColor.selectedItem.toString()


        findTea.setOnClickListener {

            val teaColor = findViewById<Spinner>(R.id.tea_color)
            val color = "${teaColor.selectedItem}"

            val teaList = getTea(color.toString())
            val teas = teaList.reduce{str,item->str + "\n" + item}
            val brands = findViewById<TextView>(R.id.brands)
            brands.text=teas

        }
    }

        fun getTea(color: String): List<String> {
            return when (color) {
                "Light" -> listOf("Cay1", "Cay2","Caydanlik","Demlik")
                "Amber" -> listOf("Cay3", "Cay4")
                "Brown" -> listOf("Cay5", "Cay6")
                else -> listOf("Cay7")

            }
        }


}