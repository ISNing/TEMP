package org.chromium.components.invalidation;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class InvalidationServiceJni implements InvalidationService.Natives {
  private static InvalidationService.Natives testInstance;

  public static final JniStaticTestMocker<InvalidationService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.invalidation.InvalidationService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.invalidation.InvalidationService.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void invalidate(long nativeInvalidationServiceAndroid, InvalidationService caller,
      int objectSource, String objectId, long version, String payload) {
    N.MYaVBN2s(nativeInvalidationServiceAndroid, caller, objectSource, objectId, version, payload);
  }

  public static InvalidationService.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.invalidation.InvalidationService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new InvalidationServiceJni();
  }
}
