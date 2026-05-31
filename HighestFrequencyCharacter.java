import java.util.Scanner;
class HighestFrequencyCharacter{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String str=sc.nextLine();
    int maxCount=0;
    char maxChar="";
    for(int i=0;i<str.length();i++){
      int count=0;
      for(int j=0;j<str.length();j++){
        if(str.charAt(i)==str.charAt(j)){
          count++;
          if(count>maxCount){
            maxCount=count;
            maxCount=str.charAt(i);
          }}
        System.out.println("character="+maxChar);
         System.out.println("Frequency="+maxCount);
      }
    }}}
