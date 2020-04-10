package Others

import android.util.Log

class CompanionObject {
    private fun showCase1(){
        val value = MyClass1.flag
        MyClass1.welcome()
    }

    private fun showCase2(){
        MyClass2.welcome()
    }

    fun showCases(){
        showCase1()
        showCase2()
    }
}
class MyClass1 {
  companion object {
      var flag = 1

      fun welcome() {
          Log.w("COMPANION-OBJECT-1","Welcome from companion object")
      }
  }
}

class MyClass2 {
    companion object :Welcome{
        override fun welcome() {
            Log.w("COMPANION-OBJECT-2","Welcome from companion object + Interface")
        }


    }
}

interface Welcome {
    fun welcome()
}