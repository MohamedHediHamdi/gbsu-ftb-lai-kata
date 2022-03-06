package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        val numberAsString = inputNumber.toString()
        val builder = StringBuilder("")
        if (inputNumber % 3 == 0) {
            builder.append("Gbsu")
        }
        if (inputNumber % 5 == 0) {
            builder.append("Ftb")
        }
        if ((inputNumber % 3 != 0 && inputNumber % 5 != 0) ||
            (numberAsString.contains('3') || numberAsString.contains('5') || numberAsString.contains('7')))
            for (index in numberAsString.indices) {
            if (numberAsString[index] == '3') {
                builder.append("Gbsu")
            }
            if (numberAsString[index] == '5') {
                builder.append("Ftb")
            }
            if (numberAsString[index] == '7') {
                builder.append("Lai")
            }
        }
        if (inputNumber % 3 != 0 && inputNumber % 5 != 0 &&
            !numberAsString.contains('3') &&
            !numberAsString.contains('5') &&
            !numberAsString.contains('7')) {
            return numberAsString
        }
        return builder.toString()
    }
}
