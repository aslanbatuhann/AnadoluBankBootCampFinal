package com.batuhanaslan.insuranceagent.anadolubankbootcamp.view;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.helper.BarChartHelper;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.helper.Helper;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.helper.PieChartHelper;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Customer;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Policy;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.service.CustomerService;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.service.PolicyService;
import lombok.SneakyThrows;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class AgentGUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tab_agent;
    private JPanel pnl_top;
    private JButton btn_exit;
    private JPanel pnl_policy_list;
    private JScrollPane scrll_policy_list;
    private JTable tbl_policy_list;
    private JPanel pnl_customer_list;
    private JScrollPane scrll_customer_list;
    private JTable tbl_customer_list;
    private JButton btn_grf_one;
    private JButton btn_grf_two;
    AbstractApplicationContext ctx = null;
    private DefaultTableModel mdl_policy_list;
    private Object[] row_policy_list;
    private DefaultTableModel mdl_customer_list;
    private Object[] row_customer_list;
    private JPopupMenu patikaMenu;
    private JPopupMenu patikaMenu2;

    public AgentGUI() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PolicyService policyService = ctx.getBean(PolicyService.class);
        Helper.setLayout();
        add(wrapper);
        setSize(1000, 500);
        setLocation(Helper.screenCentrePoint("x", getSize()), Helper.screenCentrePoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("ANADOLU BANK BOOTCAMP İNSURANCE AGENT");
        setVisible(true);

        mdl_policy_list = new DefaultTableModel();
        Object[] col_policy_list = {"POLİÇE ID", "POLİÇE NUMARASI", "POLİÇE TARİHİ", "ÜCRET", "MODEL", "X"};
        mdl_policy_list.setColumnIdentifiers(col_policy_list);
        row_policy_list = new Object[col_policy_list.length];

        loadPolicyModel();


        tbl_policy_list.setModel(mdl_policy_list);
        tbl_policy_list.getTableHeader().setReorderingAllowed(false);


        mdl_customer_list = new DefaultTableModel();
        Object[] col_customer_list = {"MÜŞTERİ ID", "İSİM", "SOY İSİM", "YAŞ", "TELEFON"};
        mdl_customer_list.setColumnIdentifiers(col_customer_list);
        row_customer_list = new Object[col_customer_list.length];
        loadCustomerModel();

        tbl_customer_list.setModel(mdl_customer_list);

        btn_grf_one.addActionListener(e -> {
            patikaMenu = new JPopupMenu();

            BarChartHelper example = new BarChartHelper();
            example.setSize(800, 400);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);


        });
        btn_grf_two.addActionListener(e -> {
            patikaMenu2 = new JPopupMenu();
            PieChartHelper example = new PieChartHelper();
            example.setSize(800, 400);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }

    private void loadCustomerModel() {
        DefaultTableModel cleanModel = (DefaultTableModel) tbl_customer_list.getModel();
        cleanModel.setRowCount(0);
        CustomerService object = ctx.getBean(CustomerService.class);

        List<Customer> CustomerAllList = object.list();
        for (Customer obj : CustomerAllList) {
            int i = 0;
            row_customer_list[i++] = obj.getCost_id();
            row_customer_list[i++] = obj.getFirst_name();
            row_customer_list[i++] = obj.getLast_name();
            row_customer_list[i++] = obj.getAge();
            row_customer_list[i++] = obj.getPhone();
            mdl_customer_list.addRow(row_customer_list);
        }
    }

    @SneakyThrows
    public void loadPolicyModel() {
        DefaultTableModel cleanModel = (DefaultTableModel) tbl_policy_list.getModel();
        cleanModel.setRowCount(0);
        PolicyService obj2 = ctx.getBean(PolicyService.class);

        List<Policy> PolicyAllList = obj2.getPolicyDate();
        for (Policy obj : PolicyAllList) {
            int i = 0;
            row_policy_list[i++] = obj.getPolicy_id();
            row_policy_list[i++] = obj.getPolicy_num();
            row_policy_list[i++] = obj.getDate_policy();
            row_policy_list[i++] = obj.getUnit_cost();
            row_policy_list[i++] = obj.getCar_model();
            row_policy_list[i++] = obj.getCustomer();
            mdl_policy_list.addRow(row_policy_list);
        }
    }


}
