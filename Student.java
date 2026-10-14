public class Student {
    int age ; 
     
    Student ( int age ) { 
        age = age ; 

    }
    void display(){ 
        System.out.println("Age is : " + age ); 


    }
    public static void main(String args[] ){
        Student s1 = new Student (19);
        s1.display();
    }

}

