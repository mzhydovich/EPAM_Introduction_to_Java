package Text;

public class Sentence {
    private String sentence = "";

    public Sentence() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Sentence(String sentence) {
        super();
        this.sentence = sentence;
    }


    public String getSentence() {
        return sentence;
    }


    public void addWord(Word word) {
        sentence = sentence + word.getWord() + " ";
    }
}
