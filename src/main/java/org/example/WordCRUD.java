package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{

    ArrayList<Word> list;
    Scanner s = new Scanner(System.in);
    WordCRUD(Scanner s){
        list = new ArrayList<>();
    }


    public Object add() {
        System.out.print("\n=>난이도(1,2,3) & 새 단어 입력 : ");
        int level = s.nextInt();
        String word = s.next();
        s.nextLine();

        System.out.print("뜻 입력 : ");
        String meaning = s.next();


        return new Word(0, level, word, meaning);
    }

    public void addWord() {
    Word one = (Word)add();
    list.add(one);
    System.out.println("\n새 단어가 단어장에 추가되었습니다 !!!\n");
    s.nextLine();

    }

    public int update(Object o) {
        return 0;
    }


    public int delete(Object o) {
        return 0;
    }


    public void selectOne(int id) {

    }


    public void listAll(){
        System.out.println("--------------------------------");

        for(int i = 0 ; i< list.size(); i++){
            System.out.print((i+1) + " ");
            System.out.println(list.get(i).toString());}

        System.out.println("--------------------------------");
        }
    }



