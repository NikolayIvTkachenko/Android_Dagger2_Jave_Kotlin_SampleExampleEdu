package com.rsh_engineering.tkachenkoni.app_dagger2_sample_03_mvp.data_domain;

/**
 * Created by Nikolay Tkachenko on 02, October, 2020
 */
public class LoginRepositoryImp  implements LoginRepository {

    private User user;

    @Override
    public User getUser() {
        if(user == null){
            User user = new User("Nikolay", "12345");
            user.setId(0);
            this.user = user;
            return this.user;
        }else{
            return user;
        }
    }

    @Override
    public void saveUser(User user) {
        if (user == null){
            user = getUser();
        }
        this.user = user;
    }
}
