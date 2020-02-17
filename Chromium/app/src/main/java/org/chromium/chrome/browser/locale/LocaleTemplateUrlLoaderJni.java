package org.chromium.chrome.browser.locale;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LocaleTemplateUrlLoaderJni implements LocaleTemplateUrlLoader.Natives {
  private static LocaleTemplateUrlLoader.Natives testInstance;

  public static final JniStaticTestMocker<LocaleTemplateUrlLoader.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.locale.LocaleTemplateUrlLoader.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.locale.LocaleTemplateUrlLoader.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(String localeId) {
    return (long)N.M$XYeVuK(localeId);
  }

  @Override
  public void destroy(long nativeLocaleTemplateUrlLoader) {
    N.M$jvLTYJ(nativeLocaleTemplateUrlLoader);
  }

  @Override
  public boolean loadTemplateUrls(long nativeLocaleTemplateUrlLoader) {
    return (boolean)N.Mhja8Ht3(nativeLocaleTemplateUrlLoader);
  }

  @Override
  public void removeTemplateUrls(long nativeLocaleTemplateUrlLoader) {
    N.M0j5QnfQ(nativeLocaleTemplateUrlLoader);
  }

  @Override
  public void overrideDefaultSearchProvider(long nativeLocaleTemplateUrlLoader) {
    N.MfBMIJvi(nativeLocaleTemplateUrlLoader);
  }

  @Override
  public void setGoogleAsDefaultSearch(long nativeLocaleTemplateUrlLoader) {
    N.MeiEg9Vo(nativeLocaleTemplateUrlLoader);
  }

  public static LocaleTemplateUrlLoader.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.locale.LocaleTemplateUrlLoader.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new LocaleTemplateUrlLoaderJni();
  }
}