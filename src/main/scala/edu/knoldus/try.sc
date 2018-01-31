import scala.concurrent.Future

import scala.concurrent.ExecutionContext.Implicits.global

//val x = 7
//val time = 5000
//val fut = Future { Thread.sleep(time)
//  x
//}
//
//def isPrime(number: Int): Boolean = {
//  (2 until number) forall(number % _ != 0)
//}
//
//val result: Future[String] = fut.map {
//  value => if (isPrime(value)) {
//    value + "is Prime"
//  }
//  else {
//    value + "is not Prime"
//  }
//}
//
//print(result)
//
//val fut1 = Future {
//  100 + 100
//}
//
//val fut2 = Future {
//  200 + 200
//}
//
//val result: Future[Int] = for {
//  response1: Int <- fut1
//  response2: Int <- fut2
//} yield response1 + response2
//
//result.value

//val num1 = Future(3)
//val num2 = Future(4)
//val num3 = Future(5)
//
//val ans: Future[Int] = {
//  num1 flatMap {
//    value => num2 flatMap {
//      value2 => num3 map {
//        _ * value * value2
//      }
//    }
//  }
//}

val listOfFuture: List[Future[Int]] = List(Future(2 + 2), Future(20 + 3),
  Future(2 + 347))

val combindFuture: Future[List[Int]] = Future.sequence(listOfFuture)