package proiectpao;

public class MeniuPrincipal extends javax.swing.JPanel
{

    public MeniuPrincipal()
    {
        initComponents();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        PlayGame = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        canvas1 = new java.awt.Canvas();

        jList1.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setLayout(new java.awt.BorderLayout());

        PlayGame.setText("Play Game");
        PlayGame.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PlayGameActionPerformed(evt);
            }
        });
        add(PlayGame, java.awt.BorderLayout.PAGE_END);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String []
            {
                "Username", "Victorii", "Infrangeri"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Table);

        add(jScrollPane2, java.awt.BorderLayout.LINE_END);
        add(canvas1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void PlayGameActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PlayGameActionPerformed
    {//GEN-HEADEREND:event_PlayGameActionPerformed
        
        
        
        
        
        
        
    }//GEN-LAST:event_PlayGameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PlayGame;
    private javax.swing.JTable Table;
    private java.awt.Canvas canvas1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
