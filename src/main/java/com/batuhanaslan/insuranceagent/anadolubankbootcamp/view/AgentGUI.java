package com.batuhanaslan.insuranceagent.anadolubankbootcamp.view;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.helper.Helper;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Customer;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.model.Policy;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.service.CustomerService;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.service.PolicyService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AgentGUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tab_agent;
    private JPanel pnl_top;
    private JButton btn_exit;
    private JPanel pnl_policy_list;
    private JScrollPane scrll_policy_list;
    private JTable tbl_policy_list;
    private JTextField fld_sh_policy_date;
    private JButton btn_sh_polcy;
    private JPanel pnl_customer_list;
    private JScrollPane scrll_customer_list;
    private JTable tbl_customer_list;
    AbstractApplicationContext ctx = null;
    private DefaultTableModel mdl_policy_list;
    private Object[] row_policy_list;
    private DefaultTableModel mdl_customer_list;
    private Object[] row_customer_list;

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
        Object[] col_policy_list = {"policy_id_", "policy_num_", "date_policy", "unit_cost", "car_model"};
        mdl_policy_list.setColumnIdentifiers(col_policy_list);
        row_policy_list = new Object[col_policy_list.length];

        loadPolicyModel();



        tbl_policy_list.setModel(mdl_policy_list);
        tbl_policy_list.getTableHeader().setReorderingAllowed(false);

        btn_sh_polcy.addActionListener(e -> {
            try {

                String date_policy = fld_sh_policy_date.getText();
                ArrayList<Policy> searchingPolicy = null;
                loadPolicyModel(searchingPolicy = policyService.getPolicyDate(date_policy));

                tbl_policy_list.setModel(mdl_policy_list);

            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });
        mdl_customer_list = new DefaultTableModel();
        Object[] col_customer_list = {"cost_id", "first_name", "last_name", "age", "phone"};
        mdl_customer_list.setColumnIdentifiers(col_customer_list);
        row_customer_list = new Object[col_customer_list.length];
        loadCustomerModel();

        tbl_customer_list.setModel(mdl_customer_list);
        tbl_policy_list.getTableHeader().setReorderingAllowed(false);

        btn_exit.addActionListener(e -> dispose());
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

    public void loadPolicyModel() {
        DefaultTableModel cleanModel = (DefaultTableModel) tbl_policy_list.getModel();
        cleanModel.setRowCount(0);
        PolicyService obj2 = ctx.getBean(PolicyService.class);

        List<Policy> PolicyAllList = obj2.list();
        for (Policy obj : PolicyAllList) {
            int i = 0;
            row_policy_list[i++] = obj.getPolicy_id();
            row_policy_list[i++] = obj.getPolicy_num();
            row_policy_list[i++] = obj.getDate_policy();
            row_policy_list[i++] = obj.getUnit_cost();
            row_policy_list[i++] = obj.getCar_model();
            mdl_policy_list.addRow(row_policy_list);
        }
    }

    public void loadPolicyModel(ArrayList<Policy> policyArrayListByDate) {
        PolicyService obj2 = ctx.getBean(PolicyService.class);
        DefaultTableModel cleanModel = (DefaultTableModel) tbl_policy_list.getModel();
        cleanModel.setRowCount(0);

        for (Policy obj : policyArrayListByDate) {
            int i = 0;
            row_policy_list[i++] = obj.getPolicy_id();
            row_policy_list[i++] = obj.getPolicy_num();
            row_policy_list[i++] = obj.getDate_policy();
            row_policy_list[i++] = obj.getUnit_cost();
            row_policy_list[i++] = obj.getCar_model();
            mdl_policy_list.addRow(row_policy_list);
        }
    }
}
