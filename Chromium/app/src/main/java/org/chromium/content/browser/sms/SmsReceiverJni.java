package org.chromium.content.browser.sms;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SmsReceiverJni implements SmsReceiver.Natives {
  private static SmsReceiver.Natives testInstance;

  public static final JniStaticTestMocker<SmsReceiver.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.sms.SmsReceiver.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.content.browser.sms.SmsReceiver.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onReceive(long nativeSmsProviderAndroid, String sms) {
    N.McAbc1cO(nativeSmsProviderAndroid, sms);
  }

  @Override
  public void onTimeout(long nativeSmsProviderAndroid) {
    N.MW3td7Xy(nativeSmsProviderAndroid);
  }

  public static SmsReceiver.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.sms.SmsReceiver.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new SmsReceiverJni();
  }
}
