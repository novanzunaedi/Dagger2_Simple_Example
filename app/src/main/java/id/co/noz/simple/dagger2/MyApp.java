package id.co.noz.simple.dagger2;

import android.app.Application;

import id.co.noz.simple.dagger2.component.BasicComponent;
import id.co.noz.simple.dagger2.component.DaggerBasicComponent;
import id.co.noz.simple.dagger2.module.AppModule;

public class MyApp extends Application {

    private static MyApp app;
    private BasicComponent basicComponent;

    @Override
    public void onCreate(){
        super.onCreate();
        app = this;

        basicComponent = DaggerBasicComponent.builder()
                .appModule(new AppModule(getApplicationContext()))
                .build();
    }

    public static MyApp app(){
        return app;
    }

    public BasicComponent basicComponent(){
        return basicComponent;
    }
}













