package org.chromium.components.viz.service.frame_sinks;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class ExternalBeginFrameSourceAndroidJni implements ExternalBeginFrameSourceAndroid.Natives {
  private static ExternalBeginFrameSourceAndroid.Natives testInstance;

  public static final JniStaticTestMocker<ExternalBeginFrameSourceAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.viz.service.frame_sinks.ExternalBeginFrameSourceAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.viz.service.frame_sinks.ExternalBeginFrameSourceAndroid.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onVSync(long nativeExternalBeginFrameSourceAndroid,
      ExternalBeginFrameSourceAndroid caller, long vsyncTimeMicros, long vsyncPeriodMicros) {
    N.Mhc_M_H$(nativeExternalBeginFrameSourceAndroid, caller, vsyncTimeMicros, vsyncPeriodMicros);
  }

  public static ExternalBeginFrameSourceAndroid.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.viz.service.frame_sinks.ExternalBeginFrameSourceAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ExternalBeginFrameSourceAndroidJni();
  }
}
