/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package Teachers;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import java.awt.Dimension;
import java.awt.Window;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.util.DateType;
import static teachers.myteachers.myteachers.add_data;
import teachers.myteachers.myteachers.to_myteachers;
import static teachers.myteachers.myteachers.update_data;
import teachers.util.Dlg_confirm_action;
import teachers.util.Dlg_confirm_save;





/**
 *
 * @author Cordura
 */
public class Dlg_myteachers extends javax.swing.JDialog {
    
    /** Creates new form Dlg_myteachers */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;
    
    public void setCallback(Callback callback) {
        this.callback = callback;
        
        
    }
    
    public static interface Callback {
        
        void ok(CloseDialog closeDialog, OutputData data);
    }
    
    public static class InputData {
    }
    
    public static class OutputData {
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_myteachers(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }
    
    private Dlg_myteachers(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }
    
    public Dlg_myteachers() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();
        
    }
    private Dlg_myteachers myRef;
    
    private void setThisRef(Dlg_myteachers myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_myteachers> dialogContainer = new java.util.HashMap();
    
    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }
    
    public static Dlg_myteachers create(java.awt.Window parent, boolean modal) {
        
        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }
        
        return create(parent, ModalityType.MODELESS);
        
    }
    
    public static Dlg_myteachers create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {
        
        if (parent instanceof java.awt.Frame) {
            
            Dlg_myteachers dialog = dialogContainer.get(parent);
            
            if (dialog == null) {
                dialog = new Dlg_myteachers((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }
            
        }
        
        if (parent instanceof java.awt.Dialog) {
            Dlg_myteachers dialog = dialogContainer.get(parent);
            
            if (dialog == null) {
                dialog = new Dlg_myteachers((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }
            
        }
        
        return null;
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" main ">
    public static void main(String args[]) {
        
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        
        Dlg_myteachers dialog = Dlg_myteachers.create(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc=" added ">
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible == true) {
            getContentPane().removeAll();
            initComponents();
            myInit();
            repaint();
        }
        
        
    }
    
    public javax.swing.JPanel getSurface() {
        return (javax.swing.JPanel) getContentPane();
    }
    
    public void nullify() {
        myRef.setVisible(false);
        myRef = null;
    }
    //</editor-fold>
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_firstname = new javax.swing.JTextField();
        tf_middlename = new javax.swing.JTextField();
        tf_lastname = new javax.swing.JTextField();
        tf_phoneno = new javax.swing.JTextField();
        tf_age = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_myteachers = new javax.swing.JTable();
        tf_search = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText(" Teachers");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("lastname:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("middlename:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("firstname:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("phoneno:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("age:");

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tbl_myteachers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_myteachers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_myteachersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_myteachers);

        jButton4.setText("SELECT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("SAVE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Search:");

        jLabel9.setText("status");

        jLabel8.setText("0");

        jLabel7.setText("Total no of rows:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(tf_age, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tf_firstname)
                                        .addComponent(tf_middlename)
                                        .addComponent(tf_lastname)
                                        .addComponent(tf_phoneno)))))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_middlename)
                        .addGap(3, 3, 3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_phoneno, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf_age)
                                .addGap(3, 3, 3)))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton4))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7))
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        add_myteachers();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        update_myteachers();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        delete_myteachers();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        select_list();
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        save_myteachers();
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void tbl_myteachersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_myteachersMouseClicked
        select();
    }//GEN-LAST:event_tbl_myteachersMouseClicked
    
    /**
     * @param args the command line arguments
     */
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tbl_myteachers;
    private javax.swing.JTextField tf_age;
    private javax.swing.JTextField tf_firstname;
    private javax.swing.JTextField tf_lastname;
    private javax.swing.JTextField tf_middlename;
    private javax.swing.JTextField tf_phoneno;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables
    
    private void myInit() {
        init_key();
        init_tbl_myteachers(tbl_myteachers);
        ret_data();
    }
    
    public void do_pass(){
        
    }
    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        this.dispose();
    }
    
    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                              KeyEvent.VK_ESCAPE, new KeyAction() {
                                  
                                  @Override
                                  public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                                      disposed();
                                  }
                              });
    }
    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" myteachers ">
    public static ArrayListModel tbl_myteachers_ALM;
    public static TblmyteachersModel tbl_myteachers_M;
    
    public static void init_tbl_myteachers(JTable tbl_myteachers) {
        tbl_myteachers_ALM= new ArrayListModel();
        tbl_myteachers_M=  new TblmyteachersModel(tbl_myteachers_ALM);
        tbl_myteachers.setModel(tbl_myteachers_M);
        tbl_myteachers.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_myteachers.setRowHeight(25);
        int[] tbl_widths_myteachers= {50,100,100,100,100,10,12,0,0,0,0};
        for (int i = 0, n = tbl_widths_myteachers.length; i < n; i++) {
            if (i == 100) {
                continue;
            }TableWidthUtilities.setColumnWidth(tbl_myteachers, i, tbl_widths_myteachers[i]);
        }
        Dimension d = tbl_myteachers.getTableHeader(). getPreferredSize();
        d.height = 25;
        tbl_myteachers.getTableHeader().setPreferredSize(d);
        tbl_myteachers.getTableHeader().setFont(new java.awt.Font("Arial",0, 12));
        tbl_myteachers.setRowHeight(25);
        tbl_myteachers.setFont(new java.awt.Font("Arial", 0, 12));
    }
    public static void loadData_myteachers(List<to_myteachers> acc) {
        tbl_myteachers_ALM.clear();
        tbl_myteachers_ALM.addAll(acc);
    }
    
    public static class TblmyteachersModel extends AbstractTableAdapter {
        
        public static String[] COLUMNS = {
            "id","lastname","middlename","firstname","age","phoneno","created_at","updated_at","created_by","updated_by","status"
        };
        public TblmyteachersModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }
        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
            return false;
        }
        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }
        @Override
        public Object getValueAt(int row, int col) {
            to_myteachers tt = (to_myteachers) getRow(row);
            switch (col) {
                case 0:
                    return tt.id;
                case 1:
                    return tt.lastname;
                case 2:
                    return tt.middlename;
                case 3:
                    return tt.firstname;
                case 4:
                    return tt.age;
                case 5:
                    return tt.phoneno;
                case 6:
                    return tt.created_at;
                case 7:
                    return tt.updated_at;
                case 8:
                    return tt.created_by;
                case 9:
                    return tt.updated_by;
                default:
                    return tt.status;
            }
        }
    }
//</editor-fold>
    
    
    
    private void ret_data() {
        String where = " order by lastname asc ";
        List<to_myteachers> datas = myteachers.ret_data(where);
        loadData_myteachers(datas);
        
    }
    private void add_myteachers() {
        
        int id=0;
        String lastname = tf_lastname.getText();
        String middlename = tf_middlename.getText();
        String firstname = tf_firstname.getText();
        int age = Integer.parseInt(tf_age.getText());
        int phoneno = Integer.parseInt(tf_phoneno.getText());
        String created_at = DateType.datetime.format(new Date());
        String updated_at = DateType.datetime.format(new Date());
        int created_by = 0;
        int updated_by = 0;
        int status = 0;
        
        to_myteachers to = new to_myteachers(id,lastname,middlename,firstname,age,phoneno,created_at,updated_at,created_by,updated_by,status);
        add_data(to);
        tf_lastname.setText("");
        tf_middlename.setText("");
        tf_firstname.setText("");
        tf_age.setText("");
        tf_phoneno.setText("");
        
        
        ret_data();
        System.out.println("Succeessfully Added!");
        
    }
    private void update_myteachers(){
        
          int row = tbl_myteachers.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_myteachers to = (to_myteachers) tbl_myteachers_ALM.get(row);
        int id = to.id;
        String lastname = tf_lastname.getText();
        String middlename =  tf_middlename.getText();
        String firstname =  tf_firstname.getText();
        int age = Integer.parseInt(tf_age.getText());
        int phoneno = Integer.parseInt(tf_phoneno.getText());
        String created_at = DateType.datetime.format(new Date());
        String updated_at = DateType.datetime.format(new Date());
        int created_by = 0;
        int updated_by = 0;
        int status = 0;

        to_myteachers to1 = new to_myteachers(id, lastname, middlename, firstname, age, phoneno, created_at, updated_at, created_by, updated_by, status);
        update_data(to1);
        tf_lastname.setText("");
        tf_middlename.setText("");
        tf_firstname.setText("");
        tf_age.setText("");
        tf_phoneno.setText("");

        ret_data();

        System.out.println("Successfully Updated!");
        
        
    }
    private void delete_myteachers(){
        int row = tbl_myteachers.getSelectedRow();
        if (row < 0) {
            return;
        }
        
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
        
        nd.setCallback(new Dlg_confirm_action.Callback() {
            
            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                to_myteachers to = (to_myteachers) tbl_myteachers_ALM.get(row);
                if (to.id == 0) {
                    tbl_myteachers_ALM.remove(row);
                    tbl_myteachers_M.fireTableDataChanged();
                } else {
                    
                    myteachers.delete_data(to);
                    tf_lastname.setText("");
                    tf_middlename.setText("");
                    tf_firstname.setText("");
                    tf_age.setText("");
                    tf_phoneno.setText("");
                    ret_data();
                    System.out.println("Successfully Delete!");
                }
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
        
        
    }
    
    
    private void select() {
        int row = tbl_myteachers.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_myteachers to = (to_myteachers) tbl_myteachers_ALM.get(row);
        
        tf_lastname.setText(to.lastname);
        tf_middlename.setText(to.middlename);
        tf_firstname.setText(to.firstname);
        tf_age.setText(FitIn.fmt_woc(to.age));
        tf_phoneno.setText(FitIn.fmt_woc(to.phoneno));
        
        
    }
    
    private void select_list() {
        java.util.List<to_myteachers> list = tbl_myteachers_ALM;
        System.out.println(list.size());
        for (to_myteachers to : list) {
            System.out.println(to.lastname);
        }
    }
    
    private void save_myteachers(){
        
        int id=0;
        String lastname = tf_lastname.getText();
        String middlename = tf_middlename.getText();
        String firstname = tf_firstname.getText();
        int age = Integer.parseInt(tf_age.getText());
        int phoneno = Integer.parseInt(tf_phoneno.getText());
        String created_at = DateType.datetime.format(new Date());
        String updated_at = DateType.datetime.format(new Date());
        int created_by = 0;
        int updated_by = 0;
        int status = 0;
        
        Window p = (Window) this;
        Dlg_confirm_save nd = Dlg_confirm_save.create(p, true);
        nd.setTitle("");
        
        nd.setCallback(new Dlg_confirm_save.Callback() {
            
            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_save.OutputData data) {
                closeDialog.ok();
                
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
        
        to_myteachers to = new to_myteachers(id,lastname,middlename,firstname,age,phoneno,created_at,updated_at,created_by,updated_by,status);
        add_data(to);
        tf_lastname.setText("");
        tf_middlename.setText("");
        tf_firstname.setText("");
        tf_age.setText("");
        tf_phoneno.setText("");
        
        
        ret_data();
        System.out.println("Successfully Save!");
    }
    
}
