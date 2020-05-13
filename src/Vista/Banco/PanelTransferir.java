package Vista.Banco;

import Modelo.Banco.Cuenta;
import Modelo.Banco.Usuario;
import Utilidades.TextPrompt;
import Utilidades.Utilidades;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.SwingConstants;

/**
 *
 * @author mikesb
 */
public class PanelTransferir extends javax.swing.JPanel implements MouseListener, KeyListener {

    public PanelTransferir() {
        initComponents();
        txtPropRecep.setVisible(false);
        txtPropEmisor.setVisible(false);
        lblPropEmisor.setVisible(true);
        lblPropReceptor.setVisible(false);

        btnTransferir.addMouseListener(this);
        txtCuentaEmisora.addKeyListener(this);
        txtCuentaReceptora.addKeyListener(this);
        txtMonto.addKeyListener(this);

        TextPrompt phMonto = new TextPrompt("Q 00.00", txtMonto);

        phMonto.changeAlpha(70);
        phMonto.setHorizontalAlignment(SwingConstants.CENTER);

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormulario = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnTransferir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtCuentaEmisora = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtMontoMaximo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCuentaReceptora = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        lblPropEmisor = new javax.swing.JLabel();
        txtPropEmisor = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        lblPropReceptor = new javax.swing.JLabel();
        txtPropRecep = new javax.swing.JTextField();
        panelInfo = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        lblTipoCuentaEmisor = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        lblSaldoEmisor = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        lblDolaresEmisor = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        lblTipoCuentaReceptor = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        lblSaldoReceptor = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        lblDolaresReceptor = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(235, 247, 253));
        setLayout(new java.awt.GridLayout(1, 2));

        panelFormulario.setBackground(new java.awt.Color(235, 247, 253));
        panelFormulario.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(235, 247, 253));
        jPanel1.setPreferredSize(new java.awt.Dimension(670, 120));
        jPanel1.setLayout(new java.awt.GridLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 76, 117));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Transferencia de Fondos");
        jPanel1.add(jLabel1);

        panelFormulario.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(235, 247, 253));
        jPanel2.setPreferredSize(new java.awt.Dimension(670, 180));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel8.setText("                     ");
        jPanel2.add(jLabel8, java.awt.BorderLayout.LINE_START);

        jLabel9.setText("                     ");
        jPanel2.add(jLabel9, java.awt.BorderLayout.LINE_END);

        jPanel6.setBackground(new java.awt.Color(235, 247, 253));
        jPanel6.setLayout(new java.awt.BorderLayout());

        btnTransferir.setBackground(new java.awt.Color(69, 235, 165));
        btnTransferir.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        btnTransferir.setForeground(new java.awt.Color(235, 247, 253));
        btnTransferir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_exchange_30px.png"))); // NOI18N
        btnTransferir.setText("Transferir");
        btnTransferir.setBorder(null);
        btnTransferir.setContentAreaFilled(false);
        btnTransferir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferir.setEnabled(false);
        btnTransferir.setOpaque(true);
        btnTransferir.setPreferredSize(new java.awt.Dimension(137, 50));
        jPanel6.add(btnTransferir, java.awt.BorderLayout.PAGE_START);

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        panelFormulario.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        jPanel4.setBackground(new java.awt.Color(235, 247, 253));
        jPanel4.setMaximumSize(new java.awt.Dimension(335, 350));
        jPanel4.setPreferredSize(new java.awt.Dimension(335, 350));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel4.setText("       ");
        jPanel4.add(jLabel4, java.awt.BorderLayout.LINE_START);

        jLabel12.setText("       ");
        jPanel4.add(jLabel12, java.awt.BorderLayout.LINE_END);

        jPanel8.setBackground(new java.awt.Color(235, 247, 253));
        jPanel8.setLayout(new java.awt.GridLayout(9, 1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(15, 76, 117));
        jLabel19.setText("Cuenta Emisora");
        jPanel8.add(jLabel19);

        txtCuentaEmisora.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtCuentaEmisora.setForeground(new java.awt.Color(15, 76, 117));
        txtCuentaEmisora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCuentaEmisora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(225, 225, 225), new java.awt.Color(255, 255, 255), new java.awt.Color(225, 225, 225)));
        txtCuentaEmisora.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jPanel8.add(txtCuentaEmisora);

        jLabel20.setText("     ");
        jPanel8.add(jLabel20);

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(15, 76, 117));
        jLabel21.setText("Monto Máximo por día");
        jPanel8.add(jLabel21);

        txtMontoMaximo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtMontoMaximo.setForeground(new java.awt.Color(15, 76, 117));
        txtMontoMaximo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMontoMaximo.setText("Q 2000.00");
        txtMontoMaximo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(225, 225, 225), new java.awt.Color(255, 255, 255), new java.awt.Color(225, 225, 225)));
        txtMontoMaximo.setEnabled(false);
        txtMontoMaximo.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jPanel8.add(txtMontoMaximo);

        jLabel22.setText("     ");
        jPanel8.add(jLabel22);

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(15, 76, 117));
        jLabel23.setText("Monto a Transferir");
        jPanel8.add(jLabel23);

        txtMonto.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(15, 76, 117));
        txtMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMonto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(225, 225, 225), new java.awt.Color(255, 255, 255), new java.awt.Color(225, 225, 225)));
        txtMonto.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jPanel8.add(txtMonto);

        jPanel4.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(235, 247, 253));
        jPanel5.setMaximumSize(new java.awt.Dimension(5000, 489));
        jPanel5.setMinimumSize(new java.awt.Dimension(335, 350));
        jPanel5.setPreferredSize(new java.awt.Dimension(335, 350));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel15.setText("       ");
        jPanel5.add(jLabel15, java.awt.BorderLayout.LINE_START);

        jLabel16.setText("       ");
        jPanel5.add(jLabel16, java.awt.BorderLayout.LINE_END);

        jPanel7.setBackground(new java.awt.Color(235, 247, 253));
        jPanel7.setLayout(new java.awt.GridLayout(9, 1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 76, 117));
        jLabel3.setText("Cuenta Receptora");
        jPanel7.add(jLabel3);

        txtCuentaReceptora.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtCuentaReceptora.setForeground(new java.awt.Color(15, 76, 117));
        txtCuentaReceptora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCuentaReceptora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(225, 225, 225), new java.awt.Color(255, 255, 255), new java.awt.Color(225, 225, 225)));
        txtCuentaReceptora.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jPanel7.add(txtCuentaReceptora);

        jLabel17.setText("     ");
        jPanel7.add(jLabel17);

        lblPropEmisor.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        lblPropEmisor.setForeground(new java.awt.Color(15, 76, 117));
        lblPropEmisor.setText("Propietario de la Cuenta Emisora");
        jPanel7.add(lblPropEmisor);

        txtPropEmisor.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtPropEmisor.setForeground(new java.awt.Color(15, 76, 117));
        txtPropEmisor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPropEmisor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(225, 225, 225), new java.awt.Color(255, 255, 255), new java.awt.Color(225, 225, 225)));
        txtPropEmisor.setEnabled(false);
        txtPropEmisor.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jPanel7.add(txtPropEmisor);

        jLabel18.setText("     ");
        jPanel7.add(jLabel18);

        lblPropReceptor.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        lblPropReceptor.setForeground(new java.awt.Color(15, 76, 117));
        lblPropReceptor.setText("Propietario de la Cuenta Receptora");
        jPanel7.add(lblPropReceptor);

        txtPropRecep.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtPropRecep.setForeground(new java.awt.Color(15, 76, 117));
        txtPropRecep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPropRecep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(225, 225, 225), new java.awt.Color(255, 255, 255), new java.awt.Color(225, 225, 225)));
        txtPropRecep.setEnabled(false);
        txtPropRecep.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jPanel7.add(txtPropRecep);

        jPanel5.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5);

        panelFormulario.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(panelFormulario);

        panelInfo.setBackground(new java.awt.Color(235, 247, 253));
        panelInfo.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(235, 247, 253));
        jPanel9.setPreferredSize(new java.awt.Dimension(670, 120));
        jPanel9.setLayout(new java.awt.GridLayout(1, 2));

        jLabel2.setBackground(new java.awt.Color(235, 247, 253));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(15, 76, 117));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Emisor");
        jPanel9.add(jLabel2);

        jLabel5.setBackground(new java.awt.Color(235, 247, 253));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(15, 76, 117));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Receptor");
        jPanel9.add(jLabel5);

        panelInfo.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(235, 247, 253));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel6.setBackground(new java.awt.Color(235, 247, 253));
        jLabel6.setText("       ");
        jPanel10.add(jLabel6, java.awt.BorderLayout.LINE_START);

        jLabel7.setBackground(new java.awt.Color(235, 247, 253));
        jLabel7.setText("       ");
        jPanel10.add(jLabel7, java.awt.BorderLayout.LINE_END);

        jPanel11.setLayout(new java.awt.GridLayout(1, 2));

        jPanel12.setBackground(new java.awt.Color(235, 247, 253));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel10.setBackground(new java.awt.Color(235, 247, 253));
        jLabel10.setText("     ");
        jPanel12.add(jLabel10, java.awt.BorderLayout.LINE_END);

        jPanel16.setBackground(new java.awt.Color(235, 247, 253));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jLabel25.setText("     ");
        jPanel16.add(jLabel25, java.awt.BorderLayout.LINE_START);

        jPanel18.setLayout(new java.awt.GridLayout(3, 0));

        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel22.setBackground(new java.awt.Color(242, 19, 104));
        jPanel22.setPreferredSize(new java.awt.Dimension(290, 160));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel43.setBackground(new java.awt.Color(242, 19, 104));

        lblTipoCuentaEmisor.setBackground(new java.awt.Color(147, 222, 255));
        lblTipoCuentaEmisor.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTipoCuentaEmisor.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoCuentaEmisor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoCuentaEmisor.setText("--");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTipoCuentaEmisor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(lblTipoCuentaEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel22.add(jPanel43, java.awt.BorderLayout.PAGE_START);

        jPanel44.setBackground(new java.awt.Color(170, 35, 109));
        jPanel44.setLayout(new java.awt.GridLayout());

        jLabel33.setBackground(new java.awt.Color(147, 222, 255));
        jLabel33.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Tipo de Cuenta");
        jPanel44.add(jLabel33);

        jPanel22.add(jPanel44, java.awt.BorderLayout.CENTER);

        jPanel19.add(jPanel22, java.awt.BorderLayout.NORTH);

        jPanel23.setBackground(new java.awt.Color(235, 247, 253));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel19);

        jPanel45.setLayout(new java.awt.BorderLayout());

        jPanel46.setPreferredSize(new java.awt.Dimension(290, 160));
        jPanel46.setLayout(new java.awt.BorderLayout());

        jPanel47.setBackground(new java.awt.Color(250, 207, 90));

        lblSaldoEmisor.setBackground(new java.awt.Color(147, 222, 255));
        lblSaldoEmisor.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblSaldoEmisor.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldoEmisor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldoEmisor.setText("Q 00.00");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSaldoEmisor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addComponent(lblSaldoEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel46.add(jPanel47, java.awt.BorderLayout.PAGE_START);

        jPanel48.setBackground(new java.awt.Color(249, 89, 89));
        jPanel48.setLayout(new java.awt.GridLayout());

        jLabel34.setBackground(new java.awt.Color(147, 222, 255));
        jLabel34.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Saldo");
        jPanel48.add(jLabel34);

        jPanel46.add(jPanel48, java.awt.BorderLayout.CENTER);

        jPanel45.add(jPanel46, java.awt.BorderLayout.NORTH);

        jPanel49.setBackground(new java.awt.Color(235, 247, 253));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jPanel45.add(jPanel49, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel45);

        jPanel50.setLayout(new java.awt.BorderLayout());

        jPanel51.setPreferredSize(new java.awt.Dimension(290, 160));
        jPanel51.setLayout(new java.awt.BorderLayout());

        jPanel52.setBackground(new java.awt.Color(50, 130, 184));

        lblDolaresEmisor.setBackground(new java.awt.Color(147, 222, 255));
        lblDolaresEmisor.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblDolaresEmisor.setForeground(new java.awt.Color(255, 255, 255));
        lblDolaresEmisor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDolaresEmisor.setText("$ 00.00");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDolaresEmisor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addComponent(lblDolaresEmisor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel51.add(jPanel52, java.awt.BorderLayout.PAGE_START);

        jPanel53.setBackground(new java.awt.Color(15, 76, 117));
        jPanel53.setLayout(new java.awt.GridLayout());

        jLabel35.setBackground(new java.awt.Color(147, 222, 255));
        jLabel35.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Saldo en Dolares");
        jPanel53.add(jLabel35);

        jPanel51.add(jPanel53, java.awt.BorderLayout.CENTER);

        jPanel50.add(jPanel51, java.awt.BorderLayout.NORTH);

        jPanel54.setBackground(new java.awt.Color(235, 247, 253));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jPanel50.add(jPanel54, java.awt.BorderLayout.CENTER);

        jPanel18.add(jPanel50);

        jPanel16.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(235, 247, 253));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel11.setText("     ");
        jPanel13.add(jLabel11, java.awt.BorderLayout.LINE_START);

        jPanel15.setLayout(new java.awt.GridLayout(3, 0));

        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel20.setBackground(new java.awt.Color(242, 19, 104));
        jPanel20.setPreferredSize(new java.awt.Dimension(290, 160));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel31.setBackground(new java.awt.Color(242, 19, 104));

        lblTipoCuentaReceptor.setBackground(new java.awt.Color(147, 222, 255));
        lblTipoCuentaReceptor.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTipoCuentaReceptor.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoCuentaReceptor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoCuentaReceptor.setText("--");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTipoCuentaReceptor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(lblTipoCuentaReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel20.add(jPanel31, java.awt.BorderLayout.PAGE_START);

        jPanel32.setBackground(new java.awt.Color(170, 35, 109));
        jPanel32.setLayout(new java.awt.GridLayout());

        jLabel30.setBackground(new java.awt.Color(147, 222, 255));
        jLabel30.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Tipo de Cuenta");
        jPanel32.add(jLabel30);

        jPanel20.add(jPanel32, java.awt.BorderLayout.CENTER);

        jPanel17.add(jPanel20, java.awt.BorderLayout.NORTH);

        jPanel21.setBackground(new java.awt.Color(235, 247, 253));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel21, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel17);

        jPanel33.setLayout(new java.awt.BorderLayout());

        jPanel34.setPreferredSize(new java.awt.Dimension(290, 160));
        jPanel34.setLayout(new java.awt.BorderLayout());

        jPanel35.setBackground(new java.awt.Color(250, 207, 90));

        lblSaldoReceptor.setBackground(new java.awt.Color(147, 222, 255));
        lblSaldoReceptor.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblSaldoReceptor.setForeground(new java.awt.Color(255, 255, 255));
        lblSaldoReceptor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldoReceptor.setText("Q 00.00");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSaldoReceptor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addComponent(lblSaldoReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel34.add(jPanel35, java.awt.BorderLayout.PAGE_START);

        jPanel36.setBackground(new java.awt.Color(249, 89, 89));
        jPanel36.setLayout(new java.awt.GridLayout());

        jLabel32.setBackground(new java.awt.Color(147, 222, 255));
        jLabel32.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Saldo");
        jPanel36.add(jLabel32);

        jPanel34.add(jPanel36, java.awt.BorderLayout.CENTER);

        jPanel33.add(jPanel34, java.awt.BorderLayout.NORTH);

        jPanel37.setBackground(new java.awt.Color(235, 247, 253));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jPanel33.add(jPanel37, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel33);

        jPanel38.setLayout(new java.awt.BorderLayout());

        jPanel39.setPreferredSize(new java.awt.Dimension(290, 160));
        jPanel39.setLayout(new java.awt.BorderLayout());

        jPanel40.setBackground(new java.awt.Color(50, 130, 184));

        lblDolaresReceptor.setBackground(new java.awt.Color(147, 222, 255));
        lblDolaresReceptor.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblDolaresReceptor.setForeground(new java.awt.Color(255, 255, 255));
        lblDolaresReceptor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDolaresReceptor.setText("$ 00.00");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDolaresReceptor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addComponent(lblDolaresReceptor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel39.add(jPanel40, java.awt.BorderLayout.PAGE_START);

        jPanel41.setBackground(new java.awt.Color(15, 76, 117));
        jPanel41.setLayout(new java.awt.GridLayout());

        jLabel31.setBackground(new java.awt.Color(147, 222, 255));
        jLabel31.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Saldo en Dolares");
        jPanel41.add(jLabel31);

        jPanel39.add(jPanel41, java.awt.BorderLayout.CENTER);

        jPanel38.add(jPanel39, java.awt.BorderLayout.NORTH);

        jPanel42.setBackground(new java.awt.Color(235, 247, 253));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jPanel38.add(jPanel42, java.awt.BorderLayout.CENTER);

        jPanel15.add(jPanel38);

        jPanel13.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel11.add(jPanel13);

        jPanel10.add(jPanel11, java.awt.BorderLayout.CENTER);

        panelInfo.add(jPanel10, java.awt.BorderLayout.CENTER);

        add(panelInfo);
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar() {
        txtCuentaEmisora.setText("");
        txtCuentaReceptora.setText("");
        txtMonto.setText("Q 00.00");
        txtMonto.setText("");
        txtPropEmisor.setText("");
        txtPropRecep.setText("");
    }

    public void buscarCuenta(int opcion) {
        String cuenta;
        utilidad = new Utilidades();
        if (opcion == 0) {
            cuenta = txtCuentaEmisora.getText();
            if (utilidad.validarCuenta(cuenta)) {
                System.out.println("Buscando cuenta emisora " + cuenta + " en la Base de datos");

            }
        }
        if (opcion == 1) {
            cuenta = txtCuentaReceptora.getText();

            if (utilidad.validarCuenta(cuenta)) {
                System.out.println("Buscando cuenta receptora " + cuenta + " en la Base de datos");

            }
        }

        utilidad = null;
        cuenta = null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransferir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblDolaresEmisor;
    private javax.swing.JLabel lblDolaresReceptor;
    private javax.swing.JLabel lblPropEmisor;
    private javax.swing.JLabel lblPropReceptor;
    private javax.swing.JLabel lblSaldoEmisor;
    private javax.swing.JLabel lblSaldoReceptor;
    private javax.swing.JLabel lblTipoCuentaEmisor;
    private javax.swing.JLabel lblTipoCuentaReceptor;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JTextField txtCuentaEmisora;
    private javax.swing.JTextField txtCuentaReceptora;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtMontoMaximo;
    private javax.swing.JTextField txtPropEmisor;
    private javax.swing.JTextField txtPropRecep;
    // End of variables declaration//GEN-END:variables
    private Utilidades utilidad;
    private Cuenta cuenta;
    private Usuario usuario;
    public static final int BUSCAR_CUENTA_RECEPTORA = 1;
    public static final int BUSCAR_CUENTA_EMISORA = 0;

    @Override
    public void mouseClicked(MouseEvent e) {

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

        if (evt.equals(btnTransferir)) {
            if (btnTransferir.isEnabled()) {
                btnTransferir.setBackground(new Color(33, 171, 165));
            }
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object evt = e.getSource();

        if (evt.equals(btnTransferir)) {
            btnTransferir.setBackground(new Color(69, 235, 165));
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        Object evt = e.getSource();

        if (evt.equals(txtMonto)) {

            if (txtMonto.getText().equals("Q") || txtMonto.getText().equals("Q ")) {
                txtMonto.setText("");
            } else {
                String quetzales = "Q ";
                String monto = "";
                for (int i = 2; i < txtMonto.getText().length(); i++) {
                    monto = monto + txtMonto.getText().charAt(i);

                }
                txtMonto.setText(quetzales + monto);
            }

        }
    }

    @Override
    public void keyReleased(KeyEvent e
    ) {
        Object evt = e.getSource();

        if (evt.equals(txtCuentaEmisora)) {

            buscarCuenta(BUSCAR_CUENTA_EMISORA);
        }

        if (evt.equals(txtCuentaReceptora)) {

            buscarCuenta(BUSCAR_CUENTA_RECEPTORA);
        }

    }
}
