
package vista;

public class vistaTienda extends javax.swing.JFrame {

    /**
     * Creates new form vistaTienda
     */
    public vistaTienda() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
<<<<<<< HEAD
<<<<<<< HEAD
        jLabel4 = new javax.swing.JLabel();
=======
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
>>>>>>> 23dceff79a7fb20f120562c72726ec7ac18d3fcb
=======
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
>>>>>>> parent of 1a857c9... login e interfaces
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu_salir_ = new javax.swing.JMenuItem();
        menuRegistrar_ = new javax.swing.JMenu();
        jMenu_Registrarse_ = new javax.swing.JMenuItem();
        jMenu_consultar_ = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu_Ajustes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu_RegistrarInstrumento_ = new javax.swing.JMenuItem();
        jMenu_ConsultarInstrumento_ = new javax.swing.JMenuItem();
        jMenu_editarIstrumentos_ = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenu_RegistrarTyP_ = new javax.swing.JMenuItem();
        jMenu_ConsultarPyT_ = new javax.swing.JMenuItem();
        jMeu_editar = new javax.swing.JMenuItem();
        jMenu_RegistrarSonido_ = new javax.swing.JMenu();
        jMenu_RegistrarSonido = new javax.swing.JMenuItem();
        jMenu_ConsultarSonido = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel2.setText(" LA CLAVE");

<<<<<<< HEAD
<<<<<<< HEAD
        escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
=======
=======
>>>>>>> parent of 1a857c9... login e interfaces
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Note-musique-icon.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Note-musique-icon.png"))); // NOI18N

        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
<<<<<<< HEAD
>>>>>>> 23dceff79a7fb20f120562c72726ec7ac18d3fcb
=======
>>>>>>> parent of 1a857c9... login e interfaces

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
<<<<<<< HEAD
<<<<<<< HEAD
                .addGap(419, 419, 419)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(486, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
=======
                .addGap(442, 442, 442)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(716, Short.MAX_VALUE))
=======
                .addGap(442, 442, 442)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(473, Short.MAX_VALUE))
>>>>>>> parent of 1a857c9... login e interfaces
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
<<<<<<< HEAD
                .addContainerGap(436, Short.MAX_VALUE))
>>>>>>> 23dceff79a7fb20f120562c72726ec7ac18d3fcb
=======
                .addContainerGap(441, Short.MAX_VALUE))
>>>>>>> parent of 1a857c9... login e interfaces
        );

        getContentPane().add(escritorio);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/file.png"))); // NOI18N
        jMenu6.setText("File");
        jMenu6.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N

        jMenu_salir_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenu_salir_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jMenu_salir_.setText("Salir");
        jMenu_salir_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_salir_ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenu_salir_);

        jMenuBar1.add(jMenu6);

        menuRegistrar_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.png"))); // NOI18N
        menuRegistrar_.setText("Clientes");
        menuRegistrar_.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N

        jMenu_Registrarse_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenu_Registrarse_.setFont(new java.awt.Font("Rockwell Condensed", 0, 16)); // NOI18N
        jMenu_Registrarse_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jMenu_Registrarse_.setText("Registrarse");
        jMenu_Registrarse_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_Registrarse_ActionPerformed(evt);
            }
        });
        menuRegistrar_.add(jMenu_Registrarse_);

        jMenu_consultar_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenu_consultar_.setFont(new java.awt.Font("Rockwell Condensed", 0, 15)); // NOI18N
        jMenu_consultar_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reportes.png"))); // NOI18N
        jMenu_consultar_.setText("Consultar");
        jMenu_consultar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_consultar_ActionPerformed(evt);
            }
        });
        menuRegistrar_.add(jMenu_consultar_);
        menuRegistrar_.add(jSeparator1);

        jMenu_Ajustes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenu_Ajustes.setFont(new java.awt.Font("Rockwell Condensed", 0, 15)); // NOI18N
        jMenu_Ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajustes.png"))); // NOI18N
        jMenu_Ajustes.setText("Ajustes");
        jMenu_Ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_AjustesActionPerformed(evt);
            }
        });
        menuRegistrar_.add(jMenu_Ajustes);

        jMenuBar1.add(menuRegistrar_);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guitarra.png"))); // NOI18N
        jMenu2.setText("Instrumentos de cuerda y Viento");
        jMenu2.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N

        jMenu_RegistrarInstrumento_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenu_RegistrarInstrumento_.setFont(new java.awt.Font("Rockwell Condensed", 0, 16)); // NOI18N
        jMenu_RegistrarInstrumento_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jMenu_RegistrarInstrumento_.setText("Registrar");
        jMenu_RegistrarInstrumento_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_RegistrarInstrumento_ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu_RegistrarInstrumento_);

        jMenu_ConsultarInstrumento_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenu_ConsultarInstrumento_.setFont(new java.awt.Font("Rockwell Condensed", 0, 16)); // NOI18N
        jMenu_ConsultarInstrumento_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informesI.png"))); // NOI18N
        jMenu_ConsultarInstrumento_.setText("Informes");
        jMenu_ConsultarInstrumento_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_ConsultarInstrumento_ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu_ConsultarInstrumento_);

        jMenu_editarIstrumentos_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenu_editarIstrumentos_.setFont(new java.awt.Font("Rockwell Condensed", 0, 16)); // NOI18N
        jMenu_editarIstrumentos_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajustes.png"))); // NOI18N
        jMenu_editarIstrumentos_.setText("Editar");
        jMenu_editarIstrumentos_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_editarIstrumentos_ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu_editarIstrumentos_);
        jMenu2.add(jSeparator2);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/teclado.png"))); // NOI18N
        jMenu3.setText("Teclados y Pianos");
        jMenu3.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N

        jMenu_RegistrarTyP_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenu_RegistrarTyP_.setFont(new java.awt.Font("Rockwell Condensed", 0, 16)); // NOI18N
        jMenu_RegistrarTyP_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jMenu_RegistrarTyP_.setText("Registrar");
        jMenu_RegistrarTyP_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_RegistrarTyP_ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenu_RegistrarTyP_);

        jMenu_ConsultarPyT_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenu_ConsultarPyT_.setFont(new java.awt.Font("Rockwell Condensed", 0, 16)); // NOI18N
        jMenu_ConsultarPyT_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informpiano.png"))); // NOI18N
        jMenu_ConsultarPyT_.setText("Informes");
        jMenu_ConsultarPyT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_ConsultarPyT_ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenu_ConsultarPyT_);

        jMeu_editar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMeu_editar.setFont(new java.awt.Font("Rockwell Condensed", 0, 16)); // NOI18N
        jMeu_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajustes.png"))); // NOI18N
        jMeu_editar.setText("Editar");
        jMeu_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeu_editarActionPerformed(evt);
            }
        });
        jMenu3.add(jMeu_editar);

        jMenuBar1.add(jMenu3);

        jMenu_RegistrarSonido_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mircrofono.png"))); // NOI18N
        jMenu_RegistrarSonido_.setText("Sonido y Accesorios");
        jMenu_RegistrarSonido_.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N

        jMenu_RegistrarSonido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenu_RegistrarSonido.setFont(new java.awt.Font("Rockwell Condensed", 0, 16)); // NOI18N
        jMenu_RegistrarSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jMenu_RegistrarSonido.setText("Registrar");
        jMenu_RegistrarSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_RegistrarSonidoActionPerformed(evt);
            }
        });
        jMenu_RegistrarSonido_.add(jMenu_RegistrarSonido);

        jMenu_ConsultarSonido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenu_ConsultarSonido.setFont(new java.awt.Font("Rockwell Condensed", 0, 16)); // NOI18N
        jMenu_ConsultarSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informsonido.png"))); // NOI18N
        jMenu_ConsultarSonido.setText("Informes");
        jMenu_ConsultarSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_ConsultarSonidoActionPerformed(evt);
            }
        });
        jMenu_RegistrarSonido_.add(jMenu_ConsultarSonido);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem14.setFont(new java.awt.Font("Rockwell Condensed", 0, 16)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ajustes.png"))); // NOI18N
        jMenuItem14.setText("Editar");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu_RegistrarSonido_.add(jMenuItem14);

        jMenuBar1.add(jMenu_RegistrarSonido_);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/provedores.png"))); // NOI18N
        jMenu5.setText("Proveedores");
        jMenu5.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N

        jMenuItem17.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem17.setFont(new java.awt.Font("Rockwell Condensed", 0, 16)); // NOI18N
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        jMenuItem17.setText("Registrar");
        jMenu5.add(jMenuItem17);

        jMenuItem18.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem18.setFont(new java.awt.Font("Rockwell Condensed", 0, 16)); // NOI18N
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar.png"))); // NOI18N
        jMenuItem18.setText("Modificar");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);

        jMenuItem19.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem19.setFont(new java.awt.Font("Rockwell Condensed", 0, 16)); // NOI18N
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jMenuItem19.setText("Eliminar");
        jMenu5.add(jMenuItem19);

        jMenuItem20.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem20.setFont(new java.awt.Font("Rockwell Condensed", 0, 16)); // NOI18N
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jMenuItem20.setText("Consultar");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem20);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_consultar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_consultar_ActionPerformed
      Frm_ConsultarCliente panel= new Frm_ConsultarCliente(); //mostrar la ventana en el escritorio
      escritorio.add(panel);
      panel.show();
      
    }//GEN-LAST:event_jMenu_consultar_ActionPerformed

    private void jMenu_Registrarse_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_Registrarse_ActionPerformed
      FrmClientes panel= new FrmClientes(); //mostrar la ventana en el escritorio
      escritorio.add(panel);
      panel.show();
      
    }//GEN-LAST:event_jMenu_Registrarse_ActionPerformed

    private void jMenu_AjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_AjustesActionPerformed
       Frm_AjustesCliente panel= new Frm_AjustesCliente(); //mostrar la ventana en el escritorio
      escritorio.add(panel);
      panel.show();
    }//GEN-LAST:event_jMenu_AjustesActionPerformed

    private void jMenu_ConsultarInstrumento_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_ConsultarInstrumento_ActionPerformed
       Frm_ConsultaInstrumentosVyC panel= new Frm_ConsultaInstrumentosVyC(); //mostrar la ventana en el escritorio
      escritorio.add(panel);
      panel.show();
    }//GEN-LAST:event_jMenu_ConsultarInstrumento_ActionPerformed

    private void jMenu_RegistrarSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_RegistrarSonidoActionPerformed
      FrmRegistrar_Sonido panel= new FrmRegistrar_Sonido(); //mostrar la ventana en el escritorio
      escritorio.add(panel);
      panel.show();
    }//GEN-LAST:event_jMenu_RegistrarSonidoActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenu_salir_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_salir_ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jMenu_salir_ActionPerformed

    private void jMenu_RegistrarInstrumento_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_RegistrarInstrumento_ActionPerformed
     FrmInstrumentosdeCuerdayViento panel= new FrmInstrumentosdeCuerdayViento(); //mostrar la ventana en el escritorio
      escritorio.add(panel);
      panel.show();
      
    }//GEN-LAST:event_jMenu_RegistrarInstrumento_ActionPerformed

    private void jMenu_editarIstrumentos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_editarIstrumentos_ActionPerformed
       Editar_Instrumentos   panel= new Editar_Instrumentos(); //mostrar la ventana en el escritorio
      escritorio.add(panel);
      panel.show();
      
    }//GEN-LAST:event_jMenu_editarIstrumentos_ActionPerformed

    private void jMeu_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeu_editarActionPerformed
      FrmEditar_TecladoyPianos  panel= new FrmEditar_TecladoyPianos(); //mostrar la ventana en el escritorio
      escritorio.add(panel);
      panel.show();
      
    }//GEN-LAST:event_jMeu_editarActionPerformed

    private void jMenu_RegistrarTyP_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_RegistrarTyP_ActionPerformed
       FrmInstrumentosTecladoyPiano  panel= new FrmInstrumentosTecladoyPiano(); //mostrar la ventana en el escritorio
      escritorio.add(panel);
      panel.show();
    }//GEN-LAST:event_jMenu_RegistrarTyP_ActionPerformed

    private void jMenu_ConsultarPyT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_ConsultarPyT_ActionPerformed
        FrmConsultarPianoYteclado  panel= new FrmConsultarPianoYteclado(); //mostrar la ventana en el escritorio
      escritorio.add(panel);
      panel.show();
    }//GEN-LAST:event_jMenu_ConsultarPyT_ActionPerformed

    private void jMenu_ConsultarSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_ConsultarSonidoActionPerformed
         FrmConsultar_Sonido panel= new FrmConsultar_Sonido(); //mostrar la ventana en el escritorio
      escritorio.add(panel);
      panel.show();
    }//GEN-LAST:event_jMenu_ConsultarSonidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaTienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
<<<<<<< HEAD
<<<<<<< HEAD
    private javax.swing.JLabel jLabel4;
=======
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
>>>>>>> 23dceff79a7fb20f120562c72726ec7ac18d3fcb
=======
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
>>>>>>> parent of 1a857c9... login e interfaces
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenu_Ajustes;
    private javax.swing.JMenuItem jMenu_ConsultarInstrumento_;
    private javax.swing.JMenuItem jMenu_ConsultarPyT_;
    private javax.swing.JMenuItem jMenu_ConsultarSonido;
    private javax.swing.JMenuItem jMenu_RegistrarInstrumento_;
    private javax.swing.JMenuItem jMenu_RegistrarSonido;
    private javax.swing.JMenu jMenu_RegistrarSonido_;
    private javax.swing.JMenuItem jMenu_RegistrarTyP_;
    private javax.swing.JMenuItem jMenu_Registrarse_;
    private javax.swing.JMenuItem jMenu_consultar_;
    private javax.swing.JMenuItem jMenu_editarIstrumentos_;
    private javax.swing.JMenuItem jMenu_salir_;
    private javax.swing.JMenuItem jMeu_editar;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menuRegistrar_;
    // End of variables declaration//GEN-END:variables
}
