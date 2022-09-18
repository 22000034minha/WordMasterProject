// word CRUD : implements ICRUD -> CRUD of Word class

package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD {
    ArrayList<Word> wordList;
    ArrayList<Integer> searchedWords;

    public WordCRUD() {
        searchedWords = new ArrayList<>();
        wordList = new ArrayList<>();
    }

    public void listAll() { // show all words in arraylist
        for (int i=0; i<wordList.size(); i++) {
            System.out.println( (i+1) + " " + wordList.get(i) );
        }
    }

    public void listLevel(int level) { // show all words in arraylist
        int count=0;    // word number
        for (int i=0; i<wordList.size(); i++) {
            if (wordList.get(i).getLevel()==level) {
                count++;
                System.out.println((count) + " " + wordList.get(i));
            }
        }
    }

    public void search(String str) {
        searchedWords.clear();
        int count=0;    // word number
        for (int i=0; i<wordList.size(); i++) {
            if (wordList.get(i).getWord().contains(str)) {
                count++;
                System.out.println((count) + " " + wordList.get(i));
                searchedWords.add(i);
            }
        }
    }

    public void updateWord(int num) {
        update(wordList.get(searchedWords.get(num-1)));   // update Word from searchedWords
    }

    @Override
    public Object add(Object obj) { // add Word object to arraylist
        Word word = (Word) obj;
        wordList.add(word);
        return null;
    }

    @Override
    public int update(Object obj) { // update a Word object in arraylist
        // input meaning
        Scanner keyboard = new Scanner(System.in);
        System.out.print("=> 뜻 입력 :");
        String update_meaning = keyboard.nextLine();
        // update Word object
        ((Word) obj).setMeaning(update_meaning);
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

}
