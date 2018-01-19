
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://ichef.bbci.co.uk")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("uk,ru;q=0.8,en-US;q=0.5,en;q=0.3")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:56.0) Gecko/20100101 Firefox/56.0")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Content-Type" -> "application/ocsp-request")

	val headers_6 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_7 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_8 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"X-Moz" -> "prefetch")

	val headers_32 = Map("Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")

    val uri01 = "http://ad.crwdcntrl.net/5/c=10815/pe=y/var=ccauds"
    val uri02 = "http://beacon-eu2.rubiconproject.com/beacon/d"
    val uri03 = "http://me-cdn.effectivemeasure.net/em.js"
    val uri04 = "http://tpc.googlesyndication.com/safeframe/1-0-14/html/container.html"
    val uri05 = "http://www.bbc.com"
    val uri06 = "http://ssc.api.bbc.com"
    val uri07 = "http://ichef.bbci.co.uk/images/ic/192x108"
    val uri08 = "http://ping.chartbeat.net/ping"
    val uri09 = "http://ocsp2.globalsign.com/gsorganizationvalsha2g2"
    val uri10 = "http://ads.rubiconproject.com/ad/12198.js"
    val uri11 = "http://ocsp.sca1b.amazontrust.com"
    val uri12 = "http://idsync.rlcdn.com/382416.gif"
    val uri13 = "http://tags.bluekai.com/site/5907"
    val uri14 = "http://optimized-by.rubiconproject.com/a/12198/52926"
    val uri15 = "http://ocsp.digicert.com"
    val uri16 = "http://www.bbc.co.uk"
    val uri17 = "http://gv.symcd.com"
    val uri18 = "http://ocsp.trustwave.com"
    val uri19 = "http://m.files.bbci.co.uk/modules"
    val uri20 = "http://sync-tm.everesttech.net/upi/pid/bsTd8NdE"
    val uri21 = "http://mybbc.files.bbci.co.uk/notification-ui/3.8.4"
    val uri22 = "http://ocsp.pki.goog/GTSGIAG3"
    val uri23 = "http://cipix.acxiom.com/ThorWeb/IPCheck"
    val uri24 = "http://tags.crwdcntrl.net/c/10816/cc.js"
    val uri25 = "http://bcp.crwdcntrl.net"
    val uri26 = "http://pagead2.googlesyndication.com/pagead/osd.js"
    val uri27 = "http://b.scorecardresearch.com/p"
    val uri28 = "http://static.chartbeat.com/js/chartbeat.js"
    val uri29 = "http://www.googletagservices.com/tag/js/gpt.js"
    val uri30 = "http://search.files.bbci.co.uk/searchbox-app/1.0.19"
    val uri31 = "http://static.bbc.co.uk/id/0.37.24"
    val uri32 = "http://edigitalsurvey.com/l.php"
    val uri33 = "http://nav.files.bbci.co.uk"
    val uri34 = "http://clients1.google.com/ocsp"
    val uri35 = "http://id.rlcdn.com/454079.gif"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.post(uri34 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0000_request.txt"))
			.resources(http("request_1")
			.post(uri34 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0001_request.txt")),
            http("request_2")
			.post(uri34 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0002_request.txt"))))
		.pause(4)
		.exec(http("request_3")
			.post(uri22 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0003_request.txt"))
			.resources(http("request_4")
			.post(uri34 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0004_request.txt")),
            http("request_5")
			.post(uri22 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0005_request.txt"))))
		.pause(1)
		.exec(http("request_6")
			.get(uri16 + "/news")
			.headers(headers_6)
			.resources(http("request_7")
			.get(uri33 + "/searchbox/1.0.0-133/css/main.css")
			.headers(headers_7),
            http("request_8")
			.get(uri19 + "/bbc-morph-news-page-styles/2.0.2/enhanced.css")
			.headers(headers_8),
            http("request_9")
			.get(uri19 + "/bbc-morph-news-front-page-js-bundle/1.16.2/init.js"),
            http("request_10")
			.post(uri09 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0010_request.txt")),
            http("request_11")
			.post(uri09 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0011_request.txt")),
            http("request_12")
			.post(uri09 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0012_request.txt")),
            http("request_13")
			.post(uri09 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0013_request.txt")),
            http("request_14")
			.post(uri09 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0014_request.txt")),
            http("request_15")
			.get(uri31 + "/style/id-cta-v5.css")
			.headers(headers_7),
            http("request_16")
			.get(uri31 + "/modules/idcta/dist/idcta-1.min.js"),
            http("request_17")
			.get(uri31 + "/style/id-cta.css")
			.headers(headers_7),
            http("request_18")
			.get(uri33 + "/nav-analytics/0.1.0-89/js/istats-1.js"),
            http("request_19")
			.get(uri21 + "/css/main.min.css")
			.headers(headers_7),
            http("request_20")
			.get(uri31 + "/svg/icon-sprite.svg"),
            http("request_21")
			.get(uri19 + "/bbc-morph-news-navigation-body/3.0.5/navigation.min.js"),
            http("request_22")
			.get(uri33 + "/searchbox/1.0.0-133/img/gel-icon-search-dark.svg"),
            http("request_23")
			.get(uri31 + "/modules/idcta/statusbar.js"),
            http("request_24")
			.get(uri33 + "/nav-analytics/0.1.0-89/js/megavolt-client.js"),
            http("request_25")
			.get(uri33 + "/discovery-layer/0.0.1-117.f862de7/app.js"),
            http("request_26")
			.get(uri21 + "/js/NotificationsMain.js"),
            http("request_27")
			.get(uri16 + "/idcta/config?callback&locale=en-GB&ptrt=http://www.bbc.co.uk/news"),
            http("request_28")
			.get(uri16 + "/idcta/translations?callback&locale=en-GB"),
            http("request_29")
			.get(uri30 + "/searchboxDrawer.js"),
            http("request_30")
			.get(uri31 + "/modules/idcta/fallbackTranslations.js"),
            http("request_31")
			.get(uri31 + "/modules/idcta/fallbackConfig.js"),
            http("request_32")
			.get(uri16 + "/favicon.ico")
			.headers(headers_32),
            http("request_33")
			.get(uri05 + "/news")
			.headers(headers_6),
            http("request_34")
			.post(uri09 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0034_request.txt")),
            http("request_35")
			.get(uri16 + "/idcta/config?callback&locale=en-GB&ptrt=http://www.bbc.com/news"),
            http("request_36")
			.post(uri09 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0036_request.txt")),
            http("request_37")
			.get(uri30 + "/style/enhanced.css")
			.headers(headers_7),
            http("request_38")
			.get(uri05 + "/favicon.ico")
			.headers(headers_32),
            http("request_39")
			.get(uri28 + ""),
            http("request_40")
			.get(uri08 + "?h=bbc.co.uk&p=bbc.co.uk%2Fnews%2F%3Finternational&u=BTdF1YEtKTnClNpF_&d=bbc.com&g=50924&g0=News%2C%20News%20-%20home%2C%20News%20-%20IDX%2C%20News%20-%20home%20-%20IDX&n=1&f=00001&c=0&x=0&m=0&y=4134&o=1834&w=977&j=45&R=1&W=0&I=0&E=0&e=0&r=http%3A%2F%2Fwww.bbc.co.uk%2Fnews&b=990&t=Cf8XxCD1Lw84BCEeR6DWEoA6tSvET&V=97&i=BBC%20News%20-%20Home%20-%20International&tz=-120&sn=1&EE=0&sv=YE-FFDEy9cHDv8pqw5Q3NGBgzOkg&sr=http%3A%2F%2Fwww.bbc.co.uk%2Fnews&_")))
		.pause(8)
		.exec(http("request_41")
			.get(uri05 + "/news")
			.headers(headers_6)
			.resources(http("request_42")
			.get(uri05 + "/wwscripts/flag"),
            http("request_43")
			.get(uri29 + ""),
            http("request_44")
			.post(uri22 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0044_request.txt")),
            http("request_45")
			.get(uri24 + "?ns=10816"),
            http("request_46")
			.get(uri01 + ""),
            http("request_47")
			.get(uri03 + ""),
            http("request_48")
			.get(uri16 + "/idcta/config?callback&locale=en-GB&ptrt=http://www.bbc.com/news"),
            http("request_49")
			.get(uri06 + "/?c1=2&c2=19293874&b_imp_src=gnl&b_vs_un=bc&ns_c=UTF-8&b_daxcorp=bbc-global&b_ad_enabled=1&b_app_type=web&app_type=web&b_is_app=0&b_edition=international&b_imp_ver=1.73.0&name=news.home&b_article_title=news.home&ns_site=bbc&test_group=b&b_app_name=news%7Cweb&b_site_channel=news&bbc_site=news&prod_name=news&b_page_type=idx%7Cna&c7=http%3A%2F%2Fwww.bbc.com%2Fnews&c8=Home%20-%20BBC%20News&c9=http%3A%2F%2Fwww.bbc.com%2Fnews"),
            http("request_50")
			.get(uri06 + "/?ns_alias=4fafd180-d0b9-4859-97db-ae9231a521ab&c1=2&c2=19293874&b_imp_src=gnl&b_vs_un=bc&ns_c=UTF-8&b_daxcorp=bbc-global&b_ad_enabled=1&b_app_type=web&app_type=web&b_is_app=0&b_edition=international&b_imp_ver=1.73.0&name=news.home&b_article_title=news.home&ns_site=bbc&test_group=b&b_app_name=news%7Cweb&b_site_channel=news&bbc_site=news&prod_name=news&b_page_type=idx%7Cna&c7=http%3A%2F%2Fwww.bbc.com%2Fnews&c8=Home%20-%20BBC%20News&c9=http%3A%2F%2Fwww.bbc.com%2Fnews&ssc_validate=1"),
            http("request_51")
			.get(uri27 + "?ns_alias=4fafd180-d0b9-4859-97db-ae9231a521ab&c1=2&c2=19293874&b_imp_src=gnl&b_vs_un=bc&ns_c=UTF-8&b_daxcorp=bbc-global&b_ad_enabled=1&b_app_type=web&app_type=web&b_is_app=0&b_edition=international&b_imp_ver=1.73.0&name=news.home&b_article_title=news.home&ns_site=bbc&test_group=b&b_app_name=news%7Cweb&b_site_channel=news&bbc_site=news&prod_name=news&b_page_type=idx%7Cna&c7=http%3A%2F%2Fwww.bbc.com%2Fnews&c8=Home%20-%20BBC%20News&c9=http%3A%2F%2Fwww.bbc.com%2Fnews"),
            http("request_52")
			.get(uri26 + ""),
            http("request_53")
			.get(uri10 + ""),
            http("request_54")
			.post(uri22 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0054_request.txt")),
            http("request_55")
			.get(uri14 + "/243902-15.js?&cb=0.3942821495682667&tk_st=1&rf=http%3A//www.bbc.com/news&rp_s=c&tg_i.site=homepage&tg_i.slot=mpu&p_pos=atf&p_screen_res=1920x1080&ad_slot=52926_15"),
            http("request_56")
			.get(uri14 + "/243902-2.js?&cb=0.8855741441293646&tk_st=1&rf=http%3A//www.bbc.com/news&rp_s=c&tg_i.site=homepage&tg_i.slot=leaderboard&p_pos=atf&p_screen_res=1920x1080&ad_slot=52926_2"),
            http("request_57")
			.get(uri04 + "")
			.headers(headers_6),
            http("request_58")
			.post(uri15 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0058_request.txt")),
            http("request_59")
			.post(uri15 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0059_request.txt")),
            http("request_60")
			.get(uri02 + "/dc8698bd-90ff-41d7-9fe9-e156244447db?accountId=12198&siteId=52926&zoneId=243902&e=6A1E40E384DA563B3AE287928FF1EF6F7262C46CA4A20F9F102B03FF98F84C5809710CEED91FF5836A8385E44277909ACAF2DAFE1CA954B350D7B06031D0EB878D2B530B1321250A46A5350A5F8BF637172CD28438FCBB6A191CFD32AAF0602A1030499443B206D7894F1AF2E000983BC070A35DF01D087DB4255D9ABC8E02A954267F605AE293E3ADD84CD4C36B4A0ECDA10306204D320B"),
            http("request_61")
			.get(uri02 + "/418b65f2-b8b7-4f8f-a75d-8394fc9a5d09?accountId=12198&siteId=52926&zoneId=243902&e=6A1E40E384DA563BDAD8E1322F54175EE75802A1C2B2E210A16CE2E0E012E13C4743CB57E9DB2DBFD2DEF0EFE11F1AA2CAF2DAFE1CA954B35C4CE2356D02589D8D2B530B1321250A46A5350A5F8BF637172CD28438FCBB6A191CFD32AAF0602AD1D29A41AB876415712A832839E51812C070A35DF01D087DFEE056074D79A39B54267F605AE293E3ADD84CD4C36B4A0ECDA10306204D320B"),
            http("request_62")
			.post(uri15 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0062_request.txt")),
            http("request_63")
			.post(uri15 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0063_request.txt")),
            http("request_64")
			.post(uri17 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0064_request.txt")),
            http("request_65")
			.post(uri17 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0065_request.txt")),
            http("request_66")
			.post(uri15 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0066_request.txt")),
            http("request_67")
			.post(uri15 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0067_request.txt")),
            http("request_68")
			.post(uri22 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0068_request.txt")),
            http("request_69")
			.post(uri15 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0069_request.txt")),
            http("request_70")
			.post(uri15 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0070_request.txt")),
            http("request_71")
			.post(uri17 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0071_request.txt")),
            http("request_72")
			.post(uri15 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0072_request.txt")),
            http("request_73")
			.post(uri18 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0073_request.txt")),
            http("request_74")
			.post(uri15 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0074_request.txt")),
            http("request_75")
			.post(uri15 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0075_request.txt")),
            http("request_76")
			.post(uri15 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0076_request.txt")),
            http("request_77")
			.post(uri11 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0077_request.txt")),
            http("request_78")
			.get(uri32 + "?id=INS-vt29-666188954&v=7215&x=1920&y=1080&d=24&c=null&ck=1&fl=27.0.0&p=%2Fnews&ref=http%3A%2F%2Fwww.bbc.com%2Fnews&xdm=edr&xdm_o=http%3A%2F%2Fwww.bbc.com&xdm_c=edr0")
			.headers(headers_6),
            http("request_79")
			.get(uri08 + "?h=bbc.co.uk&p=bbc.co.uk%2Fnews%2F%3Finternational&u=BTdF1YEtKTnClNpF_&d=bbc.com&g=50924&g0=News%2C%20News%20-%20home%2C%20News%20-%20IDX%2C%20News%20-%20home%20-%20IDX&n=1&f=00001&c=0&x=0&m=0&y=4058&o=1834&w=977&j=45&R=1&W=0&I=0&E=0&e=0&v=bbc.co.uk%2Fnews%2F%3Finternational&K=646::0::BopVZjVbXnZCWArXBK7q_tC4UN6P::::c::http%3A%2F%2Fwww.bbc.com%2Fnews::EYySuBpSKEsBZBRP8DKOwJFDdW0Vd::&b=5153&t=uphxtdroGBDfVv2YCdI4sxC2I1_n&V=97&z=t%3DCf8XxCD1Lw84BCEeR6DWEoA6tSvET%26E%3D8%26EE%3D8%26x%3D0%26c%3D0.15%26y%3D4134%26w%3D977&i=BBC%20News%20-%20Home%20-%20International&tz=-120&sn=1&EE=0&sv=YE-FFDEy9cHDv8pqw5Q3NGBgzOkg&sr=http%3A%2F%2Fwww.bbc.co.uk%2Fnews&_"),
            http("request_80")
			.post(uri15 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0080_request.txt")),
            http("request_81")
			.post(uri15 + "/")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0081_request.txt")),
            http("request_82")
			.get(uri25 + "/5/c=10816/rand=625515486/pv=y/genp=channel%3Anews/genp=sectn%3Ahomepage/genp=domain%3Awww.bbc.com/genp=ctype%3Aindex/genp=asset_type%3Aindex/genp=referrer%3Anews/genp=referrer_domain%3Awww.bbc.com/genp=rsi%3A/genp=b_imp_src%3Agnl/genp=b_vs_un%3Abc/genp=ns_c%3AUTF-8/genp=b_daxcorp%3Abbc-global/genp=b_ad_enabled%3A1/genp=b_app_type%3Aweb/genp=app_type%3Aweb/genp=b_is_app%3A0/genp=b_c9%3A/genp=b_collection%3A/genp=b_edition%3Ainternational/genp=b_imp_ver%3A1.73.0/genp=b_s_vi%3A/genp=name%3Anews.home/genp=b_article_title%3Anews.home/genp=c2%3A19293874/genp=ns_site%3Abbc/genp=test_group%3Ab/genp=ns_ap_an%3Anull/genp=app_name%3Anull/genp=b_app_name%3Anews%7Cweb/genp=b_site_channel%3Anews/genp=bbc_site%3Anews/genp=prod_name%3Anews/genp=b_site_section%3A/genp=b_site_subsec1%3A/genp=b_site_subsec2%3A/genp=b_page_type%3Aidx%7Cna/genp=ad-unit-1%3Abbccom.live.site.news/genp=ad-unit-2%3Anews_homepage_int/genp=slot%3A/int=%23OpR%2377493%23www.bbc.com%20%3A%20Total%20Site%20Traffic/int=%23OpR%2377494%23www.bbc.com%20%3A%20Site%20Section%20%3A%20news/med=%23OpR%2380847%23www.bbc.com%20%3A%20Article%20Section%20%3A%20Home/med=%23OpR%2380848%23www.bbc.com%20%3A%20Title%3A%20Home%20-%20BBC%20News/rt=ifr")
			.headers(headers_6),
            http("request_83")
			.get(uri20 + "?redir=http%3A%2F%2Fbcp.crwdcntrl.net%2Fmap%2Fc%3D1811%2Ftp%3DTBMG%2Ftpid%3D%24%7BTM_USER_ID%7D"),
            http("request_84")
			.get(uri25 + "/map/c=1818/tp=DTXU/tpid=IBYWeGiV1ECbfn5"),
            http("request_85")
			.get(uri25 + "/map/c=1811/tp=TBMG/tpid=WmCwFgAAAHE_wyKh"),
            http("request_86")
			.get(uri12 + "?partner_uid=9a01b490facb16342e8e02f66b5fb169"),
            http("request_87")
			.get(uri35 + ""),
            http("request_88")
			.get(uri30 + "/img/gel-icon-no.svg"),
            http("request_89")
			.get(uri30 + "/app.min.js"),
            http("request_90")
			.post(uri09 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0090_request.txt")),
            http("request_91")
			.post(uri09 + "")
			.headers(headers_0)
			.body(RawFileBody("RecordedSimulation_0091_request.txt")),
            http("request_92")
			.get(uri30 + "/img/gel-icon-iplayer.svg"),
            http("request_93")
			.get(uri30 + "/img/gel-icon-iplayer-radio.svg"),
            http("request_94")
			.get("/images/ic/192x108/p05cjmwm.jpg"),
            http("request_95")
			.get("/images/ic/192x108/p05r6wjd.jpg")))
		.pause(1)
		.exec(http("request_96")
			.get("/images/ic/192x108/p0599454.jpg")
			.resources(http("request_97")
			.get(uri13 + "?limit=0&id=edd1b21a606b4d0cdc0eb634188923bf"),
            http("request_98")
			.get("/images/ic/192x108/p05r6wbp.jpg"),
            http("request_99")
			.get(uri23 + "?IDL=Xc1298VUxYh_BqvKOPZuj2QudAi7mcg6YOjpna1b7OEFXDhto&p_uid=3f1a85c7564c99a6bb2a3019dbb33be368be1484bbdd644e0eb844dd1e3e07ac8191bb57fc32d6d7")))
		.pause(6)
		.exec(http("request_100")
			.get("/images/ic/192x108/p04qn04v.jpg")
			.resources(http("request_101")
			.get("/images/ic/192x108/p01nrymk.jpg"),
            http("request_102")
			.get(uri08 + "?h=bbc.co.uk&p=bbc.co.uk%2Fnews%2F%3Finternational&u=BTdF1YEtKTnClNpF_&d=bbc.com&g=50924&g0=News%2C%20News%20-%20home%2C%20News%20-%20IDX%2C%20News%20-%20home%20-%20IDX&n=1&f=00001&c=0.25&x=0&m=0&y=4542&o=1834&w=977&j=30&R=0&W=1&I=0&E=14&e=14&v=bbc.co.uk%2Fnews%2F%3Finternational&K=646::0::BopVZjVbXnZCWArXBK7q_tC4UN6P::::c::http%3A%2F%2Fwww.bbc.com%2Fnews::EYySuBpSKEsBZBRP8DKOwJFDdW0Vd::&b=5153&t=uphxtdroGBDfVv2YCdI4sxC2I1_n&V=97&tz=-120&sn=2&eM=418c&eK=0802&EE=14&sv=YE-FFDEy9cHDv8pqw5Q3NGBgzOkg&sr=http%3A%2F%2Fwww.bbc.co.uk%2Fnews&_")))
		.pause(2)
		.exec(http("request_103")
			.get("/images/ic/192x108/p02rnn1p.jpg")
			.resources(http("request_104")
			.get("/images/ic/192x108/p02hcltb.jpg"),
            http("request_105")
			.get("/images/ic/192x108/p01t65yy.jpg"),
            http("request_106")
			.get("/images/ic/192x108/p05ssnqs.jpg")))
		.pause(1)
		.exec(http("request_107")
			.get("/images/ic/192x108/p040q1c3.jpg"))
		.pause(10)
		.exec(http("request_108")
			.get(uri08 + "?h=bbc.co.uk&p=bbc.co.uk%2Fnews%2F%3Finternational&u=BTdF1YEtKTnClNpF_&d=bbc.com&g=50924&g0=News%2C%20News%20-%20home%2C%20News%20-%20IDX%2C%20News%20-%20home%20-%20IDX&n=1&f=00001&c=0.5&x=0&m=0&y=4542&o=1834&w=977&j=30&R=0&W=1&I=0&E=29&e=15&v=bbc.co.uk%2Fnews%2F%3Finternational&K=646::0::BopVZjVbXnZCWArXBK7q_tC4UN6P::::c::http%3A%2F%2Fwww.bbc.com%2Fnews::EYySuBpSKEsBZBRP8DKOwJFDdW0Vd::&b=5153&t=uphxtdroGBDfVv2YCdI4sxC2I1_n&V=97&tz=-120&sn=3&eM=03c3&eD=0001&eK=1c00&EE=29&sv=YE-FFDEy9cHDv8pqw5Q3NGBgzOkg&sr=http%3A%2F%2Fwww.bbc.co.uk%2Fnews&_"))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
