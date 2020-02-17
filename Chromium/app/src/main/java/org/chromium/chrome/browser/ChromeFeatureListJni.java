package org.chromium.chrome.browser;

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
final class ChromeFeatureListJni implements ChromeFeatureList.Natives {
  private static ChromeFeatureList.Natives testInstance;

  public static final JniStaticTestMocker<ChromeFeatureList.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ChromeFeatureList.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ChromeFeatureList.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public boolean isInitialized() {
    return (boolean)N.MgqDG5LY();
  }

  @Override
  public boolean isEnabled(String featureName) {
    return (boolean)N.MPiSwAE4(featureName);
  }

  @Override
  public String getFieldTrialParamByFeature(String featureName, String paramName) {
    return (String)N.Mo3a_9tz(featureName, paramName);
  }

  @Override
  public int getFieldTrialParamByFeatureAsInt(String featureName, String paramName,
      int defaultValue) {
    return (int)N.MtxS41zR(featureName, paramName, defaultValue);
  }

  @Override
  public double getFieldTrialParamByFeatureAsDouble(String featureName, String paramName,
      double defaultValue) {
    return (double)N.Mj2Twnnu(featureName, paramName, defaultValue);
  }

  @Override
  public boolean getFieldTrialParamByFeatureAsBoolean(String featureName, String paramName,
      boolean defaultValue) {
    return (boolean)N.MGYscfpZ(featureName, paramName, defaultValue);
  }

  public static ChromeFeatureList.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ChromeFeatureList.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ChromeFeatureListJni();
  }
}
