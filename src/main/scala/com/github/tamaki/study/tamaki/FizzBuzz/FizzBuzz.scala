package com.github.tamaki.study.tamaki.FizzBuzz

/**
 * Created by tomoki.koga@bizreach.co.jp on 2015/02/08.
 */
object FizzBuzz {
  def main(args: Array[String]): Unit = {
    (1 to 100).foreach(sorting)
  }

  def sorting(num: Int): Unit = {
    (num % 3, num % 5) match {
      case (0, 0) => println("FizzBuzz")
      case (0, _) => println("Fizz")
      case (_, 0) => println("Buzz")
      case _ => println(num)
    }
  }
}
