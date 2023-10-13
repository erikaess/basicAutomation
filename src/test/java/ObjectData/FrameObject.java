package ObjectData;

import java.util.HashMap;

public class FrameObject {

    private String singleIFrame;
    private String multipleIFrame;

    public FrameObject(HashMap<String,String> testData) {
        populateData(testData);
    }

    public void populateData(HashMap<String,String> testData){
        for(String key:testData.keySet()){
            switch(key){
                case "singleIFrame":
                    setSingleIFrame(testData.get(key));
                    break;
                case "multipleIFrame":
                    setMultipleIFrame(testData.get(key));
                    break;
            }
        }
    }

    public String getSingleIFrame() {
        return singleIFrame;
    }

    public void setSingleIFrame(String singleIFrame) {
        this.singleIFrame = singleIFrame;
    }

    public String getMultipleIFrame() {
        return multipleIFrame;
    }

    public void setMultipleIFrame(String multipleIFrame) {
        this.multipleIFrame = multipleIFrame;
    }
}
