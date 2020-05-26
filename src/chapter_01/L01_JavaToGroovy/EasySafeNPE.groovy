package chapter_01.L01_JavaToGroovy

def foo(str){
//    if (str != null) {str.reverse()}
    //使用?.来代替判断空值
    str?.reverse()
}

println(foo('what '))
println(foo(null))
