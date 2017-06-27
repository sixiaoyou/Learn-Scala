package main.scala.pers.you.learn.basement

/**
  * Created by Administrator on 2017/6/27.
  */
object for循环 {
  def main(args: Array[String]) {
    for (i <- 1 to 3; j <- 1 to 3) {
      println("i:" + i + " "+"j:" + j)
    }
    println("=====================")
    for (i <- 1 to 3; j <- 1 to 3 if i!=j) {
      println("i:" + i + " "+"j:" + j)
    }
    var x = for(i<- 1 to 10) yield i%3
    println("=====================")
    var cc = Array(1,2,3,4,5,6,7,8)
    for(i <- cc){
      println(i)
    }

    println("=====================")
    var k = 0;
    while(k<10){
      k+=1
      println(k)
    }





  }

}
