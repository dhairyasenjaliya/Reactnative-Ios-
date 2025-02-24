package com.iosdemo;

import android.app.Application;

import com.facebook.react.ReactApplication; 
import com.oblador.vectoricons.VectorIconsPackage;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.airbnb.android.react.maps.MapsPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import io.invertase.firebase.RNFirebasePackage;
import io.invertase.firebase.notifications.RNFirebaseNotificationsPackage; // <-- Add this line
import io.invertase.firebase.messaging.RNFirebaseMessagingPackage;
import co.apptailor.googlesignin.RNGoogleSigninPackage;


import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),  
            new VectorIconsPackage(),
            new RNGestureHandlerPackage(),
            new MapsPackage(),
            new RNFirebasePackage(),
            new RNFirebaseNotificationsPackage(),
            new RNFirebaseMessagingPackage(),
            new RNGoogleSigninPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
