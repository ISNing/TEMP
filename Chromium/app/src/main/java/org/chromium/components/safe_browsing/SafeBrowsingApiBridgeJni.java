package org.chromium.components.safe_browsing;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SafeBrowsingApiBridgeJni implements SafeBrowsingApiBridge.Natives {
  private static SafeBrowsingApiBridge.Natives testInstance;

  public static final JniStaticTestMocker<SafeBrowsingApiBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.safe_browsing.SafeBrowsingApiBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.safe_browsing.SafeBrowsingApiBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public boolean areLocalBlacklistsEnabled() {
    return (boolean)N.Mrgx57nB();
  }

  @Override
  public void onUrlCheckDone(long callbackId, int resultStatus, String metadata, long checkDelta) {
    N.M3tDaVsh(callbackId, resultStatus, metadata, checkDelta);
  }

  public static SafeBrowsingApiBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.safe_browsing.SafeBrowsingApiBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new SafeBrowsingApiBridgeJni();
  }
}
