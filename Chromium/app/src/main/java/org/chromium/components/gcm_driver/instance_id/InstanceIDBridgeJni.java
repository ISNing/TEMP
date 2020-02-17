package org.chromium.components.gcm_driver.instance_id;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class InstanceIDBridgeJni implements InstanceIDBridge.Natives {
  private static InstanceIDBridge.Natives testInstance;

  public static final JniStaticTestMocker<InstanceIDBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.gcm_driver.instance_id.InstanceIDBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.gcm_driver.instance_id.InstanceIDBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void didGetID(long nativeInstanceIDAndroid, InstanceIDBridge caller, int requestId,
      String id) {
    N.MdjzqME2(nativeInstanceIDAndroid, caller, requestId, id);
  }

  @Override
  public void didGetCreationTime(long nativeInstanceIDAndroid, InstanceIDBridge caller,
      int requestId, long creationTime) {
    N.M1_H2CVT(nativeInstanceIDAndroid, caller, requestId, creationTime);
  }

  @Override
  public void didGetToken(long nativeInstanceIDAndroid, InstanceIDBridge caller, int requestId,
      String token) {
    N.MgpbhGOm(nativeInstanceIDAndroid, caller, requestId, token);
  }

  @Override
  public void didDeleteToken(long nativeInstanceIDAndroid, InstanceIDBridge caller, int requestId,
      boolean success) {
    N.MWbugtkA(nativeInstanceIDAndroid, caller, requestId, success);
  }

  @Override
  public void didDeleteID(long nativeInstanceIDAndroid, InstanceIDBridge caller, int requestId,
      boolean success) {
    N.MB$4Dsst(nativeInstanceIDAndroid, caller, requestId, success);
  }

  public static InstanceIDBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.gcm_driver.instance_id.InstanceIDBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new InstanceIDBridgeJni();
  }
}
