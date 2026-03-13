package oop_110239_VincentAndresson.week6

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Berhasil menambahkan: ${device.name} (ID: ${device.id})")
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan Semua Saklar ---")
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\n--- Mengaktifkan Mode Keamanan ---")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }

            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }
        }
    }

}