import kotlin.math.abs

// Number 1
fun task20One(r1: Double, r2: Double): Double {
    if (r1 > r2 ) System.exit(1);
    return Math.PI * (Math.pow(r2, 2.0) - Math.pow(r1, 2.0));
}
//