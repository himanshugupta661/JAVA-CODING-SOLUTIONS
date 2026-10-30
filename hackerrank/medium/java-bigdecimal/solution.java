

        //Write your code here
Arrays.sort(s, 0, n, new Comparator<String>() {
    public int compare(String a, String b) {
        BigDecimal bd1 = new BigDecimal(a);
        BigDecimal bd2 = new BigDecimal(b);
        return bd2.compareTo(bd1);
    }
});
