// manage crud works according to users

package org.example;

import java.util.Scanner;

public class WordManager {

    public void start() {   // program starts
        System.out.println("*** 영단어 마스터 ***");

        int menuNum;    // variable : input manu number
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            printMenu();
            menuNum = keyboard.nextInt();

            if (menuNum==0) break;          // input 0 : end the program
            if (menuNum==1) listAllWord();  // input 1 : list all words
            else if (menuNum==4) addWord(); // input 4 : add a word
        }

        exit();
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

    public void exit() {
        System.out.println("\n프로그램 종료! 다음에 만나요~\n");
    }

    public void listAllWord() { // menu 1 : show list of all words
        System.out.println();
        System.out.println("--------------------------------");

        System.out.println("--------------------------------");
        System.out.println();
    }

    public void addWord() {     // menu 4 : add new word
        System.out.println("\n새 단어가 단어장에 추가되었습니다 !!!\n");

    }

}
