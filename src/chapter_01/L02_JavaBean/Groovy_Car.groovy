package chapter_01.L02_JavaBean

class Car {
    //def 这种没有直接指定类型的，会被看成是Object
    int miles
    final year

    Car(int thrYear) {year = thrYear}
    //Groovy会将类中的字段设置为private，并且给出相应的set和get方法，如果是final的就不会有set方法
    //没有对应字段的get方法，也是可以直接使用对象.字段来方法get方法的
    def getYoumi(){
        "ss"
    }

    def setYoumi(ss){
        ss
    }
}
Car car = new Car(2050)
println("Year: $car.year")
println("Miles: $car.miles")
println("Setting miles")
car.miles = 25
println("Miles: $car.miles")
//
//但是相当于这个字段是只读的，不能修改，因为没有set方法，如果有set方法会报缺失属性的异常
car.you = "5656"
println("没有字段的get方法：$car.you")
