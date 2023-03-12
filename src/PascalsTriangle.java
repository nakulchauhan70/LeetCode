import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        generate(5);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();

        if (1 <= numRows) {
            pascalsTriangle.add(new ArrayList<Integer>() {{
                add(1);
            }});
        }

        if (2 <= numRows) {
            pascalsTriangle.add(new ArrayList<Integer>() {{
                add(1);
                add(1);
            }});
        }

        int i = 3;
        while (i <= numRows) {
            List<Integer> list = new ArrayList<>();
            list.add(0, 1);
            List<Integer> integers = pascalsTriangle.get(i - 1 - 1);
            for (int j = 1; j < i - 1; j++) {
                list.add(j, integers.get(j - 1) + integers.get(j));
            }
            list.add(1);
            pascalsTriangle.add(list);
            i++;
        }

        return pascalsTriangle;
    }
}
