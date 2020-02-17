package org.chromium.components.url_formatter;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class UrlFormatterJni implements UrlFormatter.Natives {
  private static UrlFormatter.Natives testInstance;

  public static final JniStaticTestMocker<UrlFormatter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.url_formatter.UrlFormatter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.url_formatter.UrlFormatter.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public String fixupUrl(String url) {
    return (String)N.Ml2KxI$W(url);
  }

  @Override
  public String formatUrlForDisplayOmitScheme(String url) {
    return (String)N.M25QTkfm(url);
  }

  @Override
  public String formatUrlForDisplayOmitHTTPScheme(String url) {
    return (String)N.MWAcU8Kr(url);
  }

  @Override
  public String formatUrlForDisplayOmitSchemeOmitTrivialSubdomains(String url) {
    return (String)N.MeroQv$e(url);
  }

  @Override
  public String formatUrlForCopy(String url) {
    return (String)N.MWcP3rTG(url);
  }

  @Override
  public String formatUrlForSecurityDisplay(String url) {
    return (String)N.MN7bz_Mm(url);
  }

  @Override
  public String formatUrlForSecurityDisplayOmitScheme(String url) {
    return (String)N.MNXObKbV(url);
  }

  public static UrlFormatter.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.url_formatter.UrlFormatter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new UrlFormatterJni();
  }
}
