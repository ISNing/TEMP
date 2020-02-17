package org.chromium.chrome.browser.settings;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LocationSettingsJni implements LocationSettings.Natives {
  private static LocationSettings.Natives testInstance;

  public static final JniStaticTestMocker<LocationSettings.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.settings.LocationSettings.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.settings.LocationSettings.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onLocationSettingsDialogOutcome(long callback, int result) {
    N.MnpZRrlO(callback, result);
  }

  public static LocationSettings.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.settings.LocationSettings.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new LocationSettingsJni();
  }
}
