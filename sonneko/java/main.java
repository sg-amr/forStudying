import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Version {
    final int version;
    private String deviceType;
    private String environment;
    if (ver == "mobileApplication") {
        this.deviceType = "mobile";
        this.environment = "application";
    } else if (ver == "desktopApplication") {
        this.deviceType = "desktop";
        this.environment = "application";
    } else if (ver == "mobileBrowser") {
        this.deviceType = "mobile";      
        this.environment = "browser";
    } else if (ver == "desktopBrowser") {
        this.deviceType = "desktop";
        this.environment = "browser";
    } else {
        throw new IllegalArgumentException("知らないVersion");
    }
}

class Game {
    public static void Game(String ver) {
        
    }
}