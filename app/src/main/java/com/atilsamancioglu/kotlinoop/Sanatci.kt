package com.atilsamancioglu.kotlinoop

class Sanatci(var isim: String, val yas: Int, enstruman: String) {

    private var sacRengi = ""
    private var tur = "insan"

    var gozRengi = ""
        private set
        public get

    //kullanılmaz, tamamen örnek içindir
    fun setSacRengiParolali(yeniSacRengi: String, parola: String) {
        if (parola == "atıl") {
            this.sacRengi = yeniSacRengi
        } else {
            println("parolan yanlış")
        }
    }

    fun turuYazdir() {
        println(this.tur)
    }

    fun sarkiSoyle() {
        println("şu sanatçı şarkı söyledi: ${this.isim}")
    }

    init {
        println("init çağırıldı")

    }

}

