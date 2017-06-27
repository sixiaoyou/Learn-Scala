package main.scala.pers.you.learn.basement

/**
  * Created by Administrator on 2017/6/27.
  */
object filter01 {
  def main(args: Array[String]) {
    val a = Array(1 to 10: _*);
    for( i <- a){
      println(i);
    }
    println("==========")
    //利用yield返回数组
    var b = for(i <- a if i%2 ==0) yield i * 2;
    for( i <- b){
      println(i);
    }
    println("==========")
    var c = a.filter(_%2 == 0).map(_ * 3)
    for(i<-c){
      println(i)
    }
  }




}
