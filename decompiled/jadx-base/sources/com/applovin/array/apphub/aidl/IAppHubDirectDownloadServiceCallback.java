package com.applovin.array.apphub.aidl;

/* JADX INFO: loaded from: classes3.dex */
public interface IAppHubDirectDownloadServiceCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback";

    public static class Default implements com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
        public void onAppDetailsDismissed(java.lang.String str) throws android.os.RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
        public void onAppDetailsShown(java.lang.String str) throws android.os.RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
        public void onDownloadStarted(java.lang.String str) throws android.os.RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
        public void onError(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        }
    }

    void onAppDetailsDismissed(java.lang.String str) throws android.os.RemoteException;

    void onAppDetailsShown(java.lang.String str) throws android.os.RemoteException;

    void onDownloadStarted(java.lang.String str) throws android.os.RemoteException;

    void onError(java.lang.String str, java.lang.String str2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback {
        static final int TRANSACTION_onAppDetailsDismissed = 2;
        static final int TRANSACTION_onAppDetailsShown = 1;
        static final int TRANSACTION_onDownloadStarted = 3;
        static final int TRANSACTION_onError = 4;

        private static class Proxy implements com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback.DESCRIPTOR;
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
            public void onAppDetailsDismissed(java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
            public void onAppDetailsShown(java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
            public void onDownloadStarted(java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback
            public void onError(java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
        }

        public static com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback)) ? new com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback.Stub.Proxy(iBinder) : (com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onAppDetailsShown(parcel.readString());
            } else if (i == 2) {
                onAppDetailsDismissed(parcel.readString());
            } else if (i == 3) {
                onDownloadStarted(parcel.readString());
            } else {
                if (i != 4) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                onError(parcel.readString(), parcel.readString());
            }
            return true;
        }
    }
}
