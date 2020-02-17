package org.chromium.chrome.browser.webapps;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ChromeActivity;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabBrowserControlsVisibilityDelegate;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebappDelegateFactory_Factory implements Factory<WebappDelegateFactory> {
  private final Provider<ChromeActivity> activityProvider;

  private final Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider;

  public WebappDelegateFactory_Factory(
      Provider<ChromeActivity> activityProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider) {
    this.activityProvider = activityProvider;
    this.visibilityDelegateProvider = visibilityDelegateProvider;
  }

  @Override
  public WebappDelegateFactory get() {
    return provideInstance(activityProvider, visibilityDelegateProvider);
  }

  public static WebappDelegateFactory provideInstance(
      Provider<ChromeActivity> activityProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider) {
    return new WebappDelegateFactory(activityProvider.get(), visibilityDelegateProvider.get());
  }

  public static WebappDelegateFactory_Factory create(
      Provider<ChromeActivity> activityProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider) {
    return new WebappDelegateFactory_Factory(activityProvider, visibilityDelegateProvider);
  }

  public static WebappDelegateFactory newWebappDelegateFactory(
      ChromeActivity activity, CustomTabBrowserControlsVisibilityDelegate visibilityDelegate) {
    return new WebappDelegateFactory(activity, visibilityDelegate);
  }
}
