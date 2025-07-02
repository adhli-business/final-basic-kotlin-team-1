fun main(){
    print("Input Email: ")
    val email = readLine()?:""
    val status = isValidEmail(email)

    println("Input: $email")
    if(status == true){
        println("Satus: Valid")
    }else{
        println("Satus: Invalid")
    }
}

fun isValidEmail(email: String): Boolean{
    return email.contains('@') && email.contains('.')
}