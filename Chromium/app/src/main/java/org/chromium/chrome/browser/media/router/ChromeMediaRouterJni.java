package org.chromium.chrome.browser.media.router;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChromeMediaRouterJni implements ChromeMediaRouter.Natives {
  private static ChromeMediaRouter.Natives testInstance;

  public static final JniStaticTestMocker<ChromeMediaRouter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.media.router.ChromeMediaRouter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.media.router.ChromeMediaRouter.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onSinksReceived(long nativeMediaRouterAndroidBridge, ChromeMediaRouter caller,
      String sourceUrn, int count) {
    N.MB_K9IBb(nativeMediaRouterAndroidBridge, caller, sourceUrn, count);
  }

  @Override
  public void onRouteCreated(long nativeMediaRouterAndroidBridge, ChromeMediaRouter caller,
      String mediaRouteId, String mediaSinkId, int createRouteRequestId, boolean wasLaunched) {
    N.MWnin4CB(nativeMediaRouterAndroidBridge, caller, mediaRouteId, mediaSinkId, createRouteRequestId, wasLaunched);
  }

  @Override
  public void onRouteRequestError(long nativeMediaRouterAndroidBridge, ChromeMediaRouter caller,
      String errorText, int createRouteRequestId) {
    N.MRmcpyQK(nativeMediaRouterAndroidBridge, caller, errorText, createRouteRequestId);
  }

  @Override
  public void onRouteTerminated(long nativeMediaRouterAndroidBridge, ChromeMediaRouter caller,
      String mediaRouteId) {
    N.Mb6MktAa(nativeMediaRouterAndroidBridge, caller, mediaRouteId);
  }

  @Override
  public void onRouteClosed(long nativeMediaRouterAndroidBridge, ChromeMediaRouter caller,
      String mediaRouteId, String message) {
    N.MKZBEsTm(nativeMediaRouterAndroidBridge, caller, mediaRouteId, message);
  }

  @Override
  public void onMessage(long nativeMediaRouterAndroidBridge, ChromeMediaRouter caller,
      String mediaRouteId, String message) {
    N.MrOx2mTw(nativeMediaRouterAndroidBridge, caller, mediaRouteId, message);
  }

  public static ChromeMediaRouter.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.media.router.ChromeMediaRouter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ChromeMediaRouterJni();
  }
}
