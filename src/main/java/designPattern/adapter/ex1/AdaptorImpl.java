package main.java.designPattern.adapter.ex1;

public class AdaptorImpl implements Adapter{
    /*아주 간단한 예제
    * MATHclass의 메서드를 이용을 해야하는데
    * */

    @Override
    public Float twiceOf(Float num) {

        return (float)Math.twice(num.doubleValue());

    }

    @Override
    public Float halfOf(Float num) {
        return (float)Math.half(num.doubleValue());
    }
}
