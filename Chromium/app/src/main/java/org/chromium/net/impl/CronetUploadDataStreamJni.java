package org.chromium.net.impl;

import J.N;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CronetUploadDataStreamJni implements CronetUploadDataStream.Natives {
  private static CronetUploadDataStream.Natives testInstance;

  public static final JniStaticTestMocker<CronetUploadDataStream.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.impl.CronetUploadDataStream.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.impl.CronetUploadDataStream.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long attachUploadDataToRequest(CronetUploadDataStream caller, long urlRequestAdapter,
      long length) {
    return (long)N.MA4X1aZa(caller, urlRequestAdapter, length);
  }

  @Override
  public long createAdapterForTesting(CronetUploadDataStream caller) {
    return (long)N.MnDEFloP(caller);
  }

  @Override
  public long createUploadDataStreamForTesting(CronetUploadDataStream caller, long length,
      long adapter) {
    return (long)N.MymnNC4_(caller, length, adapter);
  }

  @Override
  public void onReadSucceeded(long nativePtr, CronetUploadDataStream caller, int bytesRead,
      boolean finalChunk) {
    N.MpWH3VIr(nativePtr, caller, bytesRead, finalChunk);
  }

  @Override
  public void onRewindSucceeded(long nativePtr, CronetUploadDataStream caller) {
    N.MFpRjSMv(nativePtr, caller);
  }

  @Override
  public void destroy(long nativePtr) {
    N.MMW1G0N1(nativePtr);
  }

  public static CronetUploadDataStream.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.impl.CronetUploadDataStream.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new CronetUploadDataStreamJni();
  }
}
