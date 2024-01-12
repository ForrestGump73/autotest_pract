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
                .refreshProductPage()
                .checkLastProductAdded("Картошка", "Овощ", "false");



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
                .refreshProductPage()
                .checkLastProductAdded("Манго", "Фрукт", "true");

    }

}
