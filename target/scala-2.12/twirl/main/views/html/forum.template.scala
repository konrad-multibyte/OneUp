
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

object forum extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.User,models.Game,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, game: models.Game, e: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
    """),_display_(/*3.6*/main("OneUp " + game.getTitle() + " Discussions", user)/*3.61*/ {_display_(Seq[Any](format.raw/*3.63*/("""
        """),format.raw/*4.9*/("""<div class="card">
            <div class="card-header">
                <h5>"""),_display_(/*6.22*/game/*6.26*/.getTitle()),format.raw/*6.37*/("""</h5>
            </div>
            <div class="card-body">
                <div>
                    <img type="button" data-toggle="modal" data-target="#threadModal" height="50" width="50" src=""""),_display_(/*10.116*/routes/*10.122*/.Assets.versioned("images/plus.png")),format.raw/*10.158*/("""">
                </div>
                """),_display_(/*12.18*/if(user != null)/*12.34*/ {_display_(Seq[Any](format.raw/*12.36*/("""
                """),format.raw/*13.17*/("""<div id="threadModal" class="modal fade" role="dialog">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h4 class="modal-title">Post a new thread</h4>
                            </div>
                            <form action=""""),_display_(/*19.44*/routes/*19.50*/.ForumController.createThread(game.getId())),format.raw/*19.93*/("""">
                                <div class="modal-body">
                                    <input type="text" placeholder="Title" class="form-control" name="title">
                                    <br>
                                    <textarea name="content" rows="5" cols="50" value="" placeholder="Describe your post in more detail" class="form-control"></textarea>
                                    <br>
                                </div>
                                <div class="modal-footer">
                                    <button type="submit" class="btn btn-default">Post</button>
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                """)))}),format.raw/*34.18*/("""
                """),_display_(/*35.18*/if(game.getThreads().size() == 0)/*35.51*/ {_display_(Seq[Any](format.raw/*35.53*/("""
                    """),format.raw/*36.21*/("""<h5>There aren't any threads yet.</h5>
                """)))}/*37.19*/else/*37.24*/{_display_(Seq[Any](format.raw/*37.25*/("""
                    """),_display_(/*38.22*/for(thread <- game.getThreads()) yield /*38.54*/ {_display_(Seq[Any](format.raw/*38.56*/("""
                        """),format.raw/*39.25*/("""<div class="card">
                            <div class="card-header">
                                <h5>"""),_display_(/*41.38*/thread/*41.44*/.getTitle()),format.raw/*41.55*/("""</h5>
                                <h5>Poster: """),_display_(/*42.46*/thread/*42.52*/.getPoster().getUsername()),format.raw/*42.78*/("""<h5>
                                <h5>Last reply: """),_display_(/*43.50*/thread/*43.56*/.getLastReply()),format.raw/*43.71*/("""</h5>
                                <form action=""""),_display_(/*44.48*/routes/*44.54*/.HomeController.thread(thread.getId())),format.raw/*44.92*/("""" class="left col-sm-2">
                                    <button type="submit" class="btn btn-success btn-lg">
                                        <span>View</span>
                                    </button>
                                </form>

                            </div>
                        </div>
                    """)))}),format.raw/*52.22*/("""

                """)))}),format.raw/*54.18*/("""
            """)))}),format.raw/*55.14*/("""
"""),format.raw/*56.1*/("""</div>
</div>
"""))
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
                  SOURCE: /media/sf_student/OneUp/app/views/forum.scala.html
                  HASH: 83cd325263745f70b409261e44efa60fcd90fdbd
                  MATRIX: 992->1|1155->71|1186->77|1249->132|1288->134|1323->143|1427->221|1439->225|1470->236|1696->434|1712->440|1770->476|1840->519|1865->535|1905->537|1950->554|2344->921|2359->927|2423->970|3362->1878|3407->1896|3449->1929|3489->1931|3538->1952|3613->2009|3626->2014|3665->2015|3714->2037|3762->2069|3802->2071|3855->2096|3992->2206|4007->2212|4039->2223|4117->2274|4132->2280|4179->2306|4260->2360|4275->2366|4311->2381|4391->2434|4406->2440|4465->2478|4843->2825|4893->2844|4938->2858|4966->2859
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|37->6|37->6|37->6|41->10|41->10|41->10|43->12|43->12|43->12|44->13|50->19|50->19|50->19|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|83->52|85->54|86->55|87->56
                  -- GENERATED --
              */
          