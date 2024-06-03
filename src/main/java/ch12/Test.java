package ch12;

import java.util.Arrays;

// self
// super
// 메시지위임
// 메시지 자동위임을 통해 상속을 구현
// 상속은 정적인 관계가 아니라 동적인 관계이다.
public class Test {
    public static void main(String[] args) {
        Lecture lecture = new Lecture("객체지향 프로그래밍", 70, Arrays.asList(81, 95, 75, 50, 45));

        new GradeLecture("객체지향 프로그래밍",70,Arrays.asList(
                        new Grade("A",100,95),
                        new Grade("B",94,80),
                        new Grade("C",79,70),
                        new Grade("D",69,50),
                        new Grade("F",49,0)),
                        Arrays.asList(81, 95, 75, 50, 45)
        );

    }

}
