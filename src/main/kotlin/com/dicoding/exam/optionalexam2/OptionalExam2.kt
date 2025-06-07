package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val digits = number.toString().map { it.digitToInt() }
    return digits.min() + digits.max()
}
