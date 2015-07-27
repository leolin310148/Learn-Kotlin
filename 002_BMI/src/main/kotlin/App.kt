/**
 * @author leolin
 */
fun main(args: Array<String>) {
    println(calcBmi(170.0, 70.2))
    println(calcBmi2(170.0, 70.2))
    println(calcBmi3(170.0, 70.2))
}

fun calcBmi(heightInCm: Double, weightInKg: Double): Double {
    return weightInKg / Math.pow(heightInCm / 100.0, 2.0)
}

//Alternative
fun calcBmi2(heightInCm: Double, weightInKg: Double): Double = weightInKg / Math.pow(heightInCm / 100.0, 2.0)

fun calcBmi3(heightInCm: Double, weightInKg: Double) = weightInKg / Math.pow(heightInCm / 100.0, 2.0)

