package com.applovin.array.apphub.aidl;

/* JADX INFO: loaded from: classes3.dex */
public interface IAppHubService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.applovin.array.apphub.aidl.IAppHubService";

    public static class Default implements com.applovin.array.apphub.aidl.IAppHubService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public void directInstall(java.lang.String str, android.os.Bundle bundle, com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws android.os.RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public void dismissDirectDownloadAppDetails(java.lang.String str) throws android.os.RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public long getAppHubVersionCode() throws android.os.RemoteException {
            return 0L;
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public android.os.Bundle getEnabledFeatures() throws android.os.RemoteException {
            return null;
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public java.lang.String getRandomUserToken() throws android.os.RemoteException {
            return null;
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public void showDirectDownloadAppDetails(java.lang.String str, com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws android.os.RemoteException {
        }

        @Override // com.applovin.array.apphub.aidl.IAppHubService
        public void showDirectDownloadAppDetailsWithExtra(java.lang.String str, android.os.Bundle bundle, com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws android.os.RemoteException {
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends android.os.Parcelable> void writeTypedObject(android.os.Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void directInstall(java.lang.String str, android.os.Bundle bundle, com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws android.os.RemoteException;

    void dismissDirectDownloadAppDetails(java.lang.String str) throws android.os.RemoteException;

    long getAppHubVersionCode() throws android.os.RemoteException;

    android.os.Bundle getEnabledFeatures() throws android.os.RemoteException;

    java.lang.String getRandomUserToken() throws android.os.RemoteException;

    void showDirectDownloadAppDetails(java.lang.String str, com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws android.os.RemoteException;

    void showDirectDownloadAppDetailsWithExtra(java.lang.String str, android.os.Bundle bundle, com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.applovin.array.apphub.aidl.IAppHubService {
        static final int TRANSACTION_directInstall = 7;
        static final int TRANSACTION_dismissDirectDownloadAppDetails = 5;
        static final int TRANSACTION_getAppHubVersionCode = 2;
        static final int TRANSACTION_getEnabledFeatures = 3;
        static final int TRANSACTION_getRandomUserToken = 1;
        static final int TRANSACTION_showDirectDownloadAppDetails = 4;
        static final int TRANSACTION_showDirectDownloadAppDetailsWithExtra = 6;

        private static class Proxy implements com.applovin.array.apphub.aidl.IAppHubService {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public void directInstall(java.lang.String str, android.os.Bundle bundle, com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(com.applovin.array.apphub.aidl.IAppHubService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    com.applovin.array.apphub.aidl.IAppHubService._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeStrongInterface(iAppHubDirectDownloadServiceCallback);
                    this.mRemote.transact(7, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public void dismissDirectDownloadAppDetails(java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(com.applovin.array.apphub.aidl.IAppHubService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public long getAppHubVersionCode() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(com.applovin.array.apphub.aidl.IAppHubService.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public android.os.Bundle getEnabledFeatures() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(com.applovin.array.apphub.aidl.IAppHubService.DESCRIPTOR);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (android.os.Bundle) com.applovin.array.apphub.aidl.IAppHubService._Parcel.readTypedObject(parcelObtain2, android.os.Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public java.lang.String getInterfaceDescriptor() {
                return com.applovin.array.apphub.aidl.IAppHubService.DESCRIPTOR;
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public java.lang.String getRandomUserToken() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(com.applovin.array.apphub.aidl.IAppHubService.DESCRIPTOR);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public void showDirectDownloadAppDetails(java.lang.String str, com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(com.applovin.array.apphub.aidl.IAppHubService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(iAppHubDirectDownloadServiceCallback);
                    this.mRemote.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // com.applovin.array.apphub.aidl.IAppHubService
            public void showDirectDownloadAppDetailsWithExtra(java.lang.String str, android.os.Bundle bundle, com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback iAppHubDirectDownloadServiceCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(com.applovin.array.apphub.aidl.IAppHubService.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    com.applovin.array.apphub.aidl.IAppHubService._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    parcelObtain.writeStrongInterface(iAppHubDirectDownloadServiceCallback);
                    this.mRemote.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, com.applovin.array.apphub.aidl.IAppHubService.DESCRIPTOR);
        }

        public static com.applovin.array.apphub.aidl.IAppHubService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(com.applovin.array.apphub.aidl.IAppHubService.DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof com.applovin.array.apphub.aidl.IAppHubService)) ? new com.applovin.array.apphub.aidl.IAppHubService.Stub.Proxy(iBinder) : (com.applovin.array.apphub.aidl.IAppHubService) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(com.applovin.array.apphub.aidl.IAppHubService.DESCRIPTOR);
            }
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        java.lang.String randomUserToken = getRandomUserToken();
                        parcel2.writeNoException();
                        parcel2.writeString(randomUserToken);
                        return true;
                    case 2:
                        long appHubVersionCode = getAppHubVersionCode();
                        parcel2.writeNoException();
                        parcel2.writeLong(appHubVersionCode);
                        return true;
                    case 3:
                        android.os.Bundle enabledFeatures = getEnabledFeatures();
                        parcel2.writeNoException();
                        com.applovin.array.apphub.aidl.IAppHubService._Parcel.writeTypedObject(parcel2, enabledFeatures, 1);
                        return true;
                    case 4:
                        showDirectDownloadAppDetails(parcel.readString(), com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 5:
                        dismissDirectDownloadAppDetails(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        showDirectDownloadAppDetailsWithExtra(parcel.readString(), (android.os.Bundle) com.applovin.array.apphub.aidl.IAppHubService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR), com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                        return true;
                    case 7:
                        directInstall(parcel.readString(), (android.os.Bundle) com.applovin.array.apphub.aidl.IAppHubService._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR), com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback.Stub.asInterface(parcel.readStrongBinder()));
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString(com.applovin.array.apphub.aidl.IAppHubService.DESCRIPTOR);
            return true;
        }
    }
}
