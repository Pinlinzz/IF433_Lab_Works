package oop_110239_VincentAndresson.week6

class SmartSpeaker (
    override val id: String,
    override val name: String
) : SmartDevice, Switchable{

    override fun turnOn() {
        println("Lampu [$name] dengan ID ($id) sekarang menyala. Ruangan menjadi terang!")
    }

    override fun turnOff() {
        println("Lampu [$name] dengan ID ($id) telah dimatikan. Menghemat energi.")
    }

    fun playMusic (song: String) {println("Memutar lagu $song dari Spotify.")}
}
