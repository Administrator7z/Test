package ldj;

import com.sun.glass.ui.Size;
import com.sun.xml.internal.ws.wsdl.writer.document.Types;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("科特迪瓦");
        list.add("阿根廷");
        list.add("澳大利亚");
        list.add("塞尔维亚");
        list.add("荷兰");
        list.add("尼日利亚");
        list.add("日本");
        list.add("美国");
        list.add("中国");
        list.add("新西兰");
        list.add("巴西");
        list.add("比利时");
        list.add("韩国");
        list.add("喀麦隆");
        list.add("洪都拉斯");
        list.add("意大利");
        Random random = new Random();


        for (int j = 0; j < list.size()-1; j++) {

            int i = random.nextInt(list.size()-1-j);
             String randomStr =  list.get(i);
             list.set(i,list.get(list.size()-1-j));
             list.set(list.size()-1-j,randomStr);




        }
        int git = 0;
        for (int p = 1; p <5 ; p++) {
            System.out.print("第"+p+"支队伍");
            System.out.print(list.get(git++)+"  ");
            System.out.print(list.get(git++)+"  ");
            System.out.print(list.get(git++)+"  ");
            System.out.print(list.get(git++)+"  ");
            System.out.println();
        }
//

    }
}
