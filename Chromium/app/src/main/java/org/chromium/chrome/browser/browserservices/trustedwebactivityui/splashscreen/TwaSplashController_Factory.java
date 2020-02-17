package org.chromium.chrome.browser.browserservices.trustedwebactivityui.splashscreen;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.TwaFinishHandler;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.chrome.browser.webapps.SplashController;
import org.chromium.content_public.browser.ScreenOrientationProvider;
import org.chromium.ui.base.ActivityWindowAndroid;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TwaSplashController_Factory implements Factory<TwaSplashController> {
  private final Provider<SplashController> splashControllerProvider;

  private final Provider<Activity> activityProvider;

  private final Provider<ActivityWindowAndroid> activityWindowAndroidProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<ScreenOrientationProvider> screenOrientationProvider;

  private final Provider<SplashImageHolder> splashImageCacheProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<TwaFinishHandler> finishHandlerProvider;

  public TwaSplashController_Factory(
      Provider<SplashController> splashControllerProvider,
      Provider<Activity> activityProvider,
      Provider<ActivityWindowAndroid> activityWindowAndroidProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<ScreenOrientationProvider> screenOrientationProvider,
      Provider<SplashImageHolder> splashImageCacheProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<TwaFinishHandler> finishHandlerProvider) {
    this.splashControllerProvider = splashControllerProvider;
    this.activityProvider = activityProvider;
    this.activityWindowAndroidProvider = activityWindowAndroidProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.screenOrientationProvider = screenOrientationProvider;
    this.splashImageCacheProvider = splashImageCacheProvider;
    this.intentDataProvider = intentDataProvider;
    this.finishHandlerProvider = finishHandlerProvider;
  }

  @Override
  public TwaSplashController get() {
    return provideInstance(
        splashControllerProvider,
        activityProvider,
        activityWindowAndroidProvider,
        lifecycleDispatcherProvider,
        screenOrientationProvider,
        splashImageCacheProvider,
        intentDataProvider,
        finishHandlerProvider);
  }

  public static TwaSplashController provideInstance(
      Provider<SplashController> splashControllerProvider,
      Provider<Activity> activityProvider,
      Provider<ActivityWindowAndroid> activityWindowAndroidProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<ScreenOrientationProvider> screenOrientationProvider,
      Provider<SplashImageHolder> splashImageCacheProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<TwaFinishHandler> finishHandlerProvider) {
    return new TwaSplashController(
        splashControllerProvider.get(),
        activityProvider.get(),
        activityWindowAndroidProvider.get(),
        lifecycleDispatcherProvider.get(),
        screenOrientationProvider.get(),
        splashImageCacheProvider.get(),
        intentDataProvider.get(),
        finishHandlerProvider.get());
  }

  public static TwaSplashController_Factory create(
      Provider<SplashController> splashControllerProvider,
      Provider<Activity> activityProvider,
      Provider<ActivityWindowAndroid> activityWindowAndroidProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<ScreenOrientationProvider> screenOrientationProvider,
      Provider<SplashImageHolder> splashImageCacheProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<TwaFinishHandler> finishHandlerProvider) {
    return new TwaSplashController_Factory(
        splashControllerProvider,
        activityProvider,
        activityWindowAndroidProvider,
        lifecycleDispatcherProvider,
        screenOrientationProvider,
        splashImageCacheProvider,
        intentDataProvider,
        finishHandlerProvider);
  }

  public static TwaSplashController newTwaSplashController(
      SplashController splashController,
      Activity activity,
      ActivityWindowAndroid activityWindowAndroid,
      ActivityLifecycleDispatcher lifecycleDispatcher,
      ScreenOrientationProvider screenOrientationProvider,
      SplashImageHolder splashImageCache,
      BrowserServicesIntentDataProvider intentDataProvider,
      TwaFinishHandler finishHandler) {
    return new TwaSplashController(
        splashController,
        activity,
        activityWindowAndroid,
        lifecycleDispatcher,
        screenOrientationProvider,
        splashImageCache,
        intentDataProvider,
        finishHandler);
  }
}
