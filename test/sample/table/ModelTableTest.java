package sample.table;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sample.car.Car;
import static sample.table.ModelTable.addToTableAndArray;

public class ModelTableTest {//Интеграционный тест
    
    @Test
    public void testAddToTableAndArrayMethod(){
        ModelTable tableRow = new ModelTable(false, 1, "Toyota", "Corolla", "XI", "Черный","2008", "1.6", "Бензин", "124", "Автомат", "Передний", "4540", "1470", "1760", "Япония");
        Object[] obj = addToTableAndArray(tableRow, false);
        
        assertEquals(obj[1], 1);
        System.out.println("ID: ok");
        assertEquals(obj[2], "Toyota");
        System.out.println("Марка: ok");
        assertEquals(obj[3], "Corolla");
        System.out.println("Модель: ok");
        assertEquals(obj[4], "XI");
        System.out.println("Поколение: ok");
        assertEquals(obj[5], "Черный");
        System.out.println("Цвет: ok");
        assertEquals(obj[6], "2008");
        System.out.println("Год производства: ok");
        assertEquals(obj[7], "1.6");
        System.out.println("Объем двигателя: ok");
        assertEquals(obj[8], "Бензин");
        System.out.println("Тип двигателя: ok");
        assertEquals(obj[9], "124");
        System.out.println("Мощьность: ok");
        assertEquals(obj[10], "Автомат");
        System.out.println("Коробка передач: ok");
        assertEquals(obj[11], "Передний");
        System.out.println("Привод: ok");
        assertEquals(obj[12], "4540");
        System.out.println("Длина: ok");
        assertEquals(obj[13], "1470");
        System.out.println("Высота: ok");
        assertEquals(obj[14], "1760");
        System.out.println("Ширина: ok");
        assertEquals(obj[15], "Япония");
        System.out.println("Страна производства: ok");
        System.out.println("testAddToTableAndArrayMethod1 OK");
    }

    @Test
    public void testAddToTableAndArrayMethod2(){
        ModelTable tableRow = new ModelTable(true, 2, "Toyota", "Corolla", "XI", "","2008686", "1.6fgbfg", "Бензин", "12400", "Автомат", "Передний", "4540", "1", "1760", "Япония");
        Object[] obj = addToTableAndArray(tableRow, true);
        
        assertEquals(obj[1], 2);
        assertEquals(obj[2], "Toyota");
        assertEquals(obj[3], "Corolla");
        assertEquals(obj[4], "XI");
        assertEquals(obj[5], "");
        assertEquals(obj[6], "");
        assertEquals(obj[7], "");
        assertEquals(obj[8], "Бензин");
        assertEquals(obj[9], "");
        assertEquals(obj[10], "Автомат");
        assertEquals(obj[11], "Передний");
        assertEquals(obj[12], "4540");
        assertEquals(obj[13], "");
        assertEquals(obj[14], "1760");
        assertEquals(obj[15], "Япония");
        System.out.println("testAddToTableAndArrayMethod2 OK");
    }   
    
    
}
