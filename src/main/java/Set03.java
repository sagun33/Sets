import java.util.*;

public class Set03 {
    public static void main(String[] args) {
        /*Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
        Örnek: ‘Mississippi’ ´ Misp*/

        String s = "Mississippi";
        String [] a=s.split("");
        List<String> c= new ArrayList<>(Arrays.asList(a));
       Set<String>d=new HashSet<>(c);
        System.out.println(d);
    }
}
