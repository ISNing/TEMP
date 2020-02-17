package org.chromium.printing;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PrintingContextJni implements PrintingContext.Natives {
  private static PrintingContext.Natives testInstance;

  public static final JniStaticTestMocker<PrintingContext.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.printing.PrintingContext.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.printing.PrintingContext.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void askUserForSettingsReply(long nativePrintingContextAndroid, PrintingContext caller,
      boolean success) {
    N.M8HtOhJl(nativePrintingContextAndroid, caller, success);
  }

  @Override
  public void showSystemDialogDone(long nativePrintingContextAndroid, PrintingContext caller) {
    N.Mmq2M8tt(nativePrintingContextAndroid, caller);
  }

  public static PrintingContext.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.printing.PrintingContext.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new PrintingContextJni();
  }
}
