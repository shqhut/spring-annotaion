package com.shq.designPattern.SingLeton;

public class TestLazySingLeton {

    public static void main(String[] args) {

    }
}

class LazySingLeton {

    private static volatile LazySingLeton lazySingLeton;

    private LazySingLeton(){

    }

    public static LazySingLeton getLazySingLeton(){
        if (lazySingLeton == null){
            synchronized (LazySingLeton.class) {
                if (lazySingLeton == null){
                    lazySingLeton = new LazySingLeton();
                }
            }
        }
        return lazySingLeton;
    }

}