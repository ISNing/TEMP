package org.chromium.net.impl;

import J.N;
import java.lang.Override;
import java.lang.String;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CronetUrlRequestJni implements CronetUrlRequest.Natives {
  private static CronetUrlRequest.Natives testInstance;

  public static final JniStaticTestMocker<CronetUrlRequest.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.impl.CronetUrlRequest.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.impl.CronetUrlRequest.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long createRequestAdapter(CronetUrlRequest caller, long urlRequestContextAdapter,
      String url, int priority, boolean disableCache, boolean disableConnectionMigration,
      boolean enableMetrics, boolean trafficStatsTagSet, int trafficStatsTag,
      boolean trafficStatsUidSet, int trafficStatsUid) {
    return (long)N.MuOIsMvf(caller, urlRequestContextAdapter, url, priority, disableCache, disableConnectionMigration, enableMetrics, trafficStatsTagSet, trafficStatsTag, trafficStatsUidSet, trafficStatsUid);
  }

  @Override
  public boolean setHttpMethod(long nativePtr, CronetUrlRequest caller, String method) {
    return (boolean)N.M51RPBJe(nativePtr, caller, method);
  }

  @Override
  public boolean addRequestHeader(long nativePtr, CronetUrlRequest caller, String name,
      String value) {
    return (boolean)N.MvHusd1J(nativePtr, caller, name, value);
  }

  @Override
  public void start(long nativePtr, CronetUrlRequest caller) {
    N.MabZ5m6r(nativePtr, caller);
  }

  @Override
  public void followDeferredRedirect(long nativePtr, CronetUrlRequest caller) {
    N.Mhp54Oqs(nativePtr, caller);
  }

  @Override
  public boolean readData(long nativePtr, CronetUrlRequest caller, ByteBuffer byteBuffer,
      int position, int capacity) {
    return (boolean)N.MfCxA8r3(nativePtr, caller, byteBuffer, position, capacity);
  }

  @Override
  public void destroy(long nativePtr, CronetUrlRequest caller, boolean sendOnCanceled) {
    N.M4znfYdB(nativePtr, caller, sendOnCanceled);
  }

  @Override
  public void getStatus(long nativePtr, CronetUrlRequest caller,
      VersionSafeCallbacks.UrlRequestStatusListener listener) {
    N.MgIIMpT9(nativePtr, caller, listener);
  }

  public static CronetUrlRequest.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.impl.CronetUrlRequest.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new CronetUrlRequestJni();
  }
}
