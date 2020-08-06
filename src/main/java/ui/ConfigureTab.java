package main.java.ui;

/**
 *
 * @author Jedy Matt
 */
public class ConfigureTab extends javax.swing.JPanel {

    private main.java.util.PropertyLoader loader;
    
    public ConfigureTab(main.java.util.PropertyLoader loader) {
        this.loader = loader;
        initComponents();
        setUIValues();
        addFieldTextAction();
        addComboBoxAction();
    }

    private void setUIValues() {
        if (loader == null) {
            return;
        }
        fieldWrittenSize.setText(loader.getProperty("written.size"));
        fieldPerformanceSize.setText(loader.getProperty("performance.size"));
        fieldWrittenMin.setText(loader.getProperty("written.range.min"));
        fieldWrittenMax.setText(loader.getProperty("written.range.max"));
        fieldPerformanceMin.setText(loader.getProperty("performance.range.min"));
        fieldPerformanceMax.setText(loader.getProperty("performance.range.max"));
        fieldQuarterlyMin.setText(loader.getProperty("quarterly.range.min"));
        fieldQuarterlyMax.setText(loader.getProperty("quarterly.range.max"));
        comboBoxWrittenPercent.setSelectedIndex(Integer.parseInt(loader.getProperty("written.percent")));
        comboBoxPerformancePercent.setSelectedIndex(Integer.parseInt(loader.getProperty("performance.percent")));
        comboBoxQuarterlyPercent.setSelectedIndex(Integer.parseInt(loader.getProperty("quarterly.percent")));
    }

    private void addFieldTextAction() {
        javax.swing.JTextField[] textFields = {
            fieldWrittenSize,
            fieldPerformanceSize,
            fieldWrittenMin,
            fieldWrittenMax,
            fieldPerformanceMin,
            fieldPerformanceMax,
            fieldQuarterlyMin,
            fieldQuarterlyMax,};

        for (javax.swing.JTextField textField : textFields) {
            //disabled copy and paste
            textField.setTransferHandler(null);
            //added keyReleased method to setProperties 
            textField.addKeyListener(new java.awt.event.KeyAdapter() {
                @Override
                public void keyReleased(java.awt.event.KeyEvent k) {
                    if (k.getSource() == fieldWrittenSize) {
                        loader.setProperty("written.size", fieldWrittenSize.getText());
                    } else if (k.getSource() == fieldPerformanceSize) {
                        loader.setProperty("performance.size", fieldPerformanceSize.getText());
                    } else if (k.getSource() == fieldWrittenMin) {
                        loader.setProperty("written.range.min", fieldWrittenMin.getText());
                    } else if (k.getSource() == fieldWrittenMax) {
                        loader.setProperty("written.range.max", fieldWrittenMax.getText());
                    } else if (k.getSource() == fieldPerformanceMin) {
                        loader.setProperty("peformance.range.min", fieldPerformanceMin.getText());
                    } else if (k.getSource() == fieldPerformanceMax) {
                        loader.setProperty("performance.range.max", fieldPerformanceMax.getText());
                    } else if (k.getSource() == fieldQuarterlyMin) {
                        loader.setProperty("quarterly.range.min", fieldQuarterlyMin.getText());
                    } else if (k.getSource() == fieldQuarterlyMax) {
                        loader.setProperty("quarterly.range.max", fieldQuarterlyMax.getText());
                    }
                }
            });
            //added keyTyped method for restricting non numerical characters
            textField.addKeyListener(new java.awt.event.KeyAdapter() {
                @Override
                public void keyTyped(java.awt.event.KeyEvent k) {
                    char c = k.getKeyChar();
                    if (!(Character.isDigit(c))
                            || (c == java.awt.event.KeyEvent.VK_BACK_SPACE
                            || c == java.awt.event.KeyEvent.VK_DELETE)) {
                        k.consume();
                    }
                }
            });
        }
    }

    private void addComboBoxAction() {
        javax.swing.JComboBox[] comboBoxes = {
            comboBoxWrittenPercent,
            comboBoxPerformancePercent
        };

        for (javax.swing.JComboBox<String> comboBox : comboBoxes) {
            comboBox.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    int selectedIndex = comboBox.getSelectedIndex();
                    if (e.getSource() == comboBoxWrittenPercent) {
                        int i = (comboBoxPerformancePercent.getItemCount() - 1)
                                - selectedIndex;
                        comboBoxPerformancePercent.setSelectedIndex(i);
                        //set property
                        loader.setProperty("written.percent", selectedIndex + "");
                        loader.setProperty("peformance.percent", i + "");
                    } else if (e.getSource() == comboBoxPerformancePercent) {
                        int i = (comboBoxWrittenPercent.getItemCount() - 1)
                                - selectedIndex;
                        comboBoxWrittenPercent.setSelectedIndex(i);
                        //set property
                        loader.setProperty("performance.percent", selectedIndex + "");
                        loader.setProperty("written.percent", i + "");
                    }
                }
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldWrittenSize = new javax.swing.JTextField();
        fieldPerformanceSize = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        fieldWrittenMax = new javax.swing.JTextField();
        labelPerformanceTasks1 = new javax.swing.JLabel();
        labelWrittenWorks1 = new javax.swing.JLabel();
        labelQuarterlyAssessment1 = new javax.swing.JLabel();
        fieldPerformanceMax = new javax.swing.JTextField();
        fieldQuarterlyMax = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldWrittenMin = new javax.swing.JTextField();
        fieldPerformanceMin = new javax.swing.JTextField();
        fieldQuarterlyMin = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        labelWrittenWorks = new javax.swing.JLabel();
        labelPerformanceTasks = new javax.swing.JLabel();
        labelQuarterlyAssessment = new javax.swing.JLabel();
        comboBoxWrittenPercent = new javax.swing.JComboBox<>();
        comboBoxPerformancePercent = new javax.swing.JComboBox<>();
        comboBoxQuarterlyPercent = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(160, 160, 160)), "Number of Activities", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel3.setText("Written Works");

        jLabel4.setText("Performance Tasks");

        fieldWrittenSize.setColumns(5);

        fieldPerformanceSize.setColumns(5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldWrittenSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(fieldPerformanceSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldWrittenSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldPerformanceSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(160, 160, 160)), "Range of Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Max");

        fieldWrittenMax.setColumns(5);

        labelPerformanceTasks1.setText("Performance Tasks");

        labelWrittenWorks1.setText("Written Works");

        labelQuarterlyAssessment1.setText("Quarterly Assessment");

        fieldPerformanceMax.setColumns(5);

        fieldQuarterlyMax.setColumns(5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Min");

        fieldWrittenMin.setColumns(5);

        fieldPerformanceMin.setColumns(5);

        fieldQuarterlyMin.setColumns(5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelQuarterlyAssessment1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(fieldQuarterlyMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(labelPerformanceTasks1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldPerformanceMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(labelWrittenWorks1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(fieldWrittenMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(fieldWrittenMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldPerformanceMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldQuarterlyMax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldWrittenMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelWrittenWorks1)
                    .addComponent(fieldWrittenMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPerformanceTasks1)
                    .addComponent(fieldPerformanceMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPerformanceMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuarterlyAssessment1)
                    .addComponent(fieldQuarterlyMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldQuarterlyMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(160, 160, 160)), "Percentage Distribution", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        labelWrittenWorks.setText("Written Works");

        labelPerformanceTasks.setText("Performance Tasks");

        labelQuarterlyAssessment.setText("Quarterly Assessment");

        comboBoxWrittenPercent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20%", "30%", "40%", "50%", "60%" }));

        comboBoxPerformancePercent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20%", "30%", "40%", "50%", "60%" }));

        comboBoxQuarterlyPercent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20%", "30%", "40%" }));
        comboBoxQuarterlyPercent.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelWrittenWorks)
                    .addComponent(labelPerformanceTasks)
                    .addComponent(labelQuarterlyAssessment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxWrittenPercent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxPerformancePercent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxQuarterlyPercent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWrittenWorks)
                    .addComponent(comboBoxWrittenPercent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPerformanceTasks)
                    .addComponent(comboBoxPerformancePercent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuarterlyAssessment)
                    .addComponent(comboBoxQuarterlyPercent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxPerformancePercent;
    private javax.swing.JComboBox<String> comboBoxQuarterlyPercent;
    private javax.swing.JComboBox<String> comboBoxWrittenPercent;
    private javax.swing.JTextField fieldPerformanceMax;
    private javax.swing.JTextField fieldPerformanceMin;
    private javax.swing.JTextField fieldPerformanceSize;
    private javax.swing.JTextField fieldQuarterlyMax;
    private javax.swing.JTextField fieldQuarterlyMin;
    private javax.swing.JTextField fieldWrittenMax;
    private javax.swing.JTextField fieldWrittenMin;
    private javax.swing.JTextField fieldWrittenSize;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelPerformanceTasks;
    private javax.swing.JLabel labelPerformanceTasks1;
    private javax.swing.JLabel labelQuarterlyAssessment;
    private javax.swing.JLabel labelQuarterlyAssessment1;
    private javax.swing.JLabel labelWrittenWorks;
    private javax.swing.JLabel labelWrittenWorks1;
    // End of variables declaration//GEN-END:variables
}
