public class RecursionDriver
{
 
 // Task 1
 public static int count(int n)
 {
     if (n<1)
        return 0;
     return 4+count(n-1);
 }
 
 // Task 2
 public static int count2(int n)
 {
     if (n<1)
        return 0;
     return 20+count2(n-1);
 }
 
 // Task 3
 public static int count3(int n)
 {
     if (n<1)
        return 0;
     return 10+count3(n-1);
 }
 
 
 public static void main(String[] args)
 {
 /*
  * Tasks 
  * 1. Number of legs 10 elephant have
  * 2. Number of students in a school if each
  *    class has 20 students and there are 12 rooms
  * 3. Number of fingers if there are 8 people
  * 4. Find the sum of odd numbers from 0 to N
  * 5. Find the sum of even numbers from 0 to N
  */ 
 
 // Task 1
 int counted=0;
 counted = count(10);
 System.out.println("Task 1");
 System.out.println(counted);
 System.out.println(" ");
 
 // Task 2
 int counted2=0;
 counted2 = count2(12);
 System.out.println("Task 2");
 System.out.println(counted2);
 System.out.println(" ");
 
 // Task 3
 int counted3=0;
 counted3 = count3(8);
 System.out.println("Task 3");
 System.out.println(counted3);
 System.out.println(" ");
 
 // Task 4
 int counted4=0;
 counted4 = count(20);
 System.out.println(counted4);
 }
}