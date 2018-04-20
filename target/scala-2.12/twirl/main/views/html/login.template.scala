
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.data.Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: play.data.Form[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Login", user)/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-sm-12 col-md-8 col-lg-4 offset-md-2 offset-lg-4">
            <h1 class="text-center">Sign In</h1>
            """),_display_(/*7.14*/helper/*7.20*/.form(action = routes.LoginController.form, 'class -> "form")/*7.81*/ {_display_(Seq[Any](format.raw/*7.83*/("""
                """),_display_(/*8.18*/helper/*8.24*/.CSRF.formField),format.raw/*8.39*/("""
                """),_display_(/*9.18*/if(flash.containsKey("success"))/*9.50*/ {_display_(Seq[Any](format.raw/*9.52*/("""
                    """),format.raw/*10.21*/("""<div class="alert alert-success">
                        """),_display_(/*11.26*/flash/*11.31*/.get("success")),format.raw/*11.46*/("""
                    """),format.raw/*12.21*/("""</div>
                """)))}),format.raw/*13.18*/("""
                """),_display_(/*14.18*/if(flash.containsKey("error"))/*14.48*/ {_display_(Seq[Any](format.raw/*14.50*/("""
                    """),format.raw/*15.21*/("""<div class="alert alert-warning">
                        """),_display_(/*16.26*/flash/*16.31*/.get("error")),format.raw/*16.44*/("""
                    """),format.raw/*17.21*/("""</div>
                """)))}),format.raw/*18.18*/("""
                """),_display_(/*19.18*/if(loginForm.hasGlobalErrors)/*19.47*/ {_display_(Seq[Any](format.raw/*19.49*/("""
                    """),_display_(/*20.22*/loginForm/*20.31*/.getGlobalError),format.raw/*20.46*/("""
                """)))}),format.raw/*21.18*/("""
                """),format.raw/*22.17*/("""<div class="form-group">
                    """),_display_(/*23.22*/helper/*23.28*/.inputText(loginForm("email"), '_label -> "Email", 'required -> "required", 'class -> "form-control")),format.raw/*23.129*/("""
                """),format.raw/*24.17*/("""</div>
                <div class="form-group">
                    """),_display_(/*26.22*/helper/*26.28*/.inputPassword(loginForm("password"), '_label -> "Password", 'required -> "required", 'class -> "form-control")),format.raw/*26.139*/("""
                """),format.raw/*27.17*/("""</div>
                <div class="row">
                    <div class="col-sm-12 col-md-4 col-lg-4 offset-md-4">
                        <input class="btn btn-primary" type="submit" value="Sign In">
                    </div>
                </div>
            """)))}),format.raw/*33.14*/("""
        """),format.raw/*34.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(loginForm:play.data.Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((play.data.Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 20 16:00:29 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/login.scala.html
                  HASH: 099bffdbc4a85140d6d30bf21fc2fe4cb0fc3c5e
                  MATRIX: 993->1|1158->73|1185->75|1212->94|1251->96|1282->101|1462->255|1476->261|1545->322|1584->324|1628->342|1642->348|1677->363|1721->381|1761->413|1800->415|1849->436|1935->495|1949->500|1985->515|2034->536|2089->560|2134->578|2173->608|2213->610|2262->631|2348->690|2362->695|2396->708|2445->729|2500->753|2545->771|2583->800|2623->802|2672->824|2690->833|2726->848|2775->866|2820->883|2893->929|2908->935|3031->1036|3076->1053|3172->1122|3187->1128|3320->1239|3365->1256|3660->1520|3696->1529
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|38->7|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|42->11|42->11|42->11|43->12|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|53->22|54->23|54->23|54->23|55->24|57->26|57->26|57->26|58->27|64->33|65->34
                  -- GENERATED --
              */
          