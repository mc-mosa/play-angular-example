
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object angular_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class angular extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en" ng-app="angular">
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*7.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/("""">
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.8/angular.min.js"></script>
        <script type="text/javascript">
        angular.module('angular', [])
        .controller('DataController', ['$scope', '$http',
            function($scope, $http) """),format.raw/*13.37*/("""{"""),format.raw/*13.38*/("""
                """),format.raw/*14.17*/("""$scope.get = function() """),format.raw/*14.41*/("""{"""),format.raw/*14.42*/("""
                    """),format.raw/*15.21*/("""$http.get('/rest/get').then(function(data) """),format.raw/*15.64*/("""{"""),format.raw/*15.65*/("""
                        """),format.raw/*16.25*/("""$scope.data = data;
                    """),format.raw/*17.21*/("""}"""),format.raw/*17.22*/(""");
                """),format.raw/*18.17*/("""}"""),format.raw/*18.18*/(""";
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/("""]);
        </script>
    </head>
    <body>
        <div ng-controller="DataController">
            <button ng-click="get()">Click Me</button>
            <h1>"""),format.raw/*25.17*/("""{"""),format.raw/*25.18*/("""{"""),format.raw/*25.19*/("""data.data"""),format.raw/*25.28*/("""}"""),format.raw/*25.29*/("""}"""),format.raw/*25.30*/("""</h1>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object angular extends angular_Scope0.angular
              /*
                  -- GENERATED --
                  DATE: Thu Aug 18 17:24:54 EET 2016
                  SOURCE: /home/mosa/Development/play/test/app/views/angular.scala.html
                  HASH: a2e97d9636b06d8e87f84749e4ee71d135800ff9
                  MATRIX: 531->1|641->16|669->18|772->95|797->100|885->162|899->168|961->209|1048->270|1062->276|1122->315|1426->591|1455->592|1500->609|1552->633|1581->634|1630->655|1701->698|1730->699|1783->724|1851->764|1880->765|1927->784|1956->785|1998->799|2027->800|2216->961|2245->962|2274->963|2311->972|2340->973|2369->974
                  LINES: 20->1|25->1|27->3|30->6|30->6|31->7|31->7|31->7|32->8|32->8|32->8|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|40->16|41->17|41->17|42->18|42->18|43->19|43->19|49->25|49->25|49->25|49->25|49->25|49->25
                  -- GENERATED --
              */
          