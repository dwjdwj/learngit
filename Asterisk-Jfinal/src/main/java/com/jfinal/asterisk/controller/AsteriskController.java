/**
 * 
 */
/**
 * @author PC
 *
 */
package com.jfinal.asterisk.controller;

import com.jfinal.core.Controller;

public class AsteriskController extends Controller {
	public void index(){ 
	
		setAttr("ss", "./WEB-INF/TemplateFile/Taglibrary.vm");
		render("test.html");
	}
}
