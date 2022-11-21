package io.namoosori.travelclub.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// applicationContext.xml에서 등록한 bean을 테스트를 위해서 만드는 main 메서드를 가지고 있는 클래스
public class TravelClubApp {
    
     public static void main(String[] args) {
         // 같은 context path 안에 applicationContext.xml에 있다는 것을 알려줌
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        String [] beanNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanNames)); // [clubStore, clubService]
    }
}
