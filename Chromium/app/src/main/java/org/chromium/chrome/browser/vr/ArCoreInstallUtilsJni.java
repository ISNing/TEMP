package org.chromium.chrome.browser.vr;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ArCoreInstallUtilsJni implements ArCoreInstallUtils.ArConsentPromptNative {
  private static ArCoreInstallUtils.ArConsentPromptNative testInstance;

  public static final JniStaticTestMocker<ArCoreInstallUtils.ArConsentPromptNative> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.vr.ArCoreInstallUtils.ArConsentPromptNative>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.vr.ArCoreInstallUtils.ArConsentPromptNative instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onRequestInstallArModuleResult(long nativeArCoreConsentPrompt, boolean success) {
    N.M367h9JO(nativeArCoreConsentPrompt, success);
  }

  @Override
  public void onRequestInstallSupportedArCoreResult(long nativeArCoreConsentPrompt,
      boolean success) {
    N.MuJDjBBE(nativeArCoreConsentPrompt, success);
  }

  @Override
  public void installArCoreDeviceProviderFactory() {
    N.MX_DrqNv();
  }

  public static ArCoreInstallUtils.ArConsentPromptNative get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.vr.ArCoreInstallUtils.ArConsentPromptNative. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ArCoreInstallUtilsJni();
  }
}
