package sample.car;

import java.util.ArrayList;
import sample.table.ModelTable;

public class Car{
    private static final int countParameters = 16;
    private static int countID = 1;
    public static ArrayList<Car> arrayCars = new ArrayList<>();
    
    private boolean choice;
    private int ID;
    private String make;
    private String model;
    private String generation;          //поколение
    private String color;
    private int yearManufacture;        //Год производства
    private double engineCapacity;      //Объем двигателя    
    private String engineType;          //Тип двигателя
    private int power;                  //Мощность л.с.
    private String transmission;        //Коробка передач
    private String drive;               //Привод
    private int length;                 //в милиметрах
    private int height;                 //в милиметрах
    private int width;                  //в милиметрах
    private String countryManufacture;  //Страна изготовленяи

    public Car(boolean choise, int ID, String make, String model, String generation, String color, int yearManufacture,  double engineCapacity, String engineType,int power, String transmission, String drive, int length, int height, int width, String countryManufacture) {
        this.ID = ID;
        this.make = make;
        this.model = model;
        this.generation = generation;
        this.color = color;
        this.yearManufacture = yearManufacture;
        this.engineType = engineType;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.transmission = transmission;
        this.drive = drive;
        this.length = length;
        this.height = height;
        this.width = width;
        this.countryManufacture = countryManufacture;
    }

    public Car(){
        
    }
    
    public static ArrayList<Car> getCars() {
        return arrayCars;
    }

    public static void setCars(ArrayList<Car> arrayCars) {
        Car.arrayCars = arrayCars;
    }

    public static void setCountID(int countID) {
        Car.countID = countID;
    }

    public void setChoice(boolean choice) {
        this.choice = choice;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setCountryManufacture(String countryManufacture) {
        this.countryManufacture = countryManufacture;
    }

    ///////////////////////////////////////////////////////////////////////////

    public static int getCountParameters() {
        return countParameters;
    }

    public static int getCountID() {
        return countID;
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

    public int getYearManufacture() {
        return yearManufacture;
    }

    public String getEngineType() {
        return engineType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public int getPower() {
        return power;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getDrive() {
        return drive;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getCountryManufacture() {
        return countryManufacture;
    }
    
    ///////////////////////////////////////////////////////////////

    public static Car addCar(ModelTable tableRow){
        countID++;
        boolean ifError = false;
        boolean finalChoice = tableRow.getChoice();
        int finalID = tableRow.getID();
        String finalMake = tableRow.getMake();
        String finalModel = tableRow.getModel();
        String finalGeneration = tableRow.getGeneration();
        String finalColor = tableRow.getColor();
        int finalYearManufacture = Integer.parseInt(tableRow.getYearManufacture());
        
        double finalEngineCapacity = Double.parseDouble(tableRow.getEngineCapacity());
        
        String finalEngineType = tableRow.getEngineType();
        int finalPower = Integer.parseInt(tableRow.getPower());
        String finalTransmission = tableRow.getTransmission();
        String finalDrive = tableRow.getDrive();
        int finalLength = Integer.parseInt(tableRow.getLength());
        int finalHeight = Integer.parseInt(tableRow.getHeight());
        int finalWidth = Integer.parseInt(tableRow.getWidth());
        String finalCountryManufacture = tableRow.getCountryManufacture();
        
        Car car = new Car(finalChoice, finalID, finalMake, finalModel, finalGeneration, finalColor, finalYearManufacture, finalEngineCapacity, finalEngineType, finalPower, finalTransmission, finalDrive, finalLength, finalHeight, finalWidth, finalCountryManufacture);
        //Car car = new Car();
        arrayCars.add(car);
        return car;
    }
    
    public static Car editCar(ModelTable tableRow){
        //countID--;
        Car car = new Car();
        for(Car i : Car.arrayCars){
            if(i.getID() == tableRow.getID()){
                car = i;
            }
        }
        car.setChoice(true);
        
        boolean ifError = false;
        boolean finalChoice = tableRow.getChoice();
        car.setChoice(false);
        car.setID(tableRow.getID());
        car.setMake(tableRow.getMake());
        car.setModel(tableRow.getModel());
        car.setGeneration(tableRow.getGeneration());
        car.setColor(tableRow.getColor());
        car.setYearManufacture(Integer.parseInt(tableRow.getYearManufacture()));
        car.setEngineType(tableRow.getEngineType());
        car.setEngineCapacity(Double.parseDouble(tableRow.getEngineCapacity()));
        car.setPower(Integer.parseInt(tableRow.getPower()));
        car.setTransmission(tableRow.getTransmission());
        car.setDrive(tableRow.getDrive());
        car.setLength(Integer.parseInt(tableRow.getLength()));
        car.setHeight(Integer.parseInt(tableRow.getHeight()));
        car.setWidth(Integer.parseInt(tableRow.getWidth()));
        car.setCountryManufacture(tableRow.getCountryManufacture());
        //System.out.println(car.getCountryManufacture());
        //System.out.println(car);
        //Car car = new Car(finalChoice, finalID, finalMake, finalModel, finalGeneration, finalColor, finalYearManufacture, finalEngineCapacity, finalEngineType, finalPower, finalTransmission, finalDrive, finalLength, finalHeight, finalWidth, finalCountryManufacture);
        //Car car = new Car();
        //arrayCars.add(car);
        return car;
    }   
    @Override
    public String toString() {
         return "------------------------------" +
                "\n if:                  " + choice +
                "\n ID:                  " + ID +
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
    

    public static Object[] CarToStringToTable(Car car){
        String fianlYearManufacture = "";
        String fianlEngineCapacity = "";
        String fianlPower = "";
        String fianlLength = "";
        String fianlHeight = "";
        String fianlWidth = "";
        //System.out.println(car);
        try {
            if(car.getYearManufacture() != 0){
                fianlYearManufacture = String.valueOf(car.getYearManufacture());
            }
        } catch (Exception e) {
        }
        
        try {
            if(car.getEngineCapacity() != 0){
                fianlEngineCapacity = String.valueOf(car.getEngineCapacity());
            }
        } catch (Exception e) {
        }
        
        try {
            if(car.getPower() != 0){
                fianlPower = String.valueOf(car.getPower());
            }
        } catch (Exception e) {
        }
        
        try {
            if(car.getLength() != 0){
                fianlLength = String.valueOf(car.getLength());
            }
        } catch (Exception e) {
        }        
        
        try {
            if(car.getHeight() != 0){
                fianlHeight = String.valueOf(car.getHeight());
            }
        } catch (Exception e) {
        }        
 
        try {
            if(car.getWidth() != 0){
                fianlWidth = String.valueOf(car.getWidth());
            }
        } catch (Exception e) {
        }
        
        //System.out.println(car.getCountryManufacture());
        Object[] obj = new Object[]{false, car.getID(), car.getMake(), car.getModel(), car.getGeneration(), car.getColor(), fianlYearManufacture, fianlEngineCapacity, car.getEngineType(), fianlPower, car.getTransmission(), car.getDrive(), fianlLength, fianlHeight, fianlWidth, car.getCountryManufacture()};
        return obj;
    }
    
     public Object[] carSearch(String s, int column){
         
         
        if(column == 1){
            if(String.valueOf(ID).toLowerCase().indexOf(s.toLowerCase()) != -1){
                return CarToStringToTable(this);
            }
        }  
         
        if(column == 2){
            if(make.toLowerCase().indexOf(s.toLowerCase()) != -1){
                //System.out.println(s);
                return CarToStringToTable(this);
            }
            //System.out.println(s);
        }
        
        if(column == 3){
            if(model.toLowerCase().indexOf(s.toLowerCase()) != -1){
                return CarToStringToTable(this);
            }
        }         
        
        if(column == 4){
            if(generation.toLowerCase().indexOf(s.toLowerCase()) != -1){
                return CarToStringToTable(this);
            }
        }   
        
        if(column == 5){
            if(color.toLowerCase().indexOf(s.toLowerCase()) != -1){
                return CarToStringToTable(this);
            }
        } 
        
        if(column == 6){
            if(String.valueOf(yearManufacture).toLowerCase().indexOf(s.toLowerCase()) != -1){
                return CarToStringToTable(this);
            }
        }  
        
        if(column == 7){
            if(String.valueOf(engineCapacity).toLowerCase().indexOf(s.toLowerCase()) != -1){
                return CarToStringToTable(this);
            }
        }  
        
        if(column == 8){
            if(engineType.toLowerCase().indexOf(s.toLowerCase()) != -1){
                return CarToStringToTable(this);
            }
        } 
        
        if(column == 9){
            if(String.valueOf(power).toLowerCase().indexOf(s.toLowerCase()) != -1){
                return CarToStringToTable(this);
            }
        }  
        
        if(column == 10){
            if(transmission.toLowerCase().indexOf(s.toLowerCase()) != -1){
                return CarToStringToTable(this);
            }
        } 
        
        if(column == 11){
            if(drive.toLowerCase().indexOf(s.toLowerCase()) != -1){
                return CarToStringToTable(this);
            }
        } 
        
        if(column == 12){
            if(String.valueOf(length).toLowerCase().indexOf(s.toLowerCase()) != -1){
                return CarToStringToTable(this);
            }
        }  
        
        if(column == 13){
            if(String.valueOf(height).toLowerCase().indexOf(s.toLowerCase()) != -1){
                return CarToStringToTable(this);
            }
        }  
        
        if(column == 14){
            if(String.valueOf(width).toLowerCase().indexOf(s.toLowerCase()) != -1){
                return CarToStringToTable(this);
            }
        }  
        
        if(column == 15){
            if(countryManufacture.toLowerCase().indexOf(s.toLowerCase()) != -1){
                return CarToStringToTable(this);
            }
        } 
        
        return null;
     }
    
    
    
}
