package org.chromium.device.bluetooth;

import J.N;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChromeBluetoothAdapterJni implements ChromeBluetoothAdapter.Natives {
  private static ChromeBluetoothAdapter.Natives testInstance;

  public static final JniStaticTestMocker<ChromeBluetoothAdapter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.bluetooth.ChromeBluetoothAdapter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.device.bluetooth.ChromeBluetoothAdapter.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onScanFailed(long nativeBluetoothAdapterAndroid, ChromeBluetoothAdapter caller) {
    N.Mq3WoOFf(nativeBluetoothAdapterAndroid, caller);
  }

  @Override
  public void createOrUpdateDeviceOnScan(long nativeBluetoothAdapterAndroid,
      ChromeBluetoothAdapter caller, String address, Wrappers.BluetoothDeviceWrapper deviceWrapper,
      String localName, int rssi, String[] advertisedUuids, int txPower, String[] serviceDataKeys,
      Object[] serviceDataValues, int[] manufacturerDataKeys, Object[] manufacturerDataValues) {
    N.MOuw3NGo(nativeBluetoothAdapterAndroid, caller, address, deviceWrapper, localName, rssi, advertisedUuids, txPower, serviceDataKeys, serviceDataValues, manufacturerDataKeys, manufacturerDataValues);
  }

  @Override
  public void onAdapterStateChanged(long nativeBluetoothAdapterAndroid,
      ChromeBluetoothAdapter caller, boolean powered) {
    N.MGGbKqrZ(nativeBluetoothAdapterAndroid, caller, powered);
  }

  public static ChromeBluetoothAdapter.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.bluetooth.ChromeBluetoothAdapter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ChromeBluetoothAdapterJni();
  }
}
