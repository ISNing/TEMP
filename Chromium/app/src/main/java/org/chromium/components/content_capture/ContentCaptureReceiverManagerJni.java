package org.chromium.components.content_capture;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContentCaptureReceiverManagerJni implements ContentCaptureReceiverManager.Natives {
  private static ContentCaptureReceiverManager.Natives testInstance;

  public static final JniStaticTestMocker<ContentCaptureReceiverManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.content_capture.ContentCaptureReceiverManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.content_capture.ContentCaptureReceiverManager.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public ContentCaptureReceiverManager createOrGet(WebContents webContents) {
    return (ContentCaptureReceiverManager)N.MxegY8Dy(webContents);
  }

  public static ContentCaptureReceiverManager.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.content_capture.ContentCaptureReceiverManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ContentCaptureReceiverManagerJni();
  }
}
