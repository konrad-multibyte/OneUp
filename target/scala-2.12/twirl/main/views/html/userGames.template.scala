
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

object userGames extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.User,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userGames: models.users.User, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("OneUp :: " + user.getUsername + " :: Games", user)/*3.58*/ {_display_(Seq[Any](format.raw/*3.60*/("""
    
""")))}))
      }
    }
  }

  def render(userGames:models.users.User,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userGames,user)

  def f:((models.users.User,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userGames,user) => apply(userGames,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 20 16:00:29 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/userGames.scala.html
                  HASH: 305f27c35eb8bd74a9d40d8fdb010cf72733e00e
                  MATRIX: 981->1|1130->57|1157->59|1221->115|1260->117
                  LINES: 28->1|33->2|34->3|34->3|34->3
                  -- GENERATED --
              */
          