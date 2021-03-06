package org.chromium.midi;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UsbMidiDeviceAndroidJni implements UsbMidiDeviceAndroid.Natives {
  private static UsbMidiDeviceAndroid.Natives testInstance;

  public static final JniStaticTestMocker<UsbMidiDeviceAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.midi.UsbMidiDeviceAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.midi.UsbMidiDeviceAndroid.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onData(long nativeUsbMidiDeviceAndroid, int endpointNumber, byte[] data) {
    N.MNGB4bj1(nativeUsbMidiDeviceAndroid, endpointNumber, data);
  }

  public static UsbMidiDeviceAndroid.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.midi.UsbMidiDeviceAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new UsbMidiDeviceAndroidJni();
  }
}
