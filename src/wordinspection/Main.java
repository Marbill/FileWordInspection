package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here

        File file = new File("src/shortList.txt");
        // all words are in file src/wordList.txt
        //File file = new File("src/shortList.txt");
        WordInspection wi = new WordInspection(file);
        
        System.out.println(wi.wordCount());
        System.out.println(wi.wordsContainingZ().toString());
        System.out.println(wi.wordsEndingInL().toString());
        System.out.println(wi.palindromes());
        System.out.println(wi.wordsWhichContainAllVowels());
    }
}
