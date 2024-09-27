package com.clsex.nestedcls;
/*
 *  익명 객체(클래스) : 익명 객체는 말 그대로 이름이 없는 객체를 뜻함 
 *  지금까지 봤던 inner 클래스처럼, 명시적으로 클래스를 정의 하는게 아니라, 객체를 발생하는 시점에
 *  클래스가 정의되고 사라진다라는 개념으로 이해하면됨
 *  때문에 익명 클래스 또는 객체(이게 더 맞음) 라고 함
 *  
 *  이걸 사용하는 이유는 특정 클래스나, 인터페이스를 특정 시점에 딱 한번만 특정 메서드(들)을 사용시점에서만
 *  객체화해서 사용하고 버려야 하는 코드에 적합하다.
 *  
 *  주로 필드값, 로컬 변수값, 파라미터 변수값 등으로 사용된다.
 *  
 *  익명객체는 크게 두 개로 나뉘는데, 클래스를 구현한 객체를 익명자식객체라고하고, 인터페이스를 구현한 것을 익명구현객체라고 한다.
 *  
 *  사용예시 new 부모생성자(파라미터...){필드,메서드..} 여기서 생성자란, 클래스와 인터페이스 모두를 포함하는 개념이다.
 *  클래스인 경우엔 생성자가 있기때문에 이해하기 쉬울거지만, 인터페이스는 생성자가 없는데 어떻게 생성자를 호출하는지가 이해 안될거임.
 *  이건 익명 클래스 즉, new Interface()라고 호출하면, 내부적으로 해당 Interface 를 구현한 익명 클래스가 생성되고,
 *  그 클래스의 생성자를 호출한다라고 생각하면 쉬움.. 그래서 익명 클래스라고 하는거임
 *  
 */

import com.clsex.interexam.RemoteControl;



class Tire {
    public void roll() {
        System.out.println("일반 타이어가 굴러갑니다.");
    }
}

class Car {
    private Tire tire1 = new Tire();

    private Tire tire2 = new Tire() {
        public void roll() {
            System.out.println("익명 자식 Tire 객체");
        }
    }; // 익명 클래스는 반드시 끝에 ;를 넣어야 함

    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    public void run2() {
        new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식객체2가 굴러감");
            }
        }.roll();
    }

    public void run3(Tire tire) {
        tire.roll();
    }
}

abstract class MyAnony {
    abstract void a(); // 추상 메소드 a()
    abstract void b(); // 추상 메소드 b()
    void c() {
        // 기본 메소드 c()
    }
}

public class AnonymouseExam {

    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켬");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끔");
        }

        @Override
        public void setVolume(int volume) {
            // 볼륨 설정 로직 (필요시 구현)
        }
    };

    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    public void use2() {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("오디오를 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("오디오를 끕니다");
            }

            @Override
            public void setVolume(int volume) {
                // 볼륨 설정 로직 (필요시 구현)
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.run1();
        car.run2();
        car.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("익명객체 3타이어 굴러감.");
            }
        });

        // 익명 자식객체 구현 예시
        MyAnony myAnony = new MyAnony() {
            @Override
            void b() {
                // b() 메소드 구현
            }

            @Override
            void a() {
                // a() 메소드 구현
            }
        }; // 세미콜론 추가

        // 인터페이스를 구현한 구현객체인 익명구현객체 사용예시
        AnonymouseExam home = new AnonymouseExam();
        home.use1();
        home.use2();

        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("스마트티비를 켬");
            }

            @Override
            public void turnOff() {
                System.out.println("스마트티비 끔");
            }

            @Override
            public void setVolume(int volume) {
                // 볼륨 설정 로직 (필요시 구현)
            }
        });
    }
}




