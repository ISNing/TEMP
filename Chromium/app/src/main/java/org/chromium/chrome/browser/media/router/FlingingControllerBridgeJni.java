package org.chromium.chrome.browser.media.router;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FlingingControllerBridgeJni implements FlingingControllerBridge.Natives {
  private static FlingingControllerBridge.Natives testInstance;

  public static final JniStaticTestMocker<FlingingControllerBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.media.router.FlingingControllerBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.media.router.FlingingControllerBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onMediaStatusUpdated(long nativeFlingingControllerBridge,
      FlingingControllerBridge caller, MediaStatusBridge status) {
    N.MoWa_5lB(nativeFlingingControllerBridge, caller, status);
  }

  public static FlingingControllerBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.media.router.FlingingControllerBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new FlingingControllerBridgeJni();
  }
}
