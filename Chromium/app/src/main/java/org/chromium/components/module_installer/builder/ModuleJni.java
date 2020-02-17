package org.chromium.components.module_installer.builder;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ModuleJni implements Module.Natives {
  private static Module.Natives testInstance;

  public static final JniStaticTestMocker<Module.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.module_installer.builder.Module.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.module_installer.builder.Module.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void loadNative(String name, String[] libraries, String[] paks) {
    N.M_3lILbP(name, libraries, paks);
  }

  public static Module.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.module_installer.builder.Module.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ModuleJni();
  }
}
