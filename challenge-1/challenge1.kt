fun main() {
    print("Masukkan nilai (pisahkan dengan koma): ")
    val inputNilai = readLine()?.trim() ?: ""

    try {
        val nilaiList =
                inputNilai.split(",").map { it.trim().toInt() }.filter {
                    it in 0..100
                } // Validasi nilai 0-100

        if (nilaiList.isEmpty()) {
            println("Tidak ada nilai valid yang dimasukkan!")
            return
        }

        println("\nNilai: [${nilaiList.joinToString(", ")}]")
        println("Tertinggi: ${cariNilaiTertinggiDariList(nilaiList)}")
        println("Terendah: ${cariNilaiTerendahDariList(nilaiList)}")
        println("Rata-rata: ${cariRataRata(nilaiList)}")
    } catch (e: NumberFormatException) {
        println("Format nilai tidak valid! Masukkan angka yang benar.")
    }
}

fun cariNilaiTertinggiDariList(nilai: List<Int>): Int? {
    return nilai.maxOrNull()
}

fun cariNilaiTerendahDariList(nilai: List<Int>): Int? {
    return nilai.minOrNull()
}


fun cariRataRata(nilai: List<Int>): Double {
    return nilai.average()
}
