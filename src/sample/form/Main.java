package sample.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import raven.popup.DefaultOption;
import raven.popup.GlassPanePopup;
import raven.popup.GlassPopup;
import raven.popup.component.SimplePopupBorder;
import raven.toast.Notifications;
import sample.car.Car;
import sample.table.CheckBoxTableHeaderRenderer;
import sample.table.TableHeaderAlignment;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import javax.swing.JTable;
import sample.file.fileManager;
import sample.table.ModelTable;
import javax.swing.JComboBox;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;



public class Main extends javax.swing.JFrame {

    public Main() {
        
        initComponents();
        //table.setAutoCreateRowSorter(true); сортировка таблицы(больше 10 элементов редактирование сбивается)
        init();
    }

    private void init(){
        
        GlassPanePopup.install(this);
        Notifications.getInstance().setJFrame(this);
        panel.putClientProperty(FlatClientProperties.STYLE, ""
            + "arc:25;"
            + "background:$Table.background");
        
        table.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
            + "height:30;"
            + "hoverBackground:null;"
            + "pressedBackground:null;"
            + "separatorColor:$TableHeader.background;"
            + "font:bold;");
        
        table.putClientProperty(FlatClientProperties.STYLE, ""
            + "rowHeight: 30;"
            + "showHorizontalLines:true;"
            + "intercellSpacing:0,1;"
            + "cellFocusColor:$TableHeader.hoverBackground;"
            + "selectionBackground:$TableHeader.hoverBackground;"
            + "selectionForeground:$Table.foreground;");
        
        scroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
            + "trackArc:999;"
            + "trackInsets:3,3,3,3;"
            + "thumbInsets:3,3,3,3;"
            + "background:$Table.background;");
        
        textSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Поиск по id...");
        textSearch.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("sample/icon/glassmagnifiermagnifyingsearchsearchingweb_123111.svg"));
        textSearch.putClientProperty(FlatClientProperties.STYLE, ""
            + "arc:15;"
            + "borderWidth:0;"
            + "focusWidth:0;"
            + "innerFocusWidth:0;"
            + "margin:5,20,5,20;"
            + "background:$Panel.background;");
        
        table.getColumnModel().getColumn(0).setHeaderRenderer(new CheckBoxTableHeaderRenderer(table, 0));
        table.getTableHeader().setDefaultRenderer(new TableHeaderAlignment(table));
        
        testData();
    }
    
    private void testData(){
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        addFileCarToTable();
        //System.out.println("+");
        fileManager.getDraftCurrentID();
//        model.addRow(new Object[]{false, 1, "Toyota", "Corolla", "XI", "Черный","2008", "1.6", "Бензин", "124", "Автомат", "Передний", "4540", "1470", "1760", "Япония"});
//        model.addRow(new Object[]{false, 2, "Volkswagen", "Jetta", "VI", "Белый","2012", "1.6", "Бензин", "105", "Автомат", "Передний", "4644", "1482", "1778", "Германия"});
//        model.addRow(new Object[]{false, 3, "Geely", "Emgrand", "I", "Синий","2023", "1.5", "Бензин", "122", "Автомат", "Передний", "4638", "1460", "1822", "Китай"});
//        model.addRow(new Object[]{false, 4, "Isuzu", "ELF", "VI", "Белый","2023", "3", "Дизель", "124", "Механика", "Задний", "5595", "3145", "2180", "Япония"});
    }
    
    private void loadData(Object[] obj){
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        
        model.addRow(obj);
        //System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
        //for(Car i : Car.getCars()){System.out.println(i);}
        
    }
     private void editData(Object[] obj){
        int row = 0;
        for(int i = 0; i < table.getRowCount(); i++){
            if((boolean)table.getValueAt(i, 0)){
                row = i;
                break;
            }
        }
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setValueAt(false, row, 0);
        for(int i = 2; i < table.getColumnCount(); i++){
            //System.out.print(obj[i]+" ");
            model.setValueAt(obj[i], row, i);
            //System.out.println("@  "+model.getValueAt(row, i));
            //Car.ge
        }
        
        //for(Car i : Car.getCars()){System.out.println(i);}
        
    }
    public void searchData(String search){
        int column = 1;
        String searchType = (String)comboSearch.getSelectedItem();
        switch (searchType) {
            case "Поиск по id":
                column = 1;
                break;
            case "Поиск по марке":
                column = 2;
                break;
            case "Поиск по модели":
                column = 3;
                break;
            case "Поиск по поколению":
                column = 4;
                break;
            case "Поиск по цвету":
                column = 5;
                break;
            case "Поиск по году производства":
                column = 6;
                break;
            case "Поиск по объему двигателя":
                column = 7;
                break;
            case "Поиск по типу двигателя":
                column = 8;
                break;
            case "Поиск по мощности":
                column = 9;
                break;
            case "Поиск по коробке передач":
                column = 10;
                break;
            case "Поиск по приводу":
                column = 11;
                break;
            case "Поиск по длине":
                column = 12;
                break;
            case "Поиск по высоте":
                column = 13;
                break;
            case "Поиск по ширине":
                column = 14;
                break;
            case "Поиск по стране производства":
                column = 15;
                break;    
        }
        
        
        
        try {
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            if(table.isEditing()){
                table.getCellEditor().stopCellEditing();
            }
            int countLine = model.getRowCount();
            model.setRowCount(0);
            
            for(Car car : Car.arrayCars){
                Object[] obj = car.carSearch(search, column);
                if(obj != null){
                    model.addRow(obj);
                }
                
            }
            
        } catch (Exception e) {
            
        }
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        textSearch = new javax.swing.JTextField();
        cmdDelete = new sample.swing.ButtonAction();
        cmdEdit = new sample.swing.ButtonAction();
        cmdNew = new sample.swing.ButtonAction();
        cmdSave = new sample.swing.ButtonAction();
        comboSearch = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Выбор", "ID", "Марка", "Модель", "Поколение", "Цвет", "Год производства", "Объем двигателя", "Тип двигателя", "Мощность л.с.", "Коробка передач", "Привод", "Длина мм.", "Высота мм.", "Ширина мм.", "Страна производства"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        scroll.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMaxWidth(40);
            table.getColumnModel().getColumn(1).setMaxWidth(40);
            table.getColumnModel().getColumn(2).setPreferredWidth(65);
            table.getColumnModel().getColumn(3).setPreferredWidth(65);
            table.getColumnModel().getColumn(4).setPreferredWidth(100);
            table.getColumnModel().getColumn(4).setMaxWidth(120);
            table.getColumnModel().getColumn(5).setPreferredWidth(65);
            table.getColumnModel().getColumn(5).setMaxWidth(100);
            table.getColumnModel().getColumn(6).setPreferredWidth(100);
            table.getColumnModel().getColumn(7).setPreferredWidth(100);
            table.getColumnModel().getColumn(8).setPreferredWidth(100);
            table.getColumnModel().getColumn(8).setMaxWidth(130);
            table.getColumnModel().getColumn(9).setPreferredWidth(100);
            table.getColumnModel().getColumn(10).setPreferredWidth(110);
            table.getColumnModel().getColumn(11).setPreferredWidth(65);
            table.getColumnModel().getColumn(12).setPreferredWidth(65);
            table.getColumnModel().getColumn(13).setPreferredWidth(65);
            table.getColumnModel().getColumn(14).setPreferredWidth(65);
            table.getColumnModel().getColumn(15).setPreferredWidth(120);
        }

        textSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSearchActionPerformed(evt);
            }
        });
        textSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textSearchKeyReleased(evt);
            }
        });

        cmdDelete.setText("Удалить");
        cmdDelete.setMaximumSize(new java.awt.Dimension(120, 28));
        cmdDelete.setMinimumSize(new java.awt.Dimension(120, 28));
        cmdDelete.setPreferredSize(new java.awt.Dimension(125, 28));
        cmdDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteActionPerformed(evt);
            }
        });

        cmdEdit.setText("Редактировать");
        cmdEdit.setPreferredSize(new java.awt.Dimension(125, 28));
        cmdEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditActionPerformed(evt);
            }
        });

        cmdNew.setText("Добавить");
        cmdNew.setPreferredSize(new java.awt.Dimension(125, 28));
        cmdNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNewActionPerformed(evt);
            }
        });

        cmdSave.setText("Сохранить");
        cmdSave.setPreferredSize(new java.awt.Dimension(125, 28));
        cmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveActionPerformed(evt);
            }
        });

        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Поиск по id", "Поиск по марке", "Поиск по модели", "Поиск по поколению", "Поиск по цвету", "Поиск по году производства", "Поиск по объему двигателя", "Поиск по типу двигателя", "Поиск по мощности", "Поиск по коробке передач", "Поиск по приводу", "Поиск по длине", "Поиск по высоте", "Поиск по ширине", "Поиск по стране производства" }));
        comboSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdNew, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdSave, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSearchActionPerformed

    }//GEN-LAST:event_textSearchActionPerformed
    private void updateTable(){
        String searchText = textSearch.getText();
        System.out.println(searchText);
    }
    
    private void cmdDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteActionPerformed
        ArrayList<Integer> list = getSelectedData();
        //System.out.println(list);
        if(!list.isEmpty()){
            for(int i : list){
                //System.out.println(list.get(i));
                if(fileManager.delCar(i)){
                    Notifications.getInstance().show(Notifications.Type.SUCCESS,"Машина удалена");
                } else{
                    Notifications.getInstance().show(Notifications.Type.WARNING,"Ошибка удаления машины");
                }
            }
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.setRowCount(0);
            for(Car car : Car.arrayCars){
                loadData(Car.CarToStringToTable(car));
            }
        } else{
            Notifications.getInstance().show(Notifications.Type.WARNING,"Выберите машину для удаления");
        }
    }//GEN-LAST:event_cmdDeleteActionPerformed

    private void cmdEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditActionPerformed
        
        ArrayList<Integer> list = getSelectedData();
        
        if(!list.isEmpty()){////////////////////////////////////////////////////////////////////////////////
            if(list.size() == 1){
                
                Create create = new Create();
                create.loadDate(list);
                
                //create.loadDate(list);////////////////////////////////////////////////////////////////////
                //System.out.println("++");/////////////////////////////////////////////////////////////////
                ////////////////////////////////////////////////////////////////////////////////////////////
                DefaultOption option = new DefaultOption(){/////////////////////////////////////////////////
                    @Override
                    public boolean closeWhenClickOutside() {////////////////////////////////////////////////
                        return true;////////////////////////////////////////////////////////////////////////
                    }///////////////////////////////////////////////////////////////////////////////////////
                };//////////////////////////////////////////////////////////////////////////////////////////
//                System.out.println("======================");
//                for(Car i : Car.arrayCars){
//                    System.out.println(i);
//                }
                String actions[] = new String[]{"Отмена", "Сохранить"};
                GlassPanePopup.showPopup(new SimplePopupBorder(create, "Редактировать машину", actions, (pc, i) -> {
                    if(i == 1){
                        //edit
                        try {
                            
                            editData(create.editDate(list));
                            
                            //loadData();
                            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Машина была отредактирвана");
                            if(ModelTable.ifError == 1){
                                Notifications.getInstance().show(Notifications.Type.WARNING,"Параметры введен некорректно были удалены");
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        pc.closePopup();
                    } else{
                        pc.closePopup();
                    }
                    ModelTable.ifError = 0;
                }), option);
                //////////////////////////////////////////////////////////////////////////////////////////
            } else{
                Notifications.getInstance().show(Notifications.Type.WARNING,"Редактировать можно только одну машину за раз");
            }
        } else{
            Notifications.getInstance().show(Notifications.Type.WARNING,"Выберите машину для редактирования");
        }
    }//GEN-LAST:event_cmdEditActionPerformed

    private ArrayList<Integer> getSelectedData(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < table.getRowCount(); i++){
            if((boolean)table.getValueAt(i, 0)){
                int data = (Integer)table.getValueAt(i, 1);
                Create.IDedit = data;
                list.add(data);
                //System.out.println(data);
            }
        }
        //for(Object i : list){
        //    System.out.println("! " + i);
        //}
        return list;
    }
    
    private void cmdNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNewActionPerformed
        Create create = new Create();
        DefaultOption option = new DefaultOption(){
            @Override
            public boolean closeWhenClickOutside() {
                return true;
            }
        };
        String actions[] = new String[]{"Отмена", "Сохранить"};
        GlassPanePopup.showPopup(new SimplePopupBorder(create, "Добавить машину", actions, (pc, i) -> {
            if(i == 1){
                //save
                try {
                    Object[] obj = create.getDate();
                    if(ModelTable.ifError == 0 || ModelTable.ifError == 1){
                        loadData(obj);
                    }
                    //loadData();
                    if(ModelTable.ifError == 0){
                        Notifications.getInstance().show(Notifications.Type.SUCCESS, "Машина была добавлена");
                    }
                    if(ModelTable.ifError == 1){
                        Notifications.getInstance().show(Notifications.Type.WARNING,"Параметры введеные некорректно были удалены");
                    }
                    if(ModelTable.ifError == 2){
                        Notifications.getInstance().show(Notifications.Type.WARNING,"Машина не добавлена, не укзана марка");
                    }
                    if(ModelTable.ifError == 3){
                        Notifications.getInstance().show(Notifications.Type.WARNING,"Машина не добавлена, не укзана страна производства");
                    }
                    if(ModelTable.ifError == 4){
                        Notifications.getInstance().show(Notifications.Type.WARNING,"Машина не добавлена, не введены ключевые параметры");
                    }
                    if(ModelTable.ifError == 5){
                        Notifications.getInstance().show(Notifications.Type.WARNING,"Машина не добавлена, неверно укзана страна производства");
                    }
                    if(ModelTable.ifError == 6){
                        Notifications.getInstance().show(Notifications.Type.WARNING,"Машина не добавлена, неверно укзана марка машины");
                    }
                    if(ModelTable.ifError == 7){
                        Notifications.getInstance().show(Notifications.Type.WARNING,"Машина не добавлена, неверно укзаны ключевые параметры");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                pc.closePopup();
            } else{
                pc.closePopup();
            }
            ModelTable.ifError = 0;
        }), option);
        
    }//GEN-LAST:event_cmdNewActionPerformed

    private void cmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveActionPerformed
        if(fileManager.carsToFile()){
            Notifications.getInstance().show(Notifications.Type.WARNING, "Ошибка сохранения");
        } else{
            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Список был сохранен");
        }
    }//GEN-LAST:event_cmdSaveActionPerformed

    private void textSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textSearchKeyReleased
        searchData(textSearch.getText().trim());
        //System.out.println(textSearch.getText().trim());
    }//GEN-LAST:event_textSearchKeyReleased

    private void comboSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSearchActionPerformed
        String searchType = (String)comboSearch.getSelectedItem();
        textSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, searchType+"...");
    }//GEN-LAST:event_comboSearchActionPerformed

    public static void main(String args[]) {
        //ArrayList<Car> cars = new ArrayList<>();
        
        
        
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("sample.thems");
        UIManager.put("defaulFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
        
        
        
    }
    private void addFileCarToTable(){
        for(Car i :fileManager.carFileToArray()){
            //System.out.println(i.toString());
            Car.arrayCars.add(i);
            loadData(Car.CarToStringToTable(i));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sample.swing.ButtonAction cmdDelete;
    private sample.swing.ButtonAction cmdEdit;
    private sample.swing.ButtonAction cmdNew;
    private sample.swing.ButtonAction cmdSave;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    private javax.swing.JTextField textSearch;
    // End of variables declaration//GEN-END:variables
}
