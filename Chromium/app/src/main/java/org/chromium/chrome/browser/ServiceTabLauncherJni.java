package org.chromium.chrome.browser;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ServiceTabLauncherJni implements ServiceTabLauncher.Natives {
  private static ServiceTabLauncher.Natives testInstance;

  public static final JniStaticTestMocker<ServiceTabLauncher.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ServiceTabLauncher.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ServiceTabLauncher.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onWebContentsForRequestAvailable(int requestId, WebContents webContents) {
    N.MMtVSAe3(requestId, webContents);
  }

  public static ServiceTabLauncher.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ServiceTabLauncher.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ServiceTabLauncherJni();
  }
}
