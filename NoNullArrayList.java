public class NoNullArrayList<T> extends ArrayList<T>{
  import java.util.ArrayList;
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int index){
    super(index);
  }
  public String set(int index, String newthing){
    if (newthing == null){
      throw new IllegalArgumentException("You try to set a null");
    }
    super(index,newthing);
  }
  public void add(String newthing){
    if (newthing == null){
      throw new IllegalArgumentException("You try to add a null");
    }
    super(newthing);
  }
  public void add(int index, String test){
    if (newthing == null){
      throw new IllegalArgumentException("You try to add a null at" + index);
    }
    super(index,test);
  }
  
}
