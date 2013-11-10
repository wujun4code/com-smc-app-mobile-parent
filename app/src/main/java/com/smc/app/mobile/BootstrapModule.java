package com.smc.app.mobile;

import android.accounts.AccountManager;
import android.content.Context;

import com.smc.app.mobile.authenticator.BootstrapAuthenticatorActivity;
import com.smc.app.mobile.authenticator.LogoutService;
import com.smc.app.mobile.core.CheckIn;
import com.smc.app.mobile.core.TimerService;
import com.smc.app.mobile.ui.BootstrapTimerActivity;
import com.smc.app.mobile.ui.CarouselActivity;
import com.smc.app.mobile.ui.CheckInsListFragment;
import com.smc.app.mobile.ui.ItemListFragment;
import com.smc.app.mobile.ui.NewsActivity;
import com.smc.app.mobile.ui.NewsListFragment;
import com.smc.app.mobile.ui.UserActivity;
import com.smc.app.mobile.ui.UserListFragment;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module for setting up provides statements.
 * Register all of your entry points below.
 */
@Module
(
        complete = false,

        injects = {
                BootstrapApplication.class,
                BootstrapAuthenticatorActivity.class,
                CarouselActivity.class,
                BootstrapTimerActivity.class,
                CheckInsListFragment.class,
                NewsActivity.class,
                NewsListFragment.class,
                UserActivity.class,
                UserListFragment.class,
                TimerService.class
        }

)
public class BootstrapModule  {

    @Singleton
    @Provides
    Bus provideOttoBus() {
        return new Bus();
    }

    @Provides
    @Singleton
    LogoutService provideLogoutService(final Context context, final AccountManager accountManager) {
        return new LogoutService(context, accountManager);
    }

}
