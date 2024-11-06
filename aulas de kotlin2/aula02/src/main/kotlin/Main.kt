fun main(){
    //variavel mutavel
    var product = "Computer iMac"
    var idade = 41

    //variavel imutavel
    val pi = 3.1415926
    val homem = true

    //comando ::class mostra o tipo
    println(product::class)
    println(pi::class)
    println(idade::class)
    println(homem::class)

    var msg1 = """
        Texto1,
        Texto2,
        Texto3.
    """.trimIndent()

    println(msg1)

    var msg2 = """
        Texto1,
        Texto2,
        Texto3.
    """.replaceIndent(">>")

    println(msg2)

    println("O produto é $product. A idade é $idade. O valor de pi $pi.")
}
