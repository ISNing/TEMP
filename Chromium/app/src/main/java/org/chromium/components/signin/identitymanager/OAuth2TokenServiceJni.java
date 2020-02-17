package org.chromium.components.signin.identitymanager;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OAuth2TokenServiceJni implements OAuth2TokenService.Natives {
  private static OAuth2TokenService.Natives testInstance;

  public static final JniStaticTestMocker<OAuth2TokenService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.signin.identitymanager.OAuth2TokenService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.signin.identitymanager.OAuth2TokenService.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onOAuth2TokenFetched(String authToken, boolean isTransientError,
      long nativeCallback) {
    N.MJSntjoX(authToken, isTransientError, nativeCallback);
  }

  @Override
  public void reloadAllAccountsWithPrimaryAccountAfterSeeding(
      long nativeOAuth2TokenServiceDelegateAndroid, String accountId) {
    N.M0phHhxp(nativeOAuth2TokenServiceDelegateAndroid, accountId);
  }

  public static OAuth2TokenService.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.signin.identitymanager.OAuth2TokenService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new OAuth2TokenServiceJni();
  }
}
