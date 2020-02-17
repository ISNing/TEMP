package org.chromium.chrome.browser.media.router;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChromeMediaRouterDialogControllerJni implements ChromeMediaRouterDialogController.Natives {
  private static ChromeMediaRouterDialogController.Natives testInstance;

  public static final JniStaticTestMocker<ChromeMediaRouterDialogController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.media.router.ChromeMediaRouterDialogController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.media.router.ChromeMediaRouterDialogController.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onDialogCancelled(long nativeMediaRouterDialogControllerAndroid,
      ChromeMediaRouterDialogController caller) {
    N.MHeKSwqA(nativeMediaRouterDialogControllerAndroid, caller);
  }

  @Override
  public void onSinkSelected(long nativeMediaRouterDialogControllerAndroid,
      ChromeMediaRouterDialogController caller, String sourceUrn, String sinkId) {
    N.MfVEBdbx(nativeMediaRouterDialogControllerAndroid, caller, sourceUrn, sinkId);
  }

  @Override
  public void onRouteClosed(long nativeMediaRouterDialogControllerAndroid,
      ChromeMediaRouterDialogController caller, String routeId) {
    N.MhNP7RHK(nativeMediaRouterDialogControllerAndroid, caller, routeId);
  }

  @Override
  public void onMediaSourceNotSupported(long nativeMediaRouterDialogControllerAndroid,
      ChromeMediaRouterDialogController caller) {
    N.MHZ$7Nsj(nativeMediaRouterDialogControllerAndroid, caller);
  }

  public static ChromeMediaRouterDialogController.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.media.router.ChromeMediaRouterDialogController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ChromeMediaRouterDialogControllerJni();
  }
}
