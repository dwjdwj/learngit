/**
 * 
 */
/**
 * @author PC
 *
 */
package com.jfinal.asterisk.config;

import com.jfinal.asterisk.controller.AsteriskController;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.render.ViewType;

public class JfinalConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		
		me.setDevMode(true);  
		me.setViewType(ViewType.VELOCITY);
	}

	@Override
	public void configHandler(Handlers arg0) {
		
	}

	@Override
	public void configInterceptor(Interceptors arg0) {
	

	}

	@Override
	public void configPlugin(Plugins arg0) {
	

	}

	@Override
	public void configRoute(Routes me) {
		me.add("/hello",AsteriskController.class,"WEB-INF/");

	}

	  /*  public void main(String[] args) {
	        JFinal.start("src/main/webapp", 8080, "/", 10);
	    }*/
}
