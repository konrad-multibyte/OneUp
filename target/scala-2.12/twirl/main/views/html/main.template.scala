
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">

    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.versioned("stylesheets/main.css")),format.raw/*11.102*/("""">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container-fluid">
            <a class="navbar-brand" href="#">OneUP</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
            aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href=""""),_display_(/*24.52*/routes/*24.58*/.HomeController.store),format.raw/*24.79*/("""">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Features</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Pricing</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Dropdown link
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                <!-- TODO: Add Game Genres -->
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </li>
                </ul>
            </div>
                <ul class="nav navbar-nav navbar-right">
                    <li class="nav-item">
                        <form class="form-inline" action=""""),_display_(/*47.60*/routes/*47.66*/.HomeController.search),format.raw/*47.88*/("""" method="GET">
                            <input class="form-control mr-1" name="query" type="search" placeholder="Search" aria-label="Search">
                            <button class="btn btn-outline-primary ml-1 mr-2" type="submit">Search</button>
                        </form>
                    </li>
                    """),_display_(/*52.22*/if(user != null)/*52.38*/ {_display_(Seq[Any](format.raw/*52.40*/("""
                        """),format.raw/*53.25*/("""<li class="nav-item dropdown ml-2 mr-2">
                            <a class="nav-link dropdown-toggle" href="" id="navbadDropMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            """),_display_(/*55.30*/user/*55.34*/.getEmail),format.raw/*55.43*/("""
                            """),format.raw/*56.29*/("""</a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                <a class="dropdown-item" href=""""),_display_(/*58.65*/routes/*58.71*/.UserController.profile(user.getId)),format.raw/*58.106*/("""">Profile</a>
                                <a class="dropdown-item" href="">Games <span class="text-left">"""),_display_(/*59.97*/user/*59.101*/.getGamesList.size),format.raw/*59.119*/("""</span></a>
                                <a class="dropdown-item" href=""""),_display_(/*60.65*/routes/*60.71*/.LoginController.logout()),format.raw/*60.96*/("""">Sign out</a>
                            </div>
                        </li>
                    """)))}/*63.23*/else/*63.28*/{_display_(Seq[Any](format.raw/*63.29*/("""
                        """),format.raw/*64.25*/("""<li class="nav-item ml-2">
                            <a class="btn btn-outline-success" href=""""),_display_(/*65.71*/routes/*65.77*/.LoginController.login()),format.raw/*65.101*/("""">Sign in</a>
                        </li>
                    """)))}),format.raw/*67.22*/("""
                """),format.raw/*68.17*/("""</ul>
            </div>
        </nav>
        <div class="container">
                """),_display_(/*72.18*/content),format.raw/*72.25*/("""
        """),format.raw/*73.9*/("""</div>    
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 20 16:00:29 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/main.scala.html
                  HASH: cd0045b576c349600bae6f5bd6f75477d49c91b2
                  MATRIX: 970->1|1119->57|1146->58|1233->119|1258->124|1943->782|1958->788|2021->829|2747->1528|2762->1534|2804->1555|4073->2797|4088->2803|4131->2825|4491->3158|4516->3174|4556->3176|4609->3201|4869->3434|4882->3438|4912->3447|4969->3476|5162->3642|5177->3648|5234->3683|5371->3793|5385->3797|5425->3815|5528->3891|5543->3897|5589->3922|5709->4024|5722->4029|5761->4030|5814->4055|5938->4152|5953->4158|5999->4182|6095->4247|6140->4264|6256->4353|6284->4360|6320->4369
                  LINES: 28->1|33->2|34->3|38->7|38->7|42->11|42->11|42->11|55->24|55->24|55->24|78->47|78->47|78->47|83->52|83->52|83->52|84->53|86->55|86->55|86->55|87->56|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|94->63|94->63|94->63|95->64|96->65|96->65|96->65|98->67|99->68|103->72|103->72|104->73
                  -- GENERATED --
              */
          