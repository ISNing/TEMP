package org.chromium.chrome.browser.thinwebview.internal;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.thinwebview.CompositorView;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ThinWebViewImplJni implements ThinWebViewImpl.Natives {
  private static ThinWebViewImpl.Natives testInstance;

  public static final JniStaticTestMocker<ThinWebViewImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.thinwebview.internal.ThinWebViewImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.thinwebview.internal.ThinWebViewImpl.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(ThinWebViewImpl caller, CompositorView compositorView,
      WindowAndroid windowAndroid) {
    return (long)N.MllKEBgp(caller, compositorView, windowAndroid);
  }

  @Override
  public void destroy(long nativeThinWebView, ThinWebViewImpl caller) {
    N.MvPzyW2a(nativeThinWebView, caller);
  }

  @Override
  public void setWebContents(long nativeThinWebView, ThinWebViewImpl caller,
      WebContents webContents) {
    N.MwCiReoH(nativeThinWebView, caller, webContents);
  }

  @Override
  public void sizeChanged(long nativeThinWebView, ThinWebViewImpl caller, int width, int height) {
    N.MMSdAijf(nativeThinWebView, caller, width, height);
  }

  public static ThinWebViewImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.thinwebview.internal.ThinWebViewImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ThinWebViewImplJni();
  }
}
