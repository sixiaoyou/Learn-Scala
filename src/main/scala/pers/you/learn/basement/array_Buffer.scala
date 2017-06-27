package main.scala.pers.you.learn.basement

/**
  * Created by Administrator on 2017/6/27.
  */
object array_Buffer {
  def main(args: Array[String]) {
//    定长数组
    val nums = new Array[Int](10)
    val array1 = Array(1 to 10:_*)


    import scala.collection.mutable.ArrayBuffer

    var numArrayBuffer = new ArrayBuffer[Int]()
    numArrayBuffer +=1
    numArrayBuffer +=4
    numArrayBuffer +=2
    numArrayBuffer +=5
    numArrayBuffer +=(6,7,8)
    numArrayBuffer ++=array1

    println(numArrayBuffer.mkString(","))
    println("============================")

//    移除最后四个元素
    numArrayBuffer.trimEnd(4)
    println(numArrayBuffer.mkString(","))
    println("============================")

//    移除开始两个元素
    numArrayBuffer.trimStart(2)
    println(numArrayBuffer.mkString(","))
    println("============================")

//    在第2个位置插入100
    numArrayBuffer.insert(2,100)
    println(numArrayBuffer.mkString(","))
    println("============================")

//    从3开始移除4个元素
    numArrayBuffer.remove(3,4)
    println(numArrayBuffer.mkString(","))
    println("============================")




  }
}
