package com.kooken.study

val name: String = "Alice"
// val - non-changeable variable
// 'name' - name of the variable
// String - data type of the variable (in double quotes only!!)

var age: Int = 30
// var - changeable variable
// 'age' - name of the variable
// Int - data type of the variable (Integer)

var weight: Double = 48.9
// double - float integers

const val PI = 3.14
// constant value, need for compiling
// no need to write a data type

lateinit var userInfo: String
// late initialization
// lateinit only with var

val lazyValue: String by lazy {
    "Hello, this is a lazy string!"
}
// lazy initialization
// creating class object