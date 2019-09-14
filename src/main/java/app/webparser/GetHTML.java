package app.webparser;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class GetHTML {

    private String url;
    private static final String PATH_NAME = "src/main/resources/htmlTemp/htmlPage";

    public GetHTML(String url) {
        this.url = url;
    }

    public void getHtmlToText() {
        try {
            Document document = Jsoup.connect(url).get();
            File file = new File(PATH_NAME);
            FileUtils.writeStringToFile(file, document.text().replaceAll("\\<.*?\\>", ""));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getPathName() {
        return PATH_NAME;
    }
}
