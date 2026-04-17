package oop_110239_VincentAndresson.week8

object DatabaseMock {
    fun findUser(id: Int) : UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTest() {
    println("\n=== RUNNING UNIT TEST ===")
    val testUser = DatabaseMock.findUser(1)

    //Di unit esttn, jika user nul, kita HARAP testnya baka gagal (crash)
    //Maka penggunana !! sangat lazim di file testing
    val initial = testUser!!.name.substring(0,1)

    //check() adaalah fungsi bawaan Kotlin untuk assertion
    check(initial == "T") {"test Failed! Initial is wrong."}
    println("Test Passed: initial is T")
}