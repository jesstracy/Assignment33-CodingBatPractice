/**
 * Created by jessicatracy on 9/21/16.
 */
public class Assignment33Runner {
    public static void main(String[] args) {
    }

    public boolean closerFar(int a, int b, int c) {
        if ((Math.abs(a - b) <= 1) || (Math.abs(a - c) <= 1))  {
            if (Math.abs(a - b) <= 1) {
                //then c has to differ from both a and b by 2 or more
                if ((Math.abs(c - a) >= 2) && (Math.abs(c - b) >= 2)) {
                    return true;
                }
            }
            if (Math.abs(a - c) <= 1) {
                //then b has to differ from both a and c by 2 or more
                if((Math.abs(b - a) >= 2) && (Math.abs(b - c) >= 2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int luckySum(int a, int b, int c) {
        return -1;
    }
}
