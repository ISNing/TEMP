package org.chromium.content.browser.selection;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SmartSelectionClientJni implements SmartSelectionClient.Natives {
  private static SmartSelectionClient.Natives testInstance;

  public static final JniStaticTestMocker<SmartSelectionClient.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.selection.SmartSelectionClient.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.selection.SmartSelectionClient.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(SmartSelectionClient caller, WebContents webContents) {
    return (long)N.MFA_dMJC(caller, webContents);
  }

  @Override
  public void requestSurroundingText(long nativeSmartSelectionClient, SmartSelectionClient caller,
      int numExtraCharacters, int callbackData) {
    N.M2GZ6ZNR(nativeSmartSelectionClient, caller, numExtraCharacters, callbackData);
  }

  @Override
  public void cancelAllRequests(long nativeSmartSelectionClient, SmartSelectionClient caller) {
    N.MVHq2mA2(nativeSmartSelectionClient, caller);
  }

  public static SmartSelectionClient.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.selection.SmartSelectionClient.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new SmartSelectionClientJni();
  }
}
