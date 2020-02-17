package org.chromium.chrome.browser.profiles;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ProfileManagerUtilsJni implements ProfileManagerUtils.Natives {
  private static ProfileManagerUtils.Natives testInstance;

  public static final JniStaticTestMocker<ProfileManagerUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.profiles.ProfileManagerUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.profiles.ProfileManagerUtils.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void flushPersistentDataForAllProfiles() {
    N.MPpDwRXN();
  }

  @Override
  public void removeSessionCookiesForAllProfiles() {
    N.M4n4n4_y();
  }

  public static ProfileManagerUtils.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.profiles.ProfileManagerUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ProfileManagerUtilsJni();
  }
}
