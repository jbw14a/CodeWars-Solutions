import java.lang.ref.Cleaner;
import java.util.HashMap;
import java.util.Map;

public class CodeWars {

    public static void main(String[] args) {
        String[] art = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
    	String[] cd = new String[] {"A", "B"};
        System.out.println(stockSummary(art, cd));
    }

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        // Help the bookseller!
        if(lstOfArt.length == 0 || lstOf1stLetter.length == 0)
            return "";
        
        HashMap<String, Integer> result = new HashMap();

        for(String letter : lstOf1stLetter){
            int count = 0;
            for(String code : lstOfArt){
                if(letter.equals(String.valueOf(code.charAt(0)))){
                    count += Integer.parseInt(code.substring(5, code.length()));
                    result.put(letter, count);
                }
            }
            count = 0;
        }
        
        String resultString = "";
        for(Map.Entry<String, Integer> pair: result.entrySet()){
            resultString += "(" + pair.getKey() + " : " + pair.getValue().toString() + ") - ";
        }
        resultString = resultString.substring(0, resultString.length()-3);
        return resultString;
    }
    
    public static int digitalRoot(int n) {
        String input = Integer.toString(n);
        
        int sum = 0;
        for(int i=0; i < input.length(); i++){
            int num = Integer.parseInt(String.valueOf(input.charAt(i)));
            sum+=num;
        }

        if(sum > 10)
            return digitalRoot(sum);

        return sum;
      }

    public static String[] stringSplit(String s) {
        if(s == null || s.isEmpty())
            return new String[0];

        String input = s.length() % 2 == 0 ? s : s + "_";
        String[] result = new String[input.length() / 2];
        
        int counter = 0;
        for(int i=0; i < input.length(); i+=2){
            result[counter] = input.substring(i, i+2);
            counter++; 
        }

        return result;
    }
    
    public static String createPhoneNumber(int[] numbers) {
        String result = "";
        for(int i=0; i < numbers.length; i++){
          //Area Code
          
          if(i==0){ result += "(" + numbers[0];  }
      
          else if(i==1){ result += numbers[1]; }
          
          else if(i==2){ result += numbers[2] + ") "; }
            
          
          // Rest of Phone number
            
          else if(i==3){ result += numbers[3]; }
          
          else if(i==4){ result += numbers[4]; }
          
          else if(i==5){ result += numbers[5] + "-"; }        
          
          else if(i==6){ result += numbers[6]; }
            
          else if(i==7){ result += numbers[7]; }
            
          else if(i==8){ result += numbers[8]; }
            
          else if(i==9){ result += numbers[9]; }
        }
        return result;
      }

      public static String toJadenCase(String phrase) {
    
        if(phrase != null){
            if(!phrase.isEmpty()){
                String result = "";
                String[] arrayOfWords = phrase.split(" ");
                
                for(int i=0; i < arrayOfWords.length; i++){
                    String word = arrayOfWords[i];
                    String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                    if(i == arrayOfWords.length-1){
                        result += capitalizedWord;
                    }
                    else{
                        result += capitalizedWord + " ";
                    }
                }
                return result;
            
            }
        }
		return null;
    }

}