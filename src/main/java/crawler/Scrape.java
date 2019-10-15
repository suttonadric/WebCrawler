package crawler;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlListItem;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scrape {
    public static void main(String[] args) throws IOException {
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        HtmlPage page = webClient.getPage("https://wklyads.kingsoopers.com/flyers/kingsoopers-weekly/grid_view/417480?postal_code=80012&store_code=00049&type=2");
        webClient.getOptions().setJavaScriptEnabled(true);
        String pageContent=page.asXml();
        System.out.println(pageContent);

        /*This breaks the list up into list items,first child  then nested nextSibling has the information
        ex [1] firstChild_/nextSibling_/nextSibling_/nextSibling_/nextSibling_ has item price as class
        and aria-label as amount
         */
        //List<HtmlListItem> itemList = page.getByXPath("//div[@class= 'category-allcategories']/ul/li");
       //String test = itemList.get(3).asText();
        //Map<String,String> itemPriceMap = new HashMap<>();
       /*for(HtmlListItem div : itemList){
            itemPriceMap.put(div.getByXPath("//div[@class= 'item-price']").toString(),div.getByXPath("//div[@class= 'item-price']").toString());
        }

        */




    }
}
