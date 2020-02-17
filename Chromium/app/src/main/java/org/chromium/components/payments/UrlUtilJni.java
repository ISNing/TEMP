package org.chromium.components.payments;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UrlUtilJni implements UrlUtil.Natives {
  private static UrlUtil.Natives testInstance;

  public static final JniStaticTestMocker<UrlUtil.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.UrlUtil.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.components.payments.UrlUtil.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public boolean isOriginAllowedToUseWebPaymentApis(String url) {
    return (boolean)N.MIhiwY_4(url);
  }

  @Override
  public boolean isLocalDevelopmentUrl(String url) {
    return (boolean)N.MSVZEfSr(url);
  }

  public static UrlUtil.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.UrlUtil.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new UrlUtilJni();
  }
}
