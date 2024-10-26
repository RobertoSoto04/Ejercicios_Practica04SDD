//Ejemplo 1
class Caja<T>(val contenido: T) {
    fun obtenerContenido(): T {
        return contenido
    }
}

//Ejemplo 2
fun <T> imprimirDato(elemento: T) {
    println(elemento)
}

//Ejemplo 3
fun <T : Number> sumar(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

//Ejemplo 4
fun <T> imprimirSiEsNumero(valor: T) where T : Number {
    println(valor.toDouble())
}

fun main(args: Array<String>) {
    val cajaInt = Caja(42.4156451)
    val cajaString = Caja("Soy una cadena")
    val nombre = "Daniel"
    val entero = 1456657
    val suma = sumar(10.7541, 45)

    println("\n********** Ejemplo 1 **********")
    println(cajaInt.obtenerContenido())
    println(cajaString.obtenerContenido())
    println("********** Fin del Ejemplo 1 **********\n")

    println("\n********** Ejemplo 2 **********")
    imprimirDato(nombre)
    imprimirDato(entero)
    println("********** Fin del Ejemplo 2 **********\n")

    println("\n********** Ejemplo 3 **********")
    println(suma)
    println("********** Fin del Ejemplo 3 **********\n")

    println("\n********** Ejemplo 4 **********")
    imprimirSiEsNumero(entero)
    println("********** Fin del Ejemplo 4 **********\n")
}