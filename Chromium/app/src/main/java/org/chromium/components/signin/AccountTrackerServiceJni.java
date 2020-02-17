package org.chromium.components.signin;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AccountTrackerServiceJni implements AccountTrackerService.Natives {
  private static AccountTrackerService.Natives testInstance;

  public static final JniStaticTestMocker<AccountTrackerService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.signin.AccountTrackerService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.signin.AccountTrackerService.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void seedAccountsInfo(long nativeAccountTrackerService, String[] gaiaIds,
      String[] accountNames) {
    N.Mu2KU$HY(nativeAccountTrackerService, gaiaIds, accountNames);
  }

  @Override
  public boolean areAccountsSeeded(long nativeAccountTrackerService, String[] accountNames) {
    return (boolean)N.MVRs2cAt(nativeAccountTrackerService, accountNames);
  }

  public static AccountTrackerService.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.signin.AccountTrackerService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new AccountTrackerServiceJni();
  }
}
