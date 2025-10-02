package com.example.hafta2
fun main(){
  döngüler()
    bölünme()
    selamla()
    carp(3,4)
println(mesaj())
    topla(5,6)
    dortIslem(8,12,3)
    println(girisKontrol("admin","123"))
    val metin="burdur mehmet akif ersoy üniversitesi"
    println(metin.uppercase())
}

fun döngüler(){
    var sayi=5
    while (sayi>0){
        println("sayi= $sayi")
        sayi--
    }
     for (i in 10..20){
         println("for döngüsü: $i")
     }
    for (s in 10 downTo 1){
        println("azar azar yazan for: $s")
    }
    for(j in 5 until 15){
        println("son rakamı yazmayan: $j")
    }

}
fun bölünme(){
    println("kücük bir sayi giriniz:")
    var deger1=readln().toInt()
    println("büyük sayi giriniz:")
    var deger2=readln().toInt()
    for (sayi in deger1..deger2){
        if (sayi %2==0 && sayi%7==0 && sayi%3!=0){
            println("uygun sayi: $sayi")
        }
    }
}
// PARAMETRESİZ FONKSİYON
fun selamla(){
    println("merhaba kotlin!")
}
// PARAMETRELİ FPNKSİYON
fun carp(s:Int, y:Int){
    println("$s x $y =${s*y}")
}
fun mesaj(): String{
    return "fonksiyon başarılı çalıştı"
}
fun topla(x:Int,j:Int){
    println("$x + $j=${x+j}")
}
fun dortIslem(a:Int,b:Int,secim:Int){
    when(secim){
        1->println("$a + $b = ${a+b}")
        2->println("$a - $b = ${a-b}")
        3->println("$a * $b = ${a*b}")
        4->println("$a / $b = ${a/b}")
        else ->println("geçersiz işlem")
    }

}
fun girisKontrol(kullanici: String,sifre: String): String{
    if (kullanici=="admin"&&sifre=="123"){
        return "giriş başarılı"
    }
    return "giriş başarısız"
}
