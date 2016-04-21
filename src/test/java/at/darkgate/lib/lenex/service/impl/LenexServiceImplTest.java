package at.darkgate.lib.lenex.service.impl;

import at.darkgate.lib.lenex.model.Lenex;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Laszlo on 20.04.2016.
 */
public class LenexServiceImplTest {
    @Test
    public void read() throws Exception {
        final LenexServiceImpl lenexService = new LenexServiceImpl();
        URL url = new URL("http://www.stoneship.at/sw/2016/schule/results.lxf");

        String lenexStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<LENEX version=\"3.0\">\n" +
                "  <CONSTRUCTOR name=\"SPLASH Meet Manager 11\" registration=\"LSV Wien\" version=\"11.41395\">\n" +
                "    <CONTACT name=\"Swimrankings\" street=\"Weltpoststrasse 5\" city=\"Bern\" zip=\"3015\" country=\"CH\" phone=\"+41 99 999 99 99\" fax=\"+41 99 999 99 99\" email=\"sales@swimrankings.net\" internet=\"https://www.swimrankings.net\" />\n" +
                "  </CONSTRUCTOR>\n" +
                "</LENEX>";
        Lenex lenex = lenexService.read(lenexStr);

        assertNotNull(lenex);
    }

}