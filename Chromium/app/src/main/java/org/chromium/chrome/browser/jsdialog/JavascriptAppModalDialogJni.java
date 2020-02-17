package org.chromium.chrome.browser.jsdialog;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class JavascriptAppModalDialogJni implements JavascriptAppModalDialog.Natives {
  private static JavascriptAppModalDialog.Natives testInstance;

  public static final JniStaticTestMocker<JavascriptAppModalDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.jsdialog.JavascriptAppModalDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.jsdialog.JavascriptAppModalDialog.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void didAcceptAppModalDialog(long nativeJavascriptAppModalDialogAndroid,
      JavascriptAppModalDialog caller, String prompt, boolean suppress) {
    N.MddzEJIE(nativeJavascriptAppModalDialogAndroid, caller, prompt, suppress);
  }

  @Override
  public void didCancelAppModalDialog(long nativeJavascriptAppModalDialogAndroid,
      JavascriptAppModalDialog caller, boolean suppress) {
    N.MAXuRK83(nativeJavascriptAppModalDialogAndroid, caller, suppress);
  }

  @Override
  public JavascriptAppModalDialog getCurrentModalDialog() {
    return (JavascriptAppModalDialog)N.MMN$TGrU();
  }

  public static JavascriptAppModalDialog.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.jsdialog.JavascriptAppModalDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new JavascriptAppModalDialogJni();
  }
}
