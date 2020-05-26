package chapter_01.L01_JavaToGroovy

public class SleepException {

    public static void main(String[] args) {
        try{
            Thread.sleep(1000)
        }catch(Exception e){
            e.printStackTrace()
        }
    }
}
