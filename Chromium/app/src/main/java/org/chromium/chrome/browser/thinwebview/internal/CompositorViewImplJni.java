package org.chromium.chrome.browser.thinwebview.internal;

import J.N;
import android.view.Surface;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.ui.base.WindowAndroid;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CompositorViewImplJni implements CompositorViewImpl.Natives {
  private static CompositorViewImpl.Natives testInstance;

  public static final JniStaticTestMocker<CompositorViewImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.thinwebview.internal.CompositorViewImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.thinwebview.internal.CompositorViewImpl.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long init(CompositorViewImpl caller, WindowAndroid windowAndroid) {
    return (long)N.Mq0jHMQB(caller, windowAndroid);
  }

  @Override
  public void destroy(long nativeCompositorViewImpl, CompositorViewImpl caller) {
    N.MpzaPVBA(nativeCompositorViewImpl, caller);
  }

  @Override
  public void surfaceCreated(long nativeCompositorViewImpl, CompositorViewImpl caller) {
    N.MbxMyH8q(nativeCompositorViewImpl, caller);
  }

  @Override
  public void surfaceDestroyed(long nativeCompositorViewImpl, CompositorViewImpl caller) {
    N.MX9WkLzq(nativeCompositorViewImpl, caller);
  }

  @Override
  public void surfaceChanged(long nativeCompositorViewImpl, CompositorViewImpl caller, int format,
      int width, int height, boolean canBeUsedWithSurfaceControl, Surface surface) {
    N.MExWQgw3(nativeCompositorViewImpl, caller, format, width, height, canBeUsedWithSurfaceControl, surface);
  }

  @Override
  public void setNeedsComposite(long nativeCompositorViewImpl, CompositorViewImpl caller) {
    N.MOryPmwZ(nativeCompositorViewImpl, caller);
  }

  public static CompositorViewImpl.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.thinwebview.internal.CompositorViewImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new CompositorViewImplJni();
  }
}
