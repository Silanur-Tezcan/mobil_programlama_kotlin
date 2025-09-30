package com.example.hafta2

import kotlin.math.pow

fun main() {
    var isim = "sıla" // değiştirilebilir
    val yas = 25      // sabit

    var sehir: String = "deneme"
    var plaka: Int = 25

//    döngü()
//    kosul()
    hesap()
//    deneme()
}

//fun döngü() {
//    // WHEN
//    val gun = 1
//    when (gun) {
//        1 -> println("pazartesi")
//        2 -> println("salı")
//        3 -> println("çarşamba")
//        else -> println("bilinmeyen gün")
//    }
//
//    // FOR
//    val liste = listOf("html", "css", "js")
//    for (eleman in liste) {
//        println(eleman)
//    }
//
//    // WHILE
//    var x = 0
//    while (x < 5) {
//        println("sayac sonucu: $x")
//        x++
//    }
//
//    // DO-WHILE
//    var y = 0
//    do {
//        println("y: $y")
//        y++
//    } while (y < 2)
//}

//fun kosul() {
//    val not = 85
//    if (not >= 90) {
//        println("harika!")
//    } else if (not >= 70) {
//        println("ortalama")
//    } else {
//        println("daha çok çalış")
//    }
//}

//fun deneme() {
//    val x = 5
//    val y = 6
//    println("toplam sonucu: ${x + y}")
//
//    println("isim giriniz: ")
//    val isim = readln()
//    println("merhaba, $isim")
//}

fun hesap() {
//    println("Birinci sayıyı girin:")
//    val aInput = readln()
//    println("İkinci sayıyı girin:")
//    val bInput = readln()
//
//    if (aInput.isNotEmpty() && bInput.isNotEmpty()) {
//        try {
//            val a = aInput.toInt()
//            val b = bInput.toInt()
//            val toplam = a + b
//            println("Toplam: $toplam")
//        } catch (e: NumberFormatException) {
//            println("Lütfen geçerli bir sayı girin!")
//        }
//    } else {
//        println("Girişler boş olamaz!")
//    }
//

//    println("Hello World!")
//
//    val degistirilmez = 15
//    var degistirilebilir = "Furkan"
//
//    val sayi_int: Int = 320000
//    val sayi_long: Long = 350000000L
//    val sayi_double: Double = 25.4698
//    val sayi_float: Float = 3565.156f
//
//    val deger_char: Char = 'F'
//    val deger_string: String = "Ahmet"
//
//    println("Degisken Degeri = $sayi_int Degisken Tipi = ${sayi_int::class.simpleName}")
//
//    if (sayi_int % 2 == 0) {
//        println("$sayi_int sayisi çift sayıdır")
//    } else {
//        println("$sayi_int sayisi tek sayıdır")
//    }
//
//    val user_name_2 = "Furkan"
//    println("Deger Girisi: ")
//    val user_name = readln()
//
//    if (user_name != user_name_2) {
//        println("Kullanıcı adınız hatalı!!!!!")
//    } else {
//        println("Giriş Başarılı!")
//    }
//    println("Hoşgeldiniz, Sayın $user_name veri tipi = ${user_name::class.simpleName}")
//
//    println("Lütfen 1. sayıyı giriniz:")
//    val sayi_1 = readln().toInt()
//
//    println("Lütfen 2. sayıyı giriniz:")
//    val sayi_2 = readln().toInt()
//
//    val toplam = sayi_1 + sayi_2
//    val fark = sayi_1 - sayi_2
//    val carpim = sayi_1 * sayi_2
//    val bolme = sayi_1 / sayi_2
//
//    println("$sayi_1 + $sayi_2 = $toplam")
//    println("$sayi_1 - $sayi_2 = $fark")
//    println("$sayi_1 * $sayi_2 = $carpim")
//    println("$sayi_1 / $sayi_2 = $bolme")
//
//    val ornek_us = 2.0.pow(4.0)
//    println("Üs derecesi sonucu = $ornek_us")
//
//    val kullanici_adi = "Furkan ATLAN"
//    val kullanici_sifre = 123
//
//    println("Lütfen Yeni Kullanıcı Adını Giriniz:")
//    val new_k_adi = readln()
//
//    println("Lütfen Yeni Şifrenizi Giriniz:")
//    val new_k_sifre = readln().toInt()
//
//    if (new_k_adi == kullanici_adi && new_k_sifre == kullanici_sifre) {
//        println("Tebrikler. Sisteme Başarılı Şekilde Giriş Yaptınız")
//    } else if (new_k_adi != kullanici_adi && new_k_sifre == kullanici_sifre) {
//        println("Kullanıcı adı hatalı!!!")
//    } else if (new_k_adi == kullanici_adi && new_k_sifre != kullanici_sifre) {
//        println("Şifreniz hatalı!!!")
//    } else {
//        println("Kullanıcı adı ve şifreniz hatalıdır!!!")
//    }

   /* println("Bir sayi gir:")
    val sayi=readln()
    println("İkinci bir sayi gir:")
    val sayi0=readln()
    if (sayi.isNotEmpty()&&sayi0.isNotEmpty()){
        try {
            val x=sayi.toInt()
            val y=sayi0.toInt()
            val top=x+y
            println("toplam: $top")
        }catch (e: NumberFormatException){
            println("Geçerli sayi gir")
        }
    } else{
        println("Geçerli sayi gir!")
    }*/

//************************************************************ KENDİ DENEMELERİM**********************
//    println("sayi 1 :")
//    val s1=readln()
//    println("sayi 2 :")
//    val s2=readln()
//    println("sayi 3 :")
//    val s3=readln()
//    if (s1.isNotEmpty()&&s2.isNotEmpty()&&s3.isNotEmpty()){
//        try {
//            val a=s1.toInt()
//            val b=s2.toInt()
//            val c=s3.toInt()
//            val cikarma=a-b-c
//            val toplama=a+b+c
//            val carpma=a*b*c
//            val ort=toplama/3
//            val enBuyuk=maxOf(a,b,c)
//            val enKucuk=minOf(a,b,c)
//            println("çıkarma işlemi sonucu: $cikarma")
//            println("toplama işlemi sonucu: $toplama")
//            println("çarpma işlemi sonucu: $carpma")
//            println("ortalaması: $ort")
//            println("girilen en buyuk sayi:: $enBuyuk")
//            println("girilen en kucuk sayi:: $enKucuk")
//        }catch (e: NumberFormatException){
//            println("boş bırakma:")
//
//        }
//    }else{
//        println("geçerli gir")
//    }
//***********************************************
//   val sayi_int: Int=15
//
//    println("Degişken Degeri= $sayi_int Degisken Tipi= ${sayi_int::class.simpleName}")
//    if (sayi_int % 2==0){
//        println("çift sayi: $sayi_int")
//    }else{
//        println("tek sayi $sayi_int")
//    }
    //***********************************************
//    val deger="sıla"
//    println("Kullanici adinizi giriniz:")
//    val alinan_deger=readln()
//    if (deger==alinan_deger){
//        println("kullanıcı adı doğru: ")
//        println("Hosgeldiniz, $deger kullanici tipi: ${deger::class.simpleName}")
//    }else{
//        println("kullanici adi geçersiz")
//    }
//    val ornek=2.0.pow(4.0)
//    println("uslu sayi degeri: $ornek")
    println("kullanici adi girin:")
    var user1=readln()
    println("sifre gir:")
    var sifre1=readln().toInt()
    var user="sila"
    var sifre=123
    if (user1==user&&sifre==sifre1){
        println("Giriş Başarili Bir Şekilde Gerceklesti***")
    }else if (user!=user1&&sifre==sifre1){
        println("hatali kullanici ismi!")

    }else if(user==user1 && sifre != sifre1){
        println("yanlis sifre!!!")

    }else{
        println("Giris Basarisiz!!!")
    }



}