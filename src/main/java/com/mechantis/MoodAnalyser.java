package com.mechantis;

public class MoodAnalyser {
    public static MoodAnalyser moodAnalyser;
    private String message;

    public MoodAnalyser(Object o) {
    }


    public String analyseMood(String message) {
        /*if (message.contains(("Sad"))) {
            return "SAD";
        }
        else {
            return "HAPPY";

        }*/
        this.message = message;
    }
    public String analyseMood(String message) throws MoodAnalyser{
        this.message = message;
        return analyseMood();
    }
    public String analyseMood(){
        try {
            if(message.contains("SAD"));

                return "SAD";
            
            else
                    return "Happy";

        }
        catch (NullPointerException e){
            return "Happy";
        }
    }
}
