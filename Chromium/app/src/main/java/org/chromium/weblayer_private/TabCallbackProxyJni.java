package org.chromium.weblayer_private;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabCallbackProxyJni implements TabCallbackProxy.Natives {
  private static TabCallbackProxy.Natives testInstance;

  public static final JniStaticTestMocker<TabCallbackProxy.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.weblayer_private.TabCallbackProxy.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.weblayer_private.TabCallbackProxy.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long createTabCallbackProxy(TabCallbackProxy proxy, long tab) {
    return (long)N.MOUs9Qy6(proxy, tab);
  }

  @Override
  public void deleteTabCallbackProxy(long proxy) {
    N.Mpl66Ope(proxy);
  }

  public static TabCallbackProxy.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.weblayer_private.TabCallbackProxy.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new TabCallbackProxyJni();
  }
}
