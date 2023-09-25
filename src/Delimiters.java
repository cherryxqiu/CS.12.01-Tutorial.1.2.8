import java.util.ArrayList;

public class Delimiters {

    private String openDel;
    private String closeDel;

    public Delimiters (String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] token) {
        ArrayList<String> delimeters = new ArrayList<>();
        for (int i = 0; i < token.length; i++) {
            if (token[i].equals(openDel) || token[i].equals(closeDel)) {
                delimeters.add(token[i]);
            }
        }

        return delimeters;

    }

    public boolean isBalanced (ArrayList delimiters) {
        int openCount = 0;
        int closeCount = 0;
        if (delimiters.size()%2 == 0) {
            for (int i = 0; i < delimiters.size(); i++) {
                if (delimiters.get(i) == openDel) {
                    openCount++;
                }
                else if (delimiters.get(i) == closeDel) {
                    closeCount++;
                }
            }

            if (openCount==closeCount) {
                boolean orderCorrect = true;
                if (delimiters.get(0) != openDel) {
                    orderCorrect = false;
                }

                if (delimiters.get(delimiters.size()-1) != closeDel) {
                    orderCorrect = false;
                }

                if (orderCorrect) {
                    return true;
                }

            }

            return false;


        }

        return false;
    }

    public String getOpenDel(){
        return openDel;
    }

    public String getCloseDel(){
        return closeDel;
    }

}