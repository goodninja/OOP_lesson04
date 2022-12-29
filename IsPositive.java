package Lesson04;

public class IsPositive extends Module<Integer> {

    @Override
    public boolean isGood(Integer item) {
        return item > 0;
    }

}
