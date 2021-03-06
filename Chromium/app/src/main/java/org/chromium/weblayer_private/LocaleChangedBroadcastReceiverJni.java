package org.chromium.weblayer_private;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LocaleChangedBroadcastReceiverJni implements LocaleChangedBroadcastReceiver.Natives {
  private static LocaleChangedBroadcastReceiver.Natives testInstance;

  public static final JniStaticTestMocker<LocaleChangedBroadcastReceiver.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.LocaleChangedBroadcastReceiver.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.weblayer_private.LocaleChangedBroadcastReceiver.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void localeChanged() {
    N.MNVsdYhF();
  }

  public static LocaleChangedBroadcastReceiver.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.LocaleChangedBroadcastReceiver.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new LocaleChangedBroadcastReceiverJni();
  }
}
