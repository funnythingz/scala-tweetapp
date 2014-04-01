object list {

    def main(args: Array[String]) {

        val a: Int = 10
        val b: Int = 20
        val c: Int = 30

        println(sum(a, b, c))

        val arr = Array[Int](a, b, c)
        println(arr.length)
        println(arr(0) + "," + arr(1) + "," + arr(2))

    }

    def sum(a: Int, b: Int, c: Int): Int = a + b + c

}
