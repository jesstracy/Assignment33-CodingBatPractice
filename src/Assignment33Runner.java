import java.util.ArrayList;

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
        int sum = 0;
        if (a != 13 && b != 13 && c != 13) {
            sum += (a + b + c);
        } else if (a != 13 && b != 13) {
            sum += (a + b);
        } else if (a != 13) {
            sum += a;
        }
        return sum;
//        return -1;
    }

    public int maxBlock(String inputString) {
        int charBlockCount = 0;
        int maxCharBlockCount = 0;
        for (int counter = 0; counter < inputString.length(); counter++) {
            if ((counter != 0) && (inputString.substring(counter, counter + 1).equals(inputString.substring(counter - 1, counter)))) {
                charBlockCount++;
            } else {
                charBlockCount = 1;
            }
            if (charBlockCount > maxCharBlockCount) {
                maxCharBlockCount = charBlockCount;
            }
        }
        return maxCharBlockCount;
//        return -1;
    }

    public String mirrorEnds(String inputString) {
        String mirrorString = "";

        char[] charList = inputString.toCharArray();
        char[] reverseCharList = new char[charList.length];
        int counterForward = 0;
        for (int counterBackward = charList.length - 1; counterBackward >= 0; counterBackward--) {
            reverseCharList[counterForward] = charList[counterBackward];
            counterForward++;
        }
        for (int counter = 0; counter < charList.length; counter++) {
            if (charList[counter] == reverseCharList[counter]) {
                mirrorString += charList[counter];
            } else {
                break;
            }
        }
        return mirrorString;
//        return null;
    }

    public int sumNumbers(String inputString) {
        String[] pieces = inputString.split(" ");
        String currentNumberString;
        char currentChar;
        int sum = 0;
        boolean computedSum;
        boolean moreChars = false;
        for (String string : pieces) {
            currentNumberString = "";
            computedSum = false;
            for (int counter = 0; counter < string.length(); counter++) {
                computedSum = false;
                currentChar = string.charAt(counter);
                if(Character.isDigit(currentChar)) {
                    currentNumberString += currentChar;
                } else {
                    if (!currentNumberString.equals("")) {
                        sum += Integer.parseInt(currentNumberString);
                        computedSum = true;
                        moreChars = false;
                        for (int newCounter = counter + 1; newCounter < string.length(); newCounter++) {
                            if (Character.isDigit(string.charAt(newCounter))) {
                                moreChars = true;
                                currentNumberString = "";
                            }
                        }
                        if (!moreChars) {
                            break;
                        }
                    }
                }
            }
            if (!currentNumberString.equals("") && !computedSum) {
                sum += Integer.parseInt(currentNumberString);
            }
        }
        return sum;
//        return -1;
    }
}
