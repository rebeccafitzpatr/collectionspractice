import java.util.NoSuchElementException;

public class Main {
  public static void main(String[] args) {

    SetOfStrings set = new SetOfStrings();

    System.out.println(set.isMember("hello"));

    
    
    try{
      set.deleteElement("hello");
    } catch (NoSuchElementException e) {
      System.out.println("Theere is no such element in the set");
    }
  }
}
