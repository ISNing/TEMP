package org.chromium.components.sync;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ModelTypeHelperJni implements ModelTypeHelper.Natives {
  private static ModelTypeHelper.Natives testInstance;

  public static final JniStaticTestMocker<ModelTypeHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.sync.ModelTypeHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.components.sync.ModelTypeHelper.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public String modelTypeToNotificationType(int modelType) {
    return (String)N.MN$MxnGN(modelType);
  }

  public static ModelTypeHelper.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.sync.ModelTypeHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ModelTypeHelperJni();
  }
}
