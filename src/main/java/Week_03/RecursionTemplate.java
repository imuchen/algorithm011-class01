package Week_03;

/**
 * Created by tianguoxing on 2020/7/9 22:11.
 */
public class RecursionTemplate {
    public static final int MAX_LEVEL = 0;

    public void recur(int level, int param) {
        // terminator
        if (level > MAX_LEVEL) {
            // process result

            return;
        }

        // process current logic
        process(level, param);

        // drill down
//        recur(level + 1, newParam);

        // restore current status


    }

    private void process(int level, int param) {
    }
}
