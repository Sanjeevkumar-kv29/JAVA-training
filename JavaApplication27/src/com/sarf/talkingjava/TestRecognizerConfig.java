package com.sarf.talkingjava;
package com.sarf.talkingjava;
 
import java.util.Locale;
import javax.speech.Central;
import javax.speech.EngineList;
import java.speech.recognition.RecognizerModeDesc;
 
public class TestRecognizerConfig {
  public static void main(String[] args) {
  try
    {
     Central.registerEngineCentral 
      ("com.cloudgarden.speech.CGEngineCentral");
     RecognizerModeDesc desc =  
       new RecognizerModeDesc(Locale.US,Boolean.TRUE);
     EngineList el = Central.availableRecognizers(desc);
     if(el.size() < 1){
        System.out.println("Recognition Engine is not available");
        System.exit(1);
        }else{
        System.out.println("Recognition Engine is available");
        System.exit(1);
        }
     }catch(Exception exception)
     {
      exception.printStackTrace();
      }
   }
}