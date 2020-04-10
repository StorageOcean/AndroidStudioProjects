package Others

import android.util.Log

class ControlFlow {

    private fun showCase1() {
        var num1 =  5;
        var num2 = 10;

        if (num1 > num2){
            Log.w("CONTROL-FLOW-1","NUM1 es mayor que NUM2")
        }else {
            Log.w("CONTROL-FLOW-1","NUM2 es mayor que NUM1")
        }

        val result = if (num1 > num2) num1 else num2
    }

    private fun showCase2() {
        val x = 1;

        when (x) {
            1 -> Log.w("CONTROL-FLOW-2","X == 1")
            2 -> Log.w("CONTROL-FLOW-2","X == 2")
            else  -> Log.w("CONTROL-FLOW-2","X es otro numero")
        }


        when (x) {
            0,1 ->  Log.w("CONTROL-FLOW-2","X == 0 o X == 1") // case 0 y 1
        }

        when {
            (x %2 == 0) -> Log.w("CONTROL-FLOW-3","numero par")
            (x %2 == 1) -> Log.w("CONTROL-FLOW-3","numero impar")
        }

        val esPar = when {
            (x %2 == 0) -> true
            else -> false
        }
    }

    private fun showCase3() {
        val numbers = arrayOf(1,2,3,4,5)
        for(number in numbers) Log.w("CONTROL-FLOW-4",number.toString())

        //Especificando el tipo
        for(number: Int in numbers){
            Log.w("CONTROL-FLOW-4",number.toString())
        }

        // Con indices
        for((index,number) in numbers.withIndex()){
            Log.w("CONTROL-FLOW-4","$index: $number ")
        }

    }
    private fun showCase4() {
        var x = 10

        while (x > 0){
            Log.w("CONTROL-FLOW-4",x--.toString())
        }

        do {
            Log.w("CONTROL-FLOW-4","Primera y unica interaccion")
        }while (x > 0)
    }


    fun showCase() {
        showCase1()
        showCase2()
        showCase3()
        showCase4()
    }
}