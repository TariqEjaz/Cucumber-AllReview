package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class DataTable_StepDefinitions {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> tableData) {

        List<String> list = new ArrayList<>();
        list.addAll(tableData);
        System.out.println(list);
    }

    @Then("user should see month I like")
    public void user_should_see_month_i_like(List<String> dataTable) {

        List<String> month = new ArrayList<>();
        
        month.addAll(dataTable);
        for (String each : month) {
            if(each.startsWith("J")){
                System.out.println("each = " + each);
            }
            
        }

        


    }



}
