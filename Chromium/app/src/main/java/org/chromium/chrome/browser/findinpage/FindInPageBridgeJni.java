package org.chromium.chrome.browser.findinpage;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FindInPageBridgeJni implements FindInPageBridge.Natives {
  private static FindInPageBridge.Natives testInstance;

  public static final JniStaticTestMocker<FindInPageBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.findinpage.FindInPageBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.findinpage.FindInPageBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(FindInPageBridge caller, WebContents webContents) {
    return (long)N.MOgV0fQp(caller, webContents);
  }

  @Override
  public void destroy(long nativeFindInPageBridge, FindInPageBridge caller) {
    N.MWhfQNIi(nativeFindInPageBridge, caller);
  }

  @Override
  public void startFinding(long nativeFindInPageBridge, FindInPageBridge caller,
      String searchString, boolean forwardDirection, boolean caseSensitive) {
    N.M1plbBYv(nativeFindInPageBridge, caller, searchString, forwardDirection, caseSensitive);
  }

  @Override
  public void stopFinding(long nativeFindInPageBridge, FindInPageBridge caller,
      boolean clearSelection) {
    N.Mwg$zeYi(nativeFindInPageBridge, caller, clearSelection);
  }

  @Override
  public String getPreviousFindText(long nativeFindInPageBridge, FindInPageBridge caller) {
    return (String)N.MsReT$HQ(nativeFindInPageBridge, caller);
  }

  @Override
  public void requestFindMatchRects(long nativeFindInPageBridge, FindInPageBridge caller,
      int currentVersion) {
    N.MV3tOyr$(nativeFindInPageBridge, caller, currentVersion);
  }

  @Override
  public void activateNearestFindResult(long nativeFindInPageBridge, FindInPageBridge caller,
      float x, float y) {
    N.MmI_n00e(nativeFindInPageBridge, caller, x, y);
  }

  @Override
  public void activateFindInPageResultForAccessibility(long nativeFindInPageBridge,
      FindInPageBridge caller) {
    N.M__7TNNT(nativeFindInPageBridge, caller);
  }

  public static FindInPageBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.findinpage.FindInPageBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new FindInPageBridgeJni();
  }
}
