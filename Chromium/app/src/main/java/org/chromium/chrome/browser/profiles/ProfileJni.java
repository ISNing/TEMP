package org.chromium.chrome.browser.profiles;

import J.N;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ProfileJni implements Profile.Natives {
  private static Profile.Natives testInstance;

  public static final JniStaticTestMocker<Profile.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.profiles.Profile.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.profiles.Profile.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public Object getLastUsedProfile() {
    return (Object)N.MSMsclqn();
  }

  @Override
  public Object fromWebContents(WebContents webContents) {
    return (Object)N.MvvJTucy(webContents);
  }

  @Override
  public void destroyWhenAppropriate(long nativeProfileAndroid, Profile caller) {
    N.MScIZBOB(nativeProfileAndroid, caller);
  }

  @Override
  public Object getOriginalProfile(long nativeProfileAndroid, Profile caller) {
    return (Object)N.MD_ez$kP(nativeProfileAndroid, caller);
  }

  @Override
  public Object getOffTheRecordProfile(long nativeProfileAndroid, Profile caller) {
    return (Object)N.MIzCSj22(nativeProfileAndroid, caller);
  }

  @Override
  public boolean hasOffTheRecordProfile(long nativeProfileAndroid, Profile caller) {
    return (boolean)N.MQioXkwA(nativeProfileAndroid, caller);
  }

  @Override
  public boolean isOffTheRecord(long nativeProfileAndroid, Profile caller) {
    return (boolean)N.MEt51B0E(nativeProfileAndroid, caller);
  }

  @Override
  public boolean isChild(long nativeProfileAndroid, Profile caller) {
    return (boolean)N.MBL3czGJ(nativeProfileAndroid, caller);
  }

  @Override
  public void wipe(long nativeProfileAndroid, Profile caller) {
    N.Mfjp8BfR(nativeProfileAndroid, caller);
  }

  @Override
  public Object getProfileKey(long nativeProfileAndroid, Profile caller) {
    return (Object)N.MjGj0xKY(nativeProfileAndroid, caller);
  }

  public static Profile.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.profiles.Profile.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ProfileJni();
  }
}
