package JFrameDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventDemo {
    private JFrame frame;
    private JComboBox jcbProvince, jcbCity;
    private JLabel labelProvince, labelCity;

    private String[] province;
    private String[][] city;

    public ItemEventDemo(String[] province, String[][] city) {
        this.province = province;
        this.city = city;

        frame = new JFrame("Item Event Demo");
        jcbProvince = new JComboBox(province);
        jcbCity = new JComboBox(city[0]);

        labelProvince = new JLabel("省份");
        labelCity = new JLabel("城市");

        frame.setLayout(new FlowLayout(3));
        frame.add(labelProvince);
        frame.add(jcbProvince);
        frame.add(labelCity);
        frame.add(jcbCity);

        addEventHandler();

    }

    public void addEventHandler() {
        jcbProvince.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int index = jcbProvince.getSelectedIndex();
                jcbCity.removeAllItems();
                for (int i = 0; i < city[index].length; i++) {
                    jcbCity.addItem(city[index][i]);
                }
            }
        });
    }

    public void init() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //frame.setSize(new Dimension(400, 300));
        frame.pack();
    }

    public static void main(String[] args) {
        String[] province = {"--SELECT--",
                            "河北", "山东", "江苏", "浙江", "陕西"};
        String[][] city = {
                {"--SELECT--"},
                {"石家庄", "保定", "邯郸", "唐山", "秦皇岛"},
                {"济南", "青岛", "烟台", "威海", "潍坊"},
                {"南京", "苏州", "无锡", "镇江", "常州", "扬州", "连云港", "南通", "泰州","徐州","宿迁","盐城","淮安"},
                {"杭州", "温州", "宁波", "金华", "台州"},
                {"西安", "咸阳", "汉中", "延安", "宝鸡"}
        };

        ItemEventDemo item = new ItemEventDemo(province, city);
        item.init();
        item.addEventHandler();
    }
}
