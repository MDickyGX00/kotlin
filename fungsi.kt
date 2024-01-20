fun lulus (name: String, n1: Int, n2: Int, n3: Int, n4: Int, grad: String) :String{
    return "Siswa bernama $name dengan deskripsi nilai berikut:\nNilai Matematika \t:$n1 \nNilai B.Inggris \t:$n2 \nNilai B.Indonesia \t:$n3 \nNilai PKN \t\t:$n4\nDinyatakan \t\t$grad"      
}

fun main(){
    val kelulusan = lulus("Udin", 80, 90, 100, 75, "lulus😄")
    print(kelulusan)
}
