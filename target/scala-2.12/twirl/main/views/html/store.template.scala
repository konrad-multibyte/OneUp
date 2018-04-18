
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

object store extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.User,List[models.Game],play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, games: List[models.Game], e: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("OneUp : Store", user)/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    """),format.raw/*4.5*/("""<div class="container">
        <div class="row">
            <div class="col-sm-3">
                <div class="card filter">
                    <div class="card-header">
                        <h4>Filter</h4>
                    </div>
                    <div class="card-body">
                        <form action=""""),_display_(/*12.40*/routes/*12.46*/.HomeController.search),format.raw/*12.68*/("""" method="get">
                            <button type="submit" class="btn btn-success btn-sm filter-content">Search</button>
                            <input type="text" name="query" placeholder="Search..." class="filter-content">
                            <div class="card">
                                <div class="card-header">
                                    <h5>Price Under</h5>
                                </div>
                                <div class="card-body">
                                    <input class="slider" type="range" name="pRange" min="1" max="120" value="120" onchange="priceRange.value = value">
                                    <br>€<output id="priceRange">120</output>
                                </div>
                            </div>
                            <div class="card">
                                <div class="card-header">
                                    <h5>Rating Over</h5>
                                </div>
                                <div class="card-body">
                                    <input class="slider" type="range" name="rRange" min="0" max="100" value="0" onchange="ratingRange.value = value">
                                    <br><output id="ratingRange">0</output>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="col-sm-9">
            """),_display_(/*38.14*/for(game <- games) yield /*38.32*/ {_display_(Seq[Any](format.raw/*38.34*/("""
                """),format.raw/*39.17*/("""<div class="card game">
                    <div class="card-header">
                        <h3>"""),_display_(/*41.30*/game/*41.34*/.getTitle()),format.raw/*41.45*/("""</h3>
                    </div>
                    <div class="card-body">
                        <div class="left col-sm-2">
                        """),_display_(/*45.26*/for(media <- game.getMedia()) yield /*45.55*/ {_display_(Seq[Any](format.raw/*45.57*/("""
                            """),_display_(/*46.30*/if(media.getMime().contains("cover"))/*46.67*/ {_display_(Seq[Any](format.raw/*46.69*/("""
                                """),_display_(/*47.34*/if(e.resource("public/" + media.getLink).isDefined)/*47.85*/ {_display_(Seq[Any](format.raw/*47.87*/("""
                                    """),format.raw/*48.37*/("""<img height=120 width=120 src=""""),_display_(/*48.69*/routes/*48.75*/.Assets.versioned(media.getLink())),format.raw/*48.109*/(""""/>
                                """)))}),format.raw/*49.34*/("""
                            """)))}),format.raw/*50.30*/("""
                        """)))}),format.raw/*51.26*/("""
                        """),format.raw/*52.25*/("""</div>
                        <div class="right col-sm-9">
                            <div class="description">
                                <h5>"""),_display_(/*55.38*/game/*55.42*/.getDescription()),format.raw/*55.59*/("""</h5>
                            </div>
                            <div class="price card">
                                <div class="card-header card-small centered">
                                """),_display_(/*59.34*/if(game.getDiscount > 0.0)/*59.60*/ {_display_(Seq[Any](format.raw/*59.62*/("""
                                    """),format.raw/*60.37*/("""<h5>Price</h5>
                                </div>
                                <div class="card-body card-small centered">
                                    <h5 class=""><del>"""),_display_(/*63.56*/game/*63.60*/.getPrice()),format.raw/*63.71*/("""</del> - <span class="badge badge-success">"""),_display_(/*63.115*/{game.getDiscount * 100}),format.raw/*63.139*/("""%</span><br>
                                    €"""),_display_(/*64.39*/{scala.math.BigDecimal(game.getPrice - (game.getPrice * game.getDiscount)).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble}),format.raw/*64.168*/("""</h5>
                                </div>
                                    """)))}/*66.39*/else/*66.44*/{_display_(Seq[Any](format.raw/*66.45*/("""
                                    """),format.raw/*67.37*/("""<h5>Price</h5>
                                    </div>
                            <div class="card-body card-small centered">
                                <h5>€"""),_display_(/*70.39*/game/*70.43*/.getPrice),format.raw/*70.52*/("""</h5>
                            </div>
                                """)))}),format.raw/*72.34*/("""

                            """),format.raw/*74.29*/("""</div>
                            <div class="rating card">
                                <div class="card-header card-small centered">
                                    <h5>Rating</h5>
                                </div>
                                <div class="card-body card-small centered">
                                    <h5>"""),_display_(/*80.42*/game/*80.46*/.getRating()),format.raw/*80.58*/("""</h5>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="card-header">
                        <form action="" class="left col-sm-2">
                            <button type="submit" class="btn btn-success btn-lg">
                                <span>Forum</span>
                            </button>
                        </form>
                        <form action=""""),_display_(/*91.40*/routes/*91.46*/.HomeController.game(new Long(game.getId()))),format.raw/*91.90*/("""" class="right col-sm-2">
                            <button type="submit" class="btn btn-success btn-lg">
                                <span>View</span>
                            </button>
                        </form>
                    </div>
                </div>
            """)))}),format.raw/*98.14*/("""
            """),format.raw/*99.13*/("""</div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(user:models.users.User,games:List[models.Game],e:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,games,e)

  def f:((models.users.User,List[models.Game],play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,games,e) => apply(user,games,e)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 18 19:58:07 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/store.scala.html
                  HASH: 3a579ab3223d1f645670775581794831afa401e6
                  MATRIX: 998->1|1168->78|1195->80|1230->107|1269->109|1300->114|1650->437|1665->443|1708->465|3239->1969|3273->1987|3313->1989|3358->2006|3484->2105|3497->2109|3529->2120|3710->2274|3755->2303|3795->2305|3852->2335|3898->2372|3938->2374|3999->2408|4059->2459|4099->2461|4164->2498|4223->2530|4238->2536|4294->2570|4362->2607|4423->2637|4480->2663|4533->2688|4711->2839|4724->2843|4762->2860|4994->3065|5029->3091|5069->3093|5134->3130|5346->3315|5359->3319|5391->3330|5463->3374|5509->3398|5587->3449|5738->3578|5839->3661|5852->3666|5891->3667|5956->3704|6151->3872|6164->3876|6194->3885|6299->3959|6357->3989|6731->4336|6744->4340|6777->4352|7293->4841|7308->4847|7373->4891|7695->5182|7736->5195
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|43->12|43->12|43->12|69->38|69->38|69->38|70->39|72->41|72->41|72->41|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|79->48|80->49|81->50|82->51|83->52|86->55|86->55|86->55|90->59|90->59|90->59|91->60|94->63|94->63|94->63|94->63|94->63|95->64|95->64|97->66|97->66|97->66|98->67|101->70|101->70|101->70|103->72|105->74|111->80|111->80|111->80|122->91|122->91|122->91|129->98|130->99
                  -- GENERATED --
              */
          