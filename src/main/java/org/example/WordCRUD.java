// word CRUD : implements ICRUD -> CRUD of Word class

package org.example;

import java.util.ArrayList;

public class WordCRUD implements ICRUD {
    ArrayList<Word> wordList;

    public WordCRUD() {
        wordList = new ArrayList<>();
    }

    @Override
    public Object add() {
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
