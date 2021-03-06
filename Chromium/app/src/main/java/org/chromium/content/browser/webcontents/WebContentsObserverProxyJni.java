package org.chromium.content.browser.webcontents;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class WebContentsObserverProxyJni implements WebContentsObserverProxy.Natives {
  private static WebContentsObserverProxy.Natives testInstance;

  public static final JniStaticTestMocker<WebContentsObserverProxy.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.webcontents.WebContentsObserverProxy.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.webcontents.WebContentsObserverProxy.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(WebContentsObserverProxy caller, WebContentsImpl webContents) {
    return (long)N.MTpUzW91(caller, webContents);
  }

  @Override
  public void destroy(long nativeWebContentsObserverProxy, WebContentsObserverProxy caller) {
    N.M7giG0Ri(nativeWebContentsObserverProxy, caller);
  }

  public static WebContentsObserverProxy.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.webcontents.WebContentsObserverProxy.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new WebContentsObserverProxyJni();
  }
}
