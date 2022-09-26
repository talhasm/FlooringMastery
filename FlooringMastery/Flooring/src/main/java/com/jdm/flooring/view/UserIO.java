package com.jdm.flooring.view;

public interface UserIO {
    
    void print(String msg);
    
    int readInt(String prompt, int min, int max);
    
    String readString(String prompt);
}

