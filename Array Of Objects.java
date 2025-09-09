public class Student {

 int age;

 String name;

 Student(int age, String name)

 {

  this.age=age;

  this.name=name;

 }

 public static void main(String [] args)

 {

  Student s1= new Student(22, "Vijeth");

  Student s2= new Student(24,"Ganesh");

  Student[] s=new Student[2];

  s[0] =s1;

  s[1] =s2;

  for(int i=0;i<s.length;i++)

  {

   System.out.println(s[i].age+" "+s[i].name);

  }

 }

}

public class Student {

 int age;

 String name;

 Student(int age, String name)

 {

  this.age=age;

  this.name=name;

 }

 @Override

 public String toString()

 {

  return this.age+" "+this.name;

 }

 public static void main(String [] args)

 {

  Student s1= new Student(22, "Vijeth");

  Student s2= new Student(24,"Ganesh");

  Student[] s=new Student[2];

  s[0] =s1;

  s[1] =s2;

  for(int i=0;i<s.length;i++)

  {

   System.out.println(s[i].age+" "+s[i].name);

  }

 }

}

public class Laptop {

int cost;

String Company;

int ramsize;

Laptop(int cost, String Company, int ramsize)

{

 this.cost=cost;

 this.Company=Company;

 this.ramsize=ramsize;

}

@Override

public String toString()

{

 return this.cost+" "+this.Company+" "+this.ramsize;

}

public static void main(String[] args) {

 Laptop l1=new Laptop(654,"Victus",8);

 Laptop l2=new Laptop(6548,"Acer",6);

 Laptop l3=new Laptop(65454,"Asus",4);

 Laptop l4=new Laptop(56,"HP",2);

 Laptop l5=new Laptop(6547,"TUF",12);

 Laptop [] l={l1,l2,l3,l4,l5};

 for(int i=0;i<l.length;i++)

 {

  System.out.println(l[i]);

 }

}

}

