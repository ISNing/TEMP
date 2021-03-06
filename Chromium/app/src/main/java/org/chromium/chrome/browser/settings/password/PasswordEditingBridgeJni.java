package org.chromium.chrome.browser.settings.password;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PasswordEditingBridgeJni implements PasswordEditingBridge.Natives {
  private static PasswordEditingBridge.Natives testInstance;

  public static final JniStaticTestMocker<PasswordEditingBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.settings.password.PasswordEditingBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.settings.password.PasswordEditingBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void destroy(long nativePasswordEditingBridge, PasswordEditingBridge caller) {
    N.M7EQEevY(nativePasswordEditingBridge, caller);
  }

  @Override
  public void handleEditSavedPasswordEntry(long nativePasswordEditingBridge,
      PasswordEditingBridge caller, String newUsername, String newPassword) {
    N.MTErU90I(nativePasswordEditingBridge, caller, newUsername, newPassword);
  }

  public static PasswordEditingBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.settings.password.PasswordEditingBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new PasswordEditingBridgeJni();
  }
}
