
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

object userForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[play.data.Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Add/Create User", user)/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""
    """),_display_(/*4.6*/helper/*4.12*/.form(action = routes.UserController.customer, 'id -> "register", 'class -> "form")/*4.95*/ {_display_(Seq[Any](format.raw/*4.97*/("""
        """),_display_(/*5.10*/helper/*5.16*/.CSRF.formField),format.raw/*5.31*/("""
        """),format.raw/*6.9*/("""<div class="row">
            <div class="col-sm-12 col-md-6 col-lg-4 offset-md-3 offset-lg-4">
                """),_display_(/*8.18*/if(flash.containsKey("error"))/*8.48*/ {_display_(Seq[Any](format.raw/*8.50*/("""
                    """),format.raw/*9.21*/("""<div class="alert alert-warning">
                        """),_display_(/*10.26*/flash/*10.31*/.get("error")),format.raw/*10.44*/("""
                    """),format.raw/*11.21*/("""</div>
                """)))}),format.raw/*12.18*/("""
                """),_display_(/*13.18*/if(userForm.hasGlobalErrors)/*13.46*/ {_display_(Seq[Any](format.raw/*13.48*/("""
                    """),format.raw/*14.21*/("""<div class="alert alert-warning">
                        """),_display_(/*15.26*/userForm/*15.34*/.getGlobalError),format.raw/*15.49*/("""
                    """),format.raw/*16.21*/("""</div>
                """)))}),format.raw/*17.18*/("""
                    """),_display_(/*18.22*/if(user != null)/*18.38*/ {_display_(Seq[Any](format.raw/*18.40*/("""
                        """),_display_(/*19.26*/if(user.isInstanceOf[models.users.Admin])/*19.67*/ {_display_(Seq[Any](format.raw/*19.69*/("""
                            """),format.raw/*20.29*/("""<div class="row">
                                <div class="col-sm-12 col-md-12 col-lg-12">
                                        <div class="form-group">
                                            <input class="from-control" id="normal" type="radio" name="type" value="normal" checked required>
                                            <label for="normal">Normal</label>
                                            <input id="admin" type="radio" name="type" value="admin" required>
                                            <label for="admin">Admin</label>
                                            <script>
                                                $('#admin').click(function() """),format.raw/*28.78*/("""{"""),format.raw/*28.79*/("""
                                                    """),format.raw/*29.53*/("""$('#register').attr('action', '/user/admin')
                                                """),format.raw/*30.49*/("""}"""),format.raw/*30.50*/(""");
                                                $('#normal').click(function() """),format.raw/*31.79*/("""{"""),format.raw/*31.80*/("""
                                                    """),format.raw/*32.53*/("""$('#register').attr('action', '/user/submit')
                                                """),format.raw/*33.49*/("""}"""),format.raw/*33.50*/(""");
                                            </script>
                                        </div>
                                </div>
                            </div>
                        """)))}),format.raw/*38.26*/("""
                    """)))}),format.raw/*39.22*/("""
                """),format.raw/*40.17*/("""<div class="row">
                    <div class="col-sm-12 col-md-12 col-lg-12">
                        <div class="form-group">
                            """),_display_(/*43.30*/helper/*43.36*/.inputText(userForm("email"), '_label -> "Email", 'class -> "form-control", 'required -> "required")),format.raw/*43.136*/("""
                        """),format.raw/*44.25*/("""</div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-12 col-lg-12">
                        <div class="from-group">
                            """),_display_(/*50.30*/helper/*50.36*/.inputText(userForm("username"), '_label -> "Username", 'class -> "form-control", 'required -> "required")),format.raw/*50.142*/("""
                        """),format.raw/*51.25*/("""</div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-12 col-lg-6">
                        <div class="form-group">
                            """),_display_(/*57.30*/helper/*57.36*/.inputText(userForm("firstName"), '_label -> "First Name", 'class -> "form-control", 'required -> "required")),format.raw/*57.145*/("""
                        """),format.raw/*58.25*/("""</div>
                    </div>
                    <div class="col-sm-12 col-md-12 col-lg-6">
                        <div class="form-group">
                            """),_display_(/*62.30*/helper/*62.36*/.inputText(userForm("lastName"), '_label -> "Last Name", 'class -> "form-control", 'required -> "required")),format.raw/*62.143*/("""
                        """),format.raw/*63.25*/("""</div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-12 col-lg-6">
                        <div class="form-group">
                            """),_display_(/*69.30*/helper/*69.36*/.inputPassword(userForm("password"), '_label -> "Password", 'class -> "form-control", 'required -> "required")),format.raw/*69.146*/("""
                        """),format.raw/*70.25*/("""</div>
                    </div>
                    <div class="col-sm-12 col-md-12 col-lg-6">
                        <div class="form-group">
                            <dl>
                                <dt>
                                    <label for="confirmPassword">Confirm Password</label>
                                </dt>
                                <dd>
                                    <input class="form-control" id="confirmPassword" type="password" name="c" required>
                                </dd>
                            </dl>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-12 col-md-6 col-lg-4 offset-md-3 offset-lg-4">
                        """),_display_(/*87.26*/if(userForm("email").getValue.isPresent)/*87.66*/ {_display_(Seq[Any](format.raw/*87.68*/("""
                            """),format.raw/*88.29*/("""<input class="form-control btn btn-primary" type="submit" value="Update">
                        """)))}/*89.27*/else/*89.32*/{_display_(Seq[Any](format.raw/*89.33*/("""
                            """),format.raw/*90.29*/("""<input class="form-control btn btn-primary" type="submit" value="Register">
                        """)))}),format.raw/*91.26*/("""
                    """),format.raw/*92.21*/("""</div>
                </div>
            </div>
        </div>
        
    """)))}),format.raw/*97.6*/("""   
""")))}))
      }
    }
  }

  def render(userForm:play.data.Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((play.data.Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 20 16:00:29 IST 2018
                  SOURCE: /media/sf_student/OneUp/app/views/userForm.scala.html
                  HASH: 4eeb36cbe5df8d2793e9fd498a303e7f1db118a8
                  MATRIX: 996->1|1160->72|1187->74|1224->103|1263->105|1294->111|1308->117|1399->200|1438->202|1474->212|1488->218|1523->233|1558->242|1697->355|1735->385|1774->387|1822->408|1908->467|1922->472|1956->485|2005->506|2060->530|2105->548|2142->576|2182->578|2231->599|2317->658|2334->666|2370->681|2419->702|2474->726|2523->748|2548->764|2588->766|2641->792|2691->833|2731->835|2788->864|3514->1562|3543->1563|3624->1616|3745->1709|3774->1710|3883->1791|3912->1792|3993->1845|4115->1939|4144->1940|4378->2143|4431->2165|4476->2182|4663->2342|4678->2348|4800->2448|4853->2473|5113->2706|5128->2712|5256->2818|5309->2843|5568->3075|5583->3081|5714->3190|5767->3215|5969->3390|5984->3396|6113->3503|6166->3528|6425->3760|6440->3766|6572->3876|6625->3901|7451->4700|7500->4740|7540->4742|7597->4771|7715->4871|7728->4876|7767->4877|7824->4906|7956->5007|8005->5028|8113->5106
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|59->28|59->28|60->29|61->30|61->30|62->31|62->31|63->32|64->33|64->33|69->38|70->39|71->40|74->43|74->43|74->43|75->44|81->50|81->50|81->50|82->51|88->57|88->57|88->57|89->58|93->62|93->62|93->62|94->63|100->69|100->69|100->69|101->70|118->87|118->87|118->87|119->88|120->89|120->89|120->89|121->90|122->91|123->92|128->97
                  -- GENERATED --
              */
          