class Persona(var peso : Double, var altura : Double){
    var nombre : String = ""
    var imc : Double = peso*(altura*altura)

    constructor(peso: Double,altura: Double, nombrenuevo : String) : this(peso,altura){
        this.nombre = nombrenuevo
    }

    override fun toString(): String {
        return "$nombre, de altura $altura metros,peso de $peso kilos, tiene un IMC de $imc"
    }

    fun saludar() : String{
        require(nombre.isNotEmpty()){"Inserte un nombre"}

        return "Hola, $nombre!"
    }

    fun obtenerImc(altura: Double,peso: Double) : Double{
        imc = peso*(altura*altura)

        return imc
    }

    fun obtenerDesc() : String{
        imc = obtenerImc(altura,peso)
        var media : String = ""
        var alturaM : String = ""
        var pesoM : String = ""
        if(altura >= 1.85){
            alturaM = "Por encima de la media"
        }
        else{
            alturaM = "Por debajo de la media"
        }

        if (peso >= 70){
            pesoM = "Por encima de la media"
        }
        else{
            pesoM = "Por debajo de la media"
        }

        if (imc < 18.5){
            media = "peso insuficiente"
        }
        else{
            if (imc >= 18.5 && imc <= 24.9 ) {
                media = "peso saludable"
            }
            else{
                if(imc >= 25 && imc <= 29.9){
                    media = "sobrepeso"
                }
                else{
                    if (imc >= 30){
                        media = "obesidad"
                    }
                }
            }
        }

        return "$nombre con una altura de $altura ($alturaM) y un peso $peso ($pesoM) tiene un IMC de $imc ($media)"
    }
}

fun main(){
    val persona1 = Persona(69.6,1.8)
    persona1.nombre = readln()
    println(persona1.nombre)
    println(persona1.peso)
    println(persona1.altura)

    val persona2 = Persona(68.0,1.6,"Eustaquio")
    println(persona2)
    persona2.altura = 1.8
    println(persona2.peso)
    println(persona2.altura)
    println(persona2.imc)

    val persona3 = Persona(70.5,1.2)
    persona3.altura = 1.8
    println(persona2)
    println(persona3)
    println(persona2.equals(persona3))

}