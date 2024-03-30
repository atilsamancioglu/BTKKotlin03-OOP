package com.atilsamancioglu.kotlinoop

class Islemler {

    fun cikarma(x: Int, y: Int) : Int {
        return x - y
    }

    fun cikarma(x: Int, y: Int, z: Int) : Int {
        return x - (y+z)
    }

    fun cikarma(x: Int, y: Int, z: Int, m: Int) : Int {
        return x - (y+z+m)
    }

}