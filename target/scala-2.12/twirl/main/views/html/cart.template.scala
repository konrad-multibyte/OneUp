
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

object cart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.Cart,models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cart: models.Cart, user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Cart", user)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<table>
        <thead>
            <tr>
                <th scope="col">Title</th>
                <th scope="col">Price</th>
            </tr>
        </thead>
        <tbody>
            """),_display_(/*12.14*/if(cart.getGames.isEmpty)/*12.39*/ {_display_(Seq[Any](format.raw/*12.41*/("""
                """),format.raw/*13.17*/("""<h1>You got nothin'</h1>
            """)))}/*14.15*/else/*14.20*/{_display_(Seq[Any](format.raw/*14.21*/("""
                """),_display_(/*15.18*/for(game <- cart.getGames) yield /*15.44*/ {_display_(Seq[Any](format.raw/*15.46*/("""
                    """),format.raw/*16.21*/("""<tr>
                        <td>"""),_display_(/*17.30*/game/*17.34*/.getTitle),format.raw/*17.43*/("""</td>
                        <td>
                            <del>"""),_display_(/*19.35*/game/*19.39*/.getPrice),format.raw/*19.48*/("""</del><br>
                            €"""),_display_(/*20.31*/game/*20.35*/.getDiscountedPrice),format.raw/*20.54*/("""<br>
                            <a href=""""),_display_(/*21.39*/routes/*21.45*/.HomeController.removeFromCart(game.getId)),format.raw/*21.87*/("""">Delete</a>
                        </td>
                    </tr>
                """)))}),format.raw/*24.18*/("""
            """)))}),format.raw/*25.14*/("""
        """),format.raw/*26.9*/("""</tbody>
    </table>
    Total:&nbsp;"""),_display_(/*28.18*/cart/*28.22*/.getTotal),format.raw/*28.31*/("""
    """),_display_(/*29.6*/helper/*29.12*/.form(action = routes.HomeController.checkout)/*29.58*/ {_display_(Seq[Any](format.raw/*29.60*/("""
        """),_display_(/*30.10*/if(user.isInstanceOf[models.users.Admin])/*30.51*/ {_display_(Seq[Any](format.raw/*30.53*/("""
            """),format.raw/*31.13*/("""<input type="submit" class="btn btn-success" value="Receive">
        """)))}/*32.11*/else/*32.16*/{_display_(Seq[Any](format.raw/*32.17*/("""
            """),format.raw/*33.13*/("""<input type="submit" class="btn btn-success" value="Purchase">
        """)))}),format.raw/*34.10*/("""
    """)))}),format.raw/*35.6*/("""
""")))}))
      }
    }
  }

  def render(cart:models.Cart,user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(cart,user)

  def f:((models.Cart,models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (cart,user) => apply(cart,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 20 16:00:28 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/cart.scala.html
                  HASH: d9c575076faac4f72c5e748f3f8d9d8aae7bad6e
                  MATRIX: 970->1|1108->46|1135->48|1161->66|1200->68|1231->73|1449->264|1483->289|1523->291|1568->308|1625->347|1638->352|1677->353|1722->371|1764->397|1804->399|1853->420|1914->454|1927->458|1957->467|2053->536|2066->540|2096->549|2164->590|2177->594|2217->613|2287->656|2302->662|2365->704|2482->790|2527->804|2563->813|2629->852|2642->856|2672->865|2704->871|2719->877|2774->923|2814->925|2851->935|2901->976|2941->978|2982->991|3072->1063|3085->1068|3124->1069|3165->1082|3268->1154|3304->1160
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|48->17|48->17|48->17|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|55->24|56->25|57->26|59->28|59->28|59->28|60->29|60->29|60->29|60->29|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|65->34|66->35
                  -- GENERATED --
              */
          