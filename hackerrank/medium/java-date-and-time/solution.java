



class Result {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);

        return new SimpleDateFormat("EEEE", Locale.US)
                .format(cal.getTime())
                .toUpperCase(Locale.US);
    }
}



