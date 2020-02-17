package org.chromium.chrome.browser.profiles;

import J.N;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ProfileKeyJni implements ProfileKey.Natives {
  private static ProfileKey.Natives testInstance;

  public static final JniStaticTestMocker<ProfileKey.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.profiles.ProfileKey.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.profiles.ProfileKey.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public Object getLastUsedProfileKey() {
    return (Object)N.M3mIrj7h();
  }

  @Override
  public Object getOriginalKey(long nativeProfileKeyAndroid, ProfileKey caller) {
    return (Object)N.MxX9WirW(nativeProfileKeyAndroid, caller);
  }

  @Override
  public boolean isOffTheRecord(long nativeProfileKeyAndroid, ProfileKey caller) {
    return (boolean)N.MdejbNQu(nativeProfileKeyAndroid, caller);
  }

  public static ProfileKey.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.profiles.ProfileKey.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ProfileKeyJni();
  }
}
