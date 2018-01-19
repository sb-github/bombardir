import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._


class Test01 extends Simulation {

	val httpConf = http
	.baseURL("http://services.groupkt.com") 
	.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") 
	.acceptEncodingHeader("gzip, deflate") 
	.acceptLanguageHeader("en-US,en;q=0.5") 
	.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0") 

	val scn = scenario("Scenario Name") 
	.exec(http("request_1") 
	.get("/country/get/all")) 	
	.pause(7) 
	.exec(http("request_2") 
	.get("/country/get/iso2code/IN")) 
	.pause(10) .exec(http("request_3") 
	.get("/country/get/iso3code/IND")) 
	.pause(5) 
	.exec(http("request_4") 
	.get("/country/search?text=un")) 

setUp(scn.inject(atOnceUsers(100)).protocols(httpConf))
}
