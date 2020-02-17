package org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityUmaRecorder;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.TrustedWebActivityModel;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.chrome.browser.preferences.ChromePreferenceManager;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustedWebActivityDisclosureController_Factory
    implements Factory<TrustedWebActivityDisclosureController> {
  private final Provider<ChromePreferenceManager> preferenceManagerProvider;

  private final Provider<TrustedWebActivityModel> modelProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<CurrentPageVerifier> currentPageVerifierProvider;

  private final Provider<TrustedWebActivityUmaRecorder> recorderProvider;

  private final Provider<ClientPackageNameProvider> clientPackageNameProvider;

  public TrustedWebActivityDisclosureController_Factory(
      Provider<ChromePreferenceManager> preferenceManagerProvider,
      Provider<TrustedWebActivityModel> modelProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<TrustedWebActivityUmaRecorder> recorderProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider) {
    this.preferenceManagerProvider = preferenceManagerProvider;
    this.modelProvider = modelProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.currentPageVerifierProvider = currentPageVerifierProvider;
    this.recorderProvider = recorderProvider;
    this.clientPackageNameProvider = clientPackageNameProvider;
  }

  @Override
  public TrustedWebActivityDisclosureController get() {
    return provideInstance(
        preferenceManagerProvider,
        modelProvider,
        lifecycleDispatcherProvider,
        currentPageVerifierProvider,
        recorderProvider,
        clientPackageNameProvider);
  }

  public static TrustedWebActivityDisclosureController provideInstance(
      Provider<ChromePreferenceManager> preferenceManagerProvider,
      Provider<TrustedWebActivityModel> modelProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<TrustedWebActivityUmaRecorder> recorderProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider) {
    return new TrustedWebActivityDisclosureController(
        preferenceManagerProvider.get(),
        modelProvider.get(),
        lifecycleDispatcherProvider.get(),
        currentPageVerifierProvider.get(),
        recorderProvider.get(),
        clientPackageNameProvider.get());
  }

  public static TrustedWebActivityDisclosureController_Factory create(
      Provider<ChromePreferenceManager> preferenceManagerProvider,
      Provider<TrustedWebActivityModel> modelProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<TrustedWebActivityUmaRecorder> recorderProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider) {
    return new TrustedWebActivityDisclosureController_Factory(
        preferenceManagerProvider,
        modelProvider,
        lifecycleDispatcherProvider,
        currentPageVerifierProvider,
        recorderProvider,
        clientPackageNameProvider);
  }

  public static TrustedWebActivityDisclosureController newTrustedWebActivityDisclosureController(
      ChromePreferenceManager preferenceManager,
      TrustedWebActivityModel model,
      ActivityLifecycleDispatcher lifecycleDispatcher,
      CurrentPageVerifier currentPageVerifier,
      TrustedWebActivityUmaRecorder recorder,
      ClientPackageNameProvider clientPackageNameProvider) {
    return new TrustedWebActivityDisclosureController(
        preferenceManager,
        model,
        lifecycleDispatcher,
        currentPageVerifier,
        recorder,
        clientPackageNameProvider);
  }
}
