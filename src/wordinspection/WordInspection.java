package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author marbi */
public class WordInspection {

    private File file;

    public WordInspection(File file) throws Exception {
        this.file = file;
    }

    private List<String> fileToList() {
        List<String> fileList = null;
        try {
            Charset charset = Charset.forName("UTF-8");
            fileList = Files.readAllLines(this.file.toPath(), charset);
        } catch (IOException ex) {
            Logger.getLogger(WordInspection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return fileList;
        }
    }

    public int wordCount() {
        List<String> temp = this.fileToList();
        return temp.size();
    }

    public List<String> wordsContainingZ() {
        List<String> words = new ArrayList<String>();
        for (String word : this.fileToList()) {
            if (word.contains("z")) {
                words.add(word);
            }
        }

        return words;
    }

    public List<String> wordsEndingInL() {
        List<String> words = new ArrayList<String>();
        for (String word : this.fileToList()) {
            if (word.charAt(word.length() - 1) == 'l') {
                words.add(word);
            }
        }

        return words;
    }

    public List<String> palindromes() {
        List<String> words = new ArrayList<String>();

        for (String word : this.fileToList()) {
            String reverse = new StringBuffer(word).reverse().toString();
            if (word.equals(reverse)) {
                words.add(word);
            }
        }

        return words;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> words = new ArrayList<String>();

        for (String word : this.fileToList()) {
            if (word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u")
                    && word.contains("y") && word.contains("ä") && word.contains("ö")) {
                words.add(word);
            }
        }

        return words;
    }

}
