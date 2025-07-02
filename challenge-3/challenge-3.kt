fun main(){
    print("Input Kalimat: ")
    val kalimat = readLine()?:""
    val jumlahVokal = hitungVokal(kalimat)
    val jumlahKarakter = hitungKarakter(kalimat)

    println("Kalimat: $kalimat")
    println("Vokal: $jumlahVokal")
    println("Total Karakter: $jumlahKarakter")  
}

fun hitungKarakter(kalimat:String): Int{
    var jumlah = 0

    for(huruf in kalimat){
        jumlah++
    }
    return jumlah
}

fun hitungVokal(kalimat: String): Int{
    val vokal = listOf('a', 'i', 'u', 'e', 'o')
    var jumlah = 0

    for(huruf in kalimat.lowercase()){
        if(huruf in vokal){
            jumlah++
        }
    }
    return jumlah
}