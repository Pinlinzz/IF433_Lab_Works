package oop_110239_VincentAndresson.week8

// nama adalah non-null (wajib), email dan phone adalah nullable (opsional)

class UserProfile (
    val name : String,
    val email : String?,
    val phone : String? = null // default argument null
)