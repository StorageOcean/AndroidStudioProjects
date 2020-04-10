package Others

import android.util.Log

/*
En Kotlin todo es un objeto.
No hay tipos básicos y no existe void.
Si algo no devuelve nada, esta devolviendo un Unit.
Las variables pueden ser mutables o inmutables, inmutables siempre que sea posible. (var vs val)
los tipos son definidos despues del nombre de la variable, con dos puntos y espacio (var nombre: tipo)
 */
class Variables {
    private var variable0 = 1
    private var variable1 = 1.toByte()
    private var variable2 = -123
    private var variable3 = 21474883648
    private var variable4 = 1.1.toFloat()
    private var variable5 = 1.1
    private var variable6 = 'a'
    private var variable7 = "a"
    private var variable8 = false
    private var variable9 = arrayOf(1,2,3,4,5)
    private var variable10 = arrayOfNulls<Int>(10) // [null,null] solo acepta int
    private val variable11 = "Esta variable es read-only/inmutable/constante"

    //show Case para Byte
    private fun showCase1(){
        Log.w("VARIABLE-0", "¿Es variable un Integer? -->"+(variable0 is Int)+"¿Por que no un Byte?")
        Log.w("VARIABLE-1", "¿Es variable un Byte? -->"+(variable1 is Byte))
    }

    //show Case para Int
    private fun showCase2(){
        Log.w("VARIABLE-2", "Es un valor integer")
        variable2 = Int.MAX_VALUE;

    }

    //show Case para Long
    private fun showCase3(){
        Log.w("VARIABLE-2", "¿Es un valor long? --> "+(variable3 is Long))
       // variable3 = Int.MAX_VALUE;

    }

    //show Case para Double
    private fun showCase4(){
        Log.w("VARIABLE-4", "¿Es un valor float? --> "+(variable4 is Float))
     //   variable3 = Int.MAX_VALUE;

    }

    //show Case para Double
    private fun showCase5(){
        Log.w("VARIABLE-5", "¿Es un valor double? --> "+(variable5 is Double))
        //   variable3 = Int.MAX_VALUE;

    }

    //show Case para Char
    private fun showCase6(){
        Log.w("VARIABLE-6", "¿Es un valor char? --> "+(variable6 is Char))
        //   variable3 = Int.MAX_VALUE;

    }

    //show Case para String
    private fun showCase7(){
        Log.w("VARIABLE-7", "¿Es un valor string? --> "+(variable7 is String))
        //   variable3 = Int.MAX_VALUE;
        //String Literals
        variable7 = "¡Hola Mundo! \n ¡Adios Mundo"
        variable7 = """
            ¡Hola Mundo!
            ¡Adios Mundo"
        """

        //String Templates
        var points = 9
        var maxpoints = 10
        variable7 ="Hola, tengo "+points+ " puntos sobre "+maxpoints // Java's Style
        variable7 ="Hola, tengo $points puntos sobre $maxpoints" // Kotlin Style
        variable7 ="Hola, tengo ${points*10} puntos sobre ${maxpoints*10}" // Kotlin Style
    }

    //show Case para Boolean
    private fun showCase8(){
        Log.w("VARIABLE-8", "¿Es un valor string? --> "+(variable8 is Boolean))
        //   variable3 = Int.MAX_VALUE;

    }

    //show Case para Array<Int>
    private fun showCase9(){
        Log.w("VARIABLE-9", "¿Es un valor Array<Int>? --> "+(variable9 is Array<Int>))
        //   variable3 = Int.MAX_VALUE;

    }

    //show Case para Array<Int?>
    private fun showCase10(){
        Log.w("VARIABLE-10", "¿Es un valor Array<Int?>? --> "+(variable10 is Array<Int?>))
        //   variable3 = Int.MAX_VALUE;

    }

    fun showCase(){
        showCase1()
    }

}