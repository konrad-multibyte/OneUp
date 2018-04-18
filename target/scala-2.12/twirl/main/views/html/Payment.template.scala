
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

object Payment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.User,models.Game,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:models.users.User, game:models.Game,environment:play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import play.api.Play.current
/*3.2*/import models.shopping._
/*4.2*/import models.Game
/*5.2*/import models.users._


Seq[Any](format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("payment", user)/*7.23*/{_display_(Seq[Any](format.raw/*7.24*/("""

"""),format.raw/*9.1*/("""<div class="row">
    """),_display_(/*10.6*/if(flash.containsKey("success"))/*10.38*/{_display_(Seq[Any](format.raw/*10.39*/("""
        """),format.raw/*11.9*/("""<div class="alert alert-success">
            """),_display_(/*12.14*/flash/*12.19*/.get("success")),format.raw/*12.34*/("""
        """),format.raw/*13.9*/("""</div>
    """)))}),format.raw/*14.6*/("""

        """),format.raw/*16.9*/("""<table class="table table-bordered table-hover table-condensed">
            <thread>
                <tr>
                    <th>Name</th>
                    <th>Rating</th>
                    <th>Item Price</th>      
                </tr>
            </thread>
            <tbody>
                """),_display_(/*25.18*/if(user.getBasket() != null)/*25.46*/{_display_(Seq[Any](format.raw/*25.47*/("""
                    """),_display_(/*26.22*/if(user.getBasket != null)/*26.48*/ {_display_(Seq[Any](format.raw/*26.50*/("""
                    """),_display_(/*27.22*/for(i <- user.getBasket().getBasketItems()) yield /*27.65*/{_display_(Seq[Any](format.raw/*27.66*/("""
                        """),format.raw/*28.25*/("""<tr>
                            <td>"""),_display_(/*29.34*/i/*29.35*/.getTitle),format.raw/*29.44*/("""</td>
                            <td>"""),_display_(/*30.34*/i/*30.35*/.getRating),format.raw/*30.45*/("""</td>
                            <td>&euro;"""),_display_(/*31.40*/("%.2f".format(i.getPrice))),format.raw/*31.67*/("""<br>
                                <small class="disabled"><a href=""""),_display_(/*32.67*/routes/*32.73*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*32.105*/("""">Remove</a></small>
                            </td>
                        </tr>
                    """)))}),format.raw/*35.22*/("""
                """)))}),format.raw/*36.18*/("""
                """)))}),format.raw/*37.18*/("""

            """),format.raw/*39.13*/("""</tbody>
        </table>
        <div class="row">
            <div class="col-md-12">
                <p class ="text-right"><strong>Basket Total: &euro; """),_display_(/*43.70*/("%.2f".format(user.getBasket.getBasketTotal))),format.raw/*43.116*/("""</strong></p>
            </div>
        </div>
</div>

<form action=""""),_display_(/*48.16*/routes/*48.22*/.HomeController.store),format.raw/*48.43*/("""" method="GET">
  """),_display_(/*49.4*/helper/*49.10*/.CSRF.formField),format.raw/*49.25*/("""
    """),format.raw/*50.5*/("""<script
      src="https://checkout.stripe.com/checkout.js" class="stripe-button"
      data-key="pk_test_glrc8iwTlrSRG5tX3PAZ4KEh"
      data-amount="""),_display_(/*53.20*/user/*53.24*/.getBasket.getBasketTotal),format.raw/*53.49*/("""
      """),format.raw/*54.7*/("""data-name="One Up"
      data-description="Basket Cost"
      data-image="https://stripe.com/img/documentation/checkout/marketplace.png"
      data-locale="auto"
      data-currency="eur">
    </script>
  </form>
""")))}))
      }
    }
  }

  def render(user:models.users.User,game:models.Game,environment:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,game,environment)

  def f:((models.users.User,models.Game,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,game,environment) => apply(user,game,environment)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 18 20:02:09 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/Payment.scala.html
                  HASH: d7977c0529cc8ead5a56c37aaed26a2792f4ead7
                  MATRIX: 994->1|1142->78|1178->108|1210->134|1236->154|1286->176|1313->178|1342->199|1380->200|1408->202|1457->225|1498->257|1537->258|1573->267|1647->314|1661->319|1697->334|1733->343|1775->355|1812->365|2143->669|2180->697|2219->698|2268->720|2303->746|2343->748|2392->770|2451->813|2490->814|2543->839|2608->877|2618->878|2648->887|2714->926|2724->927|2755->937|2827->982|2875->1009|2973->1080|2988->1086|3042->1118|3179->1224|3228->1242|3277->1260|3319->1274|3503->1431|3571->1477|3669->1548|3684->1554|3726->1575|3771->1594|3786->1600|3822->1615|3854->1620|4032->1771|4045->1775|4091->1800|4125->1807
                  LINES: 28->1|31->2|32->3|33->4|34->5|37->6|38->7|38->7|38->7|40->9|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|45->14|47->16|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|63->32|63->32|63->32|66->35|67->36|68->37|70->39|74->43|74->43|79->48|79->48|79->48|80->49|80->49|80->49|81->50|84->53|84->53|84->53|85->54
                  -- GENERATED --
              */
          