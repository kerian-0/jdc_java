package com.jdc.ly.seal;


//can't use from different package
public sealed interface Cashier permits Staff,Employee {

}
