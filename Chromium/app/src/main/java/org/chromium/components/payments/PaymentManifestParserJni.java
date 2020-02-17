package org.chromium.components.payments;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PaymentManifestParserJni implements PaymentManifestParser.Natives {
  private static PaymentManifestParser.Natives testInstance;

  public static final JniStaticTestMocker<PaymentManifestParser.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.PaymentManifestParser.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.payments.PaymentManifestParser.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long createPaymentManifestParserAndroid(WebContents webContents) {
    return (long)N.MfK4x$Iq(webContents);
  }

  @Override
  public void destroyPaymentManifestParserAndroid(long nativePaymentManifestParserAndroid) {
    N.MFuu4tOD(nativePaymentManifestParserAndroid);
  }

  @Override
  public void parsePaymentMethodManifest(long nativePaymentManifestParserAndroid, String content,
      PaymentManifestParser.ManifestParseCallback callback) {
    N.M$4TUaJ7(nativePaymentManifestParserAndroid, content, callback);
  }

  @Override
  public void parseWebAppManifest(long nativePaymentManifestParserAndroid, String content,
      PaymentManifestParser.ManifestParseCallback callback) {
    N.MhPu7GL6(nativePaymentManifestParserAndroid, content, callback);
  }

  public static PaymentManifestParser.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.PaymentManifestParser.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new PaymentManifestParserJni();
  }
}
