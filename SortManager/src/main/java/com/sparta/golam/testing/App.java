package com.sparta.golam.testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    public static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args ) {

        Logging logging = new Logging();
        logging.runExceptions();
    }
}

