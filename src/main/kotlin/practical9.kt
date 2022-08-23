fun main() {
    print("Please enter size of array:")
    val array_size: Int = readLine()!!.toInt()
    val array1 = Array<Int>(array_size) { 0 }
    for (i in 0..array_size - 1) {
        print("arr[$i]=")
        array1.set(i, readLine()!!.toInt())
    }
    var max = array1[0]
    var min = array1[0]
    for (i in 0..array_size - 1) {
        if (array1[i] >= max) {
            max = array1[i]
        }
        if(array1[i]<=min)
        {
            min = array1[i]
        }
    }
    println("Max number in given array is: $max")
    println("Min number in given array is: $min")