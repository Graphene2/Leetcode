package significance.time_Sep;

/**
 * Description:
 * User: zhangcheng
 * Date: 2020-09-21
 * Time: 11:32
 */
public class lc12整数转罗马数字 {
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length && num >= 0; i++){
            while (values[i] <= num){
                num -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }
}
