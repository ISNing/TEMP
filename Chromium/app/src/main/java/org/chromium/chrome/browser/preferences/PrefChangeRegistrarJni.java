package org.chromium.chrome.browser.preferences;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PrefChangeRegistrarJni implements PrefChangeRegistrar.Natives {
  private static PrefChangeRegistrar.Natives testInstance;

  public static final JniStaticTestMocker<PrefChangeRegistrar.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.preferences.PrefChangeRegistrar.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.preferences.PrefChangeRegistrar.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(PrefChangeRegistrar caller) {
    return (long)N.MiTdj3xP(caller);
  }

  @Override
  public void add(long nativePrefChangeRegistrarAndroid, PrefChangeRegistrar caller,
      int preference) {
    N.Mrf8X6ah(nativePrefChangeRegistrarAndroid, caller, preference);
  }

  @Override
  public void remove(long nativePrefChangeRegistrarAndroid, PrefChangeRegistrar caller,
      int preference) {
    N.M0E$fVRB(nativePrefChangeRegistrarAndroid, caller, preference);
  }

  @Override
  public void destroy(long nativePrefChangeRegistrarAndroid, PrefChangeRegistrar caller) {
    N.Mn0XciAY(nativePrefChangeRegistrarAndroid, caller);
  }

  public static PrefChangeRegistrar.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.preferences.PrefChangeRegistrar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new PrefChangeRegistrarJni();
  }
}
