package org.chromium.chrome.browser.settings.privacy;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BrowsingDataCounterBridgeJni implements BrowsingDataCounterBridge.Natives {
  private static BrowsingDataCounterBridge.Natives testInstance;

  public static final JniStaticTestMocker<BrowsingDataCounterBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.settings.privacy.BrowsingDataCounterBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.settings.privacy.BrowsingDataCounterBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(BrowsingDataCounterBridge caller, int dataType, int prefType) {
    return (long)N.MdBRvkck(caller, dataType, prefType);
  }

  @Override
  public void destroy(long nativeBrowsingDataCounterBridge, BrowsingDataCounterBridge caller) {
    N.MckgCEIE(nativeBrowsingDataCounterBridge, caller);
  }

  public static BrowsingDataCounterBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.settings.privacy.BrowsingDataCounterBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new BrowsingDataCounterBridgeJni();
  }
}
