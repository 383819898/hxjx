package jsoup;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintWriter;
import java.io.StringWriter;

public class testEX {

    Logger logger = LoggerFactory.getLogger(testEX.class);

    @Test
    public  void testEX(){

        try {
            String [] strings = new String[9];

            strings[9].charAt(1);
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter,true));
            logger.error("错误信息："+stringWriter.toString());

      //      e.printStackTrace();
        }


    }

}
