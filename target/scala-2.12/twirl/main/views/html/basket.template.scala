
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import play.api.Play.current
/*4.2*/import models.shopping._
/*5.2*/import models.Game
/*6.2*/import models.users._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("basket", user)/*8.22*/{_display_(Seq[Any](format.raw/*8.23*/("""

"""),format.raw/*10.1*/("""<div class="row">
    """),_display_(/*11.6*/if(flash.containsKey("success"))/*11.38*/{_display_(Seq[Any](format.raw/*11.39*/("""
        """),format.raw/*12.9*/("""<div class="alert alert-success">
            """),_display_(/*13.14*/flash/*13.19*/.get("success")),format.raw/*13.34*/("""
        """),format.raw/*14.9*/("""</div>
    """)))}),format.raw/*15.6*/("""

        """),format.raw/*17.9*/("""<table class="table table-bordered table-hover table-condensed">
            <thread>
                <tr>
                    <th>Name</th>
                    <th>Rating</th>
                    <th>Item Price</th>      
                </tr>
            </thread>
            <tbody>
                """),_display_(/*26.18*/if(user.getBasket() != null)/*26.46*/{_display_(Seq[Any](format.raw/*26.47*/("""
                    """),_display_(/*27.22*/if(user.getBasket != null)/*27.48*/ {_display_(Seq[Any](format.raw/*27.50*/("""
                    """),_display_(/*28.22*/for(i <- user.getBasket().getBasketItems()) yield /*28.65*/{_display_(Seq[Any](format.raw/*28.66*/("""
                        """),format.raw/*29.25*/("""<tr>
                            <td>"""),_display_(/*30.34*/i/*30.35*/.getTitle),format.raw/*30.44*/("""</td>
                            <td>"""),_display_(/*31.34*/i/*31.35*/.getRating),format.raw/*31.45*/("""</td>
                            <td>&euro;"""),_display_(/*32.40*/("%.2f".format(i.getPrice))),format.raw/*32.67*/("""<br>
                                <small class="disabled"><a href=""""),_display_(/*33.67*/routes/*33.73*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*33.105*/("""">Remove</a></small>
                            </td>
                        </tr>
                    """)))}),format.raw/*36.22*/("""
                """)))}),format.raw/*37.18*/("""
                """)))}),format.raw/*38.18*/("""

            """),format.raw/*40.13*/("""</tbody>
        </table>
        <div class="row">
            <div class="col-md-12">
                <p class ="text-right"><strong>Basket Total: &euro; """),_display_(/*44.70*/("%.2f".format(user.getBasket.getBasketTotal))),format.raw/*44.116*/("""</strong></p>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*50.31*/routes/*50.37*/.ShoppingCtrl.emptyBasket()),format.raw/*50.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>
        </div>
        <div class = "row">
            <div class= "col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*58.31*/routes/*58.37*/.HomeController.payment),format.raw/*58.60*/("""" class="btn btn-success btn-sm">
                        <span class="glyphicon glyphicon-euro"></span>Check Out</a>
                </p>
            </div>
        </div>
</div>



<script>

    function confirmDel()"""),format.raw/*69.26*/("""{"""),format.raw/*69.27*/("""
        """),format.raw/*70.9*/("""return confirm('Are you sure?');
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""
"""),format.raw/*72.1*/("""</script>



""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 18 19:59:58 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/basket.scala.html
                  HASH: 83d5405f41e470cf84b0a91cf9bdc9f22386f5e2
                  MATRIX: 960->1|1057->28|1093->58|1125->84|1151->104|1201->26|1228->126|1255->128|1283->148|1321->149|1350->151|1399->174|1440->206|1479->207|1515->216|1589->263|1603->268|1639->283|1675->292|1717->304|1754->314|2085->618|2122->646|2161->647|2210->669|2245->695|2285->697|2334->719|2393->762|2432->763|2485->788|2550->826|2560->827|2590->836|2656->875|2666->876|2697->886|2769->931|2817->958|2915->1029|2930->1035|2984->1067|3121->1173|3170->1191|3219->1209|3261->1223|3445->1380|3513->1426|3718->1604|3733->1610|3781->1637|4145->1974|4160->1980|4204->2003|4450->2221|4479->2222|4515->2231|4579->2268|4607->2269|4635->2270
                  LINES: 28->1|31->3|32->4|33->5|34->6|37->2|38->7|39->8|39->8|39->8|41->10|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|46->15|48->17|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|64->33|64->33|64->33|67->36|68->37|69->38|71->40|75->44|75->44|81->50|81->50|81->50|89->58|89->58|89->58|100->69|100->69|101->70|102->71|102->71|103->72
                  -- GENERATED --
              */
          