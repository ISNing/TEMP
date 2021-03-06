package org.chromium.chrome.browser.signin;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UnifiedConsentServiceBridgeJni implements UnifiedConsentServiceBridge.Natives {
  private static UnifiedConsentServiceBridge.Natives testInstance;

  public static final JniStaticTestMocker<UnifiedConsentServiceBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.signin.UnifiedConsentServiceBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.signin.UnifiedConsentServiceBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public boolean isUrlKeyedAnonymizedDataCollectionEnabled(Profile profile) {
    return (boolean)N.MuDQUpcO(profile);
  }

  @Override
  public void setUrlKeyedAnonymizedDataCollectionEnabled(Profile profile, boolean enabled) {
    N.MKI924$P(profile, enabled);
  }

  @Override
  public boolean isUrlKeyedAnonymizedDataCollectionManaged(Profile profile) {
    return (boolean)N.M$I9xO2H(profile);
  }

  @Override
  public void recordSyncSetupDataTypesHistogram(Profile profile) {
    N.MybxXS9_(profile);
  }

  public static UnifiedConsentServiceBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.signin.UnifiedConsentServiceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new UnifiedConsentServiceBridgeJni();
  }
}
