package org.chromium.chrome.browser.notifications.scheduler;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DisplayAgentJni implements DisplayAgent.Natives {
  private static DisplayAgent.Natives testInstance;

  public static final JniStaticTestMocker<DisplayAgent.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.notifications.scheduler.DisplayAgent.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.notifications.scheduler.DisplayAgent.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onUserAction(Profile profile, int clientType, int actionType, String guid, int type,
      String buttonId) {
    N.MJnQd5Zg(profile, clientType, actionType, guid, type, buttonId);
  }

  public static DisplayAgent.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.notifications.scheduler.DisplayAgent.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new DisplayAgentJni();
  }
}
