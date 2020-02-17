package org.chromium.components.gcm_driver;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class GCMDriverJni implements GCMDriver.Natives {
  private static GCMDriver.Natives testInstance;

  public static final JniStaticTestMocker<GCMDriver.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.gcm_driver.GCMDriver.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.components.gcm_driver.GCMDriver.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onRegisterFinished(long nativeGCMDriverAndroid, GCMDriver caller, String appId,
      String registrationId, boolean success) {
    N.MOEO6cdX(nativeGCMDriverAndroid, caller, appId, registrationId, success);
  }

  @Override
  public void onUnregisterFinished(long nativeGCMDriverAndroid, GCMDriver caller, String appId,
      boolean success) {
    N.MDziew73(nativeGCMDriverAndroid, caller, appId, success);
  }

  @Override
  public void onMessageReceived(long nativeGCMDriverAndroid, GCMDriver caller, String appId,
      String senderId, String messageId, String collapseKey, byte[] rawData,
      String[] dataKeysAndValues) {
    N.M6eL4wmM(nativeGCMDriverAndroid, caller, appId, senderId, messageId, collapseKey, rawData, dataKeysAndValues);
  }

  public static GCMDriver.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.gcm_driver.GCMDriver.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new GCMDriverJni();
  }
}
