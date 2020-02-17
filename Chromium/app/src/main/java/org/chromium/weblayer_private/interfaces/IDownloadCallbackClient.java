/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.weblayer_private.interfaces;
/**
 * Used to forward download requests to the client.
 */
public interface IDownloadCallbackClient extends android.os.IInterface
{
  /** Default implementation for IDownloadCallbackClient. */
  public static class Default implements org.chromium.weblayer_private.interfaces.IDownloadCallbackClient
  {
    @Override public boolean interceptDownload(java.lang.String uriString, java.lang.String userAgent, java.lang.String contentDisposition, java.lang.String mimetype, long contentLength) throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.weblayer_private.interfaces.IDownloadCallbackClient
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.weblayer_private.interfaces.IDownloadCallbackClient";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.weblayer_private.interfaces.IDownloadCallbackClient interface,
     * generating a proxy if needed.
     */
    public static org.chromium.weblayer_private.interfaces.IDownloadCallbackClient asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.weblayer_private.interfaces.IDownloadCallbackClient))) {
        return ((org.chromium.weblayer_private.interfaces.IDownloadCallbackClient)iin);
      }
      return new org.chromium.weblayer_private.interfaces.IDownloadCallbackClient.Stub.Proxy(obj);
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
        case TRANSACTION_interceptDownload:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          long _arg4;
          _arg4 = data.readLong();
          boolean _result = this.interceptDownload(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.weblayer_private.interfaces.IDownloadCallbackClient
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
      @Override public boolean interceptDownload(java.lang.String uriString, java.lang.String userAgent, java.lang.String contentDisposition, java.lang.String mimetype, long contentLength) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(uriString);
          _data.writeString(userAgent);
          _data.writeString(contentDisposition);
          _data.writeString(mimetype);
          _data.writeLong(contentLength);
          boolean _status = mRemote.transact(Stub.TRANSACTION_interceptDownload, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().interceptDownload(uriString, userAgent, contentDisposition, mimetype, contentLength);
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
      public static org.chromium.weblayer_private.interfaces.IDownloadCallbackClient sDefaultImpl;
    }
    static final int TRANSACTION_interceptDownload = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.chromium.weblayer_private.interfaces.IDownloadCallbackClient impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.chromium.weblayer_private.interfaces.IDownloadCallbackClient getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public boolean interceptDownload(java.lang.String uriString, java.lang.String userAgent, java.lang.String contentDisposition, java.lang.String mimetype, long contentLength) throws android.os.RemoteException;
}
