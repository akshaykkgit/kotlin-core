package functions

class Operations {
    var x = 10;
    infix fun minuss(num: Int) {
        this.x = this.x - num
    }
}
fun main() {
    val opr = Operations()
    opr minuss 8
    print(opr.x)
}
