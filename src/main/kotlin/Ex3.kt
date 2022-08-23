open class Person(first:String,last:String){
    var age:Int=-1
    init{
        println("First Name $first")
        println("Last Name $last")
    }
    constructor(first: String,last: String,age:Int):this(first,last){
        this.age=age
        println("Age $age")
    }
}
class Student(first:String,last:String,age: Int,branch:String,Class:String):Person(first,last,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(first:String,last:String,age: Int,branch:String,Class:String,batch:String):this(first,last,age,branch,Class){
        this.batch=batch
        println("Batch $batch ")
        println("xxxxxxxxxxxxxxxx")
    }
}
fun main(){
    var a=Student("Snahil","Singh",20,"CE","C","AB8")
    var b=Student("Nrup","Raval",20,"CE","B","AB1")
    var c=Student("Aditya","Upadhyay",21,"CE","C","AB11")
    var d=Student("Shlok","Patel",19,"IT","C","AB14")
    var e=Student("Shrey","Rawal",20,"AI","C","AB14")
}
