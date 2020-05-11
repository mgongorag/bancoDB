package Vista.Banco;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

/**
 *
 * @author mikesb
 */
public class InicioCaja extends javax.swing.JFrame implements ActionListener, MouseListener {

    /**
     * Mis variables
     */
    public static final int INICIO = 0;
    public static final int RETIRAR = 1;
    public static final int DEPOSITAR = 2;
    public static final int TRANSFERIR = 3;
    public static final int AJUSTES = 4;
    public static final int LOGOUT = 5;
    
    public static final String LINICIO = "INICIO";
    public static final String LRETIRAR = "RETIRAR";
    public static final String LDEPOSITAR = "DEPOSITAR";
    public static final String LTRANSFERIR = "TRANSFERIR";
    public static final String LAJUSTES = "AJUSTES";
    
    protected int btnSelect;
    //public static final Color colorSeleccion = new Color(147, 222, 255);
    private int INCIO;
    
    PanelRetirar panelRetirar = new PanelRetirar();
    PanelInicio panelInicio = new PanelInicio();
    PanelDepositar panelDepositar = new PanelDepositar();
    PanelAjustes panelAjustes = new PanelAjustes();
    PanelTransferir panelTransferir = new PanelTransferir();
    
    public InicioCaja() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/img/bank.png")).getImage());
        this.setTitle("Sistema Bancario");
        btnSelect = INICIO;
        btnInicio.addActionListener(this);
        btnDepositar.addActionListener(this);
        btnRetirar.addActionListener(this);
        btnTransferir.addActionListener(this);
        btnAjustes.addActionListener(this);
        btnLogout.addActionListener(this);
        
        btnInicio.addMouseListener(this);
        btnDepositar.addMouseListener(this);
        btnRetirar.addMouseListener(this);
        btnTransferir.addMouseListener(this);
        btnAjustes.addMouseListener(this);
        btnLogout.addMouseListener(this);
        
        btnInicio.setBackground(new Color(50, 130, 184));
        
        container.add(panelInicio);
    }
    
    public InicioCaja(int id, String username, String tipoUser, String nombreBanco) {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/bank.png")).getImage());
        this.setTitle("Sistema Bancario  ~  " + nombreBanco);
        this.setLocationRelativeTo(null);
        lbluserName.setText(username);
        lbltypeUser.setText(tipoUser);
        lblNombreBanco.setText(nombreBanco);
        btnInicio.addActionListener(this);
        btnDepositar.addActionListener(this);
        btnRetirar.addActionListener(this);
        btnTransferir.addActionListener(this);
        btnAjustes.addActionListener(this);
        btnLogout.addActionListener(this);
        
        btnInicio.addMouseListener(this);
        btnDepositar.addMouseListener(this);
        btnRetirar.addMouseListener(this);
        btnTransferir.addMouseListener(this);
        btnAjustes.addMouseListener(this);
        btnLogout.addMouseListener(this);
        container.add(panelRetirar);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        panelHeaderLateral = new javax.swing.JPanel();
        lblNombreBanco = new javax.swing.JLabel();
        panelfooterLateral = new javax.swing.JPanel();
        btnAjustes = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        panelPrincipalLateral = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        btnTransferir = new javax.swing.JButton();
        panelCentral = new javax.swing.JPanel();
        panelHeaderCentral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbltypeUser = new javax.swing.JLabel();
        lbluserName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblPestania = new javax.swing.JLabel();
        panelFooterCentral = new javax.swing.JPanel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(970, 623));
        setPreferredSize(new java.awt.Dimension(1448, 950));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new java.awt.BorderLayout());

        panelLateral.setBackground(new java.awt.Color(44, 40, 39));
        panelLateral.setPreferredSize(new java.awt.Dimension(300, 750));
        panelLateral.setLayout(new java.awt.BorderLayout());

        panelHeaderLateral.setBackground(new java.awt.Color(35, 49, 66));
        panelHeaderLateral.setPreferredSize(new java.awt.Dimension(1093, 80));
        panelHeaderLateral.setLayout(new java.awt.BorderLayout());

        lblNombreBanco.setBackground(new java.awt.Color(94, 54, 106));
        lblNombreBanco.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblNombreBanco.setForeground(new java.awt.Color(235, 247, 253));
        lblNombreBanco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreBanco.setText("Nombre-Banco");
        panelHeaderLateral.add(lblNombreBanco, java.awt.BorderLayout.CENTER);

        panelLateral.add(panelHeaderLateral, java.awt.BorderLayout.NORTH);

        panelfooterLateral.setBackground(new java.awt.Color(35, 49, 66));
        panelfooterLateral.setPreferredSize(new java.awt.Dimension(250, 150));
        panelfooterLateral.setLayout(null);

        btnAjustes.setBackground(new java.awt.Color(35, 49, 66));
        btnAjustes.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        btnAjustes.setForeground(new java.awt.Color(235, 247, 253));
        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_settings_32px.png"))); // NOI18N
        btnAjustes.setText("  Ajustes");
        btnAjustes.setBorder(null);
        btnAjustes.setContentAreaFilled(false);
        btnAjustes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAjustes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAjustes.setOpaque(true);
        panelfooterLateral.add(btnAjustes);
        btnAjustes.setBounds(0, 50, 300, 50);

        btnLogout.setBackground(new java.awt.Color(35, 49, 66));
        btnLogout.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(235, 247, 253));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_logout_rounded_left_32px.png"))); // NOI18N
        btnLogout.setText("  Cerrar Sesión");
        btnLogout.setBorder(null);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogout.setOpaque(true);
        panelfooterLateral.add(btnLogout);
        btnLogout.setBounds(0, 100, 300, 50);

        panelLateral.add(panelfooterLateral, java.awt.BorderLayout.PAGE_END);

        panelPrincipalLateral.setBackground(new java.awt.Color(35, 49, 66));
        panelPrincipalLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(179, 183, 185));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 247, 253));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("   Menú de Navegación");
        panelPrincipalLateral.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        btnInicio.setBackground(new java.awt.Color(35, 49, 66));
        btnInicio.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(235, 247, 253));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_home_page_32px_2.png"))); // NOI18N
        btnInicio.setText("  Inicio");
        btnInicio.setBorder(null);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setOpaque(true);
        panelPrincipalLateral.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 300, 50));

        btnRetirar.setBackground(new java.awt.Color(35, 49, 66));
        btnRetirar.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(235, 247, 253));
        btnRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_request_money_32px_1.png"))); // NOI18N
        btnRetirar.setText("  Retirar");
        btnRetirar.setBorder(null);
        btnRetirar.setContentAreaFilled(false);
        btnRetirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetirar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRetirar.setOpaque(true);
        panelPrincipalLateral.add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, 50));

        btnDepositar.setBackground(new java.awt.Color(35, 49, 66));
        btnDepositar.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        btnDepositar.setForeground(new java.awt.Color(235, 247, 253));
        btnDepositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_initiate_money_transfer_30px.png"))); // NOI18N
        btnDepositar.setText("  Depositar");
        btnDepositar.setBorder(null);
        btnDepositar.setContentAreaFilled(false);
        btnDepositar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDepositar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDepositar.setOpaque(true);
        panelPrincipalLateral.add(btnDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 300, 50));

        btnTransferir.setBackground(new java.awt.Color(35, 49, 66));
        btnTransferir.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        btnTransferir.setForeground(new java.awt.Color(235, 247, 253));
        btnTransferir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_exchange_30px.png"))); // NOI18N
        btnTransferir.setText("  Transferir");
        btnTransferir.setBorder(null);
        btnTransferir.setContentAreaFilled(false);
        btnTransferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTransferir.setOpaque(true);
        panelPrincipalLateral.add(btnTransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, 50));

        panelLateral.add(panelPrincipalLateral, java.awt.BorderLayout.CENTER);

        bg.add(panelLateral, java.awt.BorderLayout.WEST);

        panelCentral.setLayout(new java.awt.BorderLayout());

        panelHeaderCentral.setBackground(new java.awt.Color(50, 130, 184));
        panelHeaderCentral.setPreferredSize(new java.awt.Dimension(670, 80));
        panelHeaderCentral.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(50, 130, 184));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 80));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel3.setText("                ");
        jPanel1.add(jLabel3, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(50, 130, 184));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltypeUser.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbltypeUser.setForeground(new java.awt.Color(147, 222, 255));
        lbltypeUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltypeUser.setText("Administrador");
        jPanel3.add(lbltypeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 30));

        lbluserName.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbluserName.setForeground(new java.awt.Color(147, 222, 255));
        lbluserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbluserName.setText("mgongorag");
        jPanel3.add(lbluserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 30));

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        panelHeaderCentral.add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(50, 130, 184));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        lblPestania.setFont(new java.awt.Font("Comic Sans MS", 3, 30)); // NOI18N
        lblPestania.setForeground(new java.awt.Color(147, 222, 255));
        lblPestania.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPestania.setText("INICIO");
        jPanel2.add(lblPestania);

        panelHeaderCentral.add(jPanel2, java.awt.BorderLayout.CENTER);

        panelCentral.add(panelHeaderCentral, java.awt.BorderLayout.PAGE_START);

        panelFooterCentral.setBackground(new java.awt.Color(50, 130, 184));

        javax.swing.GroupLayout panelFooterCentralLayout = new javax.swing.GroupLayout(panelFooterCentral);
        panelFooterCentral.setLayout(panelFooterCentralLayout);
        panelFooterCentralLayout.setHorizontalGroup(
            panelFooterCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 964, Short.MAX_VALUE)
        );
        panelFooterCentralLayout.setVerticalGroup(
            panelFooterCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelCentral.add(panelFooterCentral, java.awt.BorderLayout.PAGE_END);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new javax.swing.BoxLayout(container, javax.swing.BoxLayout.LINE_AXIS));
        panelCentral.add(container, java.awt.BorderLayout.CENTER);

        bg.add(panelCentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InicioCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioCaja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAjustes;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton btnTransferir;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblNombreBanco;
    private javax.swing.JLabel lblPestania;
    private javax.swing.JLabel lbltypeUser;
    private javax.swing.JLabel lbluserName;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelFooterCentral;
    private javax.swing.JPanel panelHeaderCentral;
    private javax.swing.JPanel panelHeaderLateral;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelPrincipalLateral;
    private javax.swing.JPanel panelfooterLateral;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object evt = e.getSource();
        
        if (evt.equals(btnInicio)) {
            btnSelect = INCIO;
            lblPestania.setText((LINICIO));
            System.out.println("boton Inicio clickeado");
            btnInicio.setBackground(new Color(50, 130, 184));
            btnRetirar.setBackground(new Color(35, 49, 66));
            btnDepositar.setBackground(new Color(35, 49, 66));
            btnTransferir.setBackground(new Color(35, 49, 66));
            btnAjustes.setBackground(new Color(35, 49, 66));
            btnLogout.setBackground(new Color(35, 49, 66));
            
            panelInicio.setVisible(true);
            panelRetirar.setVisible(false);
            panelDepositar.setVisible(false);
            panelTransferir.setVisible(false);
            panelAjustes.setVisible(false);
            
            container.add(panelInicio);
            container.validate();
            
        } else if (evt.equals(btnRetirar)) {
            btnSelect = RETIRAR;
            lblPestania.setText((LRETIRAR));
            System.out.println("Boton Retirar clickeado");
            btnInicio.setBackground(new Color(35, 49, 66));
            btnRetirar.setBackground(new Color(50, 130, 184));
            btnDepositar.setBackground(new Color(35, 49, 66));
            btnTransferir.setBackground(new Color(35, 49, 66));
            btnAjustes.setBackground(new Color(35, 49, 66));
            btnLogout.setBackground(new Color(35, 49, 66));
            
            panelRetirar.setVisible(true);
            panelInicio.setVisible(false);
            panelDepositar.setVisible(false);
            panelTransferir.setVisible(false);
            panelAjustes.setVisible(false);
            
            container.add(panelRetirar);
            container.validate();
            
        } else if (evt.equals(btnDepositar)) {
            btnSelect = DEPOSITAR;
            lblPestania.setText((LDEPOSITAR));
            System.out.println("Boton Depositar clickeado");
            btnInicio.setBackground(new Color(35, 49, 66));
            btnDepositar.setBackground(new Color(50, 130, 184));
            btnRetirar.setBackground(new Color(35, 49, 66));
            btnTransferir.setBackground(new Color(35, 49, 66));
            btnAjustes.setBackground(new Color(35, 49, 66));
            btnLogout.setBackground(new Color(35, 49, 66));
            
            panelInicio.setVisible(false);
            panelRetirar.setVisible(false);
            panelDepositar.setVisible(true);
            panelTransferir.setVisible(false);
            panelAjustes.setVisible(false);
            
            container.add(panelDepositar);
            container.validate();
            
        } else if (evt.equals(btnTransferir)) {
            btnSelect = TRANSFERIR;
            lblPestania.setText((LTRANSFERIR));
            System.out.println("Boton Informe clickeado");
            btnInicio.setBackground(new Color(35, 49, 66));
            btnTransferir.setBackground(new Color(50, 130, 184));
            btnRetirar.setBackground(new Color(35, 49, 66));
            btnDepositar.setBackground(new Color(35, 49, 66));
            btnAjustes.setBackground(new Color(35, 49, 66));
            btnLogout.setBackground(new Color(35, 49, 66));
            
            panelInicio.setVisible(false);
            panelRetirar.setVisible(false);
            panelDepositar.setVisible(false);
            panelTransferir.setVisible(true);
            panelAjustes.setVisible(false);
            
            container.add(panelTransferir);
            container.validate();
            
        } else if (evt.equals(btnAjustes)) {
            btnSelect = AJUSTES;
            lblPestania.setText((LAJUSTES));
            System.out.println("Boton Informe Ajsutes");
            btnInicio.setBackground(new Color(35, 49, 66));
            btnAjustes.setBackground(new Color(50, 130, 184));
            btnRetirar.setBackground(new Color(35, 49, 66));
            btnDepositar.setBackground(new Color(35, 49, 66));
            btnTransferir.setBackground(new Color(35, 49, 66));
            btnLogout.setBackground(new Color(35, 49, 66));
            
            panelInicio.setVisible(false);
            panelRetirar.setVisible(false);
            panelDepositar.setVisible(false);
            panelTransferir.setVisible(false);
            panelAjustes.setVisible(true);
            
            container.add(panelAjustes);
            container.validate();
            
        } else if (evt.equals(btnLogout)) {
            btnSelect = LOGOUT;
            System.out.println("Boton Logout clickeado");
            btnInicio.setBackground(new Color(35, 49, 66));
            btnLogout.setBackground(new Color(50, 130, 184));
            btnRetirar.setBackground(new Color(35, 49, 66));
            btnDepositar.setBackground(new Color(35, 49, 66));
            btnTransferir.setBackground(new Color(35, 49, 66));
            btnAjustes.setBackground(new Color(35, 49, 66));
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        /*
        Object evt = e.getSource();

        if (evt.equals(btnInicio)) {
            System.out.println("boton Inicio clickeado");
            btnInicio.setBackground(new Color(50, 130, 184));
            btnRetirar.setBackground(new Color(35, 49, 66));
            btnDepositar.setBackground(new Color(35, 49, 66));
            btnInforme.setBackground(new Color(35, 49, 66));
            btnAjustes.setBackground(new Color(35, 49, 66));
            btnLogout.setBackground(new Color(35, 49, 66));

        } else if (evt.equals(btnRetirar)) {
            System.out.println("Boton Retirar clickeado");
            btnInicio.setBackground(new Color(35, 49, 66));
            btnRetirar.setBackground(new Color(50, 130, 184));
            btnDepositar.setBackground(new Color(35, 49, 66));
            btnInforme.setBackground(new Color(35, 49, 66));
            btnAjustes.setBackground(new Color(35, 49, 66));
            btnLogout.setBackground(new Color(35, 49, 66));

        } else if (evt.equals(btnDepositar)) {
            System.out.println("Boton Depositar clickeado");
            btnInicio.setBackground(new Color(35, 49, 66));
            btnDepositar.setBackground(new Color(50, 130, 184));
            btnRetirar.setBackground(new Color(35, 49, 66));
            btnInforme.setBackground(new Color(35, 49, 66));
            btnAjustes.setBackground(new Color(35, 49, 66));
            btnLogout.setBackground(new Color(35, 49, 66));

        } else if (evt.equals(btnInforme)) {
            System.out.println("Boton Informe clickeado");
            btnInicio.setBackground(new Color(35, 49, 66));
            btnInforme.setBackground(new Color(50, 130, 184));
            btnRetirar.setBackground(new Color(35, 49, 66));
            btnDepositar.setBackground(new Color(35, 49, 66));
            btnAjustes.setBackground(new Color(35, 49, 66));
            btnLogout.setBackground(new Color(35, 49, 66));

        } else if (evt.equals(btnAjustes)) {
            System.out.println("Boton Informe Ajsutes");
            btnInicio.setBackground(new Color(35, 49, 66));
            btnAjustes.setBackground(new Color(50, 130, 184));
            btnRetirar.setBackground(new Color(35, 49, 66));
            btnDepositar.setBackground(new Color(35, 49, 66));
            btnInforme.setBackground(new Color(35, 49, 66));
            btnLogout.setBackground(new Color(35, 49, 66));

        } else if (evt.equals(btnLogout)) {
            System.out.println("Boton Logout clickeado");
            btnInicio.setBackground(new Color(35, 49, 66));
            btnLogout.setBackground(new Color(50, 130, 184));
            btnRetirar.setBackground(new Color(35, 49, 66));
            btnDepositar.setBackground(new Color(35, 49, 66));
            btnInforme.setBackground(new Color(35, 49, 66));
            btnAjustes.setBackground(new Color(35, 49, 66));
        }*/
        
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        
        Object evt = e.getSource();
        
        if (evt.equals(btnInicio)) {
            btnInicio.setBackground(new Color(50, 130, 184));
        }
        
        if (evt.equals(btnRetirar)) {
            btnRetirar.setBackground(new Color(50, 130, 184));
        }
        
        if (evt.equals(btnDepositar)) {
            btnDepositar.setBackground(new Color(50, 130, 184));
        }
        
        if (evt.equals(btnTransferir)) {
            btnTransferir.setBackground(new Color(50, 130, 184));
        }
        
        if (evt.equals(btnAjustes)) {
            btnAjustes.setBackground(new Color(50, 130, 184));
        }
        
        if (evt.equals(btnLogout)) {
            btnLogout.setBackground(new Color(50, 130, 184));
        }
        
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        
        Object evt = e.getSource();
        
        if (evt.equals(btnInicio)) {
            if (btnSelect != INICIO) {
                btnInicio.setBackground(new Color(35, 49, 66));
            }
        }
        
        if (evt.equals(btnRetirar)) {
            if (btnSelect != RETIRAR) {
                btnRetirar.setBackground(new Color(35, 49, 66));
                
            }
        }
        
        if (evt.equals(btnDepositar)) {
            if (btnSelect != DEPOSITAR) {
                btnDepositar.setBackground(new Color(35, 49, 66));
            }
        }
        
        if (evt.equals(btnTransferir)) {
            if (btnSelect != TRANSFERIR) {
                btnTransferir.setBackground(new Color(35, 49, 66));
            }
        }
        
        if (evt.equals(btnAjustes)) {
            if (btnSelect != AJUSTES) {
                btnAjustes.setBackground(new Color(35, 49, 66));
            }
        }
        
        if (evt.equals(btnLogout)) {
            if (btnSelect != LOGOUT) {
                btnLogout.setBackground(new Color(35, 49, 66));
            }
        }
        
    }
    
}
