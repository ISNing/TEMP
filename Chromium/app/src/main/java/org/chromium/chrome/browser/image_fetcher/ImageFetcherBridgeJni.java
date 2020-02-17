package org.chromium.chrome.browser.image_fetcher;

import J.N;
import android.graphics.Bitmap;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ImageFetcherBridgeJni implements ImageFetcherBridge.Natives {
  private static ImageFetcherBridge.Natives testInstance;

  public static final JniStaticTestMocker<ImageFetcherBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.image_fetcher.ImageFetcherBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.image_fetcher.ImageFetcherBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(Profile profile) {
    return (long)N.Mv_K68f5(profile);
  }

  @Override
  public void destroy(long nativeImageFetcherBridge, ImageFetcherBridge caller) {
    N.MoBfFA4e(nativeImageFetcherBridge, caller);
  }

  @Override
  public String getFilePath(long nativeImageFetcherBridge, ImageFetcherBridge caller, String url) {
    return (String)N.Mtj63gRg(nativeImageFetcherBridge, caller, url);
  }

  @Override
  public void fetchImageData(long nativeImageFetcherBridge, ImageFetcherBridge caller, int config,
      String url, String clientName, Callback<byte[]> callback) {
    N.Mq$OMPDL(nativeImageFetcherBridge, caller, config, url, clientName, callback);
  }

  @Override
  public void fetchImage(long nativeImageFetcherBridge, ImageFetcherBridge caller, int config,
      String url, String clientName, Callback<Bitmap> callback) {
    N.MVa6KqKn(nativeImageFetcherBridge, caller, config, url, clientName, callback);
  }

  @Override
  public void reportEvent(long nativeImageFetcherBridge, ImageFetcherBridge caller,
      String clientName, int eventId) {
    N.M1k4kLxJ(nativeImageFetcherBridge, caller, clientName, eventId);
  }

  @Override
  public void reportCacheHitTime(long nativeImageFetcherBridge, ImageFetcherBridge caller,
      String clientName, long startTimeMillis) {
    N.M6WiBncI(nativeImageFetcherBridge, caller, clientName, startTimeMillis);
  }

  @Override
  public void reportTotalFetchTimeFromNative(long nativeImageFetcherBridge,
      ImageFetcherBridge caller, String clientName, long startTimeMillis) {
    N.MCVt6f5k(nativeImageFetcherBridge, caller, clientName, startTimeMillis);
  }

  public static ImageFetcherBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.image_fetcher.ImageFetcherBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ImageFetcherBridgeJni();
  }
}
