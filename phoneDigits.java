/*Print all possible words from phone digits using BACKTRACKING*/
import java.util.*;
/*                      MODEl-1:USING COLLECTIONS                    */
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap < Character, String > hm = new HashMap < Character, String > ();//creating hash map like dial pad in phone
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        ArrayList < String > ar = new ArrayList < String > ();
        char c[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {//assign empty spaces to whole array
            c[i] = ' ';
        }
        for (int i = 0; i < hm.get(s.charAt(0)).length(); i++) {
            c[0] = hm.get(s.charAt(0)).charAt(i);
            phoneDigit(c, s, ar, 1, 1, hm);//calling phoneDidit() function
            //System.out.println("Hello");
        }
        for (int i = 0; i < ar.size(); i++) {//traversing the arrrayList
            System.out.println(ar.get(i));
        }
    }
    public static void phoneDigit(char c[], String s, ArrayList < String > ar, int in , int strin, HashMap < Character, String > hm) {
        //System.out.println(strin+" "+in);
        for (int i = 0; i < hm.get(s.charAt(strin)).length(); i++) {//iterating upto string length times
            c[ in ] = hm.get(s.charAt(strin)).charAt(i);//retriving value from hashmap and storing in the character array
            if ( in == s.length() - 1) {//base case
                String v = "";
                for (int j = 0; j < s.length(); j++) {
                    v = v + Character.toString(c[j]);//converting character to string using toString Method
                }
                ar.add(v);//adding value to arraylist 
            } else {
                //System.out.println(strin+1+" "+in+1);
                phoneDigit(c, s, ar, in +1, strin + 1, hm);//calling recursive function
                c[ in +1] = ' ';//after backtracking replace the value with empty space
            }
        }
    }
}

/*
*                       MODEL-2: USING FUNCTION                         

public class Solution {
    public ArrayList<String> letterCombinations(String s) {
    HashMap<Character,String> hm=new HashMap<Character,String>();
    hm.put('1',"1");
    hm.put('0',"0");
    hm.put('2',"abc");
    hm.put('3',"def");
    hm.put('4',"ghi");
    hm.put('5',"jkl");
    hm.put('6',"mno");
    hm.put('7',"pqrs");
    hm.put('8',"tuv");
    hm.put('9',"wxyz");
    ArrayList<String> ar=new ArrayList<String>();
    if(s.length()==1){
        for(int i=0;i<hm.get(s.charAt(0)).length();i++){
            ar.add(Character.toString(hm.get(s.charAt(0)).charAt(i)));
        }
        return ar;
    }    
    char c[]=new char[s.length()];
    for(int i=0;i<s.length();i++){
      c[i]=' ';
    }
    for(int i=0;i<hm.get(s.charAt(0)).length();i++){
        c[0]=hm.get(s.charAt(0)).charAt(i);
        phoneDigit(c,s,ar,1,1,hm);
        //System.out.println("Hello");
    }
    return ar;
  }
  public static void phoneDigit(char c[],String s,ArrayList<String> ar,int in,int strin,HashMap<Character,String> hm){
    //System.out.println(strin+" "+in);
    for(int i=0;i<hm.get(s.charAt(strin)).length();i++){
      c[in]=hm.get(s.charAt(strin)).charAt(i);
      if(in==s.length()-1){
        String v="";
        for(int j=0;j<s.length();j++){
            v=v+Character.toString(c[j]);
        }
        ar.add(v);
      }
      else{
        //System.out.println(strin+1+" "+in+1);
        phoneDigit(c,s,ar,in+1,strin+1,hm);
        c[in+1]=' '; 
      }
    }
  }
}*/
