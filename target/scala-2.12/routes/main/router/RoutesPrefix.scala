// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/micha/Documents/GitHub/OneUp/conf/routes
// @DATE:Tue Mar 27 18:32:21 BST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
