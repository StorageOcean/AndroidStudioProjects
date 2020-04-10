package Others

import android.util.Log

class Interfaces {

    private var anonymousObjectImplementingInterface: Any? = null

    private fun showCase1(){
        anonymousObjectImplementingInterface = object : Interface1{
            override fun absctractMethod() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }

        (anonymousObjectImplementingInterface as Interface1).methodWithImplementationByDefault()
        (anonymousObjectImplementingInterface as Interface1).absctractMethod()
    }

    private fun showCase2(){
        var aoii= object : Interface2{
            override val propertyAbstract: Int
                get() = 10//To change initializer of created properties use File | Settings | File Templates.

        }

        aoii.propertyAbstract
        aoii.propertyWithImplementation
        aoii.hello()
    }
}


interface Interface1{
    fun absctractMethod()
    fun methodWithImplementationByDefault(){

    }
}

interface Interface2{
    val propertyAbstract:Int
    var propertyWithImplementation:String
    get() = "ByDefault"
    set(value) { this.propertyWithImplementation = value }

    fun hello(){
        Log.w("INTERFACE-2","Is it working $propertyWithImplementation? , YAY! $propertyAbstract :)")
    }
}