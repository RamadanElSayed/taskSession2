import kotlin.math.round

import kotlin.math.*
import kotlin.math.*

fun main() {
        // Reading and processing integer and long values
        println("Enter an integer:")
        val intValue = readln().toInt()
        val intToLong = intValue.toLong()
        println("Enter a long number:")
        val userLongValue = readln().toLong()
        val sum = intToLong + userLongValue
        val sub = userLongValue - intToLong

        // Finding the minimum and maximum values between sum and sub
        val minValue = min(sum, sub)
        val maxValue = max(sum, sub)
        val intAbs = abs(intValue)

        println("\nInteger and Long Operations:")
        println("Int to Long: $intToLong")
        println("Sum of Longs: $sum")
        println("Subtraction of Longs: $sub")
        println("Minimum Value: $minValue")
        println("Maximum Value: $maxValue")
        println("Absolute Value: $intAbs")


        // Reading and processing float and double values
        println("\nEnter a float number:")
        val floatValue = readln().toFloat()
        val floatToInt = floatValue.toInt()
        val floatToDouble = floatValue.toDouble()

        println("Enter a double number:")
        val userDoubleValue = readln().toDouble()
        val doubleProduct = floatToDouble * userDoubleValue
        val floatRound = round(floatValue).toInt()


        println("\nFloat and Double Operations:")
        println("Float to Int: $floatToInt")
        println("Float to Double: $floatToDouble")
        println("Product of Doubles: $doubleProduct")
        println("Rounded Float Value: $floatRound")

        // Reading and processing string and char values
        println("\nEnter a string:")
        val stringValue = readln()
        val stringUpperCase = stringValue.uppercase()
        val stringContainsKotlin = stringValue.contains("Kotlin", ignoreCase = true)
        val stringReplaceDigits = stringValue.replace(Regex("\\d"), "*")

        /*
        val stringReplaceDigits = stringValue.map {
        if (it.isDigit()) '*' else it
    }.joinToString("")
    println(stringReplaceDigits) // Output: "abd * * ***"
         */
        val stringLength = stringValue.length
        val stringFirstChar = stringValue.first()
        val stringFirstCharIsLetter = stringFirstChar.isLetter()
        val stringFirstCharIsDigit = stringFirstChar.isDigit()


        println("\nString and Char Operations:")
        println("Uppercase: $stringUpperCase")
        println("Contains 'Kotlin': $stringContainsKotlin")
        println("Replace Digits: $stringReplaceDigits")
        println("Length: $stringLength")
        println("First Character is Letter: $stringFirstCharIsLetter")
        println("First Character is Digit: $stringFirstCharIsDigit")

        // Reading and processing boolean values
        println("\nEnter a boolean value (true/false):")
        val booleanValue = readln().toBoolean()
        val booleanNegate = booleanValue.not()
        val booleanToString = booleanValue.toString()
        val booleanNegateToString = booleanNegate.toString()
        val booleanContainsTrue = booleanToString.contains("true")
        val booleanContainsFalse = booleanToString.contains("false")


        println("\nBoolean Operations:")
        println("Original Boolean: $booleanToString")
        println("Negated Boolean: $booleanNegateToString")
        println("Contains 'true': $booleanContainsTrue")
        println("Contains 'false': $booleanContainsFalse")
}
