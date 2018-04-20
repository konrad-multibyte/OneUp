// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/OneUp/conf/routes
// @DATE:Fri Apr 20 16:00:28 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_1: controllers.HomeController,
  // @LINE:13
  ForumController_0: controllers.ForumController,
  // @LINE:16
  StoreController_5: controllers.StoreController,
  // @LINE:18
  LoginController_4: controllers.LoginController,
  // @LINE:22
  UserController_2: controllers.UserController,
  // @LINE:29
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_1: controllers.HomeController,
    // @LINE:13
    ForumController_0: controllers.ForumController,
    // @LINE:16
    StoreController_5: controllers.StoreController,
    // @LINE:18
    LoginController_4: controllers.LoginController,
    // @LINE:22
    UserController_2: controllers.UserController,
    // @LINE:29
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_1, ForumController_0, StoreController_5, LoginController_4, UserController_2, Assets_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, ForumController_0, StoreController_5, LoginController_4, UserController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.store"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """game/""" + "$" + """id<[^/]+>""", """controllers.HomeController.game(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """store""", """controllers.HomeController.store"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search/""", """controllers.HomeController.search"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """store/cart/add/""" + "$" + """id<[^/]+>""", """controllers.HomeController.addToCart(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """store/cart/rm/""" + "$" + """id<[^/]+>""", """controllers.HomeController.removeFromCart(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """store/checkout""", """controllers.HomeController.checkout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forum/""" + "$" + """id<[^/]+>""", """controllers.HomeController.forum(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """thread/""" + "$" + """id<[^/]+>""", """controllers.HomeController.thread(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forum/create/""" + "$" + """id<[^/]+>""", """controllers.ForumController.createThread(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """thread/create/""" + "$" + """id<[^/]+>""", """controllers.ForumController.createPost(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """store/create""", """controllers.StoreController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin/submit""", """controllers.LoginController.form"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.UserController.profile(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/update/""" + "$" + """id<[^/]+>""", """controllers.UserController.update(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/delete/""" + "$" + """id<[^/]+>""", """controllers.UserController.delete(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/submit""", """controllers.UserController.customer"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/admin""", """controllers.UserController.admin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_HomeController_store0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_store0_invoker = createInvoker(
    HomeController_1.store,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "store",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_HomeController_game1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("game/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_game1_invoker = createInvoker(
    HomeController_1.game(fakeValue[Long]),
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

  // @LINE:4
  private[this] lazy val controllers_HomeController_store2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("store")))
  )
  private[this] lazy val controllers_HomeController_store2_invoker = createInvoker(
    HomeController_1.store,
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

  // @LINE:5
  private[this] lazy val controllers_HomeController_search3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/")))
  )
  private[this] lazy val controllers_HomeController_search3_invoker = createInvoker(
    HomeController_1.search,
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

  // @LINE:6
  private[this] lazy val controllers_HomeController_addToCart4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("store/cart/add/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_addToCart4_invoker = createInvoker(
    HomeController_1.addToCart(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addToCart",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """store/cart/add/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_removeFromCart5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("store/cart/rm/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_removeFromCart5_invoker = createInvoker(
    HomeController_1.removeFromCart(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "removeFromCart",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """store/cart/rm/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_checkout6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("store/checkout")))
  )
  private[this] lazy val controllers_HomeController_checkout6_invoker = createInvoker(
    HomeController_1.checkout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "checkout",
      Nil,
      "POST",
      this.prefix + """store/checkout""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_forum7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forum/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_forum7_invoker = createInvoker(
    HomeController_1.forum(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "forum",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """forum/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_thread8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("thread/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_thread8_invoker = createInvoker(
    HomeController_1.thread(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "thread",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """thread/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ForumController_createThread9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forum/create/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ForumController_createThread9_invoker = createInvoker(
    ForumController_0.createThread(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ForumController",
      "createThread",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """forum/create/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ForumController_createPost10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("thread/create/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ForumController_createPost10_invoker = createInvoker(
    ForumController_0.createPost(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ForumController",
      "createPost",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """thread/create/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_StoreController_create11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("store/create")))
  )
  private[this] lazy val controllers_StoreController_create11_invoker = createInvoker(
    StoreController_5.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StoreController",
      "create",
      Nil,
      "POST",
      this.prefix + """store/create""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_LoginController_login12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_LoginController_login12_invoker = createInvoker(
    LoginController_4.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """signin""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_LoginController_form13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin/submit")))
  )
  private[this] lazy val controllers_LoginController_form13_invoker = createInvoker(
    LoginController_4.form,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "form",
      Nil,
      "POST",
      this.prefix + """signin/submit""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_logout14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signout")))
  )
  private[this] lazy val controllers_LoginController_logout14_invoker = createInvoker(
    LoginController_4.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """signout""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_UserController_create15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_create15_invoker = createInvoker(
    UserController_2.create,
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

  // @LINE:23
  private[this] lazy val controllers_UserController_profile16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_profile16_invoker = createInvoker(
    UserController_2.profile(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "profile",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_UserController_update17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_update17_invoker = createInvoker(
    UserController_2.update(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "update",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """user/update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_UserController_delete18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_delete18_invoker = createInvoker(
    UserController_2.delete(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "delete",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """user/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_UserController_customer19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/submit")))
  )
  private[this] lazy val controllers_UserController_customer19_invoker = createInvoker(
    UserController_2.customer,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "customer",
      Nil,
      "POST",
      this.prefix + """user/submit""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_UserController_admin20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/admin")))
  )
  private[this] lazy val controllers_UserController_admin20_invoker = createInvoker(
    UserController_2.admin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "admin",
      Nil,
      "POST",
      this.prefix + """user/admin""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Assets_versioned21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned21_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_HomeController_store0_route(params@_) =>
      call { 
        controllers_HomeController_store0_invoker.call(HomeController_1.store)
      }
  
    // @LINE:2
    case controllers_HomeController_game1_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_game1_invoker.call(HomeController_1.game(id))
      }
  
    // @LINE:4
    case controllers_HomeController_store2_route(params@_) =>
      call { 
        controllers_HomeController_store2_invoker.call(HomeController_1.store)
      }
  
    // @LINE:5
    case controllers_HomeController_search3_route(params@_) =>
      call { 
        controllers_HomeController_search3_invoker.call(HomeController_1.search)
      }
  
    // @LINE:6
    case controllers_HomeController_addToCart4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_addToCart4_invoker.call(HomeController_1.addToCart(id))
      }
  
    // @LINE:7
    case controllers_HomeController_removeFromCart5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_removeFromCart5_invoker.call(HomeController_1.removeFromCart(id))
      }
  
    // @LINE:8
    case controllers_HomeController_checkout6_route(params@_) =>
      call { 
        controllers_HomeController_checkout6_invoker.call(HomeController_1.checkout)
      }
  
    // @LINE:10
    case controllers_HomeController_forum7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_forum7_invoker.call(HomeController_1.forum(id))
      }
  
    // @LINE:11
    case controllers_HomeController_thread8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_thread8_invoker.call(HomeController_1.thread(id))
      }
  
    // @LINE:13
    case controllers_ForumController_createThread9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ForumController_createThread9_invoker.call(ForumController_0.createThread(id))
      }
  
    // @LINE:14
    case controllers_ForumController_createPost10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ForumController_createPost10_invoker.call(ForumController_0.createPost(id))
      }
  
    // @LINE:16
    case controllers_StoreController_create11_route(params@_) =>
      call { 
        controllers_StoreController_create11_invoker.call(StoreController_5.create)
      }
  
    // @LINE:18
    case controllers_LoginController_login12_route(params@_) =>
      call { 
        controllers_LoginController_login12_invoker.call(LoginController_4.login)
      }
  
    // @LINE:19
    case controllers_LoginController_form13_route(params@_) =>
      call { 
        controllers_LoginController_form13_invoker.call(LoginController_4.form)
      }
  
    // @LINE:20
    case controllers_LoginController_logout14_route(params@_) =>
      call { 
        controllers_LoginController_logout14_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:22
    case controllers_UserController_create15_route(params@_) =>
      call { 
        controllers_UserController_create15_invoker.call(UserController_2.create)
      }
  
    // @LINE:23
    case controllers_UserController_profile16_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UserController_profile16_invoker.call(UserController_2.profile(id))
      }
  
    // @LINE:24
    case controllers_UserController_update17_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UserController_update17_invoker.call(UserController_2.update(id))
      }
  
    // @LINE:25
    case controllers_UserController_delete18_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_UserController_delete18_invoker.call(UserController_2.delete(id))
      }
  
    // @LINE:26
    case controllers_UserController_customer19_route(params@_) =>
      call { 
        controllers_UserController_customer19_invoker.call(UserController_2.customer)
      }
  
    // @LINE:27
    case controllers_UserController_admin20_route(params@_) =>
      call { 
        controllers_UserController_admin20_invoker.call(UserController_2.admin)
      }
  
    // @LINE:29
    case controllers_Assets_versioned21_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_versioned21_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
