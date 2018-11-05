public class RecursionDriver
{
 
 public static int count(int n)
 {
     if (n<1)
        return 0;
     return 2+count(n-1);
 }
 
 public static int count2(int n)
 {
     if (n<1)
        return 0;
     return 2+count(n-1);
 }
 
 public static void main(String[] args)
 {
 /*
  * Count 
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
 System.out.println(counted);
 
 // Task 2
 int counted2=0;
 counted2 = count(20);
 System.out.println(counted2);
 }
}