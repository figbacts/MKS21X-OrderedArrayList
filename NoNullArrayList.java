import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int index){
    super(index);
  }
  public T set(int index, T newthing){
    if (newthing == null){
      throw new IllegalArgumentException("You try to set a null");
    }
    return super.set(index,newthing);
  }
  public boolean add(T newthing){
    if (newthing == null){
      throw new IllegalArgumentException("You try to add a null");
    }
    return super.add(newthing);
  }
  public void add(int index, T test){
    if (test == null){
      throw new IllegalArgumentException("You try to add a null at" + index);
    }
    super.add(index,test);
  }

}
