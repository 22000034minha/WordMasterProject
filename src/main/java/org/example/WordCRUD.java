// word CRUD : implements ICRUD -> CRUD of Word class

package org.example;

import java.util.ArrayList;

public class WordCRUD implements ICRUD {
    ArrayList<Word> wordList;

    public WordCRUD() {
        wordList = new ArrayList<>();
    }

    public void listAll() { // show all words in arraylist
        for (int i=0; i<wordList.size(); i++) {
            System.out.println( (i+1) + " " + wordList.get(i) );
        }
    }

    public void listLevel(int level) { // show all words in arraylist
        for (int i=0; i<wordList.size(); i++) {
            if (wordList.get(i).getLevel()==level)
                System.out.println( (i+1) + " " + wordList.get(i) );
        }
    }

    @Override
    public Object add(Object obj) { // add Word object to arraylist
        Word word = (Word) obj;
        wordList.add(word);
        return null;
    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }
}
