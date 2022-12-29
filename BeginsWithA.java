package Lesson04;

public class BeginsWithA extends Module<String> {

    @Override
    public boolean isGood(String item) {
        return item.startsWith("A");
    }

}
