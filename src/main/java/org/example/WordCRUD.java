// word CRUD : implements ICRUD -> CRUD of Word class

package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD {
    ArrayList<Word> wordList;
    ArrayList<Integer> searchedWords;
    Scanner keyboard;

    public WordCRUD() {
        searchedWords = new ArrayList<>();
        wordList = new ArrayList<>();
        keyboard = new Scanner(System.in);
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

    public void deleteWord(int num) {
        delete(wordList.get(searchedWords.get(num-1)));   // update Word from searchedWords
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
        System.out.print("=> 뜻 입력 : ");
        String update_meaning = keyboard.nextLine();
        // update Word object
        ((Word) obj).setMeaning(update_meaning);
        return 0;
    }

    @Override
    public int delete(Object obj) {
        System.out.print("=> 정말로 삭제하실래요? (Y/n) ");
        String check = keyboard.nextLine();
        if (check.contains("Y")) {      // if "Y" is input
            wordList.remove(obj);
            System.out.println("\n선택한 단어 삭제 완료 !!!\n");
        }
        else {  // if input is not "Y"
            System.out.println("\n단어 삭제가 취소되었습니다\n");
        }
        return 0;
    }

}
