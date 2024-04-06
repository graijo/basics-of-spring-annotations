import java.util.HashSet;

public class InterviewMain {

    //print non repeating letters in the string
    //Air India Interview
    public void printNonRepeatingChars(String word){
        HashSet hashSet=new HashSet<>();
        String[] letters=word.toLowerCase().split("");
        for(String l:letters){
            if(hashSet.add(l)){
                System.out.print(l);
            }
        }
    }
    public static void main(String[] args){
        InterviewMain interviewMain=new InterviewMain();
        interviewMain.printNonRepeatingChars("India");

    }
}
