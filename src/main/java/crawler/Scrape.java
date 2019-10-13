package crawler;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;

public class Scrape {
    public static void main(String[] args) throws IOException {
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        HtmlPage page = webClient.getPage("https://wklyads.kingsoopers.com/flyers/kingsoopers-weekly/grid_view/417480?postal_code=80012&store_code=00049&type=2");
        webClient.getOptions().setJavaScriptEnabled(true);
        String pageContent=page.asXml();
        System.out.println(pageContent);

    }
}
