package com.mum.labs.lab6.javaFx.problem3;

/**
 * Created by Rajiv on 5/30/2016.
 */

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Main {
    private static final String NAME = "name";
    private static final String STREET = "street";
    private static final String CITY = "city";
    private static final String ZIP = "zip";
    //Use the DomServiceClass to get all customers
    //whose city of residence begins with "Ma", in sorted order.
    //Create
    public List<Customer> allCustomersBeginWithMa() throws ParserConfigurationException, IOException, SAXException, DomException {
        String fileLocation = System.getProperty("user.dir")
                + "//src//com//mum//labs//lab6//javaFx//problem3//customer.xml";
        File fXmlFile = new File(fileLocation);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();
        DomServiceClass dsc = new DomServiceClass(fileLocation);
        List<Properties> properties = dsc.lookupEntry("city","ma");
        List<Customer> allCustomersBeginWithMa = new ArrayList<Customer>();
        for(Properties p : properties){
            allCustomersBeginWithMa.add(new Customer(p.get("name").toString(),
                        p.get("street").toString(),
                        p.get("city").toString(),
                        p.get("zip").toString()));

        }
        return allCustomersBeginWithMa;
    }

    public Boolean checkStringStarting(String input){
        if(input.isEmpty() || input.length()<2){
            return false;
        }
        if(input.substring(0,2).equalsIgnoreCase("MA")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, DomException {
        Main m = new Main();
        List<Customer> list = m.allCustomersBeginWithMa();
        System.out.println(list);

    }

}
