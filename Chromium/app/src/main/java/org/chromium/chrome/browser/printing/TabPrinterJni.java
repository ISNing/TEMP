package org.chromium.chrome.browser.printing;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabPrinterJni implements TabPrinter.Natives {
  private static TabPrinter.Natives testInstance;

  public static final JniStaticTestMocker<TabPrinter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.printing.TabPrinter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.printing.TabPrinter.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public boolean print(WebContents webContents, int renderProcessId, int renderFrameId) {
    return (boolean)N.MmYX7nWa(webContents, renderProcessId, renderFrameId);
  }

  public static TabPrinter.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.printing.TabPrinter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new TabPrinterJni();
  }
}
