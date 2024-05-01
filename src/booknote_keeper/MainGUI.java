/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package booknote_keeper;

import java.awt.CardLayout;
import java.awt.Image;
import java.util.ArrayList;
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
    
     BrowseGUI browse_panel;
     JPanel add_panel;
     JPanel notes_panel;
     IndividualBookGUI book_panel;
    
    public MainGUI() {
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/icons/open-book.png")).getImage();
        this.setIconImage(icon);
        
        book_panel = new IndividualBookGUI(this);
        card_panel.add(book_panel, "Book");
        
        browse_panel = new BrowseGUI(this, book_panel);
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
        btn_clearData = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
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

        btn_clearData.setBackground(java.awt.Color.gray);
        btn_clearData.setFont(new java.awt.Font("Cascadia Code", 0, 14)); // NOI18N
        btn_clearData.setForeground(new java.awt.Color(255, 255, 255));
        btn_clearData.setText("CLEAR ALL DATA");
        btn_clearData.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_clearData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearDataActionPerformed(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.black);
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        logo.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("BOOKNOTE");
        logo.setToolTipText("");

        logo1.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        logo1.setForeground(new java.awt.Color(255, 255, 255));
        logo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo1.setText("KEEPER");
        logo1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout button_panelLayout = new javax.swing.GroupLayout(button_panel);
        button_panel.setLayout(button_panelLayout);
        button_panelLayout.setHorizontalGroup(
            button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(button_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_AllBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_AddBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_AllNotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clearData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                .addContainerGap())
        );
        button_panelLayout.setVerticalGroup(
            button_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_panelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_AllBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_AllNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_clearData, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        btn_AddBook.getAccessibleContext().setAccessibleName("");
        btn_AllNotes.getAccessibleContext().setAccessibleName("");

        card_panel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout empty_panelLayout = new javax.swing.GroupLayout(empty_panel);
        empty_panel.setLayout(empty_panelLayout);
        empty_panelLayout.setHorizontalGroup(
            empty_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
        );
        empty_panelLayout.setVerticalGroup(
            empty_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        card_panel.add(empty_panel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(button_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(card_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btn_clearDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearDataActionPerformed
        System.out.println("Clear all data from the folder!");
        BookManager.DeleteAllBooks();
    }//GEN-LAST:event_btn_clearDataActionPerformed

    public void open_browse_gui() {
        System.out.println("open browse GUI");
        card_panel.removeAll();
        card_panel.add(browse_panel);
        card_panel.repaint();
        card_panel.revalidate();
        
        browse_panel.displayBooks(null,null,null);
    }
	
    public void open_add_gui() {
        System.out.println("open add GUI");
        card_panel.removeAll();
        card_panel.add(add_panel);
        card_panel.repaint();
        card_panel.revalidate();
    }
	
    public void open_notes_gui() {
        System.out.println("open notes GUI");
        card_panel.removeAll();
        card_panel.add(notes_panel);
        card_panel.repaint();
        card_panel.revalidate();
    }
    
    public void open_book_gui(){
        System.out.println("open individual book GUI");
        card_panel.removeAll();
        card_panel.add(book_panel);
        card_panel.repaint();
        card_panel.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddBook;
    private javax.swing.JButton btn_AllBooks;
    private javax.swing.JButton btn_AllNotes;
    private javax.swing.JButton btn_clearData;
    private javax.swing.JPanel button_panel;
    private javax.swing.JPanel card_panel;
    private javax.swing.JPanel empty_panel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    // End of variables declaration//GEN-END:variables
}
