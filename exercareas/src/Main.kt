//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package funcoes.calcular
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("Área do Retângulo: ${calcularAreaRetangulo(5.0, 3.0)}")

    val ladoTrianguloEquilatero = 4.0
    println("Área do Triângulo Equilátero: ${calcularAreaTrianguloEquilatero(ladoTrianguloEquilatero)}")

    val baseTrianguloIsosceles = 6.0
    val alturaTrianguloIsosceles = 4.0
    println("Área do Triângulo Isósceles: ${calcularAreaTrianguloIsosceles(baseTrianguloIsosceles, alturaTrianguloIsosceles)}")

    val lado1 = 5.0
    val lado2 = 7.0
    val lado3 = 8.0
    println("Área do Triângulo Escaleno: ${calcularAreaTrianguloEscaleno(lado1, lado2, lado3)}")

    val raio = 5.0
    println("Área da Circunferência: ${calcularAreaCircunferencia(raio)}")

    val diagonalMaior = 10.0
    val diagonalMenor = 6.0
    println("Área do Losango: ${calcularAreaLosango(diagonalMaior, diagonalMenor)}")

    val baseMaior = 8.0
    val baseMenor = 6.0
    val alturaTrapezio = 5.0
    println("Área do Trapézio: ${calcularAreaTrapezio(baseMaior, baseMenor, alturaTrapezio)}")
}

fun calcularAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun calcularAreaTrianguloEquilatero(lado: Double): Double {
    return (sqrt(3.0) / 4) * lado.pow(2)
}

fun calcularAreaTrianguloIsosceles(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun calcularAreaTrianguloEscaleno(a: Double, b: Double, c: Double): Double {
    val p = (a + b + c) / 2
    return sqrt(p * (p - a) * (p - b) * (p - c))
}

fun calcularAreaCircunferencia(raio: Double): Double {
    return Math.PI * raio.pow(2)
}

fun calcularAreaLosango(diagonalMaior: Double, diagonalMenor: Double): Double {
    return (diagonalMaior * diagonalMenor) / 2
}

fun calcularAreaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return ((baseMaior + baseMenor) * altura) / 2
}