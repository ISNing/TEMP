package org.chromium.chrome.browser.offlinepages;

import J.N;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class RequestCoordinatorBridgeJni implements RequestCoordinatorBridge.Natives {
  private static RequestCoordinatorBridge.Natives testInstance;

  public static final JniStaticTestMocker<RequestCoordinatorBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.offlinepages.RequestCoordinatorBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.offlinepages.RequestCoordinatorBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void getRequestsInQueue(Profile profile, Callback<SavePageRequest[]> callback) {
    N.MgayNAvE(profile, callback);
  }

  @Override
  public void removeRequestsFromQueue(Profile profile, long[] requestIds,
      RequestCoordinatorBridge.RequestsRemovedCallback callback) {
    N.MO3muYrr(profile, requestIds, callback);
  }

  @Override
  public void savePageLater(Profile profile, Callback<Integer> callback, String url,
      String clientNamespace, String clientId, String origin, boolean userRequested) {
    N.Mh8zWNaq(profile, callback, url, clientNamespace, clientId, origin, userRequested);
  }

  public static RequestCoordinatorBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.offlinepages.RequestCoordinatorBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new RequestCoordinatorBridgeJni();
  }
}
