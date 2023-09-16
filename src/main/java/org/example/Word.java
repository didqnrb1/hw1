package org.example;

public class Word {

    Word(){}
    Word(int id,int level,String word,String meaning){
        super();
        this.id = id;
        this.level = level;
        this.word= word;
        this.meaning =meaning;}

    private int id;
    public int getId() {
        return id;}
    public void setId(int id) {
        this.id = id;}


    private int level;
    public int getLevel() {
        return level;}
    public void setLevel(int level) {
        this.level = level;}


    private String word;

    public String getWord() {
        return word;}
    public void setWord(String word) {
        this.word = word;}

    private String meaning;
    public String getMeaning() {
        return meaning;}
    public void setMeaning(String meaning) {
        this.meaning = meaning;}

    public String toString() {

        String slevel = "";
        String str = null;
        for (int i = 0; i < level; i++) {
            slevel += "*";
            str = String.format("%-3s", slevel)
                    + String.format("%15s", word) + " " + meaning;

        }
        return str;
    }
    public String toFileString(){
    return this.level + "|" + this.word + "|" + this.meaning;
    }
}

