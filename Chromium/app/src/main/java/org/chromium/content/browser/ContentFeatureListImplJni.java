package org.chromium.content.browser;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class ContentFeatureListImplJni implements ContentFeatureListImpl.Natives {
  private static ContentFeatureListImpl.Natives testInstance;

  public static final JniStaticTestMocker<ContentFeatureListImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.ContentFeatureListImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.ContentFeatureListImpl.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public boolean isEnabled(String featureName) {
    return (boolean)N.Mudil8Bg(featureName);
  }

  public static ContentFeatureListImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.ContentFeatureListImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ContentFeatureListImplJni();
  }
}
