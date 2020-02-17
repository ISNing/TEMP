package org.chromium.chrome.browser.download;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DownloadMediaParserBridgeJni implements DownloadMediaParserBridge.Natives {
  private static DownloadMediaParserBridge.Natives testInstance;

  public static final JniStaticTestMocker<DownloadMediaParserBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.download.DownloadMediaParserBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.download.DownloadMediaParserBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(DownloadMediaParserBridge caller, String mimeType, String filePath,
      Callback<DownloadMediaData> callback) {
    return (long)N.MvtNglvt(caller, mimeType, filePath, callback);
  }

  @Override
  public void destroy(long nativeDownloadMediaParserBridge, DownloadMediaParserBridge caller) {
    N.MaiVaY9w(nativeDownloadMediaParserBridge, caller);
  }

  @Override
  public void start(long nativeDownloadMediaParserBridge, DownloadMediaParserBridge caller) {
    N.MCeR1IAt(nativeDownloadMediaParserBridge, caller);
  }

  public static DownloadMediaParserBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.download.DownloadMediaParserBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new DownloadMediaParserBridgeJni();
  }
}
