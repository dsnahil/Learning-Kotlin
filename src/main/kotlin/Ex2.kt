open class Product(name: String,quantity: Int){
    var p:Int=-1
    init {
        println("Product name : $name")
        println(" Quantity: $quantity")
    }
    constructor(name: String,quantity: Int,p: Int) : this(name,quantity){
        this.p=p
        println("Price : $p")
    }
}
class Laptop(name: String,quantity: Int,price : Int,cpu:String,RAM:String):Product(name,quantity,price){
    var hdd:String=""
    init{
        println("CPU  : $cpu")
        println("Ram : $RAM")
    }
    constructor(name: String,quantity:Int,price: Int,cpu: String,RAM: String,hdd:String):this(name,quantity,price,cpu,RAM){
        this.hdd=hdd
        println("HDD_Size : $hdd")
        println("-x-x-x-x-x-x-x-x-x-x-x-x-")
    }
}
fun main(){
    var l1=Laptop("HP",1,50000,"Intel i7","16GB","512")
    var l2=Laptop("ASUS",1,70000,"Ryzen 5","4GB","1TB")
    var l3=Laptop("DELL",1,50000,"Intel i3","32GB","512")
    var l4=Laptop("MAC",1,110000,"M1 Chip","8GB","512")
    var l5=Laptop("HP",1,45000,"Intel i5","16B","256")
}
