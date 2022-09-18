// manage crud works according to users

package org.example;

import java.util.Scanner;

public class WordManager {
    Scanner keyboard;
    WordCRUD wordCRUD = new WordCRUD();

    public void start() {   // program starts
        System.out.println("*** 영단어 마스터 ***");

        int menuNum;    // variable : input manu number
        keyboard = new Scanner(System.in);

        while (true) {
            printMenu();
            menuNum = keyboard.nextInt();

            if (menuNum==0) { exit();   break; }    // input 0 : end the program
            else if (menuNum==1) listAllWord();     // input 1 : list all words
            else if (menuNum==2) listLevelWord();   // input 2 : list each level
            else if (menuNum==3) searchWord();      // input 3 : list searched words
            else if (menuNum==4) addWord();         // input 4 : add a word
            else if (menuNum==5) updateWord();      // input 5 : modify a word
            else if (menuNum==6) deleteWord();      // input 6 : delete a word
            else if (menuNum==7) saveFile();        // save words into file
        }

    }

    public void printMenu(){     // show menu
        System.out.print("********************\n" +
                "1. 모든 단어 보기\n" +
                "2. 수준별 단어 보기\n" +
                "3. 단어 검색\n" +
                "4. 단어 추가\n" +
                "5. 단어 수정\n" +
                "6. 단어 삭제\n" +
                "7. 파일 저장\n" +
                "0. 나가기\n" +
                "********************\n" +
                "=> 원하는 메뉴는? ");
    }

    public void exit() {        // menu 0 : exit program
        keyboard.close();
        System.out.println("\n프로그램 종료! 다음에 만나요~\n");
    }

    public void listAllWord() { // menu 1 : show list of all words
        System.out.println();
        System.out.println("--------------------------------");
        wordCRUD.listAll();     // read from Word CRUD
        System.out.println("--------------------------------");
        System.out.println();
    }

    public void listLevelWord() {   // menu 2 : list each level
        System.out.print("=> 레벨(1:초급, 2:중급, 3:고급) 선택 : ");
        int selectLevel = keyboard.nextInt();
        System.out.println();
        System.out.println("--------------------------------");
        wordCRUD.listLevel(selectLevel);    // read words of the selected level
        System.out.println("--------------------------------");
        System.out.println();
    }

    public void searchWord() {  // menu 3 : search word that contains input string
        System.out.print("=> 검색할 단어 입력 : ");
        String search_input = keyboard.nextLine();      // eliminate '\n'
        search_input = keyboard.nextLine();
        System.out.println();
        System.out.println("--------------------------------");
        wordCRUD.search(search_input);
        System.out.println("--------------------------------");
        System.out.println();
    }

    public void addWord() {     // menu 4 : add new word

        // 난이도, 단어 입력
        System.out.print("\n=> 난이도(1,2,3) & 새 단어 입력 : ");
        int level = keyboard.nextInt();
        String word = keyboard.nextLine().substring(1);

        // 뜻 입력
        System.out.print("뜻 입력 : ");
        String meaning = keyboard.nextLine();

        // create Word object
        Word newWord = new Word(0, level, word, meaning);
        wordCRUD.add(newWord);

        System.out.println("\n새 단어가 단어장에 추가되었습니다 !!!\n");
    }

    public void updateWord() {  // menu 5 : modify a word
        // search word
        System.out.print("=> 수정할 단어 검색 : ");
        String update_input = keyboard.nextLine();  // eliminate '\n'
        update_input = keyboard.nextLine();
        System.out.println();
        System.out.println("--------------------------------");
        wordCRUD.search(update_input);
        System.out.println("--------------------------------");
        // select word
        System.out.print("=> 수정할 번호 선택 : ");
        int update_num = keyboard.nextInt();
        wordCRUD.updateWord(update_num);    // update
    }

    public void deleteWord() {  // delete a word
        // search word
        System.out.print("=> 삭제할 단어 검색 : ");
        String delete_input = keyboard.nextLine();  // eliminate '\n'
        delete_input = keyboard.nextLine();
        System.out.println();
        System.out.println("--------------------------------");
        wordCRUD.search(delete_input);
        System.out.println("--------------------------------");
        // select word
        System.out.print("=> 삭제할 번호 선택 : ");
        int delete_num = keyboard.nextInt();
        wordCRUD.deleteWord(delete_num);    // delete
    }

    public void saveFile() {    // save
        wordCRUD.save();
        System.out.println("\n모든 단어 파일 저장 완료 !!!\n");
    }

}
