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
      if (this.get(i).compareTo() <= 0){
        index ++;
      }
    }
  }
  public boolean add(T newthing){
    int index = findIndex(newthing);
    return super.add(index, newthing);
  }
  public void add(int index, T newthing){
    int inde = findIndex(newthing);
    return super.add(inde, newthing);
  }
}
