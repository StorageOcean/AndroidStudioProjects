package Others

import android.util.Log

class Operadores {

    private fun showCase1() {
        var a = 5
        var b = 5
        Log.w("OPERATOS-1","Referential equality. Es 'a' igual a 'b' ${a === b }")
        Log.w("OPERATOS-1","Structural equality. Es 'a' igual a 'b' ${a == b }")
    }

    private fun showCase2() {
        var pn1 = PersonNormal()
        var pn2 = PersonNormal()
        Log.w("OPERATOS-2","Referential equality. Es 'a' igual a 'b' ${pn1 === pn2 }")
        Log.w("OPERATOS-2","Structural equality. Es 'pn1' igual a 'pn2' ${pn1 == pn2 }")
    }

    private fun showCase3() {

    }
    private fun showCase4() {

    }

    class PersonNormal {
        val name = "Alejandro"
    }

    data class  PersonDataClass(
        val name:String = "Alejandro",
        val age:Int =27
    )

    fun showCase() {
        showCase1()
        showCase2()
    }


}