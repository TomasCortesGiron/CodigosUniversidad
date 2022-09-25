
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.Action;

import javax.swing.Icon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Labing
 */
public class DispensadorGaseosas extends javax.swing.JFrame {

    private String precioCocacola = "1600";
    private String precioMountaindDew = "1500";
    private String precioSprite = "1600";
    private String precioFantaNaranja = "1800";
    private String precioFantaManzana = "1850";
    private String precioColombiana = "1400";

    private String precio;
    private String valor;
    private double num;
    private double total;

    private double w;

    private double x;
    private double y;
    private double z;
    private double saldoTotal;

    public DispensadorGaseosas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollBar2 = new javax.swing.JScrollBar();
        scrollPane1 = new java.awt.ScrollPane();
        btnCocaCola = new javax.swing.JButton();
        btnMountandDew = new javax.swing.JButton();
        btnSprite = new javax.swing.JButton();
        btnFantaNaranja = new javax.swing.JButton();
        btnFantaManzana = new javax.swing.JButton();
        btnColombiana = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn8 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnConfirmarDinero = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtPanel = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        btnIngresarDinero = new javax.swing.JButton();
        btnBebidaAdicional = new javax.swing.JButton();
        jblMonedas = new javax.swing.JLabel();
        jblManzana = new javax.swing.JLabel();
        jblCoca = new javax.swing.JLabel();
        jblSprite = new javax.swing.JLabel();
        jblNaranja = new javax.swing.JLabel();
        jblColombia = new javax.swing.JLabel();
        jblMount = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 240));
        getContentPane().setLayout(null);

        btnCocaCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coca 3.png"))); // NOI18N
        btnCocaCola.setText("jButton1");
        btnCocaCola.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(240, 100, 0)));
        btnCocaCola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCocaColaMouseClicked(evt);
            }
        });
        btnCocaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCocaColaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCocaCola);
        btnCocaCola.setBounds(530, 80, 120, 100);

        btnMountandDew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mount 2.jpg"))); // NOI18N
        btnMountandDew.setText("jButton2");
        btnMountandDew.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 240, 0)));
        btnMountandDew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMountandDewMouseClicked(evt);
            }
        });
        getContentPane().add(btnMountandDew);
        btnMountandDew.setBounds(660, 80, 120, 100);

        btnSprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spride 3.jpg"))); // NOI18N
        btnSprite.setAutoscrolls(true);
        btnSprite.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 240)));
        btnSprite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSpriteMouseClicked(evt);
            }
        });
        btnSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpriteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSprite);
        btnSprite.setBounds(530, 190, 120, 100);

        btnFantaNaranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fanta2.jpg"))); // NOI18N
        btnFantaNaranja.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(240, 0, 0)));
        btnFantaNaranja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFantaNaranjaMouseClicked(evt);
            }
        });
        getContentPane().add(btnFantaNaranja);
        btnFantaNaranja.setBounds(660, 190, 120, 100);

        btnFantaManzana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manzanaf2.jpg"))); // NOI18N
        btnFantaManzana.setText("jButton5");
        btnFantaManzana.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(240, 100, 0)));
        btnFantaManzana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFantaManzanaMouseClicked(evt);
            }
        });
        getContentPane().add(btnFantaManzana);
        btnFantaManzana.setBounds(530, 300, 120, 100);

        btnColombiana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/colom2.png"))); // NOI18N
        btnColombiana.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(240, 0, 0)));
        btnColombiana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnColombianaMouseClicked(evt);
            }
        });
        getContentPane().add(btnColombiana);
        btnColombiana.setBounds(660, 300, 120, 100);

        jPanel1.setBackground(new java.awt.Color(240, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(51, 0, 204)));
        jPanel1.setForeground(new java.awt.Color(240, 0, 0));
        jPanel1.setOpaque(false);

        btn8.setBackground(new java.awt.Color(255, 0, 0));
        btn8.setText("8");
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(255, 0, 0));
        btn1.setText("1");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 0, 0));
        btn2.setText("2");
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 0, 0));
        btn3.setText("3");
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 0, 0));
        btn4.setText("4");
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 0, 0));
        btn5.setText("5");
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 0, 0));
        btn6.setText("6");
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 0, 0));
        btn7.setText("7");
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 0, 0));
        btn9.setText("9");
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        btnConfirmarDinero.setBackground(new java.awt.Color(255, 204, 51));
        btnConfirmarDinero.setText("Confirmar Dinero");
        btnConfirmarDinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarDineroMouseClicked(evt);
            }
        });

        btnPagar.setBackground(new java.awt.Color(255, 255, 0));
        btnPagar.setText("Pagar");
        btnPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPagarMouseClicked(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(255, 0, 0));
        btn0.setText("0");
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn0MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Borrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        txtSalida.setColumns(20);
        txtSalida.setRows(5);
        txtSalida.setText("Digite la cantidad de dinero en el botón: Ingresar dinero\nConfirme su valor en el botón: Confirmar Dinero.");
        txtPanel.setViewportView(txtSalida);

        btnIngresarDinero.setBackground(new java.awt.Color(255, 204, 51));
        btnIngresarDinero.setText("Ingresar Dinero");
        btnIngresarDinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarDineroMouseClicked(evt);
            }
        });

        btnBebidaAdicional.setBackground(new java.awt.Color(255, 204, 51));
        btnBebidaAdicional.setText("Bebida Adicional");
        btnBebidaAdicional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBebidaAdicionalMouseClicked(evt);
            }
        });

        jblMonedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/monedas.jpg"))); // NOI18N
        jblMonedas.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPanel)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnConfirmarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnIngresarDinero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnBebidaAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jblMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIngresarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBebidaAdicional, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnPagar))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jblMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 80, 470, 530);

        jblManzana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/manzana 2.jpg"))); // NOI18N
        getContentPane().add(jblManzana);
        jblManzana.setBounds(590, 420, 150, 210);

        jblCoca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cocacola.jpg"))); // NOI18N
        getContentPane().add(jblCoca);
        jblCoca.setBounds(590, 420, 150, 210);

        jblSprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sprite.jpg"))); // NOI18N
        getContentPane().add(jblSprite);
        jblSprite.setBounds(590, 420, 150, 210);

        jblNaranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/naranja.jpg"))); // NOI18N
        getContentPane().add(jblNaranja);
        jblNaranja.setBounds(590, 420, 150, 210);

        jblColombia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colombiana.jpg"))); // NOI18N
        getContentPane().add(jblColombia);
        jblColombia.setBounds(590, 420, 150, 210);

        jblMount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mountad.jpg"))); // NOI18N
        getContentPane().add(jblMount);
        jblMount.setBounds(590, 420, 150, 210);

        lblTitulo.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(240, 240, 240));
        lblTitulo.setText("GASEOSAS LA BEBIDA FELIZ");
        lblTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 7, 7, 7, new java.awt.Color(240, 240, 240)));
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(250, 20, 330, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo 2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCocaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCocaColaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCocaColaActionPerformed

    private void btnSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpriteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSpriteActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnCocaColaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCocaColaMouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + precioCocacola);
        precio = precioMountaindDew;
        calcular();
        mostrarCoca();
    }//GEN-LAST:event_btnCocaColaMouseClicked

    private void btnMountandDewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMountandDewMouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + precioMountaindDew);
        precio = precioMountaindDew;
        calcular();
        mostrarMountand();
    }//GEN-LAST:event_btnMountandDewMouseClicked

    private void btnSpriteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSpriteMouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + precioSprite);
        precio = precioSprite;
        mostrarSprite();
        calcular();
    }//GEN-LAST:event_btnSpriteMouseClicked

    private void btnFantaNaranjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFantaNaranjaMouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + precioFantaNaranja);
        precio = precioFantaNaranja;
        mostrarNaranja();
        calcular();
    }//GEN-LAST:event_btnFantaNaranjaMouseClicked

    private void btnFantaManzanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFantaManzanaMouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + precioFantaManzana);
        precio = precioFantaManzana;
        mostrarManzana();
        calcular();
    }//GEN-LAST:event_btnFantaManzanaMouseClicked

    private void btnColombianaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColombianaMouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + precioColombiana);
        precio = precioColombiana;
        mostrarColombia();
        calcular();
    }//GEN-LAST:event_btnColombianaMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        esconder();
        limpiar();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnConfirmarDineroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarDineroMouseClicked
        esconder();
        registrar();
        confirmarDinero();
        //otro();
    }//GEN-LAST:event_btnConfirmarDineroMouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + "1");
    }//GEN-LAST:event_btn1MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + "2");
    }//GEN-LAST:event_btn2MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + "3");
    }//GEN-LAST:event_btn3MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + "4");
    }//GEN-LAST:event_btn4MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + "5");
    }//GEN-LAST:event_btn5MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + "6");
    }//GEN-LAST:event_btn6MouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + "7");
    }//GEN-LAST:event_btn7MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + "8");
    }//GEN-LAST:event_btn8MouseClicked

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + "9");
    }//GEN-LAST:event_btn9MouseClicked

    private void btn0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseClicked
        esconder();
        txtSalida.setText(txtSalida.getText() + "0");
    }//GEN-LAST:event_btn0MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        esconder();
        borrar();
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarMouseClicked
        esconder();
        pagar();
    }//GEN-LAST:event_btnPagarMouseClicked

    private void btnIngresarDineroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarDineroMouseClicked
        esconder();
        ingresar();
    }//GEN-LAST:event_btnIngresarDineroMouseClicked

    private void btnBebidaAdicionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBebidaAdicionalMouseClicked
        esconder();
        otraGaseosa();
    }//GEN-LAST:event_btnBebidaAdicionalMouseClicked

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
            java.util.logging.Logger.getLogger(DispensadorGaseosas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DispensadorGaseosas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DispensadorGaseosas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DispensadorGaseosas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DispensadorGaseosas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBebidaAdicional;
    private javax.swing.JButton btnCocaCola;
    private javax.swing.JButton btnColombiana;
    private javax.swing.JButton btnConfirmarDinero;
    private javax.swing.JButton btnFantaManzana;
    private javax.swing.JButton btnFantaNaranja;
    private javax.swing.JButton btnIngresarDinero;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMountandDew;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnSprite;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JLabel jblCoca;
    private javax.swing.JLabel jblColombia;
    private javax.swing.JLabel jblManzana;
    private javax.swing.JLabel jblMonedas;
    private javax.swing.JLabel jblMount;
    private javax.swing.JLabel jblNaranja;
    private javax.swing.JLabel jblSprite;
    private javax.swing.JLabel lblTitulo;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JScrollPane txtPanel;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txtSalida.setText(" ");
        x = 0;
        y = 0;
        w = 0;
        z = 0;

        jblManzana.setVisible(false);
    }

    private void ingresar() {
        txtSalida.setText(" ");
    }

    private void registrar() {
        valor = txtSalida.getText();
        num = Double.parseDouble(valor);

        txtSalida.setText("El valor registrado es " + num + "$");
    }

    private void confirmarDinero() {

        txtSalida.setText("El valor registrado es " + num + "$\n"
                + "Por favor, escoja la gaseosa que desea comprar");
    }

    /*private void otro() {
        double total;
        total = num + 10;
        txtSalida.setText(" " + total);
    }*/
    private void borrar() {
        //valor = txtSalida.getText();

        if (valor.length() > 0) {
            valor = valor.substring(0, valor.length() - 1);
            txtSalida.setText(valor);
        }
    }

    private void calcular() {
        //valor = txtSalida.getText();
        x = Double.parseDouble(valor);

        //String newPrecio = precio;
        y = Double.parseDouble(precio);

        w = y + w;

        z = x - w;

        System.out.println("" + x);
        System.out.println("" + y);
        System.out.println("" + z);

        if (x < y) {
            txtSalida.setText("El saldo no es suficiente");
        } else {
            total = z;
            txtSalida.setText("El valor de la gaseosa es " + precio + "$\n"
                    + "Si desea finalzar el proceso, seleccione: Pagar.\n"
                    + "Si desea comprar otra bebida\n"
                    + "seleccione el botón: Bebida Adicional");
        }
    }

    private void pagar() {

        x = Double.parseDouble(valor);
        y = Double.parseDouble(precio);

        if (x < y) {
            txtSalida.setText("Por favor ingrese mas dinero");

        } else {
            saldoTotal = x - w;
            txtSalida.setText("El saldo es de " + saldoTotal + "$\n"
                    + "Su compra ha sido exitosa \nGracias "
                    + "y que disfrute la bebida");

            if (saldoTotal > 0) {
                txtSalida.setText("El saldo es de " + saldoTotal + "$\n"
                        + "Su compra ha sido exitosa \nGracias "
                        + "y que disfrute la bebida "
                        + "Por favor, recoja el dinero sobrante");
                jblMonedas.setVisible(true);
            }
        }
    }

    private void otraGaseosa() {

        if (z > y) {

            txtSalida.setText("El saldo es " + z + "$\n"
                    + "Por favor, escoja la gaseosa que desea comprar");
        } else {
            txtSalida.setText("El saldo es insuficiente, "
                    + "por favor cancele las gaseosas ya pagadas");
        }

    }

    private void esconder() {
        jblMonedas.setVisible(false);
        jblMount.setVisible(false);
        jblCoca.setVisible(false);
        jblSprite.setVisible(false);
        jblNaranja.setVisible(false);
        jblManzana.setVisible(false);
        jblColombia.setVisible(false);
    }

    private void mostrarMountand() {
        jblMount.setVisible(true);
    }

    private void mostrarCoca() {
        jblCoca.setVisible(true);
    }

    private void mostrarSprite() {
        jblSprite.setVisible(true);
    }

    private void mostrarNaranja() {
        jblNaranja.setVisible(true);
    }

    private void mostrarManzana() {
        jblManzana.setVisible(true);
    }

    private void mostrarColombia() {
        jblColombia.setVisible(true);
    }
}
