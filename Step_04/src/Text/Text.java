package Text;

public class Text {
    private String header = "";
    private String text = "";

    public Text() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getText() {
        return text;
    }


    public void addText(Word word) {
        text = text + word.getWord();

    }

    public void addText(Sentence... sentence) {
        for (int i = 0; i<sentence.length; i++) {
            text = text + sentence[i].getSentence();
        }

    }

    public void addHeader(Word word) {
        text = text + word.getWord();

    }

    public void addHeader(Sentence sentence) {
        text = text + sentence.getSentence();
    }

    public void printText() {
        System.out.println(text);
    }

    public void printHeader() {
        System.out.println(header);
    }

}