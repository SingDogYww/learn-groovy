package chapter_01.L04_choosableparam

//设置某个参数有默认值，这个参数就是可选的
def log(x, base = 20){
    Math.log(x) / Math.log(base)
}

println(log(1024))
println(log(1024, 10))
println(log(1024, 2))

//末尾的数组相当于是java的可变参数列表
def task(name, String[] details){
    println("$name - $details")
}


task("call", "151515-11", "1548")

