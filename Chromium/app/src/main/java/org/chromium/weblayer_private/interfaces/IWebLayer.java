/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
public interface IWebLayer extends android.os.IInterface
{
  /** Default implementation for IWebLayer. */
  public static class Default implements org.chromium.weblayer_private.interfaces.IWebLayer
  {
    // Initializes WebLayer and starts loading.
    //
    // It is expected that either loadAsync or loadSync is called before anything else.
    //
    // @param appContext     A Context that refers to the Application using WebLayer.
    // @param loadedCallback A ValueCallback that will be called when load completes.

    @Override public void loadAsync(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper loadedCallback) throws android.os.RemoteException
    {
    }
    // Initializes WebLayer, starts loading and blocks until loading has completed.
    //
    // It is expected that either loadAsync or loadSync is called before anything else.
    //
    // @param appContext A Context that refers to the Application using WebLayer.

    @Override public void loadSync(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext) throws android.os.RemoteException
    {
    }
    // Creates the WebLayer counterpart to a BrowserFragment - a BrowserFragmentImpl
    //
    // @param fragmentClient Representative of the Fragment on the client side through which
    // WebLayer can call methods on Fragment.
    // @param fragmentArgs Bundle of arguments with which the Fragment was created on the client side
    // (see Fragment#setArguments).

    @Override public org.chromium.weblayer_private.interfaces.IBrowserFragment createBrowserFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient fragmentClient, org.chromium.weblayer_private.interfaces.IObjectWrapper fragmentArgs) throws android.os.RemoteException
    {
      return null;
    }
    // Create or get the profile matching profileName.

    @Override public org.chromium.weblayer_private.interfaces.IProfile getProfile(java.lang.String profileName) throws android.os.RemoteException
    {
      return null;
    }
    // Enable or disable DevTools remote debugging server.

    @Override public void setRemoteDebuggingEnabled(boolean enabled) throws android.os.RemoteException
    {
    }
    // Returns whether or not the DevTools remote debugging server is enabled.

    @Override public boolean isRemoteDebuggingEnabled() throws android.os.RemoteException
    {
      return false;
    }
    // Returns the singleton crash reporter controller. If WebLayer has not been
    // initialized, does the minimum initialization needed for the crash reporter.

    @Override public org.chromium.weblayer_private.interfaces.ICrashReporterController getCrashReporterController(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IWebLayer
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IWebLayer";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IWebLayer interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IWebLayer asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IWebLayer))) {
        return ((org.chromium.weblayer_private.interfaces.IWebLayer)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IWebLayer.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_loadAsync:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.loadAsync(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_loadSync:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          this.loadSync(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_createBrowserFragmentImpl:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IRemoteFragmentClient _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IRemoteFragmentClient.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg1;
          _arg1 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.IBrowserFragment _result = this.createBrowserFragmentImpl(_arg0, _arg1);
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_getProfile:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          org.chromium.weblayer_private.interfaces.IProfile _result = this.getProfile(_arg0);
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        case TRANSACTION_setRemoteDebuggingEnabled:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setRemoteDebuggingEnabled(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_isRemoteDebuggingEnabled:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.isRemoteDebuggingEnabled();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getCrashReporterController:
        {
          data.enforceInterface(descriptor);
          org.chromium.weblayer_private.interfaces.IObjectWrapper _arg0;
          _arg0 = org.chromium.weblayer_private.interfaces.IObjectWrapper.Stub.asInterface(data.readStrongBinder());
          org.chromium.weblayer_private.interfaces.ICrashReporterController _result = this.getCrashReporterController(_arg0);
          reply.writeNoException();
          reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IWebLayer
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      // Initializes WebLayer and starts loading.
      //
      // It is expected that either loadAsync or loadSync is called before anything else.
      //
      // @param appContext     A Context that refers to the Application using WebLayer.
      // @param loadedCallback A ValueCallback that will be called when load completes.

      @Override public void loadAsync(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper loadedCallback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((appContext!=null))?(appContext.asBinder()):(null)));
          _data.writeStrongBinder((((loadedCallback!=null))?(loadedCallback.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadAsync, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().loadAsync(appContext, loadedCallback);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Initializes WebLayer, starts loading and blocks until loading has completed.
      //
      // It is expected that either loadAsync or loadSync is called before anything else.
      //
      // @param appContext A Context that refers to the Application using WebLayer.

      @Override public void loadSync(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((appContext!=null))?(appContext.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadSync, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().loadSync(appContext);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Creates the WebLayer counterpart to a BrowserFragment - a BrowserFragmentImpl
      //
      // @param fragmentClient Representative of the Fragment on the client side through which
      // WebLayer can call methods on Fragment.
      // @param fragmentArgs Bundle of arguments with which the Fragment was created on the client side
      // (see Fragment#setArguments).

      @Override public org.chromium.weblayer_private.interfaces.IBrowserFragment createBrowserFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient fragmentClient, org.chromium.weblayer_private.interfaces.IObjectWrapper fragmentArgs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IBrowserFragment _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((fragmentClient!=null))?(fragmentClient.asBinder()):(null)));
          _data.writeStrongBinder((((fragmentArgs!=null))?(fragmentArgs.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_createBrowserFragmentImpl, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().createBrowserFragmentImpl(fragmentClient, fragmentArgs);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IBrowserFragment.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Create or get the profile matching profileName.

      @Override public org.chromium.weblayer_private.interfaces.IProfile getProfile(java.lang.String profileName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.IProfile _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(profileName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getProfile, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getProfile(profileName);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.IProfile.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Enable or disable DevTools remote debugging server.

      @Override public void setRemoteDebuggingEnabled(boolean enabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((enabled)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setRemoteDebuggingEnabled, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setRemoteDebuggingEnabled(enabled);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      // Returns whether or not the DevTools remote debugging server is enabled.

      @Override public boolean isRemoteDebuggingEnabled() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isRemoteDebuggingEnabled, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isRemoteDebuggingEnabled();
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      // Returns the singleton crash reporter controller. If WebLayer has not been
      // initialized, does the minimum initialization needed for the crash reporter.

      @Override public org.chromium.weblayer_private.interfaces.ICrashReporterController getCrashReporterController(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.chromium.weblayer_private.interfaces.ICrashReporterController _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((appContext!=null))?(appContext.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCrashReporterController, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCrashReporterController(appContext);
          }
          _reply.readException();
          _result = org.chromium.weblayer_private.interfaces.ICrashReporterController.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static org.chromium.weblayer_private.interfaces.IWebLayer sDefaultImpl;
    }
    static final int TRANSACTION_loadAsync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_loadSync = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_createBrowserFragmentImpl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_setRemoteDebuggingEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_isRemoteDebuggingEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getCrashReporterController = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IWebLayer impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.chromium.weblayer_private.interfaces.IWebLayer getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // Initializes WebLayer and starts loading.
  //
  // It is expected that either loadAsync or loadSync is called before anything else.
  //
  // @param appContext     A Context that refers to the Application using WebLayer.
  // @param loadedCallback A ValueCallback that will be called when load completes.

  public void loadAsync(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext, org.chromium.weblayer_private.interfaces.IObjectWrapper loadedCallback) throws android.os.RemoteException;
  // Initializes WebLayer, starts loading and blocks until loading has completed.
  //
  // It is expected that either loadAsync or loadSync is called before anything else.
  //
  // @param appContext A Context that refers to the Application using WebLayer.

  public void loadSync(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext) throws android.os.RemoteException;
  // Creates the WebLayer counterpart to a BrowserFragment - a BrowserFragmentImpl
  //
  // @param fragmentClient Representative of the Fragment on the client side through which
  // WebLayer can call methods on Fragment.
  // @param fragmentArgs Bundle of arguments with which the Fragment was created on the client side
  // (see Fragment#setArguments).

  public org.chromium.weblayer_private.interfaces.IBrowserFragment createBrowserFragmentImpl(org.chromium.weblayer_private.interfaces.IRemoteFragmentClient fragmentClient, org.chromium.weblayer_private.interfaces.IObjectWrapper fragmentArgs) throws android.os.RemoteException;
  // Create or get the profile matching profileName.

  public org.chromium.weblayer_private.interfaces.IProfile getProfile(java.lang.String profileName) throws android.os.RemoteException;
  // Enable or disable DevTools remote debugging server.

  public void setRemoteDebuggingEnabled(boolean enabled) throws android.os.RemoteException;
  // Returns whether or not the DevTools remote debugging server is enabled.

  public boolean isRemoteDebuggingEnabled() throws android.os.RemoteException;
  // Returns the singleton crash reporter controller. If WebLayer has not been
  // initialized, does the minimum initialization needed for the crash reporter.

  public org.chromium.weblayer_private.interfaces.ICrashReporterController getCrashReporterController(org.chromium.weblayer_private.interfaces.IObjectWrapper appContext) throws android.os.RemoteException;
}
