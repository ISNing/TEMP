package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesActivityTabController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CloseButtonNavigator_Factory implements Factory<CloseButtonNavigator> {
  private final Provider<BrowserServicesActivityTabController> tabControllerProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  public CloseButtonNavigator_Factory(
      Provider<BrowserServicesActivityTabController> tabControllerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider) {
    this.tabControllerProvider = tabControllerProvider;
    this.tabProvider = tabProvider;
  }

  @Override
  public CloseButtonNavigator get() {
    return provideInstance(tabControllerProvider, tabProvider);
  }

  public static CloseButtonNavigator provideInstance(
      Provider<BrowserServicesActivityTabController> tabControllerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider) {
    return new CloseButtonNavigator(tabControllerProvider.get(), tabProvider.get());
  }

  public static CloseButtonNavigator_Factory create(
      Provider<BrowserServicesActivityTabController> tabControllerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider) {
    return new CloseButtonNavigator_Factory(tabControllerProvider, tabProvider);
  }

  public static CloseButtonNavigator newCloseButtonNavigator(
      BrowserServicesActivityTabController tabController,
      CustomTabActivityTabProvider tabProvider) {
    return new CloseButtonNavigator(tabController, tabProvider);
  }
}
