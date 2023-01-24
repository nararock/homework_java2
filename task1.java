public class task1 {
    public static void main(String[] args) {
        String enterStr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        enterStr = enterStr.replace("\"", "").replace(" ", "")
                .replaceFirst("}", "").replace("{", "");
        String[] enterArray = enterStr.split(",");
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < enterArray.length; i++) {
            String[] temp = enterArray[i].split(":");
            strBuild.append(temp[0] + " = ");
            strBuild.append(temp[1]);
            if (i != enterArray.length - 1) {
                strBuild.append(" and ");
            }
        }
        String answer = "select * from students where " + strBuild.toString();
        System.out.print(answer);
    }
}
