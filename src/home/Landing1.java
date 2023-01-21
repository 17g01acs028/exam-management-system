/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.security.KeyStore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author User
 */
public class Landing1 extends javax.swing.JFrame {

    /**
     * Creates new form Landing
     */
    ArrayList<String> list=new ArrayList<String>();
Connection conn;
ResultSet rs;
PreparedStatement pst;
boolean sellect=false;
int index;
String filename=null;
 byte[] image =null;
    byte[] person_image =null;
    public Landing1() {
        initComponents();
            conn=(Connection) newdb.ConnectDb();
            addStream.setLocationRelativeTo(this.getRootPane());
            tsub.setLocationRelativeTo(this.getRootPane());
            tsub.setLocationRelativeTo(this.getRootPane());
            tsub1.setLocationRelativeTo(this.getRootPane());
            tsub2.setLocationRelativeTo(this.getRootPane());
              tsub3.setLocationRelativeTo(this.getRootPane());
              tsub5.setLocationRelativeTo(this.getRootPane());
              tsub6.setLocationRelativeTo(this.getRootPane());
              tsub7.setLocationRelativeTo(this.getRootPane());
              
              typo.setText(loginPanel.type.getText().substring(0).toUpperCase()); 
              au.setText(loginPanel.username.getText().substring(0)); 
            mytableColor(table);
            mytableColor(sdetails3);
            mytableColor(tbu);
            mytableColor(student_details);
             mytableColor(stb);
            
                         try{
   String sql="SELECT `stream_name` FROM `stream`";
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
     stream1.addItem(rs.getString("stream_name"));
      
   }
   
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
       }
                                        try{
   String sql="SELECT `code` FROM `exam_code`";
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
     exam_code.addItem(rs.getString("code"));
      code1.addItem(rs.getString("code"));
   }
   
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
       }
    
       
       
        year();
        stream();
        addTeacher();
        showtb();
        showin();
        showinsub();;
        showinsubt();;
        tinTable();
        exac();
        showENTable();
        code();
        examName();
    }
     private void setColor(JPanel pane){
    pane.setBackground(new Color(85,55,118));
   }
    private void resetColor(JPanel[] pane){
    for(int i=0;i<pane.length;i++){
        pane[i].setBackground(new Color(64,43,100));
    
    }}
    public void mytableColor(JTable table){
    
    table.getTableHeader().setFont(new Font("segoe UI",Font.BOLD,14));
            table.getTableHeader().setOpaque(false);
            table.getTableHeader().setBackground(new Color(51,153,255));
            table.getTableHeader().setForeground(new Color(255,255,255));
            table.setSelectionBackground(new Color(255,153,102));
            table.setRowHeight(30);
    }
public void searchEngine(JTable table,JTextField Field){
DefaultTableModel tb=(DefaultTableModel) table.getModel();
    TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(tb);
    table.setRowSorter(tr);
    tr.setRowFilter(RowFilter.regexFilter("(?i)"+Field.getText()));
            

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        addStream = new javax.swing.JDialog();
        addSt = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        add_stream = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        strreamTable = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        tsub = new javax.swing.JDialog();
        addSt1 = new javax.swing.JPanel();
        kGradientPanel6 = new keeptoo.KGradientPanel();
        subRegestration = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        scodev = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        subject3 = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        teacher = new javax.swing.JComboBox<>();
        jScrollPane14 = new javax.swing.JScrollPane();
        subReg = new javax.swing.JTable();
        tsub1 = new javax.swing.JDialog();
        addSt2 = new javax.swing.JPanel();
        kGradientPanel7 = new keeptoo.KGradientPanel();
        subteacher = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        subject = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        subject1 = new javax.swing.JComboBox<>();
        code = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        rsub = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        tsub2 = new javax.swing.JDialog();
        comp = new keeptoo.KGradientPanel();
        jPanel7 = new javax.swing.JPanel();
        penel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cnt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        setter = new javax.swing.JTextField();
        cls = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ent2 = new javax.swing.JComboBox<>();
        ent3 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        code1 = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        tsub3 = new javax.swing.JDialog();
        comp1 = new keeptoo.KGradientPanel();
        jPanel11 = new javax.swing.JPanel();
        penel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c4 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        c8 = new javax.swing.JTextField();
        c7 = new javax.swing.JTextField();
        c6 = new javax.swing.JTextField();
        c5 = new javax.swing.JTextField();
        c12 = new javax.swing.JTextField();
        c11 = new javax.swing.JTextField();
        c10 = new javax.swing.JTextField();
        c9 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        lang = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        tsub5 = new javax.swing.JDialog();
        kGradientPanel18 = new keeptoo.KGradientPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        exam_name1 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        tsub6 = new javax.swing.JDialog();
        exreg = new keeptoo.KGradientPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel223 = new javax.swing.JLabel();
        form2 = new javax.swing.JComboBox<>();
        term2 = new javax.swing.JComboBox<>();
        year2 = new javax.swing.JComboBox<>();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel227 = new javax.swing.JLabel();
        exam_name2 = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        tsub7 = new javax.swing.JDialog();
        kGradientPanel19 = new keeptoo.KGradientPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel228 = new javax.swing.JLabel();
        jLabel229 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        security_code = new javax.swing.JPasswordField();
        jLabel47 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        p7 = new javax.swing.JPanel();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jLabel165 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        homedesktop = new javax.swing.JPanel();
        add_marks1 = new javax.swing.JPanel();
        kGradientPanel14 = new keeptoo.KGradientPanel();
        jLabel164 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        add_marks = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        adm = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        name_display = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        form = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        stream1 = new javax.swing.JComboBox<>();
        subname = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        exam_code = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        student_details = new javax.swing.JTable()

        ;
        grade = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        out_of = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        points = new javax.swing.JLabel();
        converted_score = new javax.swing.JTextField();
        student_score = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel28 = new javax.swing.JLabel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        jLabel33 = new javax.swing.JLabel();
        regSubGrade = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        afrom = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        ato = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        aminusfrom = new javax.swing.JTextField();
        aminusto = new javax.swing.JTextField();
        bplusfrom = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        bplusto = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        bfrom = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        bto = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        bminusfrom = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        bminusto = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        cplusfrom = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        cplusto = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        cfrom = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        cto = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        cminusfrom = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        cminusto = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        dplusfrom = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        dplusto = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        dfrom = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        dto = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        dminusfrom = new javax.swing.JTextField();
        jLabel102 = new javax.swing.JLabel();
        dminusto = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        efrom = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        eto = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        sub = new javax.swing.JComboBox<>();
        Gr = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        cls1 = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        stream2 = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        code12 = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        ent = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        year1 = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        term1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel57 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        sep2 = new javax.swing.JSeparator();
        stureg = new javax.swing.JPanel();
        kGradientPanel8 = new keeptoo.KGradientPanel();
        adm1 = new javax.swing.JTextField();
        surname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        adm_date = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        kGradientPanel9 = new keeptoo.KGradientPanel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        kGradientPanel10 = new keeptoo.KGradientPanel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        religion = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        birth_cert_no = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        kcpe_marks = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        parent = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        telephone = new javax.swing.JTextField();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        alternative_telephone = new javax.swing.JTextField();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        border_day = new javax.swing.JComboBox<>();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        lblimg = new javax.swing.JLabel();
        kGradientPanel11 = new keeptoo.KGradientPanel();
        jLabel159 = new javax.swing.JLabel();
        formb = new javax.swing.JComboBox<>();
        streamb = new javax.swing.JComboBox<>();
        house = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        b1 = new javax.swing.JRadioButton();
        b12 = new javax.swing.JRadioButton();
        b2 = new javax.swing.JRadioButton();
        b3 = new javax.swing.JRadioButton();
        b4 = new javax.swing.JRadioButton();
        b5 = new javax.swing.JRadioButton();
        b6 = new javax.swing.JRadioButton();
        b7 = new javax.swing.JRadioButton();
        b8 = new javax.swing.JRadioButton();
        b9 = new javax.swing.JRadioButton();
        b10 = new javax.swing.JRadioButton();
        b11 = new javax.swing.JRadioButton();
        b13 = new javax.swing.JRadioButton();
        b14 = new javax.swing.JRadioButton();
        b15 = new javax.swing.JRadioButton();
        jLabel187 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        treg1 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel230 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        stb = new javax.swing.JTable();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        lblimg3 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        mission = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        vision = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        motto = new javax.swing.JTextArea();
        school_name2 = new javax.swing.JTextField();
        jLabel251 = new javax.swing.JLabel();
        treg2 = new javax.swing.JPanel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        surname2 = new javax.swing.JTextField();
        lname2 = new javax.swing.JTextField();
        fname2 = new javax.swing.JTextField();
        idno = new javax.swing.JTextField();
        inn = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        tscno = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();
        save = new keeptoo.KGradientPanel();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        delete = new keeptoo.KGradientPanel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        sdetails3 = new javax.swing.JTable()
        {
            @Override

            public Component prepareRenderer (TableCellRenderer renderer, int rowIndex, int columnIndex){
                Component componenet = super.prepareRenderer(renderer, rowIndex, columnIndex);

                Object value = getModel().getValueAt(rowIndex,columnIndex);

                if(columnIndex == 9){

                    componenet.setBackground(Color.BLACK);
                    componenet.setForeground(Color.BLACK);

                }

                else {

                    componenet.setBackground(Color.WHITE);
                    componenet.setForeground(Color.BLACK);
                }

                return componenet;
            }

        }
        ;
        jTextField2 = new javax.swing.JTextField();
        jLabel182 = new javax.swing.JLabel();
        sep1 = new javax.swing.JSeparator();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        type = new javax.swing.JComboBox<>();
        jLabel186 = new javax.swing.JLabel();
        treg3 = new javax.swing.JPanel();
        kGradientPanel20 = new keeptoo.KGradientPanel();
        jLabel270 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbu = new javax.swing.JTable();
        Gender = new javax.swing.JComboBox<>();
        clsc1 = new javax.swing.JComboBox<>();
        stream0 = new javax.swing.JComboBox<>();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        sep = new javax.swing.JSeparator();
        jLabel163 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel252 = new javax.swing.JLabel();
        au = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        typo = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        addStream.setMinimumSize(new java.awt.Dimension(449, 280));
        addStream.setModal(true);
        addStream.setModalExclusionType(null);
        addStream.setUndecorated(true);
        addStream.setSize(new java.awt.Dimension(449, 280));

        addSt.setPreferredSize(new java.awt.Dimension(449, 280));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(449, 280));

        jLabel44.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 153, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Add Stream");

        jButton15.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(102, 153, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Save_35px.png"))); // NOI18N
        jButton15.setText("Save");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(102, 153, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_35px.png"))); // NOI18N
        jButton17.setText("Delete");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        strreamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(strreamTable);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 0, 51));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("X");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_stream)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel38)
                .addGap(5, 5, 5)
                .addComponent(jLabel44)
                .addGap(18, 18, 18)
                .addComponent(add_stream, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addStLayout = new javax.swing.GroupLayout(addSt);
        addSt.setLayout(addStLayout);
        addStLayout.setHorizontalGroup(
            addStLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addStLayout.setVerticalGroup(
            addStLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addStreamLayout = new javax.swing.GroupLayout(addStream.getContentPane());
        addStream.getContentPane().setLayout(addStreamLayout);
        addStreamLayout.setHorizontalGroup(
            addStreamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
            .addGroup(addStreamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addSt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addStreamLayout.setVerticalGroup(
            addStreamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(addStreamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addSt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tsub.setMinimumSize(new java.awt.Dimension(449, 280));
        tsub.setModal(true);
        tsub.setModalExclusionType(null);
        tsub.setUndecorated(true);
        tsub.setResizable(false);
        tsub.setSize(new java.awt.Dimension(462, 399));

        addSt1.setPreferredSize(new java.awt.Dimension(449, 280));

        kGradientPanel6.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel6.setkGradientFocus(600);
        kGradientPanel6.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel6.setPreferredSize(new java.awt.Dimension(449, 280));

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel34.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Teacher Subject Registration");

        jLabel35.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel35.setText("class");

        jButton8.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Save_35px.png"))); // NOI18N
        jButton8.setText("Save");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_35px.png"))); // NOI18N
        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel36.setText("Teacher");

        scodev.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        scodev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scodevMouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel37.setText("subject");

        subject3.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        subject3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        subject3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subject3ItemStateChanged(evt);
            }
        });
        subject3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subject3MouseClicked(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 0, 51));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("X");
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });

        teacher.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });

        subReg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane14.setViewportView(subReg);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel37))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subject3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(scodev, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(teacher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel34))
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subject3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scodev)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(teacher))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap())
        );

        javax.swing.GroupLayout subRegestrationLayout = new javax.swing.GroupLayout(subRegestration);
        subRegestration.setLayout(subRegestrationLayout);
        subRegestrationLayout.setHorizontalGroup(
            subRegestrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
            .addGroup(subRegestrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(subRegestrationLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        subRegestrationLayout.setVerticalGroup(
            subRegestrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
            .addGroup(subRegestrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(subRegestrationLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout kGradientPanel6Layout = new javax.swing.GroupLayout(kGradientPanel6);
        kGradientPanel6.setLayout(kGradientPanel6Layout);
        kGradientPanel6Layout.setHorizontalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subRegestration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel6Layout.setVerticalGroup(
            kGradientPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subRegestration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout addSt1Layout = new javax.swing.GroupLayout(addSt1);
        addSt1.setLayout(addSt1Layout);
        addSt1Layout.setHorizontalGroup(
            addSt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        addSt1Layout.setVerticalGroup(
            addSt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSt1Layout.createSequentialGroup()
                .addComponent(kGradientPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tsubLayout = new javax.swing.GroupLayout(tsub.getContentPane());
        tsub.getContentPane().setLayout(tsubLayout);
        tsubLayout.setHorizontalGroup(
            tsubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
            .addGroup(tsubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addSt1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
        );
        tsubLayout.setVerticalGroup(
            tsubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
            .addGroup(tsubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addSt1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
        );

        tsub1.setMinimumSize(new java.awt.Dimension(449, 280));
        tsub1.setModal(true);
        tsub1.setModalExclusionType(null);
        tsub1.setUndecorated(true);
        tsub1.setResizable(false);
        tsub1.setSize(new java.awt.Dimension(449, 401));

        addSt2.setPreferredSize(new java.awt.Dimension(449, 280));

        kGradientPanel7.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel7.setkGradientFocus(600);
        kGradientPanel7.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel7.setPreferredSize(new java.awt.Dimension(449, 280));

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel29.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Regester subject");

        jLabel30.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel30.setText("Subject");

        jButton6.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Save_35px.png"))); // NOI18N
        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel31.setText("Code");

        subject.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Math", "Eng", "Chem", "Kisw", "Bio", "Phy", "Comp", "Bus", "Agri", "Hist", "Geo", "C.R.E", "I.R.E", "HomeScience" }));

        jLabel32.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel32.setText("Class");

        subject1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        subject1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        rsub.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane15.setViewportView(rsub);

        jButton7.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_35px.png"))); // NOI18N
        jButton7.setText("Delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 0, 51));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("X");
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32))
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(subject1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(subject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(code))))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7))
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(jLabel41)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel41))
                .addGap(11, 11, 11)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(10, 10, 10)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap())
        );

        javax.swing.GroupLayout subteacherLayout = new javax.swing.GroupLayout(subteacher);
        subteacher.setLayout(subteacherLayout);
        subteacherLayout.setHorizontalGroup(
            subteacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        subteacherLayout.setVerticalGroup(
            subteacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kGradientPanel7Layout = new javax.swing.GroupLayout(kGradientPanel7);
        kGradientPanel7.setLayout(kGradientPanel7Layout);
        kGradientPanel7Layout.setHorizontalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subteacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel7Layout.setVerticalGroup(
            kGradientPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subteacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout addSt2Layout = new javax.swing.GroupLayout(addSt2);
        addSt2.setLayout(addSt2Layout);
        addSt2Layout.setHorizontalGroup(
            addSt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addSt2Layout.setVerticalGroup(
            addSt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSt2Layout.createSequentialGroup()
                .addComponent(kGradientPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout tsub1Layout = new javax.swing.GroupLayout(tsub1.getContentPane());
        tsub1.getContentPane().setLayout(tsub1Layout);
        tsub1Layout.setHorizontalGroup(
            tsub1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
            .addGroup(tsub1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addSt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tsub1Layout.setVerticalGroup(
            tsub1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
            .addGroup(tsub1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addSt2, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
        );

        tsub2.setMinimumSize(new java.awt.Dimension(601, 531));
        tsub2.setModal(true);
        tsub2.setModalExclusionType(null);
        tsub2.setUndecorated(true);
        tsub2.setResizable(false);
        tsub2.setSize(new java.awt.Dimension(601, 531));

        comp.setkEndColor(new java.awt.Color(0, 204, 204));
        comp.setkGradientFocus(600);
        comp.setkStartColor(new java.awt.Color(153, 0, 153));
        comp.setPreferredSize(new java.awt.Dimension(601, 391));

        jPanel7.setPreferredSize(new java.awt.Dimension(577, 370));

        jTable1.setBackground(new java.awt.Color(240, 240, 240));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Name", "Marks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Combine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Exam code");

        cnt.setEditable(false);

        jLabel12.setText("Contribute");

        setter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        setter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                setterKeyReleased(evt);
            }
        });

        cls.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8" }));
        cls.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                clsItemStateChanged(evt);
            }
        });
        cls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsActionPerformed(evt);
            }
        });

        jLabel13.setText("Select class");

        jLabel14.setText("Term");

        ent2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Term 1", "Term 2", "Term 3" }));
        ent2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ent2ItemStateChanged(evt);
            }
        });
        ent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ent2ActionPerformed(evt);
            }
        });

        ent3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        ent3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ent3ItemStateChanged(evt);
            }
        });
        ent3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ent3ActionPerformed(evt);
            }
        });

        jLabel15.setText("Year");

        code1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        code1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                code1ItemStateChanged(evt);
            }
        });
        code1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                code1ActionPerformed(evt);
            }
        });

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Select Exam code");

        jLabel51.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("GENERATE COMBINED RESULTS");

        jButton14.setText("Generate code");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout penelLayout = new javax.swing.GroupLayout(penel);
        penel.setLayout(penelLayout);
        penelLayout.setHorizontalGroup(
            penelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(penelLayout.createSequentialGroup()
                .addGroup(penelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(penelLayout.createSequentialGroup()
                        .addGroup(penelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cls, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(59, 59, 59)
                        .addGroup(penelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(ent2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(penelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ent3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addComponent(code1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penelLayout.createSequentialGroup()
                .addGroup(penelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(penelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton14))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, penelLayout.createSequentialGroup()
                        .addGroup(penelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cnt, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(penelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setter)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        penelLayout.setVerticalGroup(
            penelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(code1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(penelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ent2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ent3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 51, 51));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("x");
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(penel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout compLayout = new javax.swing.GroupLayout(comp);
        comp.setLayout(compLayout);
        compLayout.setHorizontalGroup(
            compLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        compLayout.setVerticalGroup(
            compLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tsub2Layout = new javax.swing.GroupLayout(tsub2.getContentPane());
        tsub2.getContentPane().setLayout(tsub2Layout);
        tsub2Layout.setHorizontalGroup(
            tsub2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
            .addGroup(tsub2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(comp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tsub2Layout.setVerticalGroup(
            tsub2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
            .addGroup(tsub2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(comp, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
        );

        tsub3.setMinimumSize(new java.awt.Dimension(601, 531));
        tsub3.setModal(true);
        tsub3.setModalExclusionType(null);
        tsub3.setUndecorated(true);
        tsub3.setSize(new java.awt.Dimension(601, 531));

        comp1.setkEndColor(new java.awt.Color(0, 204, 204));
        comp1.setkGradientFocus(600);
        comp1.setkStartColor(new java.awt.Color(153, 0, 153));
        comp1.setPreferredSize(new java.awt.Dimension(601, 391));

        jPanel11.setPreferredSize(new java.awt.Dimension(577, 370));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Comment");

        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });

        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c8ActionPerformed(evt);
            }
        });

        c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c7ActionPerformed(evt);
            }
        });

        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });

        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });

        c12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c12ActionPerformed(evt);
            }
        });

        c11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c11ActionPerformed(evt);
            }
        });

        c10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c10ActionPerformed(evt);
            }
        });

        c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c9ActionPerformed(evt);
            }
        });

        jLabel43.setText("A");

        jLabel58.setText("A-");

        jLabel59.setText("B+");

        jLabel60.setText("B");

        jLabel61.setText("B-");

        jLabel62.setText("C+");

        jLabel64.setText("C");

        jLabel65.setText("C-");

        jLabel66.setText("D+");

        jLabel106.setText("D-");

        jLabel107.setText("E");

        jLabel108.setText("D");

        jButton11.setText("Save");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        lang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENGLISH", "KISWAHILI" }));

        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Select Language");

        javax.swing.GroupLayout penel1Layout = new javax.swing.GroupLayout(penel1);
        penel1.setLayout(penel1Layout);
        penel1Layout.setHorizontalGroup(
            penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penel1Layout.createSequentialGroup()
                        .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, penel1Layout.createSequentialGroup()
                        .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel108))
                        .addGap(27, 27, 27)))
                .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c12)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        penel1Layout.setVerticalGroup(
            penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(penel1Layout.createSequentialGroup()
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addGap(5, 5, 5)
                .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addGap(5, 5, 5)
                .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66)
                    .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108))
                .addGap(5, 5, 5)
                .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(penel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 51, 51));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("x");
        jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel63MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(penel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout comp1Layout = new javax.swing.GroupLayout(comp1);
        comp1.setLayout(comp1Layout);
        comp1Layout.setHorizontalGroup(
            comp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        comp1Layout.setVerticalGroup(
            comp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tsub3Layout = new javax.swing.GroupLayout(tsub3.getContentPane());
        tsub3.getContentPane().setLayout(tsub3Layout);
        tsub3Layout.setHorizontalGroup(
            tsub3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
            .addGroup(tsub3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(comp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tsub3Layout.setVerticalGroup(
            tsub3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
            .addGroup(tsub3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(comp1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
        );

        tsub5.setMinimumSize(new java.awt.Dimension(466, 350));
        tsub5.setModal(true);
        tsub5.setModalExclusionType(null);
        tsub5.setUndecorated(true);
        tsub5.setResizable(false);
        tsub5.setSize(new java.awt.Dimension(466, 350));

        kGradientPanel18.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel18.setkGradientFocus(600);
        kGradientPanel18.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel18.setPreferredSize(new java.awt.Dimension(466, 350));

        jLabel221.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel221.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel221.setText("Exam Name Registration");

        jLabel222.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel222.setText("Exam Name");

        jButton21.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Save_35px.png"))); // NOI18N
        jButton21.setText("Save");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_35px.png"))); // NOI18N
        jButton22.setText("Delete");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTable2);

        exam_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exam_name1ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 0, 51));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("X");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jButton21)
                        .addGap(38, 38, 38)
                        .addComponent(jButton22)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel222)
                .addGap(21, 21, 21)
                .addComponent(exam_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel221, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel221)
                    .addComponent(jLabel45))
                .addGap(34, 34, 34)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel222)
                    .addComponent(exam_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22)
                    .addComponent(jButton21))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel18Layout = new javax.swing.GroupLayout(kGradientPanel18);
        kGradientPanel18.setLayout(kGradientPanel18Layout);
        kGradientPanel18Layout.setHorizontalGroup(
            kGradientPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel18Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        kGradientPanel18Layout.setVerticalGroup(
            kGradientPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tsub5Layout = new javax.swing.GroupLayout(tsub5.getContentPane());
        tsub5.getContentPane().setLayout(tsub5Layout);
        tsub5Layout.setHorizontalGroup(
            tsub5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tsub5Layout.setVerticalGroup(
            tsub5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tsub6.setMinimumSize(new java.awt.Dimension(449, 280));
        tsub6.setModal(true);
        tsub6.setModalExclusionType(null);
        tsub6.setUndecorated(true);
        tsub6.setResizable(false);
        tsub6.setSize(new java.awt.Dimension(557, 405));

        exreg.setkEndColor(new java.awt.Color(0, 204, 204));
        exreg.setkGradientFocus(600);
        exreg.setkStartColor(new java.awt.Color(153, 0, 153));
        exreg.setPreferredSize(new java.awt.Dimension(557, 405));

        jLabel223.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel223.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel223.setText("Exam Registration");

        form2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        form2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));

        term2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        term2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        term2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                term2ActionPerformed(evt);
            }
        });

        year2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        year2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025" }));

        jLabel224.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel224.setText("Select Form");

        jLabel225.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel225.setText("Select Term");

        jLabel226.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel226.setText("Year");

        jButton23.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Save_35px.png"))); // NOI18N
        jButton23.setText("Save");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_35px.png"))); // NOI18N
        jButton24.setText("Delete");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(jTable4);

        jLabel227.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel227.setText("Exam Name");

        exam_name2.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        exam_name2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Exam Name" }));
        exam_name2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exam_name2MouseClicked(evt);
            }
        });
        exam_name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exam_name2ActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 0, 51));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("X");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel223, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel224)
                            .addComponent(form2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel225)
                            .addComponent(term2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(year2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel226))
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel227, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exam_name2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel21Layout.createSequentialGroup()
                                .addComponent(jButton23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton24)))
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel223, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel46))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel224, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel225, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel227)
                        .addComponent(jLabel226)))
                .addGap(34, 34, 34)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(term2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(form2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exam_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton24)
                    .addComponent(jButton23))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout exregLayout = new javax.swing.GroupLayout(exreg);
        exreg.setLayout(exregLayout);
        exregLayout.setHorizontalGroup(
            exregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exregLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        exregLayout.setVerticalGroup(
            exregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exregLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tsub6Layout = new javax.swing.GroupLayout(tsub6.getContentPane());
        tsub6.getContentPane().setLayout(tsub6Layout);
        tsub6Layout.setHorizontalGroup(
            tsub6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exreg, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );
        tsub6Layout.setVerticalGroup(
            tsub6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tsub7.setMinimumSize(new java.awt.Dimension(449, 280));
        tsub7.setModal(true);
        tsub7.setModalExclusionType(null);
        tsub7.setUndecorated(true);
        tsub7.setResizable(false);
        tsub7.setSize(new java.awt.Dimension(449, 280));

        kGradientPanel19.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel19.setkGradientFocus(600);
        kGradientPanel19.setkStartColor(new java.awt.Color(153, 0, 153));

        jLabel228.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel228.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel228.setText("Registration Code");

        jLabel229.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel229.setText("Code");

        jButton27.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Save_35px.png"))); // NOI18N
        jButton27.setText("Save");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_35px.png"))); // NOI18N
        jButton28.setText("Delete");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 0, 51));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("X");
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jButton27)
                .addGap(18, 18, 18)
                .addComponent(jButton28)
                .addGap(65, 65, 65))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel229)
                .addGap(37, 37, 37)
                .addComponent(security_code, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel228, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel228))
                    .addComponent(jLabel47))
                .addGap(39, 39, 39)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel229)
                    .addComponent(security_code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27)
                    .addComponent(jButton28))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel19Layout = new javax.swing.GroupLayout(kGradientPanel19);
        kGradientPanel19.setLayout(kGradientPanel19Layout);
        kGradientPanel19Layout.setHorizontalGroup(
            kGradientPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel19Layout.setVerticalGroup(
            kGradientPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout tsub7Layout = new javax.swing.GroupLayout(tsub7.getContentPane());
        tsub7.getContentPane().setLayout(tsub7Layout);
        tsub7Layout.setHorizontalGroup(
            tsub7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        );
        tsub7Layout.setVerticalGroup(
            tsub7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ExamManagementSystem");

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel2.setkGradientFocus(600);
        kGradientPanel2.setkStartColor(new java.awt.Color(153, 0, 153));

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));

        p1.setBackground(new java.awt.Color(85, 55, 118));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p1MouseEntered(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_home_35px_2.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Home");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lets Connect Systems");

        p3.setBackground(new java.awt.Color(64, 43, 100));
        p3.setPreferredSize(new java.awt.Dimension(115, 46));
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p3MouseEntered(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Add_User_Male_35px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Teacher Registration");

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(p3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        p4.setBackground(new java.awt.Color(64, 43, 100));
        p4.setPreferredSize(new java.awt.Dimension(115, 46));
        p4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p4MouseEntered(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Add_New_35px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter Marks");

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        p5.setBackground(new java.awt.Color(64, 43, 100));
        p5.setPreferredSize(new java.awt.Dimension(115, 46));
        p5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p5MouseEntered(evt);
            }
        });

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Class_35px.png"))); // NOI18N

        jLabel111.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("Exam Results");

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(p5Layout.createSequentialGroup()
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        p6.setBackground(new java.awt.Color(64, 43, 100));
        p6.setPreferredSize(new java.awt.Dimension(115, 46));
        p6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p6MouseEntered(evt);
            }
        });

        jLabel161.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_school_35px_4.png"))); // NOI18N

        jLabel162.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setText("Register School");

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel161)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel162, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel161, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jLabel162, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p7.setBackground(new java.awt.Color(64, 43, 100));
        p7.setPreferredSize(new java.awt.Dimension(115, 46));
        p7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p7MouseEntered(evt);
            }
        });

        jLabel248.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_file_submodule_35px.png"))); // NOI18N

        jLabel249.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel249.setForeground(new java.awt.Color(255, 255, 255));
        jLabel249.setText("student record");

        javax.swing.GroupLayout p7Layout = new javax.swing.GroupLayout(p7);
        p7.setLayout(p7Layout);
        p7Layout.setHorizontalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel248)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel249, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p7Layout.setVerticalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel249, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(p7Layout.createSequentialGroup()
                        .addComponent(jLabel248, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        p2.setBackground(new java.awt.Color(64, 43, 100));
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p2MouseEntered(evt);
            }
        });

        jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Student_Male_27px.png"))); // NOI18N

        jLabel180.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(255, 255, 255));
        jLabel180.setText("Student Registration");

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel165)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel180, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel180, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel165, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(p5, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addComponent(p7, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
            .addComponent(p2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        homedesktop.setLayout(new java.awt.CardLayout());

        kGradientPanel14.setkEndColor(new java.awt.Color(12, 91, 160));
        kGradientPanel14.setkGradientFocus(200);
        kGradientPanel14.setkStartColor(new java.awt.Color(51, 204, 255));
        kGradientPanel14.setPreferredSize(new java.awt.Dimension(101, 65));
        kGradientPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel14MouseClicked(evt);
            }
        });

        jLabel164.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(255, 0, 51));
        jLabel164.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel164.setText("OLEKASASI SEC SCHOOL");

        jLabel166.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(255, 0, 51));
        jLabel166.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel166.setText("MISSON:");

        jLabel167.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(51, 0, 0));
        jLabel167.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel167.setText("P.O BOX 15626-00503");

        jLabel168.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(51, 0, 0));
        jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel168.setText("TEL: 02022506232");

        jLabel169.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(51, 0, 0));
        jLabel169.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel169.setText("MBAGATHI");

        jLabel170.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(255, 0, 51));
        jLabel170.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel170.setText("MOTTO:");

        jLabel171.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel171.setForeground(new java.awt.Color(51, 0, 51));
        jLabel171.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel171.setText("\"STRIVE TO EXCEL\"");

        jLabel172.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(51, 0, 0));
        jLabel172.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel172.setText("SECONDARY SCHOOL AND ");

        jLabel174.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(51, 0, 0));
        jLabel174.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel174.setText("TAKE AS MANY CHILDREN");

        jLabel175.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(51, 0, 0));
        jLabel175.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel175.setText("AS POSSIBLE ACQUIRE");

        jLabel176.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(51, 0, 0));
        jLabel176.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel176.setText("COME OUT WITH GOOD GRADE");

        jLabel173.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel173.setForeground(new java.awt.Color(255, 0, 51));
        jLabel173.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel173.setText("VISION:");

        jLabel177.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel177.setForeground(new java.awt.Color(51, 0, 0));
        jLabel177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel177.setText("OF LIFE IN AND OUT OF SCHOOL.");

        jLabel178.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel178.setForeground(new java.awt.Color(51, 0, 0));
        jLabel178.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel178.setText("TO DEVELOP ALL ROUND BOYS AND");

        jLabel179.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(51, 0, 0));
        jLabel179.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel179.setText("GIRLS TO COUNTER CHALLENGES");

        javax.swing.GroupLayout kGradientPanel14Layout = new javax.swing.GroupLayout(kGradientPanel14);
        kGradientPanel14.setLayout(kGradientPanel14Layout);
        kGradientPanel14Layout.setHorizontalGroup(
            kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel177, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel164, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addComponent(jLabel167, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel168, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel169, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel170, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel171, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel174, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel175, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel172, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel176, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel166, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel173, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)))
            .addGroup(kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel178, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)))
            .addGroup(kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel179, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)))
        );
        kGradientPanel14Layout.setVerticalGroup(
            kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel164)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel170)
                .addGap(18, 18, 18)
                .addComponent(jLabel171)
                .addGap(68, 68, 68)
                .addComponent(jLabel174)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel175)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel172)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel176)
                .addGap(18, 18, 18)
                .addComponent(jLabel166)
                .addGap(98, 98, 98)
                .addComponent(jLabel177)
                .addGap(27, 27, 27))
            .addGroup(kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel14Layout.createSequentialGroup()
                    .addGap(276, 276, 276)
                    .addComponent(jLabel173)
                    .addContainerGap(368, Short.MAX_VALUE)))
            .addGroup(kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel14Layout.createSequentialGroup()
                    .addContainerGap(550, Short.MAX_VALUE)
                    .addComponent(jLabel178)
                    .addGap(109, 109, 109)))
            .addGroup(kGradientPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel14Layout.createSequentialGroup()
                    .addContainerGap(595, Short.MAX_VALUE)
                    .addComponent(jLabel179)
                    .addGap(64, 64, 64)))
        );

        javax.swing.GroupLayout add_marks1Layout = new javax.swing.GroupLayout(add_marks1);
        add_marks1.setLayout(add_marks1Layout);
        add_marks1Layout.setHorizontalGroup(
            add_marks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_marks1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        add_marks1Layout.setVerticalGroup(
            add_marks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_marks1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        homedesktop.add(add_marks1, "card2");

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel14KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel14KeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Marks");

        jLabel17.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel17.setText("Adm No");

        adm.setEditable(false);
        adm.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        adm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                admKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                admKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel18.setText("Name");

        name_display.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel19.setText("Form");

        form.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        form.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Form", "1", "2", "3", "4", "5", "6", "7", "8" }));
        form.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                formItemStateChanged(evt);
            }
        });
        form.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel20.setText("Stream");

        stream1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        stream1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Stream" }));
        stream1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 2));
        stream1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                stream1ItemStateChanged(evt);
            }
        });
        stream1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stream1MouseClicked(evt);
            }
        });
        stream1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stream1KeyPressed(evt);
            }
        });

        subname.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        subname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject", "Math", "Eng", "Chem", "Kisw", "Bio", "Phy", "Comp", "Bus", "Agri", "Hist", "Geo", "C.R.E", "I.R.E", "HomeScience", "Music" }));
        subname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subnameItemStateChanged(evt);
            }
        });
        subname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                subnameKeyPressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel21.setText("Subject Name");

        jLabel22.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel22.setText("Exam Code");

        exam_code.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        exam_code.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Exam Code" }));
        exam_code.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                exam_codeItemStateChanged(evt);
            }
        });
        exam_code.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exam_codeMouseClicked(evt);
            }
        });
        exam_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exam_codeActionPerformed(evt);
            }
        });
        exam_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exam_codeKeyPressed(evt);
            }
        });

        student_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        student_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_detailsMouseClicked(evt);
            }
        });
        student_details.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                student_detailsKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                student_detailsKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(student_details);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel17))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(adm, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18)
                                        .addGap(35, 35, 35)
                                        .addComponent(name_display, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(subname, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(exam_code, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(stream1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(form, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18))
                    .addComponent(name_display, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(stream1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exam_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(subname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        grade.setEditable(false);
        grade.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        grade.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel24.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel24.setText("Grade");

        jLabel26.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel26.setText("Out Of");

        out_of.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        out_of.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                out_ofKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                out_ofKeyReleased(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Points");

        points.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        points.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        converted_score.setEditable(false);
        converted_score.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        converted_score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converted_scoreActionPerformed(evt);
            }
        });

        student_score.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        student_score.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                student_scoreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                student_scoreKeyReleased(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel25.setText("Converted Score");

        jLabel23.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel23.setText("Student Score");

        kGradientPanel3.setBackground(new java.awt.Color(204, 204, 204));
        kGradientPanel3.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel3.setkGradientFocus(600);
        kGradientPanel3.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel3.setPreferredSize(new java.awt.Dimension(114, 108));
        kGradientPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel3MouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Save");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        kGradientPanel4.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel4.setkGradientFocus(600);
        kGradientPanel4.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel4MouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Delete");

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout add_marksLayout = new javax.swing.GroupLayout(add_marks);
        add_marks.setLayout(add_marksLayout);
        add_marksLayout.setHorizontalGroup(
            add_marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_marksLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(add_marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, add_marksLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(30, 30, 30)
                        .addComponent(student_score, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, add_marksLayout.createSequentialGroup()
                        .addGroup(add_marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(converted_score)))
                .addGroup(add_marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_marksLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(add_marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(add_marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(out_of)
                            .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(add_marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(points, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_marksLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
            .addGroup(add_marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(add_marksLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        add_marksLayout.setVerticalGroup(
            add_marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_marksLayout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addGroup(add_marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(student_score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(out_of, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(add_marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25)
                    .addGroup(add_marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(converted_score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24))
                    .addComponent(grade)
                    .addComponent(points, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(add_marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(add_marksLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(154, Short.MAX_VALUE)))
        );

        homedesktop.add(add_marks, "card2");

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel68.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Exam");

        jLabel69.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Subject");

        jLabel70.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("A");

        jLabel71.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel71.setText("From");

        afrom.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel72.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel72.setText("To");

        ato.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel73.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("A-");

        jLabel74.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel74.setText("From");

        aminusfrom.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        aminusto.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        bplusfrom.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel75.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel75.setText("To");

        jLabel76.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("B+");

        jLabel77.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel77.setText("From");

        jLabel78.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel78.setText("To");

        bplusto.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel79.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("B");

        jLabel80.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel80.setText("From");

        bfrom.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel81.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel81.setText("To");

        bto.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        bto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("B-");

        jLabel83.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel83.setText("From");

        bminusfrom.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel84.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel84.setText("To");

        bminusto.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel85.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("C+");

        jLabel86.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel86.setText("From");

        cplusfrom.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel87.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel87.setText("To");

        cplusto.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel88.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("C");

        jLabel89.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel89.setText("From");

        cfrom.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel90.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel90.setText("To");

        cto.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel91.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("C-");

        jLabel92.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel92.setText("From");

        cminusfrom.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel93.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel93.setText("To");

        cminusto.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel94.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("D+");

        jLabel95.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel95.setText("From");

        dplusfrom.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel96.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel96.setText("To");

        dplusto.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel97.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("D");

        jLabel98.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel98.setText("From");

        dfrom.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel99.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel99.setText("To");

        dto.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel100.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("D-");

        jLabel101.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel101.setText("From");

        dminusfrom.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel102.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel102.setText("To");

        dminusto.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel103.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("E");

        jLabel104.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel104.setText("From");

        efrom.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jLabel105.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel105.setText("To");

        eto.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Save_35px.png"))); // NOI18N
        jButton25.setText("Save");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        sub.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        sub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Math", "Eng", "Chem", "Kisw", "Bio", "Phy", "Comp", "Bus", "Agri", "Hist", "Geo", "C.R.E", "I.R.E", "HomeScience" }));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel92)
                        .addGap(4, 4, 4)
                        .addComponent(cminusfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel93)
                        .addGap(28, 28, 28)
                        .addComponent(cminusto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel100)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel101)
                        .addGap(4, 4, 4)
                        .addComponent(dminusfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel102)
                        .addGap(28, 28, 28)
                        .addComponent(dminusto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addGap(4, 4, 4)
                                .addComponent(bminusfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel84)
                                .addGap(28, 28, 28)
                                .addComponent(bminusto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel80)
                                .addGap(4, 4, 4)
                                .addComponent(bfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel81)
                                .addGap(28, 28, 28)
                                .addComponent(bto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel71)
                        .addGap(4, 4, 4)
                        .addComponent(afrom, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel72)
                        .addGap(28, 28, 28)
                        .addComponent(ato, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel97)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel98)
                                .addGap(4, 4, 4)
                                .addComponent(dfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel99)
                                .addGap(28, 28, 28)
                                .addComponent(dto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel91)
                                    .addComponent(jLabel94))
                                .addGap(56, 56, 56)
                                .addComponent(jLabel95)
                                .addGap(4, 4, 4)
                                .addComponent(dplusfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel96)
                                .addGap(28, 28, 28)
                                .addComponent(dplusto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel88)
                                .addGap(64, 64, 64)
                                .addComponent(jLabel89)
                                .addGap(4, 4, 4)
                                .addComponent(cfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel90)
                                .addGap(28, 28, 28)
                                .addComponent(cto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel85)
                                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(56, 56, 56)
                                .addComponent(jLabel86)
                                .addGap(4, 4, 4)
                                .addComponent(cplusfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel87)
                                .addGap(28, 28, 28)
                                .addComponent(cplusto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel73)
                                .addComponent(jLabel76))))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel77)
                        .addGap(4, 4, 4)
                        .addComponent(bplusfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel78)
                        .addGap(28, 28, 28)
                        .addComponent(bplusto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel74)
                        .addGap(4, 4, 4)
                        .addComponent(aminusfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel75)
                        .addGap(28, 28, 28)
                        .addComponent(aminusto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel104)
                        .addGap(4, 4, 4)
                        .addComponent(efrom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel105)
                                .addGap(28, 28, 28)
                                .addComponent(eto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jButton25))))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sub, 0, 694, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel68)
                .addGap(18, 18, 18)
                .addComponent(jLabel69)
                .addGap(3, 3, 3)
                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(afrom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel71)
                                .addComponent(jLabel70))
                            .addComponent(jLabel72))))
                .addGap(24, 24, 24)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(jLabel73)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(aminusfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel75))
                    .addComponent(aminusto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel77)
                            .addComponent(jLabel76)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(bplusfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel78))
                    .addComponent(bplusto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel80)
                                .addComponent(jLabel79))
                            .addComponent(jLabel81))))
                .addGap(9, 9, 9)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bminusfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel24Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel83)
                                    .addComponent(jLabel82))
                                .addComponent(jLabel84))))
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bminusto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton25)))
                .addGap(11, 11, 11)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cplusfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cplusto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel86)
                                .addComponent(jLabel85))
                            .addComponent(jLabel87))))
                .addGap(10, 10, 10)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel88)
                            .addComponent(jLabel89)
                            .addComponent(jLabel90))))
                .addGap(11, 11, 11)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cminusfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cminusto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel92)
                                .addComponent(jLabel91))
                            .addComponent(jLabel93))))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dplusfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dplusto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel95)
                                .addComponent(jLabel94))
                            .addComponent(jLabel96))))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel97))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel98))
                    .addComponent(dfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel99))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(dto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dminusfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dminusto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100)
                            .addComponent(jLabel101)
                            .addComponent(jLabel102))))
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel104))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(efrom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel105))
                            .addComponent(eto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel103)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout regSubGradeLayout = new javax.swing.GroupLayout(regSubGrade);
        regSubGrade.setLayout(regSubGradeLayout);
        regSubGradeLayout.setHorizontalGroup(
            regSubGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
            .addGroup(regSubGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(regSubGradeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        regSubGradeLayout.setVerticalGroup(
            regSubGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
            .addGroup(regSubGradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(regSubGradeLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        homedesktop.add(regSubGrade, "card2");

        Gr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        cls1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "1", "2", "3", "4" }));
        cls1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cls1ItemStateChanged(evt);
            }
        });
        cls1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cls1ActionPerformed(evt);
            }
        });

        jLabel48.setText("Select Class");

        stream2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stream2ActionPerformed(evt);
            }
        });

        jLabel50.setText("Select Stream");

        code12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                code12MouseClicked(evt);
            }
        });

        jLabel49.setText("Select Exam code");

        jLabel52.setText("Class subject  Entries");

        ent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        jButton3.setText("Print merit list");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Combine exams");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Print Report forms");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Generate Results");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel53.setText("Year");

        year1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        year1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                year1ItemStateChanged(evt);
            }
        });
        year1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year1ActionPerformed(evt);
            }
        });

        jLabel56.setText("Term");

        term1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Term 1", "Term 2", "Term 3" }));
        term1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                term1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cls1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48))
                                .addGap(91, 91, 91)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(year1, 0, 125, Short.MAX_VALUE)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65))
                                    .addComponent(stream2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(code12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(term1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel48)
                                .addComponent(jButton2)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cls1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(year1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(term1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButton3))))
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel50)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel52))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(code12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stream2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton5)
                .addContainerGap())
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        table.setAutoCreateRowSorter(true);
        table.setBackground(new java.awt.Color(240, 240, 240));
        table.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adm", "Student's Name", "C.pos", "O.Pos", "Eng", "Kis", "Mat", "Bio", "Phy", "Chem", "His", "Geo", "C.R.E", "Agri", "Comp", "BS", "S.E", "T.M", "A.M", "T.P", "A.P", "M.G", "V.A.P"
            }
        ));
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        table.setMinimumSize(new java.awt.Dimension(1805, 16));
        table.setRowHeight(30);
        table.setRowMargin(0);
        table.setSelectionBackground(new java.awt.Color(255, 153, 102));
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        jScrollPane1.setViewportView(table);

        jLabel57.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("GENERATE RESULTS");

        jLabel183.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_30px_1.png"))); // NOI18N

        jTextField3.setBackground(new java.awt.Color(240, 240, 240));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(null);
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        sep2.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sep2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(sep2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout GrLayout = new javax.swing.GroupLayout(Gr);
        Gr.setLayout(GrLayout);
        GrLayout.setHorizontalGroup(
            GrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GrLayout.setVerticalGroup(
            GrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GrLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        homedesktop.add(Gr, "card2");

        kGradientPanel8.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        kGradientPanel8.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel8.setkGradientFocus(0);
        kGradientPanel8.setkStartColor(new java.awt.Color(255, 255, 255));

        adm1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adm1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        adm1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adm1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adm1KeyTyped(evt);
            }
        });

        surname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        surname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        fname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        lname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        adm_date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        adm_date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Numbers_35px.png"))); // NOI18N
        jLabel117.setToolTipText("");

        jLabel118.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel118.setText("Adm");

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Female_Profile_35px.png"))); // NOI18N

        jLabel120.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel120.setText("FirstName");

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_User_35px.png"))); // NOI18N

        jLabel122.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel122.setText("Surname");

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Collaborator_Male_27px.png"))); // NOI18N

        jLabel124.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel124.setText("LastName");

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Gender_27px_1.png"))); // NOI18N

        jLabel126.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel126.setText("D.O.B");

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Class_27px.png"))); // NOI18N

        jLabel128.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel128.setText("Stream");

        kGradientPanel9.setkEndColor(new java.awt.Color(12, 91, 160));
        kGradientPanel9.setkGradientFocus(200);
        kGradientPanel9.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel9.setPreferredSize(new java.awt.Dimension(101, 65));
        kGradientPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel9MouseClicked(evt);
            }
        });

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Save_35px.png"))); // NOI18N
        jLabel129.setText("jLabel17");

        jLabel130.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(255, 255, 255));
        jLabel130.setText("Save");

        javax.swing.GroupLayout kGradientPanel9Layout = new javax.swing.GroupLayout(kGradientPanel9);
        kGradientPanel9.setLayout(kGradientPanel9Layout);
        kGradientPanel9Layout.setHorizontalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel9Layout.createSequentialGroup()
                .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        kGradientPanel9Layout.setVerticalGroup(
            kGradientPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel129, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel130, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        kGradientPanel10.setkEndColor(new java.awt.Color(12, 91, 160));
        kGradientPanel10.setkGradientFocus(200);
        kGradientPanel10.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel10MouseClicked(evt);
            }
        });

        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_35px.png"))); // NOI18N

        jLabel132.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setText("Delete");

        javax.swing.GroupLayout kGradientPanel10Layout = new javax.swing.GroupLayout(kGradientPanel10);
        kGradientPanel10.setLayout(kGradientPanel10Layout);
        kGradientPanel10Layout.setHorizontalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel10Layout.setVerticalGroup(
            kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel10Layout.createSequentialGroup()
                .addGroup(kGradientPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel10Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel131))
                    .addComponent(jLabel132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel133.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(102, 153, 255));
        jLabel133.setText("Student Registration");

        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Birthday_27px.png"))); // NOI18N

        jLabel135.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel135.setText("Gender");

        dob.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dob.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Report_Card_27px.png"))); // NOI18N

        jLabel137.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel137.setText("AdmDate");

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Student_Male_27px.png"))); // NOI18N

        jLabel139.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel139.setText("Class/Form");

        religion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        religion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Christian", "Islam", "Hindu" }));
        religion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        religion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                religionActionPerformed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gender", "Male", "Female" }));
        gender.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Certificate_27px.png"))); // NOI18N

        jLabel141.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel141.setText("BirthCertNo");

        birth_cert_no.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        birth_cert_no.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Scorecard_27px.png"))); // NOI18N

        jLabel143.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel143.setText("KcpeMarks");

        kcpe_marks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kcpe_marks.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_House_27px.png"))); // NOI18N

        jLabel145.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel145.setText("House");

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Church_27px_1.png"))); // NOI18N

        jLabel147.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel147.setText("Religion");

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Family_27px.png"))); // NOI18N

        jLabel149.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel149.setText("Parent/Gurdian");

        parent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        parent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Android_27px.png"))); // NOI18N

        jLabel151.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel151.setText("Telephone");

        telephone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telephone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Android_27px.png"))); // NOI18N

        jLabel153.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel153.setText("AlternativeContact");

        alternative_telephone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        alternative_telephone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Bedroom_27px.png"))); // NOI18N

        jLabel155.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel155.setText("Boarder/Day");

        border_day.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        border_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boarder", "Day" }));
        border_day.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Family_27px.png"))); // NOI18N

        jLabel157.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel157.setText("StudentPhoto");

        jLabel158.setText("jLabel44");
        jLabel158.setPreferredSize(new java.awt.Dimension(4, 4));

        lblimg.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(12, 91, 160)));

        kGradientPanel11.setkEndColor(new java.awt.Color(12, 91, 160));
        kGradientPanel11.setkGradientFocus(200);
        kGradientPanel11.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel11.setPreferredSize(new java.awt.Dimension(101, 65));
        kGradientPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel11MouseClicked(evt);
            }
        });

        jLabel159.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel159.setText("Choose Photo");

        javax.swing.GroupLayout kGradientPanel11Layout = new javax.swing.GroupLayout(kGradientPanel11);
        kGradientPanel11.setLayout(kGradientPanel11Layout);
        kGradientPanel11Layout.setHorizontalGroup(
            kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel11Layout.createSequentialGroup()
                .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        kGradientPanel11Layout.setVerticalGroup(
            kGradientPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel159, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        formb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        formb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        formb.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        streamb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        streamb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        streamb.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        streamb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                streambItemStateChanged(evt);
            }
        });
        streamb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                streambMouseClicked(evt);
            }
        });

        house.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        house.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        house.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setText("Mathematics");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel3.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        b12.setBackground(new java.awt.Color(255, 255, 255));
        b12.setText("Computer");
        jPanel3.add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setText("English");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel3.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setText("Kiswahili");
        jPanel3.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setText("History");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel3.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setText("C.R.E");
        jPanel3.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setText("Geography");
        jPanel3.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setText("Homescience");
        jPanel3.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.setText("Chemistry");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel3.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        b9.setBackground(new java.awt.Color(255, 255, 255));
        b9.setText("I.R.E");
        jPanel3.add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        b10.setBackground(new java.awt.Color(255, 255, 255));
        b10.setText("Agriculture");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        jPanel3.add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        b11.setBackground(new java.awt.Color(255, 255, 255));
        b11.setText("Business");
        jPanel3.add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        b13.setBackground(new java.awt.Color(255, 255, 255));
        b13.setText("Physics");
        jPanel3.add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        b14.setBackground(new java.awt.Color(255, 255, 255));
        b14.setText("Biology");
        jPanel3.add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        b15.setBackground(new java.awt.Color(255, 255, 255));
        b15.setText("Music");
        jPanel3.add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jLabel187.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel187.setText("Select Students Subjects");

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Select All");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel8Layout = new javax.swing.GroupLayout(kGradientPanel8);
        kGradientPanel8.setLayout(kGradientPanel8Layout);
        kGradientPanel8Layout.setHorizontalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel187)
                            .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                    .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(kGradientPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kcpe_marks, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(363, 363, 363)
                                    .addComponent(kGradientPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                                    .addGap(238, 238, 238))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel142)
                                    .addGap(13, 13, 13)
                                    .addComponent(jLabel143)))
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel125)
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel135))
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel134)
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel140)
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel141))
                                    .addComponent(birth_cert_no, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel144)
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel145))
                                    .addComponent(house, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jLabel133)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel156)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel157))
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(kGradientPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel117)
                                    .addComponent(adm1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel119)
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel120))
                                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel121)
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel122))
                                    .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel123)
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel124))
                                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(209, 209, 209)
                                .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel138)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel139)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel127)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel128)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel146)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel147)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel154)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel155))
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(formb, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(streamb, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(border_day, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel136)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel137)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel148)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel149)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel150)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel151)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel152)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel153))
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(adm_date, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                        .addComponent(parent, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(alternative_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        kGradientPanel8Layout.setVerticalGroup(
            kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel156)
                            .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(2, 2, 2)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(kGradientPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblimg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(adm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel120)))
                        .addGap(5, 5, 5)
                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel122)))
                        .addGap(3, 3, 3)
                        .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel123)
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel124)))
                        .addGap(3, 3, 3)
                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel127)
                    .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel139)
                            .addComponent(jLabel147)
                            .addComponent(jLabel155))))
                .addGap(3, 3, 3)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(formb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(streamb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(border_day, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel125)
                                    .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel134)
                                    .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel140)
                                    .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addComponent(birth_cert_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel144)
                            .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(house, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel136)
                    .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel148)
                    .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel150)
                    .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel152)
                    .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adm_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alternative_telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel142)
                    .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(kcpe_marks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel187, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kGradientPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sturegLayout = new javax.swing.GroupLayout(stureg);
        stureg.setLayout(sturegLayout);
        sturegLayout.setHorizontalGroup(
            sturegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sturegLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kGradientPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sturegLayout.setVerticalGroup(
            sturegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sturegLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        homedesktop.add(stureg, "card2");

        jLabel230.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        jLabel230.setText("School Details Registration");

        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton18.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(102, 153, 255));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Save_35px.png"))); // NOI18N
        jButton18.setText("Save");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(102, 153, 255));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_35px.png"))); // NOI18N
        jButton29.setText("Delete");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        stb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        stb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stbMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(stb);

        jLabel231.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel231.setText("School Name");

        jLabel232.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel232.setText("School Motto");

        jLabel233.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel233.setText("School Mission");

        jLabel234.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel234.setText("School Address");

        jLabel235.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel235.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel235.setText("School Logo");

        lblimg3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_upload_31px_1.png"))); // NOI18N
        jButton30.setText("ChoosePhoto");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        mission.setColumns(20);
        mission.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        mission.setLineWrap(true);
        mission.setRows(5);
        mission.setWrapStyleWord(true);
        jScrollPane5.setViewportView(mission);

        vision.setColumns(20);
        vision.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        vision.setLineWrap(true);
        vision.setRows(5);
        vision.setWrapStyleWord(true);
        jScrollPane12.setViewportView(vision);

        motto.setColumns(20);
        motto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        motto.setLineWrap(true);
        motto.setRows(5);
        motto.setWrapStyleWord(true);
        jScrollPane13.setViewportView(motto);

        school_name2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        school_name2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                school_name2KeyReleased(evt);
            }
        });

        jLabel251.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel251.setText("School vision");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel230, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel234)
                                    .addComponent(jLabel231))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(school_name2)
                                    .addComponent(address))
                                .addGap(59, 59, 59)))
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblimg3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(jLabel235, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel232)
                        .addContainerGap())
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane12)
                    .addComponent(jScrollPane8)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel233, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel251, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel235)
                    .addComponent(jLabel230))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel231)
                            .addComponent(school_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel234))
                        .addGap(52, 52, 52)
                        .addComponent(jLabel232))
                    .addComponent(lblimg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jLabel233)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel251)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18)
                    .addComponent(jButton29)))
        );

        javax.swing.GroupLayout treg1Layout = new javax.swing.GroupLayout(treg1);
        treg1.setLayout(treg1Layout);
        treg1Layout.setHorizontalGroup(
            treg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treg1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        treg1Layout.setVerticalGroup(
            treg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treg1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        homedesktop.add(treg1, "card2");

        kGradientPanel5.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel5.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel5.setkGradientFocus(0);
        kGradientPanel5.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        surname2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        surname2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        kGradientPanel5.add(surname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 131, 137, -1));

        lname2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lname2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        kGradientPanel5.add(lname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 136, 137, -1));

        fname2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fname2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        kGradientPanel5.add(fname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 136, 137, -1));

        idno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        kGradientPanel5.add(idno, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 136, 137, -1));

        inn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        kGradientPanel5.add(inn, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 216, 137, -1));

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        kGradientPanel5.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 226, 137, -1));

        phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        kGradientPanel5.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 226, 137, -1));

        tscno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tscno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));
        tscno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tscnoKeyReleased(evt);
            }
        });
        kGradientPanel5.add(tscno, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 69, 137, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Name_35px.png"))); // NOI18N
        kGradientPanel5.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 109, -1, 22));

        jLabel55.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel55.setText("SurName");
        kGradientPanel5.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 116, 57, -1));

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Female_Profile_35px.png"))); // NOI18N
        kGradientPanel5.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 109, -1, 22));

        jLabel112.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel112.setText("FirstName");
        kGradientPanel5.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 116, -1, -1));

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_User_35px.png"))); // NOI18N
        kGradientPanel5.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 109, -1, 27));

        jLabel114.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel114.setText("Lastname");
        kGradientPanel5.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 115, -1, -1));

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Info_35px.png"))); // NOI18N
        kGradientPanel5.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 173, -1, 40));

        jLabel116.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel116.setText("Initials");
        kGradientPanel5.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 171, -1, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_ID_Verified_35px.png"))); // NOI18N
        kGradientPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 109, -1, 27));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel10.setText("IdNo");
        kGradientPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 115, -1, -1));

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Numbers_35px.png"))); // NOI18N
        kGradientPanel5.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 39, -1, 27));

        jLabel236.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel236.setText("TscNo");
        kGradientPanel5.add(jLabel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 39, 60, 27));

        jLabel237.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Gmail_35px.png"))); // NOI18N
        kGradientPanel5.add(jLabel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 196, -1, 27));

        jLabel238.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel238.setText("Email");
        kGradientPanel5.add(jLabel238, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 196, -1, 27));

        jLabel239.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Phone_35px.png"))); // NOI18N
        kGradientPanel5.add(jLabel239, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 183, -1, 40));

        jLabel240.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel240.setText("Phone");
        kGradientPanel5.add(jLabel240, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 183, 90, 40));

        save.setkEndColor(new java.awt.Color(12, 91, 160));
        save.setkGradientFocus(200);
        save.setkStartColor(new java.awt.Color(153, 0, 153));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });

        jLabel241.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Save_35px.png"))); // NOI18N
        jLabel241.setText("jLabel17");

        jLabel242.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel242.setForeground(new java.awt.Color(255, 255, 255));
        jLabel242.setText("Save");

        javax.swing.GroupLayout saveLayout = new javax.swing.GroupLayout(save);
        save.setLayout(saveLayout);
        saveLayout.setHorizontalGroup(
            saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel241, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel242, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        saveLayout.setVerticalGroup(
            saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(saveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel241, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel242)))
        );

        kGradientPanel5.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 545, 150, 46));

        delete.setkEndColor(new java.awt.Color(12, 91, 160));
        delete.setkGradientFocus(200);
        delete.setkStartColor(new java.awt.Color(153, 0, 153));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        jLabel245.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Delete_35px.png"))); // NOI18N

        jLabel246.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel246.setForeground(new java.awt.Color(255, 255, 255));
        jLabel246.setText("Delete");

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel245)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel246)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel245)
                .addGap(20, 20, 20))
            .addGroup(deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel246, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel5.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 545, 140, 50));

        jLabel247.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel247.setForeground(new java.awt.Color(102, 153, 255));
        jLabel247.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel247.setText("Teachers Registration");
        kGradientPanel5.add(jLabel247, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 670, 29));

        sdetails3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        sdetails3.setEnabled(false);
        sdetails3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sdetails3MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(sdetails3);

        kGradientPanel5.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 329, 668, 198));

        jTextField2.setBorder(null);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        kGradientPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 266, 162, 32));

        jLabel182.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_30px_1.png"))); // NOI18N
        kGradientPanel5.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 266, 35, 31));

        sep1.setForeground(new java.awt.Color(51, 51, 51));
        kGradientPanel5.add(sep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 303, 201, 8));

        jLabel184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Info_35px.png"))); // NOI18N
        kGradientPanel5.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 173, -1, 40));

        jLabel185.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jLabel185.setText("Password");
        kGradientPanel5.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 183, -1, 30));

        password.setText("jPasswordField1");
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 153)));
        kGradientPanel5.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 219, -1, 27));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "Stardard User" }));
        kGradientPanel5.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 59, 264, 32));

        jLabel186.setText("Select user type");
        kGradientPanel5.add(jLabel186, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 39, -1, -1));

        javax.swing.GroupLayout treg2Layout = new javax.swing.GroupLayout(treg2);
        treg2.setLayout(treg2Layout);
        treg2Layout.setHorizontalGroup(
            treg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treg2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        treg2Layout.setVerticalGroup(
            treg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treg2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        homedesktop.add(treg2, "card2");

        kGradientPanel20.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        kGradientPanel20.setForeground(new java.awt.Color(0, 153, 255));
        kGradientPanel20.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel20.setkGradientFocus(0);
        kGradientPanel20.setkStartColor(new java.awt.Color(255, 255, 255));

        jLabel270.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel270.setForeground(new java.awt.Color(102, 153, 255));
        jLabel270.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel270.setText("Students  Record");

        tbu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbuMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tbu);

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gender", "Male", "Female" }));
        Gender.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GenderItemStateChanged(evt);
            }
        });

        clsc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class", "1", "2", "3", "4" }));
        clsc1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                clsc1ItemStateChanged(evt);
            }
        });
        clsc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clsc1ActionPerformed(evt);
            }
        });

        stream0.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stream" }));
        stream0.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                stream0ItemStateChanged(evt);
            }
        });

        jButton12.setText("Print List");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("Generate list");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jTextField1.setBorder(null);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        sep.setForeground(new java.awt.Color(51, 51, 51));

        jLabel163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_30px_1.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel20Layout = new javax.swing.GroupLayout(kGradientPanel20);
        kGradientPanel20.setLayout(kGradientPanel20Layout);
        kGradientPanel20Layout.setHorizontalGroup(
            kGradientPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel270, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane10)
                    .addGroup(kGradientPanel20Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(kGradientPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel20Layout.createSequentialGroup()
                                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel20Layout.createSequentialGroup()
                                .addComponent(clsc1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(stream0, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel20Layout.createSequentialGroup()
                                .addGroup(kGradientPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(sep, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel20Layout.createSequentialGroup()
                                        .addComponent(jLabel163, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        kGradientPanel20Layout.setVerticalGroup(
            kGradientPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel20Layout.createSequentialGroup()
                .addComponent(jLabel270, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stream0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clsc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(kGradientPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(sep, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout treg3Layout = new javax.swing.GroupLayout(treg3);
        treg3.setLayout(treg3Layout);
        treg3Layout.setHorizontalGroup(
            treg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
            .addGroup(treg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE))
        );
        treg3Layout.setVerticalGroup(
            treg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
            .addGroup(treg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(treg3Layout.createSequentialGroup()
                    .addComponent(kGradientPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        homedesktop.add(treg3, "card2");

        jScrollPane3.setViewportView(homedesktop);

        jPanel6.setBackground(new java.awt.Color(85, 55, 118));

        jLabel252.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel252.setForeground(new java.awt.Color(255, 255, 255));
        jLabel252.setText("You are logged in as");

        au.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        au.setForeground(new java.awt.Color(255, 255, 255));

        jLabel181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel181.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_logout_rounded_down_31px.png"))); // NOI18N
        jLabel181.setToolTipText("LOG OUT");
        jLabel181.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel181MouseClicked(evt);
            }
        });

        typo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        typo.setForeground(new java.awt.Color(255, 255, 255));
        typo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel188.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel188.setForeground(new java.awt.Color(255, 255, 255));
        jLabel188.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel188.setText("Type of User");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel252)
                .addGap(6, 6, 6)
                .addComponent(au, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel188, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel252, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(au, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel188)
                .addGap(6, 6, 6)
                .addComponent(typo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(122, 72, 221));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(80, 36));

        jMenu9.setText("Exam Registration");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu9);

        jMenu4.setText("Exam Name Registration");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Grading");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu2.setText("Teacher's Subject Registration");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Subject Registration");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu6.setText("Add Stream");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Add comments");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

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
public void upDateStudent(){
                  if( adm.getText().isEmpty() || surname.getText().isEmpty() ||adm_date.getText().isEmpty() || fname.getText().isEmpty()||lname.getText().isEmpty()||dob.getText().isEmpty()||birth_cert_no.getText().isEmpty()||kcpe_marks.getText().isEmpty() ||parent.getText().isEmpty()||telephone.getText().isEmpty()||alternative_telephone.getText().isEmpty() ){
    JOptionPane.showMessageDialog(null, "Fields cannot be empty!!");}
         else{
         try{
             String sqli="UPDATE student_registration SET surname=?, gender=?, adm_date=?, fname=?, lname=?, dob=?, stream=?, form=?, birth_cert_no=?, kcpe_marks=?, house=?, religion=?, parent=?, telephone=?, alternative_telephone=?, border_day=? WHERE adm=? ";
           pst=conn.prepareStatement(sqli);
           
          pst=conn.prepareStatement(sqli);
          
           
           pst.setString(1, surname.getText());
           pst.setString(2, gender.getSelectedItem().toString());
           pst.setString(3, adm_date.getText());
           pst.setString(4, fname.getText());
           pst.setString(5, lname.getText());
           pst.setString(6, dob.getText());
           pst.setString(7, streamb.getSelectedItem().toString());
           pst.setString(8, formb.getSelectedItem().toString());
           pst.setString(9, birth_cert_no.getText());
           pst.setString(10, kcpe_marks.getText());
           pst.setString(11, house.getSelectedItem().toString());
           pst.setString(12, religion.getSelectedItem().toString());
           pst.setString(13, parent.getText());
           pst.setString(14, telephone.getText());
           pst.setString(15, alternative_telephone.getText());
           pst.setString(16, border_day.getSelectedItem().toString());
          // pst.setBytes(17, person_image);
           pst.setString(17, adm.getText());
           
           pst.executeUpdate();
        JOptionPane.showMessageDialog(rootPane, "Saved");
                 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }  

}public void admKeyReleased(){
   try{
   String sql="SELECT `adm`, `surname`, `gender`, `adm_date`, `fname`, `lname`, `dob`, `stream`, `form`, `birth_cert_no`, `kcpe_marks`, `house`, `religion`, `parent`, `telephone`, `alternative_telephone`, `border_day`, `photo`,subjects FROM `student_registration` WHERE adm='"+adm1.getText()+"'";
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   if(rs.next()){
        adm1.setText(rs.getString("adm"));
      surname.setText(rs.getString("surname"));
      gender.setSelectedItem(rs.getString("gender"));
      adm_date.setText(rs.getString("adm_date"));
      fname.setText(rs.getString("fname"));
      lname.setText(rs.getString("lname"));
      dob.setText(rs.getString("dob"));
      streamb.setSelectedItem(rs.getString("stream"));
      formb.setSelectedItem(rs.getString("form"));
      birth_cert_no.setText(rs.getString("birth_cert_no"));
      kcpe_marks.setText(rs.getString("kcpe_marks"));
      house.setSelectedItem(rs.getString("house"));
      religion.setSelectedItem(rs.getString("religion"));
      parent.setText(rs.getString("parent"));
      telephone.setText(rs.getString("telephone"));
      alternative_telephone.setText(rs.getString("alternative_telephone"));
      border_day.setSelectedItem(rs.getString("border_day"));
      String list=rs.getString("subjects");
      
      if(list.contains("Math")){
      b1.setSelected(true);
      }
      if(list.contains("Eng")){
      b2.setSelected(true);
      }
      if(list.contains("Kisw")){
      b3.setSelected(true);
      }
      if(list.contains("Hist")){
      b4.setSelected(true);
      }
      if(list.contains("C.R.E")){
      b5.setSelected(true);
      }if(list.contains("Geo")){
      b6.setSelected(true);
      }
      if(list.contains("HomeScience")){
      b7.setSelected(true);
      }if(list.contains("Chem")){
      b8.setSelected(true);
      }if(list.contains("I.R.E")){
      b9.setSelected(true);
      }
      if(list.contains("Agri")){
      b10.setSelected(true);
      }
      if(list.contains("Bus")){
      b11.setSelected(true);
      }if(list.contains("Comp")){
      b12.setSelected(true);
      }if(list.contains("Phy")){
      b13.setSelected(true);
      }if(list.contains("Bio")){
      b14.setSelected(true);
      }if(list.contains("Music")){
      b15.setSelected(true);
      }
       byte[] filename=rs.getBytes("photo");
       image=filename;
      ImageIcon ImageIcon=new ImageIcon (new ImageIcon (filename).getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(), Image.SCALE_SMOOTH));
        lblimg.setIcon(ImageIcon); 
        
        
   }
   else{

     
      surname.setText("");
      gender.setSelectedItem("");
      adm_date.setText("");
      fname.setText("");
      lname.setText("");
      dob.setText("");
      birth_cert_no.setText("");
      kcpe_marks.setText("");
      parent.setText("");
      telephone.setText("");
      alternative_telephone.setText("");
      unSelect(new JRadioButton[]{b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15});
      ImageIcon ImageIcon=new ImageIcon (new ImageIcon ("").getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(), Image.SCALE_SMOOTH));
        lblimg.setIcon(ImageIcon); 
        image=null;
   }
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
       }

}
public void Select(JRadioButton[] bt){
      for(int i=0;i<bt.length;i++){
        bt[i].setSelected(true);
    
    }
}
public void unSelect(JRadioButton[] bt){
      for(int i=0;i<bt.length;i++){
        bt[i].setSelected(false);
    
    }
}
    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        // TODO add your handling code here:
        if(typo.getText().equals("ADMIN")){
        
    tsub6.setVisible(true);
    }else{
        JOptionPane.showMessageDialog(null, "This Areas are only accessed by admin please Sign in as admin");
       // TODO add your handling code here:
        // TODO add your handling code here:
          homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
      
        homedesktop.add(add_marks1);
       
    
    }
      
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
         if(typo.getText().equals("ADMIN")){
        
    tsub5.setVisible(true);
    }else{
        JOptionPane.showMessageDialog(null, "This Areas are only accessed by admin please Sign in as admin");
       // TODO add your handling code here:
        // TODO add your handling code here:
          homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
      
        homedesktop.add(add_marks1);
       
    
    }
    }//GEN-LAST:event_jMenu4MouseClicked

    private void p1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseClicked
   // TODO add your handling code here:
        // TODO add your handling code here:
        
          homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
      
        homedesktop.add(add_marks1);
           
    }//GEN-LAST:event_p1MouseClicked

    private void p3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseClicked
        // TODO add your handling code here:
      // TODO add your handling code here:
      if(typo.getText().equals("ADMIN")){
        
       // TODO add your handling code here:
      
          homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
      
        homedesktop.add(treg2);
    }else{
        JOptionPane.showMessageDialog(null, "This Areas are only accessed by admin please Sign in as admin");
       // TODO add your handling code here:
        // TODO add your handling code here:
          homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
      
        homedesktop.add(add_marks1);
       
    
    }
      

          
    }//GEN-LAST:event_p3MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
      tsub.setVisible(true);
       
    }//GEN-LAST:event_jMenu2MouseClicked
 private void names(){
            try{
         String sql="SELECT  `adm`,`form`,`fname`  FROM `student_registration` WHERE adm='"+adm.getText()+"'";   
         pst=conn.prepareStatement(sql);
         rs=pst.executeQuery();
         if(rs.next()){
             
             name_display.setText(rs.getString("fname"));
         }
             else{
             
            
             }
         
        }
       catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
       } 
    
    
    }
private void form(){
        try{
         String sql="SELECT  `adm`,`form`  FROM `student_registration` WHERE adm='"+adm.getText()+"'";   
         pst=conn.prepareStatement(sql);
         rs=pst.executeQuery();
         if(rs.next()){
             
             form.setSelectedItem(rs.getString("form"));
         }
             else{
             
            
             }
         
        }
       catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
       } 



}

public void examcodeForGenerateResult(){
    code12.removeAllItems();
  
     
       
        String s,y,t;
        s=cls1.getSelectedItem().toString();
        y=year1.getSelectedItem().toString();
       
        t=term1.getSelectedItem().toString();
         try{
                if(!y.equals("select") && !t.equals("select") && !s.equals("select")){
     String sql="SELECT * FROM `exam_code` where term='"+t+"' and year='"+y+"' and form='"+s+"'";
                    System.out.println(sql);
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
      code12.addItem(rs.getString("code"));
      
   }}
                     else if(!y.equals("select") && !s.equals("select")){
     String sql="SELECT * FROM `exam_code` where year='"+y+"' and form='"+s+"'";
      System.out.println(sql);
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
      code12.addItem(rs.getString("code"));
      
   }
   }
     else if(!y.equals("select") && !t.equals("select")){
     String sql="SELECT * FROM `exam_code` where year='"+y+"' and term='"+t+"'";
      System.out.println(sql);
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
     code12.addItem(rs.getString("code"));
      
   }
   }
         else if(!s.equals("select") && !t.equals("select")){
     String sql="SELECT * FROM `exam_code` where form='"+s+"' and term='"+t+"'";
      System.out.println(sql);
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
     code12.addItem(rs.getString("code"));
      
   }
   }
         else if(!s.equals("select")){
                        
   String sql="SELECT * FROM `exam_code` where form='"+s+"'";
    System.out.println(sql);
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
      code12.addItem(rs.getString("code"));
      
   }}else if(!y.equals("select")){
     String sql="SELECT * FROM `exam_code` where year='"+y+"'";
      System.out.println(sql);
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
   code12.addItem(rs.getString("code"));
      
   }
   }
        else if(!t.equals("select")){
     String sql="SELECT * FROM `exam_code` where Term='"+t+"'";
      System.out.println(sql);
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
     code12.addItem(rs.getString("code"));
      
   }
   }
   
    
   
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
       }
    
}


public void tbusort(){
     
String c =clsc1.getSelectedItem().toString();
String s =stream0.getSelectedItem().toString();
String g =Gender.getSelectedItem().toString();
 if(!g.equals("Gender") &&!c.equals("Class") && !s.equals("Select Stream")){
 try {
     
        String sql9="Select adm as ADM,concat(surname,' ',fname,' ',lname) as 'Students Name' ,Gender,form,stream from student_registration where form='"+c+"' && gender='"+g+"' && stream='"+s+"'";
        System.out.println(sql9);
        com.mysql.jdbc.PreparedStatement st9=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql9);
        ResultSet rs9=st9.executeQuery();
       
        tbu.setModel(DbUtils.resultSetToTableModel(rs9));
        
        String sql10="create or replace view classlist as Select adm as ADM,concat(surname,' ',fname,' ',lname) as 'Students Name' ,Gender,form,stream from student_registration where form='"+c+"' && gender='"+g+"' && stream='"+s+"'";
        System.out.println(sql10);
        PreparedStatement st10= conn.prepareStatement(sql10);
        st10.execute();
    } catch (SQLException ex) {
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
 else if(!g.equals("Gender") && !s.equals("Select Stream")){
 try {
        String sql9="Select adm as ADM,concat(surname,' ',fname,' ',lname) as 'Students Name' ,Gender,form,stream from student_registration where  gender='"+g+"' && stream='"+s+"'";
        System.out.println(sql9);
        com.mysql.jdbc.PreparedStatement st9=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql9);
        ResultSet rs9=st9.executeQuery();
        tbu.setModel(DbUtils.resultSetToTableModel(rs9));
        String sql10="create or replace view classlist as Select adm as ADM_No,concat(surname,' ',fname,' ',lname) as 'Students Name' ,Gender,form,stream from student_registration where stream='"+stream0.getSelectedItem()+"'";
        PreparedStatement st10= conn.prepareStatement(sql10);
        st10.execute();
    } catch (SQLException ex) {
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
else if(!g.equals("Gender") && !c.equals("Class")){
 try {
        String sql9="Select adm as ADM,concat(surname,' ',fname,' ',lname) as 'Students Name' ,Gender,form,stream from student_registration where form='"+c+"' && gender='"+g+"' ";
        com.mysql.jdbc.PreparedStatement st9=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql9);
        System.out.println(sql9);
        ResultSet rs9=st9.executeQuery();
        tbu.setModel(DbUtils.resultSetToTableModel(rs9));
        
        String sql10="create or replace view classlist as Select adm as ADM,concat(surname,' ',fname,' ',lname) as 'Students Name' ,Gender,form,stream from student_registration where form='"+c+"' && gender='"+g+"' ";
        PreparedStatement st10= conn.prepareStatement(sql10);
        st10.execute();
    } catch (SQLException ex) {
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
else if(!c.equals("Class") && !s.equals("Select Stream")){
 try {
       
     String sql9="Select adm as ADM,concat(surname,' ',fname,' ',lname) as 'Students Name' ,Gender,form,stream from student_registration where form='"+c+"'  && stream='"+s+"'";
        System.out.println(sql9);
     com.mysql.jdbc.PreparedStatement st9=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql9);
       
        ResultSet rs9=st9.executeQuery();
        tbu.setModel(DbUtils.resultSetToTableModel(rs9));
        String sql10="create or replace view classlist as Select adm as ADM,concat(surname,' ',fname,' ',lname) as 'Students Name' ,Gender,form,stream from student_registration where form='"+c+"'  && stream='"+s+"'";
        PreparedStatement st10= conn.prepareStatement(sql10);
        st10.execute();
    } catch (SQLException ex) {
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
 else if(!s.equals("Select Stream")){
    try {
        String sql9="Select adm as ADM_No,concat(surname,' ',fname,' ',lname) as 'Students Name' ,Gender,form,stream from student_registration where stream='"+stream0.getSelectedItem()+"'";
        PreparedStatement st9= conn.prepareStatement(sql9);
        ResultSet rs9=st9.executeQuery();
        tbu.setModel(DbUtils.resultSetToTableModel(rs9));
        String sql10="replace or create view classlist as Select adm as ADM_No,concat(surname,' ',fname,' ',lname) as 'Students Name' ,Gender,form,stream from student_registration where stream='"+stream0.getSelectedItem()+"'";
        PreparedStatement st10= conn.prepareStatement(sql10);
        st10.execute();
    } catch (SQLException ex) {
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }
                
}
else if(!g.equals("Gender")){
 try {
        String sql9="Select adm as ADM,concat(surname,' ',fname,' ',lname) as 'Students Name' ,Gender,form,stream from student_registration where gender='"+Gender.getSelectedItem()+"' ";
        com.mysql.jdbc.PreparedStatement st9=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql9);
        ResultSet rs9=st9.executeQuery();
        tbu.setModel(DbUtils.resultSetToTableModel(rs9));
        String sql10="create or replace view classlist as Select adm as ADM,concat(surname,' ',fname,' ',lname) as 'Students Name' ,Gender,form,stream from student_registration where gender='"+Gender.getSelectedItem()+"' ";
        PreparedStatement st10= conn.prepareStatement(sql10);
        st10.execute();
    } catch (SQLException ex) {
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
else if(!c.equals("Class") ){
 try {
        
     String sql9="Select adm as ADM,concat(surname,' ',fname,' ',lname) as 'Students Name' ,Gender,form,stream from student_registration where form='"+clsc1.getSelectedItem().toString()+"'";
       System.out.println(sql9); 
     com.mysql.jdbc.PreparedStatement st9=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql9);
        ResultSet rs9=st9.executeQuery();
        tbu.setModel(DbUtils.resultSetToTableModel(rs9));
        String sql10="create or replace view classlist as Select adm as ADM,concat(surname,' ',fname,' ',lname) as 'Students Name' ,Gender,form,stream from student_registration where form='"+clsc1.getSelectedItem().toString()+"'";
        PreparedStatement st10= conn.prepareStatement(sql10);
        st10.execute();
    } catch (SQLException ex) {
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }
}


}
private void stream(){
     stream0.removeAllItems();
     stream1.removeAllItems();
     stream2.removeAllItems();
       streamb.removeAllItems();
     stream0.addItem("Select Stream");
     stream1.addItem("Select Stream");
     stream2.addItem("Select Stream");
     streamb.addItem("Select Stream");
        try{
         String sql="SELECT * from stream";   
         pst=conn.prepareStatement(sql);
         rs=pst.executeQuery();
         while(rs.next()){
            
     stream0.addItem(rs.getString("stream_name"));
     stream1.addItem(rs.getString("stream_name"));
     stream2.addItem(rs.getString("stream_name"));
     streamb.addItem(rs.getString("stream_name"));

             

         }
             
         
        }
       catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
       } 
}    
    private void tablelord(){
      //   String sql="SELECT booklend.mid, booklend.bid,   addbook.bname, addbook.subject, addbook.form, addmember.name FROM booklend JOIN addbook ON booklend.bid=addbook.bid JOIN addmember ON booklend.mid=addmember.mid WHERE addbook.bname='longhorn' and addbook.subject='math' and addbook.form='4'";
           
            
         try{
   String sql="SELECT  `adm`, `surname`,`fname`  FROM `student_registration` WHERE form='"+form.getSelectedItem()+"' and stream='"+stream1.getSelectedItem()+"' and subjects like  '%"+subname.getSelectedItem()+"%' ORDER BY adm";
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   student_details.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
    DefaultTableModel tb=(DefaultTableModel) student_details.getModel();
    
     
    if(tb.getColumnName(3).equals("Marks")){}else{
   tb.addColumn("Marks");
    }
    
 
   }
   catch(Exception e){
   JOptionPane.showMessageDialog(rootPane, e.getMessage());
   }    
    }
  public void showMarks(){
   String admno="";       
       
         try{
  
    
    String sql1="SELECT  `adm`, `surname`,`fname`  FROM `student_registration` WHERE form='"+form.getSelectedItem()+"' and stream='"+stream1.getSelectedItem()+"' and subjects like '%"+subname.getSelectedItem()+"%' ORDER BY adm";
  System.out.print(sql1);
    PreparedStatement pst1=conn.prepareStatement(sql1);
   ResultSet rs1=pst1.executeQuery();
   int i=0;
    while(rs1.next()){
        admno=rs1.getString("adm");
    
        String sql12="SELECT * from add_Marks where Adm_no='"+admno+"' and form='"+form.getSelectedItem()+"' and stream='"+stream1.getSelectedItem()+"' and sub_name='"+subname.getSelectedItem()+"' and examcode='"+exam_code.getSelectedItem()+"'";
 System.out.println(sql12);
        PreparedStatement pst12=conn.prepareStatement(sql12);
   ResultSet rs12=pst12.executeQuery();
    while (rs12.next()){
    student_details.setValueAt(rs12.getString("student_score"), i, 3);
    
    }
    i++;
    } 
   }
   catch(Exception e){
   JOptionPane.showMessageDialog(rootPane, e.getMessage());
   } 
  } 
    public void grade(){
    ArrayList<Integer> list1k=new ArrayList<>();
    list1k.clear();
    double sc=Double.parseDouble(student_score.getText());
        double of=Double.parseDouble(out_of.getText());
        double cc=(sc/of)*100;
        converted_score.setText(""+Math.round(cc));
if(!converted_score.getText().isEmpty()){
            try {
                String sql="Select * from exam_grade";
                pst=conn.prepareCall(sql);
                rs=pst.executeQuery();
               
                while(rs.next()){
                    for(int i=2;i<26;i++){
                list1k.add(Integer.parseInt(rs.getString(i)));}
                
                }
                if(cc>=list1k.get(0) && cc<=list1k.get(1)){
                grade.setText("A");
                points.setText(""+12);
                } else if(cc>=list1k.get(2) && cc<=list1k.get(3)){
            grade.setText("A-");
                            points.setText(""+11);
            }
                 else if(cc>=list1k.get(4) && cc<=list1k.get(5)){
            grade.setText("B+");
                            points.setText(""+10);
            }
                 else if(cc>=list1k.get(6) && cc<=list1k.get(7)){
            grade.setText("B");
                            points.setText(""+9);
            }
                 else if(cc>=list1k.get(8) && cc<=list1k.get(9)){
            grade.setText("B-");
                            points.setText(""+8);
            }
                 else if(cc>=list1k.get(10) && cc<=list1k.get(11)){
            grade.setText("C+");
                            points.setText(""+7);
            }
                 else if(cc>=list1k.get(12) && cc<=list1k.get(13)){
            grade.setText("C");
                            points.setText(""+6);
            }
                 else if(cc>=list1k.get(14) && cc<=list1k.get(15)){
            grade.setText("C-");
                            points.setText(""+5);
            }
                 else if(cc>=list1k.get(16) && cc<=list1k.get(17)){
            grade.setText("D+");
                            points.setText(""+4);
            }
                 else if(cc>=list1k.get(18) && cc<=list1k.get(19)){
            grade.setText("D");
                            points.setText(""+3);
            }
                 else if(cc>=list1k.get(20) && cc<=list1k.get(21)){
            grade.setText("D-");
                            points.setText(""+2);
            }
                 else if(cc>=list1k.get(22) && cc<=list1k.get(23)){
            grade.setText("E");
                            points.setText(""+1);
            }
               
            } catch (SQLException ex) {
               
            }
      
      
      }
}
    public void setConvert(){
   try {
         
       int val=0;
         for(int i=0;i<jTable1.getRowCount();i++){
       if(jTable1.getValueAt(i, 0).equals(true)){
           String tr=jTable1.getValueAt(i, 1).toString();
    String trk=jTable1.getValueAt(i, 2).toString();
    int hr=Integer.parseInt(trk);
    val=hr+val;
    
       
         
          com.mysql.jdbc.Connection con=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/exams","root", "");
         
         
         try {
             String sq="select * from add_marks where examcode='"+tr+"' and form='"+cls.getSelectedItem()+"'  GROUP BY Adm_no";
             
            
             com.mysql.jdbc.PreparedStatement s=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sq);
             ResultSet r=s.executeQuery();
             while(r.next()){
                 String adm=r.getString("Adm_no");
                  
                 String sql="select * from add_marks where examcode='"+tr+"' and sub_name='Math' and Adm_no='"+adm+"'";
                 
                 com.mysql.jdbc.PreparedStatement st=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
                 ResultSet rs=st.executeQuery();
                 while(rs.next()){
                     
                    double  m1=Integer.parseInt(rs.getString("Student_score"));
                    
                    double conv=(m1/100)*hr;
                    
                   String sql1="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='Math' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st1=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql1);
                st1.execute();
                 }
                 String sql1="select * from add_marks where examcode='"+tr+"' and sub_name='Eng' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st1=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql1);
                 ResultSet rs1=st1.executeQuery();
                 while(rs1.next()){
                   double  m1=Integer.parseInt(rs1.getString("Student_score"));
                    double conv=(m1/100)*hr;
                 
                   String sql2="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='Eng' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st2=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql2);
                st2.execute();
                 }
                 String sql2="select * from add_marks where examcode='"+tr+"' and sub_name='Chem' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st2=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql2);
                 ResultSet rs2=st2.executeQuery();
                 while(rs2.next()){
                      double  m1=Integer.parseInt(rs2.getString("Student_score"));
                    double conv=(m1/100)*hr;
                   String sql3="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='Chem' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st3=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql3);
                st3.execute();
                 }
                 String sql3="select * from add_marks where examcode='"+tr+"' and sub_name='Kisw' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st3=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql3);
                 ResultSet rs3=st3.executeQuery();
                 while(rs3.next()){
                     double  m1=Integer.parseInt(rs3.getString("Student_score"));
                    double conv=(m1/100)*hr;
                   String sql4="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='Kisw' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st4=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql4);
                st4.execute();
                 }
                 String sql4="select * from add_marks where examcode='"+tr+"' and sub_name='Bio' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st4=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql4);
                 ResultSet rs4=st4.executeQuery();
                 while(rs4.next()){
                     double  m1=Integer.parseInt(rs4.getString("Student_score"));
                    double conv=(m1/100)*hr;
                   String sql5="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='Bio' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st5=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql5);
                st5.execute();
                 }
                 String sql5="select * from add_marks where examcode='"+tr+"' and sub_name='Phy' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st5=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql5);
                 ResultSet rs5=st5.executeQuery();
                 while(rs5.next()){
                      double  m1=Integer.parseInt(rs5.getString("Student_score"));
                    double conv=(m1/100)*hr;
                   String sql6="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='Phy' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st6=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql6);
                st6.execute();
                 }
                 String sql6="select * from add_marks where examcode='"+tr+"' and sub_name='Comp' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st6=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql6);
                 ResultSet rs6=st6.executeQuery();
                 while(rs6.next()){
                      double  m1=Integer.parseInt(rs6.getString("Student_score"));
                    double conv=(m1/100)*hr;
                   String sql7="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='Comp' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st7=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql7);
                st7.execute();
                 }
                 String sql7="select * from add_marks where examcode='"+tr+"' and sub_name='Bus' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st7=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql7);
                 ResultSet rs7=st7.executeQuery();
                 while(rs7.next()){
                      double  m1=Integer.parseInt(rs7.getString("Student_score"));
                    double conv=(m1/100)*hr;
                   String sql8="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='Bus' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st8=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql8);
                st8.execute();
                 }
                 String sql8="select * from add_marks where examcode='"+tr+"' and sub_name='Agri' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st8=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql8);
                 ResultSet rs8=st8.executeQuery();
                 while(rs8.next()){
                     double  m1=Integer.parseInt(rs8.getString("Student_score"));
                    double conv=(m1/100)*hr;
                   String sql9="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='Agri' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st9=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql9);
                st9.execute();
                 }
                 String sql9="select * from add_marks where examcode='"+tr+"' and sub_name='Hist' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st9=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql9);
                 ResultSet rs9=st9.executeQuery();
                 while(rs9.next()){
                    double m1=Integer.parseInt(rs9.getString("Student_score"));
                    double conv=(m1/100)*hr;
                   String sql10="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='Hist' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st10=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql10);
                st10.execute();
                 }
                 String sql10="select * from add_marks where examcode='"+tr+"' and sub_name='Geo' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st10=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql10);
                 ResultSet rs10=st10.executeQuery();
                 while(rs10.next()){
                      double  m1=Integer.parseInt(rs10.getString("Student_score"));
                    double conv=(m1/100)*hr;
                   String sql11="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='Geo' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st11=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql11);
                st11.execute();
                 }
                 String sql11="select * from add_marks where examcode='"+tr+"' and sub_name='C.R.E' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st11=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql11);
                 ResultSet rs11=st11.executeQuery();
                 while(rs11.next()){
                      double  m1=Integer.parseInt(rs11.getString("Student_score"));
                    double conv=(m1/100)*hr;
                   String sql12="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='C.R.E' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st12=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql12);
                st12.execute();
                 }
                  String sql12="select * from add_marks where examcode='"+tr+"' and sub_name='Music' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st12=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql12);
                 ResultSet rs12=st12.executeQuery();
                 while(rs12.next()){
                      double  m1=Integer.parseInt(rs12.getString("Student_score"));
                    double conv=(m1/100)*hr;
                   String sql13="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='Music' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st13=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql13);
                st13.execute();
                 }
                  String sql13="select * from add_marks where examcode='"+tr+"' and sub_name='HomeScience' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st13=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql13);
                 ResultSet rs13=st13.executeQuery();
                 while(rs13.next()){
                      double  m1=Integer.parseInt(rs13.getString("Student_score"));
                    double conv=(m1/100)*hr;
                   String sql14="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='HomeScience' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st14=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql14);
                st14.execute();
                 }
                  String sql14="select * from add_marks where examcode='"+tr+"' and sub_name='I.R.E' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st14=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql14);
                 ResultSet rs14=st14.executeQuery();
                 while(rs14.next()){
                     double  m1=Integer.parseInt(rs14.getString("Student_score"));
                    double conv=(m1/100)*hr;
                   String sql15="update add_marks set converted_score='"+conv+"' where examcode='"+tr+"' and sub_name='I.R.E' and Adm_no='"+adm+"'";
                 com.mysql.jdbc.PreparedStatement st15=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql15);
                st15.execute();
                 }
                 
                
                 
             }
         } catch (SQLException ex) {
            
         }
         
       
         
         }}
     } catch (SQLException ex) {
          
        }
  }
//  public void meG(){
//try {
//            // TODO add your handling code here:
//          ArrayList<Double> list1k=new ArrayList<Double>();  
//          list1k.clear();
//           ArrayList<String> list=new ArrayList<String>(); 
//           list.clear();;
//           list.add("Mat");
//           list.add("Eng");
//           list.add("Kis");
//           list.add("Bio");
//           list.add("Phy");
//           list.add("Chem");
//           list.add("His");
//           list.add("Geo");
//           list.add("CRE");
//           list.add("AGRI");
//           list.add("Comp");
//           list.add("Bus");
//           list.add("HS");
//           list.add("IRE");
//           list.add("Mus");
//           list.add("Tm");
//           list.add("kcpe");
//           double cpe=0;
//            String sql="Select * from subject_grade";
//            com.mysql.jdbc.PreparedStatement pst=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(sql);
//            ResultSet rs=pst.executeQuery();
//            
//            while(rs.next()){
//                
//                for(int i=2;i<26;i++){
//                    list1k.add(Double.parseDouble(rs.getString(i)));}
//                
//            }
//             System.out.println(list.size());
//            for(int i=0;i<list.size();i++){
//            double cc=0;
//            double cck=0;
//            String us=list.get(i);
//            
//             String sql1="Select avg("+us+") as steve from `meritmaker`";
//      
//            com.mysql.jdbc.PreparedStatement pst1=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(sql1);
//            ResultSet rs1=pst1.executeQuery();
//            
//            while(rs1.next()){
//               
//                cck=rs1.getDouble("steve");
//                
//                
//            }
//            if(us.equals("Tm")){
//            cc=Math.round((cck*12))/(100.0*Double.parseDouble(ent.getSelectedItem().toString())) ;
//            
//            } else if(us.equals("kcpe")){
//             cc=Math.round((cck*12))/(500.0) ;
//             cpe=Math.round((cck));
//            }
//            
//            else{
//            cc= Math.round((cck*12))/100.0;   
//            }
//            System.out.println(us);
//            
//             System.out.println(cc+">="+list1k.get(0));
//             System.out.println(cc+"<="+list1k.get(1));
//             System.out.println(cc);
//            if(cc>=list1k.get(0) && cc<=list1k.get(1)){
//                System.out.print("in");
//            String ri="Update av set grade='A',point='"+cc+"' where name ='"+us+"'";
//            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(ri);
//            pri.execute();
//            } else if(cc>=list1k.get(2) && cc<=list1k.get(3)){
//                if(us.equals("kcpe")){
//                cc=cpe;
//                }
//                 String ri="Update av set grade='A-',point='"+cc+"' where name ='"+us+"'";
//            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(ri);
//            pri.execute();
//            }
//            else if(cc>=list1k.get(4) && cc<=list1k.get(5)){
//                if(us.equals("kcpe")){
//                cc=cpe;
//                }
//               String ri="Update av set grade='B+',point='"+cc+"' where name ='"+us+"'";
//            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(ri);
//            pri.execute();
//            }
//            else if(cc>=list1k.get(6) && cc<=list1k.get(7)){
//                if(us.equals("kcpe")){
//                cc=cpe;
//                }
//             String ri="Update av set grade='B',point='"+cc+"' where name ='"+us+"'";
//            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(ri);
//            pri.execute();
//            }
//            else if(cc>=list1k.get(8) && cc<=list1k.get(9)){
//                if(us.equals("kcpe")){
//                cc=cpe;
//                }
//              String ri="Update av set grade='B-',point='"+cc+"' where name ='"+us+"'";
//            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(ri);
//            pri.execute();
//            }
//            else if(cc>=list1k.get(10) && cc<=list1k.get(11)){
//                if(us.equals("kcpe")){
//                cc=cpe;
//                }
//               String ri="Update av set grade='C+',point='"+cc+"' where name ='"+us+"'";
//            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(ri);
//            pri.execute();
//            }
//            else if(cc>=list1k.get(12) && cc<=list1k.get(13)){
//                if(us.equals("kcpe")){
//                cc=cpe;
//                }
//              String ri="Update av set grade='C',point='"+cc+"' where name ='"+us+"'";
//            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(ri);
//            pri.execute();
//            }
//            else if(cc>=list1k.get(14) && cc<=list1k.get(15)){
//                if(us.equals("kcpe")){
//                cc=cpe;
//                }
//              String ri="Update av set grade='C-',point='"+cc+"' where name ='"+us+"'";
//            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(ri);
//            pri.execute();
//            }
//            else if(cc>=list1k.get(16) && cc<=list1k.get(17)){
//                if(us.equals("kcpe")){
//                cc=cpe;
//                }
//             String ri="Update av set grade='D+',point='"+cc+"' where name ='"+us+"'";
//            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(ri);
//            pri.execute();
//            }
//            else if(cc>=list1k.get(18) && cc<=list1k.get(19)){
//                if(us.equals("kcpe")){
//                cc=cpe;
//                }
//              String ri="Update av set grade='D',point='"+cc+"' where name ='"+us+"'";
//            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(ri);
//            pri.execute();
//            }
//            else if(cc>=list1k.get(20) && cc<=list1k.get(21)){
//                if(us.equals("kcpe")){
//                cc=cpe;
//                }
//                String ri="Update av set grade='D-',point='"+cc+"' where name ='"+us+"'";
//            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(ri);
//            pri.execute();
//            }
//            else if(cc>=list1k.get(22) && cc<=list1k.get(23)){
//                if(us.equals("kcpe")){
//                cc=cpe;
//                }
//              String ri="Update av set grade='E',point='"+cc+"' where name ='"+us+"'";
//            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(ri);
//            pri.execute();
//            }
//            cc=0;
//            cck=0;
//            }
//        } catch (SQLException ex) {
//            
//        }
//}
//  public void genCP(){
//        try {
//          
//            String sqlf1="create or replace view meritlist as select *,rank() over (order by Tm DESC) as O_Pos from meritmaker";
//            com.mysql.jdbc.PreparedStatement stlf1= (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqlf1);
//            stlf1.execute();
//            
//            String sqlf2="create or replace view meritlists as select *,rank() over (order by Tm DESC) as C_Pos from meritlist ";
//            com.mysql.jdbc.PreparedStatement stlf2=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqlf2);
//            stlf2.execute();
//               
//            String sqlf4="create or replace view cmerit as select * from meritlists where form='Form: "+cls.getSelectedItem()+" Stream: "+stream.getSelectedItem()+"' ";
//            System.out.print(sqlf4);
//            com.mysql.jdbc.PreparedStatement stlf4=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqlf4);
//            stlf4.execute();
//            
//            String sqlf3="select adm,name,kcpe,concat(Mat,' ',maG) as Mat,concat(Kis,' ',KiG) as Kis ,concat(Bio,' ',BiG) as Bio ,concat(Phy,' ',phG) as Phy"
//                    + ",concat(chem,' ',chG) as Chem,concat(His,' ',HiG) as His,concat(Geo,' ',geG) as Geo,concat(CRE,' ',crG)as CRE ,concat(AGRI,' ',agG) as Agri" 
//                    + ",concat(Comp,' ',CoG) as Comp,concat(Bus,' ',bsG) as Bus,concat(HS,' ',hmG) as HS,concat(IRE,' ',irG) as IRE ,concat(Mus,' ',muG) as Mus"
//                    + ",`S.E`, `Tm`, `A.M`, `T.P`, `A.P`, `M.G`,`O_Pos`,`C_Pos`     from cmerit";
//            com.mysql.jdbc.PreparedStatement stlf3=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqlf3);
//            ResultSet rs1f=stlf3.executeQuery();
//            table.setModel(DbUtils.resultSetToTableModel(rs1f));
//            DefaultTableModel model=(DefaultTableModel) table.getModel();
//            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//            TableColumn column=table.getColumnModel().getColumn(1);
//            column.setPreferredWidth(200);
//            column.setMaxWidth(200);
//            column.setMinWidth(200);
//           
//           
//             
//            Statement stlf4y= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//            //String sd1="create view student details";
//            String sd2="DELETE FROM `meritmaker`";
//           // String sd4="create view cmerit as select * from meritlists";
//           // String sd3="drop view if exists meritlists";
//            
//           
//            conn.setAutoCommit(false);
//           // stlf4y.addBatch(sd1);
//            stlf4y.addBatch(sd2);
//            //stlf4y.addBatch(sd3);
//            // stlf4y.addBatch(sd4);
//            stlf4y.executeBatch();
//            conn.commit();
//            
//           
//        } catch (SQLException ex) {
//           
//        }
//  
//     
//  
//    }
  public int getPs(String grade){
 if(grade=="A"){
 return 12;
 }
 else if(grade=="A-"){
  return 11;
 }
 
 else if(grade=="B+"){
  return 10;
 }
 else if(grade=="B"){
  return 9;
 }
 else if(grade=="B-"){
  return 8;
 }
 else if(grade=="C+"){
  return 7;
 }
 else if(grade=="C"){
  return 6;
 }
 else if(grade=="C-"){
  return 5;
 }
 else if(grade=="D+"){
  return 4;
 }
 else if(grade=="D"){
  return 3;
 }
 else if(grade=="D-"){
  return 2;
 }
 else if(grade=="E"){
  return 1;
 }
 return 0;
  }
    public String getG(double cc,String sub){
    ArrayList<Integer> list1k=new ArrayList<>();
    list1k.clear();

            try {
                String sql="Select * from exam_grade where Subject='"+sub+"'";
                pst=conn.prepareCall(sql);
                rs=pst.executeQuery();
               
                while(rs.next()){
                    for(int i=2;i<26;i++){
                list1k.add(Integer.parseInt(rs.getString(i)));}
                
                }
                if(cc>=list1k.get(0) && cc<=list1k.get(1)){
                return "A";
                } else if(cc>=list1k.get(2) && cc<=list1k.get(3)){
            return "A-";
                            
            }
                 else if(cc>=list1k.get(4) && cc<=list1k.get(5)){
            return "B+";
                           
            }
                 else if(cc>=list1k.get(6) && cc<=list1k.get(7)){
           return "B";
                            
            }
                 else if(cc>=list1k.get(8) && cc<=list1k.get(9)){
            return "B-";
                           
            }
                 else if(cc>=list1k.get(10) && cc<=list1k.get(11)){
            return "C+";
                           
            }
                 else if(cc>=list1k.get(12) && cc<=list1k.get(13)){
            return "C";
                          
            }
                 else if(cc>=list1k.get(14) && cc<=list1k.get(15)){
            return "C-";
                           
            }
                 else if(cc>=list1k.get(16) && cc<=list1k.get(17)){
            return "D+";
                            
            }
                 else if(cc>=list1k.get(18) && cc<=list1k.get(19)){
            return "D";
                            
            }
                 else if(cc>=list1k.get(20) && cc<=list1k.get(21)){
           return "D-";
                            
            }
                 else if(cc>=list1k.get(22) && cc<=list1k.get(23)){
            return "E";
                            
            }
               
            } catch (SQLException ex) {
               
            }
      
      
      
return null;
    }
public void showInTable19(){
 ArrayList<String> list=new ArrayList<String>(); //list for Subjects
           list.clear();;
           list.add("Eng");
           list.add("Kisw");
           list.add("Math");
           list.add("Bio");
           list.add("Phy");
           list.add("Chem");
           list.add("Hist");
           list.add("Geo");
           list.add("C.R.E");
           list.add("Agri");
           list.add("Comp");
           list.add("Bus");
           list.add("HomeScience");
           list.add("I.R.E");
           list.add("Music");
         
           ArrayList<String> kl=new ArrayList<String>();
           ArrayList<Integer> kl1=new ArrayList<Integer>();
           ArrayList<Double> kl2=new ArrayList<Double>();
           ArrayList<String> kl3=new ArrayList<String>();
           ArrayList<String> k4=new ArrayList<String>();
           k4.clear();
           k4.add("Eng");
           k4.add("Kis");
           k4.add("Mat");
           k4.add("Bio");
           k4.add("Phy");
           k4.add("Chem");
           k4.add("His");
           k4.add("Geo");
           k4.add("CRE");
           k4.add("Agri");
           k4.add("Comp");
           k4.add("Bus");
           k4.add("HS");
           k4.add("IRE");
           k4.add("Mus");
           for(int i=0;i<jTable1.getRowCount();i++){
               if(jTable1.getValueAt(i, 0).equals(true)){
                   kl.add(jTable1.getValueAt(i, 1).toString());
                   
               }}
           String Jo="";
           String joined;
           for(int i=0;i<kl.size();i++){
               String j=" examcode =";
               joined=j+"'"+kl.get(i)+"' or ";
               Jo+=joined;
           }
           String adm="";
           String name="";
           String term="";
           String examname="";
           String stream = null;
           String form="";
           String kcpe="";
           String cl="";
           String stm="";
           String excode;
           excode=Jo.substring(0, Jo.length()-4);
           try {
               String sq="select * from add_marks where ("+excode+") and form='"+cls.getSelectedItem()+"'  GROUP BY Adm_no";
               System.out.println(sq);
               
               com.mysql.jdbc.PreparedStatement s=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sq);
               ResultSet r=s.executeQuery();
               while(r.next()){
                   adm=r.getString("Adm_no");
                   String sqk="Select surname,fname,lname,kcpe_marks,stream,form from student_registration where adm='"+adm+"'";
                   com.mysql.jdbc.PreparedStatement sk=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqk);
                   ResultSet rk=sk.executeQuery();
                   while(rk.next()){
                       name=rk.getString("surname")+" "+rk.getString("fname")+" "+rk.getString("lname");
                       form=rk.getString("form");
                       stream =rk.getString("stream");
                       kcpe=rk.getString("kcpe_marks");
                   }
                   
                   for(int i=0;i<list.size();i++){
                       
                       String sqhz1="select * from add_marks where ("+excode+") and sub_name='"+list.get(i)+"' and Adm_no='"+adm+"'";
                       com.mysql.jdbc.PreparedStatement sthz1=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqhz1);
                       ResultSet rshz1=sthz1.executeQuery();
                       if(!rshz1.isBeforeFirst() && rshz1.getRow()==0){System.out.println("am steve");
                       kl1.add(0);
                       kl2.add(0.0);
                       kl3.add("");
                       }else{
                           String sql="select *,sum(Converted_score) as co from add_marks where ("+excode+") and sub_name='"+list.get(i)+"' and Adm_no='"+adm+"'";
                           System.out.println(sql);
                           com.mysql.jdbc.PreparedStatement st=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
                           ResultSet rs=st.executeQuery();
                           while(rs.next()){
                              String  math=rs.getString("co");
                              int   m1=(int)Double.parseDouble(rs.getString("co"))*1;
                              String s1= getG(m1,list.get(i));
                              int p1=getPs(s1);
                         String sql9="Insert into add_marks values ('"+adm+"','"+form+"',"
                + "'"+stream+"','"+list.get(i)+"',"
                + "'"+math+"','0','"+s1+"','"+code1.getSelectedItem()+"','"+p1+"')";
              PreparedStatement  pst11=conn.prepareStatement(sql9);
                pst11.execute();
                 
                            
                               
                               
                           }}
                       
                   }
                   
                   
                   
                   
                   
               }
               
           } catch (SQLException ex) {
               
           }
    
     
   }
public String getPk(double cc){
    try {
            // TODO add your handling code here:
          ArrayList<Double> list1k=new ArrayList<Double>();  
          list1k.clear();
           
            String sql="Select * from subject_grade";
            com.mysql.jdbc.PreparedStatement pst=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(sql);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()){
                
                for(int i=2;i<26;i++){
                    list1k.add(Double.parseDouble(rs.getString(i)));}
                
            
             
            
            if(cc>=list1k.get(0) && cc<=list1k.get(1)){
               return "A";
            } else if(cc>=list1k.get(2) && cc<=list1k.get(3)){
                return "A-";
            }
            else if(cc>=list1k.get(4) && cc<=list1k.get(5)){
               return "B+";
            }
            else if(cc>=list1k.get(6) && cc<=list1k.get(7)){
            return "B";
            }
            else if(cc>=list1k.get(8) && cc<=list1k.get(9)){
                return "B-";
            }
            else if(cc>=list1k.get(10) && cc<=list1k.get(11)){
                return "C+";
            }
            else if(cc>=list1k.get(12) && cc<=list1k.get(13)){
              return "C";
            }
            else if(cc>=list1k.get(14) && cc<=list1k.get(15)){
                return "C-";
            }
            else if(cc>=list1k.get(16) && cc<=list1k.get(17)){
               return "D+";
            }
            else if(cc>=list1k.get(18) && cc<=list1k.get(19)){
             return "D";
            }
            else if(cc>=list1k.get(20) && cc<=list1k.get(21)){
               return "D-";
            }
            else if(cc>=list1k.get(22) && cc<=list1k.get(23)){
                return "E";
            }
            cc=0;
            }
        } catch (SQLException ex) {
       
        }
           return null;
   
   
   }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int sk=jTable1.getSelectedRow();
        if(jTable1.getValueAt(sk, 0).equals(true)){

            cnt.setText(jTable1.getValueAt(sk, 1).toString());

            setter.setText("0");
            jTable1.setValueAt(setter.getText(), sk, 2);

        }else{
            jTable1.setValueAt("0", sk, 2);
            cnt.setText("");
        }
        setter.setText("0");
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                try {
                    // TODO add your handling code here:
                    String sql="Select * from add_marks where `examcode`='"+code1.getSelectedItem()+"'";
                    com.mysql.jdbc.PreparedStatement pst=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(sql);
                    ResultSet rs=pst.executeQuery();
                    
                    int val=0;
                    for(int i=0;i<jTable1.getRowCount();i++){
                        if(jTable1.getValueAt(i, 0).equals(true)){
                            String tr=jTable1.getValueAt(i, 2).toString();
                            int hr=Integer.parseInt(tr);
                            val=hr+val;
                            
                        }}
                    
                    if(val>100 || val<100){
                        JOptionPane.showMessageDialog(null,"Sum should Total Up to 100");
                    }
                    else if(rs.getRow()>0 || rs.isBeforeFirst()){
                        JOptionPane.showMessageDialog(null, "Code is Used please Regester another one!!!");
                    }
                    else{
                        setConvert();
                        showInTable19();
                        JOptionPane.showMessageDialog(null, "Combined");
                    }   } catch (SQLException ex) {
                    Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_setterKeyReleased
        // TODO add your handling code here:
        int sk=jTable1.getSelectedRow();
        if(setter.getText().isEmpty()){
            jTable1.setValueAt("0", sk, 2);
        }else{

            if(jTable1.getValueAt(sk, 0).equals(true)){
                jTable1.setValueAt(setter.getText(), sk, 2);
            }
        }
    }//GEN-LAST:event_setterKeyReleased
public void year(){
           try {
               String sql="SELECT * FROM `exam_code` group by year";
               pst=conn.prepareStatement(sql);
               rs=pst.executeQuery();
               while(rs.next()){
                  ent3.addItem(rs.getString("year"));
                  year1.addItem(rs.getString("year"));
                   
               }       } catch (SQLException ex) {
               
           }
}
    public void setTablec(){
        DefaultTableModel k=(DefaultTableModel) jTable1.getModel();
        k.setRowCount(0);
        String s,y,t;
        s=cls.getSelectedItem().toString();
        y=ent3.getSelectedItem().toString();
       
        t=ent2.getSelectedItem().toString();
         try{
                if(!y.equals("Select") && !t.equals("Select") && !s.equals("Select")){
     String sql="SELECT * FROM `exam_code` where term='"+t+"' and year='"+y+"' and form='"+s+"'";
                    System.out.println(sql);
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
     k.addRow(new Object[]{false,rs.getString("code"),0});
      
   }}
                     else if(!y.equals("Select") && !s.equals("Select")){
     String sql="SELECT * FROM `exam_code` where year='"+y+"' and form='"+s+"'";
      System.out.println(sql);
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
     k.addRow(new Object[]{false,rs.getString("code"),0});
      
   }
   }
     else if(!y.equals("Select") && !t.equals("Select")){
     String sql="SELECT * FROM `exam_code` where year='"+y+"' and term='"+t+"'";
      System.out.println(sql);
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
     k.addRow(new Object[]{false,rs.getString("code"),0});
      
   }
   }
         else if(!s.equals("Select") && !t.equals("Select")){
     String sql="SELECT * FROM `exam_code` where form='"+s+"' and term='"+t+"'";
      System.out.println(sql);
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
     k.addRow(new Object[]{false,rs.getString("code"),0});
      
   }
   }
         else if(!s.equals("Select")){
                        
   String sql="SELECT * FROM `exam_code` where form='"+s+"'";
    System.out.println(sql);
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
     k.addRow(new Object[]{false,rs.getString("code"),0});
      
   }}else if(!y.equals("Select")){
     String sql="SELECT * FROM `exam_code` where year='"+y+"'";
      System.out.println(sql);
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
     k.addRow(new Object[]{false,rs.getString("code"),0});
      
   }
   }
        else if(!t.equals("Select")){
     String sql="SELECT * FROM `exam_code` where Term='"+t+"'";
      System.out.println(sql);
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
     k.addRow(new Object[]{false,rs.getString("code"),0});
      
   }
   }
   
    
   
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
       }
    }

    private void clsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_clsItemStateChanged
        // TODO add your handling code here:
        setTablec();
    }//GEN-LAST:event_clsItemStateChanged

    private void clsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsActionPerformed
        // TODO add your handling code here:

   

    }//GEN-LAST:event_clsActionPerformed

    private void ent2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ent2ItemStateChanged
        // TODO add your handling code here:
          setTablec();
    }//GEN-LAST:event_ent2ItemStateChanged

    private void ent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ent2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ent2ActionPerformed

    private void ent3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ent3ItemStateChanged
        // TODO add your handling code here:
          setTablec();
    }//GEN-LAST:event_ent3ItemStateChanged

    private void ent3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ent3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ent3ActionPerformed

    private void admKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_admKeyReleased
        // TODO add your handling code here:
        form();
        stream();
        names();
        tablelord();
    }//GEN-LAST:event_admKeyReleased

    private void admKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_admKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_admKeyTyped

    private void formItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_formItemStateChanged
        // TODO add your handling code here:
        tablelord();
        if(student_details.getRowCount()==0){
            adm.setText("");
            name_display.setText("");
        }else{
            adm.setText(student_details.getValueAt(0, 0).toString());
             name_display.setText(student_details.getValueAt(0, 1).toString()+" "+student_details.getValueAt(0, 2).toString());
            student_details.setRowSelectionAllowed(true);
            student_details.setColumnSelectionAllowed(false);
            student_details.addRowSelectionInterval(0, 0);
        }
         showMarks();
    }//GEN-LAST:event_formItemStateChanged
public void hpKeyReleased(java.awt.event.KeyEvent evt){
 if(evt.getKeyCode()==10){
     saveMarks();
           
        }
}
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
   hpKeyReleased(evt);
       
    }//GEN-LAST:event_formKeyPressed

    private void stream1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_stream1ItemStateChanged
        // TODO add your handling code here:
      tablelord();
        if(student_details.getRowCount()==0){
            adm.setText("");
            name_display.setText("");
        }else{
            adm.setText(student_details.getValueAt(0, 0).toString());
             name_display.setText(student_details.getValueAt(0, 1).toString()+" "+student_details.getValueAt(0, 2).toString());
            student_details.setRowSelectionAllowed(true);
            student_details.setColumnSelectionAllowed(false);
            student_details.addRowSelectionInterval(0, 0);
        }
         showMarks();
    }//GEN-LAST:event_stream1ItemStateChanged

    private void stream1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stream1KeyPressed
        // TODO add your handling code here:
        hpKeyReleased(evt);
    }//GEN-LAST:event_stream1KeyPressed

    private void subnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subnameKeyPressed
        // TODO add your handling code here:
        hpKeyReleased(evt);
    }//GEN-LAST:event_subnameKeyPressed

    private void converted_scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converted_scoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_converted_scoreActionPerformed

    private void student_scoreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_student_scoreKeyPressed
        // TODO add your handling code here:

       hpKeyReleased(evt);
    }//GEN-LAST:event_student_scoreKeyPressed

    private void student_scoreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_student_scoreKeyReleased
        ArrayList<Integer> list1k=new ArrayList<>();
        list1k.clear();

        if(student_score.getText().equals("")){
            converted_score.setText("");
            grade.setText("");
            points.setText("");
        }else{
            double sc=Double.parseDouble(student_score.getText());
            double of=Double.parseDouble(out_of.getText());
            double cc=(sc/of)*100;
            converted_score.setText(""+Math.round(cc));
            grade();

        }
        // TODO add your handling code here:
     
    }//GEN-LAST:event_student_scoreKeyReleased

    private void out_ofKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_out_ofKeyPressed
        // TODO add your handling code here:
        hpKeyReleased(evt);
    }//GEN-LAST:event_out_ofKeyPressed

    private void out_ofKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_out_ofKeyReleased
        if(out_of.getText().equals("")){
            converted_score.setText("");
            grade.setText("");
            points.setText("");
        }else{
            double sc=Double.parseDouble(student_score.getText());
            double of=Double.parseDouble(out_of.getText());
            double cc=(sc/of)*100;
            converted_score.setText(""+Math.round(cc));
            grade();}
    }//GEN-LAST:event_out_ofKeyReleased

    private void kGradientPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel3MouseClicked
 saveMarks();
    }//GEN-LAST:event_kGradientPanel3MouseClicked
public void saveMarks(){
 if(adm.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Select Student!!");
                }
   else if(exam_code.getSelectedItem().equals("Select Exam Code")){
                    JOptionPane.showMessageDialog(null, "Please Select Exam Code!!");
                }
   else if(student_score.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Fill Exam Score!!");
                }
  else if(out_of.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Fill Exam Out Off!!!");
                }
               else{
        try {
            String tin1 = "";
            String tin2="";
            String scode="";
            
            String sql13="select * from teacher_registration where email='"+au.getText()+"'";
            System.out.print(sql13);
            PreparedStatement pst13=conn.prepareStatement(sql13);
            ResultSet rs3=pst13.executeQuery();
            
            while(rs3.next()){
            tin1=rs3.getString("inn");
            }
                  String sql14="SELECT * FROM `subject` WHERE name='"+subname.getSelectedItem()+"' and class='"+form.getSelectedItem()+"'";
            PreparedStatement pst14=conn.prepareStatement(sql14);
            ResultSet rs4=pst14.executeQuery();
             while(rs4.next()){
           scode=rs4.getString("code");
            } 
                 String sql15="SELECT * FROM `teacher_subject` where code='"+scode+"'";
            PreparedStatement pst15=conn.prepareStatement(sql15);
            ResultSet rs5=pst15.executeQuery();
             while(rs5.next()){
            tin2=rs5.getString("teacher_name");
            }
            if(tin1.equals(tin2)){
            try {
                
                
                String sql1="SELECT * FROM `add_marks` where Adm_no='"+adm.getText()+"' and form='"+form.getSelectedItem()+"' and stream='"+stream1.getSelectedItem()+"' and sub_name='"+subname.getSelectedItem()+"' and examcode='"+exam_code.getSelectedItem()+"'";
                System.out.print(sql1);
                PreparedStatement pst1=conn.prepareStatement(sql1);
                ResultSet rs=pst1.executeQuery();
                
                // TODO add your handling code here:
              if(rs.getRow()>0 || rs.isBeforeFirst()){
                    if(JOptionPane.showConfirmDialog(null, "Record Already Exist. Do you Want to update!!")==JOptionPane.YES_NO_OPTION){
                        String sql="update add_marks set point='"+points.getText()+"' ,student_score='"+converted_score.getText()+"' ,grade='"+grade.getText()+"' where adm_no='"+adm.getText()+"'and form='"+form.getSelectedItem().toString()+"'and"
                                + " stream='"+stream1.getSelectedItem().toString()+"' and sub_name='"+subname.getSelectedItem().toString()+"'"
                                + " and examcode='"+exam_code.getSelectedItem()+"'";
                        System.out.print(sql);
                        pst=conn.prepareStatement(sql);
                        pst.execute();
                        showMarks();
                        JOptionPane.showMessageDialog(null, "Record Updated!!");
                         if(sellect==false){
             DefaultTableModel   model=(DefaultTableModel) student_details.getModel();
                sellect=true;
            }
            index=student_details.getSelectedRow();
            System.out.print(index);
            if(index==student_details.getRowCount()-1){
                student_details.setRowSelectionInterval(0, 0);
                
                 int rsi= student_details.getSelectedRow();

        adm.setText(student_details.getValueAt(rsi, 0).toString());
         name_display.setText(student_details.getValueAt(rsi, 1).toString()+" "+student_details.getValueAt(rsi, 2).toString());
            }else{
                if(index>=0){

                    student_details.setRowSelectionInterval(index+1, index+1);
                     int rsi= student_details.getSelectedRow();

        adm.setText(student_details.getValueAt(rsi, 0).toString());
         name_display.setText(student_details.getValueAt(rsi, 1).toString()+" "+student_details.getValueAt(rsi, 2).toString());
                }
            }
                    }else{    System.out.print("No");}
                    
                }
                
                else{
                    String sql="Insert into add_marks values ('"+adm.getText()+"','"+form.getSelectedItem().toString()+"',"
                            + "'"+stream1.getSelectedItem().toString()+"','"+subname.getSelectedItem().toString()+"',"
                            + "'"+converted_score.getText()+"','0','"+grade.getText()+"','"+exam_code.getSelectedItem()+"','"+points.getText()+"')";
                    pst=conn.prepareStatement(sql);
                    pst.execute();
                    showMarks();
                    JOptionPane.showMessageDialog(null, "Saved");  
               if(sellect==false){
             DefaultTableModel   model=(DefaultTableModel) student_details.getModel();
                sellect=true;
            }
            index=student_details.getSelectedRow();
            System.out.print(index);
            if(index==student_details.getRowCount()-1){
                student_details.setRowSelectionInterval(0, 0);
                
                 int rsi= student_details.getSelectedRow();

        adm.setText(student_details.getValueAt(rsi, 0).toString());
         name_display.setText(student_details.getValueAt(rsi, 1).toString()+" "+student_details.getValueAt(rsi, 2).toString());
            }else{
                if(index>=0){

                    student_details.setRowSelectionInterval(index+1, index+1);
                     int rsi= student_details.getSelectedRow();

        adm.setText(student_details.getValueAt(rsi, 0).toString());
         name_display.setText(student_details.getValueAt(rsi, 1).toString()+" "+student_details.getValueAt(rsi, 2).toString());
                }
            }
              }
                
            } catch (SQLException ex) {
                
            }}else{
            JOptionPane.showMessageDialog(null, "Sorry You can't Enter Marks For Other teachers Please Log in With their Details To enter Their Marks!!!!");
            }
        } catch (SQLException ex) {
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
           
        }}
}
    private void student_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_detailsMouseClicked
        // TODO add your handling code here:
        int rs= student_details.getSelectedRow();

        adm.setText(student_details.getValueAt(rs, 0).toString());
         name_display.setText(student_details.getValueAt(rs, 1).toString()+" "+student_details.getValueAt(rs, 2).toString());
    }//GEN-LAST:event_student_detailsMouseClicked

    private void student_detailsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_student_detailsKeyPressed
        // TODO add your handling code here:
 //hpKeyReleased(evt);
 

    }//GEN-LAST:event_student_detailsKeyPressed

    private void student_detailsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_student_detailsKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_UP ){
       
                     int rs= student_details.getSelectedRow();

        adm.setText(student_details.getValueAt(rs, 0).toString());
         name_display.setText(student_details.getValueAt(rs, 1).toString()+" "+student_details.getValueAt(rs, 2).toString());

        }
    }//GEN-LAST:event_student_detailsKeyReleased

    private void jPanel14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel14KeyPressed
        // TODO add your handling code here:
        hpKeyReleased(evt);
    }//GEN-LAST:event_jPanel14KeyPressed

    private void jPanel14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel14KeyReleased
        // TODO add your handling code here:
       hpKeyReleased(evt);
    }//GEN-LAST:event_jPanel14KeyReleased

    private void exam_codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exam_codeKeyPressed
        // TODO add your handling code here:
         hpKeyReleased(evt);
    }//GEN-LAST:event_exam_codeKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        try{
            String sqli="INSERT INTO `subject` VALUES('"+code.getText()+"','"+subject.getSelectedItem()+"','"+subject1.getSelectedItem()+"') ";
            pst=conn.prepareStatement(sqli);
pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Saved");

        }
        catch(Exception e){
               if(JOptionPane.showConfirmDialog(null, "This subject is regestered Do you wnt to update!!")==JOptionPane.YES_OPTION){
              String sqli1="UPDATE `subject` SET  `name`='"+subject.getSelectedItem()+"',`class`='"+subject1.getSelectedItem()+"' WHERE code='"+code.getText()+"'";
               
           PreparedStatement pst1;
                try {
                    pst1 = conn.prepareStatement(sqli1);
                    pst1.execute();
                } catch (SQLException ex) {
                    Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
                }

           
            JOptionPane.showMessageDialog(rootPane, "Record Updated");
            
            } 
        }
showinsubt();
code();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
      
         try{
            String sqli="INSERT INTO teacher_subject(`code`,`teacher_name`,class) VALUES(?,?,?) ";
            pst=conn.prepareStatement(sqli);

            pst=conn.prepareStatement(sqli);

            pst.setString(1, scodev.getSelectedItem().toString());
            pst.setString(2, teacher.getSelectedItem().toString());
            pst.setString(3, subject3.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Saved");

        }
        catch(Exception e){
            if(JOptionPane.showConfirmDialog(null, "This subject is regestered Do you wnt to update!!")==JOptionPane.YES_OPTION){
              String sqli1="UPDATE `teacher_subject` SET `teacher_name`='"+teacher.getSelectedItem()+"',`class`='"+subject3.getSelectedItem()+"' WHERE code='"+scodev.getSelectedItem()+"'";
               
           PreparedStatement pst1;
                try {
                    pst1 = conn.prepareStatement(sqli1);
                    pst1.execute();
                } catch (SQLException ex) {
                    Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
                }

           
            JOptionPane.showMessageDialog(rootPane, "Record Updated");
            }
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
         showinsub();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void p4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MouseClicked
        // TODO add your handling code here:
         // TODO add your handling code here:
         // TODO add your handling code here:
           homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();                       
       // homedesktop.add(img);
      
        homedesktop.add(add_marks);
        homedesktop.updateUI();
    }//GEN-LAST:event_p4MouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
    

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
       
              if(typo.getText().equals("ADMIN")){
        
   tsub1.setVisible(true);
    }else{
        JOptionPane.showMessageDialog(null, "This Areas are only accessed by admin please Sign in as admin");
       // TODO add your handling code here:
        // TODO add your handling code here:
          homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
      
        homedesktop.add(add_marks1);
       
    
    }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void btoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btoActionPerformed
public void checkEmpty(JTextField[] fie) throws SQLException{
    String Subject="";
    String form1 ="";
    String sql="select  `Subject` FROM `exam_grade`";
    PreparedStatement sk=conn.prepareStatement(sql);
    ResultSet rs=sk.executeQuery();
    while(rs.next()){
    Subject=rs.getString("Subject");
    
    
    
    if(Subject.equals(sub.getSelectedItem())&&form1.equals(sub.getSelectedItem())){
    
    JOptionPane.showMessageDialog(null, "Grades for "+Subject +"  Exist! Press the Update button to update ");
    }else{
    ArrayList<Integer> listi=new ArrayList<Integer>();
for(int i=0;i<fie.length;i++){
if(fie[i].getText().isEmpty()){
JOptionPane.showMessageDialog(null, "Please Fill All fields");
break;
}



}for(int i=0;i<fie.length;i++){

listi.add(Integer.parseInt(fie[i].getText()));
System.out.print(listi.get(i));

}

try{
             String sqli="INSERT INTO `exam_grade` values ('"+sub.getSelectedItem()+"','"+listi.get(0)+"','"+listi.get(1)+"','"+listi.get(2)+"','"+listi.get(3)+"','"+listi.get(4)+"','"+listi.get(5)+"','"+listi.get(6)+"','"+listi.get(7)+"','"+listi.get(8)+"','"+listi.get(9)+"','"+listi.get(10)+"','"+listi.get(11)+"','"+listi.get(12)+"','"+listi.get(13)+"','"+listi.get(14)+"','"+listi.get(15)+"','"+listi.get(16)+"','"+listi.get(17)+"','"+listi.get(18)+"','"+listi.get(19)+"','"+listi.get(20)+"','"+listi.get(21)+"','"+listi.get(22)+"','"+listi.get(23)+"') ";
           System.out.print(sqli);
           PreparedStatement st=conn.prepareStatement(sqli);
           st.execute();
        JOptionPane.showMessageDialog(rootPane, "Saved");
        listi.clear();
                 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
System.out.print(listi.get(23));
    }}
}
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            checkEmpty(new JTextField[]{afrom,ato,aminusfrom,aminusto,bplusfrom,bplusto,bfrom,bto,bminusfrom,bminusto,cplusfrom,cplusto,cfrom,cto,cminusfrom,cminusto,dplusfrom,dplusto,dfrom,dto,dminusfrom,dminusto,efrom,eto});
        } catch (SQLException ex) {
           
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        if(add_stream.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Fields cannot be empty!!");}
        else{
            try{
                String sqli="INSERT INTO `stream`(`stream_name`) VALUES(?) ";
                pst=conn.prepareStatement(sqli);

                pst=conn.prepareStatement(sqli);

                pst.setString(1, add_stream.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Saved");
showin();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
        addStream.setVisible(false);
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        // TODO add your handling code here:
      tsub.setVisible(false);
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        // TODO add your handling code here:
        tsub1.setVisible(false);
    }//GEN-LAST:event_jLabel41MouseClicked

    private void code1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_code1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_code1ItemStateChanged

    private void code1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_code1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_code1ActionPerformed

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        // TODO add your handling code here:
       tsub2.setVisible(false);
    }//GEN-LAST:event_jLabel42MouseClicked

    private void cls1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cls1ItemStateChanged
        // TODO add your handling code here:
     examcodeForGenerateResult();
     
     
    }//GEN-LAST:event_cls1ItemStateChanged

    private void cls1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cls1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cls1ActionPerformed

    private void stream2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stream2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_stream2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
           
                       

             final JDialog d = new JDialog();
        JPanel p1 = new JPanel(new GridBagLayout());
        
        p1.setBackground(new Color(64,43,100));
        JLabel nm=new JLabel(" Preparing printing,Please Wait...");
        nm.setForeground(Color.white);
        p1.add(nm,new GridBagConstraints());
        d.getContentPane().add(p1);
        
        d.setSize(300,50);
        d.setLocationRelativeTo(this.getRootPane());
        d.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        d.setModal(true);
         d.setUndecorated(true);
    
         
           Thread t = new Thread(){
          public void run(){
           
              SwingUtilities.invokeLater(new Runnable(){//do swing work on EDT
                public void run(){
                                         
               InputStream path=getClass().getResourceAsStream("/report/steve.jasper");

                        try {
                            Connection conn=(Connection) newdb.ConnectDb();
                            //JasperDesign report=JRXmlLoader.load(new File(""));
                            
                             JasperReport report=(JasperReport)JRLoader.loadObject(path);
            JasperPrint prn=JasperFillManager.fillReport(report,null,conn);
             
            
                
                 d.setModal(false);
                  
             JasperViewer view=new    JasperViewer(prn,false);
            view.setVisible(true);
            conn.close();
               
           
           
        } catch (JRException ex) {
           
        }   
        catch (SQLException ex) {
                   Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
               }       
                }
              });
              try
              {
                Thread.sleep(1000);
              }
              catch (InterruptedException e) {e.printStackTrace();}
            
            SwingUtilities.invokeLater(new Runnable(){//do swing work on EDT
              public void run(){
                d.dispose();
               
              }
            });
          }
        };
        t.start();
        d.setVisible(true);
                        
               
          
       
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      tsub2.setSize(601,391);
        tsub2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 
        final JDialog d = new JDialog();
        JPanel p1 = new JPanel(new GridBagLayout());
        p1.setBackground(new Color(64,43,100));
       
        JLabel nm=new JLabel("Preparing printing, Please Wait...");
        nm.setForeground(Color.white);
        p1.add(nm,new GridBagConstraints());
        d.getContentPane().add(p1);
        
        d.setSize(300,50); 
        d.setLocationRelativeTo(this.getRootPane());
        d.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        d.setModal(true);
         d.setUndecorated(true);
    
        
           Thread t = new Thread(){
          public void run(){
              SwingUtilities.invokeLater(new Runnable(){//do swing work on EDT
                public void run(){
                 InputStream path=getClass().getResourceAsStream("/reportform/reportform.jasper");

                        try {
                            Connection conn=(Connection) newdb.ConnectDb();
                            //JasperDesign report=JRXmlLoader.load(new File(""));
                            
                             JasperReport report=(JasperReport)JRLoader.loadObject(path);
                          JasperPrint  prn=JasperFillManager.fillReport(report,null,conn);
                        d.setModal(false);
                              
                              
                            JasperViewer.viewReport(prn,false);
                            conn.close();
                        } catch (JRException ex) {
                            
                        } 
                        catch (SQLException ex) {
                            
                        }
                        
                }
              });
              try
              {
                Thread.sleep(1000);
              }
              catch (InterruptedException e) {e.printStackTrace();}
            
            SwingUtilities.invokeLater(new Runnable(){//do swing work on EDT
              public void run(){
                d.dispose();
               
              }
            });
          }
        };
        t.start();
        d.setVisible(true); 
                       
                 
   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
      
             final JDialog d = new JDialog();
        JPanel p1 = new JPanel(new GridBagLayout());
       
        p1.setBackground(new Color(64,43,100));
        JLabel nm=new JLabel("Generating results, Please Wait...");
        nm.setForeground(Color.white);
        p1.add(nm,new GridBagConstraints());
        d.getContentPane().add(p1);
        
        d.setSize(300,50);
        d.setLocationRelativeTo(this.getRootPane());
        d.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        d.setModal(true);
         d.setUndecorated(true);
    
         
           Thread t = new Thread(){
          public void run(){
           
              SwingUtilities.invokeLater(new Runnable(){//do swing work on EDT
                public void run(){
                                            
               showInTable12();
                }
              });
              try
              {
                Thread.sleep(1000);
              }
              catch (InterruptedException e) {e.printStackTrace();}
            
            SwingUtilities.invokeLater(new Runnable(){//do swing work on EDT
              public void run(){
              d.setVisible(false);
               
              }
            });
          }
        };
        t.start();
         d.setVisible(true);
                        
               
          

       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void year1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_year1ItemStateChanged
        // TODO add your handling code here:
     examcodeForGenerateResult();
    }//GEN-LAST:event_year1ItemStateChanged

    private void year1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year1ActionPerformed

    private void term1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_term1ItemStateChanged
        // TODO add your handling code here:
      examcodeForGenerateResult();
    }//GEN-LAST:event_term1ItemStateChanged

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
         // TODO add your handling code here:
         // TODO add your handling code here:
         // TODO add your handling code here:
                    if(typo.getText().equals("ADMIN")){
        
    addStream.add(addSt);
        addStream.setVisible(true);
        addStream.setSize(380, 280);
    }else{
        JOptionPane.showMessageDialog(null, "This Areas are only accessed by admin please Sign in as admin");
       // TODO add your handling code here:
        // TODO add your handling code here:
          homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
      
        homedesktop.add(add_marks1);
       
    
    }
        
          
    }//GEN-LAST:event_jMenu6MouseClicked

    private void code12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_code12MouseClicked
        // TODO add your handling code here:
        examcodeForGenerateResult();
    }//GEN-LAST:event_code12MouseClicked

    private void subject3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subject3MouseClicked
        // TODO add your handling code here:
           try{
            String sqli="Select * from subject where class='"+subject3.getSelectedItem().toString()+"' ";
            pst=conn.prepareStatement(sqli);
            ResultSet rs=pst.executeQuery();
        scodev.removeAllItems();
          while(rs.next()){
          
          scodev.addItem(rs.getString("code"));
          }
           

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }  
      
        
    }//GEN-LAST:event_subject3MouseClicked

    private void subject3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subject3ItemStateChanged
        // TODO add your handling code here:
            try{
            String sqli="Select * from subject where class='"+subject3.getSelectedItem().toString()+"' ";
            pst=conn.prepareStatement(sqli);
            ResultSet rs=pst.executeQuery();
        scodev.removeAllItems();
          while(rs.next()){
          
          scodev.addItem(rs.getString("code"));
          }
           

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } 
    }//GEN-LAST:event_subject3ItemStateChanged

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        // TODO add your handling code here:
        addTeacher();
    }//GEN-LAST:event_teacherActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
       if(JOptionPane.showConfirmDialog(null, "Are you sure you want to delete!!!")==JOptionPane.YES_OPTION){
             try{
            String sqli="delete from teacher_subject where code='"+scodev.getSelectedItem()+"'";
            pst=conn.prepareStatement(sqli);
       pst.execute();
       showinsub();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }} 
    }//GEN-LAST:event_jButton9ActionPerformed

    public void showinsub(){
                try{
            String sqli="Select * from teacher_subject";
            pst=conn.prepareStatement(sqli);
            ResultSet rs=pst.executeQuery();
     subReg.setModel(DbUtils.resultSetToTableModel(rs));
           

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } 
    
    }
    private void jLabel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseClicked
        // TODO add your handling code here:
     tsub3.setVisible(false);
    }//GEN-LAST:event_jLabel63MouseClicked

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c4ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c3ActionPerformed

    private void c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c8ActionPerformed

    private void c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c7ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c6ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c5ActionPerformed

    private void c12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c12ActionPerformed

    private void c11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c11ActionPerformed

    private void c10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c10ActionPerformed

    private void c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
            if(c1.getText().isEmpty() || c2.getText().isEmpty() || c3.getText().isEmpty() || c4.getText().isEmpty()
                    || c5.getText().isEmpty() || c6.getText().isEmpty() || c7.getText().isEmpty() || c8.getText().isEmpty()
                    ||c9.getText().isEmpty() || c10.getText().isEmpty() || c11.getText().isEmpty() || c12.getText().isEmpty()
                    
                    )    {
            JOptionPane.showMessageDialog(null, "Please Fill All Fields!!");
            }else{
        
        try {
                    // TODO add your handling code here:
                    String ri="UPDATE `comment` SET `A`='"+c1.getText()+"',"
                            + "`Aminus`='"+c2.getText()+"',`B`='"+c3.getText()+"',`Bplus`='"+c4.getText()+"',`Bminus`='"+c5.getText()+"',`C`='"+c6.getText()+"',"
                            + "`Cplus`='"+c7.getText()+"',`Cminus`='"+c8.getText()+"',"
                            + "`D`='"+c9.getText()+"',`Dplus`='"+c10.getText()+"',`Dminus`='"+c11.getText()+"',`E`='"+c12.getText()+"' WHERE name='"+lang.getSelectedItem()+"'";
                    com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(ri);
                    pri.execute();
                     JOptionPane.showMessageDialog(null, "Record Saved");
                } catch (SQLException ex) {
                    Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
                }}
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        
                     if(typo.getText().equals("ADMIN")){
        
 tsub3.setVisible(true);
    }else{
        JOptionPane.showMessageDialog(null, "This Areas are only accessed by admin please Sign in as admin");
       // TODO add your handling code here:
        // TODO add your handling code here:
          homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
      
        homedesktop.add(add_marks1);
       
    
    }
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
         // TODO add your handling code here:
        homedesktop.removeAll();
        homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
         
        homedesktop.add(regSubGrade);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void adm1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adm1KeyReleased
        // TODO add your handling code here:
admKeyReleased();
    }//GEN-LAST:event_adm1KeyReleased

    private void kGradientPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel9MouseClicked
        // TODO add your handling code here:
        if( adm1.getText().isEmpty() || surname.getText().isEmpty() ||adm_date.getText().isEmpty() || fname.getText().isEmpty()||lname.getText().isEmpty()||dob.getText().isEmpty()||birth_cert_no.getText().isEmpty()||kcpe_marks.getText().isEmpty() ||parent.getText().isEmpty()||telephone.getText().isEmpty()||alternative_telephone.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Fields cannot be empty!!");}
        else{
            try{
                 list.clear();
                getSelected();
        
        String no="";
        for(int i=0;i<list.size();i++){
        if(list.get(i).equals("0")){
      
        no+="Math"+" ";
        }else  if(list.get(i).equals("1")){
        
        no+="Eng"+" ";
        }else  if(list.get(i).equals("2")){
      
        no+="Kisw"+" ";
        }else  if(list.get(i).equals("3")){
      
        no+="Hist"+" ";
        }else  if(list.get(i).equals("4")){
      
        no+="C.R.E"+" ";
        }else  if(list.get(i).equals("5")){
      
        no+="Geo"+" ";
        }else  if(list.get(i).equals("6")){
      
        no+="HomeScience"+" ";
        }else  if(list.get(i).equals("7")){
      
        no+="Chem"+" ";
        }else  if(list.get(i).equals("8")){
      
        no+="I.R.E"+" ";
        }else  if(list.get(i).equals("9")){
      
        no+="Agri"+" ";
        }else  if(list.get(i).equals("10")){
      
        no+="Bus"+" ";
        }else  if(list.get(i).equals("11")){
      
        no+="Comp"+" ";
        }else  if(list.get(i).equals("12")){
      
        no+="Phy"+" ";
        }else  if(list.get(i).equals("13")){
      
        no+="Bio"+" ";
        }
        else  if(list.get(i).equals("14")){
      
        no+="Music"+" ";
        }
          
         
       
        }
        System.out.println(no);
                String sqli="INSERT INTO `student_registration`(`adm`, `surname`, `gender`, `adm_date`, `fname`, `lname`, `dob`, `stream`, `form`, `birth_cert_no`, `kcpe_marks`, `house`, `religion`, `parent`, `telephone`, `alternative_telephone`, `border_day`, `photo`, `subjects`, `entries`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
                pst=conn.prepareStatement(sqli);

                pst=conn.prepareStatement(sqli);

                pst.setString(1, adm1.getText());
                pst.setString(2, surname.getText());
                pst.setString(3, gender.getSelectedItem().toString());
                pst.setString(4, adm_date.getText());
                pst.setString(5, fname.getText());
                pst.setString(6, lname.getText());
                pst.setString(7, dob.getText());
                pst.setString(8, streamb.getSelectedItem().toString());
                pst.setString(9, formb.getSelectedItem().toString());
                pst.setString(10, birth_cert_no.getText());
                pst.setString(11, kcpe_marks.getText());
                pst.setString(12, house.getSelectedItem().toString());
                pst.setString(13, religion.getSelectedItem().toString());
                pst.setString(14, parent.getText());
                pst.setString(15, telephone.getText());
                pst.setString(16, alternative_telephone.getText());
                pst.setString(17, border_day.getSelectedItem().toString());
                pst.setBytes(18,image);
                pst.setString(19, no);
                pst.setInt(20, list.size());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Saved");

            }
            catch(Exception e){
                System.out.println(e.getMessage());
                if(e.getMessage().equals("Duplicate entry '"+adm1.getText()+"' for key 'adm'")){
                if(JOptionPane.showConfirmDialog(null, "Record already exisits, Do you want to update")==JOptionPane.YES_OPTION){
                    try {
                list.clear();
                getSelected();
        
        String no="";
        for(int i=0;i<list.size();i++){
        if(list.get(i).equals("0")){
      
        no+="Math"+" ";
        }else  if(list.get(i).equals("1")){
        
        no+="Eng"+" ";
        }else  if(list.get(i).equals("2")){
      
        no+="Kisw"+" ";
        }else  if(list.get(i).equals("3")){
      
        no+="Hist"+" ";
        }else  if(list.get(i).equals("4")){
      
        no+="C.R.E"+" ";
        }else  if(list.get(i).equals("5")){
      
        no+="Geo"+" ";
        }else  if(list.get(i).equals("6")){
      
        no+="HomeScience"+" ";
        }else  if(list.get(i).equals("7")){
      
        no+="Chem"+" ";
        }else  if(list.get(i).equals("8")){
      
        no+="I.R.E"+" ";
        }else  if(list.get(i).equals("9")){
      
        no+="Agri"+" ";
        }else  if(list.get(i).equals("10")){
      
        no+="Bus"+" ";
        }else  if(list.get(i).equals("11")){
      
        no+="Comp"+" ";
        }else  if(list.get(i).equals("12")){
      
        no+="Phy"+" ";
        }else  if(list.get(i).equals("13")){
      
        no+="Bio"+" ";
        }
        else  if(list.get(i).equals("14")){
      
        no+="Music"+" ";
        }
         
       
        }
                        String sqli="UPDATE `student_registration` SET "
                                + "`surname`='"+surname.getText()+"',`gender`='"+gender.getSelectedItem().toString()+"',`adm_date`='"+adm_date.getText()+"',"
                                + "`fname`='"+fname.getText()+"',`lname`='"+lname.getText()+"',`dob`='"+dob.getText()+"',"
                                + "`stream`='"+streamb.getSelectedItem().toString()+"',`form`='"+formb.getSelectedItem().toString()+"',`birth_cert_no`='"+birth_cert_no.getText()+"',"
                                + "`kcpe_marks`='"+kcpe_marks.getText()+"',`house`='"+house.getSelectedItem().toString()+"',`religion`='"+religion.getSelectedItem().toString()+"',"
                                + "`parent`='"+parent.getText()+"',`telephone`='"+telephone.getText()+"',"
                                + "`alternative_telephone`='"+alternative_telephone.getText()+"',`border_day`='"+border_day.getSelectedItem().toString()+"',`photo`=? , `subjects`='"+no+"', entries='"+list.size()+"'WHERE `student_registration`.`adm`='"+adm1.getText()+"'";
                
                    
                        pst=conn.prepareStatement(sqli);
                        pst.setBytes(1, image);
                        System.out.println(sqli);
                        pst.execute();
                        String sqli1="update add_marks set `stream`='"+streamb.getSelectedItem().toString()+"' WHERE `Adm_no`='"+adm1.getText()+"'";
                        PreparedStatement pst1=conn.prepareStatement(sqli1);
                        pst1.executeUpdate();
                        JOptionPane.showMessageDialog(rootPane, " Record, Updated");
                    } catch (SQLException ex) {
                        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }else{
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    }}}
    }//GEN-LAST:event_kGradientPanel9MouseClicked

    private void religionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_religionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_religionActionPerformed

    private void kGradientPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel11MouseClicked
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        ImageIcon ImageIcon=new ImageIcon (new ImageIcon (filename).getImage().getScaledInstance(lblimg.getWidth(),lblimg.getHeight(), Image.SCALE_SMOOTH));
        lblimg.setIcon(ImageIcon);
        try{
            File image0=new File (filename);
            FileInputStream fis=new FileInputStream(image0);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum; (readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
            image=person_image;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "e");
        }
    }//GEN-LAST:event_kGradientPanel11MouseClicked

    private void p6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MouseClicked

  if(typo.getText().equals("ADMIN")){
        
      
        homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();                       
       // homedesktop.add(img);
      
        homedesktop.add(treg1);
        homedesktop.updateUI();
    }else{
        JOptionPane.showMessageDialog(null, "This Areas are only accessed by admin please Sign in as admin");
       // TODO add your handling code here:
        // TODO add your handling code here:
          homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
      
        homedesktop.add(add_marks1);
       
    
    }
        // TODO add your handling code here:
      
    }//GEN-LAST:event_p6MouseClicked

    private void kGradientPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_kGradientPanel14MouseClicked

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        if(exam_name1.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Fields cannot be empty!!");}
        else{
            try{
                String sqli="INSERT INTO `exam_name`(`name`) VALUES(?) ";
                pst=conn.prepareStatement(sqli);

                pst=conn.prepareStatement(sqli);

                pst.setString(1, exam_name1.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Saved");
                showENTable();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void term2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_term2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_term2ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here
        if(exam_name2.getSelectedItem().equals("Select Exam Name")){
        JOptionPane.showMessageDialog(null, "Select Exam name");
        
        }else{
        String clas=form2.getSelectedItem().toString();
        String termm=term2.getSelectedItem().toString();
        String yearr=year2.getSelectedItem().toString();
        String ename=exam_name2.getSelectedItem().toString();
        String examcode="Form"+clas+"Term"+termm+yearr+ename;

        try{
            String sqli="INSERT INTO `exam_code`(`code`,name,year,term,form) VALUES(?,?,?,?,?) ";
            pst=conn.prepareStatement(sqli);

            pst=conn.prepareStatement(sqli);

            pst.setString(1, examcode);
              pst.setString(2, ename);
                pst.setString(3, yearr);
                  pst.setString(4, "Term "+termm);
                    pst.setString(5, clas);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Saved");
exac();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
        }
    }//GEN-LAST:event_jButton23ActionPerformed
   public void exac(){
                                         try{
   String sql="SELECT `code` FROM `exam_code`";
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
  jTable4.setModel(DbUtils.resultSetToTableModel(rs));
   
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
       }
    
    }
    private void exam_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exam_name1ActionPerformed
        // TODO add your handling code here:
          try {
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete?")==JOptionPane.YES_OPTION){
        // TODO add your handling code here:
        String sqli="DELETE FROM exam_name WHERE name='"+exam_name1.getText()+"'";
                pst=conn.prepareStatement(sqli);
                pst.execute();
            JOptionPane.showMessageDialog(null,"Deleted From Record");
            
           exam_name1.setText("");
            showENTable();
        } 
    } catch (SQLException ex) {
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_exam_name1ActionPerformed
public void showENTable(){
    try{
 String sqli="Select * from `exam_name`";
        pst=conn.prepareStatement(sqli);
        ResultSet rs=pst.executeQuery();
        jTable2.setModel(DbUtils.resultSetToTableModel(rs));}catch(Exception ex){
        
        }
}
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
       
        if( security_code.getText().isEmpty()  ){
            JOptionPane.showMessageDialog(null, "Fields cannot be empty!!");}
        else{
            try{
                String sql="insert into admin_security_code  (security_code) VALUES(?) ";
                pst=conn.prepareStatement(sql);

                pst=conn.prepareStatement(sql);

                pst.setString(1, security_code.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Saved");

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void exam_name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exam_name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exam_name2ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
       if(exam_name2.getSelectedItem().equals("Select Exam Name")){
        JOptionPane.showMessageDialog(null, "Select Exam name");
        
        }else{  // TODO add your handling code here:
         String clas=form2.getSelectedItem().toString();
        String termm=term2.getSelectedItem().toString();
        String yearr=year2.getSelectedItem().toString();
        String ename=exam_name2.getSelectedItem().toString();
        String examcode="Form"+clas+"Term"+termm+yearr+ename;
          try {
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete?")==JOptionPane.YES_OPTION){
        // TODO add your handling code here:
        String sqli="DELETE FROM `exam_code` WHERE code='"+examcode+"'";
                pst=conn.prepareStatement(sqli);
                pst.execute();
            JOptionPane.showMessageDialog(null,"Deleted From Record");
           exac();
        } 
    } catch (SQLException ex) {
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }}
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        // TODO add your handling code here:
        tsub5.setVisible(false);
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        // TODO add your handling code here:
        tsub6.setVisible(false);
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        // TODO add your handling code here:
        tsub7.setVisible(false);
        
    }//GEN-LAST:event_jLabel47MouseClicked
public void scnkr(String name){
    try {
        String sql1="select * from school where name = '"+name+"'";
        System.out.println(sql1);
        PreparedStatement pst1=conn.prepareStatement(sql1);
        ResultSet rs=pst1.executeQuery();
        if(rs.next()){
    school_name2.setText(rs.getString(1));
    address.setText(rs.getString(3));
     motto.setText(rs.getString(2));
    vision.setText(rs.getString(5));
     mission.setText(rs.getString(6));
  byte[] filename= rs.getBytes(4);

       image=filename;
      ImageIcon ImageIcon=new ImageIcon (new ImageIcon (filename).getImage().getScaledInstance(lblimg3.getWidth(),lblimg3.getHeight(), Image.SCALE_SMOOTH));
        lblimg3.setIcon(ImageIcon); 

    }else{
          address.setText("");
            motto.setText("");
            mission.setText("");
            vision.setText("");
            ImageIcon m=new ImageIcon("");
            lblimg3.setIcon(m);
        }
    } catch (SQLException ex) {
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }
          

}
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
    try {
        if(JOptionPane.showConfirmDialog(null, "This System Allows Single School Registration,Be sure if there is any other school record will be deleted, Do you Wnt to continue?")==JOptionPane.YES_OPTION){
          String sql1="DELETE FROM `school`";
           PreparedStatement pst1=conn.prepareStatement(sql1);
          pst1.execute();
          
         
        // TODO add your handling code here:
        String sql="INSERT INTO `school`(`Name`, `Motto`, `address`, `logo`, `vision`, `mission`, `dkey`)"
                + " VALUES ('"+school_name2.getText()+"','"+motto.getText()+"','"+address.getText()+"',?,'"+vision.getText()+"','"+mission.getText()+"','1')";
        pst=conn.prepareStatement(sql);
        pst.setBytes(1,image);
       pst.execute();
        JOptionPane.showMessageDialog(null,"Record Saved");
        showtb();}
    } catch (SQLException ex) {
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
    try {
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete?")==JOptionPane.YES_OPTION){
        // TODO add your handling code here:
        String sqli="DELETE FROM school WHERE dkey=1";
                pst=conn.prepareStatement(sqli);
                pst.execute();
            JOptionPane.showMessageDialog(null,"Deleted From Record");
            school_name2.setText("");
            motto.setText("");
            mission.setText("");
            vision.setText("");
            ImageIcon m=new ImageIcon("");
            lblimg3.setIcon(m);
        } 
    } catch (SQLException ex) {
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    }//GEN-LAST:event_jButton29ActionPerformed

    private void stbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stbMouseClicked
        // TODO add your handling code here:
         scnkr(stb.getValueAt(0, 0).toString());
    }//GEN-LAST:event_stbMouseClicked

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
              JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        ImageIcon ImageIcon=new ImageIcon (new ImageIcon (filename).getImage().getScaledInstance(lblimg3.getWidth(),lblimg3.getHeight(), Image.SCALE_SMOOTH));
        lblimg3.setIcon(ImageIcon);
        try{
            File image0=new File (filename);
            FileInputStream fis=new FileInputStream(image0);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum; (readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
            image=person_image;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "e");
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void p5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseClicked
        if(typo.getText().equals("ADMIN")){
        
           homedesktop.removeAll();
        homedesktop.repaint();
        homedesktop.revalidate();
        // homedesktop.add(img);

        homedesktop.add(Gr);
        homedesktop.updateUI();
    }else{
        JOptionPane.showMessageDialog(null, "This Areas are only accessed by admin please Sign in as admin");
       // TODO add your handling code here:
        // TODO add your handling code here:
          homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
      
        homedesktop.add(add_marks1);
       
    
    }
        
// TODO add your handling code here:
      
   
    }//GEN-LAST:event_p5MouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        // TODO add your handling code here:
        try{
       
                if(  surname2.getText().isEmpty() || fname2.getText().isEmpty()||lname2.getText().isEmpty()||inn.getText().isEmpty()||idno.getText().isEmpty()||tscno.getText().isEmpty()||email.getText().isEmpty()||phone.getText().isEmpty() ||password.getText().isEmpty() ){
                    JOptionPane.showMessageDialog(null, "Fields cannot be empty!!");}
                else{
                    try{
                        String sqli="insert into teacher_registration  (surname,fname,lname,inn,idno,tscno,email,phone,password,type) VALUES(?,?,?,?,?,?,?,?,?,?) ";
                        pst=conn.prepareStatement(sqli);

                        pst=conn.prepareStatement(sqli);

                        pst.setString(1, surname2.getText());
                        pst.setString(2, fname2.getText());
                        pst.setString(3, lname2.getText());
                        pst.setString(4, inn.getText());
                        pst.setString(5, idno.getText());
                        pst.setString(6, tscno.getText());
                        pst.setString(7, email.getText());
                        pst.setString(8, phone.getText());
                        pst.setString(9, password.getText());
                        pst.setString(10, type.getSelectedItem().toString());
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(rootPane, "Saved");

                    }
                    catch(Exception e){
                      if(JOptionPane.showConfirmDialog(null, "Record With TSCNO "+tscno.getText()+" Already exists! Do you want to update The record!!")==JOptionPane.YES_OPTION){
                          String sqli="UPDATE `teacher_registration` SET `surname`=?,"
                                  + "`fname`=?,`lname`=?,`inn`=?,`idno`=?,"
                                  + "`tscno`=?,`email`=?,"
                                  + "`phone`=?,`password`=?,`type`=? WHERE `tscno`='"+tscno.getText()+"'";
                        pst=conn.prepareStatement(sqli);

                        pst=conn.prepareStatement(sqli);

                        pst.setString(1, surname2.getText());
                        pst.setString(2, fname2.getText());
                        pst.setString(3, lname2.getText());
                        pst.setString(4, inn.getText());
                        pst.setString(5, idno.getText());
                        pst.setString(6, tscno.getText());
                        pst.setString(7, email.getText());
                        pst.setString(8, phone.getText());
                        pst.setString(9, password.getText());
                        pst.setString(10, type.getSelectedItem().toString());
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(rootPane, "Saved");
                        tinTable();
                      }
                    }

                }

            
          

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
tinTable();
    }//GEN-LAST:event_saveMouseClicked
public void tinTable(){
        try{
 String sqli="Select * from `teacher_registration`";
        pst=conn.prepareStatement(sqli);
        ResultSet rs=pst.executeQuery();
        sdetails3.setModel(DbUtils.resultSetToTableModel(rs));}catch(Exception ex){
        
        }

}
    private void p7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MouseClicked
       if(typo.getText().equals("ADMIN")){
        
       
        homedesktop.removeAll();
        homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
         
        homedesktop.add(treg3);
    }else{
        JOptionPane.showMessageDialog(null, "This Areas are only accessed by admin please Sign in as admin");
       // TODO add your handling code here:
        // TODO add your handling code here:
          homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
      
        homedesktop.add(add_marks1);
       
    
    }
        // TODO add your handling code here:
       
    }//GEN-LAST:event_p7MouseClicked

    private void tbuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbuMouseClicked

    private void sdetails3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sdetails3MouseClicked
        // TODO add your handling code here:
        
        int sele=sdetails3.getSelectedRow();
        tscno.setText(sdetails3.getValueAt(sele, 6).toString());
        surname2.setText(sdetails3.getValueAt(sele, 1).toString());
        fname2.setText(sdetails3.getValueAt(sele, 2).toString());
        lname2.setText(sdetails3.getValueAt(sele, 3).toString());
        inn.setText(sdetails3.getValueAt(sele, 4).toString());
        idno.setText(sdetails3.getValueAt(sele, 5).toString());
        
        email.setText(sdetails3.getValueAt(sele, 7).toString());
        phone.setText(sdetails3.getValueAt(sele, 8).toString());
        password.setText(sdetails3.getValueAt(sele, 9).toString());
        type.setSelectedItem(sdetails3.getValueAt(sele, 10).toString());  
    }//GEN-LAST:event_sdetails3MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
           
           
                       

             final JDialog d = new JDialog();
        JPanel p1 = new JPanel(new GridBagLayout());
        
        p1.setBackground(new Color(64,43,100));
        JLabel nm=new JLabel(" Preparing printing,Please Wait...");
        nm.setForeground(Color.white);
        p1.add(nm,new GridBagConstraints());
        d.getContentPane().add(p1);
        
        d.setSize(300,50);
        d.setLocationRelativeTo(this.getRootPane());
        d.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        d.setModal(true);
         d.setUndecorated(true);
    
         
           Thread t = new Thread(){
          public void run(){
           
              SwingUtilities.invokeLater(new Runnable(){//do swing work on EDT
                public void run(){
                                         
               InputStream path=getClass().getResourceAsStream("/reportform/classlist.jasper");

                        try {
                            Connection conn=(Connection) newdb.ConnectDb();
                            //JasperDesign report=JRXmlLoader.load(new File(""));
                            
                             JasperReport report=(JasperReport)JRLoader.loadObject(path);
            JasperPrint prn=JasperFillManager.fillReport(report,null,conn);
             
            
                
                 d.setModal(false);
                  
             JasperViewer view=new    JasperViewer(prn,false);
            view.setVisible(true);
            conn.close();
               
           
           
        } catch (JRException ex) {
           
        }   
        catch (SQLException ex) {
                   Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
               }       
                }
              });
              try
              {
                Thread.sleep(1000);
              }
              catch (InterruptedException e) {e.printStackTrace();}
            
            SwingUtilities.invokeLater(new Runnable(){//do swing work on EDT
              public void run(){
                d.dispose();
               
              }
            });
          }
        };
        t.start();
        d.setVisible(true);
                        
               
          
       
       
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        tbusort();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void clsc1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_clsc1ItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_clsc1ItemStateChanged

    private void stream0ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_stream0ItemStateChanged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_stream0ItemStateChanged

    private void GenderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GenderItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_GenderItemStateChanged

    private void streambItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_streambItemStateChanged
        // TODO add your handling code here:
   

    }//GEN-LAST:event_streambItemStateChanged

    private void streambMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_streambMouseClicked
        // TODO add your handling code here:
        stream();
    }//GEN-LAST:event_streambMouseClicked

    private void kGradientPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel10MouseClicked
    try {
        if(adm1.getText().equals("")){ JOptionPane.showMessageDialog(null, "Enter Adm no to delete!!!!");}else{
        if(JOptionPane.showConfirmDialog(null, "Do you want to delete student "+adm1.getText()+"Be sure all His/her Record will be deleted?")==JOptionPane.YES_OPTION){
        // TODO add your handling code here:
        String sqli="DELETE FROM `student_registration` WHERE adm='"+adm1.getText()+"'";
        pst=conn.prepareStatement(sqli);
        pst.execute();
         String sqli1="DELETE FROM add_Marks WHERE adm='"+adm1.getText()+"'";
        PreparedStatement pst1=conn.prepareStatement(sqli1);
        pst1.execute();
        JOptionPane.showMessageDialog(null, "Record deleted!!");
         
      surname.setText("");
      gender.setSelectedItem("");
      adm_date.setText("");
      fname.setText("");
      lname.setText("");
      dob.setText("");
      birth_cert_no.setText("");
      kcpe_marks.setText("");
      parent.setText("");
      telephone.setText("");
      alternative_telephone.setText("");
        
        }
        }
    } catch (SQLException ex) {
        
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_kGradientPanel10MouseClicked

    private void school_name2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_school_name2KeyReleased
        // TODO add your handling code here:
        scnkr(school_name2.getText());
    }//GEN-LAST:event_school_name2KeyReleased

    private void clsc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clsc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clsc1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        jTextField1.setText("Search");
        sep.setBackground(new Color(160,160,160));
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
         jTextField1.setText("");
         sep.setBackground(new Color(102,153,255));
         
    }//GEN-LAST:event_jTextField1FocusGained

    private void p2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseClicked
  if(typo.getText().equals("ADMIN")){
        
        // TODO add your handling code here:
           homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
      
        homedesktop.add(stureg);
    }else{
        JOptionPane.showMessageDialog(null, "This Areas are only accessed by admin please Sign in as admin");
       // TODO add your handling code here:
        // TODO add your handling code here:
          homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
      
        homedesktop.add(add_marks1);
       
    
    }

    }//GEN-LAST:event_p2MouseClicked

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
      // searchEngine(tbu,jTextField1);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        searchEngine(table,jTextField3);
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Do you want to delete Stream "+add_stream.getText())==JOptionPane.YES_OPTION){
             try {
            String ri="delete from stream where stream_name='"+add_stream.getText()+"'";
            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(ri);
            pri.execute();
             }catch(Exception ex){}
             }
        showin();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
           if(JOptionPane.showConfirmDialog(null, "Are you sure you want to delete!!!")==JOptionPane.YES_OPTION){
             try{
            String sqli="delete from subject where code='"+code.getText()+"'";
            pst=conn.prepareStatement(sqli);
       pst.execute();
       showinsubt();
       code();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }} 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
          setTablec();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
            if(JOptionPane.showConfirmDialog(null, "Are you sure you want to delete!!!")==JOptionPane.YES_OPTION){
             try{
            String sqli="delete from `teacher_registration` where `tscno`='"+tscno.getText()+"'";
            pst=conn.prepareStatement(sqli);
       pst.execute();
      tinTable();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }} 
    }//GEN-LAST:event_deleteMouseClicked

    private void tscnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tscnoKeyReleased
        // TODO add your handling code here:
                try{
 String sqli="Select * from `teacher_registration` where `tscno`='"+tscno.getText()+"'";
        pst=conn.prepareStatement(sqli);
        ResultSet rs=pst.executeQuery();
      if(rs.next()){
        surname2.setText(rs.getString(2));
        fname2.setText(rs.getString(3));
        lname2.setText(rs.getString(4));
        inn.setText(rs.getString(5));
        idno.setText(rs.getString(6));
        email.setText(rs.getString(8));
        phone.setText(rs.getString(9));
        password.setText(rs.getString(10));
        type.setSelectedItem(rs.getString(11));
        }else{
      
         surname2.setText("");
        fname2.setText("");
        lname2.setText("");
        inn.setText("");
        idno.setText("");
        email.setText("");
        phone.setText("");
        password.setText("");
        type.setSelectedItem("");
      }
                
                
                
                }catch(Exception ex){
        
        }
     
    }//GEN-LAST:event_tscnoKeyReleased

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void exam_name2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exam_name2MouseClicked

    examName();
    
    }//GEN-LAST:event_exam_name2MouseClicked
public void examName(){
        // 
              exam_name2.removeAllItems();
              exam_name2.addItem("Select Exam Name");
        try{
   String sql="SELECT * FROM `exam_name`";
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
 while(rs.next()){
exam_name2.addItem(rs.getString("name"));
 }
   
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
       }
}
    private void scodevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scodevMouseClicked
        // TODO add your handling code here:
code();
        
    }//GEN-LAST:event_scodevMouseClicked

    private void stream1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stream1MouseClicked
        // TODO add your handling code here:
        stream();
    }//GEN-LAST:event_stream1MouseClicked

    private void exam_codeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exam_codeMouseClicked
        // TODO add your handling code here:
            exam_code.removeAllItems();   
            exam_code.addItem("Select Exam Code");
            try{
   String sql="SELECT `code` FROM `exam_code`";
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
     exam_code.addItem(rs.getString("code"));
      code1.addItem(rs.getString("code"));
   }
   
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
       }
    }//GEN-LAST:event_exam_codeMouseClicked

    private void jLabel181MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel181MouseClicked
        // TODO add your handling code here:
       if(JOptionPane.showConfirmDialog(null, "Are sure you want to log out")==JOptionPane.YES_OPTION){
        this.repaint();;
        this.revalidate();
       // TODO add your handling code here:
        // TODO add your handling code here:
          homedesktop.removeAll();
           homedesktop.repaint();
           homedesktop.revalidate();
       // homedesktop.add(img);
      
        homedesktop.add(add_marks1);
           
        this.setVisible(false);
        loginPanel h=new loginPanel();
        h.setVisible(true);}
    }//GEN-LAST:event_jLabel181MouseClicked

    private void subnameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subnameItemStateChanged
        // TODO add your handling code here:
         tablelord();
        if(student_details.getRowCount()==0){
            adm.setText("");
            name_display.setText("");
        }else{
            adm.setText(student_details.getValueAt(0, 0).toString());
             name_display.setText(student_details.getValueAt(0, 1).toString()+" "+student_details.getValueAt(0, 2).toString());
            student_details.setRowSelectionAllowed(true);
            student_details.setColumnSelectionAllowed(false);
            student_details.addRowSelectionInterval(0, 0);
        }
        showMarks();
    }//GEN-LAST:event_subnameItemStateChanged

    private void exam_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exam_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exam_codeActionPerformed

    private void exam_codeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_exam_codeItemStateChanged
        // TODO add your handling code here:
         tablelord();
        if(student_details.getRowCount()==0){
            adm.setText("");
            name_display.setText("");
        }else{
            adm.setText(student_details.getValueAt(0, 0).toString());
             name_display.setText(student_details.getValueAt(0, 1).toString()+" "+student_details.getValueAt(0, 2).toString());
            student_details.setRowSelectionAllowed(true);
            student_details.setColumnSelectionAllowed(false);
            student_details.addRowSelectionInterval(0, 0);
        }
        showMarks();
    }//GEN-LAST:event_exam_codeItemStateChanged

    private void kGradientPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel4MouseClicked
        // TODO add your handling code here:
       
    
                try {
        if(adm.getText().equals("")){ JOptionPane.showMessageDialog(null, "Enter Adm no to delete!!!!");}else{
        if(JOptionPane.showConfirmDialog(null, "Do you want to delete student "+adm1.getText()+"Be sure all His/her Record will be deleted?")==JOptionPane.YES_OPTION){
        // TODO add your handling code here:
        String sqli="DELETE FROM add_marks  where Adm_no='"+adm.getText()+"' and form='"+form.getSelectedItem()+"' and stream='"+stream1.getSelectedItem()+"' and sub_name='"+subname.getSelectedItem()+"' and examcode='"+exam_code.getSelectedItem()+"'";
        pst=conn.prepareStatement(sqli);
        pst.execute();
         String sqli1="DELETE FROM add_Marks WHERE adm='"+adm1.getText()+"'";
        PreparedStatement pst1=conn.prepareStatement(sqli1);
        pst1.execute();
        JOptionPane.showMessageDialog(null, "Record deleted!!");
        showMarks();
      
        
        }
        }
    } catch (SQLException ex) {
        
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }  
    }//GEN-LAST:event_kGradientPanel4MouseClicked

    private void p1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseEntered
        // TODO add your handling code here:
        setColor(p1);
        resetColor(new JPanel[]{p2,p3,p4,p5,p6,p7});
    }//GEN-LAST:event_p1MouseEntered

    private void p2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseEntered
        // TODO add your handling code here:
        setColor(p2);
        resetColor(new JPanel[]{p1,p3,p4,p5,p6,p7});
    }//GEN-LAST:event_p2MouseEntered

    private void p3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseEntered
        // TODO add your handling code here:
        setColor(p3);
        resetColor(new JPanel[]{p2,p1,p4,p5,p6,p7});
    }//GEN-LAST:event_p3MouseEntered

    private void p4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MouseEntered
        // TODO add your handling code here:
        setColor(p4);
        resetColor(new JPanel[]{p2,p3,p1,p5,p6,p7});
    }//GEN-LAST:event_p4MouseEntered

    private void p5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseEntered
        // TODO add your handling code here:
        setColor(p5);
        resetColor(new JPanel[]{p2,p3,p4,p1,p6,p7});
    }//GEN-LAST:event_p5MouseEntered

    private void p6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MouseEntered
        // TODO add your handling code here:
        setColor(p6);
        resetColor(new JPanel[]{p2,p3,p4,p5,p1,p7});
    }//GEN-LAST:event_p6MouseEntered

    private void p7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p7MouseEntered
        // TODO add your handling code here:
        setColor(p7);
        resetColor(new JPanel[]{p2,p3,p4,p5,p6,p1});
    }//GEN-LAST:event_p7MouseEntered

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b10ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()==true){
        Select(new JRadioButton[]{b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15});
        }else{
        unSelect(new JRadioButton[]{b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15});
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void adm1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adm1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_adm1KeyTyped
public ArrayList<String> getSelected(){
      list.clear();
JRadioButton[] button=new JRadioButton[]{b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15};
for(int i=0;i<button.length;i++){
if(button[i].isSelected()){
list.add(Integer.toString(i));
}
}
return list;
}
    public void code(){
       scodev.removeAllItems();                                             try{
   String sql="SELECT `code` FROM `subject`";
   pst=conn.prepareStatement(sql);
   rs=pst.executeQuery();
   while(rs.next()){
     scodev.addItem(rs.getString("code"));
     
   }
   
       }
       catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
       }
    }
    public void showinsubt(){
    
    try{
 String sqli="Select * from subject";
        pst=conn.prepareStatement(sqli);
        ResultSet rs=pst.executeQuery();
        rsub.setModel(DbUtils.resultSetToTableModel(rs));}catch(Exception ex){
        
        }
    }
    public void showin(){
try{
 String sqli="Select * from stream";
        pst=conn.prepareStatement(sqli);
        ResultSet rs=pst.executeQuery();
        strreamTable.setModel(DbUtils.resultSetToTableModel(rs));}catch(Exception ex){
        
        }
}
    public void showtb(){
    try {
        String sqli="Select Name,Motto,Address,vision,Mission from school where dkey='1'";
        pst=conn.prepareStatement(sqli);
        ResultSet rs=pst.executeQuery();
        stb.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (SQLException ex) {
        Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    public void addTeacher(){
           try{
            String sqli="Select * from teacher_registration";
            pst=conn.prepareStatement(sqli);
            ResultSet rs=pst.executeQuery();
        teacher.removeAllItems();
          while(rs.next()){
          
          teacher.addItem(rs.getString("inn"));
          }
           

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        } 
    }
public void examCode(){

        try{
            
         String sql="SELECT  *  FROM exam_code Where form='"+cls1.getSelectedItem()+"' or term='"+term1.getSelectedItem()+"' or  year='"+year1.getSelectedItem()+"'";   
     com.mysql.jdbc.PreparedStatement    pst=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
         ResultSet rs=pst.executeQuery();
       while(rs.next()){
             code12.addItem(rs.getString("code"));
           }
             
         
        }
       catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
       }
}

public void year1(){

        try{
            
         String sql="SELECT * FROM exam_code group by year";   
     com.mysql.jdbc.PreparedStatement    pst=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sql);
         ResultSet rs=pst.executeQuery();
        while(rs.next()){
             
             year2.addItem(rs.getString("year"));
            
 }
             
         
        }
       catch(Exception e){
       JOptionPane.showMessageDialog(rootPane, e);
       }
}
    public void meG(){
try {
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exams", "root","");
            // TODO add your handling code here:
          ArrayList<Double> list1k=new ArrayList<Double>();  
           ArrayList<String> list=new ArrayList<String>(); 
           list.add("Mat");
           list.add("Eng");
           list.add("Kis");
           list.add("Bio");
           list.add("Phy");
           list.add("Chem");
           list.add("His");
           list.add("Geo");
           list.add("CRE");
           list.add("AGRI");
           list.add("Comp");
           list.add("Bus");
           list.add("HS");
           list.add("IRE");
           list.add("Mus");
           list.add("Tm");
           list.add("kcpe");
           double cpe=0;
            String sql="Select * from subject_grade";
            com.mysql.jdbc.PreparedStatement pst=(com.mysql.jdbc.PreparedStatement) conn.prepareCall(sql);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()){
                
                for(int i=2;i<26;i++){
                    list1k.add(Double.parseDouble(rs.getString(i)));}
                
            }
             System.out.println(list.size());
            for(int i=0;i<list.size();i++){
            double cc=0;
            double cck=0;
            String us=list.get(i);
           String cou="";
               String sql12="Select count(*) as cou  from `cmerit` where "+us+"!=''";
             System.out.println(sql12);
          
            PreparedStatement pst12= con.prepareCall(sql12);
            ResultSet rs12=pst12.executeQuery();
            
            while(rs12.next()){
               
              
                cou=rs12.getString(1);
                
            }
            System.out.println(cou);
            if(Integer.parseInt(cou)==0){
            
            String ri="Update av set grade='',point='' where name ='"+us+"'";
            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) con.prepareCall(ri);
            pri.execute();
            
            }else{
            
             String sql1="Select avg("+us+") as steve from `cmerit` where "+us+"!=''";
             System.out.println(sql1);
      
            com.mysql.jdbc.PreparedStatement pst1=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql1);
            ResultSet rs1=pst1.executeQuery();
            
            while(rs1.next()){
               
                cck=rs1.getDouble("steve");
                
                
            }
            System.out.println(cck);
            if(us.equals("Tm")){
            cc=Math.round((cck*12))/(100.0*Double.parseDouble(ent.getSelectedItem().toString())) ;
            
            } else if(us.equals("kcpe")){
             cc=Math.round((cck*12))/(500.0) ;
             cpe=Math.round((cck));
            }
            
            else{
            cc= Math.round((cck*12))/100.0;   
            }
            System.out.println(us);
            
             System.out.println(cc+">="+list1k.get(0));
             System.out.println(cc+"<="+list1k.get(1));
             System.out.println(cc);
            if(cc>=list1k.get(0) && cc<=list1k.get(1)){
                System.out.print("in");
            String ri="Update av set grade='A',point='"+cc+"' where name ='"+us+"'";
            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) con.prepareCall(ri);
            pri.execute();
            } else if(cc>=list1k.get(2) && cc<=list1k.get(3)){
                if(us.equals("kcpe")){
                cc=cpe;
                }
                 String ri="Update av set grade='A-',point='"+cc+"' where name ='"+us+"'";
            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) con.prepareCall(ri);
            pri.execute();
            }
            else if(cc>=list1k.get(4) && cc<=list1k.get(5)){
                if(us.equals("kcpe")){
                cc=cpe;
                }
               String ri="Update av set grade='B+',point='"+cc+"' where name ='"+us+"'";
            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) con.prepareCall(ri);
            pri.execute();
            }
            else if(cc>=list1k.get(6) && cc<=list1k.get(7)){
                if(us.equals("kcpe")){
                cc=cpe;
                }
             String ri="Update av set grade='B',point='"+cc+"' where name ='"+us+"'";
            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) con.prepareCall(ri);
            pri.execute();
            }
            else if(cc>=list1k.get(8) && cc<=list1k.get(9)){
                if(us.equals("kcpe")){
                cc=cpe;
                }
              String ri="Update av set grade='B-',point='"+cc+"' where name ='"+us+"'";
            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) con.prepareCall(ri);
            pri.execute();
            }
            else if(cc>=list1k.get(10) && cc<=list1k.get(11)){
                if(us.equals("kcpe")){
                cc=cpe;
                }
               String ri="Update av set grade='C+',point='"+cc+"' where name ='"+us+"'";
            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) con.prepareCall(ri);
            pri.execute();
            }
            else if(cc>=list1k.get(12) && cc<=list1k.get(13)){
                if(us.equals("kcpe")){
                cc=cpe;
                }
              String ri="Update av set grade='C',point='"+cc+"' where name ='"+us+"'";
            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) con.prepareCall(ri);
            pri.execute();
            }
            else if(cc>=list1k.get(14) && cc<=list1k.get(15)){
                if(us.equals("kcpe")){
                cc=cpe;
                }
              String ri="Update av set grade='C-',point='"+cc+"' where name ='"+us+"'";
            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) con.prepareCall(ri);
            pri.execute();
            }
            else if(cc>=list1k.get(16) && cc<=list1k.get(17)){
                if(us.equals("kcpe")){
                cc=cpe;
                }
             String ri="Update av set grade='D+',point='"+cc+"' where name ='"+us+"'";
            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) con.prepareCall(ri);
            pri.execute();
            }
            else if(cc>=list1k.get(18) && cc<=list1k.get(19)){
                if(us.equals("kcpe")){
                cc=cpe;
                }
              String ri="Update av set grade='D',point='"+cc+"' where name ='"+us+"'";
            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) con.prepareCall(ri);
            pri.execute();
            }
            else if(cc>=list1k.get(20) && cc<=list1k.get(21)){
                if(us.equals("kcpe")){
                cc=cpe;
                }
                String ri="Update av set grade='D-',point='"+cc+"' where name ='"+us+"'";
            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) con.prepareCall(ri);
            pri.execute();
            }
            else if(cc>=list1k.get(22) && cc<=list1k.get(23)){
                if(us.equals("kcpe")){
                cc=cpe;
                }
              String ri="Update av set grade='E',point='"+cc+"' where name ='"+us+"'";
            com.mysql.jdbc.PreparedStatement pri=(com.mysql.jdbc.PreparedStatement) con.prepareCall(ri);
            pri.execute();
            }
            cc=0;
            cck=0;
            }}
            
            con.close();
        } catch (SQLException ex) {
            
        }
}
     public void genCP(){
        try {
          
            String sqlf1="create or replace view meritlist as select *,rank() over (order by Tm DESC) as O_Pos from meritmaker";
            com.mysql.jdbc.PreparedStatement stlf1= (com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqlf1);
            stlf1.execute();
            
            String sqlf2="create or replace view meritlists as select *,rank() over (order by Tm DESC) as C_Pos , rank() over (order by Eng DESC) , rank() over (order by kis DESC) , rank() over (order by mat DESC) ,rank() over (order by Bio DESC) ,rank() over (order by phy DESC) ,rank() over (order by chem DESC),rank() over (order by his DESC) ,rank() over (order by geo DESC) ,rank() over (order by cre DESC) ,rank() over (order by AGRI DESC) ,rank() over (order by Comp DESC) ,rank() over (order by bus DESC) ,rank() over (order by HS DESC) ,rank() over (order by ire DESC) ,rank() over (order by mus DESC) from meritlist WHERE form='FORM: "+cls1.getSelectedItem()+" STREAM: "+stream2.getSelectedItem()+"' and( (eng!=' ' or not null) or ( kis!=' ' or not null) or (mat!=' ' or not null) or (bio!=' ' or not null) or (phy!=' ' or not null) or (Chem !=' '  or not null) or (his!=' ' or not null) or (geo!=' ' or not null) or (cre!=' ' or not null) or (agri!=' ' or not null) or (comp!=' ' or not null) or (bus!=' ' or not null) or (hs!=' ' or not null) or (IRE!=' ' or not null) or (Mus!=' 'or not null))";
            System.out.print(sqlf2);
            com.mysql.jdbc.PreparedStatement stlf2=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqlf2);
            stlf2.execute();
                 String ri7="create or replace view avJ as select *,rank() over (order by point DESC) as C_Pos from av where name!='kcpe' and name!='tm' and grade!=''";
                 System.out.println(ri7);
            com.mysql.jdbc.PreparedStatement pri7=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(ri7);
            pri7.execute();
            String sqlf4="create or replace view cmerit as select * from meritlists where form='FORM: "+cls1.getSelectedItem()+" STREAM: "+stream2.getSelectedItem()+"' ";
            System.out.print(sqlf4);
            com.mysql.jdbc.PreparedStatement stlf4=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqlf4);
            stlf4.execute();
            String sqlf3="select adm,name,kcpe,concat(Eng,' ',eG) as Eng,concat(Mat,' ',maG) as Mat,concat(Kis,' ',KiG) as Kis ,concat(Bio,' ',BiG) as Bio ,concat(Phy,' ',phG) as Phy"
                    + ",concat(chem,' ',chG) as Chem,concat(His,' ',HiG) as His,concat(Geo,' ',geG) as Geo,concat(CRE,' ',crG)as CRE ,concat(AGRI,' ',agG) as Agri" 
                    + ",concat(Comp,' ',CoG) as Comp,concat(Bus,' ',bsG) as Bus,concat(HS,' ',hmG) as HS,concat(IRE,' ',irG) as IRE ,concat(Mus,' ',muG) as Mus"
                    + ",`S.E`, `Tm`, `A.M`, `T.P`, `A.P`, `MG`,`O_Pos`,`C_Pos`     from cmerit";
            com.mysql.jdbc.PreparedStatement stlf3=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqlf3);
            ResultSet rs1f=stlf3.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs1f));
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            TableColumn column=table.getColumnModel().getColumn(1);
            column.setPreferredWidth(200);    
            column.setMaxWidth(200);
            column.setMinWidth(200);
           
           
             
//            Statement stlf4= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
//            String sd1="create view student details";
//            String sd2="DELETE FROM `meritmaker` WHERE form=''";
//            String sd4="create view cmerit as select * from meritlists";
//            String sd3="drop view if exists meritlists";
//            
//           
//            con.setAutoCommit(false);
//            stlf4.addBatch(sd1);
//            stlf4.addBatch(sd2);
//            stlf4.addBatch(sd3);
//             stlf4.addBatch(sd4);
//            stlf4.executeBatch();
//            con.commit();
            
           
        } catch (SQLException ex) {
            
        }
  
     
  
    }
    public void del(){
        try {
          
            Statement stlf4= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
           
            String sd2="DELETE FROM `meritmaker` ";
           // String sd4="drop view if exists meritlist";
           // String sd3="drop view if exists meritlists";
            
           
            conn.setAutoCommit(false);
           
            stlf4.addBatch(sd2);
          //  stlf4.addBatch(sd3);
           // stlf4.addBatch(sd4);
            stlf4.executeBatch();
            conn.commit();
        } catch (SQLException ex) {
            
        }
    }
  public void showInTable12(){
   del();
     try {
         DefaultTableModel model=(DefaultTableModel) table.getModel();
         String adm="";
         String name="";
         
         String term="";
         String examname="";
         String form="";
         String kcpe="";
         String stream="";
         String clas=cls1.getSelectedItem().toString();
         String stm=stream2.getSelectedItem().toString();
         String excode=code12.getSelectedItem().toString();
         String math="";
         String eng="";
         String chem="";
         String kisw="";
         String bio="";
         String phy="";
         String comp="";
         String bus="";
         String agri="";
         String histo="";
         String geo="";
         String cre="";
          String ire="";
           String mus="";
            String hs="";
            String mg="";
         int tm=0;
         double avg=0;
         double tp=0;
         double ap=0;
         double p=0.0;
         com.mysql.jdbc.Connection con=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/exams","root", "");
         int m1 = 0,m2 = 0,m3 = 0,m4 = 0,m5 = 0,m6 = 0,m7 = 0,m8 = 0,m9 = 0,m10 = 0,m11 = 0,m12=0,m13 = 0,m14 = 0,m15=0;
         String s1 = "",s2 = "",s3 = "",s4 = "",s5 = "",s6 = "",s7 = "",s8 = "",s9 = "",s10 = "",s11 = "",s12="",s13 = "",s14 = "",s15="";
         String c1 = "",c2 = "",c3 = "",c4 = "",c5 = "",c6 = "",c7 = "",c8 = "",c9 = "",c10 = "",c11 = "",c12="",c13 = "",c14 = "",c15="";
         String d1 = "",d2 = "",d3 = "",d4 = "",d5 = "",d6 = "",d7 = "",d8 = "",d9 = "",d10 = "",d11 = "",d12="",d13 = "",d14 = "",d15="";
      String p1="",p2="",p3="",p4="",p5="",p6="",p7="",p8="",p9="",p10="",p11="",p12="",p13="",p14="",p15="";
         String str="";
         
    
       ArrayList<String> list=new ArrayList<String>(); //list for Subjects
           list.clear();;
           list.add("Eng");
           list.add("Kisw");
           list.add("Math");
           list.add("Bio");
           list.add("Phy");
           list.add("Chem");
           list.add("Hist");
           list.add("Geo");
           list.add("C.R.E");
           list.add("Agri");
           list.add("Comp");
           list.add("Bus");
           list.add("HomeScience");
           list.add("I.R.E");
           list.add("Music");
         
           ArrayList<String> kl=new ArrayList<String>();
           ArrayList<Integer> kl1=new ArrayList<Integer>();
           ArrayList<Double> kl2=new ArrayList<Double>();
           ArrayList<String> kl3=new ArrayList<String>();
           ArrayList<String> k4=new ArrayList<String>();
             ArrayList<String> kl5=new ArrayList<String>();
              ArrayList<String> kl6=new ArrayList<String>();
               ArrayList<String> kl7=new ArrayList<String>();
           k4.clear();
           k4.add("Eng");
           k4.add("Kis");
           k4.add("Mat");
           k4.add("Bio");
           k4.add("Phy");
           k4.add("Chem");
           k4.add("His");
           k4.add("Geo");
           k4.add("CRE");
           k4.add("Agri");
           k4.add("Comp");
           k4.add("Bus");
           k4.add("HS");
           k4.add("IRE");
           k4.add("Mus");
         
                       kl1.clear();
                       kl2.clear();
                       kl3.clear();
                       kl5.clear();
                       kl6.clear();
               String sq="select * from add_marks where examcode='"+excode+"' and form='"+clas+"'  GROUP BY Adm_no";
               System.out.println(sq);
               
               com.mysql.jdbc.PreparedStatement s=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sq);
               ResultSet r=s.executeQuery();
               while(r.next()){
                   adm=r.getString("Adm_no");
                   String sqk="Select surname,fname,lname,kcpe_marks,stream,form from student_registration where adm='"+adm+"'";
                   com.mysql.jdbc.PreparedStatement sk=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sqk);
                   ResultSet rk=sk.executeQuery();
                   while(rk.next()){
                       name=rk.getString("surname")+" "+rk.getString("fname")+" "+rk.getString("lname");
                       form="FORM: "+rk.getString("form")+" STREAM: "+rk.getString("stream");
                       kcpe=rk.getString("kcpe_marks");
                   }
                   
                    String sqk1="Select * from exam_code where code='"+excode+"'";
                   com.mysql.jdbc.PreparedStatement sk1=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sqk1);
                   ResultSet rk1=sk1.executeQuery();
                   while(rk1.next()){
                      term=rk1.getString("Term") +" YEAR: "+rk1.getString("year");
                      examname=rk1.getString("name");
                   }
                   for(int i=0;i<list.size();i++){
                     String c="";  
                       String sqk1a="SELECT `code` FROM `subject` WHERE  `name`='"+list.get(i)+"' and `class`='"+cls1.getSelectedItem()+"'";
                  System.out.println(sqk1a);
                       
                       com.mysql.jdbc.PreparedStatement sk1a=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sqk1a);
                   ResultSet rk1a=sk1a.executeQuery();
                   while(rk1a.next()){
                      c=rk1a.getString("code");
                   
                   }
                 
                   
                       
                       
                       String sqhz1="select * from add_marks where examcode='"+excode+"' and sub_name='"+list.get(i)+"' and Adm_no='"+adm+"'";
                       com.mysql.jdbc.PreparedStatement sthz1=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sqhz1);
                       ResultSet rshz1=sthz1.executeQuery();
                       if(!rshz1.isBeforeFirst() && rshz1.getRow()==0){System.out.println("am steve");
                       kl1.add(0);
                       kl2.add(0.0);
                       kl3.add("");
                       kl5.add(""); 
                       kl6.add(""); 
                       kl7.add("");
                       }else{
                             String ti="";
                          String sqk1a1="SELECT * FROM `teacher_subject` WHERE  code='"+c+"'";
                   com.mysql.jdbc.PreparedStatement sk1a1=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sqk1a1);
                   ResultSet rk1a1=sk1a1.executeQuery();
                   while(rk1a1.next()){
                     ti =rk1a1.getString("teacher_name");
                   }
                     kl7.add(ti);
                           String sql="select *  from add_marks where examcode='"+excode+"' and sub_name='"+list.get(i)+"' and Adm_no='"+adm+"'";
                           System.out.println(sql);
                           com.mysql.jdbc.PreparedStatement st=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
                           ResultSet rs=st.executeQuery();
                           while(rs.next()){
                              math=rs.getString("Student_score");
                              m1=(int)Double.parseDouble(rs.getString("Student_score"))*1;
                              s1= getG(m1,list.get(i));
                              p=getPs(s1);
                   
                         kl1.add(m1);
                         kl2.add(p);
                         kl3.add(s1);
                         kl5.add(Integer.toString((int) p));   
                         kl6.add(getComment(s1,list.get(i))); 
                               
                           }
                       
                       }
                      
                   }
                   tm=0;
                   tp=0;
                   for(int i=0;i<kl1.size();i++){
                   tm+=kl1.get(i);
                   }
                    for(int i=0;i<kl2.size();i++){
                   tp+=kl2.get(i);
                   }
                   DecimalFormat g=new DecimalFormat(".00");
                    
                    avg=((tm/Double.parseDouble(ent.getSelectedItem().toString())))*1.0;
                    g.format(avg);
                    ap=(tp/Double.parseDouble(ent.getSelectedItem().toString()));
                      g.format(ap);
                    mg=getPk(ap);
                   System.out.println(kl1);
                   System.out.println(kl2);
                   System.out.println(kl3);   
                    System.out.println(tm);
                   System.out.println(tp);
                    System.out.println(avg);
                   System.out.println(ap);
        eng=kl1.get(0).toString(); s1=kl3.get(0);
        kisw=kl1.get(1).toString();s2=kl3.get(1);
        math=kl1.get(2).toString();s3=kl3.get(2);
        bio=kl1.get(3).toString();s4=kl3.get(3);
        phy=kl1.get(4).toString();s5=kl3.get(4);
        chem=kl1.get(5).toString();s6=kl3.get(5);
        histo=kl1.get(6).toString();s7=kl3.get(6);
        geo=kl1.get(7).toString();s8=kl3.get(7);
        cre=kl1.get(8).toString();s9=kl3.get(8);
        agri=kl1.get(9).toString();s10=kl3.get(9);
        comp=kl1.get(10).toString();s11=kl3.get(10);
        bus=kl1.get(11).toString();s12=kl3.get(11);
         hs=kl1.get(12).toString();s13=kl3.get(12);
         ire=kl1.get(13).toString();s14=kl3.get(13);
         mus=kl1.get(14).toString();s15=kl3.get(14);
            
             
         
        d1=kl7.get(0).toString(); c1=kl6.get(0);
        d2=kl7.get(1).toString();c2=kl6.get(1);
        d3=kl7.get(2).toString();c3=kl6.get(2);
        d4=kl7.get(3).toString();c4=kl6.get(3);
        d5=kl7.get(4).toString();c5=kl6.get(4);
        d6=kl7.get(5).toString();c6=kl6.get(5);
        d7=kl7.get(6).toString();c7=kl6.get(6);
        d8=kl7.get(7).toString();c8=kl6.get(7);
        d9=kl7.get(8).toString();c9=kl6.get(8);
        d10=kl7.get(9).toString();c10=kl6.get(9);
        d11=kl7.get(10).toString();c11=kl6.get(10);
        d12=kl7.get(11).toString();c12=kl6.get(11);
         d13=kl7.get(12).toString();c13=kl6.get(12);
         d14=kl7.get(13).toString();c14=kl6.get(13);
         d15=kl7.get(14).toString();c15=kl6.get(14);
        
        p1=kl5.get(0); 
        p2=kl5.get(1);
        p3=kl5.get(2);
        p4=kl5.get(3);
        p5=kl5.get(4);
        p6=kl5.get(5);
        p7=kl5.get(6);
        p8=kl5.get(7);
        p9=kl5.get(8);
        p10=kl5.get(9);
        p11=kl5.get(10);
        p12=kl5.get(11);
         p13=kl5.get(12);
         p14=kl5.get(13);
         p15=kl5.get(14);
                 
              String sqlf="INSERT INTO `meritmaker`   values "
                      + "('"+adm+"','"+name+"','"+form+"','"+term+"','"+examname+"','"+kcpe+"','"+eng+"','"+s1+"','"+p1+"','"+c1+"','"+d1+"','"+kisw+"','"+s2+"','"+p2+"','"+c2+"','"+d2+"','"+math+"','"+s3+"','"+p3+"','"+c3+"','"+d3+"',"
                      + "'"+bio+"','"+s4+"','"+p4+"','"+c4+"','"+d4+"','"+phy+"','"+s5+"','"+p5+"','"+c5+"','"+d5+"','"+chem+"','"+s6+"','"+p6+"','"+c6+"','"+d6+"','"+histo+"','"+s7+"','"+p7+"','"+c7+"','"+d7+"','"+geo+"','"+s8+"','"+p8+"','"+c8+"','"+d8+"',"
                      + "'"+cre+"','"+s9+"','"+p9+"','"+c9+"','"+d9+"','"+agri+"','"+s10+"','"+p10+"','"+c10+"','"+d10+"','"+comp+"','"+s11+"','"+p11+"','"+c11+"','"+d11+"','"+bus+"','"+s12+"','"+p12+"','"+c12+"','"+d12+"',"
                      + "'"+hs+"','"+s13+"','"+p13+"','"+c13+"','"+d13+"','"+ire+"','"+s14+"','"+p14+"','"+c14+"','"+d15+"','"+mus+"','"+s15+"','"+p15+"','"+c15+"','"+d15+"','"+ent.getSelectedItem()+"','"+tm+"','"+Integer.parseInt(ent.getSelectedItem().toString())*100+"','"+getComment(mg,"avg")+"','"+ g.format(avg)+"','"+tp+"','"+g.format(ap)+"','"+mg+"')";
                 com.mysql.jdbc.PreparedStatement stlf=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sqlf);
                 stlf.execute();
                 
                   tm=0;
                   tp=0;
                   avg=0;
                   ap=0;
                        kl1.clear();
                       kl2.clear();
                       kl3.clear();
                       kl5.clear();
                       kl6.clear();
                        kl7.clear();
                 math="";
                 eng="";
                 chem="";
                 kisw="";
                 bio="";
                 phy="";
                 comp="";
                 bus="";
                 agri="";
                 histo="";
                 geo="";
                 cre="";
                 ire="";
                 hs="";
                 mus="";
                 table.getRowSorter().toggleSortOrder(17);
                 
     }
             String dellcode="";
               String delete=""; 
         for(int i=0;i<k4.size();i++){
         String sqlf1="update `meritmaker` set "+k4.get(i)+"='' WHERE  "+k4.get(i)+"=0" ;
       System.out.println(sqlf1);
                 com.mysql.jdbc.PreparedStatement stlf1=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sqlf1);
                 stlf1.execute();  
         }   
         
      
          
         } catch (SQLException ex) {
            
         }
         
       
         
         
    
     meG();
     genCP();
     
   }
  public String getComment(String value,String sub){
                try {
                    ArrayList<String> gh=new ArrayList<String>();
                    gh.clear();
                    if(sub.equals("Kisw")){
                     String sqk1=" select * from comment where name='KISWAHILI'";
                    com.mysql.jdbc.PreparedStatement sk1=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqk1);
                    ResultSet rk1=sk1.executeQuery();
                    while(rk1.next()){
                         gh.add(rk1.getString(3));
                          gh.add(rk1.getString(4));
                           gh.add(rk1.getString(5));
                            gh.add(rk1.getString(6));
                             gh.add(rk1.getString(7));
                              gh.add(rk1.getString(8));
                               gh.add(rk1.getString(9));
                                gh.add(rk1.getString(10));
                                 gh.add(rk1.getString(11));
                                  gh.add(rk1.getString(12));
                                   gh.add(rk1.getString(13));
                                    gh.add(rk1.getString(14));
                    }
                    }else{
                    String sqk1=" select * from comment where name='ENGLISH'";
                    com.mysql.jdbc.PreparedStatement sk1=(com.mysql.jdbc.PreparedStatement) conn.prepareStatement(sqk1);
                    ResultSet rk1=sk1.executeQuery();
                    while(rk1.next()){
                         gh.add(rk1.getString(3));
                          gh.add(rk1.getString(4));
                           gh.add(rk1.getString(5));
                            gh.add(rk1.getString(6));
                             gh.add(rk1.getString(7));
                              gh.add(rk1.getString(8));
                               gh.add(rk1.getString(9));
                                gh.add(rk1.getString(10));
                                 gh.add(rk1.getString(11));
                                  gh.add(rk1.getString(12));
                                   gh.add(rk1.getString(13));
                                    gh.add(rk1.getString(14));
                    }
                    }
                    
                    if(value.equals("A")){
                        return gh.get(0);
                    }else if(value.equals("A-")){
                        
                         return gh.get(1);
                    }
                    
                    else if(value.equals("B+")){
                         return gh.get(2);
                        
                    }
                    else if(value.equals("B")){
                        
                         return gh.get(3);
                    }
                    else if(value.equals("B-")){
                         return gh.get(4);
                        
                    }
                    else if(value.equals("C+")){
                        
                         return gh.get(5);
                    }
                    else if(value.equals("C")){
                        
                         return gh.get(6);
                    }
                    else if(value.equals("C-")){
                        
                         return gh.get(7);
                    }
                    else if(value.equals("D+")){
                        
                         return gh.get(8);
                    }
                    else if(value.equals("D")){
                        
                         return gh.get(9);
                    }
                    else if(value.equals("D-")){
                        
                         return gh.get(10);
                    }
                    else if(value.equals("E")){
                        
                         return gh.get(11);
                    }
                       } catch (SQLException ex) {
                    Logger.getLogger(Landing1.class.getName()).log(Level.SEVERE, null, ex);
                }
                 return "";
  }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Landing1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Landing1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Landing1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Landing1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Landing1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JPanel Gr;
    private javax.swing.JPanel addSt;
    private javax.swing.JPanel addSt1;
    private javax.swing.JPanel addSt2;
    private javax.swing.JDialog addStream;
    private javax.swing.JPanel add_marks;
    private javax.swing.JPanel add_marks1;
    private javax.swing.JTextField add_stream;
    private javax.swing.JTextField address;
    private javax.swing.JTextField adm;
    private javax.swing.JTextField adm1;
    private javax.swing.JTextField adm_date;
    private javax.swing.JTextField afrom;
    private javax.swing.JTextField alternative_telephone;
    private javax.swing.JTextField aminusfrom;
    private javax.swing.JTextField aminusto;
    private javax.swing.JTextField ato;
    private javax.swing.JLabel au;
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton b10;
    private javax.swing.JRadioButton b11;
    private javax.swing.JRadioButton b12;
    private javax.swing.JRadioButton b13;
    private javax.swing.JRadioButton b14;
    private javax.swing.JRadioButton b15;
    private javax.swing.JRadioButton b2;
    private javax.swing.JRadioButton b3;
    private javax.swing.JRadioButton b4;
    private javax.swing.JRadioButton b5;
    private javax.swing.JRadioButton b6;
    private javax.swing.JRadioButton b7;
    private javax.swing.JRadioButton b8;
    private javax.swing.JRadioButton b9;
    private javax.swing.JTextField bfrom;
    private javax.swing.JTextField birth_cert_no;
    private javax.swing.JTextField bminusfrom;
    private javax.swing.JTextField bminusto;
    private javax.swing.JComboBox<String> border_day;
    private javax.swing.JTextField bplusfrom;
    private javax.swing.JTextField bplusto;
    private javax.swing.JTextField bto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c10;
    private javax.swing.JTextField c11;
    private javax.swing.JTextField c12;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c4;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField c6;
    private javax.swing.JTextField c7;
    private javax.swing.JTextField c8;
    private javax.swing.JTextField c9;
    private javax.swing.JTextField cfrom;
    private javax.swing.JComboBox<String> cls;
    private javax.swing.JComboBox<String> cls1;
    private javax.swing.JComboBox<String> clsc1;
    private javax.swing.JTextField cminusfrom;
    private javax.swing.JTextField cminusto;
    private javax.swing.JTextField cnt;
    private javax.swing.JTextField code;
    private javax.swing.JComboBox<String> code1;
    private javax.swing.JComboBox<String> code12;
    public static keeptoo.KGradientPanel comp;
    public static keeptoo.KGradientPanel comp1;
    private javax.swing.JTextField converted_score;
    private javax.swing.JTextField cplusfrom;
    private javax.swing.JTextField cplusto;
    private javax.swing.JTextField cto;
    private keeptoo.KGradientPanel delete;
    private javax.swing.JTextField dfrom;
    private javax.swing.JTextField dminusfrom;
    private javax.swing.JTextField dminusto;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField dplusfrom;
    private javax.swing.JTextField dplusto;
    private javax.swing.JTextField dto;
    private javax.swing.JTextField efrom;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> ent;
    private javax.swing.JComboBox<String> ent2;
    private javax.swing.JComboBox<String> ent3;
    private javax.swing.JTextField eto;
    private javax.swing.JComboBox<String> exam_code;
    private javax.swing.JTextField exam_name1;
    private javax.swing.JComboBox<String> exam_name2;
    public static keeptoo.KGradientPanel exreg;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField fname2;
    private javax.swing.JComboBox<String> form;
    private javax.swing.JComboBox<String> form2;
    private javax.swing.JComboBox<String> formb;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField grade;
    private javax.swing.JPanel homedesktop;
    private javax.swing.JComboBox<String> house;
    private javax.swing.JTextField idno;
    private javax.swing.JTextField inn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    public static keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel10;
    private keeptoo.KGradientPanel kGradientPanel11;
    private keeptoo.KGradientPanel kGradientPanel14;
    private keeptoo.KGradientPanel kGradientPanel18;
    private keeptoo.KGradientPanel kGradientPanel19;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel20;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private keeptoo.KGradientPanel kGradientPanel5;
    public static keeptoo.KGradientPanel kGradientPanel6;
    public static keeptoo.KGradientPanel kGradientPanel7;
    private keeptoo.KGradientPanel kGradientPanel8;
    private keeptoo.KGradientPanel kGradientPanel9;
    private javax.swing.JTextField kcpe_marks;
    private javax.swing.JComboBox<String> lang;
    private javax.swing.JLabel lblimg;
    private javax.swing.JLabel lblimg3;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField lname2;
    private javax.swing.JTextArea mission;
    private javax.swing.JTextArea motto;
    private javax.swing.JLabel name_display;
    private javax.swing.JTextField out_of;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JTextField parent;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel penel;
    private javax.swing.JPanel penel1;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel points;
    private javax.swing.JPanel regSubGrade;
    private javax.swing.JComboBox<String> religion;
    private javax.swing.JTable rsub;
    private keeptoo.KGradientPanel save;
    private javax.swing.JTextField school_name2;
    private javax.swing.JComboBox<String> scodev;
    private javax.swing.JTable sdetails3;
    private javax.swing.JPasswordField security_code;
    private javax.swing.JSeparator sep;
    private javax.swing.JSeparator sep1;
    private javax.swing.JSeparator sep2;
    private javax.swing.JTextField setter;
    private javax.swing.JTable stb;
    private javax.swing.JComboBox<String> stream0;
    private javax.swing.JComboBox<String> stream1;
    private javax.swing.JComboBox<String> stream2;
    private javax.swing.JComboBox<String> streamb;
    private javax.swing.JTable strreamTable;
    private javax.swing.JTable student_details;
    private javax.swing.JTextField student_score;
    private javax.swing.JPanel stureg;
    private javax.swing.JComboBox<String> sub;
    private javax.swing.JTable subReg;
    private javax.swing.JPanel subRegestration;
    private javax.swing.JComboBox<String> subject;
    private javax.swing.JComboBox<String> subject1;
    private javax.swing.JComboBox<String> subject3;
    private javax.swing.JComboBox<String> subname;
    private javax.swing.JPanel subteacher;
    private javax.swing.JTextField surname;
    private javax.swing.JTextField surname2;
    private javax.swing.JTable table;
    private javax.swing.JTable tbu;
    private javax.swing.JComboBox<String> teacher;
    private javax.swing.JTextField telephone;
    private javax.swing.JComboBox<String> term1;
    private javax.swing.JComboBox<String> term2;
    private javax.swing.JPanel treg1;
    private javax.swing.JPanel treg2;
    private javax.swing.JPanel treg3;
    private javax.swing.JTextField tscno;
    private javax.swing.JDialog tsub;
    private javax.swing.JDialog tsub1;
    private javax.swing.JDialog tsub2;
    private javax.swing.JDialog tsub3;
    private javax.swing.JDialog tsub5;
    private javax.swing.JDialog tsub6;
    private javax.swing.JDialog tsub7;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JLabel typo;
    private javax.swing.JTextArea vision;
    private javax.swing.JComboBox<String> year1;
    private javax.swing.JComboBox<String> year2;
    // End of variables declaration//GEN-END:variables
}
