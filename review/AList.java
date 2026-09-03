package review;
//items: [1,1,1,0,0 ]
//size : 2
public class AList <Type> {
    public static void main(String[] args) {
        AList<Integer> a = new AList();
        a.addLast(10);
        a.addLast(12);

        AList<String> s = new AList<>();
        s.addLast("Hello");
        s.addLast("World");

    }

    private Type[] items; // storage for elements of the ArrayList
    private int capaicty = 100;
    private int size = 0;
    public AList(){
        this.items = (Type[])new Object[capaicty];
        this.size = 0;
    }

    public AList(int capaicty){
        this.capaicty = capaicty;
        this.items = (Type[])new Object[capaicty];
        this.size = 0;
    }
    public void addLast(Type value){
        this.items[size] = value;
        size  ++;

    }

    public void add(int index, Type value){
        // We assume size +1 <= this.capacity
        for(int i = this.size -1; i >=index ; i--){
            // elements shift backwards
            this.items[i+ 1] = this.items[i];
        }
        this.items[index] = value;
        this.size ++;
    }

    public Type getLast(){
        return this.items[size -1];
    }

    public Type get(int pos){
        if(pos < 0 || pos >= size){
            throw new RuntimeException("Illegal position parameter");
        }
        //happy case. pos < this.size
        return this.items[pos];

    }

    public Type removeLast(){
        Type result = getLast();
        size --;
        return result;

    }

    public Type remove(int position){
        if(position < 0 || position >= size){
            throw new RuntimeException("Illegal position parameter");
        }


        Type result = this.items[position];
        for(int i = position; i < this.size -1; i++){
            this.items[i]  = this.items[i+1];
        }
        size --;

        return result;
    }




}
