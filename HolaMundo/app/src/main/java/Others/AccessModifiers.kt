package Others

open class AccessModifiers {
    // private -- Solo visible dentro de la clase
    // protected -- Solo visible dentro de la clase  y de sus subclases (herencia)
    // public -- visible desde dentro de la clase, de sus subclases y desde fuera
    val prop1 = "Public by default";
    private val prop2 = "Marked as private"
    protected val prop3 = "Marked as protected"

    private fun showCase(){
        val test = AccessModifiers();
        test.prop1
    }
}

class AccessModifiersChild : AccessModifiers() {
    private fun showCase(){
        prop1
        this.prop1
        prop3
    }
}

class AnotherClass{
    private fun showCase(){
        val test = AccessModifiers();
        test.prop1
    }
}