public class object_referance_assignment {
     String name;
     int age;



 
    
 
    public  static  void main(String args[])
    {
        object_referance_assignment a1 = new object_referance_assignment();
        object_referance_assignment a2=a1;
        a1.name="vikrant";
        System.out.println(a1.name);
        System.out.println(a2.name);
    }
 
}