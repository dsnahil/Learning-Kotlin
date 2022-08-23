fun main() {
    print("Please enter size of array:")
    val input1 = readLine()!!
    val array_size: Int = input1.toInt()
    val array1 = Array<Int>(array_size) { 0 }
    val array2 = array1
    println("Please enter elements")
    for (i in 0..array_size - 1) {
        print("arr[$i]=")
array1.set(i, readLine()!!.toInt())
    }
    var temp: Int
    for (i in 0..array_size - 1) {
        for (j in 0..array_size - 1) {
            if (array1[i] <= array1[j]) {
                temp = array1[i]
                array1[i] = array1[j]
                array1[j] = temp
            }
        }
    }
    println("#Method 1 - Without using inbuilt function")
    println("----Sorted Array---- ")
    for (i in 0..array_size - 1) {
        println("arr[$i]=" + array1[i])
    }
    println("#Method 2 - Using inbuilt function")
    println("----Sorted Array---- ")
    array2.sort()
    for (i in 0..array_size - 1) {
        println("arr[$i]=" + array2[i])
    }
}