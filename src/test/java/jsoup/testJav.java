package jsoup;

/*import com.guoguo.util.JDBCTester;
import com.guoguo.util.jav;*/
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class testJav {

    private static String url="https://www.jav321.com";
    Logger logger = LoggerFactory.getLogger(testJav.class);
    @Test
    public void get() throws IOException {


        getbt("https://www.jav321.com/video/118abp00033","1");


    /*        for (int j=64 ;j<70;j++){
                logger.info(url+"/genre/4008/"+j);
                logger.info("===================================第"+j+"页开始========================================");
                Document document = Jsoup.connect(url+"/genre/4008/"+j).ignoreContentType(true).get();
                Elements select = document.select("div.col-xs-6");
                //Elements select = document.select("img.img-responsive");

                for (int i=0;i<select.size();i++){
                    //   select.get(i).select("img.img-responsive");
                    System.out.println(url+""+select.get(i).select("a").attr("href"));
                      getbt(url+""+select.get(i).select("a").attr("href"),j+"");
                    //   System.out.println(select.attr("src"));
                }

            }*/

        }



  //   @Test
    public void getbt(String url,String page) throws IOException {


        Document document = Jsoup.connect(url).ignoreContentType(true).get();
        System.out.println("===============================================");

        /*简介*/
        String html="<div class=\"col-md-9\">\n" +
                " <b>女优</b>: \n" +
                " <a href=\"/star/1016835/1\">あやみ旬果</a> &nbsp; \n" +
                " <br>\n" +
                " <b>片商</b>: \n" +
                " <a href=\"/company/%E3%83%97%E3%83%AC%E3%82%B9%E3%83%86%E3%83%BC%E3%82%B8/1\">プレステージ</a>\n" +
                " <br>\n" +
                " <b>标签</b>: \n" +
                " <a href=\"/genre/6533/1\">高清画质</a> \n" +
                " <a href=\"/genre/4025/1\">单体作品</a> \n" +
                " <a href=\"/genre/553/1\">女学生</a> \n" +
                " <a href=\"/genre/3009/1\">泳装</a>\n" +
                " <br>\n" +
                " <b>番号</b>: abp-033\n" +
                " <br>\n" +
                " <b>发行日期</b>: 2013-08-22\n" +
                " <br>\n" +
                " <b>播放时长</b>: 110 分钟\n" +
                " <br>\n" +
                " <b>赞</b>: 1816\n" +
                " <br>\n" +
                " <b>评分</b>: \n" +
                " <img data-original=\"/img/45.gif\">\n" +
                " <br>\n" +
                " <b>系列</b>: \n" +
                " <a href=\"/series/201983/1\">ENJOY HI-SCHOOL</a>\n" +
                "</div>".replace("\n","");

        System.out.println(html);
        Elements jianjie = document.select("div.col-md-9");

        Elements select1 = jianjie.select("a  b");

        System.out.println(select1);

        List<String> a = jianjie.eachAttr("a");

        System.out.println(a);

        List<String> strings = jianjie.eachText();
        System.out.println(strings);

        Elements b = jianjie.select("b");
   //     System.out.println(b);
        System.out.println(b.size());

        String l_name;
        String l_pianshang;
        String l_biaoqian;
        String l_fanhao;
        String l_faxingriqi;
        String l_bofangshichang;
        String l_zang;
        String l_xilie;

        System.out.println(b);
 /*       for (int i=0; i<b.size();i++){

            System.out.println(b);

        }
*/

        Elements select = document.select("table.table-striped");



/*

        for (int i=0; i < select.size();i++){

            Elements tr = select.get(i).select("tr");

            for (int j=1; j<tr.size();j++){
                String attr = tr.get(j).select("a").attr("href");
                String a = tr.get(j).select("a").toString();
              //  String Popularity = tr.get(j).select("td");
                Elements td1 = tr.get(j).select("td");
                logger.info(attr);
                jav jav =new jav();
                jav.setName(td1.get(0).text());
                jav.setSize(td1.get(1).text());
                jav.setPopularity(td1.get(2).text());
                jav.setMagnetic_chain(attr);
                jav.setMagnetic_chain_type(tr.get(0).select("th").get(0).text());
                jav.setName_one(url);
                jav.setName_two("恋腿");
                jav.setPage(page);
                jav.setTr_text(a);

                logger.info(jav.toString());

          //      JDBCTester.insert(jav);
            }
       //     System.out.println(tr);

        }
*/


    }

    @Test
    public void getjianjie(){

        /*简介*/
        String html="<div class=\"col-md-9\">\n" +
                " <b>女优</b>: \n" +
                " <a href=\"/star/1016835/1\">あやみ旬果</a> &nbsp; \n" +
                " <br>\n" +
                " <b>片商</b>: \n" +
                " <a href=\"/company/%E3%83%97%E3%83%AC%E3%82%B9%E3%83%86%E3%83%BC%E3%82%B8/1\">プレステージ</a>\n" +
                " <br>\n" +
                " <b>标签</b>: \n" +
                " <a href=\"/genre/6533/1\">高清画质</a> \n" +
                " <a href=\"/genre/4025/1\">单体作品</a> \n" +
                " <a href=\"/genre/553/1\">女学生</a> \n" +
                " <a href=\"/genre/3009/1\">泳装</a>\n" +
                " <br>\n" +
                " <b>番号</b>: abp-033\n" +
                " <br>\n" +
                " <b>发行日期</b>: 2013-08-22\n" +
                " <br>\n" +
                " <b>播放时长</b>: 110 分钟\n" +
                " <br>\n" +
                " <b>赞</b>: 1816\n" +
                " <br>\n" +
                " <b>评分</b>: \n" +
                " <img data-original=\"/img/45.gif\">\n" +
                " <br>\n" +
                " <b>系列</b>: \n" +
                " <a href=\"/series/201983/1\">ENJOY HI-SCHOOL</a>\n" +
                "</div>".replace("\n","");


     //   System.out.println(html);
        String l_name;
        String l_pianshang;
        String l_biaoqian;
        String l_fanhao;
        String l_faxingriqi;
        String l_bofangshichang;
        String l_zang;
        String l_xilie;

        Document parse = Jsoup.parse(html);

        Elements select = parse.select("div.col-md-9");

 /*       for (int i=0;i<select.size()){

        }*/
        //select.eq();

        String[] split = select.toString().split("<br>");
        int i=0;
        for (String str:split
             ) {

            String[] split1 = Jsoup.parse(str).text().toString().split(":");
            switch (split1[0]){

                case "女优" : System.out.println(split1[1].trim());  break;
                case "片商" : System.out.println(split1[1].trim());  break;
                case "标签" : System.out.println(split1[1].trim().split(" ").length);  break;
                case "番号" : System.out.println(split1[1].trim());  break;
                case "发行日期" : System.out.println(split1[1].trim());  break;
                case "播放时长" : System.out.println(split1[1].trim());  break;
                case "赞" : System.out.println(split1[1].trim());  break;
                case "系列" : System.out.println(split1[1].trim());  break;
            }

        }

    }



}
