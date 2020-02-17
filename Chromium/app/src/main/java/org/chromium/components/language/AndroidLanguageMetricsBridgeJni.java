package org.chromium.components.language;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AndroidLanguageMetricsBridgeJni implements AndroidLanguageMetricsBridge.Natives {
  private static AndroidLanguageMetricsBridge.Natives testInstance;

  public static final JniStaticTestMocker<AndroidLanguageMetricsBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.language.AndroidLanguageMetricsBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.language.AndroidLanguageMetricsBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void reportExplicitLanguageAskStateChanged(String language, boolean added) {
    N.MC39_Sil(language, added);
  }

  public static AndroidLanguageMetricsBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.language.AndroidLanguageMetricsBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new AndroidLanguageMetricsBridgeJni();
  }
}
