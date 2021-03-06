package org.chromium.components.minidump_uploader;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CrashReportMimeWriterJni implements CrashReportMimeWriter.Natives {
  private static CrashReportMimeWriter.Natives testInstance;

  public static final JniStaticTestMocker<CrashReportMimeWriter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.minidump_uploader.CrashReportMimeWriter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.minidump_uploader.CrashReportMimeWriter.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void rewriteMinidumpsAsMIMEs(String srcDir, String destDir) {
    N.MjZjkDM7(srcDir, destDir);
  }

  @Override
  public String[] rewriteMinidumpsAsMIMEsAndGetCrashKeys(String srcDir, String destDir) {
    return (String[])N.MdQEl6jg(srcDir, destDir);
  }

  public static CrashReportMimeWriter.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.minidump_uploader.CrashReportMimeWriter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new CrashReportMimeWriterJni();
  }
}
