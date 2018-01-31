package edu.knoldus

import java.io.File

class Operation {

  def getListOfFiles(listOfDirectories: List[File]): List[File] = {

    def innerFindAllFiles(listOfFiles: List[File], listOfDirectories: List[File]): List[File] = {
      listOfDirectories match {
        case head :: tail => innerFindAllFiles(listOfFiles ::: head.listFiles.filter(_.isFile).toList, tail ::: head.listFiles.filter(_.isDirectory).toList)
        case Nil => listOfFiles
      }
    }

    innerFindAllFiles(List(), listOfDirectories)
  }

}
