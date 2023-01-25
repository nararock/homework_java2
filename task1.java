public class task1 {
    public static void main(String[] args) {
        String enterStr = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        enterStr = enterStr.replace("\"", "").replace(" ", "")
                .replaceFirst("}", "").replace("{", "");
        String[] enterArray = enterStr.split(",");
        StringBuilder strBuild = new StringBuilder();
        for (int i = 0; i < enterArray.length; i++) {
            String[] temp = enterArray[i].split(":");
            if (!temp[1].equals("null")) {
                strBuild.append(temp[0] + " = ");
                strBuild.append("\"" + temp[1] + "\" and ");
            }
        }
        if (strBuild.subSequence(strBuild.length() - 4, strBuild.length() - 1).equals("and")) {
            strBuild = strBuild.delete(strBuild.length() - 4, strBuild.length() - 1);
        }
        String answer = "select * from students where " + strBuild.toString();
        System.out.print(answer);
    }
}
