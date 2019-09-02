package mypackage

import slick.codegen.SourceCodeGenerator

object CodeGen {

  def main(args: Array[String]):Unit = {
    SourceCodeGenerator.main(
      Array(
        "slick.jdbc.MySQLProfile",
        "com.mysql.jdbc.Driver",
        "jdbc:mysql://localhost:3306/study",
        "app/",
        "models",
        "study",
        "study"
      )
    )
  }
}