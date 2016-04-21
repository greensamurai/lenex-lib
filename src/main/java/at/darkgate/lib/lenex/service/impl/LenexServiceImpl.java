package at.darkgate.lib.lenex.service.impl;

import at.darkgate.lib.lenex.model.Lenex;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by Laszlo on 20.04.2016.
 */
public class LenexServiceImpl {
    public Lenex read(String lenexStr) throws JAXBException, IOException {
        final JAXBContext jaxbContext = JAXBContext.newInstance(Lenex.class);
        final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
/*        InputStream is = url.openConnection().getInputStream();
        InputStream in = new BufferedInputStream(is, 1024);
        ZipInputStream zis = new ZipInputStream(in);
        zis.getNextEntry();*/
        StringReader reader = new StringReader(lenexStr);
        final Lenex lenex = (Lenex) jaxbUnmarshaller.unmarshal(reader);
        return lenex;
    }
}
