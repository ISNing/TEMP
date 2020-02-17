package org.chromium.components.download;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class NetworkStatusListenerAndroidJni implements NetworkStatusListenerAndroid.Natives {
  private static NetworkStatusListenerAndroid.Natives testInstance;

  public static final JniStaticTestMocker<NetworkStatusListenerAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.download.NetworkStatusListenerAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.download.NetworkStatusListenerAndroid.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void notifyNetworkChange(long nativeNetworkStatusListenerAndroid,
      NetworkStatusListenerAndroid caller, int connectionType) {
    N.M9CWqWuv(nativeNetworkStatusListenerAndroid, caller, connectionType);
  }

  public static NetworkStatusListenerAndroid.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.download.NetworkStatusListenerAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new NetworkStatusListenerAndroidJni();
  }
}
