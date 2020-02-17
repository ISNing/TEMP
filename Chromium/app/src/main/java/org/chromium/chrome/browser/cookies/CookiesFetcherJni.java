package org.chromium.chrome.browser.cookies;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CookiesFetcherJni implements CookiesFetcher.Natives {
  private static CookiesFetcher.Natives testInstance;

  public static final JniStaticTestMocker<CookiesFetcher.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.cookies.CookiesFetcher.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.cookies.CookiesFetcher.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void persistCookies() {
    N.M6wmuchs();
  }

  @Override
  public void restoreCookies(String name, String value, String domain, String path, long creation,
      long expiration, long lastAccess, boolean secure, boolean httpOnly, int sameSite,
      int priority, int sourceScheme) {
    N.McZsSVxA(name, value, domain, path, creation, expiration, lastAccess, secure, httpOnly, sameSite, priority, sourceScheme);
  }

  public static CookiesFetcher.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.cookies.CookiesFetcher.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new CookiesFetcherJni();
  }
}
