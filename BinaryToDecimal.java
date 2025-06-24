
// This program converts a binary number to its decimal equivalent.


class BinaryToDecimal {

    public static void convertToDecimal(int binNum) {
        int myNum = binNum;
        int power = 0;
        int dec = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, power));
            power++;
            binNum /= 10;
        }
        System.out.println("Binary Num is: " + dec + "\nDecimal Num : " + myNum);
    }

    public static void main(String[] args) {
        convertToDecimal(101);
    }
}
