package org.chromium.content_public.browser;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LoadUrlParamsJni implements LoadUrlParams.Natives {
  private static LoadUrlParams.Natives testInstance;

  public static final JniStaticTestMocker<LoadUrlParams.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content_public.browser.LoadUrlParams.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content_public.browser.LoadUrlParams.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public boolean isDataScheme(String url) {
    return (boolean)N.MWH2gOYe(url);
  }

  public static LoadUrlParams.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content_public.browser.LoadUrlParams.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new LoadUrlParamsJni();
  }
}
