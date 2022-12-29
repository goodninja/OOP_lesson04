package Lesson04;

public class IsEven extends Module<Integer> {

    @Override
    public boolean isGood(Integer item) {
        return item % 2 == 0;
    }
}
