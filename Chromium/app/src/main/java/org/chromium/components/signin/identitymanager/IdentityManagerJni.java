package org.chromium.components.signin.identitymanager;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class IdentityManagerJni implements IdentityManager.Natives {
  private static IdentityManager.Natives testInstance;

  public static final JniStaticTestMocker<IdentityManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.signin.identitymanager.IdentityManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.signin.identitymanager.IdentityManager.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public CoreAccountInfo getPrimaryAccountInfo(long nativeIdentityManager) {
    return (CoreAccountInfo)N.MwJ3GEOr(nativeIdentityManager);
  }

  @Override
  public CoreAccountId getPrimaryAccountId(long nativeIdentityManager) {
    return (CoreAccountId)N.MyejQlaU(nativeIdentityManager);
  }

  @Override
  public boolean hasPrimaryAccount(long nativeIdentityManager) {
    return (boolean)N.MMEufdOf(nativeIdentityManager);
  }

  @Override
  public CoreAccountInfo findExtendedAccountInfoForAccountWithRefreshTokenByEmailAddress(
      long nativeIdentityManager, String email) {
    return (CoreAccountInfo)N.MRQQkZGI(nativeIdentityManager, email);
  }

  @Override
  public CoreAccountInfo[] getAccountsWithRefreshTokens(long nativeIdentityManager) {
    return (CoreAccountInfo[])N.MZ$avMgt(nativeIdentityManager);
  }

  public static IdentityManager.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.signin.identitymanager.IdentityManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new IdentityManagerJni();
  }
}
