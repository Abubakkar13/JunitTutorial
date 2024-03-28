package com.example.JunitTutorial.data;

import java.util.Random;

public class RandomStub extends Random {

    public int nextInt(int range) {
        return 100;
    }
}
