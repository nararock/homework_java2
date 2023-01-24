import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class task2 {
    public static void main(String[] args) throws IOException {
        String pathname = "file.json";
        StringBuilder strBuild = readFile(pathname);
        String strEnter = strBuild.toString().replace(",", "").replace(" ", "")
                .replace("[", "").replace("]", "").replace("{", "");
        String[] enterArray = strEnter.split("}");
        for (int i = 0; i < enterArray.length; i++) {
            enterArray[i] = enterArray[i].replace("фамилия", "Студент ").replace("оценка", " получил ")
                    .replace("предмет", " по предмету ").replace("\"", "").replace(":", "");
            System.out.println(enterArray[i] + ".");
        }
    }

    static StringBuilder readFile(String pathname) throws IOException {
        File file = new File(pathname);
        BufferedReader buf = new BufferedReader(new FileReader(file));
        StringBuilder strBuild = new StringBuilder();
        while (buf.ready()) {
            strBuild.append(buf.readLine());
        }
        buf.close();
        return strBuild;
    }
}
