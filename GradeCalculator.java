import java.io.*;
public class GradeCalculator {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter the number of subjects:");
        int n = Integer.parseInt(br.readLine());

        int sub[] = new int[n];
        int totalmarks = 0;
        System.out.println("enter the marks: ");
        for(int i=0; i<n; ++i){
            sub[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0; i<n; ++i){
            totalmarks += sub[i];
        }
        System.out.println("the totalmarks are: "+totalmarks);

        int average = totalmarks/n;
        System.out.println("the average is:" +average);

            if(average >=85 && average<=100){
                System.out.println("the grade is : S");
            }
            else if(average >=75 && average <85){
                System.out.println("the grade is : A");
            }
            else if(average >= 65 && average < 75){
                System.out.println("the grade is : B");
            }
            else if(average >=55 && average < 65){
                System.out.println("the grade is : C");

            }
            else if(average >= 50 && average < 55){
                System.out.println("the grade is : D");
            }
            else{
                System.out.println("Fail, need to rewrite the exams");
            }  
    }
}