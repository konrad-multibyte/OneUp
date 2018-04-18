
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
"""),_display_(/*3.2*/main("OneUp: " + game.getTitle, user)/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""

    """),format.raw/*5.5*/("""<div class="card">
        <div class="card-header">
            <h1>"""),_display_(/*7.18*/game/*7.22*/.getTitle),format.raw/*7.31*/("""</h1>
        </div>
        <div class="card-body">
            """),_display_(/*10.14*/for(media <- game.getMedia) yield /*10.41*/ {_display_(Seq[Any](format.raw/*10.43*/("""
                """),_display_(/*11.18*/if(media.getMime.contains("image"))/*11.53*/ {_display_(Seq[Any](format.raw/*11.55*/("""
                    """),_display_(/*12.22*/if(e.resource("public/" + media.getLink).isDefined)/*12.73*/ {_display_(Seq[Any](format.raw/*12.75*/("""
                        """),format.raw/*13.25*/("""<img src=""""),_display_(/*13.36*/routes/*13.42*/.Assets.versioned(media.getLink())),format.raw/*13.76*/(""""/>
                    """)))}),format.raw/*14.22*/("""
                """)))}),format.raw/*15.18*/("""
                """),_display_(/*16.18*/if(media.getMime.equals("video/youtube"))/*16.59*/ {_display_(Seq[Any](format.raw/*16.61*/("""
                    """),format.raw/*17.21*/("""<iframe width="560" height="315" src=""""),_display_(/*17.60*/media/*17.65*/.getLink),format.raw/*17.73*/("""" frameborder="0" allow="encrypted-media" allowfullscreen></iframe>
                """)))}),format.raw/*18.18*/("""
            """)))}),format.raw/*19.14*/("""
            """),format.raw/*20.13*/("""<h4>"""),_display_(/*20.18*/game/*20.22*/.getDescription),format.raw/*20.37*/("""</h4>
        </div>
    </div>

    <h6>"""),_display_(/*24.10*/game/*24.14*/.getPrice),format.raw/*24.23*/("""</h6>
    <h6>"""),_display_(/*25.10*/game/*25.14*/.getRating),format.raw/*25.24*/("""</h6>
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
                  DATE: Wed Apr 18 19:58:06 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/game.scala.html
                  HASH: c65d3cebd9fae4d1d21090a96e1041dc8def1703
                  MATRIX: 991->1|1154->71|1181->73|1226->110|1265->112|1297->118|1393->188|1405->192|1434->201|1527->267|1570->294|1610->296|1655->314|1699->349|1739->351|1788->373|1848->424|1888->426|1941->451|1979->462|1994->468|2049->502|2105->527|2154->545|2199->563|2249->604|2289->606|2338->627|2404->666|2418->671|2447->679|2563->764|2608->778|2649->791|2681->796|2694->800|2730->815|2799->857|2812->861|2842->870|2884->885|2897->889|2928->899
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|38->7|38->7|38->7|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|49->18|50->19|51->20|51->20|51->20|51->20|55->24|55->24|55->24|56->25|56->25|56->25
                  -- GENERATED --
              */
          