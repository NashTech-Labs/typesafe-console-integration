package com.knoldus.monitoring

import akka.actor._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object CalculateFactorial extends App {
  val system = ActorSystem("typesafe")
  val pingActor = system.actorOf(Props[FactorialCalculator], "factorialCalculator")
}

class FactorialCalculator extends Actor {
  var i = 0

  def receive = {
    case x: Int =>
      val factorialof = incrementCounter
      println("factorial of [" + factorialof + "] is [" + calculateFactorial(factorialof) + "]")

  }

  context.system.scheduler.schedule(0 seconds, 1 seconds, self, 1)

  def incrementCounter = {
    i = i + 1
    i
  }

  def calculateFactorial(i: Int): BigInt = {
    def factorial(n: Int, accumulator: BigInt): BigInt = {
      if (n == 1) accumulator
      else factorial(n - 1, n * accumulator)
    }
    factorial(i, 1)

  }

}