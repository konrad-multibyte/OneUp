// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/OneUp/conf/routes
// @DATE:Wed Apr 18 19:58:06 IST 2018

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
  // @LINE:16
  ShoppingCtrl_2: controllers.ShoppingCtrl,
  // @LINE:24
  LoginController_4: controllers.LoginController,
  // @LINE:28
  UserController_1: controllers.UserController,
  // @LINE:35
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:16
    ShoppingCtrl_2: controllers.ShoppingCtrl,
    // @LINE:24
    LoginController_4: controllers.LoginController,
    // @LINE:28
    UserController_1: controllers.UserController,
    // @LINE:35
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_0, ShoppingCtrl_2, LoginController_4, UserController_1, Assets_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, ShoppingCtrl_2, LoginController_4, UserController_1, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """game/""" + "$" + """id<[^/]+>""", """controllers.HomeController.game(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """store""", """controllers.HomeController.store"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search/""", """controllers.HomeController.search"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basket""", """controllers.HomeController.basket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment""", """controllers.HomeController.payment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.form"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.profile(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/update/""" + "$" + """id<[^/]+>""", """controllers.UserController.update(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/delete/""" + "$" + """id<[^/]+>""", """controllers.UserController.delete(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/submit""", """controllers.UserController.form"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:String)"""),
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("game/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_game1_invoker = createInvoker(
    HomeController_0.game(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "game",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """game/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
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
  private[this] lazy val controllers_HomeController_search3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/")))
  )
  private[this] lazy val controllers_HomeController_search3_invoker = createInvoker(
    HomeController_0.search,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "search",
      Nil,
      "GET",
      this.prefix + """search/""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_basket4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basket")))
  )
  private[this] lazy val controllers_HomeController_basket4_invoker = createInvoker(
    HomeController_0.basket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "basket",
      Nil,
      "GET",
      this.prefix + """basket""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_payment5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment")))
  )
  private[this] lazy val controllers_HomeController_payment5_invoker = createInvoker(
    HomeController_0.payment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "payment",
      Nil,
      "GET",
      this.prefix + """payment""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ShoppingCtrl_showBasket6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket6_invoker = createInvoker(
    ShoppingCtrl_2.showBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Nil,
      "GET",
      this.prefix + """showBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ShoppingCtrl_addToBasket7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket7_invoker = createInvoker(
    ShoppingCtrl_2.addToBasket(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ShoppingCtrl_removeOne8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne8_invoker = createInvoker(
    ShoppingCtrl_2.removeOne(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[String]),
      "GET",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket9_invoker = createInvoker(
    ShoppingCtrl_2.emptyBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Nil,
      "GET",
      this.prefix + """emptyBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ShoppingCtrl_viewOrder10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder10_invoker = createInvoker(
    ShoppingCtrl_2.viewOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_LoginController_login11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login11_invoker = createInvoker(
    LoginController_4.login,
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

  // @LINE:25
  private[this] lazy val controllers_LoginController_form12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_form12_invoker = createInvoker(
    LoginController_4.form,
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

  // @LINE:26
  private[this] lazy val controllers_LoginController_logout13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout13_invoker = createInvoker(
    LoginController_4.logout,
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

  // @LINE:28
  private[this] lazy val controllers_UserController_create14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_create14_invoker = createInvoker(
    UserController_1.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_UserController_profile15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_profile15_invoker = createInvoker(
    UserController_1.profile(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "profile",
      Seq(classOf[String]),
      "GET",
      this.prefix + """user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_UserController_update16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_update16_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_UserController_delete17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_delete17_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_UserController_form18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/submit")))
  )
  private[this] lazy val controllers_UserController_form18_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_Assets_versioned19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned19_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[String]),
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
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_game1_invoker.call(HomeController_0.game(id))
      }
  
    // @LINE:9
    case controllers_HomeController_store2_route(params@_) =>
      call { 
        controllers_HomeController_store2_invoker.call(HomeController_0.store)
      }
  
    // @LINE:10
    case controllers_HomeController_search3_route(params@_) =>
      call { 
        controllers_HomeController_search3_invoker.call(HomeController_0.search)
      }
  
    // @LINE:12
    case controllers_HomeController_basket4_route(params@_) =>
      call { 
        controllers_HomeController_basket4_invoker.call(HomeController_0.basket)
      }
  
    // @LINE:14
    case controllers_HomeController_payment5_route(params@_) =>
      call { 
        controllers_HomeController_payment5_invoker.call(HomeController_0.payment)
      }
  
    // @LINE:16
    case controllers_ShoppingCtrl_showBasket6_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_showBasket6_invoker.call(ShoppingCtrl_2.showBasket())
      }
  
    // @LINE:17
    case controllers_ShoppingCtrl_addToBasket7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket7_invoker.call(ShoppingCtrl_2.addToBasket(id))
      }
  
    // @LINE:18
    case controllers_ShoppingCtrl_removeOne8_route(params@_) =>
      call(params.fromPath[String]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeOne8_invoker.call(ShoppingCtrl_2.removeOne(itemId))
      }
  
    // @LINE:19
    case controllers_ShoppingCtrl_emptyBasket9_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket9_invoker.call(ShoppingCtrl_2.emptyBasket())
      }
  
    // @LINE:20
    case controllers_ShoppingCtrl_viewOrder10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder10_invoker.call(ShoppingCtrl_2.viewOrder(id))
      }
  
    // @LINE:24
    case controllers_LoginController_login11_route(params@_) =>
      call { 
        controllers_LoginController_login11_invoker.call(LoginController_4.login)
      }
  
    // @LINE:25
    case controllers_LoginController_form12_route(params@_) =>
      call { 
        controllers_LoginController_form12_invoker.call(LoginController_4.form)
      }
  
    // @LINE:26
    case controllers_LoginController_logout13_route(params@_) =>
      call { 
        controllers_LoginController_logout13_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:28
    case controllers_UserController_create14_route(params@_) =>
      call { 
        controllers_UserController_create14_invoker.call(UserController_1.create)
      }
  
    // @LINE:29
    case controllers_UserController_profile15_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_profile15_invoker.call(UserController_1.profile(id))
      }
  
    // @LINE:30
    case controllers_UserController_update16_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_update16_invoker.call(UserController_1.update(id))
      }
  
    // @LINE:31
    case controllers_UserController_delete17_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_delete17_invoker.call(UserController_1.delete(id))
      }
  
    // @LINE:32
    case controllers_UserController_form18_route(params@_) =>
      call { 
        controllers_UserController_form18_invoker.call(UserController_1.form)
      }
  
    // @LINE:35
    case controllers_Assets_versioned19_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_versioned19_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
