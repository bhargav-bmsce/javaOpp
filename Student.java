import java.util.Scanner;

class Student{
   String usn;
   String name;
   void accept(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Your USN: ");
      this.usn = sc.nextLine(); 
       System.out.println("Enter Your Name: ");
      this.name = sc.nextLine();
      }
      void display(){
       System.out.println("student details are ");
        System.out.println("USN: "+usn+" Name: "+name);
        }
    }
    
    class StudentRun{
      public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of students to take input : ");
          int n = sc.nextInt();
         Student s[] = new Student[n];
         for(int i =0;i<n;i++){
            s[i] = new Student();
            s[i].accept();
            }
            
              for(int i =0;i<n;i++){
            s[i].display();
            System.out.println();
            }
            
             System.out.println("exiting ");
            
           }
         }
       