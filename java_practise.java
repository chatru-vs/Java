package com.codewithchatru; //reverse domain name is  the package name
public class Main {
static int sum(int a, int b){ //making mathod of sum of two numbers
        return a+b;
}
public static void main(String[] args) {
    String name = "chatru";
	System.out.println(name);
    System.out.println(sum(5, 7));
	int a = 45, x=58, y=67;
    float b = 55.22f;
    System.out.println(a + x + y);
    System.out.println(b);
    double d = 56.777777d;
    System.out.println(d);
    String h = "vicky";
    float num1 = 45.45f;
    int num2 = 79;
    System.out.print("The value of num1 + num2 is ");
    System.out.println(num1 + num2);
    System.out.print("The value of num1 * num2 is ");
    System.out.println(num1 * num2);
    System.out.print("The value of num1 % num2 is ");
    System.out.println(num1 % num2);
    System.out.println(num1++);
    System.out.println(num1);
    System.out.println(++num1);
    System.out.println(num1);
    System.out.println(num1--);
    System.out.println(--num1);
	Scanner scan = new Scanner(System.in); // take user's input in java
    String input1    = scan.nextLine();
    System.out.println(input1);
    Scanner scan1 = new Scanner(System.in);
    System.out.println("Enter age");
    int input = scan.nextInt();
    System.out.println(input);
	 System.out.println(name.contains("Har")); //string operator
    System.out.println(name.charAt(0));
    System.out.println(name.endsWith("ry"));
    System.out.println(name.indexOf("rry"));
	String name = "chatru";
    String channel = "CodeWithchatru";
    System.out.println(name + " from \" " + channel); //escape sequence charactor
    System.out.println(name + " from \\ " + channel); //escape sequence charactor
    System.out.println(name + " from \n" + channel); //escape sequence charactor
	System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
	//Math class in Java
	 int  num1 = 4, num2 =7;
    System.out.println(Math.max(num1, num2));
    System.out.println(Math.min(num1, num2));
    System.out.println(Math.sqrt(36));
    System.out.println(Math.abs(-36));
    System.out.println(Math.abs(6));
    System.out.println(4+(8-4)*Math.random());// Generate number between 4 to 8
	// condition check
	Scanner scan1 = new Scanner(System.in);
    System.out.println("Enter age");
    int age = scan1.nextInt();Scanner scan1 = new Scanner(System.in);
    System.out.println("Enter age");
    int age = scan1.nextInt();
    if(age>20){
        System.out.println("you are an adult");
    }
    else if(age>5){
        System.out.println("you are not a kid");
    }
    else{
        System.out.println("you are not a kid");
    }
	
	//switch with break case
	Scanner scan1 = new Scanner(System.in);
    System.out.println("Enter age");
    int age = scan1.nextInt();
    switch (age){
        case 12:
            System.out.println("you are 12 year old");
            break;
        case 56:
            System.out.println("You are 56 year old");
            break;
        case 16:
            System.out.println("you are 16 year old");
            break;
        default:
            System.out.println("you did not match any of any cases");
    }
	//while, do while  and For loop
	 int i = 0;
    while (i<100){
        System.out.println(i);
        i += 1;
    }
    int j = 0;
    do{
        System.out.println(j);
        j +=1;
    }while (j<100);
	
	// for with break loop
	
	for (int i = 0; i < 10; i++) {
            if (i > 2) {
               break; //leave the loop
                
            } else {
                System.out.println(i);

            }

        }
		
		//for with continue loop
	for (int i = 0; i < 10; i++) {
            if (i == 2) { 

               continue; // forget below statement and enter the loop
            } else {
                System.out.println(i);

            }

        }
		//Array
		
    int [] marks = {1,2,3,4};
        marks[3] = 35;
        System.out.println(marks[2]);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        //for each loop
        for(int value:marks){
            System.out.println(value);
        }
        int [] [] matrix = {{4,5,6},                {7,8,9}};
        System.out.println(matrix[1][1]);
        String [] cars = {"maruti", "suzuki", "innova", "ford"};
        for(String Value:cars){
            System.out.println(Value);
        }
		//try and catch
		 String[] cars = {"maruti", "suzuki", "innova", "ford"};
        try {
            System.out.println(cars[5]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("masoom");
	}
}
