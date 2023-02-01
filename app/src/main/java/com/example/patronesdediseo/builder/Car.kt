package com.example.patronesdediseo.builder

 class Car {
    var ruedas: Int = 4
    var puertas: Int = 4
    var tieneTecho: Boolean = true
    var motor: MotorType = MotorType.MEDIUM
    var asientos: Int = 4
    var velocidadMaxima: Int = 200

}


enum class MotorType {
    SMALL,
    MEDIUM,
    BIG,
}