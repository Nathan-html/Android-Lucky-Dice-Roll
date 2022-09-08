package com.nathanhtml.luckydiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.nathanhtml.luckydiceroller.model.Dice

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lucky dice process
        val dice = Dice(6)
        val btn : Button = findViewById(R.id.roll_btn)
        val luckyOrNoMsg : TextView = findViewById(R.id.lucky_or_not)
        val printBotDice : ImageView = findViewById(R.id.print_bot_dice)
        val printYourDice : ImageView = findViewById(R.id.print_your_dice)
        var IAResult : Int = dice.roll()
        var UserResult : Int = dice.roll()
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
        toast.show()
        btn.setOnClickListener{
            // roll dices
            IAResult = dice.roll()
            UserResult = dice.roll()
            // print IA result
            if (IAResult == 1) printBotDice.setImageResource(R.drawable.dice_1)
            else if (IAResult == 2) printBotDice.setImageResource(R.drawable.dice_2)
            else if (IAResult == 3) printBotDice.setImageResource(R.drawable.dice_3)
            else if (IAResult == 4) printBotDice.setImageResource(R.drawable.dice_4)
            else if (IAResult == 5) printBotDice.setImageResource(R.drawable.dice_5)
            else if (IAResult == 6) printBotDice.setImageResource(R.drawable.dice_6)
            // print User result
            if (UserResult == 1) printYourDice.setImageResource(R.drawable.dice_1)
            else if (UserResult == 2) printYourDice.setImageResource(R.drawable.dice_2)
            else if (UserResult == 3) printYourDice.setImageResource(R.drawable.dice_3)
            else if (UserResult == 4) printYourDice.setImageResource(R.drawable.dice_4)
            else if (UserResult == 5) printYourDice.setImageResource(R.drawable.dice_5)
            else if (UserResult == 6) printYourDice.setImageResource(R.drawable.dice_6)
            // print message
            if(UserResult > IAResult) {
                luckyOrNoMsg.text = "Lucky !"
            } else {
                luckyOrNoMsg.text = "Unlucky !"
            }
        }
    }
}