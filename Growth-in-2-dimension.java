public static long countMax(List<String> upRight) {
    //Write your code here
    long min_Row = Long.MAX_VALUE;
    long min_Col = Long.MAX_VALUE;

    for(String str: upRight) {

        long row = Long.parseLong(str.split(" ")[0]);
        long col = Long.parseLong(str.split(" ")[1]);

        min_Row = Math.min(min_Row, row);
        min_Col = Math.min(min_Col, col);
    }
    return minRow * minCol;
}