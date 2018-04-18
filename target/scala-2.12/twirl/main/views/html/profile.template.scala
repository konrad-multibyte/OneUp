
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.User,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userProfile: models.users.User, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("User Profile", user)/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
    """),format.raw/*4.5*/("""<table>
        <thead>
            <tr>
                <td scope="col">First Name</td>
                <td scope="col">Last Name</td>
                <td scope="col">Email</td>
                <td scope="col">Username</td>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>"""),_display_(/*15.22*/user/*15.26*/.getFirstName),format.raw/*15.39*/("""</td>
                <td>"""),_display_(/*16.22*/user/*16.26*/.getLastName),format.raw/*16.38*/("""</td>
                <td>"""),_display_(/*17.22*/user/*17.26*/.getEmail),format.raw/*17.35*/("""</td>
                <td>"""),_display_(/*18.22*/user/*18.26*/.getUsername),format.raw/*18.38*/("""</td>
            </tr>
        </tbody>
        """),_display_(/*21.10*/if(userProfile.getId.equals(user.getId))/*21.50*/ {_display_(Seq[Any](format.raw/*21.52*/("""
            """),format.raw/*22.13*/("""<a href=""""),_display_(/*22.23*/routes/*22.29*/.UserController.update(userProfile.getId)),format.raw/*22.70*/("""">Change Details</a>
        """)))}),format.raw/*23.10*/("""
    """),format.raw/*24.5*/("""</table>
""")))}))
      }
    }
  }

  def render(userProfile:models.users.User,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userProfile,user)

  def f:((models.users.User,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userProfile,user) => apply(userProfile,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 18 19:58:07 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/profile.scala.html
                  HASH: 6964b5d3c549460832dd4d9c7713a06bcdc2a0c9
                  MATRIX: 979->1|1130->59|1157->61|1191->87|1230->89|1261->94|1602->408|1615->412|1649->425|1703->452|1716->456|1749->468|1803->495|1816->499|1846->508|1900->535|1913->539|1946->551|2023->601|2072->641|2112->643|2153->656|2190->666|2205->672|2267->713|2328->743|2360->748
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|53->22|54->23|55->24
                  -- GENERATED --
              */
          