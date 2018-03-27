
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

object userForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.data.Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.72*/("""

"""),_display_(/*3.2*/main("Add/Create User", user)/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
    """),_display_(/*4.6*/helper/*4.12*/.form(action = routes.UserController.form)/*4.54*/ {_display_(Seq[Any](format.raw/*4.56*/("""
        """),_display_(/*5.10*/helper/*5.16*/.CSRF.formField),format.raw/*5.31*/("""
        """),_display_(/*6.10*/helper/*6.16*/.inputText(userForm("email"), '_label -> null, 'placeholder -> "Email")),format.raw/*6.87*/("""
        """),_display_(/*7.10*/helper/*7.16*/.inputText(userForm("username"), '_label -> null, 'placeholder -> "Username")),format.raw/*7.93*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputPassword(userForm("password"), '_label -> null, 'placeholder -> "Password")),format.raw/*8.97*/("""
        """),format.raw/*9.9*/("""<input type="password" name="c" placeholder="Confirm Password">
        <input type="submit" value="Register">
        """),_display_(/*11.10*/helper/*11.16*/.inputText(userForm("id"), '_label -> null, 'hidden -> "hidden")),format.raw/*11.80*/("""
    """)))}),format.raw/*12.6*/("""
""")))}))
      }
    }
  }

  def render(userForm:play.data.Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((play.data.Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 27 17:17:48 BST 2018
                  SOURCE: C:/Users/micha/Documents/GitHub/OneUp/app/views/userForm.scala.html
                  HASH: 2766e7e32927a924c964c10bd194eae632788080
                  MATRIX: 996->1|1161->71|1191->76|1228->105|1267->107|1299->114|1313->120|1363->162|1402->164|1439->175|1453->181|1488->196|1525->207|1539->213|1630->284|1667->295|1681->301|1778->378|1815->389|1829->395|1930->476|1966->486|2115->608|2130->614|2215->678|2252->685
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|43->11|43->11|43->11|44->12
                  -- GENERATED --
              */
          