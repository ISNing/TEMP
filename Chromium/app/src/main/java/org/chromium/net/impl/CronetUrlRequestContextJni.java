package org.chromium.net.impl;

import J.N;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CronetUrlRequestContextJni implements CronetUrlRequestContext.Natives {
  private static CronetUrlRequestContext.Natives testInstance;

  public static final JniStaticTestMocker<CronetUrlRequestContext.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.impl.CronetUrlRequestContext.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.net.impl.CronetUrlRequestContext.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public long createRequestContextConfig(String userAgent, String storagePath, boolean quicEnabled,
      String quicUserAgentId, boolean http2Enabled, boolean brotliEnabled, boolean disableCache,
      int httpCacheMode, long httpCacheMaxSize, String experimentalOptions, long mockCertVerifier,
      boolean enableNetworkQualityEstimator, boolean bypassPublicKeyPinningForLocalTrustAnchors,
      int networkThreadPriority) {
    return (long)N.MB3ntV7V(userAgent, storagePath, quicEnabled, quicUserAgentId, http2Enabled, brotliEnabled, disableCache, httpCacheMode, httpCacheMaxSize, experimentalOptions, mockCertVerifier, enableNetworkQualityEstimator, bypassPublicKeyPinningForLocalTrustAnchors, networkThreadPriority);
  }

  @Override
  public void addQuicHint(long urlRequestContextConfig, String host, int port, int alternatePort) {
    N.MyRIv1Ij(urlRequestContextConfig, host, port, alternatePort);
  }

  @Override
  public void addPkp(long urlRequestContextConfig, String host, byte[][] hashes,
      boolean includeSubdomains, long expirationTime) {
    N.Muq3ic6p(urlRequestContextConfig, host, hashes, includeSubdomains, expirationTime);
  }

  @Override
  public long createRequestContextAdapter(long urlRequestContextConfig) {
    return (long)N.M135Cu0D(urlRequestContextConfig);
  }

  @Override
  public int setMinLogLevel(int loggingLevel) {
    return (int)N.MnO2u2DQ(loggingLevel);
  }

  @Override
  public byte[] getHistogramDeltas() {
    return (byte[])N.M7CZ_Klr();
  }

  @Override
  public void destroy(long nativePtr, CronetUrlRequestContext caller) {
    N.MeBvNXm5(nativePtr, caller);
  }

  @Override
  public boolean startNetLogToFile(long nativePtr, CronetUrlRequestContext caller, String fileName,
      boolean logAll) {
    return (boolean)N.MgwJQAH1(nativePtr, caller, fileName, logAll);
  }

  @Override
  public void startNetLogToDisk(long nativePtr, CronetUrlRequestContext caller, String dirPath,
      boolean logAll, int maxSize) {
    N.MTULt02u(nativePtr, caller, dirPath, logAll, maxSize);
  }

  @Override
  public void stopNetLog(long nativePtr, CronetUrlRequestContext caller) {
    N.MKFm_qQ7(nativePtr, caller);
  }

  @Override
  public void initRequestContextOnInitThread(long nativePtr, CronetUrlRequestContext caller) {
    N.M6Dz0nZ5(nativePtr, caller);
  }

  @Override
  public void configureNetworkQualityEstimatorForTesting(long nativePtr,
      CronetUrlRequestContext caller, boolean useLocalHostRequests, boolean useSmallerResponses,
      boolean disableOfflineCheck) {
    N.M6sIJDgy(nativePtr, caller, useLocalHostRequests, useSmallerResponses, disableOfflineCheck);
  }

  @Override
  public void provideRTTObservations(long nativePtr, CronetUrlRequestContext caller,
      boolean should) {
    N.MpnFLFF2(nativePtr, caller, should);
  }

  @Override
  public void provideThroughputObservations(long nativePtr, CronetUrlRequestContext caller,
      boolean should) {
    N.MnPUhNKP(nativePtr, caller, should);
  }

  public static CronetUrlRequestContext.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.impl.CronetUrlRequestContext.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new CronetUrlRequestContextJni();
  }
}
