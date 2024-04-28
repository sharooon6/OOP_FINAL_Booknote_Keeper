/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package booknote_keeper;

import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author ALIENWARE
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    
     JPanel browse_panel;
     JPanel add_panel;
     JPanel notes_panel;
    
    public MainGUI() {
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/icons/open-book.png")).getImage();
        this.setIconImage(icon);
        
        browse_panel = new BrowseGUI();
	card_panel.add(browse_panel, "Browse");
        
        add_panel = new AddBookGUI();
	card_panel.add(add_panel, "Add");
        
        notes_panel = new NotesGUI();
	card_panel.add(notes_panel, "Notes");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_panel = new javax.swing.JPanel();
        btn_AllBooks = new javax.swing.JButton();
        btn_AddBook = new javax.swing.JButton();
        btn_AllNotes = new javax.swing.JButton();
        card_panel = new javax.swing.JPanel();
        empty_panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Booknote Keeper");
        setResizable(false);

        button_panel.setBackground(java.awt.Color.darkGray);

        btn_AllBooks.setBackground(java.awt.Color.darkGray);
        btn_AllBooks.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        btn_AllBooks.setForeground(new java.awt.Color(255, 255, 255));
        btn_AllBooks.setText("ALL BOOKS");
        btn_AllBooks.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_AllBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AllBooksActionPerformed(evt);
            }
        });

        btn_AddBook.setBackground(java.awt.Color.darkGray);
        btn_AddBook.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        btn_AddBook.setForeground(new java.awt.Color(255, 255, 255));
        btn_AddBook.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_AddBook.setLabel("ADD A BOOK");
        btn_AddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddBookActionPerformed(evt);
            }
        });

        btn_AllNotes.setBackground(java.awt.Color.darkGray);
        btn_AllNotes.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        btn_AllNotes.setForeground(new java.awt.Color(255, 255, 255));
        btn_AllNotes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_AllNotes.setLabel("ALL NOTES");
        btn_AllNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AllNotesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout button_panelLayout = new javax.swing.GroupLayout(button_panel);
        button_panel.setLayout(button_panelLayout);
        button_panelLayout.setHorizontalGroup(
            button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_AllBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_AddBook, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(btn_AllNotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addContainerGap())
        );
        button_panelLayout.setVerticalGroup(
            button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_panelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(btn_AllBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_AllNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_AddBook.getAccessibleContext().setAccessibleName("");
        btn_AllNotes.getAccessibleContext().setAccessibleName("");

        card_panel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout empty_panelLayout = new javax.swing.GroupLayout(empty_panel);
        empty_panel.setLayout(empty_panelLayout);
        empty_panelLayout.setHorizontalGroup(
            empty_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        empty_panelLayout.setVerticalGroup(
            empty_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        card_panel.add(empty_panel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(button_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(card_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(card_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        card_panel.getAccessibleContext().setAccessibleName("card_panel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AllBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AllBooksActionPerformed
        open_browse_gui();
    }//GEN-LAST:event_btn_AllBooksActionPerformed

    private void btn_AddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddBookActionPerformed
        open_add_gui();
    }//GEN-LAST:event_btn_AddBookActionPerformed

    private void btn_AllNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AllNotesActionPerformed
        open_notes_gui();
    }//GEN-LAST:event_btn_AllNotesActionPerformed

    public void open_browse_gui() {
        System.out.println("show all books");
        card_panel.removeAll();
        card_panel.add(browse_panel);
        card_panel.repaint();
        card_panel.revalidate();
    }
	
    public void open_add_gui() {
        System.out.println("add a new book");
        card_panel.removeAll();
        card_panel.add(add_panel);
        card_panel.repaint();
        card_panel.revalidate();
    }
	
    public void open_notes_gui() {
        System.out.println("show all notes");
        card_panel.removeAll();
        card_panel.add(notes_panel);
        card_panel.repaint();
        card_panel.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddBook;
    private javax.swing.JButton btn_AllBooks;
    private javax.swing.JButton btn_AllNotes;
    private javax.swing.JPanel button_panel;
    private javax.swing.JPanel card_panel;
    private javax.swing.JPanel empty_panel;
    // End of variables declaration//GEN-END:variables
}
