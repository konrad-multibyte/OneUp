
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


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Add/Create User", user)/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
    """),_display_(/*4.6*/helper/*4.12*/.form(action = routes.UserController.form)/*4.54*/ {_display_(Seq[Any](format.raw/*4.56*/("""
        """),_display_(/*5.10*/helper/*5.16*/.CSRF.formField),format.raw/*5.31*/("""
        """),_display_(/*6.10*/helper/*6.16*/.inputText(userForm("email"), '_label -> null, 'placeholder -> "Email")),format.raw/*6.87*/("""
        """),_display_(/*7.10*/helper/*7.16*/.inputText(userForm("username"), '_label -> null, 'placeholder -> "Username")),format.raw/*7.93*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(userForm("firstName"), '_label -> null, 'placeholder -> "First Name")),format.raw/*8.96*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(userForm("lastName"), '_label -> null, 'placeholder -> "Last Name")),format.raw/*9.94*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputPassword(userForm("password"), '_label -> null, 'placeholder -> "Password")),format.raw/*10.97*/("""
        """),format.raw/*11.9*/("""<input type="password" name="c" placeholder="Confirm Password">
        <input type="submit" value="Register">
        """),_display_(/*13.10*/helper/*13.16*/.inputText(userForm("id"), '_label -> null, 'hidden -> "hidden")),format.raw/*13.80*/("""
    """)))}),format.raw/*14.6*/("""
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
                  DATE: Wed Apr 18 19:58:07 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/userForm.scala.html
                  HASH: 2a835e9a50ef5dcb44363a0d9097ca8d0983a9f7
                  MATRIX: 996->1|1160->72|1187->74|1224->103|1263->105|1294->111|1308->117|1358->159|1397->161|1433->171|1447->177|1482->192|1518->202|1532->208|1623->279|1659->289|1673->295|1770->372|1806->382|1820->388|1920->468|1956->478|1970->484|2068->562|2105->572|2120->578|2222->659|2258->668|2405->788|2420->794|2505->858|2541->864
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|44->13|44->13|44->13|45->14
                  -- GENERATED --
              */
          