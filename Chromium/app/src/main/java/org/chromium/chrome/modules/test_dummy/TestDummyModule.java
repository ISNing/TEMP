package org.chromium.chrome.modules.test_dummy;

import org.chromium.components.module_installer.builder.Module;
import org.chromium.components.module_installer.engine.InstallEngine;
import org.chromium.components.module_installer.engine.InstallListener;

public class TestDummyModule {
  private static final Module<TestDummyProvider> sModule = new Module<TestDummyProvider>("test_dummy", TestDummyProvider.class, "org.chromium.chrome.modules.test_dummy.TestDummyProviderImpl");

  private TestDummyModule() {
  }

  public static boolean isInstalled() {
    return sModule.isInstalled();
  }

  public static void install(InstallListener listener) {
    sModule.install(listener);
  }

  public static void installDeferred() {
    sModule.installDeferred();
  }

  public static TestDummyProvider getImpl() {
    return sModule.getImpl();
  }

  public static InstallEngine getInstallEngine() {
    return sModule.getInstallEngine();
  }

  public static void setInstallEngine(InstallEngine engine) {
    sModule.setInstallEngine(engine);
  }
}
