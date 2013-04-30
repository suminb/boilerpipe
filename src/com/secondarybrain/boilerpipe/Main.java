package com.secondarybrain.boilerpipe;
import java.net.URL;

import de.l3s.boilerpipe.extractors.ArticleExtractor;


public class Main {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.bloter.net/archives/151148?buffer_share=06755&utm_source=buffer&utm_medium=twitter&utm_campaign=Buffer%253A%252Bbloter_news%252Bon%252Btwitter");
        
        String text = ArticleExtractor.INSTANCE.getText(url);
        
        System.out.println(text);
    }
}
