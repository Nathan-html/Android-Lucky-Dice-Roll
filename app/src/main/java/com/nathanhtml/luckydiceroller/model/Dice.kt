package com.nathanhtml.luckydiceroller.model

/**
 * Initial a dice with this number of sides
 * and roll it :)
 */
class Dice (private val sides : Int) {
    fun roll () : Int {
        return (1..sides).random();
    }
}