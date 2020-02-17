package org.chromium.services.data_decoder;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class JsonSanitizerJni implements JsonSanitizer.Natives {
  private static JsonSanitizer.Natives testInstance;

  public static final JniStaticTestMocker<JsonSanitizer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.services.data_decoder.JsonSanitizer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.services.data_decoder.JsonSanitizer.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void onSuccess(long id, String json) {
    N.MkUGEqr$(id, json);
  }

  @Override
  public void onError(long id, String error) {
    N.MOkhqs8N(id, error);
  }

  public static JsonSanitizer.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.services.data_decoder.JsonSanitizer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new JsonSanitizerJni();
  }
}
