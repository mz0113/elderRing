package com.eldering.money;


import java.awt.*;
import java.awt.event.KeyEvent;

public class TestMoney {
    private static Robot robot;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void backAgain() throws InterruptedException {
        System.out.println("backAgain");
        robot.keyPress(KeyEvent.VK_G);
        System.out.println("g");
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_G);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_F);
        System.out.println("f");
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_F);
        Thread.sleep(400);
        robot.keyPress(KeyEvent.VK_E);
        System.out.println("e");
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_E);
        Thread.sleep(300);
        robot.keyPress(KeyEvent.VK_E);
        System.out.println("e");
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_E);
    }

    public static void correctDirection() throws InterruptedException {
        System.out.println("correctDirection");
        //走回去
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_W);
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_A);
        Thread.sleep(2500);
        robot.keyRelease(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_A);
    }

    public static void executeSkill() throws InterruptedException {
        System.out.println("executeSkill");
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_C);
        System.out.println("c");
        Thread.sleep(1200);
        robot.keyRelease(KeyEvent.VK_C);
        System.out.println("release c");
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_W);
        Thread.sleep(1300);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_W);
        Thread.sleep(100);

        robot.keyPress(KeyEvent.VK_C);
        System.out.println("c");
        Thread.sleep(1200);
        robot.keyRelease(KeyEvent.VK_C);
        System.out.println("release c again");
    }


    public static void main(String[] args) throws InterruptedException {
        while (true){
            activeGameWindows();
            backAgain();
            waitGameLoad();
            correctDirection();
            executeSkill();
            //方便人工干预结束
            Thread.sleep(4000);
        }
    }

    private static void waitGameLoad() throws InterruptedException {
        Thread.sleep(5000);
    }

    private static void activeGameWindows() throws InterruptedException {
        Thread.sleep(500);
        robot.mouseMove(600,400);
        Thread.sleep(500);
        robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(200);
        robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(300);
        robot.keyPress(KeyEvent.VK_Q);
        Thread.sleep(200);
        robot.keyRelease(KeyEvent.VK_Q);
    }
}
