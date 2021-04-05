package com.example.obiekty.access_modifier.public_example.package2;

import com.example.obiekty.access_modifier.public_example.package1.BasicClass;

public class OtherClass extends BasicClass {
    public OtherClass(){
        name = "OtherClass";
        this.setName("OtherClassSetName");
    }
}
