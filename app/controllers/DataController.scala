package controllers

import javax.inject._
import play.api.mvc._

/**
  * Created by mosa on 8/18/16.
  */
@Singleton
class DataController @Inject extends Controller {

  def get = Action {
    Ok("El data de rag3a men rest api")
  }
}
