package org.chromium.components.signin;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChildAccountInfoFetcherJni implements ChildAccountInfoFetcher.Natives {
  private static ChildAccountInfoFetcher.Natives testInstance;

  public static final JniStaticTestMocker<ChildAccountInfoFetcher.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.signin.ChildAccountInfoFetcher.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.signin.ChildAccountInfoFetcher.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void setIsChildAccount(long accountFetcherServicePtr, String accountId,
      boolean isChildAccount) {
    N.MBZpZMbr(accountFetcherServicePtr, accountId, isChildAccount);
  }

  public static ChildAccountInfoFetcher.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.signin.ChildAccountInfoFetcher.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ChildAccountInfoFetcherJni();
  }
}
