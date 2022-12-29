package Lesson04;

public class BeginsWith extends Module<String> {

    private String beginElements;

    public BeginsWith(String beginElements) {
        this.beginElements = beginElements;
    }

    public String getBeginElements() {
        return beginElements;
    }

    @Override
    public boolean isGood(String item) {
        return item.startsWith(beginElements);
    }

}
