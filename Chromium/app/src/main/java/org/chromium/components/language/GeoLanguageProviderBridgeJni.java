package org.chromium.components.language;

import J.N;
import java.lang.Override;
import java.lang.String;
import java.util.LinkedHashSet;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class GeoLanguageProviderBridgeJni implements GeoLanguageProviderBridge.Natives {
  private static GeoLanguageProviderBridge.Natives testInstance;

  public static final JniStaticTestMocker<GeoLanguageProviderBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.language.GeoLanguageProviderBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.language.GeoLanguageProviderBridge.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void getCurrentGeoLanguages(LinkedHashSet<String> set) {
    N.MNKrIV3n(set);
  }

  public static GeoLanguageProviderBridge.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.language.GeoLanguageProviderBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new GeoLanguageProviderBridgeJni();
  }
}
