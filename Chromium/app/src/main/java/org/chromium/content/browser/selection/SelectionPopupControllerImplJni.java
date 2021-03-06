package org.chromium.content.browser.selection;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SelectionPopupControllerImplJni implements SelectionPopupControllerImpl.Natives {
  private static SelectionPopupControllerImpl.Natives testInstance;

  public static final JniStaticTestMocker<SelectionPopupControllerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.selection.SelectionPopupControllerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.selection.SelectionPopupControllerImpl.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(SelectionPopupControllerImpl caller, WebContents webContents) {
    return (long)N.MJHXNa8U(caller, webContents);
  }

  @Override
  public void setTextHandlesTemporarilyHidden(long nativeSelectionPopupController,
      SelectionPopupControllerImpl caller, boolean hidden) {
    N.M01adZlM(nativeSelectionPopupController, caller, hidden);
  }

  public static SelectionPopupControllerImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.selection.SelectionPopupControllerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new SelectionPopupControllerImplJni();
  }
}
