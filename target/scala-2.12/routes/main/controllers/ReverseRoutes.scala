// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/OneUp/conf/routes
// @DATE:Fri Apr 20 16:00:28 IST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package controllers {

  // @LINE:29
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def versioned(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:16
  class ReverseStoreController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "store/create")
    }
  
  }

  // @LINE:22
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:27
    def admin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/admin")
    }
  
    // @LINE:24
    def update(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:23
    def profile(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:25
    def delete(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:26
    def customer(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/submit")
    }
  
  }

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:2
    def game(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "game/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:7
    def removeFromCart(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "store/cart/rm/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:1
    def store(): Call = {
    
      () match {
      
        // @LINE:1
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
    // @LINE:11
    def thread(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "thread/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def addToCart(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "store/cart/add/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:5
    def search(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/")
    }
  
    // @LINE:8
    def checkout(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "store/checkout")
    }
  
    // @LINE:10
    def forum(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "forum/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:18
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signout")
    }
  
    // @LINE:19
    def form(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "signin/submit")
    }
  
    // @LINE:18
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signin")
    }
  
  }

  // @LINE:13
  class ReverseForumController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def createThread(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "forum/create/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:14
    def createPost(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "thread/create/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }


}
