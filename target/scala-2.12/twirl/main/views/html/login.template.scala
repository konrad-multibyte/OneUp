
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


Seq[Any](format.raw/*2.1*/("""
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
                  DATE: Wed Apr 18 19:58:06 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/login.scala.html
                  HASH: dbf3b3321f63441fb2db5f2deb70c3645398a509
                  MATRIX: 975->1|1115->48|1142->50|1169->69|1208->71|1239->77|1253->83|1304->126|1343->128|1379->138|1393->144|1428->159|1464->169|1478->175|1570->247|1606->257|1620->263|1722->345|1757->354|1827->395
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9
                  -- GENERATED --
              */
          