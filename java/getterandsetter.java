public class getterandsetter {
     private String name;
     private  int marks;

     void  setname(String name)
     {
        this.name=name;
     }
     void setmarks(int marks)
     {
        if (marks>=0 && marks<=100) {
             this.marks=marks;
        }
        else
        {
            System.out.println("invalid");
        }
     }
     String getname()
     {
        return name;
     }
     int getmarks()
     {
        return  marks;
     }
     
        public static  void main(String args[])
        {
            getterandsetter a1=new getterandsetter();
            a1.setname("vikrant");
            a1.setmarks(80);
            System.out.println("name"+a1.getname());
            System.out.println("marks"+a1.getmarks());
        }
     
        
     }

