package org.chromium.components.payments;

import J.N;
import java.lang.Override;
import java.net.URI;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PaymentManifestDownloaderJni implements PaymentManifestDownloader.Natives {
  private static PaymentManifestDownloader.Natives testInstance;

  public static final JniStaticTestMocker<PaymentManifestDownloader.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.PaymentManifestDownloader.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.payments.PaymentManifestDownloader.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(WebContents webContents) {
    return (long)N.MzoXDvTe(webContents);
  }

  @Override
  public void downloadPaymentMethodManifest(long nativePaymentManifestDownloaderAndroid,
      PaymentManifestDownloader caller, URI methodName,
      PaymentManifestDownloader.ManifestDownloadCallback callback) {
    N.MCkwfWHm(nativePaymentManifestDownloaderAndroid, caller, methodName, callback);
  }

  @Override
  public void downloadWebAppManifest(long nativePaymentManifestDownloaderAndroid,
      PaymentManifestDownloader caller, URI webAppManifestUri,
      PaymentManifestDownloader.ManifestDownloadCallback callback) {
    N.MpedIYcV(nativePaymentManifestDownloaderAndroid, caller, webAppManifestUri, callback);
  }

  @Override
  public void destroy(long nativePaymentManifestDownloaderAndroid,
      PaymentManifestDownloader caller) {
    N.MJUrxDH$(nativePaymentManifestDownloaderAndroid, caller);
  }

  public static PaymentManifestDownloader.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.PaymentManifestDownloader.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new PaymentManifestDownloaderJni();
  }
}
