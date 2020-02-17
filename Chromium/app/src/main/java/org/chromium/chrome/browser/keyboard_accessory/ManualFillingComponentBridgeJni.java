package org.chromium.chrome.browser.keyboard_accessory;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.keyboard_accessory.data.KeyboardAccessoryData;
import org.chromium.chrome.browser.keyboard_accessory.data.UserInfoField;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ManualFillingComponentBridgeJni implements ManualFillingComponentBridge.Natives {
  private static ManualFillingComponentBridge.Natives testInstance;

  public static final JniStaticTestMocker<ManualFillingComponentBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.keyboard_accessory.ManualFillingComponentBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.keyboard_accessory.ManualFillingComponentBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onFaviconRequested(long nativeManualFillingViewAndroid,
      ManualFillingComponentBridge caller, String origin, int desiredSizeInPx,
      Callback<KeyboardAccessoryData.UserInfo.FaviconProvider.FaviconResult> faviconCallback) {
    N.MXmkPOid(nativeManualFillingViewAndroid, caller, origin, desiredSizeInPx, faviconCallback);
  }

  @Override
  public void onFillingTriggered(long nativeManualFillingViewAndroid,
      ManualFillingComponentBridge caller, int tabType, UserInfoField userInfoField) {
    N.M6ME2$pd(nativeManualFillingViewAndroid, caller, tabType, userInfoField);
  }

  @Override
  public void onOptionSelected(long nativeManualFillingViewAndroid,
      ManualFillingComponentBridge caller, int accessoryAction) {
    N.MmIaCnPe(nativeManualFillingViewAndroid, caller, accessoryAction);
  }

  @Override
  public void cachePasswordSheetDataForTesting(WebContents webContents, String[] userNames,
      String[] passwords) {
    N.MRuf_fQM(webContents, userNames, passwords);
  }

  @Override
  public void notifyFocusedFieldTypeForTesting(WebContents webContents, int focusedFieldType) {
    N.Mc79dX6G(webContents, focusedFieldType);
  }

  @Override
  public void signalAutoGenerationStatusForTesting(WebContents webContents, boolean available) {
    N.Mmx_aaOg(webContents, available);
  }

  public static ManualFillingComponentBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.keyboard_accessory.ManualFillingComponentBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ManualFillingComponentBridgeJni();
  }
}
