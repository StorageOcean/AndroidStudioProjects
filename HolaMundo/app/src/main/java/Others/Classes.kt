package Others

import android.util.Log

class Classes {
    private fun showCase1(){
        class Person1
        class Person2 constructor (var firstName:String) // constructor PRIMARIO
        class Person3 (var firstName:String) // constructor puede ser omitido
        class Person4(val firstName:String,val lastName:String,var age:Int){
            init {
                age = 10
            }
        }
        class Person5(val firstName:String = "Alejandro",val lastName:String ="Lora",var age:Int = 27)

        val p1 = Person1()
        val p2 = Person2("Alejandro")
        val p3 = Person3("Alejandro")
        val p4 = Person4("Alejandro","Lora",35)
        val p5_1 = Person5("Alejandro","Lora",35)
        val p5_2 = Person5()
        val p5_3 = Person5("Victor")
        val p5_4 = Person5(age = 35)
    }

    private fun showCase2(){
        open class Person {
            constructor (firstName:String, lastName:String){
            Log.w("CLASSES-2","Welcome $firstName $lastName !")
            }
        }

        class Person1: Person {
            constructor(firstName:String):super(firstName,"Lora")
            constructor(firstName:String, lastName:String):super(firstName, lastName)
        }

        val p = Person1("Alejandro","Lora")
    }

    private fun showCase3(){

        class Person1{
            init {
                Log.w("CLASSES-3","Welcome from INIT!")
            }
            constructor( firstName:String,lastName:String){
                Log.w("CLASSES-3","Welcome from SECONDARY CONSTRUCTOR!")
            }
        }

        class Person2(firstName:String, lastName: String){
            init {

            }

            constructor():this("Alejandro","Lora")
        }

        val p1 = Person1("Alejandro","Lora")
        val p2 = Person2()

    }

    private fun showCase4(){
        class Person1(firstName: String) // No puedes acceder a firstname cuando crees la instancia
        class Person2(var firstName:String) // Puedes acceder a firstname cuando crees la instacia, puedes cambiar valor
        class Person3(val firstName:String) //  Puedes acceder a firstname cuando crees la instacia, no puedes cambiar valor

        val p1 = Person1("")
        val p2 = Person2("")
        val p3 = Person3("")

        //p1.firstName //Error
        p2.firstName // ERROR
        //p3.firstName // ERROR
    }

    private fun showCase5(){
        open class Person1(var name:String)
        open class Person2(open var name:String)
        open class Person3(open var name:String)

        //Si heredamos de person 1, las propiedades no se pueden llamar de igual forma entre padre e hijo
        //class Person11(var name:String): Person1(name)

        //Podemos mantener ambas con el mismo nombre.pero tenemos añadir open y override
        class Person22(override  var name:String):Person2(name)

        class Person33(override  var name:String, override  var age:Int):Person3(name),IPerson {
            override fun hello() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        }
    }

    private fun showCase6(){
        abstract class Person(open var firstName:String,open var lastName:String){
            abstract fun hello()

            fun welcomeKotlin(){

            }

            open fun welcomeDevelopers(){

            }
        }

        class Man(override var firstName:String,override var lastName:String):Person(firstName,lastName){
            override fun hello() {
                Log.w("CLASSES-7","Hello, I am $firstName $lastName")
            }

            override fun welcomeDevelopers(){
                super.welcomeDevelopers()
                super.welcomeKotlin()
                Log.w("CLASSES-7","YaY!!")
            }
        }

        val man = Man("Alejandro","Lora")
        man.hello()
        man.welcomeKotlin()
        man.welcomeDevelopers()
    }

    private fun showCase7(){
        data class  Person (var firstName: String, var lastName:String){

        }

        val p = Person("Alejandro","Lora")
        val p2 = p
        val personString = p.toString()
        val personCopy = p.copy()
        val clone = p.copy(firstName = "Antonio")
        val (firstName,lastName) = p
    }


    private fun showCase8(){
        Log.w("CLASSES-8","ENUM DayOfWeek.MONDAY should be MONDAY ${DayOfWeek.MONDAY.name}")

    }

    interface IPerson {
        var age: Int
        fun hello()
    }

    enum class  DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

}