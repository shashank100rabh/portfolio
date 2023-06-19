public class Main {

    public static void main(String[] args)
    {
	// write your code here
        DailyWorker a=new DailyWorker("jimmmy",4000,6);
        a.show();
        System.out.println("the salary of the daily worker is:"+a.compay());
        Salaried_Worker b=new Salaried_Worker("mandy",400,24);
        b.show();
        System.out.println("the wage of the worker is:"+b.compay());

    }
}
abstract class Worker{


    public String Name;
    public int rate;


    Worker(String name,int r){
        Name=name;
        rate=r;
    }
    public void show(){
        System.out.println("the Name of the worker is:"+Name );
        System.out.println("The rate of the worker is:"+rate);
    }
}
class DailyWorker extends Worker{
private int days;

    DailyWorker(String name,int rate,int day){
        super(name,rate);
        days=day;

    }
    public float compay(){
       int salary =rate*days;
       return salary;
    }

}
class Salaried_Worker extends Worker{


    public int hours;
    Salaried_Worker(String name,int rate,int hrs){
        super(name,rate);

        hours=hrs;
    }
    public float compay(){
       float Wage;
        if(hours>=40){
            Wage=rate*40;
        }
        else{
             Wage=rate*hours;
        }

        return Wage;
    }


}


