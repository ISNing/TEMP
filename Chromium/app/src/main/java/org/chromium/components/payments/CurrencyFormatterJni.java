package org.chromium.components.payments;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CurrencyFormatterJni implements CurrencyFormatter.Natives {
  private static CurrencyFormatter.Natives testInstance;

  public static final JniStaticTestMocker<CurrencyFormatter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.CurrencyFormatter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.payments.CurrencyFormatter.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long initCurrencyFormatterAndroid(CurrencyFormatter caller, String currencyCode,
      String localeName) {
    return (long)N.MRlatcKK(caller, currencyCode, localeName);
  }

  @Override
  public void destroy(long nativeCurrencyFormatterAndroid, CurrencyFormatter caller) {
    N.MkBG391d(nativeCurrencyFormatterAndroid, caller);
  }

  @Override
  public String format(long nativeCurrencyFormatterAndroid, CurrencyFormatter caller,
      String amountValue) {
    return (String)N.MgDia2D2(nativeCurrencyFormatterAndroid, caller, amountValue);
  }

  @Override
  public String getFormattedCurrencyCode(long nativeCurrencyFormatterAndroid,
      CurrencyFormatter caller) {
    return (String)N.MnbePYrk(nativeCurrencyFormatterAndroid, caller);
  }

  public static CurrencyFormatter.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.CurrencyFormatter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new CurrencyFormatterJni();
  }
}
