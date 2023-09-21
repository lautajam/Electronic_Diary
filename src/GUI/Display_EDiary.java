
package GUI;

public class Display_EDiary extends javax.swing.JFrame {

    /**
     * Creates new form DIsplay_Data
     */
    public Display_EDiary() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_DNI = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_fnac = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        sep_title_txt = new javax.swing.JSeparator();
        sep_txt_save = new javax.swing.JSeparator();
        btn_previous = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        lbl_index = new javax.swing.JLabel();
        txt_index = new javax.swing.JTextField();
        txt_dni1 = new javax.swing.JTextField();
        txt_dni2 = new javax.swing.JTextField();
        txt_dni3 = new javax.swing.JTextField();
        txt_dni4 = new javax.swing.JTextField();
        txt_dni5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_title.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lbl_title.setText("Electronic Diary");

        lbl_DNI.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_DNI.setText("DNI :");

        lbl_nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_nombre.setText("Name :");

        lbl_apellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_apellido.setText("Surname :");

        lbl_direccion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_direccion.setText("Address :");

        lbl_telefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_telefono.setText("Telephone :");

        lbl_fnac.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_fnac.setText("Birthday :");

        btn_previous.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_previous.setText("<<");

        btn_next.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_next.setText(">>");

        btn_save.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_save.setText("SAVE");

        lbl_index.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_index.setText("Index:");

        txt_index.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(lbl_title)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(sep_title_txt))
                                        .addComponent(sep_txt_save, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lbl_nombre)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txt_dni2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lbl_DNI)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txt_dni3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lbl_apellido)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txt_dni1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl_telefono)
                                                        .addComponent(lbl_fnac)
                                                        .addComponent(lbl_direccion))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt_dni5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_dni4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn_previous)
                                                .addGap(29, 29, 29))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbl_index)
                                                .addGap(9, 9, 9)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_index)
                                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(btn_next)
                                .addGap(215, 215, 215))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lbl_title)
                                .addGap(11, 11, 11)
                                .addComponent(sep_title_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_DNI)
                                        .addComponent(txt_dni3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_direccion)
                                        .addComponent(txt_dni5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_telefono)
                                        .addComponent(lbl_nombre)
                                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_dni2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_apellido)
                                        .addComponent(txt_dni1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_fnac)
                                        .addComponent(txt_dni4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(sep_txt_save, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_next)
                                        .addComponent(btn_previous)
                                        .addComponent(btn_save))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_index)
                                        .addComponent(txt_index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_previous;
    private javax.swing.JButton btn_save;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_DNI;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_fnac;
    private javax.swing.JLabel lbl_index;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JSeparator sep_title_txt;
    private javax.swing.JSeparator sep_txt_save;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_dni1;
    private javax.swing.JTextField txt_dni2;
    private javax.swing.JTextField txt_dni3;
    private javax.swing.JTextField txt_dni4;
    private javax.swing.JTextField txt_dni5;
    private javax.swing.JTextField txt_index;
    // End of variables declaration
}
