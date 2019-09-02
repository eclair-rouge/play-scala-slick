package services.dao

import javax.inject.{Inject, Singleton}
import models.Tables._
import play.api.db.slick.DatabaseConfigProvider
import slick.jdbc.JdbcProfile

import scala.concurrent.{ExecutionContext, Future}

@Singleton
class PeopleDao @Inject()(dbConfigProbider: DatabaseConfigProvider)(implicit  ec:ExecutionContext){
  private val dbConfig = dbConfigProbider.get[JdbcProfile]

  import dbConfig._
  import profile.api._

  def add(name: String, age: Int): Future[Unit] = {
    val act = DBIO.seq(People.map(p => (p.name, p.age)) += (name, age))

    db.run(act)
  }

  def listAll(): Future[Seq[PeopleRow]] = {
    db.run(People.result)
  }
}