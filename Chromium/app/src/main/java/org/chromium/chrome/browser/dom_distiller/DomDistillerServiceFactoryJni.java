package org.chromium.chrome.browser.dom_distiller;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.dom_distiller.core.DomDistillerService;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DomDistillerServiceFactoryJni implements DomDistillerServiceFactory.Natives {
  private static DomDistillerServiceFactory.Natives testInstance;

  public static final JniStaticTestMocker<DomDistillerServiceFactory.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.dom_distiller.DomDistillerServiceFactory.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.dom_distiller.DomDistillerServiceFactory.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public DomDistillerService getForProfile(Profile profile) {
    return (DomDistillerService)N.M2UAkcn4(profile);
  }

  public static DomDistillerServiceFactory.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.dom_distiller.DomDistillerServiceFactory.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new DomDistillerServiceFactoryJni();
  }
}
