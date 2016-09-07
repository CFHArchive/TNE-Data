package com.github.tnerevival.core.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Created by Daniel on 9/4/2016.
 */
public class MainScreen extends JFrame {

  private static final long serialVersionUID = 1L;
  private JTextField textField;
  private JTable table;

  public MainScreen() {
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    //Main Frame Options
    setResizable(false);
    getContentPane().setLayout(null);
    setTitle("TNE Data Editor");
    setSize(750, 450);
    setLocationRelativeTo(null);

    //TabbedPane
    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
    tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    tabbedPane.setBounds(0, 0, 745, 410);
    getContentPane().add(tabbedPane);

    //Icons

    //JPanels
    ImageIcon accounts = new ImageIcon(getClass().getResource("/images/players.png"));
    ImageIcon banks = new ImageIcon(getClass().getResource("/images/banks.png"));

    //JPanels
    table = new JTable();
    table.setModel(new DefaultTableModel(
        new Object[][] {
        },
        new String[] {
            "Name", "UUID", "World", "Balance"
        }
    ) {
      boolean[] columnEditables = new boolean[] {
          false, false, false, true
      };
      public boolean isCellEditable(int row, int column) {
        return columnEditables[column];
      }
    });
    JScrollPane playersPanel = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    tabbedPane.addTab("Accounts", accounts, playersPanel, "TNE account management.");

    table = new JTable();
    table.setModel(new DefaultTableModel(
        new Object[][] {
        },
        new String[] {
            "Name", "UUID", "World", "Balance"
        }
    ) {
      boolean[] columnEditables = new boolean[] {
          false, false, false, true
      };
      public boolean isCellEditable(int row, int column) {
        return columnEditables[column];
      }
    });
    JScrollPane banksPanel = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    tabbedPane.addTab("Banks", banks, banksPanel, "TNE bank management.");
  }
}