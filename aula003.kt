fun main(args: Array<String>){
    var nome = "Maria"
    var idade = 24
    var profissao = "Programadora"

    println("Meu nome é " + nome + ", tenho " + idade + " anos e sou " + profissao)

    println("Meu nome é $nome, tenho $idade anos e sou $profissao.")

    var num1 = 14
    var num2 = 24

    var soma = num1 + num2
    var mult = num1 * num2
    var divi = num1 / num2
    var sub =  num1 - num2
    var rest = num1 % num2
    var increm = num1++
    var decrem = num2--
    println(soma)
    println(mult)
    println(sub)
    println(rest)
    println(divi)
    println(increm)
    println(decrem)
}