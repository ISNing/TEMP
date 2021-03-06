package org.chromium.chrome.browser.infobar;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AutofillSaveCardInfoBarJni implements AutofillSaveCardInfoBar.Natives {
  private static AutofillSaveCardInfoBar.Natives testInstance;

  public static final JniStaticTestMocker<AutofillSaveCardInfoBar.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.infobar.AutofillSaveCardInfoBar.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.infobar.AutofillSaveCardInfoBar.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onLegalMessageLinkClicked(long nativeAutofillSaveCardInfoBar,
      AutofillSaveCardInfoBar caller, String url) {
    N.MLmVDUZa(nativeAutofillSaveCardInfoBar, caller, url);
  }

  public static AutofillSaveCardInfoBar.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.infobar.AutofillSaveCardInfoBar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new AutofillSaveCardInfoBarJni();
  }
}
