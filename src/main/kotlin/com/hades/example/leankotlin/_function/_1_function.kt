package com.hades.example.leankotlin._function

fun main() {
    println(double(3))  // 6s
}

fun double(x: Int /* x is named argument*/): Int /* return value is Int type*/ {
    return x * 2;
}