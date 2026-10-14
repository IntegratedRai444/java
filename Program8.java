public class Program8 {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "David", "Eve"};
        int index = 0 ; 
        for (String student : students) {
            if (index ==1 ){
                students[index] = "Rishabh"; 

            }
            index++;
        }
        for (String student : students) {
            System.out.println(student);
        }
    }
}
