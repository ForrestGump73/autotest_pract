package ru.appline.framework.tests;

import org.junit.jupiter.api.Test;
import ru.appline.framework.basetestsclass.BaseTests;


public class PracticeTests extends BaseTests {


    @Test
    public void startVegTest() {
        app.getHomePage()
                .selectBaseMenu()
                .selectProducts()
                .checkOpenProductsPage()
                .selectButtonEdit()
                .checkOpenAddProduct()
                .fillFieldName("Картошка")
                .selectTypeOfProduct("Овощ")
                .checkboxExoticOff()
                .saveProduct()
                .checkLastProductName("Картошка")
                .checkLastProductType("Овощ")
                .checkLastProductExotic("false");



    }

    @Test
    public void startFruitTest() {
        app.getHomePage()
                .selectBaseMenu()
                .selectProducts()
                .checkOpenProductsPage()
                .selectButtonEdit()
                .checkOpenAddProduct()
                .fillFieldName("Манго")
                .selectTypeOfProduct("Фрукт")
                .checkboxExoticOn()
                .saveProduct()
                .checkLastProductName("Манго")
                .checkLastProductType("Фрукт")
                .checkLastProductExotic("true");

    }

}
