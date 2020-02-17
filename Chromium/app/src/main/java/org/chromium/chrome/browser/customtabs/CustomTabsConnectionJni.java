package org.chromium.chrome.browser.customtabs;

import J.N;
import androidx.browser.customtabs.CustomTabsSessionToken;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CustomTabsConnectionJni implements CustomTabsConnection.Natives {
  private static CustomTabsConnection.Natives testInstance;

  public static final JniStaticTestMocker<CustomTabsConnection.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.customtabs.CustomTabsConnection.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.customtabs.CustomTabsConnection.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void createAndStartDetachedResourceRequest(Profile profile, CustomTabsSessionToken session,
      String url, String origin, int referrerPolicy, int motivation) {
    N.MQhlTRA4(profile, session, url, origin, referrerPolicy, motivation);
  }

  public static CustomTabsConnection.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.customtabs.CustomTabsConnection.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new CustomTabsConnectionJni();
  }
}
