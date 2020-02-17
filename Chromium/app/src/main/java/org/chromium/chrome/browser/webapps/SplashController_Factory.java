package org.chromium.chrome.browser.webapps;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SplashController_Factory implements Factory<SplashController> {
  private final Provider<Activity> activityProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  public SplashController_Factory(
      Provider<Activity> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider) {
    this.activityProvider = activityProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
  }

  @Override
  public SplashController get() {
    return provideInstance(
        activityProvider, lifecycleDispatcherProvider, tabObserverRegistrarProvider);
  }

  public static SplashController provideInstance(
      Provider<Activity> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider) {
    return new SplashController(
        activityProvider.get(),
        lifecycleDispatcherProvider.get(),
        tabObserverRegistrarProvider.get());
  }

  public static SplashController_Factory create(
      Provider<Activity> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider) {
    return new SplashController_Factory(
        activityProvider, lifecycleDispatcherProvider, tabObserverRegistrarProvider);
  }

  public static SplashController newSplashController(
      Activity activity,
      ActivityLifecycleDispatcher lifecycleDispatcher,
      TabObserverRegistrar tabObserverRegistrar) {
    return new SplashController(activity, lifecycleDispatcher, tabObserverRegistrar);
  }
}
