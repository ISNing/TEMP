package org.chromium.chrome.browser.signin;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SigninUtilsJni implements SigninUtils.Natives {
  private static SigninUtils.Natives testInstance;

  public static final JniStaticTestMocker<SigninUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.signin.SigninUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.signin.SigninUtils.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void logEvent(int metric, int gaiaServiceType) {
    N.MAoV8w8M(metric, gaiaServiceType);
  }

  public static SigninUtils.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.signin.SigninUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new SigninUtilsJni();
  }
}
