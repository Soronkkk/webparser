package app.webparser;

public class Main {
    public static void main(String[] args) {
        GetHTML getHTML = new GetHTML("https://www.simbirsoft.com");
        getHTML.getHtmlToText();
        TextAnalysis textAnalysis = new TextAnalysis();
        textAnalysis.setSplitWords(getHTML.getPathName());
        textAnalysis.wordCount();
    }
}
