package fromTimofeyToDB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class qwerty {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("Path_list.txt"));
        String programName = in.nextLine().substring(2);
        String programVersion = in.nextLine().substring(2);
        String configName = in.nextLine().substring(2);
        String pathProgram = "./config/" + programName + "/" + programVersion + "/" + configName;
        System.out.println(pathProgram);
        String pathBackup = in.nextLine().substring(2);


    }
}
