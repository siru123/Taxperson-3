
import java.util.*;
public class Taxable{

//String in ="";
double cost;
public static void main(String[]args){

Taxable tx =new Taxable();

tx.calculate();
}

public void calculate(){

String status;
Scanner input = new Scanner(System.in);
System.out.println("Please input the cost of the item in dollars");
cost = input.nextDouble();
System.out.println("Please input if the item is necessary or luxury:\n Id necessary press n if luxury press l");
status = input.next();
if(status.equalsIgnoreCase("n")){
cost+= cost* 0.1;
}
else if(status.equalsIgnoreCase("l")){
cost+=cost*.9;
}
else{
System.out.println("Wrong input");
System.exit(0);
}
System.out.printf("The cost is %.2f", cost);
}



}