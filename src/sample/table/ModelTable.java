package sample.table;

import sample.car.Car;

public class ModelTable {
    public static int ifError = 0;

    private boolean choice;
    private int ID;
    private String make;
    private String model;
    private String generation;          //поколение
    private String color;
    private String yearManufacture;        //Год производства
    private String engineCapacity;      //Объем двигателя
    private String engineType;          //Тип двигателя
    private String power;                  //Мощность л.с.
    private String transmission;        //Коробка передач
    private String drive;               //Привод
    private String length;                 //в милиметрах
    private String height;                 //в милиметрах
    private String width;                  //в милиметрах
    private String countryManufacture;  //Страна изготовленяи

    public ModelTable(boolean choice, int ID, String make, String model, String generation, String color, String yearManufacture, String engineCapacity, String engineType, String power, String transmission, String drive, String length, String height, String width, String countryManufacture) {
        this.choice = choice;
        this.ID = ID;
        this.make = make;
        this.model = model;
        this.generation = generation;
        this.color = color;
        this.yearManufacture = yearManufacture;
        this.engineCapacity = engineCapacity;
        this.engineType = engineType;
        this.power = power;
        this.transmission = transmission;
        this.drive = drive;
        this.length = length;
        this.height = height;
        this.width = width;
        this.countryManufacture = countryManufacture;
    }

    public boolean getChoice() {
        return choice;
    }

    public int getID() {
        return ID;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getGeneration() {
        return generation;
    }

    public String getColor() {
        return color;
    }

    public String getYearManufacture() {
        return yearManufacture;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public String getPower() {
        return power;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getDrive() {
        return drive;
    }

    public String getLength() {
        return length;
    }

    public String getHeight() {
        return height;
    }

    public String getWidth() {
        return width;
    }

    public String getCountryManufacture() {
        return countryManufacture;
    }
    
    public static Object[] addToTableAndArray(ModelTable tableRow, boolean ifEdit){
        
        boolean finalChoice = tableRow.getChoice();
        int finalID = tableRow.getID();
        String finalMake = tableRow.getMake();
        String finalModel = tableRow.getModel();
        String finalGeneration = tableRow.getGeneration();
        String finalColor = tableRow.getColor();
        String finalYearManufacture;
        String finalEngineType = tableRow.getEngineType();
        String finalEngineCapacity;
        String finalPower;
        String finalTransmission = tableRow.getTransmission();
        String finalDrive = tableRow.getDrive();
        String finalLength;
        String finalHeight;
        String finalWidth;
        String finalCountryManufacture = tableRow.getCountryManufacture();
        
        //System.out.println(finalCountryManufacture);
        try {
            int integerYearManufacture = Integer.parseInt(tableRow.getYearManufacture());
            if(integerYearManufacture <= 1885 || integerYearManufacture >= 2025){
                throw new Exception();
            }
            finalYearManufacture = String.valueOf(integerYearManufacture);
        } catch (Exception e) {
            if(!tableRow.getYearManufacture().isEmpty()){
                tableRow.getYearManufacture();
                //System.out.println("!"+tableRow.getYearManufacture()+"!");
                ifError = 1;
            }
            finalYearManufacture = "0";
        }
        
        try {
            double integerEngineCapacity = Double.parseDouble(tableRow.getEngineCapacity());
            if(integerEngineCapacity < 0.0005 || integerEngineCapacity > 1065){
                throw new Exception();
            }
            finalEngineCapacity = String.valueOf(integerEngineCapacity);
        } catch (Exception e) {
            if(!tableRow.getEngineCapacity().isEmpty()){
                //System.out.println("1");
                
                ifError = 1;
            }
            finalEngineCapacity = "0";
            //System.out.println("+"+tableRow.getEngineCapacity());
        }
        
         try {
            int IntegerPower = Integer.parseInt(tableRow.getPower());
            if(IntegerPower < 4.2 || IntegerPower > 4000){
                throw new Exception();
            }
            finalPower = String.valueOf(IntegerPower);
        } catch (Exception e) {
            if(!tableRow.getPower().isEmpty()){
                //System.out.println("2");
                ifError = 1;
            }
            finalPower = "0";
        }    
         
        try {
            int integerLength = Integer.parseInt(tableRow.getLength());
            if(integerLength < 137 || integerLength > 230000){
                throw new Exception();
            }
            finalLength = String.valueOf(integerLength);
        } catch (Exception e) {
            if(!tableRow.getLength().isEmpty()){
                //System.out.println("3");
                ifError = 1;
            }
            finalLength = "0";
        }
        
        try {
            int integerHeight = Integer.parseInt(tableRow.getHeight());
            if(integerHeight < 120 || integerHeight > 138000){
                throw new Exception();
            }    
            finalHeight = String.valueOf(integerHeight);
        } catch (Exception e) {
            if(!tableRow.getHeight().isEmpty()){
                //System.out.println("4");
                ifError = 1;
            }
            finalHeight = "0";
        }
        
        try {
            int integerWidth = Integer.parseInt(tableRow.getWidth());
            if(integerWidth < 104 || integerWidth > 46000){
                throw new Exception();
            }       
            finalWidth = String.valueOf(integerWidth);
        } catch (Exception e) {
            if(!tableRow.getWidth().isEmpty()){
                //System.out.println("5");
                ifError = 1;
            }
            finalWidth = "0";
        }
        
        
        //System.out.println(finalMake + "!");
        
        if((finalMake == "" && finalCountryManufacture != "") || (finalMake == " " && finalCountryManufacture != " ")){
            ifError = 2;
            return null;
        }
        
        if(((finalCountryManufacture == "") && finalMake != "") || (finalCountryManufacture == " " && finalMake != " ")){
            ifError = 3;
            return null;
        }  
        if((finalCountryManufacture == "" && finalMake == "") || (finalCountryManufacture == "" && finalMake == "")){
            ifError = 4;
            return null;
        }
        
        if(finalCountryManufacture == null && finalMake == null){
            ifError = 7;
            return null;
        }   
        if(finalCountryManufacture == null){
            //System.out.println("++");
            ifError = 5;
            return null;
        }    
        
        if(finalMake == null){
            ifError = 6;
            return null;
        }  
        ModelTable a = new ModelTable(finalChoice, finalID, finalMake, finalModel, finalGeneration, finalColor, finalYearManufacture, finalEngineCapacity,  finalEngineType,finalPower, finalTransmission, finalDrive, finalLength, finalHeight, finalWidth, finalCountryManufacture);
        Car car = new Car();
        if(ifEdit == false){
            car = Car.addCar(a);
        }
        else{
            car = Car.editCar(a);
            
        } 
        
        if(finalYearManufacture == "0") finalYearManufacture = "";
        if(finalEngineCapacity == "0") finalEngineCapacity = "";
        if(finalPower == "0") finalPower = "";
        if(finalLength == "0") finalLength = "";
        if(finalHeight == "0") finalHeight = "";
        if(finalWidth == "0") finalWidth = "";
        //System.out.println("------------------------------------------------+++++++++++++++++++++++++++__________________");
        //System.out.println(car);
        return Car.CarToStringToTable(car);
                
    }
    
    
    @Override
    public String toString() {
         return  "------------------------------" +
                "\n ID: " + ID +
                "\n Марка:               "  + make +
                "\n Модель:              "  + model +
                "\n Поколение:           "  + generation +
                "\n Цвет:                "  + color +
                "\n Год производства:    "  + yearManufacture +
                "\n Объем двигателя:     "  + engineCapacity +
                "\n Тип двигателя:       "  + engineType +
                "\n Мощьность л.с.:      "  + power +
                "\n Коробка передач:     "  + transmission +
                "\n Привод:              "  + drive  +
                "\n Длина:               "  + length +
                "\n Высота:              "  + height +
                "\n Ширина:              "  + width +
                "\n Страна производства: "  + countryManufacture +
                "\n";
    }
    
    
}
