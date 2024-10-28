package sample.car;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sample.table.ModelTable;


public class CarTest {//unit тест

    /**
     * Test of addCar method, of class Car.
     */

    @Test
    public void testCarSearch() {
        ModelTable tableRow1 = new ModelTable(false, 1, "Toyota", "Corolla", "XI", "Черный","2008", "1.6", "Бензин", "124", "Автомат", "Передний", "4540", "1470", "1760", "Япония");
        ModelTable tableRow2 = new ModelTable(false, 2, "Lada", "Vesta", "XI", "БЕлый","2000", "1.6", "Бензин", "79", "Автомат", "Задный", "4040", "1370", "1560", "Россия");
        ModelTable tableRow3 = new ModelTable(false, 3, "BMW", "M", "X", "Красный","2020", "2", "Бензин", "110", "Автомат", "Передний", "4550", "1470", "1560", "Япония");
        ModelTable tableRow4 = new ModelTable(false, 4, "Nissan", "Qashqai", "X", "Черный","2024", "1.6", "Бензин", "96", "Автомат", "Задний", "4541", "1370", "1860", "Япония");
        
        Car.addCar(tableRow1); 
        Car.addCar(tableRow2); 
        Car.addCar(tableRow3); 
        Car.addCar(tableRow4);
        
        Car car = new Car(false, 1, "Toyota", "Corolla", "XI", "Черный",2008, 1.6, "Бензин", 124, "Автомат", "Передний", 4540, 1470, 1760, "Япония"); 
        
       
        
        assertNotEquals(car.carSearch("1", 1), null);  
        System.out.println("ID: ok");
        
        assertNotEquals(car.carSearch("Toy", 2), null);     
        System.out.println("Марка: ok");        
        
        assertArrayEquals(car.carSearch("feffw", 3), null);//
        System.out.println("Модель: ok");
        
        assertNotEquals(car.carSearch("X", 4), null); 
        System.out.println("Поколение: ok");
        
        assertNotEquals(car.carSearch("Чер", 5), null); 
        System.out.println("Цвет: ok");
        
        assertNotEquals(car.carSearch("2008", 6), null); 
        System.out.println("Год производства: ok");
        
        assertNotEquals(car.carSearch("1.6", 7), null); 
        System.out.println("Объем двигателя: ok");
        
        assertNotEquals(car.carSearch("Бензи", 8), null); 
        System.out.println("Тип двигателя: ok");
        
        assertNotEquals(car.carSearch("12", 9), null); 
        System.out.println("Мощьность: ok");
        
        assertNotEquals(car.carSearch("Авт", 10), null); 
        System.out.println("Коробка передач: ok");
        
        assertNotEquals(car.carSearch("Передний", 11), null); 
        System.out.println("Привод: ok");
        
        assertNotEquals(car.carSearch("45", 12), null); 
        System.out.println("Длина: ok");
        
        assertNotEquals(car.carSearch("1470", 13), null); 
        System.out.println("Высота: ok");
        
        assertNotEquals(car.carSearch("1760", 14), null); 
        System.out.println("Ширина: ok");
        
        assertNotEquals(car.carSearch("Я", 15), null); 
        System.out.println("Страна производства: ok");
        
        System.out.println("testCarSearch OK");
    }

    @Test
    public void testCarSearch2() {
        ModelTable tableRow1 = new ModelTable(false, 1, "Toyota", "Corolla", "XI", "Черный","2008", "1.6", "Бензин", "124", "Автомат", "Передний", "4540", "1470", "1760", "Япония");
        ModelTable tableRow2 = new ModelTable(false, 2, "Lada", "Vesta", "XI", "БЕлый","2000", "1.6", "Бензин", "79", "Автомат", "Задный", "4040", "1370", "1560", "Россия");
        ModelTable tableRow3 = new ModelTable(false, 3, "BMW", "M", "X", "Красный","2020", "2", "Бензин", "110", "Автомат", "Передний", "4550", "1470", "1560", "Япония");
        ModelTable tableRow4 = new ModelTable(false, 4, "Nissan", "Qashqai", "X", "Черный","2024", "1.6", "Бензин", "96", "Автомат", "Задний", "4541", "1370", "1860", "Япония");
        
        Car.addCar(tableRow1); 
        Car.addCar(tableRow2); 
        Car.addCar(tableRow3); 
        Car.addCar(tableRow4);
        
        Car car = new Car(false, 1, "Toyota", "Corolla", "XI", "Черный",2008, 1.6, "Бензин", 124, "Автомат", "Передний", 4540, 1470, 1760, "Япония"); 
        
       
        
        assertNotEquals(car.carSearch("1", 1), null);  
        assertNotEquals(car.carSearch("Toy", 2), null);      
        assertArrayEquals(car.carSearch("feffw", 3), null);//
        assertNotEquals(car.carSearch("XI", 4), null); 
        assertNotEquals(car.carSearch("Черный", 5), null); 
        assertNotEquals(car.carSearch("2008", 6), null); 
        assertNotEquals(car.carSearch("1.6", 7), null); 
        assertNotEquals(car.carSearch("Бензин", 8), null); 
        assertNotEquals(car.carSearch("124", 9), null); 
        assertNotEquals(car.carSearch("Автомат", 10), null); 
        assertNotEquals(car.carSearch("Передний", 11), null); 
        assertNotEquals(car.carSearch("4540", 12), null); 
        assertNotEquals(car.carSearch("1470", 13), null); 
        assertNotEquals(car.carSearch("1760", 14), null); 
        assertNotEquals(car.carSearch("Япония", 15), null); 
     
        System.out.println("testCarSearch2 OK");
        
        
    }    
}
