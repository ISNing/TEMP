package org.chromium.chrome.browser.device_dialog;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BluetoothScanningPermissionDialogJni implements BluetoothScanningPermissionDialog.Natives {
  private static BluetoothScanningPermissionDialog.Natives testInstance;

  public static final JniStaticTestMocker<BluetoothScanningPermissionDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.device_dialog.BluetoothScanningPermissionDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.device_dialog.BluetoothScanningPermissionDialog.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onDialogFinished(long nativeBluetoothScanningPromptAndroid, int eventType) {
    N.MTfcgGhg(nativeBluetoothScanningPromptAndroid, eventType);
  }

  public static BluetoothScanningPermissionDialog.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.device_dialog.BluetoothScanningPermissionDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new BluetoothScanningPermissionDialogJni();
  }
}
