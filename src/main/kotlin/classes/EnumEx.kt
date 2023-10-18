package classes

fun main() {
    for (day in DayOfWeek.values()){
        println(day)
    }
    for (color in Colour2.values()){
        println(color.shade)
    }
}

enum class Colour
{
    RED,
    GREEN,
    BLUE
}
enum class Colour2(val shade:String)
{
    RED("dark"),
    GREEN("light"),
    BLUE("medium")
}



enum class DayOfWeek {

    MONDAY,

    TUESDAY,

    WEDNESDAY,

    THURSDAY,

    FRIDAY,

    SATURDAY,

    SUNDAY

}



enum class Planet(val mass: Double, val radius: Double) {

    EARTH(5.972e24, 6371.0),

    MARS(6.39e23, 3389.5),

    VENUS(4.867e24, 6051.8)

}

