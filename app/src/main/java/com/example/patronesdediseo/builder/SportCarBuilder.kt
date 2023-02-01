package com.example.patronesdediseo.builder

class SportCarBuilder: CarBuilder {
    private val sportCar = Car()
    override fun setRuedas(ruedas: Int): SportCarBuilder {
        sportCar.ruedas = ruedas
        return this
    }

    override fun setPuertas(puertas: Int): SportCarBuilder {
        sportCar.puertas = puertas
        return this
    }

    override fun setTecho(techo: Boolean): SportCarBuilder {
        sportCar.tieneTecho = techo
        return this
    }

    override fun setMotor(motorType: MotorType): SportCarBuilder {
        sportCar.motor = motorType
         return this
    }

    override fun setAsientos(asientos: Int): SportCarBuilder {
        sportCar.asientos = asientos
        return this
    }

    override fun setVelocidadM(velocidad: Int): SportCarBuilder {
        sportCar.velocidadMaxima = velocidad
        return this
    }

    fun build(): Car {
         return this.sportCar
     }

}