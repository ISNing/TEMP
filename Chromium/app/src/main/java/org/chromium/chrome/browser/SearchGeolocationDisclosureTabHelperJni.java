package org.chromium.chrome.browser;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SearchGeolocationDisclosureTabHelperJni implements SearchGeolocationDisclosureTabHelper.Natives {
  private static SearchGeolocationDisclosureTabHelper.Natives testInstance;

  public static final JniStaticTestMocker<SearchGeolocationDisclosureTabHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.SearchGeolocationDisclosureTabHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.SearchGeolocationDisclosureTabHelper.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void setIgnoreUrlChecksForTesting() {
    N.MJSOFtnt();
  }

  @Override
  public void setDayOffsetForTesting(int days) {
    N.MUH8nbTW(days);
  }

  public static SearchGeolocationDisclosureTabHelper.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.SearchGeolocationDisclosureTabHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new SearchGeolocationDisclosureTabHelperJni();
  }
}
