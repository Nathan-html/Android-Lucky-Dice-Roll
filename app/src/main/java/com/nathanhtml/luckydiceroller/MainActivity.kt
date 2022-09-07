package com.nathanhtml.luckydiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.nathanhtml.luckydiceroller.model.Dice

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lucky dice process
        val dice : Dice = Dice(6);
        val btn : Button = findViewById(R.id.roll_btn);
        val luckyOrNoMsg : TextView = findViewById(R.id.lucky_or_not);
        val luckyOrNoDetail : TextView = findViewById(R.id.lucky_or_not_detail);
        val printDice : TextView = findViewById(R.id.print_dice);
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
        toast.show();
        btn.setOnClickListener{
            val IA = dice.roll();
            val User = dice.roll();
            printDice.text = User.toString();
            luckyOrNoDetail.text = "I get " + IA.toString();
            if(User > IA) {
                luckyOrNoMsg.text = "Lucky !"
            } else {
                luckyOrNoMsg.text = "Unlucky !"
            }
//            lucky_or_not
//            rollText.text = dice.roll().toString();
        }
    }
}