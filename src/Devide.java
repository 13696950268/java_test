import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Devide {
    public static void main(String[] args) {
//        int i = 36;
//        int j = 125;
//        DecimalFormat df = new DecimalFormat();
//        df.setMaximumFractionDigits(2);
//        df.setMinimumFractionDigits(2);
//        String k= df.format(i * 100.00 / j) + "%";
//        System.out.println(k);
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("1");
//        list.add("3");
//        System.out.println(removeDuplicate(list));

        String a = "8.00%";
        String b = "8.00%";
        String tempA = a.substring(0, a.length()-1);
        String tempB = b.substring(0, b.length()-1);
        //精确表示
        BigDecimal dataA = new BigDecimal(tempA);
        BigDecimal dataB = new BigDecimal(tempB);
        System.out.println(dataA.compareTo(dataB));//大于为1，相同为0，小于为-1
        System.out.println("按时打卡说的十分士大夫大师傅很好阿萨的环境");
    }

    public static List<String> removeDuplicate(List<String> list) {
        HashSet<String> h = new HashSet<String>(list);
        list.clear();
        list.addAll(h);
        return list;
    }
}
