// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/micha/Documents/GitHub/OneUp/conf/routes
// @DATE:Tue Mar 27 18:32:21 BST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def game(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "game")
    }
  
    // @LINE:8
    def store(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "store")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:11
    def form(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:10
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:14
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def delete(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:14
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/create")
    }
  
    // @LINE:17
    def form(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/submit")
    }
  
    // @LINE:15
    def update(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }


}
