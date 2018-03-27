
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

object game extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.User,models.Game,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, game: models.Game):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

"""),_display_(/*3.2*/main("OneUp: " + game.getTitle, user)/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""
    """),format.raw/*4.5*/("""<h1>"""),_display_(/*4.10*/game/*4.14*/.getTitle),format.raw/*4.23*/("""</h1>
    <h4>"""),_display_(/*5.10*/game/*5.14*/.getDescription),format.raw/*5.29*/("""</h4>

    <h6>"""),_display_(/*7.10*/game/*7.14*/.getPrice),format.raw/*7.23*/("""</h6>
    <h6>"""),_display_(/*8.10*/game/*8.14*/.getRating),format.raw/*8.24*/("""</h6>
""")))}))
      }
    }
  }

  def render(user:models.users.User,game:models.Game): play.twirl.api.HtmlFormat.Appendable = apply(user,game)

  def f:((models.users.User,models.Game) => play.twirl.api.HtmlFormat.Appendable) = (user,game) => apply(user,game)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 27 18:26:07 BST 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/OneUp/app/views/game.scala.html
                  HASH: 93d3fc0ac9573c96e6f67706448f0c97dcdbecb7
                  MATRIX: 970->1|1109->45|1139->50|1184->87|1223->89|1255->95|1286->100|1298->104|1327->113|1369->129|1381->133|1416->148|1460->166|1472->170|1501->179|1543->195|1555->199|1585->209
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|37->5|37->5|39->7|39->7|39->7|40->8|40->8|40->8
                  -- GENERATED --
              */
          