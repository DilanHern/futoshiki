/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Dilan
 */
public class MenuConfiguracion extends javax.swing.JFrame {

    /**
     * Creates new form MenuConfiguracion
     */
    public MenuConfiguracion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesTamaño = new javax.swing.ButtonGroup();
        botonesNivel = new javax.swing.ButtonGroup();
        botonesMultinivel = new javax.swing.ButtonGroup();
        botonesReloj = new javax.swing.ButtonGroup();
        botonesVentana = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabConfig = new javax.swing.JTabbedPane();
        tabTamaño = new javax.swing.JPanel();
        btn3x3 = new javax.swing.JRadioButton();
        btn4x4 = new javax.swing.JRadioButton();
        btn5x5 = new javax.swing.JRadioButton();
        btn6x6 = new javax.swing.JRadioButton();
        btn7x7 = new javax.swing.JRadioButton();
        btn8x8 = new javax.swing.JRadioButton();
        btn9x9 = new javax.swing.JRadioButton();
        btn10x10 = new javax.swing.JRadioButton();
        tabNivelJuego = new javax.swing.JPanel();
        btnFacil = new javax.swing.JRadioButton();
        btnIntermedio = new javax.swing.JRadioButton();
        btnDificil = new javax.swing.JRadioButton();
        tabMultinivel = new javax.swing.JPanel();
        btnSiMultinivel = new javax.swing.JRadioButton();
        btnNoMultinivel = new javax.swing.JRadioButton();
        tabReloj = new javax.swing.JPanel();
        btnCronometro = new javax.swing.JRadioButton();
        btnNoReloj = new javax.swing.JRadioButton();
        btnTemporizador = new javax.swing.JRadioButton();
        spinnerMins = new javax.swing.JSpinner();
        spinnerHoras = new javax.swing.JSpinner();
        spinnerSegs = new javax.swing.JSpinner();
        lblHoras = new javax.swing.JLabel();
        lblMins = new javax.swing.JLabel();
        lblSegs = new javax.swing.JLabel();
        tabPosicion = new javax.swing.JPanel();
        btnDerecha = new javax.swing.JRadioButton();
        btnIzquierda = new javax.swing.JRadioButton();
        tabNombre = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new Componentes.BotonRedondo();
        btnCancelar = new Componentes.BotonRedondo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cascadia Mono", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("Configuración");

        tabConfig.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        tabTamaño.setBackground(new java.awt.Color(255, 255, 255));

        btn3x3.setBackground(new java.awt.Color(255, 255, 255));
        botonesTamaño.add(btn3x3);
        btn3x3.setForeground(new java.awt.Color(204, 102, 0));
        btn3x3.setText("3x3");
        btn3x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3x3ActionPerformed(evt);
            }
        });

        btn4x4.setBackground(new java.awt.Color(255, 255, 255));
        botonesTamaño.add(btn4x4);
        btn4x4.setForeground(new java.awt.Color(204, 102, 0));
        btn4x4.setText("4x4");
        btn4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4x4ActionPerformed(evt);
            }
        });

        btn5x5.setBackground(new java.awt.Color(255, 255, 255));
        botonesTamaño.add(btn5x5);
        btn5x5.setForeground(new java.awt.Color(204, 102, 0));
        btn5x5.setText("5x5");

        btn6x6.setBackground(new java.awt.Color(255, 255, 255));
        botonesTamaño.add(btn6x6);
        btn6x6.setForeground(new java.awt.Color(204, 102, 0));
        btn6x6.setText("6x6");

        btn7x7.setBackground(new java.awt.Color(255, 255, 255));
        botonesTamaño.add(btn7x7);
        btn7x7.setForeground(new java.awt.Color(204, 102, 0));
        btn7x7.setText("7x7");

        btn8x8.setBackground(new java.awt.Color(255, 255, 255));
        botonesTamaño.add(btn8x8);
        btn8x8.setForeground(new java.awt.Color(204, 102, 0));
        btn8x8.setText("8x8");
        btn8x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8x8ActionPerformed(evt);
            }
        });

        btn9x9.setBackground(new java.awt.Color(255, 255, 255));
        botonesTamaño.add(btn9x9);
        btn9x9.setForeground(new java.awt.Color(204, 102, 0));
        btn9x9.setText("9x9");

        btn10x10.setBackground(new java.awt.Color(255, 255, 255));
        botonesTamaño.add(btn10x10);
        btn10x10.setForeground(new java.awt.Color(204, 102, 0));
        btn10x10.setText("10x10");

        javax.swing.GroupLayout tabTamañoLayout = new javax.swing.GroupLayout(tabTamaño);
        tabTamaño.setLayout(tabTamañoLayout);
        tabTamañoLayout.setHorizontalGroup(
            tabTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabTamañoLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(tabTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3x3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn5x5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn6x6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn4x4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(tabTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn8x8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7x7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10x10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9x9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
        tabTamañoLayout.setVerticalGroup(
            tabTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTamañoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(tabTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7x7)
                    .addComponent(btn3x3))
                .addGap(35, 35, 35)
                .addGroup(tabTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4x4)
                    .addComponent(btn8x8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(tabTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn5x5)
                    .addComponent(btn9x9))
                .addGap(40, 40, 40)
                .addGroup(tabTamañoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6x6)
                    .addComponent(btn10x10))
                .addGap(38, 38, 38))
        );

        tabConfig.addTab("Tamaño de la cuadricula", tabTamaño);

        tabNivelJuego.setBackground(new java.awt.Color(255, 255, 255));

        btnFacil.setBackground(new java.awt.Color(255, 255, 255));
        botonesNivel.add(btnFacil);
        btnFacil.setForeground(new java.awt.Color(204, 102, 0));
        btnFacil.setText("Facil");
        btnFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacilActionPerformed(evt);
            }
        });

        btnIntermedio.setBackground(new java.awt.Color(255, 255, 255));
        botonesNivel.add(btnIntermedio);
        btnIntermedio.setForeground(new java.awt.Color(204, 102, 0));
        btnIntermedio.setText("Intermedio");
        btnIntermedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntermedioActionPerformed(evt);
            }
        });

        btnDificil.setBackground(new java.awt.Color(255, 255, 255));
        botonesNivel.add(btnDificil);
        btnDificil.setForeground(new java.awt.Color(204, 102, 0));
        btnDificil.setText("Dificil");

        javax.swing.GroupLayout tabNivelJuegoLayout = new javax.swing.GroupLayout(tabNivelJuego);
        tabNivelJuego.setLayout(tabNivelJuegoLayout);
        tabNivelJuegoLayout.setHorizontalGroup(
            tabNivelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabNivelJuegoLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(tabNivelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIntermedio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        tabNivelJuegoLayout.setVerticalGroup(
            tabNivelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabNivelJuegoLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnFacil)
                .addGap(31, 31, 31)
                .addComponent(btnIntermedio)
                .addGap(30, 30, 30)
                .addComponent(btnDificil)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        tabConfig.addTab("Nivel del juego", tabNivelJuego);

        tabMultinivel.setBackground(new java.awt.Color(255, 255, 255));

        btnSiMultinivel.setBackground(new java.awt.Color(255, 255, 255));
        botonesMultinivel.add(btnSiMultinivel);
        btnSiMultinivel.setForeground(new java.awt.Color(204, 102, 0));
        btnSiMultinivel.setText("Si");

        btnNoMultinivel.setBackground(new java.awt.Color(255, 255, 255));
        botonesMultinivel.add(btnNoMultinivel);
        btnNoMultinivel.setForeground(new java.awt.Color(204, 102, 0));
        btnNoMultinivel.setText("No");

        javax.swing.GroupLayout tabMultinivelLayout = new javax.swing.GroupLayout(tabMultinivel);
        tabMultinivel.setLayout(tabMultinivelLayout);
        tabMultinivelLayout.setHorizontalGroup(
            tabMultinivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMultinivelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(tabMultinivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNoMultinivel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiMultinivel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        tabMultinivelLayout.setVerticalGroup(
            tabMultinivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMultinivelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnSiMultinivel)
                .addGap(53, 53, 53)
                .addComponent(btnNoMultinivel)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        tabConfig.addTab("Multinivel", tabMultinivel);

        tabReloj.setBackground(new java.awt.Color(255, 255, 255));

        btnCronometro.setBackground(new java.awt.Color(255, 255, 255));
        botonesReloj.add(btnCronometro);
        btnCronometro.setForeground(new java.awt.Color(204, 102, 0));
        btnCronometro.setText("Cronómetro");
        btnCronometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCronometroActionPerformed(evt);
            }
        });

        btnNoReloj.setBackground(new java.awt.Color(255, 255, 255));
        botonesReloj.add(btnNoReloj);
        btnNoReloj.setForeground(new java.awt.Color(204, 102, 0));
        btnNoReloj.setText("No");
        btnNoReloj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoRelojActionPerformed(evt);
            }
        });

        btnTemporizador.setBackground(new java.awt.Color(255, 255, 255));
        botonesReloj.add(btnTemporizador);
        btnTemporizador.setForeground(new java.awt.Color(204, 102, 0));
        btnTemporizador.setText("Temporizador");
        btnTemporizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemporizadorActionPerformed(evt);
            }
        });

        lblHoras.setForeground(new java.awt.Color(204, 102, 0));
        lblHoras.setText("Horas");

        lblMins.setForeground(new java.awt.Color(204, 102, 0));
        lblMins.setText("Mins.");

        lblSegs.setForeground(new java.awt.Color(204, 102, 0));
        lblSegs.setText("Segs.");

        javax.swing.GroupLayout tabRelojLayout = new javax.swing.GroupLayout(tabReloj);
        tabReloj.setLayout(tabRelojLayout);
        tabRelojLayout.setHorizontalGroup(
            tabRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabRelojLayout.createSequentialGroup()
                .addGroup(tabRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabRelojLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(tabRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNoReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabRelojLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnTemporizador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(tabRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSegs, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblMins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHoras, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addComponent(spinnerMins)
                        .addComponent(spinnerSegs)
                        .addComponent(spinnerHoras)))
                .addGap(51, 51, 51))
        );
        tabRelojLayout.setVerticalGroup(
            tabRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRelojLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblHoras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCronometro)
                    .addComponent(spinnerHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(lblMins)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNoReloj)
                    .addComponent(spinnerMins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(lblSegs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTemporizador)
                    .addComponent(spinnerSegs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        tabConfig.addTab("Uso del reloj", tabReloj);

        tabPosicion.setBackground(new java.awt.Color(255, 255, 255));

        btnDerecha.setBackground(new java.awt.Color(255, 255, 255));
        botonesVentana.add(btnDerecha);
        btnDerecha.setForeground(new java.awt.Color(204, 102, 0));
        btnDerecha.setText("Derecha");

        btnIzquierda.setBackground(new java.awt.Color(255, 255, 255));
        botonesVentana.add(btnIzquierda);
        btnIzquierda.setForeground(new java.awt.Color(204, 102, 0));
        btnIzquierda.setText("Izquierda");

        javax.swing.GroupLayout tabPosicionLayout = new javax.swing.GroupLayout(tabPosicion);
        tabPosicion.setLayout(tabPosicionLayout);
        tabPosicionLayout.setHorizontalGroup(
            tabPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabPosicionLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(tabPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );
        tabPosicionLayout.setVerticalGroup(
            tabPosicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPosicionLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnDerecha)
                .addGap(47, 47, 47)
                .addComponent(btnIzquierda)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        tabConfig.addTab("Posición de la ventana", tabPosicion);

        tabNombre.setBackground(new java.awt.Color(255, 255, 255));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setForeground(new java.awt.Color(204, 102, 0));

        jLabel2.setForeground(new java.awt.Color(204, 102, 0));
        jLabel2.setText("Escriba su nombre:");

        javax.swing.GroupLayout tabNombreLayout = new javax.swing.GroupLayout(tabNombre);
        tabNombre.setLayout(tabNombreLayout);
        tabNombreLayout.setHorizontalGroup(
            tabNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabNombreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addGroup(tabNombreLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 220, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabNombreLayout.setVerticalGroup(
            tabNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabNombreLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        tabConfig.addTab("Nombre del jugador", tabNombre);

        btnGuardar.setText("Guardar cambios");
        btnGuardar.setColor1(new java.awt.Color(102, 255, 0));
        btnGuardar.setColor2(new java.awt.Color(102, 255, 0));
        btnGuardar.setColor3(new java.awt.Color(102, 255, 0));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setColor1(new java.awt.Color(255, 0, 0));
        btnCancelar.setColor2(new java.awt.Color(255, 0, 0));
        btnCancelar.setColor3(new java.awt.Color(255, 0, 0));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tabConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tabConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4x4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4x4ActionPerformed

    private void btn3x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3x3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3x3ActionPerformed

    private void btn8x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8x8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8x8ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacilActionPerformed

    private void btnIntermedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntermedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIntermedioActionPerformed

    private void btnCronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCronometroActionPerformed

    private void btnNoRelojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoRelojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNoRelojActionPerformed

    private void btnTemporizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemporizadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTemporizadorActionPerformed

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
            java.util.logging.Logger.getLogger(MenuConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuConfiguracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botonesMultinivel;
    private javax.swing.ButtonGroup botonesNivel;
    private javax.swing.ButtonGroup botonesReloj;
    private javax.swing.ButtonGroup botonesTamaño;
    private javax.swing.ButtonGroup botonesVentana;
    public javax.swing.JRadioButton btn10x10;
    public javax.swing.JRadioButton btn3x3;
    public javax.swing.JRadioButton btn4x4;
    public javax.swing.JRadioButton btn5x5;
    public javax.swing.JRadioButton btn6x6;
    public javax.swing.JRadioButton btn7x7;
    public javax.swing.JRadioButton btn8x8;
    public javax.swing.JRadioButton btn9x9;
    public Componentes.BotonRedondo btnCancelar;
    public javax.swing.JRadioButton btnCronometro;
    public javax.swing.JRadioButton btnDerecha;
    public javax.swing.JRadioButton btnDificil;
    public javax.swing.JRadioButton btnFacil;
    public Componentes.BotonRedondo btnGuardar;
    public javax.swing.JRadioButton btnIntermedio;
    public javax.swing.JRadioButton btnIzquierda;
    public javax.swing.JRadioButton btnNoMultinivel;
    public javax.swing.JRadioButton btnNoReloj;
    public javax.swing.JRadioButton btnSiMultinivel;
    public javax.swing.JRadioButton btnTemporizador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblHoras;
    public javax.swing.JLabel lblMins;
    public javax.swing.JLabel lblSegs;
    public javax.swing.JSpinner spinnerHoras;
    public javax.swing.JSpinner spinnerMins;
    public javax.swing.JSpinner spinnerSegs;
    public javax.swing.JTabbedPane tabConfig;
    private javax.swing.JPanel tabMultinivel;
    private javax.swing.JPanel tabNivelJuego;
    private javax.swing.JPanel tabNombre;
    private javax.swing.JPanel tabPosicion;
    private javax.swing.JPanel tabReloj;
    private javax.swing.JPanel tabTamaño;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
