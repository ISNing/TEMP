package org.chromium.net;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class HttpUtilJni implements HttpUtil.Natives {
  private static HttpUtil.Natives testInstance;

  public static final JniStaticTestMocker<HttpUtil.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.HttpUtil.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.HttpUtil.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public boolean isAllowedHeader(String headerName, String headerValue) {
    return (boolean)N.MorcXgQd(headerName, headerValue);
  }

  public static HttpUtil.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.HttpUtil.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new HttpUtilJni();
  }
}
