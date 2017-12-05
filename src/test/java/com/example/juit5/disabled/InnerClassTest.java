package com.example.juit5.disabled;

import lombok.Data;

/**
 * 〈功能简述〉<br/>
 * 〈〉
 *
 * @author lw
 * @date 2017/11/29
 * @since 1.0.0
 */
@Data
public class InnerClassTest {

    int a = 1;

    @Data
    class Wms {
        String name;

       int getA(){
           return a;
       }
    }

    public static void main(String[] args) {

        InnerClassTest innerClassTest = new InnerClassTest();

        Wms wms = innerClassTest.new Wms();
        System.out.println(wms.getA());
        innerClassTest.setA(2);

        Wms wms1 = innerClassTest.new Wms();
        System.out.print(wms1.getA());

    }
}