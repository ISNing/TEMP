package org.chromium.components.payments;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OriginSecurityCheckerJni implements OriginSecurityChecker.Natives {
  private static OriginSecurityChecker.Natives testInstance;

  public static final JniStaticTestMocker<OriginSecurityChecker.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.OriginSecurityChecker.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.payments.OriginSecurityChecker.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public boolean isOriginSecure(String url) {
    return (boolean)N.MdU5wLP0(url);
  }

  @Override
  public boolean isSchemeCryptographic(String url) {
    return (boolean)N.MHuHQ1NP(url);
  }

  public static OriginSecurityChecker.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.OriginSecurityChecker.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new OriginSecurityCheckerJni();
  }
}
