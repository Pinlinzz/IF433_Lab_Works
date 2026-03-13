package oop_110239_VincentAndresson.week6

// Main.kt

fun main() {
    val lampuTamu = SmartLamp("L-01", "Ruang Tamu")
    val speakerDapur = SmartSpeaker("S-01", "Google Nest Dapur")
    val cctvGarasi = SmartCCTV("C-01", "Ezviz Garasi")

    val hub = SmartHomeHub()

    println("=== Inisialisasi Sistem Smart Home ===")
    // iniasiiin semua device
    hub.addDevice(lampuTamu)
    hub.addDevice(speakerDapur)
    hub.addDevice(cctvGarasi)

    //nyalain camera + speker buat sirine
    hub.activateSecurityMode()

    hub.turnOffAllSwitches() // matiin semua device

    println("\n=== Selesai: Semua sistem telah diproses ===")
}