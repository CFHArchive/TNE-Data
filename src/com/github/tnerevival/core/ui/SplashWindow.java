package com.github.tnerevival.core.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Daniel on 9/4/2016.
 */
public class SplashWindow extends JWindow {

  private static final long serialVersionUID = 1L;

  public SplashWindow() {
    getContentPane().add(new JLabel("", new ImageIcon(getClass().getResource("/images/splash.png")), SwingConstants.CENTER));
    setBounds(200, 150, 600, 200);
    setBackground(new Color(0, 255, 0, 0));
    setLocationRelativeTo(null);
    setVisible(true);
  }
}