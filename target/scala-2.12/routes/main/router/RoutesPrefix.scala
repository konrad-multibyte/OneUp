// @GENERATOR:play-routes-compiler
// @SOURCE:/media/sf_student/OneUp/conf/routes
// @DATE:Wed Apr 18 19:58:06 IST 2018


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
