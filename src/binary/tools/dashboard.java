package binary.tools;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class dashboard extends javax.swing.JFrame {
    int xMouse;
    int yMouse;
    int f1 = 0, f2 = 102, f3 = 255;
    int s1 = 102, s2 = 153, s3 = 255;  

    public dashboard() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        up_bar = new javax.swing.JPanel();
        exitButton = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_home = new javax.swing.JPanel();
        ind_home = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_baseConverter = new javax.swing.JPanel();
        ind_baseConverter = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_binaryCalculator = new javax.swing.JPanel();
        ind_binaryCalculator = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_settings = new javax.swing.JPanel();
        ind_settings = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        parent = new javax.swing.JPanel();
        start_pnl = new javax.swing.JPanel();
        logo_welcome = new javax.swing.JLabel();
        sentece = new javax.swing.JLabel();
        lbl_partners = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        home_panel = new javax.swing.JPanel();
        baseConverter_panel = new javax.swing.JPanel();
        number_label = new javax.swing.JLabel();
        number_textField = new javax.swing.JTextField();
        fromBase_label = new javax.swing.JLabel();
        fromBaseBox = new javax.swing.JComboBox<>();
        toBase_label = new javax.swing.JLabel();
        toBaseBox = new javax.swing.JComboBox<>();
        convert_btn = new javax.swing.JButton();
        reset_btn = new javax.swing.JButton();
        swap_btn = new javax.swing.JButton();
        resultNumber_label = new javax.swing.JLabel();
        jScrollPane_resultNumber = new javax.swing.JScrollPane();
        resultNumberArea = new javax.swing.JTextArea();
        binaryCalculator_panel = new javax.swing.JPanel();
        firstNumber_label = new javax.swing.JLabel();
        t_Field1 = new javax.swing.JTextField();
        selectBase = new javax.swing.JComboBox<>();
        base_label = new javax.swing.JLabel();
        secondNumber_label = new javax.swing.JLabel();
        t_Field2 = new javax.swing.JTextField();
        choseOperation = new javax.swing.JComboBox<>();
        operation_label = new javax.swing.JLabel();
        calculate_btn = new javax.swing.JButton();
        reset_btn1 = new javax.swing.JButton();
        binResult_label = new javax.swing.JLabel();
        jScrollPane_Hex = new javax.swing.JScrollPane();
        textArea_Hex = new javax.swing.JTextArea();
        decResult_label = new javax.swing.JLabel();
        jScrollPane_Bin = new javax.swing.JScrollPane();
        textArea_Bin = new javax.swing.JTextArea();
        hexResult_label = new javax.swing.JLabel();
        jScrollPane_Dec = new javax.swing.JScrollPane();
        textArea_Dec = new javax.swing.JTextArea();
        settings_panel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        SelectColorButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        up_bar.setBackground(new java.awt.Color(255, 255, 255));
        up_bar.setMaximumSize(new java.awt.Dimension(410, 30));
        up_bar.setMinimumSize(new java.awt.Dimension(410, 30));
        up_bar.setPreferredSize(new java.awt.Dimension(410, 30));

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(204, 204, 204));
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButton.setText("X");
        exitButton.setMaximumSize(new java.awt.Dimension(30, 30));
        exitButton.setMinimumSize(new java.awt.Dimension(30, 30));
        exitButton.setOpaque(true);
        exitButton.setPreferredSize(new java.awt.Dimension(30, 30));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout up_barLayout = new javax.swing.GroupLayout(up_bar);
        up_bar.setLayout(up_barLayout);
        up_barLayout.setHorizontalGroup(
            up_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, up_barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        up_barLayout.setVerticalGroup(
            up_barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(up_barLayout.createSequentialGroup()
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu.setBackground(new java.awt.Color(0, 102, 255));
        menu.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Binary Tools");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ver 1.0");

        btn_home.setBackground(new java.awt.Color(0, 102, 255));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_homeMouseExited(evt);
            }
        });
        btn_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_home.setBackground(new java.awt.Color(255, 255, 255));
        ind_home.setOpaque(false);
        ind_home.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout ind_homeLayout = new javax.swing.GroupLayout(ind_home);
        ind_home.setLayout(ind_homeLayout);
        ind_homeLayout.setHorizontalGroup(
            ind_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        ind_homeLayout.setVerticalGroup(
            ind_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_home.add(ind_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HOME");
        btn_home.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 70, 20));

        btn_baseConverter.setBackground(new java.awt.Color(0, 102, 255));
        btn_baseConverter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_baseConverterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_baseConverterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_baseConverterMouseExited(evt);
            }
        });
        btn_baseConverter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_baseConverter.setBackground(new java.awt.Color(255, 255, 255));
        ind_baseConverter.setOpaque(false);
        ind_baseConverter.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout ind_baseConverterLayout = new javax.swing.GroupLayout(ind_baseConverter);
        ind_baseConverter.setLayout(ind_baseConverterLayout);
        ind_baseConverterLayout.setHorizontalGroup(
            ind_baseConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        ind_baseConverterLayout.setVerticalGroup(
            ind_baseConverterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_baseConverter.add(ind_baseConverter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Base Converter");
        btn_baseConverter.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, 20));

        btn_binaryCalculator.setBackground(new java.awt.Color(0, 102, 255));
        btn_binaryCalculator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_binaryCalculatorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_binaryCalculatorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_binaryCalculatorMouseExited(evt);
            }
        });
        btn_binaryCalculator.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_binaryCalculator.setBackground(new java.awt.Color(255, 255, 255));
        ind_binaryCalculator.setOpaque(false);
        ind_binaryCalculator.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout ind_binaryCalculatorLayout = new javax.swing.GroupLayout(ind_binaryCalculator);
        ind_binaryCalculator.setLayout(ind_binaryCalculatorLayout);
        ind_binaryCalculatorLayout.setHorizontalGroup(
            ind_binaryCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        ind_binaryCalculatorLayout.setVerticalGroup(
            ind_binaryCalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_binaryCalculator.add(ind_binaryCalculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Base Calculator");
        btn_binaryCalculator.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, 20));

        btn_settings.setBackground(new java.awt.Color(0, 102, 255));
        btn_settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_settingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_settingsMouseExited(evt);
            }
        });
        btn_settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_settings.setBackground(new java.awt.Color(255, 255, 255));
        ind_settings.setOpaque(false);
        ind_settings.setPreferredSize(new java.awt.Dimension(5, 40));

        javax.swing.GroupLayout ind_settingsLayout = new javax.swing.GroupLayout(ind_settings);
        ind_settings.setLayout(ind_settingsLayout);
        ind_settingsLayout.setHorizontalGroup(
            ind_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        ind_settingsLayout.setVerticalGroup(
            ind_settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_settings.add(ind_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 5, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Settings");
        btn_settings.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 70, 20));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BIN.png"))); // NOI18N

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_baseConverter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_binaryCalculator, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addComponent(btn_settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(29, 29, 29)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(75, 75, 75)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_baseConverter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_binaryCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        parent.setBackground(new java.awt.Color(255, 255, 255));
        parent.setMaximumSize(new java.awt.Dimension(410, 525));
        parent.setMinimumSize(new java.awt.Dimension(410, 525));
        parent.setPreferredSize(new java.awt.Dimension(410, 525));
        parent.setLayout(new java.awt.CardLayout());

        start_pnl.setBackground(new java.awt.Color(255, 255, 255));

        logo_welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_welcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/welcome.png"))); // NOI18N

        sentece.setBackground(new java.awt.Color(0, 204, 0));
        sentece.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        sentece.setForeground(new java.awt.Color(0, 255, 0));
        sentece.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sentece.setText("Make your work easier with our tools");

        lbl_partners.setBackground(new java.awt.Color(204, 204, 204));
        lbl_partners.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_partners.setForeground(new java.awt.Color(51, 51, 51));
        lbl_partners.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_partners.setText("Partners");

        javax.swing.GroupLayout start_pnlLayout = new javax.swing.GroupLayout(start_pnl);
        start_pnl.setLayout(start_pnlLayout);
        start_pnlLayout.setHorizontalGroup(
            start_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(start_pnlLayout.createSequentialGroup()
                .addGroup(start_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(start_pnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sentece, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(start_pnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_partners, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        start_pnlLayout.setVerticalGroup(
            start_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(start_pnlLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(logo_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(sentece, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(start_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_partners, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(86, 86, 86))
        );

        parent.add(start_pnl, "card2");

        javax.swing.GroupLayout home_panelLayout = new javax.swing.GroupLayout(home_panel);
        home_panel.setLayout(home_panelLayout);
        home_panelLayout.setHorizontalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        home_panelLayout.setVerticalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        parent.add(home_panel, "card3");

        number_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        number_label.setText("Number:");

        number_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fromBase_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fromBase_label.setText("From base:");

        fromBaseBox.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        fromBaseBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "8", "10", "16" }));

        toBase_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toBase_label.setText("To base:");

        toBaseBox.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        toBaseBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "8", "10", "16" }));

        convert_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        convert_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_btn/convert.png"))); // NOI18N
        convert_btn.setText("Convert");
        convert_btn.setFocusable(false);
        convert_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convert_btnActionPerformed(evt);
            }
        });

        reset_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reset_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_btn/reset.png"))); // NOI18N
        reset_btn.setText("Reset");
        reset_btn.setFocusable(false);
        reset_btn.setMaximumSize(new java.awt.Dimension(101, 25));
        reset_btn.setMinimumSize(new java.awt.Dimension(101, 25));
        reset_btn.setPreferredSize(new java.awt.Dimension(101, 25));
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });

        swap_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        swap_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_btn/swap.png"))); // NOI18N
        swap_btn.setText("Swap");
        swap_btn.setFocusable(false);
        swap_btn.setMaximumSize(new java.awt.Dimension(101, 25));
        swap_btn.setMinimumSize(new java.awt.Dimension(101, 25));
        swap_btn.setPreferredSize(new java.awt.Dimension(101, 25));
        swap_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swap_btnActionPerformed(evt);
            }
        });

        resultNumber_label.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        resultNumber_label.setText("Result number:");

        resultNumberArea.setColumns(20);
        resultNumberArea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resultNumberArea.setRows(5);
        jScrollPane_resultNumber.setViewportView(resultNumberArea);

        javax.swing.GroupLayout baseConverter_panelLayout = new javax.swing.GroupLayout(baseConverter_panel);
        baseConverter_panel.setLayout(baseConverter_panelLayout);
        baseConverter_panelLayout.setHorizontalGroup(
            baseConverter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseConverter_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(baseConverter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane_resultNumber)
                    .addComponent(toBaseBox, 0, 369, Short.MAX_VALUE)
                    .addComponent(fromBaseBox, 0, 369, Short.MAX_VALUE)
                    .addComponent(number_textField)
                    .addComponent(toBase_label, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number_label, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fromBase_label, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(baseConverter_panelLayout.createSequentialGroup()
                        .addGroup(baseConverter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultNumber_label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(baseConverter_panelLayout.createSequentialGroup()
                                .addComponent(convert_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(swap_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        baseConverter_panelLayout.setVerticalGroup(
            baseConverter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseConverter_panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(number_label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(number_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fromBase_label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fromBaseBox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toBase_label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toBaseBox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(baseConverter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convert_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(swap_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultNumber_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane_resultNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        parent.add(baseConverter_panel, "card4");

        binaryCalculator_panel.setBorder(new javax.swing.border.MatteBorder(null));

        firstNumber_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstNumber_label.setText("First Number:");

        t_Field1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        selectBase.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selectBase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "10", "16" }));

        base_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        base_label.setText("Base:");

        secondNumber_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        secondNumber_label.setText("Second Number:");

        t_Field2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        choseOperation.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        choseOperation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "add (+) ", "sub (-) ", "mult (x) ", "div (÷) ", "and (&) ", "or (|) ", "not (~) ", "xor (^) ", "left shift (<<) ", "right shift (>>)" }));

        operation_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        operation_label.setText("Operation:");

        calculate_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        calculate_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_btn/settings.png"))); // NOI18N
        calculate_btn.setText("Calculate");
        calculate_btn.setFocusable(false);
        calculate_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_btnActionPerformed(evt);
            }
        });

        reset_btn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reset_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_btn/reset.png"))); // NOI18N
        reset_btn1.setText("Reset");
        reset_btn1.setFocusable(false);
        reset_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btn1ActionPerformed(evt);
            }
        });

        binResult_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        binResult_label.setText("Binary Number Result:");

        textArea_Hex.setColumns(20);
        textArea_Hex.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textArea_Hex.setRows(5);
        jScrollPane_Hex.setViewportView(textArea_Hex);

        decResult_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        decResult_label.setText("Decimal Number Result:");

        textArea_Bin.setColumns(20);
        textArea_Bin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textArea_Bin.setRows(5);
        jScrollPane_Bin.setViewportView(textArea_Bin);

        hexResult_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hexResult_label.setText("Hex Number Result:");

        textArea_Dec.setColumns(20);
        textArea_Dec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textArea_Dec.setRows(5);
        jScrollPane_Dec.setViewportView(textArea_Dec);

        javax.swing.GroupLayout binaryCalculator_panelLayout = new javax.swing.GroupLayout(binaryCalculator_panel);
        binaryCalculator_panel.setLayout(binaryCalculator_panelLayout);
        binaryCalculator_panelLayout.setHorizontalGroup(
            binaryCalculator_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(binaryCalculator_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(binaryCalculator_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(binaryCalculator_panelLayout.createSequentialGroup()
                        .addGroup(binaryCalculator_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(binaryCalculator_panelLayout.createSequentialGroup()
                                .addGroup(binaryCalculator_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNumber_label, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(binaryCalculator_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(base_label)
                                    .addComponent(selectBase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, binaryCalculator_panelLayout.createSequentialGroup()
                                .addGroup(binaryCalculator_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(secondNumber_label, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(binaryCalculator_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(operation_label, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(choseOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26))
                    .addGroup(binaryCalculator_panelLayout.createSequentialGroup()
                        .addGroup(binaryCalculator_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(binaryCalculator_panelLayout.createSequentialGroup()
                                .addComponent(calculate_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reset_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane_Hex, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(binResult_label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decResult_label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane_Bin, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hexResult_label, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane_Dec, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        binaryCalculator_panelLayout.setVerticalGroup(
            binaryCalculator_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(binaryCalculator_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(binaryCalculator_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNumber_label, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(base_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(binaryCalculator_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t_Field1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(selectBase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(binaryCalculator_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondNumber_label)
                    .addComponent(operation_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(binaryCalculator_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t_Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choseOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(binaryCalculator_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculate_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(binResult_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_Bin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decResult_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_Dec, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hexResult_label, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_Hex, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        parent.add(binaryCalculator_panel, "card5");

        settings_panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Choose Color:");

        SelectColorButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SelectColorButton.setText("Select Color");
        SelectColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectColorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settings_panelLayout = new javax.swing.GroupLayout(settings_panel);
        settings_panel.setLayout(settings_panelLayout);
        settings_panelLayout.setHorizontalGroup(
            settings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settings_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelectColorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        settings_panelLayout.setVerticalGroup(
            settings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settings_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(settings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(SelectColorButton))
                .addContainerGap(484, Short.MAX_VALUE))
        );

        parent.add(settings_panel, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(up_bar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(up_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(parent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(690, 555));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

// set Color
    void setColor(JPanel panel){
        panel.setBackground(new Color(s1,s2,s3));       
    }
    void resetColor(JPanel panel1){
        panel1.setBackground(new Color(f1,f2,f3));       
    }
    
   
// exit button   
    private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
        exitButton.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_exitButtonMouseEntered
    private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
        exitButton.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_exitButtonMouseExited
    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

// move window
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();       
    }//GEN-LAST:event_formMousePressed
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged
    
// change panels/windows on clicked
    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
       parent.removeAll();
       parent.repaint();
       parent.revalidate();
       parent.add(start_pnl);
       titleLabel.setText("");
       parent.repaint();
       parent.revalidate(); 
    }//GEN-LAST:event_btn_homeMouseClicked
    private void btn_baseConverterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_baseConverterMouseClicked
       parent.removeAll();
       parent.repaint();
       parent.revalidate();
       parent.add(baseConverter_panel);
       titleLabel.setText("Base Converter");
       parent.repaint();
       parent.revalidate(); 
    }//GEN-LAST:event_btn_baseConverterMouseClicked
    private void btn_binaryCalculatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_binaryCalculatorMouseClicked
       parent.removeAll();
       parent.repaint();
       parent.revalidate();
       parent.add(binaryCalculator_panel);
       titleLabel.setText("Base Calculator");
       parent.repaint();
       parent.revalidate(); 
    }//GEN-LAST:event_btn_binaryCalculatorMouseClicked
    private void btn_settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_settingsMouseClicked
       parent.removeAll();
       parent.repaint();
       parent.revalidate();
       parent.add(settings_panel);
       titleLabel.setText("Settings");
       parent.repaint();
       parent.revalidate(); 
    }//GEN-LAST:event_btn_settingsMouseClicked

//==============================================================================

//Base Converter Panel - Action Performed
    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        number_textField.setText("");
        resultNumberArea.setText("");
    }//GEN-LAST:event_reset_btnActionPerformed
    private void swap_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swap_btnActionPerformed
        Object aux = fromBaseBox.getSelectedItem();
        fromBaseBox.setSelectedItem(toBaseBox.getSelectedItem());
        toBaseBox.setSelectedItem(aux);    
    }//GEN-LAST:event_swap_btnActionPerformed
    private void convert_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convert_btnActionPerformed
        String fromBase = (String)fromBaseBox.getSelectedItem();
        String toBase = (String)toBaseBox.getSelectedItem();
        String number = number_textField.getText();
         if(!(textValidation(number) && baseValidation(fromBase, number))){
             JOptionPane.showMessageDialog(this, "Invalid number", "Alert", JOptionPane.ERROR_MESSAGE);
             return;
         } 
         String result = convert(fromBase,toBase,number);
         resultNumberArea.setText(result);
    }//GEN-LAST:event_convert_btnActionPerformed

// Settings -> Select Color
    private void SelectColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectColorButtonActionPerformed
        
        JColorChooser jcc = new JColorChooser();
        Color c = jcc.showDialog(null,"Select a color",Color.BLUE);
        
        f1 = c.getRed();
        f2 = c.getGreen();
        f3 = c.getBlue();
        
        s1 = f1 + 102;
        s2 = f2 + 51;
        s3 = f3;
        
        menu.setBackground(c);
        btn_home.setBackground(c);
        btn_baseConverter.setBackground(c);
        btn_binaryCalculator.setBackground(c);
        btn_settings.setBackground(c);
    }//GEN-LAST:event_SelectColorButtonActionPerformed
 
//==============================================================================    
    
//Mouse Events. Mouse Entered and Mouse Exited on button
    private void btn_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseEntered
        setColor(btn_home);
        ind_home.setOpaque(true);
    }//GEN-LAST:event_btn_homeMouseEntered
    private void btn_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseExited
        resetColor(btn_home);
        ind_home.setOpaque(false);
    }//GEN-LAST:event_btn_homeMouseExited

    private void btn_baseConverterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_baseConverterMouseEntered
        setColor(btn_baseConverter);
        ind_baseConverter.setOpaque(true);
    }//GEN-LAST:event_btn_baseConverterMouseEntered
    private void btn_baseConverterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_baseConverterMouseExited
        resetColor(btn_baseConverter);
        ind_baseConverter.setOpaque(false);
    }//GEN-LAST:event_btn_baseConverterMouseExited

    private void btn_binaryCalculatorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_binaryCalculatorMouseEntered
        setColor(btn_binaryCalculator);
        ind_binaryCalculator.setOpaque(true);
    }//GEN-LAST:event_btn_binaryCalculatorMouseEntered
    private void btn_binaryCalculatorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_binaryCalculatorMouseExited
       resetColor(btn_binaryCalculator);
       ind_binaryCalculator.setOpaque(false);
    }//GEN-LAST:event_btn_binaryCalculatorMouseExited

    private void btn_settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_settingsMouseEntered
        setColor(btn_settings);
        ind_settings.setOpaque(true);
    }//GEN-LAST:event_btn_settingsMouseEntered
    private void btn_settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_settingsMouseExited
       resetColor(btn_settings);
       ind_settings.setOpaque(false);
    }//GEN-LAST:event_btn_settingsMouseExited

//==============================================================================
    
//Base Calculator Panel - Action Performed
    private void calculate_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculate_btnActionPerformed
        String number1 = t_Field1.getText();
        String number2 = t_Field2.getText();
        String base = (String) selectBase.getSelectedItem();
        int operation = choseOperation.getSelectedIndex();
        String solution = "";

        if(textValidation(number1) && textValidation(number2)){
            if(baseValidation(base, number1) && baseValidation(base,number2)) {
                number1 = toDecimal(base,number1);
                number2 = toDecimal(base,number2);
                solution = calculate(number1,number2,operation);
            }else{
                JOptionPane.showMessageDialog(this, "Invalid number", "Alert", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Invalid number", "Alert", JOptionPane.ERROR_MESSAGE);
        }

        textArea_Bin.setText(fromDecimal("2",solution));
        textArea_Dec.setText(fromDecimal("10",solution));
        textArea_Hex.setText(fromDecimal("16",solution));
    }//GEN-LAST:event_calculate_btnActionPerformed

    private void reset_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btn1ActionPerformed
        t_Field1.setText("");
        t_Field2.setText("");
        textArea_Bin.setText("");
        textArea_Dec.setText("");
        textArea_Hex.setText("");
    }//GEN-LAST:event_reset_btn1ActionPerformed

//==============================================================================    
    
private String convert(String fromBase, String toBase, String number){
    //from N Base to Decimal
    String decimal = toDecimal(fromBase, number);
    //From Decimal to Base N
    String solution = fromDecimal(toBase,decimal); 
    
    return solution;
}
            
//METHODS for CONVERTING to DECIMAL
private int val(char c){ 
    if (c >= '0' && c <= '9') 
        return (int)c - '0'; 
    else
        return (int)c - 'A' + 10; 
} 
private String toDecimal(String fromBase, String str){ 
    int base = Integer.parseInt(fromBase);
    int power = 1; 
    int num = 0;  
    int index;
    
    if(str.charAt(0)=='-' || str.charAt(0)=='+') index = 1; else index = 0;
    
    for (int i = str.length() - 1; i >= index; i--) { 
        num += val(str.charAt(i)) * power; 
        power = power * base; 
    } 
    
    if(str.charAt(0)=='-')
         return Integer.toString(-num);
    else 
        return Integer.toString(num);
  }

//MEHODS for CONVERTING from DECIMAL
static char reVal(int num){
        if (num >= 0 && num <= 9)
            return (char)(num + 48);
        else
            return (char)(num - 10 + 65);
}
static String fromDecimal(String toBase, String number){
        int temp;
           if(number.charAt(0)=='-')
               temp = -Integer.parseInt(number);
           else
               temp = Integer.parseInt(number);
        int base = Integer.parseInt(toBase);
        String convert = "";

        while(temp!=0){
              convert += reVal(temp % base);
              temp = temp / base;
        }

        StringBuilder convertNum = new StringBuilder(convert);
        if(number.charAt(0)=='-')
            return String.valueOf(convertNum.append('-').reverse());
        else
            return String.valueOf(convertNum.reverse());
}

public boolean textValidation(String text){
  char sign = text.charAt(0);
  if(!(sign == '-' || sign == '+' || Character.isLetterOrDigit(sign)))
     return false;
  //validation for other invalid symbols
  for(int i=1; i<text.length(); i++){
     if(!(Character.isLetterOrDigit(text.charAt(i))))
          return false;          
  }  
    return true;
}
public boolean baseValidation(String base, String text){
    int index;
    if(text.charAt(0) == '-' || text.charAt(0) == '+') index = 1; else index = 0;
    
    switch(base){
        case "2":
                for(int i=index; i<text.length(); i++)
                    if(!(text.charAt(i)=='0' || text.charAt(i)=='1'))
                        return false;                      
        break;
        
        case "8":
            for(int i=index; i<text.length(); i++)
                if(!(text.charAt(i)>='0' && text.charAt(i)<='7'))
                    return false;
        break;
        
        case "10":
            for(int i=index; i<text.length(); i++)
                if(!(text.charAt(i)>='0' && text.charAt(i)<='9'))
                    return false;
        break;
        
        case "16":
            for(int i=index; i<text.length(); i++)
                if(!(text.charAt(i)>='0' && text.charAt(i)<='9' || text.charAt(i)>='A' && text.charAt(i)<='F'))
                    return false;
        break;                      
    }    
    return true;
}

public String calculate(String a,String b,int operation){
    int num1 = Integer.parseInt(a);
    int num2 = Integer.parseInt(b);
 
    int result = 0;
     if(operation == 0)
         result = num1 + num2;
     if(operation == 1)
         result = num1 - num2;
     if(operation == 2)
         result = num1 * num2;
     if(operation == 3)
         result = num1 / num2;
     if(operation == 4)
         result = num1 & num2;
     if(operation == 5)
         result = num1 | num2;
     if(operation == 6){
         t_Field2.setBackground(new Color(255,51,51));
         result = ~num1;
     }
     if(operation == 7)
         result = num1 ^ num2;
     if(operation == 8)
         result = num1 << num2;
     if(operation == 9)
         result = num1 >> num2;
     return Integer.toString(result);
 }
    
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new dashboard().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SelectColorButton;
    private javax.swing.JPanel baseConverter_panel;
    private javax.swing.JLabel base_label;
    private javax.swing.JLabel binResult_label;
    private javax.swing.JPanel binaryCalculator_panel;
    private javax.swing.JPanel btn_baseConverter;
    private javax.swing.JPanel btn_binaryCalculator;
    private javax.swing.JPanel btn_home;
    private javax.swing.JPanel btn_settings;
    private javax.swing.JButton calculate_btn;
    private javax.swing.JComboBox<String> choseOperation;
    private javax.swing.JButton convert_btn;
    private javax.swing.JLabel decResult_label;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel firstNumber_label;
    private javax.swing.JComboBox<String> fromBaseBox;
    private javax.swing.JLabel fromBase_label;
    private javax.swing.JLabel hexResult_label;
    private javax.swing.JPanel home_panel;
    private javax.swing.JPanel ind_baseConverter;
    private javax.swing.JPanel ind_binaryCalculator;
    private javax.swing.JPanel ind_home;
    private javax.swing.JPanel ind_settings;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane_Bin;
    private javax.swing.JScrollPane jScrollPane_Dec;
    private javax.swing.JScrollPane jScrollPane_Hex;
    private javax.swing.JScrollPane jScrollPane_resultNumber;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_partners;
    private javax.swing.JLabel logo_welcome;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel number_label;
    private javax.swing.JTextField number_textField;
    private javax.swing.JLabel operation_label;
    private javax.swing.JPanel parent;
    private javax.swing.JButton reset_btn;
    private javax.swing.JButton reset_btn1;
    private javax.swing.JTextArea resultNumberArea;
    private javax.swing.JLabel resultNumber_label;
    private javax.swing.JLabel secondNumber_label;
    private javax.swing.JComboBox<String> selectBase;
    private javax.swing.JLabel sentece;
    private javax.swing.JPanel settings_panel;
    private javax.swing.JPanel start_pnl;
    private javax.swing.JButton swap_btn;
    private javax.swing.JTextField t_Field1;
    private javax.swing.JTextField t_Field2;
    private javax.swing.JTextArea textArea_Bin;
    private javax.swing.JTextArea textArea_Dec;
    private javax.swing.JTextArea textArea_Hex;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> toBaseBox;
    private javax.swing.JLabel toBase_label;
    private javax.swing.JPanel up_bar;
    // End of variables declaration//GEN-END:variables
}
