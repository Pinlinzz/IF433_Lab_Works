package oop_110239_VincentAndresson.week10

class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun searchByName(searchName: String): T? {
         NamedEntity
        return items.find { it is NamedEntity && it.name == searchName }
    }

}