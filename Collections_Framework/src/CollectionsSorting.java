import java.util.*;  
class CollectionsSorting{  
public static void main(String args[]){  
  
ArrayList<String> al=new ArrayList<String>();  
al.add("D");  
al.add("B");  
al.add("G");  
al.add("M");  
al.add("V");  
al.add("S");
  
Collections.sort(al);  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
}  
}  





