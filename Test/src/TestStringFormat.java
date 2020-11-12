public class TestStringFormat {
    public static void main(String[] args) {
        String youNumber = " 7699992511";
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        String str = String.format("%016d", Long.valueOf(youNumber.trim()));
        System.out.println(str); // 0001
    }
}
