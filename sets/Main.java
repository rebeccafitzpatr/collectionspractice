import java.util.NoSuchElementException;

public class Main {
  public static void main(String[] args) {

    SetOfStrings set = new SetOfStrings();

    System.out.println(set.isMember("hello"));

    
    SetOfStrings set3;
set3 = new SetOfStrings();
set3.insertElement("a");
set3.insertElement("b");
set3.insertElement("c");
try{
  set3.deleteElement("d");
}
catch(NoSuchElementException e){
   //System.out.println("You can't delete a non-member");
}


    try{
      set.deleteElement("hello");
    } catch (NoSuchElementException e) {
      System.out.println("You can't delete a non-mem");
    }

    SetOfStrings set1, set2;
set1 = new SetOfStrings();
set2 = new SetOfStrings();
set1.insertElement("a");
set1.insertElement("b");
set1.insertElement("c");

set2.insertElement("c");
set2.insertElement("b");
set2.insertElement("a");
set2.insertElement("a");

System.out.println(set1.toString());
System.out.println(set2);

System.out.println(set1.size());
System.out.println(set2.size());
System.out.println(set1.equals(set2));
  }


}
