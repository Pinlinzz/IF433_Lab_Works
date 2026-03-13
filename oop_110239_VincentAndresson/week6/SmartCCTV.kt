package oop_110239_VincentAndresson.week6

class SmartCCTV(override val id: String, override val name: String): SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV '$name' (ID: $id) diaktifkan.")
        // Memanggil fungsi startRecord secara otomatis sesuai permintaan
        startRecord()
    }

    override fun turnOff() {
        println("CCTV '$name' (ID: $id) dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("Lensa kamera mulai menangkap gambar. Proses perekaman sedang berjalan...")
    }
}