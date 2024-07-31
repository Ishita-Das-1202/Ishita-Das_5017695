package com.example.command;

public class CommandPatternTest {

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        // Turn the light on
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        // Turn the light off
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
    }
}
