fun jumlah(nilai1: Int, nilai2: Int) :Int{
    return nilai1 + nilai2
}

fun kali (nilai1: Int, nilai2: Int) :Int{
    return nilai1 * nilai2
}

fun bagi (nilai1: Int, nilai2: Int) :Int{
    return nilai1 / nilai2
}

fun kurang (nilai1: Int, nilai2: Int) :Int{
    return nilai1 - nilai2
}

fun lsgtg (nilai1: Int, nilai2: Int) :Int{
    return nilai1 * nilai2 * 1/2
}

fun lpspg (nilai1: Int, nilai2: Int) :Int{
    return nilai1 * nilai2
}

fun main() {
    val hasil1 = jumlah(10, 23)
    println("Ini adalah hasil penjumlahan: $hasil1")
    
    val hasil2 = kurang(10, 23)
    println("Ini adalah hasil pengurangan: $hasil2")
    
    val hasil3 = kali(10, 23)
    println("Ini adalah hasil perkalian: $hasil3")
    
    val hasil4 = bagi(10, 23)
    println("Ini adalah hasil pembagian: $hasil4")
    
    val hasil5 = lsgtg(10, 20)
    println("Ini adalah hasil luas segitiga: $hasil5")
    
    val hasil6 = lpspg(10, 20)
    println("Ini adalah hasil luas persegi panjang: $hasil6")
}
