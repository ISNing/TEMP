package org.chromium.chrome.browser.webapps;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ActivityTabProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class WebappActivityTabController_Factory
    implements Factory<WebappActivityTabController> {
  private final Provider<ActivityTabProvider> activityTabProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  public WebappActivityTabController_Factory(
      Provider<ActivityTabProvider> activityTabProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider) {
    this.activityTabProvider = activityTabProvider;
    this.tabProvider = tabProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
  }

  @Override
  public WebappActivityTabController get() {
    return provideInstance(activityTabProvider, tabProvider, tabObserverRegistrarProvider);
  }

  public static WebappActivityTabController provideInstance(
      Provider<ActivityTabProvider> activityTabProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider) {
    return new WebappActivityTabController(
        activityTabProvider.get(), tabProvider.get(), tabObserverRegistrarProvider.get());
  }

  public static WebappActivityTabController_Factory create(
      Provider<ActivityTabProvider> activityTabProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider) {
    return new WebappActivityTabController_Factory(
        activityTabProvider, tabProvider, tabObserverRegistrarProvider);
  }

  public static WebappActivityTabController newWebappActivityTabController(
      ActivityTabProvider activityTabProvider,
      CustomTabActivityTabProvider tabProvider,
      TabObserverRegistrar tabObserverRegistrar) {
    return new WebappActivityTabController(activityTabProvider, tabProvider, tabObserverRegistrar);
  }
}
