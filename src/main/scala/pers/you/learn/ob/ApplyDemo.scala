package pers.you.learn.ob

/**
  * Created by You on 2017/3/7.
  */
object ApplyDemo {
  def main(args: Array[String]): Unit = {
//    val arr = Array(1,2,3,4,5)
//    val ma = MyArray(1,2)
       val ma = MyArray(1,2,3,4,5)
  }
}


object MyArray{
  def apply(i: Int): Unit ={
    println(i)
  }
  def apply(i: Int,j: Int): Unit ={
    println(i + j)
  }

  def apply(i: Int,j: Int*): Unit ={
    println("you")
  }


}