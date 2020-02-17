package org.chromium.components.payments;

import J.N;
import java.lang.Override;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PaymentHandlerHostJni implements PaymentHandlerHost.Natives {
  private static PaymentHandlerHost.Natives testInstance;

  public static final JniStaticTestMocker<PaymentHandlerHost.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.PaymentHandlerHost.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.payments.PaymentHandlerHost.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(WebContents webContents,
      PaymentHandlerHost.PaymentHandlerHostDelegate delegate) {
    return (long)N.MNMwlyDN(webContents, delegate);
  }

  @Override
  public boolean isWaitingForPaymentDetailsUpdate(long nativePaymentHandlerHost) {
    return (boolean)N.MP9HwcPo(nativePaymentHandlerHost);
  }

  @Override
  public long getNativePaymentHandlerHost(long nativePaymentHandlerHost) {
    return (long)N.MMZ3xawE(nativePaymentHandlerHost);
  }

  @Override
  public void updateWith(long nativePaymentHandlerHost, ByteBuffer responseBuffer) {
    N.MctjpILQ(nativePaymentHandlerHost, responseBuffer);
  }

  @Override
  public void onPaymentDetailsNotUpdated(long nativePaymentHandlerHost) {
    N.MMPRXzHl(nativePaymentHandlerHost);
  }

  @Override
  public void destroy(long nativePaymentHandlerHost) {
    N.MDWZVETg(nativePaymentHandlerHost);
  }

  public static PaymentHandlerHost.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.PaymentHandlerHost.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new PaymentHandlerHostJni();
  }
}
