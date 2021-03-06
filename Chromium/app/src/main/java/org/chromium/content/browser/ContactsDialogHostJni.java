package org.chromium.content.browser;

import J.N;
import java.lang.Override;
import java.lang.String;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.annotations.CheckDiscard;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContactsDialogHostJni implements ContactsDialogHost.Natives {
  private static ContactsDialogHost.Natives testInstance;

  public static final JniStaticTestMocker<ContactsDialogHost.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.ContactsDialogHost.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.ContactsDialogHost.Natives instance) {
      testInstance = instance;
    }
  };

  @Override
  public void addContact(long nativeContactsProviderAndroid, String[] names, String[] emails,
      String[] tel, ByteBuffer[] addresses, ByteBuffer[] icons) {
    N.MS9BZrW0(nativeContactsProviderAndroid, names, emails, tel, addresses, icons);
  }

  @Override
  public void endContactsList(long nativeContactsProviderAndroid, int percentageShared,
      int propertiesRequested) {
    N.MwwTaBAE(nativeContactsProviderAndroid, percentageShared, propertiesRequested);
  }

  @Override
  public void endWithPermissionDenied(long nativeContactsProviderAndroid) {
    N.MOM50EIZ(nativeContactsProviderAndroid);
  }

  public static ContactsDialogHost.Natives get() {
    if (N.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (N.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.ContactsDialogHost.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    return new ContactsDialogHostJni();
  }
}
