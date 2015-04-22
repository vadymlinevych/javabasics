package Task_01;

import java.io.*;
import java.util.ArrayList;

public class SimpleXMLParser {
    private String xml;

    public SimpleXMLParser(String path) {
        byte[] buf = null;

        try {
            RandomAccessFile file = new RandomAccessFile(path, "r");
            try {
                buf = new byte[(int)file.length()];
                file.read(buf);
            } finally {
                file.close();
            }
        } catch (IOException ex) {}

        try {
            xml = new String(buf, "US-ASCII");
        } catch (UnsupportedEncodingException ex) {}
    }

    public SimpleXMLParser(InputStream inputStream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();
        char[] buf = new char[1024]; //magic number
        int n;
        while ((n = reader.read(buf)) > 0) {
            stringBuilder.append(buf, 0, n);
        }
        xml = stringBuilder.toString();
    }

    public ArrayList<String> getAllElement(String tag) {
        ArrayList<String> list = new ArrayList<String>();
        return findElement(xml, tag, list);
    }


    public ArrayList<String> findElement(String text, String tag, ArrayList<String> list){
        String startTag = "<" + tag + ">";
        String endTag = "</" + tag + ">";
        int start = text.indexOf(startTag);
        int end = text.indexOf(endTag);

        if(start<0 || end<0)
            return null;

        String substr = text.substring(start+startTag.length(), end);
        list.add(substr);

        String newSubstr=text.substring(end+endTag.length());
        findElement(newSubstr, tag, list);

        return list;

    }

    // "catalog/book/author"
    /*public String get(String path) {
        String[] parts = path.split("/");
        String s_xml = xml;

        for (String s : parts) {
            String toFind = "<" + s + ">";

            int start = s_xml.indexOf(toFind);
            if (start < 0)
                return null;
            else
                start += toFind.length();

            int end = s_xml.lastIndexOf("</" + s + ">");
            if (end < 0)
                return null;

            s_xml = s_xml.substring(start, end);
        }

        return s_xml;
    }*/
}
