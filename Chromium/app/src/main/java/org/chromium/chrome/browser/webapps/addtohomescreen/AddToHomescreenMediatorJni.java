package org.chromium.chrome.browser.webapps.addtohomescreen;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AddToHomescreenMediatorJni implements AddToHomescreenMediator.Natives {
  private static AddToHomescreenMediator.Natives testInstance;

  public static final JniStaticTestMocker<AddToHomescreenMediator.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webapps.addtohomescreen.AddToHomescreenMediator.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webapps.addtohomescreen.AddToHomescreenMediator.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long initialize(AddToHomescreenMediator instance) {
    return (long)N.MnlHINDO(instance);
  }

  @Override
  public void startForAppMenu(long nativeAddToHomescreenMediator, WebContents webContents) {
    N.MFi$dBzL(nativeAddToHomescreenMediator, webContents);
  }

  @Override
  public void addToHomescreen(long nativeAddToHomescreenMediator, String title) {
    N.MUktpePd(nativeAddToHomescreenMediator, title);
  }

  @Override
  public void onNativeDetailsShown(long nativeAddToHomescreenMediator) {
    N.MekzKFPG(nativeAddToHomescreenMediator);
  }

  @Override
  public void onUiDismissed(long nativeAddToHomescreenMediator) {
    N.MUUypVwe(nativeAddToHomescreenMediator);
  }

  public static AddToHomescreenMediator.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webapps.addtohomescreen.AddToHomescreenMediator.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new AddToHomescreenMediatorJni();
  }
}
