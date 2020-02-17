package org.chromium.chrome.browser.signin;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SigninInvestigatorJni implements SigninInvestigator.Natives {
  private static SigninInvestigator.Natives testInstance;

  public static final JniStaticTestMocker<SigninInvestigator.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.signin.SigninInvestigator.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.signin.SigninInvestigator.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public int investigate(String currentEmail) {
    return (int)N.MAqebrbv(currentEmail);
  }

  public static SigninInvestigator.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.signin.SigninInvestigator.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new SigninInvestigatorJni();
  }
}
