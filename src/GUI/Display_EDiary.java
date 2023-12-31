
package GUI;


import java.awt.*;

public class Display_EDiary extends javax.swing.JFrame {

    //Global constats
    private final int LENGTH_ARRAYS = 10;

    // Global variables
    String[] dnis = new String[LENGTH_ARRAYS];
    String[] names = new String[LENGTH_ARRAYS];
    String[] surnames = new String[LENGTH_ARRAYS];
    String[] address = new String[LENGTH_ARRAYS];
    String[] telephones = new String[LENGTH_ARRAYS];
    String[] birthdays = new String[LENGTH_ARRAYS];


    public Display_EDiary() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel lbl_title = new javax.swing.JLabel();
        javax.swing.JLabel lbl_DNI = new javax.swing.JLabel();
        javax.swing.JLabel lbl_nombre = new javax.swing.JLabel();
        javax.swing.JLabel lbl_apellido = new javax.swing.JLabel();
        javax.swing.JLabel lbl_direccion = new javax.swing.JLabel();
        javax.swing.JLabel lbl_telefono = new javax.swing.JLabel();
        javax.swing.JLabel lbl_fnac = new javax.swing.JLabel();
        javax.swing.JSeparator sep_title_txt = new javax.swing.JSeparator();
        javax.swing.JSeparator sep_txt_save = new javax.swing.JSeparator();
        javax.swing.JButton btn_previous = new javax.swing.JButton();
        // Variables declaration - do not modify
        javax.swing.JButton btn_next = new javax.swing.JButton();
        javax.swing.JButton btn_save = new javax.swing.JButton();
        javax.swing.JLabel lbl_index = new javax.swing.JLabel();
        txt_telephone = new javax.swing.JTextField();
        txt_index = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        txt_birthday = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_title.setFont(new java.awt.Font("Dialog", Font.PLAIN, 36)); // NOI18N
        lbl_title.setText("Electronic Diary");

        lbl_DNI.setFont(new java.awt.Font("Dialog", Font.PLAIN, 18)); // NOI18N
        lbl_DNI.setText("DNI :");

        lbl_nombre.setFont(new java.awt.Font("Dialog", Font.PLAIN, 18)); // NOI18N
        lbl_nombre.setText("Name :");

        lbl_apellido.setFont(new java.awt.Font("Dialog", Font.PLAIN, 18)); // NOI18N
        lbl_apellido.setText("Surname :");

        lbl_direccion.setFont(new java.awt.Font("Dialog", Font.PLAIN, 18)); // NOI18N
        lbl_direccion.setText("Address :");

        lbl_telefono.setFont(new java.awt.Font("Dialog", Font.PLAIN, 18)); // NOI18N
        lbl_telefono.setText("Telephone :");

        lbl_fnac.setFont(new java.awt.Font("Dialog", Font.PLAIN, 18)); // NOI18N
        lbl_fnac.setText("Birthday :");

        btn_previous.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14)); // NOI18N
        btn_previous.setText("<<");
        btn_previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_previousActionPerformed(evt);
            }
        });

        btn_next.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14)); // NOI18N
        btn_next.setText(">>");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Dialog", Font.PLAIN, 18)); // NOI18N
        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        lbl_index.setFont(new java.awt.Font("Dialog", Font.PLAIN, 18)); // NOI18N
        lbl_index.setText("Index:");

        txt_index.setEditable(false);
        txt_index.setFont(new java.awt.Font("Dialog", Font.PLAIN, 18)); // NOI18N
        txt_index.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_index.setText("0");

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
                                                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lbl_DNI)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lbl_apellido)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl_telefono)
                                                        .addComponent(lbl_fnac)
                                                        .addComponent(lbl_direccion))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_direccion)
                                        .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_telefono)
                                        .addComponent(lbl_nombre)
                                        .addComponent(txt_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_apellido)
                                        .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_fnac)
                                        .addComponent(txt_birthday, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }

    // Check if there are more data entries available (not at the last one)
    // If so, increment the index and update the displayed information accordingly
    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {

        String txt_index_string = this.txt_index.getText();
        int txt_index_number = Integer.parseInt(txt_index_string);

        if(txt_index_number < 9){

            txt_index_number++;

            txt_index_string = String.valueOf(txt_index_number);

            txt_dni.setText(dnis[txt_index_number]);
            txt_name.setText(names[txt_index_number]);
            txt_surname.setText(surnames[txt_index_number] );
            txt_address.setText(address[txt_index_number]);
            txt_telephone.setText(telephones[txt_index_number]);
            txt_birthday.setText(birthdays[txt_index_number]);

            this.txt_index.setText(txt_index_string);
        }

    }

    // Move to the previous data entry if not at the first one
    // Decrement the index and update the displayed information accordingly
    private void btn_previousActionPerformed(java.awt.event.ActionEvent evt) {

        String txt_index_string = this.txt_index.getText();
        int txt_index_number = Integer.parseInt(txt_index_string);

        if(txt_index_number > 0){

            txt_index_number--;

            txt_index_string = String.valueOf(txt_index_number);

            txt_dni.setText(dnis[txt_index_number]);
            txt_name.setText(names[txt_index_number]);
            txt_surname.setText(surnames[txt_index_number] );
            txt_address.setText(address[txt_index_number]);
            txt_telephone.setText(telephones[txt_index_number]);
            txt_birthday.setText(birthdays[txt_index_number]);

            this.txt_index.setText(txt_index_string);
        }
    }

    // Update arrays (e.g., dnis, names) with entered information at the current index.
    // Assumes arrays are used to store contact data.
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {

        String txt_index_string = this.txt_index.getText();
        int txt_index_number = Integer.parseInt(txt_index_string);

        dnis[txt_index_number]       = txt_dni.getText();
        names[txt_index_number]      = txt_name.getText();
        surnames[txt_index_number]   = txt_surname.getText();
        address[txt_index_number]    = txt_address.getText();
        telephones[txt_index_number] = txt_telephone.getText();
        birthdays[txt_index_number]  = txt_birthday.getText();

    }


    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_birthday;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_index;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_telephone;
    // End of variables declaration
}
