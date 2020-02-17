package org.chromium.chrome.browser.notifications.chime;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChimeSessionJni implements ChimeSession.Natives {
  private static ChimeSession.Natives testInstance;

  public static final JniStaticTestMocker<ChimeSession.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.notifications.chime.ChimeSession.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.notifications.chime.ChimeSession.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public boolean isEnabled() {
    return (boolean)N.MZvTvaFS();
  }

  public static ChimeSession.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.notifications.chime.ChimeSession.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ChimeSessionJni();
  }
}
