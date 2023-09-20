package GUI;


public class Display_EDiary extends javax.swing.JFrame {


    public Display_EDiary() {
        initComponents();
    }

    private void initComponents() {

        /**
         * @param args the command line arguments
         */
        // Variables declaration - do not modify
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel lbl_title = new javax.swing.JLabel();
        javax.swing.JLabel lbl_DNI = new javax.swing.JLabel();
        javax.swing.JLabel lbl_nombre = new javax.swing.JLabel();
        javax.swing.JLabel lbl_apellido = new javax.swing.JLabel();
        javax.swing.JLabel lbl_direccion = new javax.swing.JLabel();
        javax.swing.JLabel lbl_telefono = new javax.swing.JLabel();
        javax.swing.JLabel lbl_fnac = new javax.swing.JLabel();
        javax.swing.JTextField txt_dni = new javax.swing.JTextField();
        javax.swing.JTextField txt_surname = new javax.swing.JTextField();
        javax.swing.JTextField txt_name = new javax.swing.JTextField();
        javax.swing.JTextField txt_address = new javax.swing.JTextField();
        javax.swing.JTextField txt_telephone = new javax.swing.JTextField();
        javax.swing.JTextField txt_birthday = new javax.swing.JTextField();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JSeparator jSeparator3 = new javax.swing.JSeparator();

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
        lbl_fnac.setText("Birth day :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lbl_apellido)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lbl_nombre)
                                                                        .addComponent(lbl_DNI))
                                                                .addGap(40, 40, 40)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txt_dni)
                                                                        .addComponent(txt_name))))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl_direccion)
                                                        .addComponent(lbl_telefono)
                                                        .addComponent(lbl_fnac))
                                                .addGap(18, 18, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txt_telephone)
                                                        .addComponent(txt_address)
                                                        .addComponent(txt_birthday, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                                                .addGap(22, 22, 22))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(227, 227, 227)
                                                .addComponent(lbl_title)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jSeparator3)
                                                .addGap(22, 22, 22))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 22, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lbl_title)
                                .addGap(11, 11, 11)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_DNI)
                                        .addComponent(lbl_direccion)
                                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_telefono)
                                        .addComponent(lbl_nombre)
                                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_fnac)
                                        .addComponent(lbl_apellido)
                                        .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(159, Short.MAX_VALUE))
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
    }
}
