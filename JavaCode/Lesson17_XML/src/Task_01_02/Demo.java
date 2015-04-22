package Task_01_02;

import java.io.IOException;
import java.util.ArrayList;

/**
 1. Сделать возможность искать значения в случае дублирования имен тэгов
 2. Реализовать обработку тэгов типа <tag />
 */
public class Demo {

        public static void main(String[] args) throws IOException {
            SimpleXMLParser xml;
            xml = new SimpleXMLParser(Demo.class.getResourceAsStream("example.xml"));
            //xml = new MySimpleXMLParser("C:\\Temp\\example.xml");

            //Task1
            ArrayList<String> value = xml.getAllElement("book");
            for(String s : value)
                System.out.println(s);

            //Task2
            ArrayList<String> v = xml.getAllElement("genre");
            for(String s : v)
                System.out.println(s);

            //String el = xml.get("catalog/book/author");
            //System.out.println(el);
        }
    }

