package com.wz.text01.p2;

import com.wz.text01.p1.TestDefault;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Created by IntelliJ IDEA.
 *
 * @author Donkey
 * Date: 2022/4/15
 * Time: 12:09
 */
public class Test02 extends TestDefault {

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        //test02.show();

//        //5     0101
//        //10    1010
//        //      0000
//        System.out.println(5 & 10);
//        //6     0110
//        //10    1010
//        //      0010    2
//        int i = 6 & 8;
//        System.out.println(i);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(11, "张三");
        map.put(12, "李四");
        map.put(13, "王五");
        map.put(12, "赵六");
        map.put(14, "陈皮");
        //加强for更好
        for (Integer integer : map.keySet()) {
            System.out.println(map.get(integer));
            //map.remove(integer);
        }
        //map 要遍历遍历key 首先得获取到keySet 通过keySet获取到Iterator
        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }

        //长度为4  说明相同key存在某种操作(是替换还是不替换(丢弃))？
        System.out.println(map.size());
        //这是key-value一起换了 还是只换了value
        System.out.println(map.toString());

        ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
        //System.out.println("".equals("abc"));

        int n = 6;
        //解释
        //6     -->(二进制)        0110
        //n>>>1                   0011  向右移动一位高位添0(低位抹除)
        //  0110|0011=0111  -->7
        n |= n >>> 1;
        //向右移动两位之后再或运算
        //  0111|0001=0111
        n |= n >>> 2;
        //向右移动四位之后再或运算
        //  0111|0000=0111
        n |= n >>> 4;
        //  0111|0000=0111
        n |= n >>> 8;
        //  0111|0000=0111  -->7
        n |= n >>> 16;
        System.out.println(n);


        List<String> list = new LinkedList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("test git1!");
        System.out.println("test git2!");
        System.out.println("test git3!");
        System.out.println("test git branch hot-fix");
        System.out.println("master test");
        System.out.println("hot-fix text");
        System.out.println("push test");

    }
}
