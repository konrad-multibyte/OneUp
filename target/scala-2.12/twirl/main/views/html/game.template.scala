
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

object game extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.User,models.Game,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, game: models.Game, e: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main(game.getTitle + " on OneUp", user)/*3.41*/ {_display_(Seq[Any](format.raw/*3.43*/("""
    """),format.raw/*4.5*/("""<div class="card">
        <div class="card-header">
            <h1>"""),_display_(/*6.18*/game/*6.22*/.getTitle),format.raw/*6.31*/("""</h1>
        </div>
        <div class="card-body">
            """),_display_(/*9.14*/for(media <- game.getMedia) yield /*9.41*/ {_display_(Seq[Any](format.raw/*9.43*/("""
                """),_display_(/*10.18*/if(media.getMime.contains("image"))/*10.53*/ {_display_(Seq[Any](format.raw/*10.55*/("""
                    """),_display_(/*11.22*/if(e.resource("public/" + media.getLink).isDefined)/*11.73*/ {_display_(Seq[Any](format.raw/*11.75*/("""
                        """),format.raw/*12.25*/("""<img src=""""),_display_(/*12.36*/routes/*12.42*/.Assets.versioned(media.getLink)),format.raw/*12.74*/(""""/>
                    """)))}),format.raw/*13.22*/("""
                """)))}),format.raw/*14.18*/("""
                """),_display_(/*15.18*/if(media.getMime.equals("video/youtube"))/*15.59*/ {_display_(Seq[Any](format.raw/*15.61*/("""
                    """),format.raw/*16.21*/("""<iframe width="560" height="315" src=""""),_display_(/*16.60*/media/*16.65*/.getLink),format.raw/*16.73*/("""" frameborder="0" allow="encrypted-media" allowfullscreen></iframe>
                """)))}),format.raw/*17.18*/("""
            """)))}),format.raw/*18.14*/("""
            """),format.raw/*19.13*/("""<h4>"""),_display_(/*19.18*/game/*19.22*/.getDescription),format.raw/*19.37*/("""</h4>
        </div>
    </div>

    <h6>"""),_display_(/*23.10*/game/*23.14*/.getPrice),format.raw/*23.23*/("""</h6>
    <h6>"""),_display_(/*24.10*/game/*24.14*/.getRating),format.raw/*24.24*/("""</h6>
    """),_display_(/*25.6*/if(user != null)/*25.22*/ {_display_(Seq[Any](format.raw/*25.24*/("""
        """),_display_(/*26.10*/if(!user.getCart.getGames.contains(game))/*26.51*/ {_display_(Seq[Any](format.raw/*26.53*/("""
            """),format.raw/*27.13*/("""<a class="btn btn-success" href=""""),_display_(/*27.47*/routes/*27.53*/.HomeController.addToCart(game.getId)),format.raw/*27.90*/("""">Add To Cart</a>
        """)))}/*28.11*/else/*28.16*/{_display_(Seq[Any](format.raw/*28.17*/("""
            """),format.raw/*29.13*/("""<a class="btn btn-success disabled" href=""""),_display_(/*29.56*/routes/*29.62*/.HomeController.addToCart(game.getId)),format.raw/*29.99*/("""">Add To Cart</a>
        """)))}),format.raw/*30.10*/("""
    """)))}),format.raw/*31.6*/("""
""")))}))
      }
    }
  }

  def render(user:models.users.User,game:models.Game,e:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,game,e)

  def f:((models.users.User,models.Game,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,game,e) => apply(user,game,e)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 20 16:00:28 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/game.scala.html
                  HASH: 96aebde9fbca11c070a0abab350c405d2b131036
                  MATRIX: 991->1|1154->71|1181->73|1228->112|1267->114|1298->119|1394->189|1406->193|1435->202|1527->268|1569->295|1608->297|1653->315|1697->350|1737->352|1786->374|1846->425|1886->427|1939->452|1977->463|1992->469|2045->501|2101->526|2150->544|2195->562|2245->603|2285->605|2334->626|2400->665|2414->670|2443->678|2559->763|2604->777|2645->790|2677->795|2690->799|2726->814|2795->856|2808->860|2838->869|2880->884|2893->888|2924->898|2961->909|2986->925|3026->927|3063->937|3113->978|3153->980|3194->993|3255->1027|3270->1033|3328->1070|3374->1098|3387->1103|3426->1104|3467->1117|3537->1160|3552->1166|3610->1203|3668->1230|3704->1236
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|37->6|37->6|37->6|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|47->16|47->16|47->16|47->16|48->17|49->18|50->19|50->19|50->19|50->19|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|60->29|61->30|62->31
                  -- GENERATED --
              */
          