package main.scala.pers.you.learn.basement
import scala.util.control.Breaks._

/**
  * Created by Administrator on 2017/6/27.
  */
object learn_breakable {
  def main(args: Array[String]): Unit ={
    breakable{
      for(i<- 1 to 10){
        if(i<6){
          println(i)
        }else{
          break
        }
      }
    }
  }
}
