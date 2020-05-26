package chapter_01.L02_JavaBean

class Car {
    //def 这种没有直接指定类型的，会被看成是Object
    int miles
    final year

    Car(int thrYear) {year = thrYear}
    //Groovy会将类中的字段设置为private，并且给出相应的set和get方法，如果是final的就不会有set方法

}
Car car = new Car(2050)
println("Year: $car.year")
println("Miles: $car.miles")
println("Setting miles")
car.miles = 25
println("Miles: $car.miles")
