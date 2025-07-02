fun main() {
    val guessList: MutableList<String?> = mutableListOf("Willman", "Adhli", null, "Leon", null)
    println("Tamu terdaftar: ${guessList.filterNotNull().joinToString()}")
    println("Tamu tanpa nama: ${guessList.count { it == null }}")
}
