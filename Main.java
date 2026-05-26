class bike extends vehicle{
bike (String n, int no, String h){
super(n, no, h);
}
}

class car extends vehicle{
car (String n, int no, String h){
super(n,no,h);
}
}

class truck  extends vehicle{
truck (String n, int no, String h){
super(n, no , h);
}
}

class vehicle {
String name;
int num;
String horn;
vehicle ( String n, int no, String h){
name=n;
num=no;
horn=h;
}
 void drive (){
System.out.println( name+ " vehicle is driven");
 }
 void honk (){
System.out.println(" vehicle horn : " +   horn);
 }
 void startEngine(){
System.out.println( name + " vehicle engine started");
}

}

public class Main{
    public static void main ( String[] args ){
bike b = new bike ("Honda", 1523,"Peep Peep");
car c = new car ("Toyota", 965, "Honk Honk");
truck t = new truck ("Suzuki", 1234, "Vopu Vopu");
b. drive();
b.honk();
b.startEngine();

c. drive();
c.honk();
c.startEngine();

t. drive();
t.honk();
t.startEngine();


    }
}


