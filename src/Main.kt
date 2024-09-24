import java.util.*

fun main() {
    //primerEjercicio();
    //segundoEjercicio();
    //tercerEjercicio();
    //cuartoEjercicio();
    //quintoEjercicio();
    //sixExercise();
    //sevenExercise();
    //eightExercise();
    //nineExercise();
    //tenExercise();
    //elevenExercise();
    //twelveExercise();
    //thirteenExercise();
    //fourteenExercise();
    //fifteenExercise();
    //sixteenExercise();
    //seventeenExercise(); //Arreglar
    //eighteenExercise(); //Arrelgar
    //nineteenExercise(); //arreglar
    //twentyOneExercise();
}

fun primerEjercicio() {
    println("Ingrese el número de filas (M): ")
    val m = readLine()!!.toInt()
    println("Ingrese el número de columnas (N): ")
    val n = readLine()!!.toInt()

    val matriz = Array(m) { IntArray(n) }

    println("Ingrese los elementos de la matriz:")
    for (i in 0 until m) {
        for (j in 0 until n) {
            println("Elemento [$i][$j]: ")
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    println("Ingrese el número K: ")
    val k = readLine()!!.toInt()

    val matrizResultante = Array(m) { IntArray(n) }
    for (i in 0 until m) {
        for (j in 0 until n) {
            matrizResultante[i][j] = matriz[i][j] * k
        }
    }

    println("La matriz resultante es:")
    for (i in 0 until m) {
        for (j in 0 until n) {
            print("${matrizResultante[i][j]} ")
        }
        println() // Nueva línea después de cada fila
    }
}

fun segundoEjercicio() {
    println("Ingrese el tamaño de la matriz cuadrada (P): ")
    val p = readLine()!!.toInt()
    val matriz = Array(p) { IntArray(p) }

    println("Ingrese los elementos de la matriz:")
    for (i in 0 until p) {
        for (j in 0 until p) {
            println("Elemento [$i][$j]: ")
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    println("Elementos de la diagonal principal:")
    for (i in 0 until p) {
        print("${matriz[i][i]} ")
    }
    println()

    println("Elementos de la diagonal secundaria:")
    for (i in 0 until p) {
        print("${matriz[i][p - 1 - i]} ")
    }
    println()

    println("Elementos de la matriz triangular superior:")
    for (i in 0 until p) {
        for (j in 0 until p) {
            if (j >= i) {
                print("${matriz[i][j]} ")
            } else {
                print("  ")
            }
        }
        println()
    }

    println("Elementos de la matriz triangular inferior:")
    for (i in 0 until p) {
        for (j in 0 until p) {
            if (j <= i) {
                print("${matriz[i][j]} ")
            } else {
                print("  ")
            }
        }
        println()
    }
}

fun tercerEjercicio() {
    println("Ingrese el número de filas (A): ")
    val a = readLine()!!.toInt()
    println("Ingrese el número de columnas (B): ")
    val b = readLine()!!.toInt()
    val matriz = Array(a) { IntArray(b) }

    println("Ingrese los elementos de la matriz:")
    for (i in 0 until a) {
        for (j in 0 until b) {
            println("Elemento [$i][$j]: ")
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    val matrizTranspuesta = Array(b) { IntArray(a) }
    for (i in 0 until a) {
        for (j in 0 until b) {
            matrizTranspuesta[j][i] = matriz[i][j]
        }
    }

    println("Matriz original:")
    for (i in 0 until a) {
        for (j in 0 until b) {
            print("${matriz[i][j]} ")
        }
        println()
    }

    println("Matriz transpuesta:")
    for (i in 0 until b) {
        for (j in 0 until a) {
            print("${matrizTranspuesta[i][j]} ")
        }
        println()
    }
}

fun cuartoEjercicio() {
    var n: Int
    var m: Int

    do {
        println("Ingrese el número de filas (N): ")
        n = readLine()!!.toInt()
    } while (n <= 0)

    do {
        println("Ingrese el número de columnas (M): ")
        m = readLine()!!.toInt()
    } while (m <= 0)

    val matriz = Array(n) { IntArray(m) }
    println("Ingrese los elementos de la matriz:")
    for (i in 0 until n) {
        for (j in 0 until m) {
            println("Elemento [$i][$j]: ")
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    val esCuadrada = n == m
    println("La matriz es cuadrada: $esCuadrada")
    var sumaTotal = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            sumaTotal += matriz[i][j]
        }
    }
    val promedioTotal = sumaTotal.toDouble() / (n * m)
    println("El promedio de los N x M números es: $promedioTotal")
    println("Promedios por fila:")
    for (i in 0 until n) {
        val sumaFila = matriz[i].sum()
        val promedioFila = sumaFila.toDouble() / m
        println("Promedio de la fila $i: $promedioFila")
    }

    println("Promedios por columna:")
    for (j in 0 until m) {
        var sumaColumna = 0
        for (i in 0 until n) {
            sumaColumna += matriz[i][j]
        }
        val promedioColumna = sumaColumna.toDouble() / n
        println("Promedio de la columna $j: $promedioColumna")
    }
}

fun quintoEjercicio() {
    println("Ingrese el número de filas (N): ")
    val n = readLine()!!.toInt()
    println("Ingrese el número de columnas (M): ")
    val m = readLine()!!.toInt()
    val matriz = Array(n) { IntArray(m) }

    println("Ingrese los elementos de la matriz:")
    for (i in 0 until n) {
        for (j in 0 until m) {
            println("Elemento [$i][$j]: ")
            matriz[i][j] = readLine()!!.toInt()
        }
    }

    var esRala = true

    for (i in 0 until n) {
        var contadorUnoFila = 0
        for (j in 0 until m) {
            if (matriz[i][j] == 1) {
                contadorUnoFila++
            }
        }
        if (contadorUnoFila != 1) {
            esRala = false
            break
        }
    }

    if (esRala) {
        for (j in 0 until m) {
            var contadorUnoColumna = 0
            for (i in 0 until n) {
                if (matriz[i][j] == 1) {
                    contadorUnoColumna++
                }
            }
            if (contadorUnoColumna != 1) {
                esRala = false
                break
            }
        }
    }

    if (esRala) {
        println("La matriz es rala.")
    } else {
        println("La matriz no es rala.")
    }
}

fun sixExercise() {
    fun leerMatriz(N: Int, M: Int): Array<IntArray> {
        val matriz = Array(N) { IntArray(M) }
        val scanner = Scanner(System.`in`)

        println("Ingrese los elementos de la matriz de $N x $M:")
        for (i in 0 until N) {
            for (j in 0 until M) {
                print("Elemento [$i][$j]: ")
                matriz[i][j] = scanner.nextInt()
            }
        }
        return matriz
    }

    fun sumarMatrices(matriz1: Array<IntArray>, matriz2: Array<IntArray>): Array<IntArray> {
        val N = matriz1.size
        val M = matriz1[0].size
        val resultado = Array(N) { IntArray(M) }

        for (i in 0 until N) {
            for (j in 0 until M) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j]
            }
        }
        return resultado
    }

    fun multiplicarMatrices(matriz1: Array<IntArray>, matriz2: Array<IntArray>): Array<IntArray>? {
        val N = matriz1.size
        val M = matriz2[0].size
        val P = matriz1[0].size

        if (P != matriz2.size) {
            println("Multiplicación no es posible. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.")
            return null
        }

        val resultado = Array(N) { IntArray(M) }
        for (i in 0 until N) {
            for (j in 0 until M) {
                for (k in 0 until P) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j]
                }
            }
        }
        return resultado
    }

    fun imprimirMatriz(matriz: Array<IntArray>) {
        for (fila in matriz) {
            println(fila.joinToString(" ") { it.toString() })
        }
    }

    fun executeAll() {
        val scannerSixExercise = Scanner(System.`in`)

        print("Ingrese el número de filas (N): ")
        val N = scannerSixExercise.nextInt()
        print("Ingrese el número de columnas (M): ")
        val M = scannerSixExercise.nextInt()

        println("Matriz 1:")
        val matriz1 = leerMatriz(N, M)
        println("Matriz 2:")
        val matriz2 = leerMatriz(N, M)

        println("Suma de las matrices:")
        val suma = sumarMatrices(matriz1, matriz2)
        imprimirMatriz(suma)

        println("Multiplicación de las matrices (si es posible):")
        val multiplicacion = multiplicarMatrices(matriz1, matriz2)
        if (multiplicacion != null) {
            imprimirMatriz(multiplicacion)
        }
    }

    executeAll();
}

fun sevenExercise() {
    fun leerMatriz(N: Int, M: Int): Array<IntArray> {
        val matriz = Array(N) { IntArray(M) }
        val scanner = Scanner(System.`in`)

        println("Ingrese los elementos de la matriz de $N x $M:")
        for (i in 0 until N) {
            for (j in 0 until M) {
                print("Elemento [$i][$j]: ")
                matriz[i][j] = scanner.nextInt()
            }
        }
        return matriz
    }

    fun eliminarFila(matriz: Array<IntArray>, x: Int): Array<IntArray> {
        return matriz.filterIndexed { index, _ -> index != x }.toTypedArray()
    }

    fun eliminarColumna(matriz: Array<IntArray>, y: Int): Array<IntArray> {
        val N = matriz.size
        val M = matriz[0].size
        val nuevaMatriz = Array(N) { IntArray(M - 1) }

        for (i in 0 until N) {
            var k = 0
            for (j in 0 until M) {
                if (j != y) {
                    nuevaMatriz[i][k] = matriz[i][j]
                    k++
                }
            }
        }
        return nuevaMatriz
    }

    fun insertarFila(matriz: Array<IntArray>, nuevaFila: IntArray, x: Int): Array<IntArray> {
        val N = matriz.size
        val M = matriz[0].size
        val nuevaMatriz = Array(N + 1) { IntArray(M) }

        for (i in 0 until x) {
            nuevaMatriz[i] = matriz[i]
        }
        nuevaMatriz[x] = nuevaFila
        for (i in x until N) {
            nuevaMatriz[i + 1] = matriz[i]
        }
        return nuevaMatriz
    }

    fun insertarColumna(matriz: Array<IntArray>, nuevaColumna: IntArray, y: Int): Array<IntArray> {
        val N = matriz.size
        val M = matriz[0].size
        val nuevaMatriz = Array(N) { IntArray(M + 1) }

        for (i in 0 until N) {
            var k = 0
            for (j in 0 until M + 1) {
                if (j == y) {
                    nuevaMatriz[i][j] = nuevaColumna[i]
                } else {
                    nuevaMatriz[i][j] = matriz[i][k]
                    k++
                }
            }
        }
        return nuevaMatriz
    }

    fun imprimirMatriz(matriz: Array<IntArray>) {
        for (fila in matriz) {
            println(fila.joinToString(" ") { it.toString() })
        }
    }

    fun executeSeven() {
        val scanner = Scanner(System.`in`)

        print("Ingrese el número de filas (N): ")
        val N = scanner.nextInt()
        print("Ingrese el número de columnas (M): ")
        val M = scanner.nextInt()

        val matriz = leerMatriz(N, M)
        val n = N - 1
        val m = N - 1

        print("Ingrese la fila x a eliminar (0-$n): ")
        val xEliminar = scanner.nextInt()
        if (xEliminar in 0 until N) {
            val matrizSinFila = eliminarFila(matriz, xEliminar)
            println("Matriz sin la fila $xEliminar:")
            imprimirMatriz(matrizSinFila)
        } else {
            println("Índice de fila inválido.")
        }

        print("Ingrese la columna y a eliminar (0-$m): ")
        val yEliminar = scanner.nextInt()
        if (yEliminar in 0 until M) {
            val matrizSinColumna = eliminarColumna(matriz, yEliminar)
            println("Matriz sin la columna $yEliminar:")
            imprimirMatriz(matrizSinColumna)
        } else {
            println("Índice de columna inválido.")
        }

        print("Ingrese la fila x en la que desea insertar una nueva fila (0-$n): ")
        val xInsertar = scanner.nextInt()
        if (xInsertar in 0..N) {
            val nuevaFila = IntArray(M) { i ->
                print("Ingrese el valor para la nueva fila en la columna $i: ")
                scanner.nextInt()
            }
            val matrizConFila = insertarFila(matriz, nuevaFila, xInsertar)
            println("Matriz con nueva fila en la posición $xInsertar:")
            imprimirMatriz(matrizConFila)
        } else {
            println("Índice de fila inválido.")
        }

        print("Ingrese la columna y en la que desea insertar una nueva columna (0-$m): ")
        val yInsertar = scanner.nextInt()
        if (yInsertar in 0..M) {
            val nuevaColumna = IntArray(N) { i ->
                print("Ingrese el valor para la nueva columna en la fila $i: ")
                scanner.nextInt()
            }
            val matrizConColumna = insertarColumna(matriz, nuevaColumna, yInsertar)
            println("Matriz con nueva columna en la posición $yInsertar:")
            imprimirMatriz(matrizConColumna)
        } else {
            println("Índice de columna inválido.")
        }
    }
    executeSeven();
}

fun eightExercise() {
    fun leerMatriz(N: Int): Array<IntArray> {
        val matriz = Array(N) { IntArray(N) }
        val scanner = Scanner(System.`in`)

        println("Ingrese los elementos de la matriz de $N x $N:")
        for (i in 0 until N) {
            for (j in 0 until N) {
                print("Elemento [$i][$j]: ")
                matriz[i][j] = scanner.nextInt()
            }
        }
        return matriz
    }

    fun modificarMatriz(matriz: Array<IntArray>) {
        for (i in matriz.indices) {
            for (j in matriz[i].indices) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0
                } else if (matriz[i][j] > 0) {
                    matriz[i][j] = 9
                }
            }
        }
    }

    fun imprimirMatriz(matriz: Array<IntArray>) {
        for (fila in matriz) {
            println(fila.joinToString(" ") { it.toString() })
        }
    }

    fun executeExample() {
        val scanner = Scanner(System.`in`)

        print("Ingrese el tamaño de la matriz (N): ")
        val N = scanner.nextInt()

        val matriz = leerMatriz(N)

        println("Matriz original:")
        imprimirMatriz(matriz)

        modificarMatriz(matriz)

        println("Matriz modificada:")
        imprimirMatriz(matriz)
    }

    executeExample();
}

fun nineExercise() {
    val scanner = Scanner(System.`in`)

    // Leer el número de sucursales
    print("Ingrese el número de sucursales: ")
    val N = scanner.nextInt()

    // Definir la matriz de ventas N x 12 (N sucursales y 12 meses)
    val ventas = Array(N) { IntArray(12) }
    val ventasSucursal = IntArray(N)
    val totalMes = IntArray(12)
    var totalVentas = 0

    // Leer las ventas de cada sucursal para cada mes
    for (i in 0 until N) {
        println("Ingrese las ventas de la sucursal ${i + 1} para los 12 meses:")
        for (j in 0 until 12) {
            print("Mes ${j + 1}: ")
            ventas[i][j] = scanner.nextInt()
            ventasSucursal[i] += ventas[i][j]  // Sumar las ventas por sucursal
            totalMes[j] += ventas[i][j]        // Sumar las ventas por mes
            totalVentas += ventas[i][j]        // Sumar al total general
        }
    }

    // a) Total de ventas de la compañía
    println("Total de ventas de la compañía: $totalVentas")

    // b) Total de ventas por cada sucursal
    for (i in 0 until N) {
        println("Total de ventas de la sucursal ${i + 1}: ${ventasSucursal[i]}")
    }

    // c) Sucursal que más vendió
    val sucursalMax = ventasSucursal.indices.maxByOrNull { ventasSucursal[it] } ?: -1
    println("La sucursal que más vendió fue la número ${sucursalMax + 1} con ${ventasSucursal[sucursalMax]} ventas.")

    // d) Mes que menos vendió la compañía
    val mesMenorVenta = totalMes.indices.minByOrNull { totalMes[it] } ?: -1
    println("El mes que menos vendió la compañía fue el mes ${mesMenorVenta + 1} con ${totalMes[mesMenorVenta]} ventas.")
}

fun tenExercise() {
    val scanner = Scanner(System.`in`)

    print("Ingrese el número de estudiantes (M): ")
    val M = scanner.nextInt()

    val calificaciones = Array(M) { IntArray(6) }

    for (i in 0 until M) {
        println("Ingrese las calificaciones del estudiante ${i + 1} de 0 a 100:")
        for (j in 0 until 6) {
            print("Calificación en la materia ${j + 1}: ")
            calificaciones[i][j] = scanner.nextInt()
        }
    }

    println("\nPromedio de cada estudiante:")
    for (i in 0 until M) {
        val promedioEstudiante = calificaciones[i].average()
        println("Estudiante ${i + 1}: Promedio = %.2f".format(promedioEstudiante))
    }

    val aprobados = IntArray(6)
    val reprobados = IntArray(6)
    val sumaMaterias = IntArray(6)

    for (j in 0 until 6) {
        for (i in 0 until M) {
            if (calificaciones[i][j] >= 60) {
                aprobados[j]++
            } else {
                reprobados[j]++
            }
            sumaMaterias[j] += calificaciones[i][j]
        }
    }

    println("\nAprobados y reprobados por cada materia:")
    for (j in 0 until 6) {
        println("Materia ${j + 1}: Aprobados = ${aprobados[j]}, Reprobados = ${reprobados[j]}")
    }

    println("\nPromedio de cada materia:")
    for (j in 0 until 6) {
        val promedioMateria = sumaMaterias[j].toDouble() / M
        println("Materia ${j + 1}: Promedio = %.2f".format(promedioMateria))
    }
}

fun elevenExercise() {
    val scanner = Scanner(System.`in`)

    // Leer la cantidad de empleados
    print("Ingrese la cantidad de empleados: ")
    val N = scanner.nextInt()

    // Crear una matriz para almacenar la información de los empleados
    // La matriz tendrá N filas y 3 columnas: [Código, Horas normales, Horas sobretiempo]
    val empleados = Array(N) { IntArray(3) }

    // Leer los datos de los empleados
    for (i in 0 until N) {
        println("Ingrese los datos del empleado ${i + 1}:")
        print("Código del empleado: ")
        empleados[i][0] = scanner.nextInt()

        print("Horas trabajadas en horario normal: ")
        empleados[i][1] = scanner.nextInt()

        print("Horas trabajadas en sobretiempo: ")
        empleados[i][2] = scanner.nextInt()
    }

    // Emitir el informe
    println("\nInforme de empleados:")
    for (i in 0 until N) {
        val codigo = empleados[i][0]
        val horasNormales = empleados[i][1]
        val horasSobretiempo = empleados[i][2]

        val pagoNormal = horasNormales * 2350
        val pagoSobretiempo = horasSobretiempo * 3500
        val totalEmpleado = pagoNormal + pagoSobretiempo

        // Imprimir los datos del empleado
        println("\nEmpleado $codigo:")
        println("Horas normales trabajadas: $horasNormales, $ por horas normales: $$pagoNormal")
        println("Horas sobretiempo trabajadas: $horasSobretiempo, $ por horas sobretiempo: $$pagoSobretiempo")
        println("Total $ del empleado: $$totalEmpleado")
    }
}

fun twelveExercise() {
    println("Ingrese el tamaño N de la matriz (N debe ser impar y mayor que 3):")
    val n = readlnOrNull()?.toIntOrNull() ?: 5

    if (n % 2 == 0 || n <= 3) {
        println("N debe ser un número impar y mayor que 3.")
        return
    }

    val matriz = Array(n) { IntArray(n) { 0 } }

    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = j
        }
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            print("${matriz[i][j]} ")
        }
        println()
    }
}

fun thirteenExercise() {
    val n = 5
    val matriz = Array(n) { IntArray(n) }

    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = if (i == 0 || j == 0 || i == n - 1 || j == n - 1) 1 else 0
        }
    }

    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}

fun fourteenExercise() {
    val n = 5
    val matriz = Array(n) { IntArray(n) }

    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = if (i == j) i + 1 else 0
        }
    }

    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}

fun fifteenExercise() {
    val n = 5
    val matriz = Array(n) { IntArray(n) }

    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = i * j
        }
    }

    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}

fun sixteenExercise() {
    val n = 5
    val matriz = Array(n) { IntArray(n) }

    for (i in 0 until n) {
        for (j in 0 until n) {
            matriz[i][j] = if (i % 2 == 0) j + 1 else n - j
        }
    }

    for (fila in matriz) {
        println(fila.joinToString(" "))
    }
}

fun seventeenExercise() {
    val N = 5

    if (N % 2 == 0 || N <= 3) {
        println("N debe ser un número impar mayor que 3")
        return
    }

    val matriz = Array(N) { IntArray(N) }

    for (i in 0 until N) {
        for (j in 0 until N) {
            if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                matriz[i][j] = 1
            } else if (i == j) {
                matriz[i][j] = 1
            } else {
                matriz[i][j] = 0
            }
        }
    }

    for (i in 0 until N) {
        for (j in 0 until N) {
            print("${matriz[i][j]} ")
        }
        println()
    }
}

fun eighteenExercise() {
    fun generarMatrizDiagonal(N: Int): Array<IntArray> {
        val matriz = Array(N) { IntArray(N) }

        var valor = 1
        for (i in N - 1 downTo 0) {
            var x = N - 1
            var y = i
            while (y < N && x >= 0) {
                matriz[x][y] = valor++
                x--
                y++
            }
        }

        for (j in 1 until N) {
            var x = j
            var y = 0
            while (x < N && y < N) {
                matriz[x][y] = valor++
                x++
                y++
            }
        }

        return matriz
    }

    fun imprimirMatriz(matriz: Array<IntArray>) {
        for (fila in matriz) {
            println(fila.joinToString(" ") { it.toString() })
        }
    }

    fun executeCompleteFunction() {
        val N = 5
        if (N % 2 == 1 && N > 3) {
            val matriz = generarMatrizDiagonal(N)
            imprimirMatriz(matriz)
        } else {
            println("El valor de N debe ser impar y mayor que 3.")
        }
    }
    executeCompleteFunction();
}

fun nineteenExercise() {
    fun generarMatrizZigzag(N: Int): Array<IntArray> {
        val matriz = Array(N) { IntArray(N) }
        var valor = N * N

        for (fila in 0 until N) {
            if (fila % 2 == 0) {
                for (col in (N - 1) downTo 0) {
                    matriz[fila][col] = valor--
                }
            } else {
                for (col in 0 until N) {
                    matriz[fila][col] = valor--
                }
            }
        }
        return matriz
    }

    fun imprimirMatriz(matriz: Array<IntArray>) {
        for (fila in matriz) {
            println(fila.joinToString(" ") { it.toString() })
        }
    }

    fun executeFuction() {
        val N = 5
        if (N % 2 == 1 && N > 3) {
            val matriz = generarMatrizZigzag(N)
            imprimirMatriz(matriz)
        } else {
            println("El valor de N debe ser impar y mayor que 3.")
        }
    }

    executeFuction();
}

fun twentyOneExercise() {
    fun generarMatrizEspiral(N: Int): Array<IntArray> {
        val matriz = Array(N) { IntArray(N) }
        var valor = 1
        var filaInicio = 0
        var filaFin = N - 1
        var colInicio = 0
        var colFin = N - 1

        while (filaInicio <= filaFin && colInicio <= colFin) {
            for (i in colInicio..colFin) {
                matriz[filaInicio][i] = valor++
            }
            filaInicio++

            for (i in filaInicio..filaFin) {
                matriz[i][colFin] = valor++
            }
            colFin--

            if (filaInicio <= filaFin) {
                for (i in colFin downTo colInicio) {
                    matriz[filaFin][i] = valor++
                }
                filaFin--
            }

            if (colInicio <= colFin) {
                for (i in filaFin downTo filaInicio) {
                    matriz[i][colInicio] = valor++
                }
                colInicio++
            }
        }

        return matriz
    }

    fun imprimirMatriz(matriz: Array<IntArray>) {
        for (fila in matriz) {
            println(fila.joinToString(" ") { it.toString() })
        }
    }

    fun executeAll() {
        val N = 5  // Cambia este valor por el tamaño de la matriz
        if (N % 2 == 1 && N > 3) {
            val matriz = generarMatrizEspiral(N)
            imprimirMatriz(matriz)
        } else {
            println("El valor de N debe ser impar y mayor que 3.")
        }
    }
    executeAll();
}