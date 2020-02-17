package org.chromium.chrome.browser.preferences;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PrefServiceBridgeJni implements PrefServiceBridge.Natives {
  private static PrefServiceBridge.Natives testInstance;

  public static final JniStaticTestMocker<PrefServiceBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.preferences.PrefServiceBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.preferences.PrefServiceBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public boolean getBoolean(int preference) {
    return (boolean)N.MVEXC539(preference);
  }

  @Override
  public void setBoolean(int preference, boolean value) {
    N.MtxNNFos(preference, value);
  }

  @Override
  public int getInteger(int preference) {
    return (int)N.MwgN6uYI(preference);
  }

  @Override
  public void setInteger(int preference, int value) {
    N.Mh_4splp(preference, value);
  }

  @Override
  public String getString(int preference) {
    return (String)N.M5zg4i3y(preference);
  }

  @Override
  public void setString(int preference, String value) {
    N.MWFDxzjM(preference, value);
  }

  @Override
  public boolean isManagedPreference(int preference) {
    return (boolean)N.MfrE5AXj(preference);
  }

  public static PrefServiceBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.preferences.PrefServiceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new PrefServiceBridgeJni();
  }
}
