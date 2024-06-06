package com.nt.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest 
{
    
    @Test
    public void testwithpositives()
    {
    	int a=10;
    	int b=20;
    	int expected=30;
    	App app1=new App();
    	int actual=app1.sum(a, b);
        assertEquals(expected,actual);
    }
    @Test
    public void testwithNegatives()
    {
    	int a=-10;
    	int b=-20;
    	int expected=-30;
    	App app1=new App();
    	int actual=app1.sum(a, b);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testwithMixedValues()
    {
    	int a=10;
    	int b=-20;
    	int expected=-10;
    	App app1=new App();
    	int actual=app1.sum(a, b);
        assertEquals(expected,actual);
    }
}
