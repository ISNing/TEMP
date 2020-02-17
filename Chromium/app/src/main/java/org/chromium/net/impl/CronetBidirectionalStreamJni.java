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
final class CronetBidirectionalStreamJni implements CronetBidirectionalStream.Natives {
  private static CronetBidirectionalStream.Natives testInstance;

  public static final JniStaticTestMocker<CronetBidirectionalStream.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.impl.CronetBidirectionalStream.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.net.impl.CronetBidirectionalStream.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long createBidirectionalStream(CronetBidirectionalStream caller,
      long urlRequestContextAdapter, boolean sendRequestHeadersAutomatically,
      boolean enableMetricsCollection, boolean trafficStatsTagSet, int trafficStatsTag,
      boolean trafficStatsUidSet, int trafficStatsUid) {
    return (long)N.MqTDYvZd(caller, urlRequestContextAdapter, sendRequestHeadersAutomatically, enableMetricsCollection, trafficStatsTagSet, trafficStatsTag, trafficStatsUidSet, trafficStatsUid);
  }

  @Override
  public int start(long nativePtr, CronetBidirectionalStream caller, String url, int priority,
      String method, String[] headers, boolean endOfStream) {
    return (int)N.McDUim_I(nativePtr, caller, url, priority, method, headers, endOfStream);
  }

  @Override
  public void sendRequestHeaders(long nativePtr, CronetBidirectionalStream caller) {
    N.MGLIR7Sc(nativePtr, caller);
  }

  @Override
  public boolean readData(long nativePtr, CronetBidirectionalStream caller, ByteBuffer byteBuffer,
      int position, int limit) {
    return (boolean)N.Md_rPmgC(nativePtr, caller, byteBuffer, position, limit);
  }

  @Override
  public boolean writevData(long nativePtr, CronetBidirectionalStream caller, ByteBuffer[] buffers,
      int[] positions, int[] limits, boolean endOfStream) {
    return (boolean)N.MwJCBTMQ(nativePtr, caller, buffers, positions, limits, endOfStream);
  }

  @Override
  public void destroy(long nativePtr, CronetBidirectionalStream caller, boolean sendOnCanceled) {
    N.MS2l1kNx(nativePtr, caller, sendOnCanceled);
  }

  public static CronetBidirectionalStream.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.impl.CronetBidirectionalStream.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new CronetBidirectionalStreamJni();
  }
}
