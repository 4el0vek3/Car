package sample.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import sample.car.Car;

public class fileManager {
    public final static ArrayList<Car> carFileToArray(){
        String URL = "C:\\Users\\1\\Desktop\\java-sample-form-main\\sample-form\\src\\sample\\file\\files\\";
        File folder = new File("C:\\Users\\1\\Desktop\\java-sample-form-main\\sample-form\\src\\sample\\file\\files\\");
        File[] listOfFiles = folder.listFiles();
        ArrayList<Car> cars = new ArrayList<>();
        for (File file : listOfFiles) {
            ArrayList<String> str = new ArrayList<>();
            //System.out.println(listOfFiles.length);
            if (file.isFile()) {
                String u = URL+file.getName();
                //System.out.println(u);
                //File f = new File();
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(u));
                    String line = reader.readLine();
                    while (line != null) {
                        str.add(line);
                        //System.out.println(line);
                        line = reader.readLine();
                    }
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Car car = new Car();
            
            car.setChoice(false);
            
            try {
                car.setID(Integer.parseInt(str.get(0)));
            } catch (Exception e) {
                break;
            }
            
            car.setMake(str.get(1));
            car.setModel(str.get(2));
            car.setGeneration(str.get(3));
            car.setColor(str.get(4));
            try {
                car.setYearManufacture(Integer.parseInt(str.get(5)));
            } catch (Exception e) {
            }
            
            try {
                car.setEngineCapacity(Double.parseDouble(str.get(6)));
            } catch (Exception e) {
            }          
            
            car.setEngineType(str.get(7));
            
            try {
                car.setPower(Integer.parseInt(str.get(8)));
            } catch (Exception e) {
            }             
            
            car.setTransmission(str.get(9));
            car.setDrive(str.get(10));
            
            try {
                car.setLength(Integer.parseInt(str.get(11)));
            } catch (Exception e) {
            }             
            
            try {
                car.setHeight(Integer.parseInt(str.get(12)));
            } catch (Exception e) {
            } 

            try {
                car.setWidth(Integer.parseInt(str.get(13)));
            } catch (Exception e) {
            } 

            car.setCountryManufacture(str.get(14));

            cars.add(car);
            
            //System.out.println(car.toString());
            
        }
        return cars;
 
       
    }
    public static boolean delCar(int id){
        try {
                for(Car car : Car.arrayCars){
                    //System.out.println("+");
                    if(car.getID() == id){
                        Car.arrayCars.remove(car);
                        return true;
                    }
                }
                //System.out.println("Файл был удален");
                return false;
        }
        catch (Exception e) {
            //System.err.println("Ошибка удаления файла\n");
            return false;
        }

    
    }
    
    public static void getDraftCurrentID() {
        try {
            String URL = "C:\\Users\\1\\Desktop\\java-sample-form-main\\sample-form\\src\\sample\\file\\ID\\CurrentID.txt";
            BufferedReader reader = new BufferedReader(new FileReader(URL));
            String line = reader.readLine();
            Car.setCountID(Integer.parseInt(line));
            reader.close();
        }
        catch (Exception e) {
            System.err.println("Ошибка чтения файла, файл пуст!!\n");
        }
    }
    
    public static boolean carsToFile(){
        
        
    
        try {
            String URL = "C:\\Users\\1\\Desktop\\java-sample-form-main\\sample-form\\src\\sample\\file\\files\\";
            //System.out.println("+++");
            File folder = new File("C:\\Users\\1\\Desktop\\java-sample-form-main\\sample-form\\src\\sample\\file\\files\\");
            File[] listOfFiles = folder.listFiles();
            
            for(File file : listOfFiles){
                file.delete();
            }
            
                
            for(Car car : Car.arrayCars){
                String URLf = "C:\\Users\\1\\Desktop\\java-sample-form-main\\sample-form\\src\\sample\\file\\files\\";
                URLf = URLf + "Car" + car.getID() + ".txt";
                //System.out.println(URLf);
                FileWriter writer = new FileWriter(URLf, true);
                //System.out.println(URLf);
                Object[] obj = Car.CarToStringToTable(car);
                for(int i = 1; i < Car.getCountParameters(); i++){
                    String str = String.valueOf(obj[i]);
                    //String str = "";
                    str += "\n";
                    writer.write(str);
                    //System.out.println(obj[i]);
                }
                writer.close();
                
                String URLID = "C:\\Users\\1\\Desktop\\java-sample-form-main\\sample-form\\src\\sample\\file\\ID\\CurrentID.txt";
                File folderID = new File(URLID);
                folderID.delete();

                    FileWriter writerID = new FileWriter(URLID, true);
                    //System.out.println(URLID);
                    //System.out.println(String.valueOf(Car.getCountID()));
                    writerID.write(String.valueOf(Car.getCountID()));

                    writerID.close();

                }   
                return false;
            
        } catch(Exception e){
            //System.out.println(e);
            return true;
        }

        
        
        
        
        
    }
}
