import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.security.Key;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Robot bot = null;
        try {
            bot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }


        //while(true) {System.out.println(MouseInfo.getPointerInfo().getLocation());}

            bot.mouseMove(710, 557);
            bot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
            bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(300);
            bot.mouseMove(58, 392);
            bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(300);
            bot.mouseMove(89, 539);
            bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(300);
            bot.mouseMove(55, 556);
            bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(300);
            bot.mouseMove(265, 382);
            bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(300);
            bot.mouseMove(55, 556);
            bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}

