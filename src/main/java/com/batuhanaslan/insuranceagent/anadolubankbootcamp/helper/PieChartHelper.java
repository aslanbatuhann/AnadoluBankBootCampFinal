package com.batuhanaslan.insuranceagent.anadolubankbootcamp.helper;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.service.CustomerService;
import com.batuhanaslan.insuranceagent.anadolubankbootcamp.service.PolicyService;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.text.DecimalFormat;

public class PieChartHelper extends JFrame {
    private static final long serialVersionUID = 6294689542092367723L;
    AbstractApplicationContext ctx = null;
    public PieChartHelper() {


        // Create dataset
        PieDataset dataset = createDataset();

        // Create chart
        JFreeChart chart = ChartFactory.createPieChart(
                "Müşteri Yaş Payı",
                dataset,
                true,
                true,
                false);

        //Format Label
        PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(
                "Marks {0} : ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        ((PiePlot) chart.getPlot()).setLabelGenerator(labelGenerator);

        // Create Panel
        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }

    private PieDataset createDataset() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PolicyService policyService = ctx.getBean(PolicyService.class);
        CustomerService customerService = ctx.getBean(CustomerService.class);
        DefaultPieDataset dataset=new DefaultPieDataset();

        dataset.setValue("Poliçe sayısı", policyService.list().size());
        dataset.setValue("Müşteri sayısı",customerService.list().size());

        return dataset;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

        });
    }
}
