object Solution {
    def static(arrs: Array[Int]) {
        
        var totalList = new Array[Int](5)

        for (i <- 0 until arrs.size ) {
            var total: Int=0

            for (j <- 0 until arrs.size) {
                (j-i) compare 0 match {               
                    case 0 => total = total + 0 // equal
                    case 1 => total = total + arrs(j) // larger than
                    case -1 => total = total + arrs(j) // less than
                }
            }

            totalList(i)=total
        }
        println(totalList.reduceLeft(_ min _) +" "+totalList.reduceLeft(_ max _))
    }

    def main(args: Array[String]) {
        var n: Int=5
        var numList: Array[Int] = scala.io.StdIn.readLine().split(" ").map(_.trim.toInt).take(n)
        static(numList)
    }
}