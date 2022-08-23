class Car(var type: String="TAXI",var price: Int=1100000, var model: Int=2016, var owner: String="SNAHIL"){
    init {
        //This is INIT method"
    }
    fun getCarPrice() {
        println("Car price is:$price")
    }
    fun getCarInformation(){
        println("Car information:$type Model:$model Price:$price")
    }
}
fun main() {
    //This is Main Function
    val car1 = Car()
    println(car1.getCarInformation())
    println(car1.getCarPrice())
}