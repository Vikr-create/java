class student{
    String name;
    int marks;

}
class stufactory
{
    student createstu(){
        student s =new student();
        s.name="vikrant";
        s.marks=70;
        return s;
    }
}
     class returing_ob_frommethod {
       public static void main(String[] args)  {
       
         stufactory f1= new stufactory();
        student s1 = f1.createstu();

        System.out.println(s1.name);
        System.out.println(s1.marks);
       }
    
        
    }


