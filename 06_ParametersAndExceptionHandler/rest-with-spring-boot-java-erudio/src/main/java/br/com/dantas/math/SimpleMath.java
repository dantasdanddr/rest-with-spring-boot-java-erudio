package br.com.dantas.math;

import java.util.ArrayList;

public class SimpleMath {
	
	public Double sum(Double numberOne, Double numberTwo) {		
		return (numberOne) + (numberTwo);
	}
	
	public Double subtract(Double numberOne, Double numberTwo) {		
		return (numberOne) - (numberTwo);
	}
	
	public Double multiplication(Double numberOne, Double numberTwo) {		
		return (numberOne) * (numberTwo);
	}
	
	public Double division(Double numberOne, Double numberTwo) {		
		return (numberOne) / (numberTwo);
	}
	
	public Double average(Double numberOne, Double numberTwo) {
		//numbers		
        ArrayList<Double> nums = new ArrayList<Double>();
        nums.add((numberOne));
        nums.add((numberTwo));         
        
        Double sum = 0D;
        
        //compute sum
        for(Double num:nums) {
            sum += num;
        }         
        
        //return average
        return (sum / nums.size());		
	}
	
	public Double squareRoot(Double number) {		
		return Math.sqrt(number);
	}

}
