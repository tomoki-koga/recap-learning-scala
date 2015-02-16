package com.github.tamaki.study.tamaki.FizzBuzz

/**
 * Created by tomoki.koga@bizreach.co.jp on 2015/02/08.
 */
object FizzBuzz {
  def main(args: Array[String]): Unit = {

    // 2の倍数を除去する
    (1 to 100).filter(_ % 2 != 0).map {
      case n if n % 15 == 0 => "FizzBuzz"
      case n if n %  3 == 0 => "Fizz"
      case n if n %  5 == 0 => "Buzz"
      case n => n.toString
    }.foreach(println)

//  (1 to 100).map(sorting).foreach(println)
  }

  def sorting(num: Int): String = {
    (num % 3, num % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case _ => num.toString
    }
  }
}
