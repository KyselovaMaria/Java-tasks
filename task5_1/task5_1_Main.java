package task5_1;

public class task5_1_Main {
    public static void main(String[] args){
        Word word1 = new Word("Glory");
        Word word2 = new Word("to");
        Word word3 = new Word("Ukraine");
        Word mas[] = new Word[]{word1, word2, word3};
        Sentence sentence1 = new Sentence(mas);
        Sentence sentence2 = new Sentence(mas);
        Sentence sentence3 = new Sentence(mas);
        Sentence mas2[] = new Sentence[]{sentence1, sentence2, sentence3};
        Text text = new Text(mas2);
        Text text2 = new Text(mas2);
        System.out.println(text);
        System.out.println(text.equals(text2));
        System.out.println(text.hashCode());
    }
}
