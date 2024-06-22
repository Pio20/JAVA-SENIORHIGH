import java.io.*;
class piolo{
public static void main(String[]args) throws Exception{
BufferedReader GG=new BufferedReader(new InputStreamReader(System.in));
int a;
int b;
int c;
int p;
int i;
int o;
int gg;
int am;
int z=2;
double j=0.1;
double k=0.2;
double l=0.6;
double m=0.2;
double pt=0.60;

/**
1st quiz+2nd quiz+3rd quiz divide by / 3 equals to Written Works Grade
*/

System.out.println("####################################\n");
System.out.print("Enter Quiz 1:");
a=Integer.parseInt(GG.readLine());

System.out.print("Enter Quiz 2:");
b=Integer.parseInt(GG.readLine());

System.out.print("Enter Quiz 3:");
c=Integer.parseInt(GG.readLine());

System.out.println("Written Works Grade:" +(a+b+c)/(3));
System.out.println("/////////////////////////////////\n");


/**
Ang shs =p ay multiply sa  0.1 = j
*/
System.out.println("###################################");
System.out.print("Ente SHS Assesment Grade:");
p=Integer.parseInt(GG.readLine());

System.out.println("SHS Assessment Grade: "+(p*j));
System.out.println("/////////////////////////////////\n");


/**
para makuha ang total ay
PT1= i    PT2= o PT1+PT2 or i*o divided by z Z= 2
*/
System.out.println("####################################");
System.out.print("Enter PT1:");
i=Integer.parseInt(GG.readLine());

System.out.print("Enter PT2:");
o=Integer.parseInt(GG.readLine());

double pttask = (i*pt) + (o*pt);
System.out.println("Performance Task Grade:"+(pttask)/(z));
System.out.println("/////////////////////////////////\n");


/**
Quarterly exam = am tapos multiply sa k= 0.2
*/
System.out.println("####################################");
System.out.print("Enter Quarterly Exam Grade:");
am=Integer.parseInt(GG.readLine());
System.out.println("Enter Quarterly Exam Grade:\n"+(am*k));


/**
Total ng final grade
*/
System.out.print("Final Grade:"+((a+b+c)/(3)*(j)+(p*j)+(pttask)/(z)*(l)+(am*m)));

/**
Display
try yung if(value>=75){ System.out.println("passed");} 
=mali

try if else if 
if(value>=0 &&value<=59){
	System.out.println("Not Included");
}
else(value>=60 &&value<=74){
	System.out.println("Did Not Meet Expectation");
	}
if(value>=75 &&value<=79){
	System.out.println("Fairly Satisfactory");
}
=mali

try paghiwalayin ang  0 and 59 
if(value<=0){ System.out.println("Not Included");} 
if(value>=59){ System.out.println("Not Included");} 
=nasama lahat 

try &&
if(value>=0 &&value<=59){
	System.out.println("Not Included");
}
if(value>=60 &&value<=74){
	System.out.println("Did Not Meet Expectation");
}
= X

if (i == 3) {
    doSomething();
} else if (i == 2) {
    doSomethingElse();
} else {
    doSomethingDifferent();
}
= correct

*/

if(((a+b+c)/(3)*(j)+(p*j)+(pttask)/(z)*(l)+(am*m))<=59.0){System.out.println("Not Included");}

	
else if(((a+b+c)/(3)*(j)+(p*j)+(pttask)/(z)*(l)+(am*m))<=74.0){System.out.println("Did Not Meet Expectations");}
	

else if(((a+b+c)/(3)*(j)+(p*j)+(pttask)/(z)*(l)+(am*m))<=79.0){System.out.println("Fairly Satisfactory");}
	
	
else if(((a+b+c)/(3)*(j)+(p*j)+(pttask)/(z)*(l)+(am*m))<=84.0){System.out.println("Satisfactory");}
	
	
else if(((a+b+c)/(3)*(j)+(p*j)+(pttask)/(z)*(l)+(am*m))<=89.0){System.out.println("Very Satisfactory");}
	
	
else if(((a+b+c)/(3)*(j)+(p*j)+(pttask)/(z)*(l)+(am*m))<=100.0){System.out.println("Outstanding");}
	

else{System.out.println("Not Included");}
	

}
}

