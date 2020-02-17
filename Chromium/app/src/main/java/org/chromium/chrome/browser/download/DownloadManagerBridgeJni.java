package org.chromium.chrome.browser.download;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DownloadManagerBridgeJni implements DownloadManagerBridge.Natives {
  private static DownloadManagerBridge.Natives testInstance;

  public static final JniStaticTestMocker<DownloadManagerBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.download.DownloadManagerBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.download.DownloadManagerBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onAddCompletedDownloadDone(long callbackId, long downloadId) {
    N.Mct0JWyi(callbackId, downloadId);
  }

  public static DownloadManagerBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.download.DownloadManagerBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new DownloadManagerBridgeJni();
  }
}
