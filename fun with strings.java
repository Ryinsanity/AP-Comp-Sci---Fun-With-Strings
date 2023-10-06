//Name: Ryan Quach

//Fun with Strings Practice with Strings 


public class FunWithStrings{

//Class Variable should be private
   private String master;
//Constructor
//Assign str to class variable
   public FunWithStrings(String str){
   master=str;
   }
   
 //Returns a String that is the result of removing  
//count characters from the master string starting at start   
//Return null if start+number is greater than the length of the master string
//or if start or number are negative
   public String deleteNumber(int start,int count){
      if((start+count>master.length())||(start<0||count<0))
         return null;
      else return master.substring(0,start) + master.substring(start+count);
   }
 
 //Returns a String that is the result of removing   
//all the characters between start and end, inclusive, from the masterString  
//If the values of end and start seem to be switched, ie end is less than start, 
//then remove the characters from end to start inclusive 
//If start or end are negative
//or if start > length or   end + 1 > length return null
   public String deleteRange(int start,int end){
      if(start<0||end<0)
         return null;
      if((start>master.length())||(end+1>master.length()))
         return null;
      if(start<=end)
         return master.substring(0,start) + master.substring(end+1);
      else return 
      master.substring(0,end) + master.substring(start+1);
   }
 //Returns a String that is the result of removing 
//all the characters in the String between the first and second occurence of the 
//character at index. Keep both occurences of the character.  
//If that character is only in the String once, just return the masterstring
//Example  masterString  Elephants like plums
//removeBetween(3) returns  Elepplums
//removeBetwwen(16) returns Ellike plums
//Hint Use the two argument version of indexOf
   public String removeBetween(int index){
      char check = master.charAt(index);
      int first = master.indexOf(check);
      int second = master.indexOf(check,first+1);
      if (second==-1) return master;
      else return master.substring(0,first+1)+master.substring(second);
   }
 
 //Returns a String that is the result of replacing  
//the first instance of str1 with str2 in the master string. Returns the result
//If the word is not in the master string, just return the master string
   public String replaceWord(String str1,String str2){
      if (master.indexOf(str1)==-1)
      return master;
      else {
         String str3 = "";
         int poof = master.indexOf(str1);
         str3+=master.substring(0,poof);
         str3+=str2;
         str3+=master.substring(str3.length());
         return str3;
      }
   }
   
//Return a String which is the first x characters and last x characters of the master string.  
//Returns null if x < 0 or x > length of the master string
   public String firstLast(int x){
      if(x<0||x>master.length())
      return null;
      return master.substring(0,x)+master.substring(master.length()-x);
   }
//Return true if the numerical value of str is less than the length of the master string
//false otherwise
   public boolean checkSize(String str){
      int x = Integer.parseInt(str);
      if (x<master.length())
      return true;
      else return false;
   }
   
   //Return the masterString
   public String toString(){
      return master;
   }
   
   
   //Use the tests below to determine if your methods are working correctly
   //Then add your own tests.  
   //For each method the following methods
   //write one test that returns null and one that returns a String
   // deleteNumber,deleteRange, firstLast
   //For checkSize, write one test that returns true and another that returns false
   //For removeBetween and replaceWord write one test each that returns the Master String and another
   //that changes the Master String 
   public static void main(String[] args){
      FunWithStrings tester = new FunWithStrings("helicopter");
      FunWithStrings tester2 = new FunWithStrings("apples apply here");
      FunWithStrings tester3 = new FunWithStrings("Elephants like plums");
      System.out.println("Expected output - heer - Actual "+tester.deleteNumber(2,6));
      System.out.println("Expected output - null - Actual "+tester.deleteNumber(3,9));
      System.out.println("Expected output - heopter - Actual "+tester.deleteRange(2,4));
      System.out.println("Expected output - hepter - Actual "+tester.deleteRange(5,2));
      System.out.println("Expected output - null - Actual " + tester.deleteRange(-3,2));
      System.out.println("Expected output - Elepplums - Actual "+ tester3.removeBetween(3));
      System.out.println("Expected output - Ellike plums - Actual "+ tester3.removeBetween(16));
       System.out.println("Expected output - Elephants like plums - Actual "+ tester3.removeBetween(17));
      System.out.println("Expected output - dogles apply here - Actual "+tester2.replaceWord("app","dog"));
      System.out.println("Expected output - helter - Actual "+tester.firstLast(3));
      System.out.println("Expected output - null - Actual "+tester.firstLast(12));
      System.out.println("Expected output - true - Actual "+tester.checkSize("5"));
      System.out.println("Expected output - false - Actual "+tester.checkSize("15"));   
   }
   
}
