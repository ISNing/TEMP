package org.chromium.components.aboutui;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class CreditUtilsJni implements CreditUtils.Natives {
  private static CreditUtils.Natives testInstance;

  public static final JniStaticTestMocker<CreditUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.aboutui.CreditUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.components.aboutui.CreditUtils.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void writeCreditsHtml(int fd) {
    N.MjdhoRtd(fd);
  }

  public static CreditUtils.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.aboutui.CreditUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new CreditUtilsJni();
  }
}
