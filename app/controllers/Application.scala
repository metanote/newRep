package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
object Application extends Controller {
  case class User(id: Long, name: String, email: Option[String])

  val formSub = Form(

  tuple (
"name" -> text,
"pwd" -> text
)
)

  def index() = Action {
    Ok(views.html.index("hello scala"))
  }
  
}