package Vista;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;


public class Jugar extends javax.swing.JFrame implements Serializable{

    /**
     * Creates new form Jugar
     */
    public Jugar() {
        initComponents();
        panelBotones.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreJugador = new javax.swing.JLabel();
        pnlDigitosIzq = new javax.swing.JPanel();
        pnlDigitosDer = new javax.swing.JPanel();
        panelTiempo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoras = new javax.swing.JLabel();
        txtMinutos = new javax.swing.JLabel();
        txtSegundos = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        PanelCuadriculas = new javax.swing.JPanel();
        PanelInterno = new javax.swing.JPanel();
        panelBotones = new javax.swing.JPanel();
        btnBorrarJugada = new Componentes.BotonRedondo();
        btnBorrarJuego = new Componentes.BotonRedondo();
        btnRehacerJugada = new Componentes.BotonRedondo();
        btnGuardarJuego = new Componentes.BotonRedondo();
        btnTerminarJuego = new Componentes.BotonRedondo();
        btnJugar = new Componentes.BotonRedondo();
        labelBorrador = new javax.swing.JLabel();
        btnVolverMenu = new Componentes.BotonRedondo();
        btnCargarJuego = new Componentes.BotonRedondo();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(220, 220, 220));

        jLabel1.setFont(new java.awt.Font("Cascadia Mono", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FUTOSHIKI");

        lblNombreJugador.setFont(new java.awt.Font("Cascadia Mono", 0, 18)); // NOI18N
        lblNombreJugador.setForeground(new java.awt.Color(0, 0, 0));
        lblNombreJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreJugador.setText("Jugador");

        pnlDigitosIzq.setBackground(new java.awt.Color(220, 220, 220));

        javax.swing.GroupLayout pnlDigitosIzqLayout = new javax.swing.GroupLayout(pnlDigitosIzq);
        pnlDigitosIzq.setLayout(pnlDigitosIzqLayout);
        pnlDigitosIzqLayout.setHorizontalGroup(
            pnlDigitosIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );
        pnlDigitosIzqLayout.setVerticalGroup(
            pnlDigitosIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        pnlDigitosDer.setBackground(new java.awt.Color(220, 220, 220));

        javax.swing.GroupLayout pnlDigitosDerLayout = new javax.swing.GroupLayout(pnlDigitosDer);
        pnlDigitosDer.setLayout(pnlDigitosDerLayout);
        pnlDigitosDerLayout.setHorizontalGroup(
            pnlDigitosDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        pnlDigitosDerLayout.setVerticalGroup(
            pnlDigitosDerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        panelTiempo.setBackground(new java.awt.Color(255, 255, 255));
        panelTiempo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Minutos");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Horas");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Segundos");
        jLabel5.setToolTipText("");

        txtHoras.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtHoras.setForeground(new java.awt.Color(0, 0, 0));
        txtHoras.setText("0");

        txtMinutos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtMinutos.setForeground(new java.awt.Color(0, 0, 0));
        txtMinutos.setText("0");

        txtSegundos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtSegundos.setForeground(new java.awt.Color(0, 0, 0));
        txtSegundos.setText("0");
        txtSegundos.setToolTipText("");

        javax.swing.GroupLayout panelTiempoLayout = new javax.swing.GroupLayout(panelTiempo);
        panelTiempo.setLayout(panelTiempoLayout);
        panelTiempoLayout.setHorizontalGroup(
            panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTiempoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtHoras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtMinutos))
                .addGap(18, 18, 18)
                .addGroup(panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtSegundos))
                .addGap(32, 32, 32))
        );
        panelTiempoLayout.setVerticalGroup(
            panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTiempoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTiempoLayout.createSequentialGroup()
                        .addGroup(panelTiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoras)
                            .addComponent(txtMinutos))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtSegundos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblNivel.setFont(new java.awt.Font("Cascadia Mono", 0, 18)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(0, 0, 0));
        lblNivel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivel.setText("Nivel");

        PanelCuadriculas.setBackground(new java.awt.Color(255, 255, 255));
        PanelCuadriculas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelInternoLayout = new javax.swing.GroupLayout(PanelInterno);
        PanelInterno.setLayout(PanelInternoLayout);
        PanelInternoLayout.setHorizontalGroup(
            PanelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );
        PanelInternoLayout.setVerticalGroup(
            PanelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelCuadriculasLayout = new javax.swing.GroupLayout(PanelCuadriculas);
        PanelCuadriculas.setLayout(PanelCuadriculasLayout);
        PanelCuadriculasLayout.setHorizontalGroup(
            PanelCuadriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuadriculasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelCuadriculasLayout.setVerticalGroup(
            PanelCuadriculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCuadriculasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBotones.setBackground(new java.awt.Color(220, 220, 220));

        btnBorrarJugada.setBackground(new java.awt.Color(204, 204, 0));
        btnBorrarJugada.setText("Borrar Jugada");
        btnBorrarJugada.setColor1(new java.awt.Color(204, 204, 0));
        btnBorrarJugada.setColor2(new java.awt.Color(204, 204, 0));
        btnBorrarJugada.setColor3(new java.awt.Color(204, 204, 0));
        btnBorrarJugada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarJugadaActionPerformed(evt);
            }
        });

        btnBorrarJuego.setBackground(new java.awt.Color(102, 102, 255));
        btnBorrarJuego.setText("Borrar Juego");
        btnBorrarJuego.setColor1(new java.awt.Color(102, 102, 255));
        btnBorrarJuego.setColor2(new java.awt.Color(102, 102, 255));
        btnBorrarJuego.setColor3(new java.awt.Color(102, 102, 255));

        btnRehacerJugada.setBackground(new java.awt.Color(153, 51, 255));
        btnRehacerJugada.setText("Rehacer Jugada");
        btnRehacerJugada.setToolTipText("");
        btnRehacerJugada.setColor1(new java.awt.Color(153, 51, 255));
        btnRehacerJugada.setColor2(new java.awt.Color(153, 51, 255));
        btnRehacerJugada.setColor3(new java.awt.Color(153, 51, 255));
        btnRehacerJugada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRehacerJugadaActionPerformed(evt);
            }
        });

        btnGuardarJuego.setBackground(new java.awt.Color(255, 102, 102));
        btnGuardarJuego.setText("Guardar Juego");
        btnGuardarJuego.setColor1(new java.awt.Color(255, 102, 102));
        btnGuardarJuego.setColor2(new java.awt.Color(255, 102, 102));
        btnGuardarJuego.setColor3(new java.awt.Color(255, 102, 102));
        btnGuardarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarJuegoActionPerformed(evt);
            }
        });

        btnTerminarJuego.setBackground(new java.awt.Color(0, 51, 102));
        btnTerminarJuego.setText("Terminar Juego");
        btnTerminarJuego.setColor1(new java.awt.Color(0, 51, 102));
        btnTerminarJuego.setColor2(new java.awt.Color(0, 51, 102));
        btnTerminarJuego.setColor3(new java.awt.Color(0, 51, 102));
        btnTerminarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarJuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRehacerJugada, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(btnGuardarJuego, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrarJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrarJugada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnTerminarJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBorrarJugada, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBorrarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnRehacerJugada, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTerminarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnJugar.setBackground(new java.awt.Color(255, 153, 0));
        btnJugar.setText("Jugar");
        btnJugar.setColor1(new java.awt.Color(255, 153, 0));
        btnJugar.setColor2(new java.awt.Color(255, 153, 0));
        btnJugar.setColor3(new java.awt.Color(255, 153, 0));
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        labelBorrador.setBackground(new java.awt.Color(0, 255, 0));
        labelBorrador.setForeground(new java.awt.Color(153, 255, 153));
        labelBorrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrarJugada.png"))); // NOI18N

        btnVolverMenu.setBackground(new java.awt.Color(255, 153, 153));
        btnVolverMenu.setText("Volver al menu principal");
        btnVolverMenu.setColor1(new java.awt.Color(255, 153, 153));
        btnVolverMenu.setColor2(new java.awt.Color(255, 153, 153));
        btnVolverMenu.setColor3(new java.awt.Color(255, 153, 153));
        btnVolverMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverMenuActionPerformed(evt);
            }
        });

        btnCargarJuego.setBackground(new java.awt.Color(51, 204, 255));
        btnCargarJuego.setText("Cargar Juego");
        btnCargarJuego.setColor1(new java.awt.Color(51, 204, 255));
        btnCargarJuego.setColor2(new java.awt.Color(51, 204, 255));
        btnCargarJuego.setColor3(new java.awt.Color(51, 204, 255));
        btnCargarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarJuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNombreJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(panelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnJugar, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                        .addComponent(btnCargarJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                        .addComponent(pnlDigitosIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelCuadriculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDigitosDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBorrador, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(370, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlDigitosIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNombreJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNivel)
                        .addGap(30, 30, 30)
                        .addComponent(panelTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelBorrador, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(pnlDigitosDer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelCuadriculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(389, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarActionPerformed

    private void botonRedondo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRedondo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRedondo6ActionPerformed

    private void btnRehacerJugadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRehacerJugadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRehacerJugadaActionPerformed

    private void btnTerminarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarJuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTerminarJuegoActionPerformed

    private void btnCargarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarJuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarJuegoActionPerformed

    private void btnGuardarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarJuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarJuegoActionPerformed

    private void btnBorrarJugadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarJugadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarJugadaActionPerformed

    private void btnVolverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolverMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jugar().setVisible(true);
            }
        });
    }   catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Jugar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelCuadriculas;
    public javax.swing.JPanel PanelInterno;
    public Componentes.BotonRedondo btnBorrarJuego;
    public Componentes.BotonRedondo btnBorrarJugada;
    public Componentes.BotonRedondo btnCargarJuego;
    public Componentes.BotonRedondo btnGuardarJuego;
    public Componentes.BotonRedondo btnJugar;
    public Componentes.BotonRedondo btnRehacerJugada;
    public Componentes.BotonRedondo btnTerminarJuego;
    public Componentes.BotonRedondo btnVolverMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JLabel labelBorrador;
    public javax.swing.JLabel lblNivel;
    public javax.swing.JLabel lblNombreJugador;
    public javax.swing.JPanel panelBotones;
    public javax.swing.JPanel panelTiempo;
    public javax.swing.JPanel pnlDigitosDer;
    public javax.swing.JPanel pnlDigitosIzq;
    public javax.swing.JLabel txtHoras;
    public javax.swing.JLabel txtMinutos;
    public javax.swing.JLabel txtSegundos;
    // End of variables declaration//GEN-END:variables
}
