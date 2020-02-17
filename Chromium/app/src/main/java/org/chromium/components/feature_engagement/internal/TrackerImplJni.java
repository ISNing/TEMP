package org.chromium.components.feature_engagement.internal;

import J.N;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TrackerImplJni implements TrackerImpl.Natives {
  private static TrackerImpl.Natives testInstance;

  public static final JniStaticTestMocker<TrackerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.feature_engagement.internal.TrackerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.feature_engagement.internal.TrackerImpl.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void notifyEvent(long nativeTrackerImplAndroid, TrackerImpl caller, String event) {
    N.M0aLPz1m(nativeTrackerImplAndroid, caller, event);
  }

  @Override
  public boolean shouldTriggerHelpUI(long nativeTrackerImplAndroid, TrackerImpl caller,
      String feature) {
    return (boolean)N.Mr$ygyBZ(nativeTrackerImplAndroid, caller, feature);
  }

  @Override
  public boolean wouldTriggerHelpUI(long nativeTrackerImplAndroid, TrackerImpl caller,
      String feature) {
    return (boolean)N.ME$bTNVi(nativeTrackerImplAndroid, caller, feature);
  }

  @Override
  public int getTriggerState(long nativeTrackerImplAndroid, TrackerImpl caller, String feature) {
    return (int)N.MtnFGh0Q(nativeTrackerImplAndroid, caller, feature);
  }

  @Override
  public void dismissed(long nativeTrackerImplAndroid, TrackerImpl caller, String feature) {
    N.M21A_pP$(nativeTrackerImplAndroid, caller, feature);
  }

  @Override
  public TrackerImpl.DisplayLockHandleAndroid acquireDisplayLock(long nativeTrackerImplAndroid,
      TrackerImpl caller) {
    return (TrackerImpl.DisplayLockHandleAndroid)N.MdqbDqzZ(nativeTrackerImplAndroid, caller);
  }

  @Override
  public boolean isInitialized(long nativeTrackerImplAndroid, TrackerImpl caller) {
    return (boolean)N.MzNVGr12(nativeTrackerImplAndroid, caller);
  }

  @Override
  public void addOnInitializedCallback(long nativeTrackerImplAndroid, TrackerImpl caller,
      Callback<Boolean> callback) {
    N.MLFWzkLW(nativeTrackerImplAndroid, caller, callback);
  }

  @Override
  public void release(long nativeDisplayLockHandleAndroid) {
    N.MeUI3Lbh(nativeDisplayLockHandleAndroid);
  }

  public static TrackerImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.feature_engagement.internal.TrackerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new TrackerImplJni();
  }
}
