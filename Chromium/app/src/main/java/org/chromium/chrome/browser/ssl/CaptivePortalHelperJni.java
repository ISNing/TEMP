package org.chromium.chrome.browser.ssl;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CaptivePortalHelperJni implements CaptivePortalHelper.Natives {
  private static CaptivePortalHelper.Natives testInstance;

  public static final JniStaticTestMocker<CaptivePortalHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ssl.CaptivePortalHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ssl.CaptivePortalHelper.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void setCaptivePortalCertificateForTesting(String spkiHash) {
    N.MoYkS09g(spkiHash);
  }

  @Override
  public void setOSReportsCaptivePortalForTesting(boolean osReportsCaptivePortal) {
    N.MlfVvzaG(osReportsCaptivePortal);
  }

  public static CaptivePortalHelper.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ssl.CaptivePortalHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new CaptivePortalHelperJni();
  }
}
