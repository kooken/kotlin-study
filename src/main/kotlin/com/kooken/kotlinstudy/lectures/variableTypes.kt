package com.kooken.com.kooken.kotlinstudy.lectures

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
// always in capital letters

lateinit var userInfo: String
// late initialization
// lateinit only with var

val lazyValue: String by lazy {
    "Hello, this is a lazy string!"
}
// lazy initialization
// will be initialized when we'll use lazyValue

var speed: Double? = null
// ? after data type means that the value is null

var count: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
    }
// variable controller
// get method - our count value equals to field (kind of temporary variable) - getting variable value
// set method: if our value >=0, then the field will be the value - setting new variable value

fun countUp() {
    count = 1 // 0 (line 33) becomes 1
}

// Create variable for unique car number
val carNumber: String = "U97917UHB"

// Create variable for car color
var carColor: String = "Blue"

// Create variable for initial car distance
var carDistance: Double = 0.0

// Create variable for car owner (when the car owner will be set later - the owner will be initialized)
lateinit var carOwner: String

// Create variable for amount of car wheels
const val CAR_WHEELS: Int = 4

// Create variable for car report
val carReport: String by lazy {
    "There will be report soon..."
}

// Create variable for car fuel
var carFuel: Double = 5.0
    get() = field
    set(value) {
        if (value > 0) field += value
    }