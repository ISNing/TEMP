package org.chromium.components.autofill;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AutofillProviderJni implements AutofillProvider.Natives {
  private static AutofillProvider.Natives testInstance;

  public static final JniStaticTestMocker<AutofillProvider.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.autofill.AutofillProvider.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.autofill.AutofillProvider.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onAutofillAvailable(long nativeAutofillProviderAndroid, AutofillProvider caller,
      FormData formData) {
    N.MxVH2h8w(nativeAutofillProviderAndroid, caller, formData);
  }

  public static AutofillProvider.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.autofill.AutofillProvider.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new AutofillProviderJni();
  }
}
