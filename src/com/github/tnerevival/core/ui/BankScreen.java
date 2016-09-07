package com.github.tnerevival.core.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Created by Daniel on 9/5/2016.
 */
public class BankScreen extends JFrame {

  private static final long serialVersionUID = 1L;

  public BankScreen(String username, String world) {
    //Main Frame Options
    setResizable(false);
    getContentPane().setLayout(null);
    setTitle(username + "'s Bank in " + world);
    setSize(750, 450);
    setLocationRelativeTo(null);

    JTable table = new JTable();
    table.setModel(new DefaultTableModel(
        new Object[][] {
        },
        new String[] {
            "Item", "Amount", "Slot", "Debug"
        }
    ) {
      boolean[] columnEditables = new boolean[] {
          false, true, true, false
      };
      public boolean isCellEditable(int row, int column) {
        return columnEditables[column];
      }
    });

    JScrollPane mainPanel = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    getContentPane().add(mainPanel);
  }
}