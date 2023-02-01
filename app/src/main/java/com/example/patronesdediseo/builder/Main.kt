package com.example.patronesdediseo.builder

fun main() {
    val builder = SportCarBuilder()
        .setAsientos(4)
        .setMotor(MotorType.MEDIUM)
        .setRuedas(4)
        .setPuertas(2)
        .setTecho(true)
        .setVelocidadM(400)

    val carroDeportivo = builder.build()
    with(carroDeportivo) {

        println("""
            Ruedas :$ruedas
            Asientos: $asientos
            Motor: $motor
            Puertas: $puertas
            Techo: $tieneTecho
            Velocidad: $velocidadMaxima 
        """.trimIndent()
        )
    }
}