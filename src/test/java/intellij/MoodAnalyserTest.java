package intellij;


import com.mechantis.MoodAnalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import  org.junit.Test;
import org.junit.rules.ExpectedException;

import static com.mechantis.MoodAnalyser.moodAnalyser;

public class MoodAnalyserTest {
    /*@Test
    public  void  testMoodAnalysis() throws  Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String mood = moodAnalyser.analyseMood("This is a sad message");

        Assert.assertEquals("GOOD", mood);

    }
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        //*moodAnalyser.analyseMood("This is a Sad message");
        String mood = moodAnalyser.analyseMood("This is a Sad message");
        Assert.assertEquals("SAD", mood);
    }*/
    @Test
    public void givenAMood_WhenSad_ShouldReturnSad(){
        try{
            Object myObj = ObjectReflector.createObject("com.intellij.MoodAnalyserTest","I am in No Mood");
            ObjectReflector.setFieldValue(myObj),"message", "I am in Sad"
            Assert.assertEquals(result.toString(), "SAD");
        }
        catch (ObjectReflectorException e){
            e.printStackTrace();
        }
    }
    /*@Test
    public  void giveMessage_WhenNotSad_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Happy message");
        Assert.assertEquals("GOOD", mood);
    }*/
    @Test
    public void givenNullMoodShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        MoodAnalyser mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser mood.analyseMood();
            Assert.assertEquals("Happy", mood);
        }
        catch (MoodAnalysisException e){
            e.printStackTrace();
        }
    }


    @Test
    public void givenWrongClass_ThenThrowException(){
        try{
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(ObjectReflectorException.class);
            Object myObj = ObjectReflector.createObject("Testing", String.class"I am in no mood");
        }
        catch (ObjectReflectorException e){


        }


    }
    @Test
    public void givenMoodMessage_ShouldReturnMessage() throws MoodAnalysisException {
        moodAnalyser = new MoodAnalyser("Testing my mood");
        moodAnalyser.analyseMood();
        MoodAnalyser dump = ObjectReflector.dump(moodAnalyser, 0);
        Assert.assertThat(dump, CoreMatchers.containsString( "Testing my mood");
    }

}
