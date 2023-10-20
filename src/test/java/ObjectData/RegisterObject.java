package ObjectData;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RegisterObject extends CommonObject {
    private String firstName;
    private String lastName;
    private List<String> checkBoxesValues;
    private String passwordRegister;
    private String confirmPasswordRegister;
    private String imageUpload;
    private String countryValue;
    private String skillValue;
    private String yearValue;
    private String monthValue;
    private String dayValue;
    private List<String> languageValues;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getCheckBoxesValues() {
        return checkBoxesValues;
    }

    public String getPasswordRegister() {
        return passwordRegister;
    }

    public String getConfirmPasswordRegister() {
        return confirmPasswordRegister;
    }

    public String getImageUpload() {
        return imageUpload;
    }

    public String getCountryValue() {
        return countryValue;
    }

    public String getSkillValue() {
        return skillValue;
    }

    public String getYearValue() {
        return yearValue;
    }

    public String getMonthValue() {
        return monthValue;
    }

    public String getDayValue() {
        return dayValue;
    }

    public List<String> getLanguageValues() {
        return languageValues;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCheckBoxesValues(List<String> checkBoxesValues) {
        this.checkBoxesValues = checkBoxesValues;
    }

    public void setPasswordRegister(String passwordRegister) {
        this.passwordRegister = passwordRegister;
    }

    public void setConfirmPasswordRegister(String confirmPasswordRegister) {
        this.confirmPasswordRegister = confirmPasswordRegister;
    }

    public void setImageUpload(String imageUpload) {
        this.imageUpload = imageUpload;
    }

    public void setCountryValue(String countryValue) {
        this.countryValue = countryValue;
    }

    public void setSkillValue(String skillValue) {
        this.skillValue = skillValue;
    }

    public void setYearValue(String yearValue) {
        this.yearValue = yearValue;
    }

    public void setMonthValue(String monthValue) {
        this.monthValue = monthValue;
    }

    public void setDayValue(String dayValue) {
        this.dayValue = dayValue;
    }

    public void setLanguageValues(List<String> languageValues) {
        this.languageValues = languageValues;
    }

    public RegisterObject(HashMap<String,String> testData) {
        populateData(testData);
    }

    public void populateData(HashMap<String,String> testData){
        for(String key:testData.keySet()){
            switch(key){
                case "firstName":
                    setFirstName(testData.get(key));
                    break;
                case "lastName":
                    setLastName(testData.get(key));
                    break;
                case "checkBoxesValues":
                    setCheckBoxesValues(getValueAsList(testData.get(key)));
                    break;
                case "passwordRegister":
                    setPasswordRegister(testData.get(key));
                    break;
                case "confirmPasswordRegister":
                    setConfirmPasswordRegister(testData.get(key));
                    break;
                case "imageUpload":
                    setImageUpload(testData.get(key));
                    break;
                case "countryValue":
                    setCountryValue(testData.get(key));
                    break;
                case "skillValue":
                    setSkillValue(testData.get(key));
                    break;
                case "yearValue":
                    setYearValue(testData.get(key));
                    break;
                case "monthValue":
                    setMonthValue(testData.get(key));
                case "dayValue":
                    setDayValue(testData.get(key));
                    break;
                case "languageValues":
                    setLanguageValues(getValueAsList(testData.get(key)));
                    break;
            }
        }
    }


}
