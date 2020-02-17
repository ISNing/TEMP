package org.chromium.chrome.browser.keyboard_accessory;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AutofillKeyboardAccessoryViewBridgeJni implements AutofillKeyboardAccessoryViewBridge.Natives {
  private static AutofillKeyboardAccessoryViewBridge.Natives testInstance;

  public static final JniStaticTestMocker<AutofillKeyboardAccessoryViewBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.keyboard_accessory.AutofillKeyboardAccessoryViewBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.keyboard_accessory.AutofillKeyboardAccessoryViewBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void viewDismissed(long nativeAutofillKeyboardAccessoryView,
      AutofillKeyboardAccessoryViewBridge caller) {
    N.M$YFyQSp(nativeAutofillKeyboardAccessoryView, caller);
  }

  @Override
  public void suggestionSelected(long nativeAutofillKeyboardAccessoryView,
      AutofillKeyboardAccessoryViewBridge caller, int listIndex) {
    N.MjgUnUA$(nativeAutofillKeyboardAccessoryView, caller, listIndex);
  }

  @Override
  public void deletionRequested(long nativeAutofillKeyboardAccessoryView,
      AutofillKeyboardAccessoryViewBridge caller, int listIndex) {
    N.Mg8PCuPV(nativeAutofillKeyboardAccessoryView, caller, listIndex);
  }

  @Override
  public void deletionConfirmed(long nativeAutofillKeyboardAccessoryView,
      AutofillKeyboardAccessoryViewBridge caller) {
    N.MRSuTxnn(nativeAutofillKeyboardAccessoryView, caller);
  }

  public static AutofillKeyboardAccessoryViewBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.keyboard_accessory.AutofillKeyboardAccessoryViewBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new AutofillKeyboardAccessoryViewBridgeJni();
  }
}
