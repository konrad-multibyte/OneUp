
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
"""),_display_(/*3.2*/main("OneUP :: " + userProfile.getUsername, user)/*3.51*/ {_display_(Seq[Any](format.raw/*3.53*/("""
    """),_display_(/*4.6*/if(userProfile.getId.equals(user.getId))/*4.46*/ {_display_(Seq[Any](format.raw/*4.48*/("""
        """),format.raw/*5.9*/("""<a href=""""),_display_(/*5.19*/routes/*5.25*/.UserController.update(userProfile.getId)),format.raw/*5.66*/("""">Change Details</a>
    """)))}),format.raw/*6.6*/("""
        """),format.raw/*7.9*/("""<a id="showGames" href="#">Games</a>
        <a id="showPosts" href="#">Posts</a>
        <script>
            $('#showGames').click(function() """),format.raw/*10.46*/("""{"""),format.raw/*10.47*/("""
                """),format.raw/*11.17*/("""$('#posts').hide()
                $('#games').show()
            """),format.raw/*13.13*/("""}"""),format.raw/*13.14*/(""");
            $('#showPosts').click(function() """),format.raw/*14.46*/("""{"""),format.raw/*14.47*/("""
                """),format.raw/*15.17*/("""$('#games').hide()
                $('#posts').show()
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/(""");
        </script>
    <div class="jumbotron">
        <h1>"""),_display_(/*20.14*/userProfile/*20.25*/.getUsername),format.raw/*20.37*/("""</h1>
        <h3>"""),_display_(/*21.14*/userProfile/*21.25*/.getFirstName),format.raw/*21.38*/(""" """),_display_(/*21.40*/userProfile/*21.51*/.getLastName),format.raw/*21.63*/("""</h3>
        <p>"""),_display_(/*22.13*/userProfile/*22.24*/.getBio),format.raw/*22.31*/("""</p>
    </div>
    <div class="row" id="games">
        <div class="col-sm-12 col-md-12 col-lg-12">
                <h3>Games</h3>
                """),_display_(/*27.18*/if(userProfile.getGamesList.isEmpty)/*27.54*/ {_display_(Seq[Any](format.raw/*27.56*/("""
                    """),format.raw/*28.21*/("""<p>No games yet.</p>
                """)))}/*29.19*/else/*29.24*/{_display_(Seq[Any](format.raw/*29.25*/("""
                    """),format.raw/*30.21*/("""<table class="table">
                        <tbody>
                            """),_display_(/*32.30*/for(game <- userProfile.getGamesList) yield /*32.67*/ {_display_(Seq[Any](format.raw/*32.69*/("""
                                """),format.raw/*33.33*/("""<tr>
                                    <td>"""),_display_(/*34.42*/game/*34.46*/.getTitle),format.raw/*34.55*/("""</td>
                                </tr>
                            """)))}),format.raw/*36.30*/("""
                        """),format.raw/*37.25*/("""</tbody>
                    </table>
                """)))}),format.raw/*39.18*/("""
        """),format.raw/*40.9*/("""</div>
    </div>
    <div class="row" id="posts">
        <div class="col-sm-12 col-md-12 col-lg-12">
            <h3>Posts</h3>
                
            <h3>No posts.</h3>
        </div>
    </div>
    <script>
        $('#posts').hide()
    </script>
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
                  DATE: Fri Apr 20 16:00:29 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/profile.scala.html
                  HASH: afddc23a39591c985ca9de3a0f06849538a7ecf5
                  MATRIX: 979->1|1130->59|1157->61|1214->110|1253->112|1284->118|1332->158|1371->160|1406->169|1442->179|1456->185|1517->226|1572->252|1607->261|1779->405|1808->406|1853->423|1947->489|1976->490|2052->538|2081->539|2126->556|2220->622|2249->623|2338->685|2358->696|2391->708|2437->727|2457->738|2491->751|2520->753|2540->764|2573->776|2618->794|2638->805|2666->812|2842->961|2887->997|2927->999|2976->1020|3033->1059|3046->1064|3085->1065|3134->1086|3244->1169|3297->1206|3337->1208|3398->1241|3471->1287|3484->1291|3514->1300|3618->1373|3671->1398|3757->1453|3793->1462
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|36->5|37->6|38->7|41->10|41->10|42->11|44->13|44->13|45->14|45->14|46->15|48->17|48->17|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|63->32|63->32|63->32|64->33|65->34|65->34|65->34|67->36|68->37|70->39|71->40
                  -- GENERATED --
              */
          