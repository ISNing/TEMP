package org.chromium.chrome.browser.download.service;

import J.N;
import java.lang.Boolean;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.ProfileKey;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DownloadBackgroundTaskJni implements DownloadBackgroundTask.Natives {
  private static DownloadBackgroundTask.Natives testInstance;

  public static final JniStaticTestMocker<DownloadBackgroundTask.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.download.service.DownloadBackgroundTask.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.download.service.DownloadBackgroundTask.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void startBackgroundTask(DownloadBackgroundTask caller, ProfileKey key, int taskType,
      Callback<Boolean> callback) {
    N.MBBY92FO(caller, key, taskType, callback);
  }

  @Override
  public boolean stopBackgroundTask(DownloadBackgroundTask caller, ProfileKey key, int taskType) {
    return (boolean)N.MtXApQ3N(caller, key, taskType);
  }

  public static DownloadBackgroundTask.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.download.service.DownloadBackgroundTask.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new DownloadBackgroundTaskJni();
  }
}
