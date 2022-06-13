package com.lh.dp.singleton;

/**
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03() {
    }

    public static Mgr03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            //同一个类的不同实例的hashCode是不一样的
            //如果不是同一个类的实例对象，hashCode有可能一样
            new Thread(()->
                System.out.println(Mgr03.getInstance().hashCode())
            ).start();
        }

//        Mgr03 m1 = Mgr03.getInstance();
//        Mgr03 m2 = Mgr03.getInstance();
//        System.out.println(m1 == m2);
    }
}
