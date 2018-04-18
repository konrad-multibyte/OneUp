
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

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""

        """),format.raw/*14.9*/("""<title>"""),_display_(/*14.17*/title),format.raw/*14.22*/("""</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*18.55*/routes/*18.61*/.Assets.versioned("stylesheets/main.css")),format.raw/*18.102*/("""">
    
    
<body>

    <div class="container">
        """),_display_(/*24.10*/content),format.raw/*24.17*/("""
    """),format.raw/*25.5*/("""</div>
    <script src=""""),_display_(/*26.19*/routes/*26.25*/.Assets.versioned("javascripts/main.js")),format.raw/*26.65*/(""""></script>
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
                  DATE: Wed Apr 18 19:58:07 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/main.scala.html
                  HASH: 329efed6542dc05e55ccbbfa9d7339eda9b6b2af
                  MATRIX: 1224->260|1373->316|1400->317|1480->422|1517->432|1552->440|1578->445|2263->1103|2278->1109|2341->1150|2426->1208|2454->1215|2486->1220|2538->1245|2553->1251|2614->1291
                  LINES: 33->7|38->8|39->9|42->12|44->14|44->14|44->14|48->18|48->18|48->18|54->24|54->24|55->25|56->26|56->26|56->26
                  -- GENERATED --
              */
          