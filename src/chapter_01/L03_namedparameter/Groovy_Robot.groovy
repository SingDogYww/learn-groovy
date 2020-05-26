package chapter_01.L03_namedparameter

class Robot {
    def type, height, width

    def access(location, weight, fragile) {
        println("Received fragile? $fragile, weight: $weight, local: $location")
    }
}

//初始化的时候可以给指定的字段赋值
robot = new Robot(width: 10, height: 40)
println("$robot.type, $robot.height, $robot.width")

// 如果实参的个数多余方法的参数数量，Groovy会把参数的第一个数作为map
robot.access(50, x: 30, y: 40, z: 50, true)
robot.access(x: 30, y: 40, z: 50, 50, true)
robot.access(50, true, x: 30, y: 40, z: 50)


