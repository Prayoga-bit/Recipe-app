package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val regex = "\\d+".toRegex()
    val numbers = regex.findAll(str).map { it.value.toInt() }.toList()

    return if (numbers.isNotEmpty()) {
        val multipliedNumbers = numbers.joinToString("") { (it * int).toString() }
        str.replace(regex, "") + multipliedNumbers
    } else {
        str + int
    }
}
