
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

object thread extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.User,models.Thread,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, thread: models.Thread, e: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
    """),_display_(/*3.6*/main("OneUp - " + thread.getTitle(), user)/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
        """),format.raw/*4.9*/("""<div class="card">
            <div class="card-header">
                <h5>"""),_display_(/*6.22*/thread/*6.28*/.getTitle()),format.raw/*6.39*/("""</h5>
            </div>

            """),_display_(/*9.14*/if(user != null)/*9.30*/ {_display_(Seq[Any](format.raw/*9.32*/("""
                """),format.raw/*10.17*/("""<div>
                    <img type="button" data-toggle="modal" data-target="#threadModal" height="50" width="50" src=""""),_display_(/*11.116*/routes/*11.122*/.Assets.versioned("images/plus.png")),format.raw/*11.158*/("""">
                </div>
                <div id="threadModal" class="modal fade" role="dialog">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h4 class="modal-title">Post</h4>
                            </div>
                            <form action=""""),_display_(/*19.44*/routes/*19.50*/.ForumController.createPost(thread.getId())),format.raw/*19.93*/("""">
                                <div class="modal-body">
                                    <textarea name="content" rows="5", cols="50" value="" placeholder="Describe your post in more detail" class="form-control"></textarea>
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
            """)))}),format.raw/*32.14*/("""
            """),_display_(/*33.14*/for(post <- thread.getPosts) yield /*33.42*/ {_display_(Seq[Any](format.raw/*33.44*/("""
                """),format.raw/*34.17*/("""<div class="card-body">
                    <h5>"""),_display_(/*35.26*/post/*35.30*/.getPoster().getUsername()),format.raw/*35.56*/("""</h5>
                    <h5>"""),_display_(/*36.26*/post/*36.30*/.getText),format.raw/*36.38*/("""</h5>
                    <h5>Posted """),_display_(/*37.33*/post/*37.37*/.getTimePosted),format.raw/*37.51*/("""</h5>
                </div>
            """)))}),format.raw/*39.14*/("""

        """),format.raw/*41.9*/("""</div>

    """)))}))
      }
    }
  }

  def render(user:models.users.User,thread:models.Thread,e:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,thread,e)

  def f:((models.users.User,models.Thread,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,thread,e) => apply(user,thread,e)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 20 16:00:29 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/thread.scala.html
                  HASH: 8d0f1a41e2e59e1199994219346ae0d1b142aa35
                  MATRIX: 995->1|1162->75|1193->81|1243->123|1282->125|1317->134|1421->212|1435->218|1466->229|1531->268|1555->284|1594->286|1639->303|1788->424|1804->430|1862->466|2285->862|2300->868|2364->911|3149->1665|3190->1679|3234->1707|3274->1709|3319->1726|3395->1775|3408->1779|3455->1805|3513->1836|3526->1840|3555->1848|3620->1886|3633->1890|3668->1904|3741->1946|3778->1956
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|37->6|37->6|37->6|40->9|40->9|40->9|41->10|42->11|42->11|42->11|50->19|50->19|50->19|63->32|64->33|64->33|64->33|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|70->39|72->41
                  -- GENERATED --
              */
          