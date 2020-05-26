package chapter_01.L01_JavaToGroovy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yangww
 * @date 2020/5/26
 *
 */
public class Java_Process {

    public static void main(String[] args) {
        try {
            Process svnHelp = Runtime.getRuntime().exec("svn help");
            BufferedReader reader = new BufferedReader(new InputStreamReader(svnHelp.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
