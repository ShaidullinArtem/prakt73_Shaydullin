

fun main(args: Array<String>) {
    try {
//        println("Введите x1: ")
//        val x1: Int = readln().toInt();
//
//        println("Введите y1: ")
//        val y1: Int = readln().toInt()
//
//        println("Введите x2: ")
//        val x2: Int = readln().toInt()
//
//        println("Введите y2: ")
//        val y2: Int = readln().toInt()
//
//        println("Введите x3: ")
//        val x3: Int = readln().toInt()
//
//        println("Введите y3: ")
//        val y3: Int = readln().toInt()
//
//
//        println(task13One(x1, y1, x2, y2, x3, y3))
//        println("--------------------")
//
//        println("Введите r1: ")
//        val r1: Double = readln().toDouble();
//
//        println("Введите r2: ")
//        val r2: Double = readln().toDouble();
//
//        println("Радиус кольца: ${task20One(r1, r2)}")

        println("--------------------")

        println("Введите k:");
        val k = readln().toDouble();

        println("Введите b:");
        val b = readln().toDouble();

        println("Введите a:");
        val a = readln().toDouble();

        println(task13Two(k, b, a))

    } catch (e: Exception) {
        println("Значения должны быть числами (int/double)!")
        System.exit(1);
    }
}