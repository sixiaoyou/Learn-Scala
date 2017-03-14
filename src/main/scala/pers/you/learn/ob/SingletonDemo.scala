package pers.you.learn.ob

/**
  * Created by You on 2017/3/7.
  */




object Factory{
  def getConn(): String ={
      "conne"
  }
}


object SingletonDemo {
  def main(args: Array[String]){
    val f1 = Factory
    val f2 = Factory
    println(f1)
    println(f2)
    Factory.getConn()
  }

}
