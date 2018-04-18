
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

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.Game


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Order Confirmation", customer)/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""


    """),format.raw/*11.5*/("""<div class="row">
    
        <div class="col-md-12">
            """),_display_(/*14.14*/if(flash.containsKey("success"))/*14.46*/ {_display_(Seq[Any](format.raw/*14.48*/("""
                  """),format.raw/*15.19*/("""<div class="alert alert-success">
                      """),_display_(/*16.24*/flash/*16.29*/.get("success")),format.raw/*16.44*/("""
                  """),format.raw/*17.19*/("""</div>
            """)))}),format.raw/*18.14*/(""" 
            """),format.raw/*19.13*/("""<table class="table table-bordered table-hover table-condensed">
                <thead>
                        <tr>
                                <th>Name</th>
                                <th>Description</th>
                                <th>Item Price</th>
                                <th>Rating</th>
                                <th>dec.</th>
                                
                            </tr>
                        </thread>
                        <tbody>
                            """),_display_(/*31.30*/if(order != null)/*31.47*/{_display_(Seq[Any](format.raw/*31.48*/("""
            
                                """),_display_(/*33.34*/for(i <- order.getGame) yield /*33.57*/{_display_(Seq[Any](format.raw/*33.58*/("""
                                    """),format.raw/*34.37*/("""<tr>
                                        <td>"""),_display_(/*35.46*/i/*35.47*/.getGame.getTitle),format.raw/*35.64*/("""</td>
                                        <td>"""),_display_(/*36.46*/i/*36.47*/.getGame.getDescription),format.raw/*36.70*/("""</td>
                                        <td>&euro;"""),_display_(/*37.52*/("%.2f".format(i.getPrice))),format.raw/*37.79*/("""</td>
                                        <td>"""),_display_(/*38.46*/i/*38.47*/.getGame.getRating),format.raw/*38.65*/("""</td>
                                        <td><a href=""""),_display_(/*39.55*/routes/*39.61*/.ShoppingCtrl.removeOne(String.valueOf(i.getId))),format.raw/*39.109*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                                    </tr>
            
                                """)))}),format.raw/*42.34*/("""
                            """)))}),format.raw/*43.30*/("""
                            
            """),format.raw/*45.13*/("""</tbody>
        </table>
                            <div class="row">
                                <div class="col-md-12">
                                    <p class="text-right"><strong>Order Total: &euro; """),_display_(/*49.88*/("%.2f".format(order.getOrderTotal))),format.raw/*49.124*/("""</strong></p>
                                </div>  
                            </div>
                            </div>
                    </div>

                """)))}),format.raw/*55.18*/("""


"""))
      }
    }
  }

  def render(customer:models.users.Customer,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(customer,order)

  def f:((models.users.Customer,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (customer,order) => apply(customer,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 18 19:58:07 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/orderConfirmed.scala.html
                  HASH: 16293b6ba7ccaaed679b3eed0fb2f788b090b566
                  MATRIX: 998->1|1138->72|1174->102|1206->128|1253->69|1281->147|1308->149|1352->185|1391->187|1425->194|1520->262|1561->294|1601->296|1648->315|1732->372|1746->377|1782->392|1829->411|1880->431|1922->445|2474->970|2500->987|2539->988|2613->1035|2652->1058|2691->1059|2756->1096|2833->1146|2843->1147|2881->1164|2959->1215|2969->1216|3013->1239|3097->1296|3145->1323|3223->1374|3233->1375|3272->1393|3359->1453|3374->1459|3444->1507|3627->1659|3688->1689|3758->1731|4000->1946|4058->1982|4259->2152
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|39->8|39->8|39->8|42->11|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|50->19|62->31|62->31|62->31|64->33|64->33|64->33|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|73->42|74->43|76->45|80->49|80->49|86->55
                  -- GENERATED --
              */
          