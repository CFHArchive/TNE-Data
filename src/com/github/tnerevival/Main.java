package com.github.tnerevival;

import com.github.tnerevival.core.ui.MainScreen;
import com.github.tnerevival.core.ui.SplashWindow;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Daniel on 9/4/2016.
 */
public class Main {

  public static void main(String[] arguments) {
    SplashWindow window = new SplashWindow();
    JFrame frame = new JFrame();
    frame.setBounds(0, 0, 570, 50);
    frame.setUndecorated(true);
    frame.setBackground(new Color(0, 255, 0, 0));
    frame.setLocationRelativeTo(null);
    frame.getContentPane().setLayout(null);
    JProgressBar progress = new JProgressBar(0, 100);
    progress.setBorderPainted(false);
    progress.setForeground(new Color(105, 209, 186));
    progress.setBackground(Color.BLACK);
    progress.setBounds(5, 10, 570, 5);
    frame.add(progress);
    frame.setVisible(true);

    for(int i = 0; i <= progress.getMaximum(); i += 10) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      progress.setValue(i);
    }
    frame.setVisible(false);
    window.setVisible(false);
    MainScreen main = new MainScreen();
    main.setVisible(true);
    window.dispose();
  }
}