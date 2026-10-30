

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
b = b.toLowerCase();

if (a.length() != b.length()) {
    return false;
}

char[] arrA = a.toCharArray();
char[] arrB = b.toCharArray();

java.util.Arrays.sort(arrA);
java.util.Arrays.sort(arrB);

return java.util.Arrays.equals(arrA, arrB);   
    }
    

