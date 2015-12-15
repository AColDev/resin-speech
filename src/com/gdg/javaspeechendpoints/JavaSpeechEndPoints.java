package com.gdg.javaspeechendpoints;

import com.sun.speech.freetts.VoiceManager;

/**
 * Created by Spartan on 12/15/15.
 */
public class JavaSpeechEndPoints {

    public static void main(String[] args) throws Exception {
        Voice voiceKevin16 = new Voice("kevin16");
        ShouterClient myMain = new ShouterClient();

        String[] thingsToSay = new String[]
                {
                        myMain.getMessage(),
                };

        voiceKevin16.say(thingsToSay);
    }
}

class Voice
{
    private String name;
    private com.sun.speech.freetts.Voice systemVoice;

    public Voice(String name)
    {
        this.name = name;
        this.systemVoice = VoiceManager.getInstance().getVoice(this.name);
        this.systemVoice.allocate();
    }

    public void say(String[] thingsToSay)
    {
        for (int i = 0; i < thingsToSay.length; i++)
        {
            this.say( thingsToSay[i] );
        }
    }

    public void say(String thingToSay)
    {
        this.systemVoice.speak(thingToSay);
    }

    public void dispose()
    {
        this.systemVoice.deallocate();
    }
}