
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object store extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.User,List[models.Game],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, games: List[models.Game]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""

"""),_display_(/*3.2*/main("OneUp", user)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""

""")))}))
      }
    }
  }

  def render(user:models.users.User,games:List[models.Game]): play.twirl.api.HtmlFormat.Appendable = apply(user,games)

  def f:((models.users.User,List[models.Game]) => play.twirl.api.HtmlFormat.Appendable) = (user,games) => apply(user,games)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 27 18:25:48 BST 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/OneUp/app/views/store.scala.html
                  HASH: 390a138a5d7f9e34471cb2189f2a69784f6954a0
                  MATRIX: 977->1|1123->52|1153->57|1180->76|1219->78
                  LINES: 28->1|33->1|35->3|35->3|35->3
                  -- GENERATED --
              */
          