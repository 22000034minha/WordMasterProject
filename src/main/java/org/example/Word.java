// word object : for each word

package org.example;

public class Word {
    private int level;
    private String word;
    private String meaning;

    public Word() {
    }

    public Word(int level, String word, String meaning) {
        this.level = level;
        this.word = word;
        this.meaning = meaning;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        String str = "";
        // level
        for (int i=0; i<level; i++) str += "*";
        str = String.format("%-3s", str);
        // word, meaning
        str += " " + String.format("%15s", word) + "   " + meaning;
        return str;
    }

    public String fileFormat() {    // file writing format
        String str = level+"|"+word+"|"+meaning;
        return str;
    }
}
