import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    HashMap<Character,String> hm=new HashMap<Character,String>();
    hm.put('2',"abc");
    hm.put('3',"def");
    hm.put('4',"ghi");
    hm.put('5',"jkl");
    hm.put('6',"mno");
    hm.put('7',"pqrs");
    hm.put('8',"tuv");
    hm.put('9',"wxyz"); 
    ArrayList<String> ar=new ArrayList<String>();
    char c[]=new char[s.length()];
    for(int i=0;i<s.length();i++){
      c[i]=' ';
    }
    for(int i=0;i<hm.get(s.charAt(0)).length();i++){
        c[0]=hm.get(s.charAt(0)).charAt(i);
        phoneDigit(c,s,ar,1,1,hm);
        System.out.println("Hello");
    }
    for(int i=0;i<ar.size();i++){
      System.out.println(ar.get(i));
    }
  }
  public static void phoneDigit(char c[],String s,ArrayList<String> ar,int in,int strin,HashMap<Character,String> hm){
    System.out.println(strin+" "+in);
    for(int i=0;i<s.length();i++){
      c[in]=hm.get(s.charAt(strin)).charAt(i);
      // for(int j=0;j<s.length();j++){
      //   System.out.print(c[j]+" ");
      // }
      // System.out.println();
      if(in==s.length()-1){
        //System.out.println(in);
        String v="";
        for(int j=0;i<s.length();j++){
            v=v+Character.toString(c[j]);
        }
        ar.add("abc");
      }
      else{
        System.out.println(strin+1+" "+in+1);
        phoneDigit(c,s,ar,in+1,strin+1,hm);
        c[in+1]=' '; 
      }
    }
  }
}
