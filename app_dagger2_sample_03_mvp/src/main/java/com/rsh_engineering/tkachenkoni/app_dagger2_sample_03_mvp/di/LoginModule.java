package com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.di;

import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.data_domain.LoginModel;
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.data_domain.LoginRepository;
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.data_domain.LoginRepositoryImp;
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.presentation.LoginActivityMVP;
import com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.presentation.LoginActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Nikolay Tkachenko on 02, October, 2020
 */
@Module
public class LoginModule {

    @Provides
    public LoginActivityMVP.Presenter provideLoginActivitryPresenter(LoginActivityMVP.Model model){
        return new LoginActivityPresenter(model);
    }

    @Provides
    public LoginActivityMVP.Model provideLoginActivity(LoginRepository repository){
        return new LoginModel(repository);
    }

    @Provides
    public LoginRepository provideLoginRepository(){
        return new LoginRepositoryImp();
    }

}
