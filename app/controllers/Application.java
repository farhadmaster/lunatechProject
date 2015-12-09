package controllers;

import manager.IntializationManager;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import com.google.inject.Inject;

public class Application extends Controller {
	
@Inject 
private  IntializationManager  initializationManager;
	
    public Result index() {
    	return ok(index.render("Your new application is ready."));
    }
    
    @Transactional
	public Result initializeDB(){
		initializationManager.initializeData();
		return ok();
	}
	

}
