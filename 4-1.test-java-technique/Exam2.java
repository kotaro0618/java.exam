public class Exam2 {
    public static void main(String[] args) {
        String famousSpeech="Stay hungry,stay foolish.";
        String[]nums=famousSpeech.split("h");
    for(String num:nums){
        System.out.println("hungryは"+num+"番目から始まります");
    }
    }
}
