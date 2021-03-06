package org.chromium.chrome.browser.infobar;

import J.N;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SimpleConfirmInfoBarBuilderJni implements SimpleConfirmInfoBarBuilder.Natives {
  private static SimpleConfirmInfoBarBuilder.Natives testInstance;

  public static final JniStaticTestMocker<SimpleConfirmInfoBarBuilder.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.infobar.SimpleConfirmInfoBarBuilder.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.infobar.SimpleConfirmInfoBarBuilder.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void create(Tab tab, int infobarTypeIdentifier, Bitmap drawable, String message,
      String primaryText, String secondaryText, String linkText, boolean autoExpire,
      Object listener) {
    N.M3acrtLM(tab, infobarTypeIdentifier, drawable, message, primaryText, secondaryText, linkText, autoExpire, listener);
  }

  public static SimpleConfirmInfoBarBuilder.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.infobar.SimpleConfirmInfoBarBuilder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new SimpleConfirmInfoBarBuilderJni();
  }
}
