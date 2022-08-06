package com.batuhanaslan.insuranceagent.anadolubankbootcamp.helper;

import com.batuhanaslan.insuranceagent.anadolubankbootcamp.service.PolicyService;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import javax.swing.*;


public class BarChartHelper extends JFrame {
    AbstractApplicationContext ctx = null;

    private static final long serialVersionUID = 1L;

    public BarChartHelper() {


        // Create Dataset
        CategoryDataset dataset = createDataset();

        //Create chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Ortalama Ücret ve Poliçe Sayısı", //Chart Title
                "", // Category axis
                "Miktar", // Value axis
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false
        );

        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PolicyService policyService = ctx.getBean(PolicyService.class);

        dataset.addValue(policyService.getPolicySum(), "Toplam", "Ortalama Ücret");
        dataset.addValue(policyService.list().size(), "Toplam", "Toplam Sayı");


        return dataset;
    }



}
