package org.chromium.chrome.browser.history;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class HistoryDeletionBridgeJni implements HistoryDeletionBridge.Natives {
  private static HistoryDeletionBridge.Natives testInstance;

  public static final JniStaticTestMocker<HistoryDeletionBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.history.HistoryDeletionBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.history.HistoryDeletionBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(HistoryDeletionBridge self) {
    return (long)N.M41yd4uo(self);
  }

  public static HistoryDeletionBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.history.HistoryDeletionBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new HistoryDeletionBridgeJni();
  }
}
