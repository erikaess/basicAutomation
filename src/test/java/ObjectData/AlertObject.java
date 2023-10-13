package ObjectData;

import java.util.HashMap;

public class AlertObject {

    private String alertText;

    public AlertObject(HashMap<String,String> testData) {
        populateData(testData);
    }

    public void populateData(HashMap<String,String> testData){
        for(String key:testData.keySet()){
            switch(key){
                case "alertText":
                    setAlertText(testData.get(key));
                    break;
            }
        }
    }

    public String getAlertText() {
        return alertText;
    }

    public void setAlertText(String alertText) {
        this.alertText = alertText;
    }
}
