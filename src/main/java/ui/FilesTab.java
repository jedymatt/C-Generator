package main.java.ui;

import main.java.lib.*;

/**
 *
 * @author Jedy Matt
 */
public class FilesTab extends javax.swing.JPanel {
    
    private ClassRecord classRecord;

    /**
     * Creates new form Page1
     */
    public FilesTab() {
        initComponents();
        addAction();
    }
    
    public FilesTab(ClassRecord classRecord) {
        this.classRecord = classRecord;
        initComponents();
        addAction();
    }
    
    private void addAction() {
        javax.swing.JButton[] buttons = {
            buttonAverage,
            buttonWrittenWorks,
            buttonPerformanceTasks,
            buttonQuarterlyAssessment
        };
        
        for (javax.swing.JButton button : buttons) {
            button.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    int returnVal = fileChooser.showDialog(FilesTab.this, "Select");
                    if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
                        if (e.getSource() == buttonAverage) {
                            classRecord.setFileAverage(fileChooser.getSelectedFile());
                            fieldPathAverage.setText(fileChooser.getSelectedFile().getPath());
                        } else if (e.getSource() == buttonWrittenWorks) {
                            classRecord.setFileWritten(fileChooser.getSelectedFile());
                            fieldPathWritten.setText(fileChooser.getSelectedFile().getPath());
                        } else if (e.getSource() == buttonPerformanceTasks) {
                            classRecord.setFilePerformance(fileChooser.getSelectedFile());
                            fieldPathPerformance.setText(fileChooser.getSelectedFile().getPath());
                        } else if (e.getSource() == buttonQuarterlyAssessment) {
                            classRecord.setFileQuarterly(fileChooser.getSelectedFile());
                            fieldPathQuarterly.setText(fileChooser.getSelectedFile().getPath());
                        }
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

        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        labelAverage = new javax.swing.JLabel();
        buttonAverage = new javax.swing.JButton();
        fieldPathAverage = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        labelWrittenWorks = new javax.swing.JLabel();
        labelPerformanceTasks = new javax.swing.JLabel();
        buttonWrittenWorks = new javax.swing.JButton();
        buttonPerformanceTasks = new javax.swing.JButton();
        labelQuarterlyAssessment = new javax.swing.JLabel();
        buttonQuarterlyAssessment = new javax.swing.JButton();
        fieldPathWritten = new javax.swing.JTextField();
        fieldPathPerformance = new javax.swing.JTextField();
        fieldPathQuarterly = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Text Files (.txt)", "txt")
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(160, 160, 160)), "Required", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        labelAverage.setText("Student's Average");

        buttonAverage.setText("Browse...");

        fieldPathAverage.setEditable(false);
        fieldPathAverage.setHighlighter(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAverage)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonAverage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldPathAverage, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAverage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAverage)
                    .addComponent(fieldPathAverage)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(160, 160, 160)), "Optional", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        labelWrittenWorks.setText("Student's Written Works");

        labelPerformanceTasks.setText("Student's Performance Tasks");

        buttonWrittenWorks.setText("Browse...");

        buttonPerformanceTasks.setText("Browse...");

        labelQuarterlyAssessment.setText("Student's Quarterly Assessment");

        buttonQuarterlyAssessment.setText("Browse...");

        fieldPathWritten.setEditable(false);
        fieldPathWritten.setHighlighter(null);

        fieldPathPerformance.setEditable(false);
        fieldPathPerformance.setHighlighter(null);

        fieldPathQuarterly.setEditable(false);
        fieldPathQuarterly.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fieldPathQuarterly.setHighlighter(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPerformanceTasks)
                    .addComponent(labelWrittenWorks)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonWrittenWorks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldPathWritten, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonPerformanceTasks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldPathPerformance))
                    .addComponent(labelQuarterlyAssessment)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonQuarterlyAssessment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldPathQuarterly)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelWrittenWorks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonWrittenWorks)
                    .addComponent(fieldPathWritten))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPerformanceTasks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPerformanceTasks)
                    .addComponent(fieldPathPerformance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelQuarterlyAssessment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonQuarterlyAssessment)
                    .addComponent(fieldPathQuarterly))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/res/images/textIcon.png"))); // NOI18N
        jLabel1.setText("ADD THE LIST IN A TEXT FILE (.txt)");
        jPanel3.add(jLabel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAverage;
    private javax.swing.JButton buttonPerformanceTasks;
    private javax.swing.JButton buttonQuarterlyAssessment;
    private javax.swing.JButton buttonWrittenWorks;
    private javax.swing.JTextField fieldPathAverage;
    private javax.swing.JTextField fieldPathPerformance;
    private javax.swing.JTextField fieldPathQuarterly;
    private javax.swing.JTextField fieldPathWritten;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelAverage;
    private javax.swing.JLabel labelPerformanceTasks;
    private javax.swing.JLabel labelQuarterlyAssessment;
    private javax.swing.JLabel labelWrittenWorks;
    // End of variables declaration//GEN-END:variables

}
