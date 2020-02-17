package org.chromium.chrome.features.dev_ui;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DevUiInstallListenerJni implements DevUiInstallListener.Natives {
  private static DevUiInstallListener.Natives testInstance;

  public static final JniStaticTestMocker<DevUiInstallListener.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.features.dev_ui.DevUiInstallListener.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.features.dev_ui.DevUiInstallListener.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onComplete(long nativeDevUiInstallListener, boolean success) {
    N.MExg6nhm(nativeDevUiInstallListener, success);
  }

  public static DevUiInstallListener.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.features.dev_ui.DevUiInstallListener.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new DevUiInstallListenerJni();
  }
}
