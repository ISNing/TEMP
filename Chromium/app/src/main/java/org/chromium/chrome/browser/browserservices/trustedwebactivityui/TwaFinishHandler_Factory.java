package org.chromium.chrome.browser.browserservices.trustedwebactivityui;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TwaFinishHandler_Factory implements Factory<TwaFinishHandler> {
  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabsConnection> connectionProvider;

  public TwaFinishHandler_Factory(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider) {
    this.intentDataProvider = intentDataProvider;
    this.connectionProvider = connectionProvider;
  }

  @Override
  public TwaFinishHandler get() {
    return provideInstance(intentDataProvider, connectionProvider);
  }

  public static TwaFinishHandler provideInstance(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider) {
    return new TwaFinishHandler(intentDataProvider.get(), connectionProvider.get());
  }

  public static TwaFinishHandler_Factory create(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider) {
    return new TwaFinishHandler_Factory(intentDataProvider, connectionProvider);
  }

  public static TwaFinishHandler newTwaFinishHandler(
      BrowserServicesIntentDataProvider intentDataProvider, CustomTabsConnection connection) {
    return new TwaFinishHandler(intentDataProvider, connection);
  }
}
