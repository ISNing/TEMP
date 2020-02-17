package org.chromium.chrome.browser.download;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DownloadStartupUtilsJni implements DownloadStartupUtils.Natives {
  private static DownloadStartupUtils.Natives testInstance;

  public static final JniStaticTestMocker<DownloadStartupUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.download.DownloadStartupUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.download.DownloadStartupUtils.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void ensureDownloadSystemInitialized(boolean isFullBrowserStarted, boolean isInCognito) {
    N.MpMcd8D3(isFullBrowserStarted, isInCognito);
  }

  public static DownloadStartupUtils.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.download.DownloadStartupUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new DownloadStartupUtilsJni();
  }
}
