// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/micha/Documents/GitHub/OneUp/conf/routes
// @DATE:Tue Mar 27 18:32:21 BST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:10
  LoginController_3: controllers.LoginController,
  // @LINE:14
  UserController_1: controllers.UserController,
  // @LINE:20
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:10
    LoginController_3: controllers.LoginController,
    // @LINE:14
    UserController_1: controllers.UserController,
    // @LINE:20
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_0, LoginController_3, UserController_1, Assets_2, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, LoginController_3, UserController_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """game""", """controllers.HomeController.game"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """store""", """controllers.HomeController.store"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.form"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/create""", """controllers.UserController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/update/""" + "$" + """id<[^/]+>""", """controllers.UserController.update(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/delete/""" + "$" + """id<[^/]+>""", """controllers.UserController.delete(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/submit""", """controllers.UserController.form"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_game1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("game")))
  )
  private[this] lazy val controllers_HomeController_game1_invoker = createInvoker(
    HomeController_0.game,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "game",
      Nil,
      "GET",
      this.prefix + """game""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_store2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("store")))
  )
  private[this] lazy val controllers_HomeController_store2_invoker = createInvoker(
    HomeController_0.store,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "store",
      Nil,
      "GET",
      this.prefix + """store""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_LoginController_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login3_invoker = createInvoker(
    LoginController_3.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_LoginController_form4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_form4_invoker = createInvoker(
    LoginController_3.form,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "form",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_LoginController_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout5_invoker = createInvoker(
    LoginController_3.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UserController_create6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/create")))
  )
  private[this] lazy val controllers_UserController_create6_invoker = createInvoker(
    UserController_1.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "GET",
      this.prefix + """user/create""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_update7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_update7_invoker = createInvoker(
    UserController_1.update(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "update",
      Seq(classOf[String]),
      "GET",
      this.prefix + """user/update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_delete8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_delete8_invoker = createInvoker(
    UserController_1.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "delete",
      Seq(classOf[String]),
      "GET",
      this.prefix + """user/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_form9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/submit")))
  )
  private[this] lazy val controllers_UserController_form9_invoker = createInvoker(
    UserController_1.form,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "form",
      Nil,
      "POST",
      this.prefix + """user/submit""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_game1_route(params@_) =>
      call { 
        controllers_HomeController_game1_invoker.call(HomeController_0.game)
      }
  
    // @LINE:8
    case controllers_HomeController_store2_route(params@_) =>
      call { 
        controllers_HomeController_store2_invoker.call(HomeController_0.store)
      }
  
    // @LINE:10
    case controllers_LoginController_login3_route(params@_) =>
      call { 
        controllers_LoginController_login3_invoker.call(LoginController_3.login)
      }
  
    // @LINE:11
    case controllers_LoginController_form4_route(params@_) =>
      call { 
        controllers_LoginController_form4_invoker.call(LoginController_3.form)
      }
  
    // @LINE:12
    case controllers_LoginController_logout5_route(params@_) =>
      call { 
        controllers_LoginController_logout5_invoker.call(LoginController_3.logout)
      }
  
    // @LINE:14
    case controllers_UserController_create6_route(params@_) =>
      call { 
        controllers_UserController_create6_invoker.call(UserController_1.create)
      }
  
    // @LINE:15
    case controllers_UserController_update7_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_update7_invoker.call(UserController_1.update(id))
      }
  
    // @LINE:16
    case controllers_UserController_delete8_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_delete8_invoker.call(UserController_1.delete(id))
      }
  
    // @LINE:17
    case controllers_UserController_form9_route(params@_) =>
      call { 
        controllers_UserController_form9_invoker.call(UserController_1.form)
      }
  
    // @LINE:20
    case controllers_Assets_versioned10_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
