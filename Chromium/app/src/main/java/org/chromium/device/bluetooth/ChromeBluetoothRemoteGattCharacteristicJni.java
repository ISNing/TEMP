package org.chromium.device.bluetooth;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChromeBluetoothRemoteGattCharacteristicJni implements ChromeBluetoothRemoteGattCharacteristic.Natives {
  private static ChromeBluetoothRemoteGattCharacteristic.Natives testInstance;

  public static final JniStaticTestMocker<ChromeBluetoothRemoteGattCharacteristic.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onChanged(long nativeBluetoothRemoteGattCharacteristicAndroid,
      ChromeBluetoothRemoteGattCharacteristic caller, byte[] value) {
    N.MZCKcdTH(nativeBluetoothRemoteGattCharacteristicAndroid, caller, value);
  }

  @Override
  public void onRead(long nativeBluetoothRemoteGattCharacteristicAndroid,
      ChromeBluetoothRemoteGattCharacteristic caller, int status, byte[] value) {
    N.Mn9Gzi$d(nativeBluetoothRemoteGattCharacteristicAndroid, caller, status, value);
  }

  @Override
  public void onWrite(long nativeBluetoothRemoteGattCharacteristicAndroid,
      ChromeBluetoothRemoteGattCharacteristic caller, int status) {
    N.M3TCxDs5(nativeBluetoothRemoteGattCharacteristicAndroid, caller, status);
  }

  @Override
  public void createGattRemoteDescriptor(long nativeBluetoothRemoteGattCharacteristicAndroid,
      ChromeBluetoothRemoteGattCharacteristic caller, String instanceId,
      Wrappers.BluetoothGattDescriptorWrapper descriptorWrapper,
      ChromeBluetoothDevice chromeBluetoothDevice) {
    N.MkqvrLoV(nativeBluetoothRemoteGattCharacteristicAndroid, caller, instanceId, descriptorWrapper, chromeBluetoothDevice);
  }

  public static ChromeBluetoothRemoteGattCharacteristic.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ChromeBluetoothRemoteGattCharacteristicJni();
  }
}
