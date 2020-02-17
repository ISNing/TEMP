package J;

import java.lang.Object;
import java.lang.String;
import javax.annotation.Generated;

@Generated("org.chromium.jni_generator.JniProcessor")
public final class N {
  public static boolean TESTING_ENABLED;

  public static boolean REQUIRE_MOCK;

  /**
   * org.chromium.weblayer_private.ContentViewRenderView.destroy
   * @param nativeContentViewRenderView (long)
   * @return (void)
   */
  public static final native void MAIaE0OG(long nativeContentViewRenderView);

  /**
   * org.chromium.weblayer_private.ContentViewRenderView.evictCachedSurface
   * @param nativeContentViewRenderView (long)
   * @return (void)
   */
  public static final native void M9bR5p1w(long nativeContentViewRenderView);

  /**
   * org.chromium.weblayer_private.ContentViewRenderView.getResourceManager
   * @param nativeContentViewRenderView (long)
   * @return (org.chromium.ui.resources.ResourceManager)
   */
  public static final native Object M7ewD88L(long nativeContentViewRenderView);

  /**
   * org.chromium.weblayer_private.ContentViewRenderView.init
   * @param caller (org.chromium.weblayer_private.ContentViewRenderView)
   * @param rootWindow (org.chromium.ui.base.WindowAndroid)
   * @return (long)
   */
  public static final native long MuuxVGQm(Object caller, Object rootWindow);

  /**
   * org.chromium.weblayer_private.ContentViewRenderView.onPhysicalBackingSizeChanged
   * @param nativeContentViewRenderView (long)
   * @param webContents (org.chromium.content_public.browser.WebContents)
   * @param width (int)
   * @param height (int)
   * @return (void)
   */
  public static final native void MQtCkWmJ(long nativeContentViewRenderView, Object webContents,
      int width, int height);

  /**
   * org.chromium.weblayer_private.ContentViewRenderView.setCurrentWebContents
   * @param nativeContentViewRenderView (long)
   * @param webContents (org.chromium.content_public.browser.WebContents)
   * @return (void)
   */
  public static final native void MYMjn0mf(long nativeContentViewRenderView, Object webContents);

  /**
   * org.chromium.weblayer_private.ContentViewRenderView.surfaceChanged
   * @param nativeContentViewRenderView (long)
   * @param canBeUsedWithSurfaceControl (boolean)
   * @param format (int)
   * @param width (int)
   * @param height (int)
   * @param surface (android.view.Surface)
   * @return (void)
   */
  public static final native void M4g6Q4ab(long nativeContentViewRenderView,
      boolean canBeUsedWithSurfaceControl, int format, int width, int height, Object surface);

  /**
   * org.chromium.weblayer_private.ContentViewRenderView.surfaceCreated
   * @param nativeContentViewRenderView (long)
   * @return (void)
   */
  public static final native void MUdnoeZS(long nativeContentViewRenderView);

  /**
   * org.chromium.weblayer_private.ContentViewRenderView.surfaceDestroyed
   * @param nativeContentViewRenderView (long)
   * @param cacheBackBuffer (boolean)
   * @return (void)
   */
  public static final native void MfxYKOP7(long nativeContentViewRenderView,
      boolean cacheBackBuffer);

  /**
   * org.chromium.weblayer_private.DownloadCallbackProxy.createDownloadCallbackProxy
   * @param proxy (org.chromium.weblayer_private.DownloadCallbackProxy)
   * @param tab (long)
   * @return (long)
   */
  public static final native long McPAi5G9(Object proxy, long tab);

  /**
   * org.chromium.weblayer_private.DownloadCallbackProxy.deleteDownloadCallbackProxy
   * @param proxy (long)
   * @return (void)
   */
  public static final native void Mq3U77nO(long proxy);

  /**
   * org.chromium.weblayer_private.ErrorPageCallbackProxy.createErrorPageCallbackProxy
   * @param proxy (org.chromium.weblayer_private.ErrorPageCallbackProxy)
   * @param tab (long)
   * @return (long)
   */
  public static final native long M0JND2JE(Object proxy, long tab);

  /**
   * org.chromium.weblayer_private.ErrorPageCallbackProxy.deleteErrorPageCallbackProxy
   * @param proxy (long)
   * @return (void)
   */
  public static final native void MRiF9eNE(long proxy);

  /**
   * org.chromium.weblayer_private.FullscreenCallbackProxy.createFullscreenCallbackProxy
   * @param proxy (org.chromium.weblayer_private.FullscreenCallbackProxy)
   * @param tab (long)
   * @return (long)
   */
  public static final native long MGmykU1g(Object proxy, long tab);

  /**
   * org.chromium.weblayer_private.FullscreenCallbackProxy.deleteFullscreenCallbackProxy
   * @param proxy (long)
   * @return (void)
   */
  public static final native void MeleUM$n(long proxy);

  /**
   * org.chromium.weblayer_private.FullscreenCallbackProxy.doExitFullscreen
   * @param nativeFullscreenCallbackProxy (long)
   * @param proxy (org.chromium.weblayer_private.FullscreenCallbackProxy)
   * @return (void)
   */
  public static final native void MSOA10zg(long nativeFullscreenCallbackProxy, Object proxy);

  /**
   * org.chromium.weblayer_private.LocaleChangedBroadcastReceiver.localeChanged
   * @return (void)
   */
  public static final native void MNVsdYhF();

  /**
   * org.chromium.weblayer_private.NavigationControllerImpl.canGoBack
   * @param nativeNavigationControllerImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationControllerImpl)
   * @return (boolean)
   */
  public static final native boolean Mk5Op77A(long nativeNavigationControllerImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationControllerImpl.canGoForward
   * @param nativeNavigationControllerImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationControllerImpl)
   * @return (boolean)
   */
  public static final native boolean Myt080DX(long nativeNavigationControllerImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationControllerImpl.getNavigationController
   * @param tab (long)
   * @return (long)
   */
  public static final native long MuaFsixb(long tab);

  /**
   * org.chromium.weblayer_private.NavigationControllerImpl.getNavigationEntryDisplayUri
   * @param nativeNavigationControllerImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationControllerImpl)
   * @param index (int)
   * @return (java.lang.String)
   */
  public static final native String MdarrSGz(long nativeNavigationControllerImpl, Object caller,
      int index);

  /**
   * org.chromium.weblayer_private.NavigationControllerImpl.getNavigationListCurrentIndex
   * @param nativeNavigationControllerImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationControllerImpl)
   * @return (int)
   */
  public static final native int MYvsya1k(long nativeNavigationControllerImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationControllerImpl.getNavigationListSize
   * @param nativeNavigationControllerImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationControllerImpl)
   * @return (int)
   */
  public static final native int MTQXD9PA(long nativeNavigationControllerImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationControllerImpl.goBack
   * @param nativeNavigationControllerImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationControllerImpl)
   * @return (void)
   */
  public static final native void MZrOkH8X(long nativeNavigationControllerImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationControllerImpl.goForward
   * @param nativeNavigationControllerImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationControllerImpl)
   * @return (void)
   */
  public static final native void MDkifRYV(long nativeNavigationControllerImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationControllerImpl.navigate
   * @param nativeNavigationControllerImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationControllerImpl)
   * @param uri (java.lang.String)
   * @return (void)
   */
  public static final native void MdNsGAMH(long nativeNavigationControllerImpl, Object caller,
      String uri);

  /**
   * org.chromium.weblayer_private.NavigationControllerImpl.reload
   * @param nativeNavigationControllerImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationControllerImpl)
   * @return (void)
   */
  public static final native void MgCpZ61D(long nativeNavigationControllerImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationControllerImpl.setNavigationControllerImpl
   * @param nativeNavigationControllerImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationControllerImpl)
   * @return (void)
   */
  public static final native void MpejyhKI(long nativeNavigationControllerImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationControllerImpl.stop
   * @param nativeNavigationControllerImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationControllerImpl)
   * @return (void)
   */
  public static final native void Mcpd2RLR(long nativeNavigationControllerImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationImpl.getHttpStatusCode
   * @param nativeNavigationImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationImpl)
   * @return (int)
   */
  public static final native int MavL_hzo(long nativeNavigationImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationImpl.getLoadError
   * @param nativeNavigationImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationImpl)
   * @return (int)
   */
  public static final native int Mu3sbx92(long nativeNavigationImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationImpl.getRedirectChain
   * @param nativeNavigationImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationImpl)
   * @return (java.lang.String[])
   */
  public static final native String[] M4$r2b34(long nativeNavigationImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationImpl.getState
   * @param nativeNavigationImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationImpl)
   * @return (int)
   */
  public static final native int MOjYwlCQ(long nativeNavigationImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationImpl.getUri
   * @param nativeNavigationImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationImpl)
   * @return (java.lang.String)
   */
  public static final native String MLe5UH8x(long nativeNavigationImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationImpl.isErrorPage
   * @param nativeNavigationImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationImpl)
   * @return (boolean)
   */
  public static final native boolean MIFgE7DZ(long nativeNavigationImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationImpl.isSameDocument
   * @param nativeNavigationImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationImpl)
   * @return (boolean)
   */
  public static final native boolean MNvdMHI6(long nativeNavigationImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NavigationImpl.setJavaNavigation
   * @param nativeNavigationImpl (long)
   * @param caller (org.chromium.weblayer_private.NavigationImpl)
   * @return (void)
   */
  public static final native void MAxzZ9OU(long nativeNavigationImpl, Object caller);

  /**
   * org.chromium.weblayer_private.NewTabCallbackProxy.createNewTabCallbackProxy
   * @param proxy (org.chromium.weblayer_private.NewTabCallbackProxy)
   * @param tab (long)
   * @return (long)
   */
  public static final native long Mm1ByG3d(Object proxy, long tab);

  /**
   * org.chromium.weblayer_private.NewTabCallbackProxy.deleteNewTabCallbackProxy
   * @param proxy (long)
   * @return (void)
   */
  public static final native void MxkBiJzp(long proxy);

  /**
   * org.chromium.weblayer_private.ProfileImpl.clearBrowsingData
   * @param nativeProfileImpl (long)
   * @param dataTypes (int[])
   * @param fromMillis (long)
   * @param toMillis (long)
   * @param callback (java.lang.Runnable)
   * @return (void)
   */
  public static final native void MTR7prkl(long nativeProfileImpl, int[] dataTypes, long fromMillis,
      long toMillis, Object callback);

  /**
   * org.chromium.weblayer_private.ProfileImpl.createProfile
   * @param name (java.lang.String)
   * @return (long)
   */
  public static final native long MKGVVWNd(String name);

  /**
   * org.chromium.weblayer_private.ProfileImpl.deleteProfile
   * @param profile (long)
   * @return (void)
   */
  public static final native void M_1y2G80(long profile);

  /**
   * org.chromium.weblayer_private.TabCallbackProxy.createTabCallbackProxy
   * @param proxy (org.chromium.weblayer_private.TabCallbackProxy)
   * @param tab (long)
   * @return (long)
   */
  public static final native long MOUs9Qy6(Object proxy, long tab);

  /**
   * org.chromium.weblayer_private.TabCallbackProxy.deleteTabCallbackProxy
   * @param proxy (long)
   * @return (void)
   */
  public static final native void Mpl66Ope(long proxy);

  /**
   * org.chromium.weblayer_private.TabImpl.createTab
   * @param profile (long)
   * @param caller (org.chromium.weblayer_private.TabImpl)
   * @return (long)
   */
  public static final native long M0NNPeB3(long profile, Object caller);

  /**
   * org.chromium.weblayer_private.TabImpl.deleteTab
   * @param tab (long)
   * @return (void)
   */
  public static final native void MD18T2Ck(long tab);

  /**
   * org.chromium.weblayer_private.TabImpl.executeScript
   * @param nativeTabImpl (long)
   * @param script (java.lang.String)
   * @param useSeparateIsolate (boolean)
   * @param callback (org.chromium.base.Callback<java.lang.String>)
   * @return (void)
   */
  public static final native void M9gymlSj(long nativeTabImpl, String script,
      boolean useSeparateIsolate, Object callback);

  /**
   * org.chromium.weblayer_private.TabImpl.getWebContents
   * @param nativeTabImpl (long)
   * @param caller (org.chromium.weblayer_private.TabImpl)
   * @return (org.chromium.content_public.browser.WebContents)
   */
  public static final native Object MV_K4t5p(long nativeTabImpl, Object caller);

  /**
   * org.chromium.weblayer_private.TabImpl.setJavaImpl
   * @param nativeTabImpl (long)
   * @param impl (org.chromium.weblayer_private.TabImpl)
   * @return (void)
   */
  public static final native void MKSJ4vB6(long nativeTabImpl, Object impl);

  /**
   * org.chromium.weblayer_private.TabImpl.setTopControlsContainerView
   * @param nativeTabImpl (long)
   * @param caller (org.chromium.weblayer_private.TabImpl)
   * @param nativeTopControlsContainerView (long)
   * @return (void)
   */
  public static final native void Mdvft$Wr(long nativeTabImpl, Object caller,
      long nativeTopControlsContainerView);

  /**
   * org.chromium.weblayer_private.TopControlsContainerView.createTopControlsContainerView
   * @param view (org.chromium.weblayer_private.TopControlsContainerView)
   * @param nativeContentViewRenderView (long)
   * @return (long)
   */
  public static final native long MxBee$83(Object view, long nativeContentViewRenderView);

  /**
   * org.chromium.weblayer_private.TopControlsContainerView.createTopControlsLayer
   * @param nativeTopControlsContainerView (long)
   * @param caller (org.chromium.weblayer_private.TopControlsContainerView)
   * @param id (int)
   * @return (void)
   */
  public static final native void M_eicmWU(long nativeTopControlsContainerView, Object caller,
      int id);

  /**
   * org.chromium.weblayer_private.TopControlsContainerView.deleteTopControlsContainerView
   * @param nativeTopControlsContainerView (long)
   * @param caller (org.chromium.weblayer_private.TopControlsContainerView)
   * @return (void)
   */
  public static final native void MDsa1RkB(long nativeTopControlsContainerView, Object caller);

  /**
   * org.chromium.weblayer_private.TopControlsContainerView.deleteTopControlsLayer
   * @param nativeTopControlsContainerView (long)
   * @param caller (org.chromium.weblayer_private.TopControlsContainerView)
   * @return (void)
   */
  public static final native void M0ErzYW_(long nativeTopControlsContainerView, Object caller);

  /**
   * org.chromium.weblayer_private.TopControlsContainerView.setTopControlsOffset
   * @param nativeTopControlsContainerView (long)
   * @param caller (org.chromium.weblayer_private.TopControlsContainerView)
   * @param topControlsOffsetY (int)
   * @param topContentOffsetY (int)
   * @return (void)
   */
  public static final native void MSVvJOat(long nativeTopControlsContainerView, Object caller,
      int topControlsOffsetY, int topContentOffsetY);

  /**
   * org.chromium.weblayer_private.TopControlsContainerView.setTopControlsSize
   * @param nativeTopControlsContainerView (long)
   * @param caller (org.chromium.weblayer_private.TopControlsContainerView)
   * @param width (int)
   * @param height (int)
   * @return (void)
   */
  public static final native void M6kNhy4_(long nativeTopControlsContainerView, Object caller,
      int width, int height);

  /**
   * org.chromium.weblayer_private.TopControlsContainerView.setWebContents
   * @param nativeTopControlsContainerView (long)
   * @param caller (org.chromium.weblayer_private.TopControlsContainerView)
   * @param webContents (org.chromium.content_public.browser.WebContents)
   * @return (void)
   */
  public static final native void MAiLwgGG(long nativeTopControlsContainerView, Object caller,
      Object webContents);

  /**
   * org.chromium.weblayer_private.TopControlsContainerView.updateTopControlsResource
   * @param nativeTopControlsContainerView (long)
   * @param caller (org.chromium.weblayer_private.TopControlsContainerView)
   * @return (void)
   */
  public static final native void Mxe_p5sj(long nativeTopControlsContainerView, Object caller);

  /**
   * org.chromium.weblayer_private.WebLayerImpl.isRemoteDebuggingEnabled
   * @return (boolean)
   */
  public static final native boolean MdEjk1wX();

  /**
   * org.chromium.weblayer_private.WebLayerImpl.setRemoteDebuggingEnabled
   * @param enabled (boolean)
   * @return (void)
   */
  public static final native void M1lGn20V(boolean enabled);
}
