package com.example.patronesdediseo.builder

interface CarBuilder {
    fun setRuedas(ruedas : Int): CarBuilder
    fun setPuertas(puertas: Int): CarBuilder
    fun setTecho(techo : Boolean): CarBuilder
    fun setMotor(motorType: MotorType): CarBuilder
    fun setAsientos(asientos : Int): CarBuilder
    fun setVelocidadM(velocidad: Int): CarBuilder
}
