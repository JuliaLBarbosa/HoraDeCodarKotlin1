//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var base: Double
    var altura: Double
    var lado: Double
    var base_maior: Double
    var base_menor: Double
    var diagonal_maior: Double
    var diagonal_menor: Double
    var pi: Double
    var raio:Double

    println("\n1)Qual figura voce deseja calcular?: " +
            "\n1.retangulo " +
            "\n2.quadrado " +
            "\n3.losangulo " +
            "\n4.trapezio " +
            "\n5.paralelogramo " +
            "\n6.triangulo " +
            "\n7.circulo \n ")

    when(readln()!!.toInt()){
        1-> { println("Informe o valor da base: ")
            base = readln().toDouble()
            println("Informe o valor da altura: ")
            altura = readln().toDouble()
            println("O valor da área será: " + base*altura)
        }
        2 -> { println("Informe o valor do lado: ")
            lado = readln().toDouble()
            println("O valor da área será: " + lado*lado)
        }
        3 -> { println("Informe o valor da diagonal maior: ")
            diagonal_maior = readln().toDouble()
            println("Informe o valor da diagonal menor: ")
            diagonal_menor = readln().toDouble()
            println("O valor da área será: " + (diagonal_maior+diagonal_menor)/2)
        }
        4 -> { println("Informe o valor da base maior: ")
            base_maior = readln().toDouble()
            println("Informe o valor da base menor: ")
            base_menor = readln().toDouble()
            println("Informe o valor da altura: ")
            altura = readln().toDouble()
            println("O valor da área será: " + (base_maior + base_menor)*altura/2)
        }
        5 -> { println("Informe o valor da base: ")
            base = readln().toDouble()
            println("Informe o valor da altura: ")
            altura = readln().toDouble()
            println("O valor da área será: " + base*altura)
        }
        6 -> { println("Informe o valor da base: ")
            base = readln().toDouble()
            println("Informe o valor da altura: ")
            altura = readln().toDouble()
            println("O valor da área será: " + (base*altura)/2)
        }
        7 -> { println("Informe o valor de pi: ")
            pi = readln().toDouble()
            println("Informe o valor de raio: ")
            raio = readln().toDouble()
            println("O valor da área será: " + pi * (raio * raio))

        }

    }

}