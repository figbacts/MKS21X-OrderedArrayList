import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int index){
    super(index);
  }
  private int findIndex (T newthing){
    int index = 0;
    for (int i = 0; i < this.size(); i ++){
      if (this.get(i).compareTo(newthing) <= 0){
        index ++;
      }
    }
    return index;
  }
  public boolean add(T newthing){
    int index = findIndex(newthing);
    super.add(index, newthing);
    return true;
  }
  public void add(int index, T newthing){
    int inde = findIndex(newthing);
    super.add(inde, newthing);
  }
  public T set(int index, T newthing){
    int inde = findIndex(newthing);
    super.remove(index);
    this.add(inde,newthing);
    return newthing;
  }
}
