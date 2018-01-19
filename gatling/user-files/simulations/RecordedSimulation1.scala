
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation1 extends Simulation {

	val httpProtocol = http
		.baseURL("http://ping.chartbeat.net")
		.inferHtmlResources()
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("uk,ru;q=0.8,en-US;q=0.5,en;q=0.3")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:56.0) Gecko/20100101 Firefox/56.0")

	val headers_0 = Map(
		"Accept" -> "*/*",
		"Pragma" -> "no-cache")

	val headers_1 = Map("Content-Type" -> "application/ocsp-request")

	val headers_8 = Map("Upgrade-Insecure-Requests" -> "1")

	val headers_9 = Map("X-Moz" -> "prefetch")

	val headers_11 = Map("Accept" -> "*/*")

	val headers_25 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_27 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_29 = Map(
		"Accept" -> "*/*",
		"Origin" -> "http://www.bbc.com")

    val uri01 = "http://gs.symcd.com"
    val uri02 = "http://www.bbc.com"
    val uri03 = "https://ichef.bbci.co.uk/news/320/cpsprodpb"
    val uri04 = "http://ping.chartbeat.net/ping"
    val uri05 = "http://ocsp2.globalsign.com"
    val uri06 = "http://ocsp.sca1b.amazontrust.com"
    val uri07 = "http://ocsp.godaddy.com"
    val uri08 = "http://optimized-by.rubiconproject.com/a/12198/116384"
    val uri09 = "http://ocsp.digicert.com"
    val uri10 = "http://www.bbc.co.uk/idcta"
    val uri11 = "http://gv.symcd.com"
    val uri12 = "http://ocsp.trustwave.com"
    val uri13 = "http://ocsp.int-x3.letsencrypt.org"
    val uri14 = "http://gn.symcd.com"
    val uri15 = "http://detectportal.firefox.com/success.txt"
    val uri16 = "http://ocsp.comodoca.com"
    val uri17 = "http://beacon-eu-ams3.rubiconproject.com/beacon/d"
    val uri18 = "http://static.bbci.co.uk"
    val uri19 = "http://ocsp.pki.goog/GTSGIAG3"
    val uri20 = "http://rc.symcd.com"
    val uri21 = "http://pagead2.googlesyndication.com/pagead/osd.js"
    val uri22 = "http://b.scorecardresearch.com/b"
    val uri23 = "http://www.googletagservices.com/tag/js/gpt.js"
    val uri24 = "http://static.bbc.co.uk/id/0.37.24"
    val uri25 = "http://edigitalsurvey.com/l.php"
    val uri26 = "http://nav.files.bbci.co.uk/searchbox/1.0.0-133/css/main.css"
    val uri27 = "http://ocsp.starfieldtech.com"
    val uri28 = "http://clients1.google.com/ocsp"

	val scn = scenario("RecordedSimulation1")
		.exec(http("request_0")
			.get(uri15 + "")
			.headers(headers_0))
		.pause(1)
		.exec(http("request_1")
			.post(uri09 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0001_request.txt")))
		.pause(6)
		.exec(http("request_2")
			.post(uri28 + "")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0002_request.txt")))
		.pause(7)
		.exec(http("request_3")
			.post(uri28 + "")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0003_request.txt")))
		.pause(2)
		.exec(http("request_4")
			.post(uri28 + "")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0004_request.txt"))
			.resources(http("request_5")
			.post(uri28 + "")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0005_request.txt")),
            http("request_6")
			.post(uri19 + "")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0006_request.txt")),
            http("request_7")
			.post(uri19 + "")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0007_request.txt"))))
		.pause(34)
		.exec(http("request_8")
			.get(uri02 + "/ukrainian/news")
			.headers(headers_8)
			.resources(http("request_9")
			.get(uri18 + "/news/1.225.02287/stylesheets/services/ukrainian/wide.css")
			.headers(headers_9),
            http("request_10")
			.get(uri18 + "/news/1.225.02287/stylesheets/services/ukrainian/tablet.css")
			.headers(headers_9),
            http("request_11")
			.get(uri18 + "/news/1.225.02287/img/brand/generated/ukrainian-light.svg")
			.headers(headers_11),
            http("request_12")
			.post(uri05 + "/gsorganizationvalsha2g2")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0012_request.txt")),
            http("request_13")
			.get(uri02 + "/wwscripts/flag")
			.headers(headers_11),
            http("request_14")
			.get(uri18 + "/bbcdotcom/1.73.0/script/dist/bbcdotcom.js")
			.headers(headers_11),
            http("request_15")
			.get(uri18 + "/frameworks/barlesque/3.21.31/orb/4/img/orb-sprite.gif")
			.headers(headers_11),
            http("request_16")
			.get(uri18 + "/news/1.225.02287/img/news--icons-sprite.png")
			.headers(headers_11),
            http("request_17")
			.get(uri18 + "/news/1.225.02287/js/compiled/all.js")
			.headers(headers_11),
            http("request_18")
			.get(uri18 + "/news/1.225.02287/img/faux-block-link-transparent-background-1px-1px.png")
			.headers(headers_11),
            http("request_19")
			.get(uri10 + "/translations?callback&locale=uk-UA")
			.headers(headers_11),
            http("request_20")
			.get(uri10 + "/config?callback&locale=uk-UA&ptrt=http://www.bbc.com/ukrainian/news")
			.headers(headers_11),
            http("request_21")
			.get(uri18 + "/news/1.225.02287/js/module/translations/uk.js")
			.headers(headers_11),
            http("request_22")
			.post(uri05 + "/gsorganizationvalsha2g2")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0022_request.txt")),
            http("request_23")
			.get(uri18 + "/news/1.225.02287/js/vendor/jquery-2/jquery.min.js")
			.headers(headers_11),
            http("request_24")
			.get(uri22 + "?c2=19999701&ns_type=view&ns_site=bbc&c1=2&b_vs_un=ws&b_imp_src=ws&b_imp_ver=1.0.0.0&name=ukrainian.news&b_vs_ls=ukrainian&b_synd_partner=bbc%7Crd%7Cgroup4&b_page_type=IDX%7Crecent&c8=BBC+%D0%A3%D0%BA%D1%80%D0%B0%D1%97%D0%BD%D0%B0&b_app_type=web&b_app_name=news%7Cweb&c7=http%3A%2F%2Fwww.bbc.com%2Fukrainian%2Fnews&b_c7=%2Fukrainian%2Fnews&ns_c=utf-8&bbc_site=news-ws-ukrainian&b_code_ver=bbc_v1-0&b_breaking_flag=0&b_syndication_flag=0&ns_alias=4fafd180-d0b9-4859-97db-ae9231a521ab&ns__t=1516353981&b_vp=1834&b_vph=977&b_sr=1920x1080&b_ad_enabled=0&c9=https://www.google.com/")
			.headers(headers_11),
            http("request_25")
			.get(uri18 + "/news/1.225.02287/icons/generated/icons.data.svg.css")
			.headers(headers_25),
            http("request_26")
			.get("/ping?h=ukrainian.bbc.co.uk&p=bbc.co.uk%2Fukrainian%2Fnews&u=BTdF1YEtKTnClNpF_&d=bbc.com&g=50924&g0=Ukrainian%2C%20Ukrainian%20-%20%2C%20Ukrainian%20-%20unknown%2C%20Ukrainian%20-%20%20-%20unknown%2C%20Ukrainian%20-%20unknown&n=0&f=10003&c=0&x=0&m=0&y=3643&o=1834&w=977&j=45&R=1&W=0&I=0&E=0&e=0&r=https%3A%2F%2Fwww.google.com%2F&b=3623&t=DP4DsVD_YUdCC45P1CShBtYBiTjGe&V=97&i=%D0%9D%D0%BE%D0%B2%D0%B8%D0%BD%D0%B8%20-%20BBC%20%D0%A3%D0%BA%D1%80%D0%B0%D1%97%D0%BD%D0%B0&tz=-120&sn=1&EE=0&sv=DlMtji5snpTByg6MZCY_wBfOrkSf&sr=https%3A%2F%2Fwww.google.com%2F&_")
			.headers(headers_11),
            http("request_27")
			.get(uri02 + "/ukrainian/components?alternativeJsLoading=true&batch%5Bmost-popular%5D%5Bid%5D=comp-most-popular&batch%5Bmost-popular%5D%5Bopts%5D%5BassetId%5D=&batch%5Bmost-popular%5D%5Bopts%5D%5Bloading_strategy%5D=include_content")
			.headers(headers_27),
            http("request_28")
			.post(uri05 + "/gsorganizationvalsha2g2")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0028_request.txt")),
            http("request_29")
			.get(uri18 + "/news/1.225.02287/icons/generated/icons.data.svg.css")
			.headers(headers_29),
            http("request_30")
			.post(uri05 + "/gsorganizationvalsha2g2")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0030_request.txt")),
            http("request_31")
			.post(uri05 + "/gsorganizationvalsha2g2")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0031_request.txt")),
            http("request_32")
			.post(uri05 + "/gsorganizationvalsha2g2")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0032_request.txt")),
            http("request_33")
			.post(uri05 + "/gsorganizationvalsha2g2")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0033_request.txt")),
            http("request_34")
			.post(uri05 + "/gsorganizationvalsha2g2")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0034_request.txt"))))
		.pause(2)
		.exec(http("request_35")
			.post(uri09 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0035_request.txt"))
			.resources(http("request_36")
			.post(uri09 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0036_request.txt")),
            http("request_37")
			.get(uri15 + "")
			.headers(headers_0)))
		.pause(11)
		.exec(http("request_38")
			.get("/ping?h=ukrainian.bbc.co.uk&p=bbc.co.uk%2Fukrainian%2Fnews&u=BTdF1YEtKTnClNpF_&d=bbc.com&g=50924&g0=Ukrainian%2C%20Ukrainian%20-%20%2C%20Ukrainian%20-%20unknown%2C%20Ukrainian%20-%20%20-%20unknown%2C%20Ukrainian%20-%20unknown&n=0&f=10003&c=0.25&x=0&m=0&y=3675&o=1834&w=977&j=30&R=1&W=0&I=0&E=10&e=10&r=https%3A%2F%2Fwww.google.com%2F&b=3623&t=DP4DsVD_YUdCC45P1CShBtYBiTjGe&V=97&tz=-120&sn=2&eM=3e00&EE=10&sv=DlMtji5snpTByg6MZCY_wBfOrkSf&sr=https%3A%2F%2Fwww.google.com%2F&_")
			.headers(headers_11)
			.resources(http("request_39")
			.get(uri02 + "/ukrainian/topics/ee8750ed-a7fb-453f-bfca-2aa8b3fb064c")
			.headers(headers_8),
            http("request_40")
			.get(uri18 + "/bbcdotcom/1.73.0/style/dist/bbcdotcom-async.css")
			.headers(headers_25),
            http("request_41")
			.get(uri18 + "/bbcdotcom/1.73.0/script/vendor/edr/edr.min.js")
			.headers(headers_11),
            http("request_42")
			.get(uri23 + "")
			.headers(headers_11),
            http("request_43")
			.get(uri10 + "/config?callback&locale=uk-UA&ptrt=http://www.bbc.com/ukrainian/topics/ee8750ed-a7fb-453f-bfca-2aa8b3fb064c")
			.headers(headers_11),
            http("request_44")
			.post(uri19 + "")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0044_request.txt")),
            http("request_45")
			.post(uri19 + "")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0045_request.txt")),
            http("request_46")
			.post(uri19 + "")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0046_request.txt")),
            http("request_47")
			.get(uri21 + "")
			.headers(headers_11),
            http("request_48")
			.post(uri19 + "")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0048_request.txt")),
            http("request_49")
			.post(uri09 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0049_request.txt")),
            http("request_50")
			.get(uri08 + "/548354-2.js?&cb=0.7443020614469171&tk_st=1&rf=http%3A//www.bbc.com/ukrainian/topics/ee8750ed-a7fb-453f-bfca-2aa8b3fb064c&rp_s=c&p_pos=atf&p_screen_res=1920x1080&ad_slot=116384_2")
			.headers(headers_11),
            http("request_51")
			.get(uri17 + "/2e0a3b26-eddd-49dd-8adb-d2c0c8c806be?accountId=12198&siteId=116384&zoneId=548354&e=6A1E40E384DA563BA46658960C25A870CE93828B27B8272ABBA8EBC78A1E83156B4565861F152EA863025AE92F54AC9FFE5D718BBE08EF1C6E9F547D7C61E137A62E38A83D71C3B8C6A1E3704AB7C939048FDCA4C7453D08B602FF66AE46020F5FA7428FCDBA2F40F2C7B52017AC63766846DD7C8E8F0947AE3BAB5F53943CEE07C29FAAB5DA4AE69B5DE5C4E039B122A3E29D1F8AC4D9B4")
			.headers(headers_11),
            http("request_52")
			.post(uri09 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0052_request.txt")),
            http("request_53")
			.post(uri09 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0053_request.txt")),
            http("request_54")
			.post(uri11 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0054_request.txt")),
            http("request_55")
			.get(uri22 + "?c2=19999701&ns_type=view&ns_site=bbc&c1=2&b_vs_un=ws&b_imp_src=ws&b_imp_ver=1.0.0.0&name=ukrainian.topics.ee8750ed-a7fb-453f-bfca-2aa8b3fb064c&b_vs_ls=ukrainian&b_synd_partner=bbc%7Crd%7Cgroup4&b_page_type=IDX%7Ctopic&c8=BBC+%D0%A3%D0%BA%D1%80%D0%B0%D1%97%D0%BD%D0%B0&b_app_type=web&b_app_name=news%7Cweb&c7=http%3A%2F%2Fwww.bbc.com%2Fukrainian%2Ftopics%2Fee8750ed-a7fb-453f-bfca-2aa8b3fb064c&b_c7=%2Fukrainian%2Ftopics%2Fee8750ed-a7fb-453f-bfca-2aa8b3fb064c&ns_c=utf-8&bbc_site=news-ws-ukrainian&b_code_ver=bbc_v1-0&b_breaking_flag=0&b_syndication_flag=0&ns_alias=4fafd180-d0b9-4859-97db-ae9231a521ab&ns__t=1516354001&b_vp=1834&b_vph=977&b_sr=1920x1080&b_ad_enabled=0&c9=http://www.bbc.com/ukrainian/news")
			.headers(headers_11),
            http("request_56")
			.get(uri25 + "?id=INS-vt29-666188954&v=7215&x=1920&y=1080&d=24&c=null&ck=1&fl=27.0.0&p=%2Fukrainian%2Ftopics%2Fee8750ed-a7fb-453f-bfca-2aa8b3fb064c&ref=http%3A%2F%2Fwww.bbc.com%2Fukrainian%2Fnews&xdm=edr&xdm_o=http%3A%2F%2Fwww.bbc.com&xdm_c=edr0")
			.headers(headers_8),
            http("request_57")
			.get("/ping?h=ukrainian.bbc.co.uk&p=bbc.co.uk%2Fukrainian%2Ftopics%2Fee8750ed-a7fb-453f-bfca-2aa8b3fb064c&u=BTdF1YEtKTnClNpF_&d=bbc.com&g=50924&g0=Ukrainian%2C%20Ukrainian%20-%20%2C%20Ukrainian%20-%20unknown%2C%20Ukrainian%20-%20%20-%20unknown%2C%20Ukrainian%20-%20unknown&n=0&f=10003&c=0&x=0&m=0&y=3722&o=1834&w=977&j=45&R=1&W=0&I=0&E=0&e=0&v=bbc.co.uk%2Fukrainian%2Fnews&K=567::97::DQr-loCRW_jqDAz0RcCDD3P9Dtdr0v::::c::http%3A%2F%2Fwww.bbc.com%2Fukrainian%2Ftopics%2Fee8750ed-a7fb-453f-bfca-2aa8b3fb064c::C1dKxDCds1kQCmXWS0BChPQX68c2m::&b=4093&t=qSom6BCMtFQDWpyWODYIyzGfyS-S&V=97&z=t%3DDP4DsVD_YUdCC45P1CShBtYBiTjGe%26E%3D11%26EE%3D11%26x%3D0%26c%3D0.28%26y%3D3675%26w%3D977&i=%D0%A3%D0%BA%D1%80%D0%B0%D1%97%D0%BD%D0%B0%20-%20BBC%20%D0%A3%D0%BA%D1%80%D0%B0%D1%97%D0%BD%D0%B0&tz=-120&sn=1&EE=0&sv=DlMtji5snpTByg6MZCY_wBfOrkSf&sr=https%3A%2F%2Fwww.google.com%2F&_")
			.headers(headers_11),
            http("request_58")
			.post(uri09 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0058_request.txt")),
            http("request_59")
			.get(uri02 + "/ukrainian/pattern-library-batch?components%5Bcomp-most-popular%5D%5Bguid%5D=ee8750ed-a7fb-453f-bfca-2aa8b3fb064c&components%5Bcomp-most-popular%5D%5Btopic%5D=ee8750ed-a7fb-453f-bfca-2aa8b3fb064c&components%5Bcomp-most-popular%5D%5Bbatch_uses_alt_js%5D=1&components%5Bcomp-most-popular%5D%5Bloading_strategy%5D=batch_load")
			.headers(headers_27),
            http("request_60")
			.post(uri19 + "")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0060_request.txt")),
            http("request_61")
			.post(uri14 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0061_request.txt")),
            http("request_62")
			.post(uri09 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0062_request.txt")),
            http("request_63")
			.post(uri09 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0063_request.txt")),
            http("request_64")
			.post(uri07 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0064_request.txt")),
            http("request_65")
			.post(uri09 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0065_request.txt")),
            http("request_66")
			.post(uri16 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0066_request.txt"))))
		.pause(13)
		.exec(http("request_67")
			.get("/ping?h=ukrainian.bbc.co.uk&p=bbc.co.uk%2Fukrainian%2Ftopics%2Fee8750ed-a7fb-453f-bfca-2aa8b3fb064c&u=BTdF1YEtKTnClNpF_&d=bbc.com&g=50924&g0=Ukrainian%2C%20Ukrainian%20-%20%2C%20Ukrainian%20-%20unknown%2C%20Ukrainian%20-%20%20-%20unknown%2C%20Ukrainian%20-%20unknown&n=0&f=10003&c=0.25&x=2461&m=2461&y=3722&o=1834&w=977&j=30&R=1&W=0&I=0&E=11&e=11&v=bbc.co.uk%2Fukrainian%2Fnews&K=567::97::DQr-loCRW_jqDAz0RcCDD3P9Dtdr0v::::c::http%3A%2F%2Fwww.bbc.com%2Fukrainian%2Ftopics%2Fee8750ed-a7fb-453f-bfca-2aa8b3fb064c::C1dKxDCds1kQCmXWS0BChPQX68c2m::&b=4093&t=qSom6BCMtFQDWpyWODYIyzGfyS-S&V=97&tz=-120&sn=2&eS=000f&eM=180f&EE=11&sv=DlMtji5snpTByg6MZCY_wBfOrkSf&sr=https%3A%2F%2Fwww.google.com%2F&_")
			.headers(headers_11))
		.pause(11)
		.exec(http("request_68")
			.get(uri02 + "/ukrainian/topics/0f469e6a-d4a6-46f2-b727-2bd039cb6b53")
			.headers(headers_8)
			.resources(http("request_69")
			.get(uri10 + "/config?callback&locale=uk-UA&ptrt=http://www.bbc.com/ukrainian/topics/0f469e6a-d4a6-46f2-b727-2bd039cb6b53")
			.headers(headers_11),
            http("request_70")
			.get(uri08 + "/548354-2.js?&cb=0.6808960514560343&tk_st=1&rf=http%3A//www.bbc.com/ukrainian/topics/0f469e6a-d4a6-46f2-b727-2bd039cb6b53&rp_s=c&p_pos=atf&p_screen_res=1920x1080&ad_slot=116384_2")
			.headers(headers_11),
            http("request_71")
			.get(uri17 + "/04b01872-2775-48b0-a812-1b8a2124eee7?accountId=12198&siteId=116384&zoneId=548354&e=6A1E40E384DA563B1F930F4BF3420E20E2642B412AD4FA85A5D26D89EF1CDD6A35405E7A7BB6509AB7E0A76C130077AA347417BE7FFEFA4DFEF4E23F13181CD4F98B2D42F92498ECC87B48E9F784E553172CD28438FCBB6A0A85F1B2498A61AE0771BF6867AFFF02894F1AF2E000983BC070A35DF01D087DB4255D9ABC8E02A901B161855D5543C4ADD84CD4C36B4A0ECDA10306204D320B")
			.headers(headers_11),
            http("request_72")
			.get(uri25 + "?id=INS-vt29-666188954&v=7215&x=1920&y=1080&d=24&c=null&ck=1&fl=27.0.0&p=%2Fukrainian%2Ftopics%2F0f469e6a-d4a6-46f2-b727-2bd039cb6b53&ref=http%3A%2F%2Fwww.bbc.com%2Fukrainian%2Ftopics%2Fee8750ed-a7fb-453f-bfca-2aa8b3fb064c&xdm=edr&xdm_o=http%3A%2F%2Fwww.bbc.com&xdm_c=edr0")
			.headers(headers_8),
            http("request_73")
			.get(uri22 + "?c2=19999701&ns_type=view&ns_site=bbc&c1=2&b_vs_un=ws&b_imp_src=ws&b_imp_ver=1.0.0.0&name=ukrainian.topics.0f469e6a-d4a6-46f2-b727-2bd039cb6b53&b_vs_ls=ukrainian&b_synd_partner=bbc%7Crd%7Cgroup4&b_page_type=IDX%7Ctopic&c8=BBC+%D0%A3%D0%BA%D1%80%D0%B0%D1%97%D0%BD%D0%B0&b_app_type=web&b_app_name=news%7Cweb&c7=http%3A%2F%2Fwww.bbc.com%2Fukrainian%2Ftopics%2F0f469e6a-d4a6-46f2-b727-2bd039cb6b53&b_c7=%2Fukrainian%2Ftopics%2F0f469e6a-d4a6-46f2-b727-2bd039cb6b53&ns_c=utf-8&bbc_site=news-ws-ukrainian&b_code_ver=bbc_v1-0&b_breaking_flag=0&b_syndication_flag=0&ns_alias=4fafd180-d0b9-4859-97db-ae9231a521ab&ns__t=1516354031&b_vp=1834&b_vph=977&b_sr=1920x1080&b_ad_enabled=0&c9=http://www.bbc.com/ukrainian/topics/ee8750ed-a7fb-453f-bfca-2aa8b3fb064c")
			.headers(headers_11),
            http("request_74")
			.get("/ping?h=ukrainian.bbc.co.uk&p=bbc.co.uk%2Fukrainian%2Ftopics%2F0f469e6a-d4a6-46f2-b727-2bd039cb6b53&u=BTdF1YEtKTnClNpF_&d=bbc.com&g=50924&g0=Ukrainian%2C%20Ukrainian%20-%20%2C%20Ukrainian%20-%20unknown%2C%20Ukrainian%20-%20%20-%20unknown%2C%20Ukrainian%20-%20unknown&n=0&f=10003&c=0&x=0&m=0&y=3692&o=1834&w=977&j=45&R=1&W=0&I=0&E=0&e=0&v=bbc.co.uk%2Fukrainian%2Ftopics%2Fee8750ed-a7fb-453f-bfca-2aa8b3fb064c&K=914::97::D8Fk0xBezmXL64pAeBtDpyyDF6Kv6::::c::http%3A%2F%2Fwww.bbc.com%2Fukrainian%2Ftopics%2F0f469e6a-d4a6-46f2-b727-2bd039cb6b53::Dd9R8_BlGj7FBZXLlxCwNyCADGyziu::&b=2443&t=C1LipRDkyRk0zO-23Dof8lRTx1kN&V=97&z=t%3DqSom6BCMtFQDWpyWODYIyzGfyS-S%26E%3D24%26EE%3D24%26x%3D0%26c%3D0.47%26y%3D3722%26w%3D977&i=%D0%9D%D0%B0%D1%83%D0%BA%D0%B0%20-%20BBC%20%D0%A3%D0%BA%D1%80%D0%B0%D1%97%D0%BD%D0%B0&tz=-120&sn=1&EE=0&sv=DlMtji5snpTByg6MZCY_wBfOrkSf&sr=https%3A%2F%2Fwww.google.com%2F&_")
			.headers(headers_11),
            http("request_75")
			.get(uri02 + "/ukrainian/pattern-library-batch?components%5Bcomp-most-popular%5D%5Bguid%5D=0f469e6a-d4a6-46f2-b727-2bd039cb6b53&components%5Bcomp-most-popular%5D%5Btopic%5D=0f469e6a-d4a6-46f2-b727-2bd039cb6b53&components%5Bcomp-most-popular%5D%5Bbatch_uses_alt_js%5D=1&components%5Bcomp-most-popular%5D%5Bloading_strategy%5D=batch_load")
			.headers(headers_27),
            http("request_76")
			.post(uri20 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0076_request.txt")),
            http("request_77")
			.post(uri07 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0077_request.txt")),
            http("request_78")
			.post(uri16 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0078_request.txt")),
            http("request_79")
			.post(uri16 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0079_request.txt")),
            http("request_80")
			.post(uri27 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0080_request.txt")),
            http("request_81")
			.post(uri16 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0081_request.txt")),
            http("request_82")
			.post(uri12 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0082_request.txt")),
            http("request_83")
			.post(uri12 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0083_request.txt")),
            http("request_84")
			.post(uri05 + "/gsalphasha2g2")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0084_request.txt"))))
		.pause(11)
		.exec(http("request_85")
			.get("/ping?h=ukrainian.bbc.co.uk&p=bbc.co.uk%2Fukrainian%2Ftopics%2F0f469e6a-d4a6-46f2-b727-2bd039cb6b53&u=BTdF1YEtKTnClNpF_&d=bbc.com&g=50924&g0=Ukrainian%2C%20Ukrainian%20-%20%2C%20Ukrainian%20-%20unknown%2C%20Ukrainian%20-%20%20-%20unknown%2C%20Ukrainian%20-%20unknown&n=0&f=10003&c=0.22&x=0&m=0&y=3724&o=1834&w=977&j=45&R=1&W=0&I=0&E=10&e=10&v=bbc.co.uk%2Fukrainian%2Ftopics%2Fee8750ed-a7fb-453f-bfca-2aa8b3fb064c&K=914::97::D8Fk0xBezmXL64pAeBtDpyyDF6Kv6::::c::http%3A%2F%2Fwww.bbc.com%2Fukrainian%2Ftopics%2F0f469e6a-d4a6-46f2-b727-2bd039cb6b53::Dd9R8_BlGj7FBZXLlxCwNyCADGyziu::&KK=421::97::BkRtl3DilL4YCbLDk051C_JCVfU0u::::c::http%3A%2F%2Fwww.bbc.com%2Fukrainian::BIpVWgDSKuhqB_xtT6CS3KHwJ4TZU::&b=2443&t=C1LipRDkyRk0zO-23Dof8lRTx1kN&V=97&tz=-120&sn=2&eM=3c03&EE=10&sv=DlMtji5snpTByg6MZCY_wBfOrkSf&sr=https%3A%2F%2Fwww.google.com%2F&_")
			.headers(headers_11)
			.resources(http("request_86")
			.get(uri02 + "/ukrainian")
			.headers(headers_8),
            http("request_87")
			.get(uri10 + "/config?callback&locale=uk-UA&ptrt=http://www.bbc.com/ukrainian")
			.headers(headers_11),
            http("request_88")
			.get(uri08 + "/548354-2.js?&cb=0.6175924929931058&tk_st=1&rf=http%3A//www.bbc.com/ukrainian&rp_s=c&p_pos=atf&p_screen_res=1920x1080&ad_slot=116384_2")
			.headers(headers_11),
            http("request_89")
			.get(uri08 + "/548354-15.js?&cb=0.8589026659985384&tk_st=1&rf=http%3A//www.bbc.com/ukrainian&rp_s=c&p_pos=atf&p_screen_res=1920x1080&ad_slot=116384_15")
			.headers(headers_11),
            http("request_90")
			.get(uri17 + "/b219bbcb-18ee-420c-a3c3-c62db2a864bf?accountId=12198&siteId=116384&zoneId=548354&e=6A1E40E384DA563B30CA191C910CD60D8C1BEF529DBB616783343D139B5DA8EBB417CB7B915B8C56E1FA599450F33D449F0BE1F8337FD75DC97725758C415EDE51D13665F52110B6C6A1E3704AB7C939048FDCA4C7453D08B602FF66AE46020FA85CE12B3751847CF2C7B52017AC63766846DD7C8E8F0947AE3BAB5F53943CEE07C29FAAB5DA4AE69B5DE5C4E039B122A3E29D1F8AC4D9B4")
			.headers(headers_11),
            http("request_91")
			.get(uri17 + "/ecaa5bb9-4ec5-465d-9853-c63c2f979cca?accountId=12198&siteId=116384&zoneId=548354&e=6A1E40E384DA563B9AF33FEA969B142001291B221DE96D768C3D823B1B9C0F822322F956CC4373C8FB4A9C2283ADB3E3B8B520C6696685690B5B8D843B99266D51D13665F52110B6C6A1E3704AB7C939048FDCA4C7453D08B602FF66AE46020F58DF462C7400C477F2C7B52017AC63766846DD7C8E8F0947AE3BAB5F53943CEE07C29FAAB5DA4AE69B5DE5C4E039B122A3E29D1F8AC4D9B4")
			.headers(headers_11),
            http("request_92")
			.get(uri25 + "?id=INS-vt29-666188954&v=7215&x=1920&y=1080&d=24&c=null&ck=1&fl=27.0.0&p=%2Fukrainian&ref=http%3A%2F%2Fwww.bbc.com%2Fukrainian%2Ftopics%2F0f469e6a-d4a6-46f2-b727-2bd039cb6b53&xdm=edr&xdm_o=http%3A%2F%2Fwww.bbc.com&xdm_c=edr0")
			.headers(headers_8),
            http("request_93")
			.post(uri09 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0093_request.txt")),
            http("request_94")
			.get("/ping?h=ukrainian.bbc.co.uk&p=bbc.co.uk%2Fukrainian&u=BTdF1YEtKTnClNpF_&d=bbc.com&g=50924&g0=Ukrainian%2C%20Ukrainian%20-%20%D0%9D%D0%BE%D0%B2%D0%B8%D0%BD%D0%B8%2C%20Ukrainian%20-%20IDX%2C%20Ukrainian%20-%20%D0%9D%D0%BE%D0%B2%D0%B8%D0%BD%D0%B8%20-%20IDX%2C%20Ukrainian%20-%20unknown&n=0&f=10003&c=0&x=0&m=0&y=5269&o=1834&w=977&j=45&R=1&W=0&I=0&E=0&e=0&v=bbc.co.uk%2Fukrainian%2Ftopics%2F0f469e6a-d4a6-46f2-b727-2bd039cb6b53&K=421::97::BkRtl3DilL4YCbLDk051C_JCVfU0u::::c::http%3A%2F%2Fwww.bbc.com%2Fukrainian::BIpVWgDSKuhqB_xtT6CS3KHwJ4TZU::&b=2610&t=BsTk7qN85mkB0rIUnCpegS0D7FhFM&V=97&z=t%3DC1LipRDkyRk0zO-23Dof8lRTx1kN%26E%3D11%26EE%3D11%26x%3D0%26c%3D0.24%26y%3D3724%26w%3D977&i=BBC%20Ukrainian%20-%20%D0%9D%D0%BE%D0%B2%D0%B8%D0%BD%D0%B8%20-%20domestic&tz=-120&sn=1&EE=0&sv=DlMtji5snpTByg6MZCY_wBfOrkSf&sr=https%3A%2F%2Fwww.google.com%2F&_")
			.headers(headers_11),
            http("request_95")
			.post(uri09 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0095_request.txt")),
            http("request_96")
			.get(uri22 + "?c2=19999701&ns_type=view&ns_site=bbc&c1=2&b_vs_un=ws&b_imp_src=ws&b_imp_ver=1.0.0.0&name=ukrainian&b_vs_ls=ukrainian&b_synd_partner=bbc%7Crd%7Cgroup4&b_site_section=102855&b_page_type=IDX%7Cna&c8=%D0%9D%D0%BE%D0%B2%D0%B8%D0%BD%D0%B8+-+BBC+%D0%A3%D0%BA%D1%80%D0%B0%D1%97%D0%BD%D0%B0&b_app_type=web&b_app_name=news%7Cweb&b_article_id=37908011&b_article_date=1478596134&b_article_update=1516347912&b_ad_enabled=1&c7=http%3A%2F%2Fwww.bbc.com%2Fukrainian&b_c7=%2Fukrainian&ns_c=utf-8&bbc_site=news-ws-ukrainian&b_code_ver=bbc_v1-0&b_breaking_flag=0&b_syndication_flag=0&ns_alias=4fafd180-d0b9-4859-97db-ae9231a521ab&ns__t=1516354047&b_vp=1834&b_vph=977&b_sr=1920x1080&c9=http://www.bbc.com/ukrainian/topics/0f469e6a-d4a6-46f2-b727-2bd039cb6b53")
			.headers(headers_11),
            http("request_97")
			.post(uri14 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0097_request.txt")),
            http("request_98")
			.post(uri06 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0098_request.txt")),
            http("request_99")
			.post(uri06 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0099_request.txt")),
            http("request_100")
			.get(uri02 + "/ukrainian/pattern-library-batch?components%5Bcomp-most-popular%5D%5BassetId%5D=37908011&components%5Bcomp-most-popular%5D%5Bbatch_uses_alt_js%5D=1&components%5Bcomp-most-popular%5D%5Bloading_strategy%5D=batch_load&components%5Bcomp-most-popular%5D%5Bdevice_groups%5D%5B0%5D=group3&components%5Bcomp-most-popular%5D%5Bdevice_groups%5D%5B1%5D=group4&components%5Bcomp-follow-us%5D%5BassetId%5D=37908011&components%5Bcomp-follow-us%5D%5Bbatch_uses_alt_js%5D=1&components%5Bcomp-follow-us%5D%5Bloading_strategy%5D=batch_load&components%5Bcomp-follow-us%5D%5B_requestPath%5D=%2Fukrainian")
			.headers(headers_27),
            http("request_101")
			.post(uri07 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0101_request.txt")),
            http("request_102")
			.post(uri16 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0102_request.txt")),
            http("request_103")
			.post(uri07 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0103_request.txt")),
            http("request_104")
			.post(uri01 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0104_request.txt")),
            http("request_105")
			.post(uri07 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0105_request.txt")),
            http("request_106")
			.post(uri07 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0106_request.txt")),
            http("request_107")
			.post(uri07 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0107_request.txt")),
            http("request_108")
			.post(uri16 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0108_request.txt")),
            http("request_109")
			.post(uri07 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0109_request.txt")),
            http("request_110")
			.post(uri09 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0110_request.txt"))))
		.pause(1)
		.exec(http("request_111")
			.post(uri07 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0111_request.txt"))
			.resources(http("request_112")
			.post(uri13 + "/")
			.headers(headers_1)
			.body(RawFileBody("RecordedSimulation1_0112_request.txt"))))
		.pause(12)
		.exec(http("request_113")
			.get("/ping?h=ukrainian.bbc.co.uk&p=bbc.co.uk%2Fukrainian&u=BTdF1YEtKTnClNpF_&d=bbc.com&g=50924&g0=Ukrainian%2C%20Ukrainian%20-%20%D0%9D%D0%BE%D0%B2%D0%B8%D0%BD%D0%B8%2C%20Ukrainian%20-%20IDX%2C%20Ukrainian%20-%20%D0%9D%D0%BE%D0%B2%D0%B8%D0%BD%D0%B8%20-%20IDX%2C%20Ukrainian%20-%20unknown&n=0&f=10003&c=0.25&x=3249&m=3249&y=5269&o=1834&w=977&j=30&R=1&W=0&I=0&E=13&e=13&v=bbc.co.uk%2Fukrainian%2Ftopics%2F0f469e6a-d4a6-46f2-b727-2bd039cb6b53&K=421::97::BkRtl3DilL4YCbLDk051C_JCVfU0u::::c::http%3A%2F%2Fwww.bbc.com%2Fukrainian::BIpVWgDSKuhqB_xtT6CS3KHwJ4TZU::&b=2610&t=BsTk7qN85mkB0rIUnCpegS0D7FhFM&V=97&tz=-120&sn=2&eS=1f98&eM=1f9f&EE=13&sv=DlMtji5snpTByg6MZCY_wBfOrkSf&sr=https%3A%2F%2Fwww.google.com%2F&_")
			.headers(headers_11))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}