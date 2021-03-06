package org.chromium.chrome.browser.tab;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabBrowserControlsConstraintsHelperJni implements TabBrowserControlsConstraintsHelper.Natives {
  private static TabBrowserControlsConstraintsHelper.Natives testInstance;

  public static final JniStaticTestMocker<TabBrowserControlsConstraintsHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tab.TabBrowserControlsConstraintsHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.tab.TabBrowserControlsConstraintsHelper.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(TabBrowserControlsConstraintsHelper caller) {
    return (long)N.MnC9A38r(caller);
  }

  @Override
  public void onDestroyed(long nativeTabBrowserControlsConstraintsHelper,
      TabBrowserControlsConstraintsHelper caller) {
    N.M3JHMcaQ(nativeTabBrowserControlsConstraintsHelper, caller);
  }

  @Override
  public void updateState(long nativeTabBrowserControlsConstraintsHelper,
      TabBrowserControlsConstraintsHelper caller, WebContents webContents, int contraints,
      int current, boolean animate) {
    N.MQyQC7UK(nativeTabBrowserControlsConstraintsHelper, caller, webContents, contraints, current, animate);
  }

  public static TabBrowserControlsConstraintsHelper.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.TabBrowserControlsConstraintsHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new TabBrowserControlsConstraintsHelperJni();
  }
}
