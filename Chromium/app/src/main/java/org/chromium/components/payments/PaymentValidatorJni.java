package org.chromium.components.payments;

import J.N;
import java.lang.Override;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PaymentValidatorJni implements PaymentValidator.Natives {
  private static PaymentValidator.Natives testInstance;

  public static final JniStaticTestMocker<PaymentValidator.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.PaymentValidator.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.payments.PaymentValidator.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public boolean validatePaymentDetailsAndroid(ByteBuffer buffer) {
    return (boolean)N.MFiPq6M_(buffer);
  }

  @Override
  public boolean validatePaymentValidationErrorsAndroid(ByteBuffer buffer) {
    return (boolean)N.MQ3mQqrV(buffer);
  }

  public static PaymentValidator.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.PaymentValidator.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new PaymentValidatorJni();
  }
}
