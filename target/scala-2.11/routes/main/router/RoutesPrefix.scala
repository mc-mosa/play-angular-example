
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mosa/Development/play/test/conf/routes
// @DATE:Thu Aug 18 17:15:12 EET 2016


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
