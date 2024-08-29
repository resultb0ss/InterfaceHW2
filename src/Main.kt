fun main() {
    var numOne = 10
    var numTwo = 340
    while(numTwo != 0){
        val num = numTwo
        numTwo = numOne % numTwo
        numOne = num
    }
    println(numOne)
}