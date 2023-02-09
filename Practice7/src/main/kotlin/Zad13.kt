import kotlin.math.abs

// Number 1
fun task13One(x1: Int, y1: Int, x2:Int, y2:Int, x3: Int, y3: Int): String {

    val ab: IntArray = intArrayOf(x2 - x1, y2 - y1);
    val bc: IntArray = intArrayOf(x3 - x2, y3 - y2);
    val ac: IntArray = intArrayOf(x3 - x2, y3 - y2);

    val a: Double = Math.sqrt(abs((ab[0] + ab[1]).toDouble()));
    val b: Double = Math.sqrt(abs((bc[0] + bc[1]).toDouble()));
    val c: Double = Math.sqrt(abs((ac[0] + ac[1]).toDouble()));

    val P: Double = a + b + c;
    val p: Double = P/2;

    val S: Double = Math.sqrt(p * (p - a) * (p - b) * (p - c))

    return "Периметр: $P\nПлощадь: $S";
}
//

// Number 2
fun task13Two(k: Double, b:Double, a: Double): String {

    val d: Double = Math.sqrt(Math.pow(b, 2.0) + 4 * k);
    val x1: Double = (-b + d) / 2 * k;
    val x2: Double = (-b - d) / 2 * k;

    if (x1 == x2) return "Одна точка пересечения. Координаты $x1, $x2";
    else return "Две точки пересечения. Координаты $x1, $x2";

}
//