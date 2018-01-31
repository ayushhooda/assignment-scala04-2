package edu.knoldus

import java.io.File

import org.apache.log4j.Logger

import scala.concurrent.Future
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global


object Application extends App {

  //scalastyle:off
  val log = Logger.getLogger{this.getClass}
  val obj = new Operation()
  val path = "/home/knoldus/assignment-scala04-2/Folder1"
  val listOfFiles: Future[List[File]] = Future {
    obj.getListOfFiles(List(new File(path)))
  }
  //scalastyle:on

  listOfFiles onComplete {
    case Success(value) => log.info(value)
    case Failure(exception) => log.info(exception.getMessage)
  }

}
