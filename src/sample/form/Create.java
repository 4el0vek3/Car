package sample.form;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import sample.car.Car;
import sample.table.ModelTable;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
public class Create extends javax.swing.JPanel {
    public static int IDedit;
    public Create() {
        
        initComponents();
        carModelLsit();
        AutoCompleteDecorator.decorate(comboMake);
        AutoCompleteDecorator.decorate(comboCountryManufacture);
        desableModel();
        countryManufactureLsit();
    }
    
    private void desableModel(){
        for(Car i : Car.arrayCars){
            System.out.println(i.getID() + " " + IDedit);
            if(i.getID() == IDedit){
                System.out.println("+");
                if(i.getGeneration().trim().equals("")){
            
            
                } else{
                    textGeneration.setEditable(false);
                    textGeneration.setBackground(new Color(250,250,250));
                    textGeneration.setForeground(new Color(204, 181, 193));
                }
            }
            
            if(i.getID() == IDedit){
                System.out.println("+");
                if(i.getModel().trim().equals("")){
            
            
                } else{
                    textModel.setEditable(false);
                    textModel.setBackground(new Color(250,250,250));
                    textModel.setForeground(new Color(204, 181, 193));
                }
            }
        }
        
        
    }
    
    private void carModelLsit(){
        String[] str = {"","Автокам","Бронто","ГАЗ","Ё","ЗАЗ","ЗИЛ","ЗиС","ИЖ","Канонир","Комбат","ЛуАЗ","Москвич","СМ","ТагАЗ","УАЗ","Эксклюзив","AC","Acura","Adler","Alfa Romeo","Alpina","Alpine","AM General","AMC","Ariel","Aro","Asia","Aston Martin","Audi","Austin","Autobianchi","Bajaj","Baltijas Dzips","Batmobile","Beijing","Bentley","Bertone","Bilenkin","Bitter","BMW","Borgward","Brabus","Bricklin","Brilliance","Bristol","Bufori","Bugatti","Buick","BYD","Byvin","Cadillac","Callaway","Carbodies","Caterham","Changan","ChangFeng","Chery","Chevrolet","Chrysler","Citroen","Cizeta","Coggiola","Dacia","Dadi","Daewoo2","Daihatsu","Daimler","Datsun","De Tomaso","Delage","DeLorean","Derways","DeSoto","Dodge","DongFeng","Doninvest","Donkervoort","DS","E","Eagle","Eagle Cars","Ecomotors","Excalibur","FAW","Ferrari","Fiat","Fisker","Ford","Foton","FSO","Fuqi","Geely","Genesis","Geo","GMC","Gonow","Gordon","Great Wall","Hafei","Haima","Hanomag","Haval","Hawtai","Hindustan","Hispano","Holden","Honda","HuangHai","Hudson","Hummer","Hyundai","Infiniti","Innocenti","Invicta","Iran Khodro","Isdera","Isuzu","JAC","Jaguar","Jeep","Jensen","JMC","Kia","Koenigsegg","KTM AG","LADA (ВАЗ)","Lamborghini","Lancia","Land Rover","Landwind","Lexus","Liebao Motor","Lifan","Lincoln","Lotus","LTI","Luxgen","Mahindra","Marcos","Marlin","Marussia","Maruti","Maserati","Maybach","Mazda","McLare1","Mega","Mercedes","Mercury","Metrocab","MG","Microcar","Minelli","MINI","Mitsubishi","Mitsuoka","Morgan","Morris","Nissan","Noble","Oldsmobile","Opel","Osca","Packard","Pagani","Panoz","Perodua","Peugeot","PGO","Piaggio","Plymouth","Pontiac","Porsche","Premier","Proton","PUCH","Puma","Qoros","Qvale","Ravon","Reliant","Renaissance","Renault","Renault Samsung","Rezvani","Rimac","Rolls","Ronart","Rover","Saab","Saleen","Santana","Saturn","Scion","SEAT","Shanghai Maple","ShuangHuan","Skoda","Smart","Soueast","Spectre","Spyker","SsangYong","Steyr","Subaru","Suzuki","Talbot","TATA","Tatra","Tazzari","Tesla","Think","Tianma","Tianye","Tofas","Toyota","Trabant","Tramontana","Triumph","TVR","Ultima","Vauxhall","Vector","Venturi","Volkswagen","Volvo","Vortex","W Motors","Wanderer","Wartburg","Westfield","Wiesmann","Willys","Xin Kai","Zastava","Zenos","Zenvo","Zibar","Zotye","ZX"};
        for(String i : str){
            comboMake.addItem(i);
        }
    }
    
    private void countryManufactureLsit(){
        String[] str = {"","Абхазия","Австралия","Австрия","Азербайджан","Албания","Алжир","Ам. Виргинские острова","Американское Самоа","Ангола","Андорра","Антигуа и Барбуда","Аргентина","Армения","Аруба","Афганистан","Багамы","Бангладеш","Барбадос","Бахрейн","Белиз","Беларусь","Бельгия","Бенин","Бермудские Острова","Болгария","Боливия","Бонэйр","Босния и Герцеговина","Ботсвана","Бразилия","Бр. Виргинские острова","Бруней","Буркина-Фасо","Бурунди","Бутан","Вануату","Ватикан","Великобритания","Венгрия","Венесуэла","Восточный Тимор","Вьетнам","Габон","Гаити","Гайана","Гамбия","Гана","Гватемала","Гвинея","Гвинея-Бисау","Германия","Гондурас","Гонконг","Гренада","Греция","Грузия","Дания","Д.Р. Конго","Джерси","Джибути","Доминика","Доминикана","Египет","Замбия","Зимбабве","Израиль","Индия","Индонезия","Иордания","Ирак","Иран","Ирландия","Исландия","Испания","Италия","Йемен","Кабо-Верде","Казахстан","Камбоджа","Камерун","Канада","Катар","Кения","Кипр","Киргизия","Кирибати","Китай","Колумбия","Кокосовые острова","Коморские Острова","Конго","КНДР","Коста-Рика","Кот-д'Ивуар","Куба","Кувейт","Кюрасао","Лаос","Латвия","Лесото","Либерия","Ливан","Ливия","Литва","Лихтенштейн","Люксембург","Маврикий","Мавритания","Мадагаскар","Македония","Малави","Малайзия","Мали","Мальта","Мальдивы","Марокко","Маршалловы Острова","Мексика","Мозамбик","Молдова","Монако","Монголия","Мьянма","Намибия","Науру","Непал","Нигер","Нигерия","Нидерланды","Никарагуа","Новая Зеландия","Норвегия","ОАЭ","Оман","Острова Кука","Пакистан","Палау","Панама","Папуа-Новая Гвинея","Парагвай","Перу","Пуэрто-Рико","Польша","Португалия","Россия","Руанда","Румыния","Саба","Сальвадор","Самоа","Сан-Марино","Сан-Томе и Принсипи","Саудовская Аравия","Свазиленд","Сейшелы","Сенегал","Сент-Винсент и Гренадины","Сент-Китс и Невис","Сент-Люсия","Сен-Мартен","Сербия","Сингапур","Синт-Эстатиус","Сирия","Словакия","Словения","США","Соломоновы Острова","Сомали","Судан","Суринам","Сьерра-Леоне","Таджикистан","Таиланд","Танзания","Того","Токелау","Тонга","Тринидад и Тобаго","Тувалу","Тунис","Туркменистан","Турция","Уганда","Узбекситан","Украина","Уоллис и Футуна","Уругвай","Фарерские острова","Фед. Штаты Микронезии","Фиджи","Филиппины","Финляндия","Фолклендские острова","Франция","Французская Полинезия","Хорватия","ЦАР","Чад","Черногория","Чехия","Чили","Швейцария","Швеция","Шри-Ланка","Эквадор","Экваториальная Гвинея","Эритрея","Эстония","Эфиопия","ЮАР","Южная Корея","Южный Судан","Ямайка","Япония"};
        for(String i : str){
            comboCountryManufacture.addItem(i);
        }
    }    
    
    private boolean ifCountryManufacture(String string){
        String[] str = {"Абхазия","Австралия","Австрия","Азербайджан","Албания","Алжир","Ам. Виргинские острова","Американское Самоа","Ангола","Андорра","Антигуа и Барбуда","Аргентина","Армения","Аруба","Афганистан","Багамы","Бангладеш","Барбадос","Бахрейн","Белиз","Беларусь","Бельгия","Бенин","Бермудские Острова","Болгария","Боливия","Бонэйр","Босния и Герцеговина","Ботсвана","Бразилия","Бр. Виргинские острова","Бруней","Буркина-Фасо","Бурунди","Бутан","Вануату","Ватикан","Великобритания","Венгрия","Венесуэла","Восточный Тимор","Вьетнам","Габон","Гаити","Гайана","Гамбия","Гана","Гватемала","Гвинея","Гвинея-Бисау","Германия","Гондурас","Гонконг","Гренада","Греция","Грузия","Дания","Д.Р. Конго","Джерси","Джибути","Доминика","Доминикана","Египет","Замбия","Зимбабве","Израиль","Индия","Индонезия","Иордания","Ирак","Иран","Ирландия","Исландия","Испания","Италия","Йемен","Кабо-Верде","Казахстан","Камбоджа","Камерун","Канада","Катар","Кения","Кипр","Киргизия","Кирибати","Китай","Колумбия","Кокосовые острова","Коморские Острова","Конго","КНДР","Коста-Рика","Кот-д'Ивуар","Куба","Кувейт","Кюрасао","Лаос","Латвия","Лесото","Либерия","Ливан","Ливия","Литва","Лихтенштейн","Люксембург","Маврикий","Мавритания","Мадагаскар","Македония","Малави","Малайзия","Мали","Мальта","Мальдивы","Марокко","Маршалловы Острова","Мексика","Мозамбик","Молдова","Монако","Монголия","Мьянма","Намибия","Науру","Непал","Нигер","Нигерия","Нидерланды","Никарагуа","Новая Зеландия","Норвегия","ОАЭ","Оман","Острова Кука","Пакистан","Палау","Панама","Папуа-Новая Гвинея","Парагвай","Перу","Пуэрто-Рико","Польша","Португалия","Россия","Руанда","Румыния","Саба","Сальвадор","Самоа","Сан-Марино","Сан-Томе и Принсипи","Саудовская Аравия","Свазиленд","Сейшелы","Сенегал","Сент-Винсент и Гренадины","Сент-Китс и Невис","Сент-Люсия","Сен-Мартен","Сербия","Сингапур","Синт-Эстатиус","Сирия","Словакия","Словения","США","Соломоновы Острова","Сомали","Судан","Суринам","Сьерра-Леоне","Таджикистан","Таиланд","Танзания","Того","Токелау","Тонга","Тринидад и Тобаго","Тувалу","Тунис","Туркменистан","Турция","Уганда","Узбекситан","Украина","Уоллис и Футуна","Уругвай","Фарерские острова","Фед. Штаты Микронезии","Фиджи","Филиппины","Финляндия","Фолклендские острова","Франция","Французская Полинезия","Хорватия","ЦАР","Чад","Черногория","Чехия","Чили","Швейцария","Швеция","Шри-Ланка","Эквадор","Экваториальная Гвинея","Эритрея","Эстония","Эфиопия","ЮАР","Южная Корея","Южный Судан","Ямайка","Япония"};
        for(String i : str){
            if(string.equals(i)){
                return true;
            }
        }
        return false;
    }
    
    private boolean ifCarModelLsit(String string){
        String[] str = {"Автокам","Бронто","ГАЗ","Ё","ЗАЗ","ЗИЛ","ЗиС","ИЖ","Канонир","Комбат","ЛуАЗ","Москвич","СМ","ТагАЗ","УАЗ","Эксклюзив","AC","Acura","Adler","Alfa Romeo","Alpina","Alpine","AM General","AMC","Ariel","Aro","Asia","Aston Martin","Audi","Austin","Autobianchi","Bajaj","Baltijas Dzips","Batmobile","Beijing","Bentley","Bertone","Bilenkin","Bitter","BMW","Borgward","Brabus","Bricklin","Brilliance","Bristol","Bufori","Bugatti","Buick","BYD","Byvin","Cadillac","Callaway","Carbodies","Caterham","Changan","ChangFeng","Chery","Chevrolet","Chrysler","Citroen","Cizeta","Coggiola","Dacia","Dadi","Daewoo2","Daihatsu","Daimler","Datsun","De Tomaso","Delage","DeLorean","Derways","DeSoto","Dodge","DongFeng","Doninvest","Donkervoort","DS","E","Eagle","Eagle Cars","Ecomotors","Excalibur","FAW","Ferrari","Fiat","Fisker","Ford","Foton","FSO","Fuqi","Geely","Genesis","Geo","GMC","Gonow","Gordon","Great Wall","Hafei","Haima","Hanomag","Haval","Hawtai","Hindustan","Hispano","Holden","Honda","HuangHai","Hudson","Hummer","Hyundai","Infiniti","Innocenti","Invicta","Iran Khodro","Isdera","Isuzu","JAC","Jaguar","Jeep","Jensen","JMC","Kia","Koenigsegg","KTM AG","LADA (ВАЗ)","Lamborghini","Lancia","Land Rover","Landwind","Lexus","Liebao Motor","Lifan","Lincoln","Lotus","LTI","Luxgen","Mahindra","Marcos","Marlin","Marussia","Maruti","Maserati","Maybach","Mazda","McLare1","Mega","Mercedes","Mercury","Metrocab","MG","Microcar","Minelli","MINI","Mitsubishi","Mitsuoka","Morgan","Morris","Nissan","Noble","Oldsmobile","Opel","Osca","Packard","Pagani","Panoz","Perodua","Peugeot","PGO","Piaggio","Plymouth","Pontiac","Porsche","Premier","Proton","PUCH","Puma","Qoros","Qvale","Ravon","Reliant","Renaissance","Renault","Renault Samsung","Rezvani","Rimac","Rolls","Ronart","Rover","Saab","Saleen","Santana","Saturn","Scion","SEAT","Shanghai Maple","ShuangHuan","Skoda","Smart","Soueast","Spectre","Spyker","SsangYong","Steyr","Subaru","Suzuki","Talbot","TATA","Tatra","Tazzari","Tesla","Think","Tianma","Tianye","Tofas","Toyota","Trabant","Tramontana","Triumph","TVR","Ultima","Vauxhall","Vector","Venturi","Volkswagen","Volvo","Vortex","W Motors","Wanderer","Wartburg","Westfield","Wiesmann","Willys","Xin Kai","Zastava","Zenos","Zenvo","Zibar","Zotye","ZX"};
        for(String i : str){
            if(string.equals(i)){
                return true;
            }
        }
        return false;
    }
    
    public Object[] getDate(){
        boolean choice = false;
        int ID = Car.getCountID();
        String make = (String)comboMake.getSelectedItem();
        String model = textModel.getText().trim();
        String generation = textGeneration.getText().trim();
        String color = textColor.getText().trim();
        String yearManufacture = textYearManufacture.getText().trim();
        String engineCapacity = textEngineCapacity.getText().trim();/////// 
        String engineType = (String)comboEngineType.getSelectedItem();//////////////
        String power = textPower.getText().trim();
        String transmission = (String)comboTransmission.getSelectedItem();
        String drive = (String)comboDrive.getSelectedItem();
        String length = textLength.getText().trim();
        String height = textHeight.getText().trim();
        String width = textWidth.getText().trim();
        String countryManufacture = (String)comboCountryManufacture.getSelectedItem();
        if(!ifCountryManufacture(countryManufacture)){
            countryManufacture = null;
        } else{
            countryManufacture.trim();
        }
        
        if(!ifCarModelLsit(make)){
            make = null;
        } else{
            make.trim();
        }
        ModelTable objCar = new ModelTable(choice, ID, make, model, generation, color, yearManufacture, engineCapacity, engineType, power, transmission, drive, length, height, width, countryManufacture);
        //ModelTable.addToTableAndArray(objCar);       
        
        Object[] obj = new Object[]{false, ID, make, model, generation, color, yearManufacture, engineCapacity, engineType, power, transmission, drive, length, height, width, countryManufacture};
        
        return ModelTable.addToTableAndArray(objCar, false);
    }
    
public Object[] editDate(ArrayList<Integer> list){
        boolean choice = false;
        int ID = list.get(0);
        String make = (String)comboMake.getSelectedItem();
        if(make != null){
            make.trim();
        }
        String model = textModel.getText().trim();
        System.out.println(model+"!");
        String generation = textGeneration.getText().trim();
        String color = textColor.getText().trim();
        String yearManufacture = textYearManufacture.getText().trim();
        String engineCapacity = textEngineCapacity.getText().trim();///////
        String engineType = (String)comboEngineType.getSelectedItem();//////////////
        String power = textPower.getText().trim();
        String transmission = (String)comboTransmission.getSelectedItem();
        String drive = (String)comboDrive.getSelectedItem();
        String length = textLength.getText().trim();
        String height = textHeight.getText().trim();
        String width = textWidth.getText().trim();
        String countryManufacture = (String)comboCountryManufacture.getSelectedItem();
        if(countryManufacture != null){
            countryManufacture.trim();
        }
        desableModel();
        //System.out.println(countryManufacture);
        ModelTable objCar = new ModelTable(choice, ID, make, model, generation, color, yearManufacture, engineCapacity, engineType, power, transmission, drive, length, height, width, countryManufacture);
        //ModelTable.addToTableAndArray(objCar);      
        Object[] obj = ModelTable.addToTableAndArray(objCar, true);
        return obj;
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        comboMake1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textModel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textGeneration = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textColor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textYearManufacture = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textEngineCapacity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboEngineType = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        textPower = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textLength = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textHeight = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textWidth = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        comboDrive = new javax.swing.JComboBox<>();
        comboTransmission = new javax.swing.JComboBox<>();
        comboMake = new javax.swing.JComboBox<>();
        comboCountryManufacture = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        comboMake1.setEditable(true);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel15.setText("Марка");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Модель");

        textModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textModelActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Поколение");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Цвет");

        textColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textColorActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Год производства");

        textYearManufacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textYearManufactureActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Объем двигателя");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Тип двигателя");

        comboEngineType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Бензин", "Дизель", "Газ", "Элекьтичество", "Гибрид" }));
        comboEngineType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEngineTypeActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Мощьность л. с.");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Коробка передач");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Привод");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Длина в мм.");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Высота в мм.");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("Ширина в мм.");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setText("Страна производства");

        comboDrive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Передний", "Задний", "Полный" }));

        comboTransmission.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Автомат", "Вариатор", "Механика", "Робот" }));
        comboTransmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTransmissionActionPerformed(evt);
            }
        });

        comboMake.setEditable(true);

        comboCountryManufacture.setEditable(true);
        comboCountryManufacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCountryManufactureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(textGeneration, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(textColor, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(textYearManufacture, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(textEngineCapacity, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(comboEngineType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(textPower, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(textHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboTransmission, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboDrive, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textLength, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textWidth, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                            .addComponent(comboCountryManufacture, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboMake, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textModel, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textGeneration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textYearManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textEngineCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboEngineType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textPower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboTransmission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboDrive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(textHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(textWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(comboCountryManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboEngineTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEngineTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEngineTypeActionPerformed

    private void textModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textModelActionPerformed

    private void textColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textColorActionPerformed

    private void comboTransmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTransmissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTransmissionActionPerformed

    private void textYearManufactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textYearManufactureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textYearManufactureActionPerformed

    private void comboCountryManufactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCountryManufactureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCountryManufactureActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboCountryManufacture;
    private javax.swing.JComboBox<String> comboDrive;
    private javax.swing.JComboBox<String> comboEngineType;
    private javax.swing.JComboBox<String> comboMake;
    private javax.swing.JComboBox<String> comboMake1;
    private javax.swing.JComboBox<String> comboTransmission;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField textColor;
    private javax.swing.JTextField textEngineCapacity;
    private javax.swing.JTextField textGeneration;
    private javax.swing.JTextField textHeight;
    private javax.swing.JTextField textLength;
    private javax.swing.JTextField textModel;
    private javax.swing.JTextField textPower;
    private javax.swing.JTextField textWidth;
    private javax.swing.JTextField textYearManufacture;
    // End of variables declaration//GEN-END:variables

    public void loadDate(ArrayList<Integer> list) {
            //System.out.println("+");
            Car car = new Car();
            for(Car i : Car.arrayCars){
                if(list.get(0)==i.getID()){
                    car = i;
                }
            }
            //textMake.setText("\\\\\\");
            //String a1 = String.valueOf(car.getEngineCapacity());
            //System.out.println(car);
            
            comboMake.setEnabled(false);
            comboCountryManufacture.setEnabled(false);
            
            Object[] obj = Car.CarToStringToTable(car);
            comboMake.setSelectedItem(String.valueOf(obj[2]));
            textModel.setText(String.valueOf(obj[3]));
            textGeneration.setText(String.valueOf(obj[4]));
            textColor.setText(String.valueOf(obj[5]));
            textYearManufacture.setText(String.valueOf(obj[6]));
            textEngineCapacity.setText(String.valueOf(obj[7]));
            
            comboEngineType.setSelectedItem(String.valueOf(obj[8]));///////////////////
            
            textPower.setText(String.valueOf(obj[9]));
            
            comboTransmission.setSelectedItem(String.valueOf(obj[10]));////////////////
            comboDrive.setSelectedItem(String.valueOf(obj[11]));///////////////////////
            
            textLength.setText(String.valueOf(obj[12]));
            textHeight.setText(String.valueOf(obj[13]));
            textWidth.setText(String.valueOf(obj[14]));        
            comboCountryManufacture.setSelectedItem(String.valueOf(obj[15]));
            
            
        
    }

    
}
