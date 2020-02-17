package org.chromium.android_webview;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AwHttpAuthHandlerJni implements AwHttpAuthHandler.Natives {
  private static AwHttpAuthHandler.Natives testInstance;

  public static final JniStaticTestMocker<AwHttpAuthHandler.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.android_webview.AwHttpAuthHandler.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.android_webview.AwHttpAuthHandler.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void proceed(long nativeAwHttpAuthHandler, AwHttpAuthHandler caller, String username,
      String password) {
    N.MWR2vWXA(nativeAwHttpAuthHandler, caller, username, password);
  }

  @Override
  public void cancel(long nativeAwHttpAuthHandler, AwHttpAuthHandler caller) {
    N.MylO8zte(nativeAwHttpAuthHandler, caller);
  }

  public static AwHttpAuthHandler.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.android_webview.AwHttpAuthHandler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new AwHttpAuthHandlerJni();
  }
}
