package org.chromium.chrome.browser.sessions;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SessionTabHelperJni implements SessionTabHelper.Natives {
  private static SessionTabHelper.Natives testInstance;

  public static final JniStaticTestMocker<SessionTabHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.sessions.SessionTabHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.sessions.SessionTabHelper.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public int idForTab(WebContents webContents) {
    return (int)N.M02VbCiT(webContents);
  }

  public static SessionTabHelper.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.sessions.SessionTabHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new SessionTabHelperJni();
  }
}
