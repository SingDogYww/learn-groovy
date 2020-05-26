package chapter_01.L05_multipleAssign

def splitName(fullName) { fullName.split(' ')}

(firstName, lastName) = splitName('James Bond')
println("$firstName, $lastName")


//交换值
def value1 = 5, value2 = 51
println("交换前：$value1, $value2")
(value1, value2) = [value2, value1]
println("交换前：$value1, $value2")


//返回值多余
def (String cat, String mouse) = ["Tom", "Jerry", "风车车", "假老练"]
println("返回值多余：$cat and $mouse")

//定义参数多余
def (one, two, three) = ["风车车", "假老练"]
println("$one 与 $two, $three")

