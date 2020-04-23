package com.example.oddoreven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // რენდომ რიცხვის გენერაცია
        fun generateNumber() : Int{
            return (1..101).random()
        }

        // ღილაკის ქლიქლისთენერი Toast-ისთვის
        btn.setOnClickListener(){
            if(generateNumber()%2==0){
                Toast.makeText(this, "Generated Number is Even", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Generated Number is Odd", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
