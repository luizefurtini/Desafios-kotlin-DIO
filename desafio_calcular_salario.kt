import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val salario = input.nextDouble()
    val beneficio = input.nextDouble()


    val reajuste = when {
        salario > 2500.00 -> 15
        salario in 1100.01..2500.00 -> 10
        else -> 5
    }
    val imposto = salario * ( reajuste.toDouble() /100 )
    val novoSalario = salario - imposto + beneficio


    println("%.2f".format(novoSalario))
   
}