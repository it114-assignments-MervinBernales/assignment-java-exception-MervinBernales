/**
 * 
 */
package com.mycompany.myExceptionp1;

/**
 * @author Mervin
 *
 */
public class MyChild extends MyParent {
	@Override
	public void method1(Integer _inp) throws MyException1Child {
		
	}
	// Note while overwriting one can not go up the exception inheritance.  Going down and throwing child is ok.
//	@Override
//	public void method2(Integer _inp) throws MyException1 {
//		
//	}
}
