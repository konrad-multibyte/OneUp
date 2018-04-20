
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

object store extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.users.User,java.util.List[models.Game],play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, games: java.util.List[models.Game], e: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome to OneUP", user)/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""
    """),format.raw/*4.5*/("""<div class="container">
        <div class="row">
        """),_display_(/*6.10*/if(user.isInstanceOf[models.users.Admin])/*6.51*/ {_display_(Seq[Any](format.raw/*6.53*/("""
            """),format.raw/*7.13*/("""<div>
                <img type="button" data-toggle="modal" data-target="#threadModal" height="50" width="50" src=""""),_display_(/*8.112*/routes/*8.118*/.Assets.versioned("images/plus.png")),format.raw/*8.154*/("""">
            </div>
            <div id="threadModal" class="modal fade" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title">Add a new game</h4>
                        </div>
                        <form action=""""),_display_(/*16.40*/routes/*16.46*/.StoreController.create()),format.raw/*16.71*/("""" method="post">
                            """),_display_(/*17.30*/helper/*17.36*/.CSRF.formField),format.raw/*17.51*/("""
                            """),format.raw/*18.29*/("""<div class="modal-body">
                                <input type="text" name="title" placeholder="Title" class="form-control">
                                <textarea name="content" rows="5" cols="50" placeholder="Description" class="form-control"></textarea>
                                <input type="number" name="price" placeholder="Price" class="form-control" step="0.01" min="0">
                                <input type="number" name="discount" placeholder="Discount (optional)" class="form-control" step="0.1" min="0" max="100">
                                <h5>Make Visible to Public?</h5>
                                <input type="checkbox" name="isVisible" value="true" class="form-control">
                                <br>
                            </div>
                            <div class="modal-footer">
                                <button type="submit" class="btn btn-default">Create</button>
                                <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        """)))}),format.raw/*35.10*/("""
        """),format.raw/*36.9*/("""</div>
        <div class="row">
            <div class="col-sm-3">
                <div class="card filter">
                    <div class="card-header">
                        <h4>Filter</h4>
                    </div>
                    <div class="card-body">
                        <form action=""""),_display_(/*44.40*/routes/*44.46*/.HomeController.search),format.raw/*44.68*/("""" method="get">
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
            """),_display_(/*71.14*/for(game <- games) yield /*71.32*/ {_display_(Seq[Any](format.raw/*71.34*/("""
                """),_display_(/*72.18*/if(game.getIsVisible() || user.isInstanceOf[models.users.Admin])/*72.82*/ {_display_(Seq[Any](format.raw/*72.84*/("""
                    """),format.raw/*73.21*/("""<div class="card game">
                        <div class="card-header">
                            <h3>"""),_display_(/*75.34*/game/*75.38*/.getTitle),format.raw/*75.47*/("""</h3>
                        </div>
                        <div class="card-body">
                            <div class="left col-sm-2">
                            """),_display_(/*79.30*/for(media <- game.getMedia) yield /*79.57*/ {_display_(Seq[Any](format.raw/*79.59*/("""
                                """),_display_(/*80.34*/if(media.getMime.contains("cover"))/*80.69*/ {_display_(Seq[Any](format.raw/*80.71*/("""
                                    """),_display_(/*81.38*/if(e.resource("public/" + media.getLink).isDefined)/*81.89*/ {_display_(Seq[Any](format.raw/*81.91*/("""
                                        """),format.raw/*82.41*/("""<img height=120 width=120 src=""""),_display_(/*82.73*/routes/*82.79*/.Assets.versioned(media.getLink)),format.raw/*82.111*/(""""/>
                                    """)))}),format.raw/*83.38*/("""
                                """)))}),format.raw/*84.34*/("""
                            """)))}),format.raw/*85.30*/("""
                            """),format.raw/*86.29*/("""</div>
                            <div class="right col-sm-9">
                                <div class="description">
                                    <h5>"""),_display_(/*89.42*/game/*89.46*/.getDescription),format.raw/*89.61*/("""</h5>
                                </div>
                                <div class="price card">
                                    <div class="card-header card-small centered">
                                    """),_display_(/*93.38*/if(game.getDiscount > 0.0)/*93.64*/ {_display_(Seq[Any](format.raw/*93.66*/("""
                                        """),format.raw/*94.41*/("""<h5>Price</h5>
                                    </div>
                                    <div class="card-body card-small centered">
                                        <h5 class=""><del>"""),_display_(/*97.60*/game/*97.64*/.getPrice),format.raw/*97.73*/("""</del> - <span class="badge badge-success">"""),_display_(/*97.117*/{game.getDiscount * 100}),format.raw/*97.141*/("""%</span>
                                            <br>
                                            €"""),_display_(/*99.47*/game/*99.51*/.getDiscountedPrice),format.raw/*99.70*/("""</h5>
                                    </div>
                                    """)))}/*101.39*/else/*101.44*/{_display_(Seq[Any](format.raw/*101.45*/("""
                                        """),format.raw/*102.41*/("""<h5>Price</h5>
                                    </div>
                                <div class="card-body card-small centered">
                                    <h5>€"""),_display_(/*105.43*/game/*105.47*/.getPrice),format.raw/*105.56*/("""</h5>
                                </div>
                                """)))}),format.raw/*107.34*/("""

                            """),format.raw/*109.29*/("""</div>
                            <div class="rating card">
                                <div class="card-header card-small centered">
                                    <h5>Rating</h5>
                                </div>
                                <div class="card-body card-small centered">
                                    <h5>"""),_display_(/*115.42*/game/*115.46*/.getRating),format.raw/*115.56*/("""</h5>
                                </div>
                            </div>
                        </div>
                    </div>

                <div class="card-header">
                    <form action=""""),_display_(/*122.36*/routes/*122.42*/.HomeController.forum(game.getId())),format.raw/*122.77*/("""" class="left col-sm-2">
                        <button type="submit" class="btn btn-success btn-lg">
                            <span>Forum</span>
                        </button>
                    </form>
                    <form action=""""),_display_(/*127.36*/routes/*127.42*/.HomeController.game(new Long(game.getId))),format.raw/*127.84*/("""" class="right col-sm-2">
                        <button type="submit" class="btn btn-success btn-lg">
                            <span>View</span>
                        </button>
                    </form>
                </div>
                </div>
                """)))}),format.raw/*134.18*/("""

        """)))}),format.raw/*136.10*/("""
        """),format.raw/*137.9*/("""</div>
    </div>
    </div>
""")))}))
      }
    }
  }

  def render(user:models.users.User,games:java.util.List[models.Game],e:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,games,e)

  def f:((models.users.User,java.util.List[models.Game],play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,games,e) => apply(user,games,e)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 20 16:00:29 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/store.scala.html
                  HASH: 798246b6961a086a1d3044e871014ed790b1a01f
                  MATRIX: 1008->1|1188->88|1215->90|1253->120|1292->122|1323->127|1408->186|1457->227|1496->229|1536->242|1680->359|1695->365|1752->401|2153->775|2168->781|2214->806|2287->852|2302->858|2338->873|2395->902|3627->2103|3663->2112|3996->2418|4011->2424|4054->2446|5586->3951|5620->3969|5660->3971|5705->3989|5778->4053|5818->4055|5867->4076|6001->4183|6014->4187|6044->4196|6241->4366|6284->4393|6324->4395|6385->4429|6429->4464|6469->4466|6534->4504|6594->4555|6634->4557|6703->4598|6762->4630|6777->4636|6831->4668|6903->4709|6968->4743|7029->4773|7086->4802|7276->4965|7289->4969|7325->4984|7573->5205|7608->5231|7648->5233|7717->5274|7941->5471|7954->5475|7984->5484|8056->5528|8102->5552|8233->5656|8246->5660|8286->5679|8392->5766|8406->5771|8446->5772|8516->5813|8720->5989|8734->5993|8765->6002|8875->6080|8934->6110|9309->6457|9323->6461|9355->6471|9599->6687|9615->6693|9672->6728|9947->6975|9963->6981|10027->7023|10334->7298|10377->7309|10414->7318
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|47->16|47->16|47->16|48->17|48->17|48->17|49->18|66->35|67->36|75->44|75->44|75->44|102->71|102->71|102->71|103->72|103->72|103->72|104->73|106->75|106->75|106->75|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|113->82|114->83|115->84|116->85|117->86|120->89|120->89|120->89|124->93|124->93|124->93|125->94|128->97|128->97|128->97|128->97|128->97|130->99|130->99|130->99|132->101|132->101|132->101|133->102|136->105|136->105|136->105|138->107|140->109|146->115|146->115|146->115|153->122|153->122|153->122|158->127|158->127|158->127|165->134|167->136|168->137
                  -- GENERATED --
              */
          