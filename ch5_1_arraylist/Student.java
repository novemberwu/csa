package ch5_1_arraylist;

public class Student {
    private final int id;
    private final String name;

    public Student(int id, String name){
         this.id = id;
         this.name = name;
    }
    public int getId(){return id;}
    public String getName(){return name;}
    @Override
    public String toString(){
        return id+"|"+name;
    }

    @Override
    public boolean equals(Object o){

        if(o == null || !(o instanceof Student)) return false;
        if(this == o) return true;
        Student s = (Student) o;
        return this.id == s.id ;
    }

    @Override
    public int hashCode(){
        int result = Integer.hashCode(id);
        return result;
    }


}
