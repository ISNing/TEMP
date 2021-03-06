package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.ui.system.StatusBarColorController;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomTabStatusBarColorProvider_Factory
    implements Factory<CustomTabStatusBarColorProvider> {
  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<StatusBarColorController> statusBarColorControllerProvider;

  public CustomTabStatusBarColorProvider_Factory(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<StatusBarColorController> statusBarColorControllerProvider) {
    this.intentDataProvider = intentDataProvider;
    this.statusBarColorControllerProvider = statusBarColorControllerProvider;
  }

  @Override
  public CustomTabStatusBarColorProvider get() {
    return provideInstance(intentDataProvider, statusBarColorControllerProvider);
  }

  public static CustomTabStatusBarColorProvider provideInstance(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<StatusBarColorController> statusBarColorControllerProvider) {
    return new CustomTabStatusBarColorProvider(
        intentDataProvider.get(), statusBarColorControllerProvider.get());
  }

  public static CustomTabStatusBarColorProvider_Factory create(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<StatusBarColorController> statusBarColorControllerProvider) {
    return new CustomTabStatusBarColorProvider_Factory(
        intentDataProvider, statusBarColorControllerProvider);
  }

  public static CustomTabStatusBarColorProvider newCustomTabStatusBarColorProvider(
      BrowserServicesIntentDataProvider intentDataProvider,
      StatusBarColorController statusBarColorController) {
    return new CustomTabStatusBarColorProvider(intentDataProvider, statusBarColorController);
  }
}
