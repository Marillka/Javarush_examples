package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;

public class HtmlParser {
    public static void main(String[] args) {

        // Parse HTML String using JSoup library
        String HTMLString = "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "<title>JSoup Example</title>"
                + "</head>"
                + "<body>"
                + "<table><tr><td><h1>HelloWorld</h1></tr>"
                + "</table>"
                + "</body>"
                + "</html>";

        Document html = Jsoup.parse(HTMLString);
        String title = html.title();
        String h1 = html.body().getElementsByTag("h1").text();

        System.out.println("Input HTML String to JSoup: " + HTMLString);
        System.out.println("After parsing, Title: " + title);
        System.out.println("After parsing, Heading: " + h1);


        // Reading HTML page from URL
        Document doc;
        try {
            doc = Jsoup.connect("http://google.com/").get();
            title = doc.title();
            System.out.println("Jsoup Can read HTML page from URL, title: " + title);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Parsing an HTML file in Java
        Document htmlFile = null;

        try {
            htmlFile = Jsoup.parse(new File("C:\\Users\\micro\\Desktop\\Javarush\\src\\main\\java\\Jsoup\\login.html"), "ISO-8859-1");
            title = htmlFile.title();
            Element div = htmlFile.getElementById("login");
            String cssClass = div.className();

            System.out.println("Jsoup can also parse HTML file directly");
            System.out.println("title: " + title);
            System.out.println("class of div tag: " + cssClass);
        } catch (IOException e) {
            e.printStackTrace();
        }






    }
}
