package Alan_in_Class;

public class DynamicArray {
    private int size = 0;
    private int [] data = new int[10];

    public void add(int value){
        data[size] = value;
        size++;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }
}
