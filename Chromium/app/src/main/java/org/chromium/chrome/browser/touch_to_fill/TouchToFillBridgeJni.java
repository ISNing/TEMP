package org.chromium.chrome.browser.touch_to_fill;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.touch_to_fill.data.Credential;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TouchToFillBridgeJni implements TouchToFillBridge.Natives {
  private static TouchToFillBridge.Natives testInstance;

  public static final JniStaticTestMocker<TouchToFillBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.touch_to_fill.TouchToFillBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.touch_to_fill.TouchToFillBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onCredentialSelected(long nativeTouchToFillViewImpl, Credential credential) {
    N.MW5teN_W(nativeTouchToFillViewImpl, credential);
  }

  @Override
  public void onManagePasswordsSelected(long nativeTouchToFillViewImpl) {
    N.MZxrSSig(nativeTouchToFillViewImpl);
  }

  @Override
  public void onDismiss(long nativeTouchToFillViewImpl) {
    N.MO$_q9pf(nativeTouchToFillViewImpl);
  }

  public static TouchToFillBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.touch_to_fill.TouchToFillBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new TouchToFillBridgeJni();
  }
}
