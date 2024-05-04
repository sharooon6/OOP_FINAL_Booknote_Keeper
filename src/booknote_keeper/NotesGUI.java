/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package booknote_keeper;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author ALIENWARE
 */
public class NotesGUI extends javax.swing.JPanel {

    private ArrayList<Book> books = new ArrayList<>();
    private JList<String> booklist;
    private DefaultListModel<String> listModel;

    MainGUI mg;
    /**
     * Creates new form NotesGUI
     */
    public NotesGUI(MainGUI mainGUI) {
        initComponents();
        
        mg = mainGUI;
        
        //create booklist ui
        listModel = new DefaultListModel<>();
        booklist = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(booklist);
        
        //modify the UI
        booklist.setOpaque(false);
        scrollPane.setOpaque(false);
        booklist.setBorder(new EmptyBorder(5,5,5,5));
        notelist_panel.add(scrollPane, BorderLayout.CENTER); 
        
        

        
        booklist.setCellRenderer(new DefaultListCellRenderer() {
            private int padding = 5; 
            private Font bookFont = new Font("Cascadia Code", Font.BOLD, 14); 
            private Font noteFont = new Font("Cascadia Code", Font.PLAIN, 12);

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                String text = value.toString();

                // set different font for book label and notes
                if (text.startsWith("Book:")) {
                    label.setFont(bookFont);
                } else {
                    label.setFont(noteFont);
                    label.setText("<html><body style='width: 550px;'>" + value.toString() + "</body></html>");
                }

  
                return label;
            }
        });
        
        displayNotes();
    }
    
    public void displayNotes(){
        books = BookManager.loadBooks();
        listModel.clear();
        
        //add to jList
        for(Book book: books){
            String bookLabel = "Book: " + book.getTitle() + " (Author: " + book.getAuthor() + ", Genre: " + book.getGenre() + ") ";
            listModel.addElement(bookLabel);
            ArrayList<Note> notes = book.getNotes();
            for(Note note: notes){
                String noteText = "     " + note.getText();
                listModel.addElement("<html>" + noteText + "</html>");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        notelist_panel = new javax.swing.JPanel();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BROWSE ALL NOTES");
        jPanel1.add(jLabel3, java.awt.BorderLayout.CENTER);

        notelist_panel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notelist_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(notelist_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 569, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel notelist_panel;
    // End of variables declaration//GEN-END:variables
}
