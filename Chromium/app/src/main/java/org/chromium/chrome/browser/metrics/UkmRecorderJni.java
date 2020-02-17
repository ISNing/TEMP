package org.chromium.chrome.browser.metrics;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UkmRecorderJni implements UkmRecorder.Natives {
  private static UkmRecorder.Natives testInstance;

  public static final JniStaticTestMocker<UkmRecorder.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.metrics.UkmRecorder.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.metrics.UkmRecorder.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void recordEvent(WebContents webContents, String eventName) {
    N.MMHpDwt$(webContents, eventName);
  }

  public static UkmRecorder.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.metrics.UkmRecorder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new UkmRecorderJni();
  }
}
