fun main(){
println("Please enter the elements in Array A")
val A = Array(3) { IntArray(3) }
val B = Array(3) { IntArray(3) }
val C = Array(3) { IntArray(3) }
val D = Array(3) { IntArray(3) }
for (i in 0..2) {
    for (j in 0..2) {
        print("A[$i][$j]=")
        A[i][j] = readLine()!!.toInt()
    }
}
println("---------------------------------")
println("Please enter the elements in Array B")
for (i in 0..2) {
    for (j in 0..2) {
        print("B[$i][$j]=")
        B[i][j] = readLine()!!.toInt()
    }
}
for (i in 0..2) {
    for (j in 0..2) {
        C[i][j] = A[i][j] + B[i][j]
    }
}
for (i in 0..2) {
    for (j in 0..2) {
        D[i][j] = A[i][j] - B[i][j]
    }
}
println("-----------------Addition----------------------")
for (i in 0..2) {
    for (j in 0..2) {
        print(A[i][j])
        print(" ")
    }
    print("\n")
}
println("  + ")
for (i in 0..2) {
    for (j in 0..2) {
        print(B[i][j])
        print(" ")
    }
    print("\n")
}
println("------")
println("------")
for (i in 0..2) {
    for (j in 0..2) {
        print(C[i][j])
        print(" ")
    }
    print("\n")
}
println("-----------------Subtraction----------------------")
for (i in 0..2) {
    for (j in 0..2) {
        print(A[i][j])
        print(" ")
    }
    print("\n")
}
println("  -  ")
for (i in 0..2)
{
    for (j in 0..2) {
        print(B[i][j])
        print(" ")
    }
    print("\n")
}
println("------")
println("------")
for (i in 0..2) {
    for (j in 0..2) {
        print(D[i][j])
        print(" ")
    }
    print("\n")
}
println("-----------------Multiplication----------------------")
val r1 = 2
val c1 = 3
val r2 = 3
val c2 = 2
val firstMatrix = arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4))
val secondMatrix = arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4))
// Mutliplying Two matrices
val product = Array(r1) { IntArray(c2) }
for (i in 0..r1 - 1) {
    for (j in 0..c2 - 1) {
        for (k in 0..c1 - 1) {
            product[i][j] += firstMatrix[i][k] * secondMatrix[k][j]
        }
    }
}
// Displaying the result
for (row in firstMatrix) {
    for (column in row) {
        print("$column    ")
    }
    println()
}
println("  *  ")
for (row in secondMatrix) {
    for (column in row) {
        print("$column    ")
    }
    println()
}
println("------")
println("------")
println("Product of two matrices is: ")
for (row in product) {
    for (column in row) {
        print("$column    ")
    }
    println()
}
}
