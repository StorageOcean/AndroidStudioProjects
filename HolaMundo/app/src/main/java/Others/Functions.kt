package Others

import android.util.Log
import java.util.*

class Functions {

    private fun showCase1() {
        // Funciones, parametros y Unit
        fun function1() {}

        var result1 = function1()

        fun function2(): Unit {}
        var result2 = function2()

        // Parametros

        fun function3(param1: String, param2: String): String {
            return "$param1 $param2"
        }

        var result3 = function3("String 1", "String 1")

        fun function4(param: Int = 5) {}
        fun function5(param: Int?) {}
    }

    private fun showCase2() {
        fun printSum(num1: Int, num2: Int, printer: (result: Int) -> Unit) {
            printer(num1 + num2)
        }

        printSum(5, 5) { result ->
            Log.w("FUNCTIONS-2", "Lambda expression printing the sum result (10) => $result")
        }

        //Si el callback recibe solo un parametro,podemos omitir ese "resulta"
        printSum(12, 12) {
            Log.w("FUNCTIONS-2", "Lambda expression printing the sum result (10) => $it")
        }

        fun printSum2(
            num1: Int,
            num2: Int,
            printer: (result: Int, param1: Int, param2: Int) -> Unit
        ) {
            printer(num1 + num2, num1, num2)
        }

        printSum2(7, 7) { result, param1, param2 ->
            Log.w("FUNCTIONS-2", "Lambda expression printing the sum result (14) => $result")
        }



        printSum2(7, 7) { result, _, _ ->
            Log.w("FUNCTIONS-2", "Lambda expression printing the sum result (14) => $result")
        }
    }

    private fun showCase3() {
        fun function1(firstName:String,lastName:String,age:Int,city:String,dateOfBirth: Date){

        }
        function1("","",27,"",Date())
        function1(age = 27,dateOfBirth = Date(),firstName = "Alejandro",city = "Sevilla",lastName = "Lora")
    }

    private fun showCase4(){
        // Single expression functions
        fun sum1(param1:Int,param2:Int):Int {
            return param1+param2
        }

        fun sum2(param1:Int,param2:Int) = param1+param2
    }

    private fun showCase5(){
        //Variable number of arguments (Varargs)
        fun sumAll(vararg numbers:Int) = numbers.sum()

        var result = sumAll(1,2,3,4,5,6,7,8,9,0)
    }

    private fun showCase6(){
        //Extension Functions
        fun String.Welcome(){
            Log.w("FUNCTIONS-6", "Welcome to Kotlin")
        }

        "".Welcome()
    }

    fun showCase (){
        showCase1()
        showCase2()
        showCase3()
        showCase4()
        showCase5()
    }

}