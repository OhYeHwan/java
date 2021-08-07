package ch5;


public class Ex5_5 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;
        int[] score = { 50, 70, 80, 100, 50};

        for(int i=0; i<score.length; i++) {
            sum += score[i];
        }
        average = sum / (float)score.length;

        System.out.println("총점  : " +sum);
        System.out.println("평균 : " + average);
    }
}
