package org.chromium.base;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ImportantFileWriterAndroidJni implements ImportantFileWriterAndroid.Natives {
  private static ImportantFileWriterAndroid.Natives testInstance;

  public static final JniStaticTestMocker<ImportantFileWriterAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.ImportantFileWriterAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.ImportantFileWriterAndroid.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public boolean writeFileAtomically(String fileName, byte[] data) {
    return (boolean)N.MsOKBrZ5(fileName, data);
  }

  public static ImportantFileWriterAndroid.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.ImportantFileWriterAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ImportantFileWriterAndroidJni();
  }
}
