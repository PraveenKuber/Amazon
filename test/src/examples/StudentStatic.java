package examples;

public class StudentStatic {
    private static String collegeName = "SIET";
    private static int InsuranceCode;
    private String studentName;
    private int id;//non static variable

    /*static block*/
    static{
        System.out.println("static block Created ");
        InsuranceCode=10;
    }

    /*constructor*/
    public StudentStatic(String sName,int studnetId){
        //collegeName=collegeName;
        studentName=sName;
        id=studnetId;
    }

    /*
    * Note:
    * Static method belongs to class , it will not refer to object
    * static method can access without creating the ojbect
    * static method can use only the static global variables
    * we cannot access other varibles
    *
    * */
    public static void performTesting(int number){
        String testName = collegeName;
        if(number>0){
            System.out.printf("Positive number");
        }else{
            System.out.printf("Negitive number");
        }
    }


    private void displayStudentDetails(){
        System.out.println("College name::::"+collegeName+"::::: Studnet name:::"+studentName+":::::: id::::"+id);
    }

    public static void main(String[] args) {
        /*StudentStatic studentStatic = new StudentStatic("sandeep",101);
        studentStatic.displayStudentDetails();
        StudentStatic thanuDetails = new StudentStatic("sandeep",102);
        thanuDetails.displayStudentDetails();*/
        performTesting(10);
    }
}
