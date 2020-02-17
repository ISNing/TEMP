package org.chromium.chrome.browser.vr;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class VrConsentDialogJni implements VrConsentDialog.VrConsentUiHelperImpl {
  private static VrConsentDialog.VrConsentUiHelperImpl testInstance;

  public static final JniStaticTestMocker<VrConsentDialog.VrConsentUiHelperImpl> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.vr.VrConsentDialog.VrConsentUiHelperImpl>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.vr.VrConsentDialog.VrConsentUiHelperImpl instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onUserConsentResult(long nativeGvrConsentHelperImpl, boolean allowed) {
    N.MK$BEbK1(nativeGvrConsentHelperImpl, allowed);
  }

  public static VrConsentDialog.VrConsentUiHelperImpl get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.vr.VrConsentDialog.VrConsentUiHelperImpl. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new VrConsentDialogJni();
  }
}
