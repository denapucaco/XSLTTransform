package com.sparsh.learning;

import java.io.File;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XSLTTransformer {

    public static void main(String[] args) {

        try {

            File xmlFile = new File("F:\\PrashantWorkspace\\XSLTTransform\\src\\main\\resources\\students.xml");
            File xsltFile = new File("F:\\PrashantWorkspace\\XSLTTransform\\src\\main\\resources\\students.xslt");
            File outputFile = new File("F:\\PrashantWorkspace\\XSLTTransform\\src\\main\\resources\\output.html");

            Source xsltSource = new StreamSource(xsltFile);
            Source xmlSource = new StreamSource(xmlFile);
            Result outputResult = new StreamResult(outputFile);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();

            Transformer transformer = transformerFactory.newTransformer(xsltSource);

            transformer.transform(xmlSource, outputResult);

        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }

}
