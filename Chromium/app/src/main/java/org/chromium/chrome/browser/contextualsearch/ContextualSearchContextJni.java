package org.chromium.chrome.browser.contextualsearch;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContextualSearchContextJni implements ContextualSearchContext.Natives {
  private static ContextualSearchContext.Natives testInstance;

  public static final JniStaticTestMocker<ContextualSearchContext.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.contextualsearch.ContextualSearchContext.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.contextualsearch.ContextualSearchContext.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(ContextualSearchContext caller) {
    return (long)N.Mz21Bkwn(caller);
  }

  @Override
  public void destroy(long nativeContextualSearchContext, ContextualSearchContext caller) {
    N.MwvXsCJZ(nativeContextualSearchContext, caller);
  }

  @Override
  public void setResolveProperties(long nativeContextualSearchContext,
      ContextualSearchContext caller, String homeCountry, boolean maySendBasePageUrl,
      long previousEventId, int previousEventResults) {
    N.MjXeVW3V(nativeContextualSearchContext, caller, homeCountry, maySendBasePageUrl, previousEventId, previousEventResults);
  }

  @Override
  public void adjustSelection(long nativeContextualSearchContext, ContextualSearchContext caller,
      int startAdjust, int endAdjust) {
    N.M2pdefbB(nativeContextualSearchContext, caller, startAdjust, endAdjust);
  }

  @Override
  public void setContent(long nativeContextualSearchContext, ContextualSearchContext caller,
      String content, int selectionStart, int selectionEnd) {
    N.MLop_YCM(nativeContextualSearchContext, caller, content, selectionStart, selectionEnd);
  }

  @Override
  public String detectLanguage(long nativeContextualSearchContext, ContextualSearchContext caller) {
    return (String)N.Mi_5NNCP(nativeContextualSearchContext, caller);
  }

  @Override
  public void restrictResolve(long nativeContextualSearchContext, ContextualSearchContext caller) {
    N.MoyK$JCa(nativeContextualSearchContext, caller);
  }

  public static ContextualSearchContext.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.contextualsearch.ContextualSearchContext.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ContextualSearchContextJni();
  }
}