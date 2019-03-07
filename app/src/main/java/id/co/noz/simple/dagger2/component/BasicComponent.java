package id.co.noz.simple.dagger2.component;

import javax.inject.Singleton;

import dagger.Component;
import id.co.noz.simple.dagger2.module.AppModule;
import id.co.noz.simple.dagger2.ui.MainActivity;

@Singleton
@Component(modules = {AppModule.class})
public interface BasicComponent {
    void inject(MainActivity activity);
}

























