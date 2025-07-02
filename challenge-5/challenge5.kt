val dataSpending: MutableList<Int> = mutableListOf()

fun main(){
    var i = 1
    while(true){
        print("Masukkan pengeluaran $i (0 untuk keluar): ")
        val spend = readLine()?.toIntOrNull()
        if (spend == 0) break
        if(spend!=null){
            dataSpending.add(spend)
            i++
        }else{
            println("Input tidak valid")
        }
    }

    showSpend()
}

fun showSpend(){
    println("Pengeluaran: $dataSpending")
    val total = dataSpending.sum()
    println("Total: $total")
    val max = dataSpending.maxOrNull()
    println("Terbesar: $max")
    val min = dataSpending.minOrNull()
    println("Terkecil: $min")
}
