package com.dicoding.exam.exam1

// TODO 1
fun isEvenNumber(number: Int): Boolean {
    var value = true
    if(number%2==0) {
        value = true
    } else {
        value = false
    }

    return value
}

// TODO 2
fun moreThanFive(number: Int): Boolean {
    var value = true
    if(number>5) {
        value =  true
    } else {
        value = false
    }

    return value
}

// TODO 3
fun result(number: Int): Int {
    return number * (number + 10)
}