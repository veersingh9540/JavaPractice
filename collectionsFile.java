import javax.print.attribute.standard.MediaSize.NA;

public class collectionsFile
{

    public static void main(String agrs[]){
        // Creating Array of Objects
        studentsDetails s1 = new studentsDetails();
        studentsDetails s2 = new studentsDetails();
        studentsDetails s3 = new studentsDetails();
        studentsDetails s4 = new studentsDetails();

        s1.Name = "Sukhveer Singh";
        s1.Roll_no = 1;
        s1.marks = 100f;

        s2.Name = "James wu";
        s2.Roll_no = 2;
        s2.marks = 99f;

        s3.Name = "Jharna";
        s3.Roll_no = 11;
        s3.marks = 100f;



        // Initializing array of objects 
        studentsDetails array[] = new studentsDetails[4];
        array[0] = s1;
        array[1] = s2;
        array[2] = s3;
        array[3] = s4;
        //Tradidional For loop
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(array[i].Name + " " + array[i].Roll_no + " " + array[i].marks);
        // }
        // Enhanced For loop or For each loop
        for (studentsDetails stud: array){
            System.out.println(stud.Name);
        }


    }
}

class studentsDetails
{   
    String Name = "No Student";
    int Roll_no = 0;
    float marks = 0;

}