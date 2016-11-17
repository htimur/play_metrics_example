package controllers

import javax.inject._

import com.codahale.metrics.annotation.{Counted, Metered, Timed}
import play.api.mvc._

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class HomeController @Inject() extends Controller {

  @Counted(monotonic = true)
  @Timed
  @Metered
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

}
