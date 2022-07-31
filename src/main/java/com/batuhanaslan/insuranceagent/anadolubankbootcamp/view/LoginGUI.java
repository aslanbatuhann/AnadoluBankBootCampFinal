package com.batuhanaslan.insuranceagent.anadolubankbootcamp.view;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.helper.Helper;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.service.AgentService;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JPanel wrapper;
    private JPanel wrapperTop;
    private JPanel wrapperBot;
    private JTextField fld_user_name;
    private JTextField fld_user_password;
    private JButton btn_login;
    AbstractApplicationContext ctx = null;

    public LoginGUI() {
        add(wrapper);
        setSize(800, 500);
        setLocation(Helper.screenCentrePoint("x", getSize()), Helper.screenCentrePoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("ANADOLU BANK BOOTCAMP İNSURANCE AGENT");
        setResizable(false);
        setVisible(true);

        btn_login.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_user_name) || Helper.isFieldEmpty(fld_user_password)) {
                Helper.showMsg("fill");
            } else {
                ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
                AgentService agentService = ctx.getBean(AgentService.class);
                try {
                    if (!agentService.getAgentLogin(fld_user_name.getText(), fld_user_password.getText())) {
                        Helper.showMsg("Kullanıcı Bulunamadı");
                    } else {
                        AgentGUI agentGUI = new AgentGUI();
                    }
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                dispose();
            }
        });
    }
}
