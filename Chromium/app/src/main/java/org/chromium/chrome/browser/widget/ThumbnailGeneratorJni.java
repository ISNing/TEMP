package org.chromium.chrome.browser.widget;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ThumbnailGeneratorJni implements ThumbnailGenerator.Natives {
  private static ThumbnailGenerator.Natives testInstance;

  public static final JniStaticTestMocker<ThumbnailGenerator.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.widget.ThumbnailGenerator.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.widget.ThumbnailGenerator.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(ThumbnailGenerator caller) {
    return (long)N.MKHzMUCp(caller);
  }

  @Override
  public void destroy(long nativeThumbnailGenerator, ThumbnailGenerator caller) {
    N.MUHOaGY3(nativeThumbnailGenerator, caller);
  }

  @Override
  public void retrieveThumbnail(long nativeThumbnailGenerator, ThumbnailGenerator caller,
      String contentId, String filePath, String mimeType, int thumbnailSize,
      ThumbnailGeneratorCallback callback) {
    N.MkH5t6GB(nativeThumbnailGenerator, caller, contentId, filePath, mimeType, thumbnailSize, callback);
  }

  public static ThumbnailGenerator.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.widget.ThumbnailGenerator.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ThumbnailGeneratorJni();
  }
}
