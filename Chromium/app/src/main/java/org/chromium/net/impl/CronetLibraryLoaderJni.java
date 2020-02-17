package org.chromium.net.impl;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CronetLibraryLoaderJni implements CronetLibraryLoader.Natives {
  private static CronetLibraryLoader.Natives testInstance;

  public static final JniStaticTestMocker<CronetLibraryLoader.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.impl.CronetLibraryLoader.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.impl.CronetLibraryLoader.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void cronetInitOnInitThread() {
    N.MROCxiBo();
  }

  @Override
  public String getCronetVersion() {
    return (String)N.M6xubM8G();
  }

  public static CronetLibraryLoader.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.impl.CronetLibraryLoader.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new CronetLibraryLoaderJni();
  }
}
