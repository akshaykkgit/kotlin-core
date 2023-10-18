package polymorphism


fun main() {

    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)
    val shapes = arrayOf(circle, rectangle)
    for (shape in shapes) {
        println("Area: ${shape.area()}")
    }

}



open class Shape {
    open fun area(): Double {
        return 0.0
    }
}


class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
}


