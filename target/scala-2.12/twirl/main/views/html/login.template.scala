
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[play.data.Form[models.users.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: play.data.Form[models.users.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),_display_(/*3.2*/main("Login", null)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
    """),_display_(/*4.6*/helper/*4.12*/.form(action = routes.LoginController.form)/*4.55*/ {_display_(Seq[Any](format.raw/*4.57*/("""
        """),_display_(/*5.10*/helper/*5.16*/.CSRF.formField),format.raw/*5.31*/("""
        """),_display_(/*6.10*/helper/*6.16*/.inputText(loginForm("email"), '_label -> null, 'placeholder -> "Email")),format.raw/*6.88*/("""
        """),_display_(/*7.10*/helper/*7.16*/.inputPassword(loginForm("password"), '_label -> null, 'placeholder -> "Password")),format.raw/*7.98*/("""
        """),format.raw/*8.9*/("""<input type="submit" value="Login">
    """)))}),format.raw/*9.6*/("""


""")))}))
      }
    }
  }

  def render(loginForm:play.data.Form[models.users.User]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((play.data.Form[models.users.User]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 27 17:17:47 BST 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/OneUp/app/views/login.scala.html
                  HASH: 5dde5222ad301b5513bfd2bf9673880b9f5b2bf2
                  MATRIX: 975->1|1116->47|1146->52|1173->71|1212->73|1244->80|1258->86|1309->129|1348->131|1385->142|1399->148|1434->163|1471->174|1485->180|1577->252|1614->263|1628->269|1730->351|1766->361|1837->403
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|41->9
                  -- GENERATED --
              */
          