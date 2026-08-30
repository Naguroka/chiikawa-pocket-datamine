package android.support.customtabs;

/* JADX INFO: loaded from: classes.dex */
public interface ICustomTabsCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android$support$customtabs$ICustomTabsCallback".replace(kotlin.text.Typography.dollar, '.');

    public static class Default implements android.support.customtabs.ICustomTabsCallback {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public android.os.Bundle extraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityLayout(int i, int i2, int i3, int i4, int i5, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityResized(int i, int i2, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMinimized(android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i, android.net.Uri uri, boolean z, android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onUnminimized(android.os.Bundle bundle) throws android.os.RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onWarmupCompleted(android.os.Bundle bundle) throws android.os.RemoteException {
        }
    }

    void extraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    android.os.Bundle extraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void onActivityLayout(int i, int i2, int i3, int i4, int i5, android.os.Bundle bundle) throws android.os.RemoteException;

    void onActivityResized(int i, int i2, android.os.Bundle bundle) throws android.os.RemoteException;

    void onMessageChannelReady(android.os.Bundle bundle) throws android.os.RemoteException;

    void onMinimized(android.os.Bundle bundle) throws android.os.RemoteException;

    void onNavigationEvent(int i, android.os.Bundle bundle) throws android.os.RemoteException;

    void onPostMessage(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    void onRelationshipValidationResult(int i, android.net.Uri uri, boolean z, android.os.Bundle bundle) throws android.os.RemoteException;

    void onUnminimized(android.os.Bundle bundle) throws android.os.RemoteException;

    void onWarmupCompleted(android.os.Bundle bundle) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.ICustomTabsCallback {
        static final int TRANSACTION_extraCallback = 3;
        static final int TRANSACTION_extraCallbackWithResult = 7;
        static final int TRANSACTION_onActivityLayout = 10;
        static final int TRANSACTION_onActivityResized = 8;
        static final int TRANSACTION_onMessageChannelReady = 4;
        static final int TRANSACTION_onMinimized = 11;
        static final int TRANSACTION_onNavigationEvent = 2;
        static final int TRANSACTION_onPostMessage = 5;
        static final int TRANSACTION_onRelationshipValidationResult = 6;
        static final int TRANSACTION_onUnminimized = 12;
        static final int TRANSACTION_onWarmupCompleted = 9;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static android.support.customtabs.ICustomTabsCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof android.support.customtabs.ICustomTabsCallback)) {
                return (android.support.customtabs.ICustomTabsCallback) iInterfaceQueryLocalInterface;
            }
            return new android.support.customtabs.ICustomTabsCallback.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            java.lang.String str = DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    onNavigationEvent(parcel.readInt(), (android.os.Bundle) android.support.customtabs.ICustomTabsCallback._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 3:
                    extraCallback(parcel.readString(), (android.os.Bundle) android.support.customtabs.ICustomTabsCallback._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 4:
                    onMessageChannelReady((android.os.Bundle) android.support.customtabs.ICustomTabsCallback._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onPostMessage(parcel.readString(), (android.os.Bundle) android.support.customtabs.ICustomTabsCallback._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onRelationshipValidationResult(parcel.readInt(), (android.net.Uri) android.support.customtabs.ICustomTabsCallback._Parcel.readTypedObject(parcel, android.net.Uri.CREATOR), parcel.readInt() != 0, (android.os.Bundle) android.support.customtabs.ICustomTabsCallback._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 7:
                    android.os.Bundle bundleExtraCallbackWithResult = extraCallbackWithResult(parcel.readString(), (android.os.Bundle) android.support.customtabs.ICustomTabsCallback._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    parcel2.writeNoException();
                    android.support.customtabs.ICustomTabsCallback._Parcel.writeTypedObject(parcel2, bundleExtraCallbackWithResult, 1);
                    return true;
                case 8:
                    onActivityResized(parcel.readInt(), parcel.readInt(), (android.os.Bundle) android.support.customtabs.ICustomTabsCallback._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 9:
                    onWarmupCompleted((android.os.Bundle) android.support.customtabs.ICustomTabsCallback._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 10:
                    onActivityLayout(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (android.os.Bundle) android.support.customtabs.ICustomTabsCallback._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 11:
                    onMinimized((android.os.Bundle) android.support.customtabs.ICustomTabsCallback._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                case 12:
                    onUnminimized((android.os.Bundle) android.support.customtabs.ICustomTabsCallback._Parcel.readTypedObject(parcel, android.os.Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        private static class Proxy implements android.support.customtabs.ICustomTabsCallback {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onNavigationEvent(int i, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    android.support.customtabs.ICustomTabsCallback._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void extraCallback(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeString(str);
                    android.support.customtabs.ICustomTabsCallback._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onMessageChannelReady(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    android.support.customtabs.ICustomTabsCallback._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onPostMessage(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeString(str);
                    android.support.customtabs.ICustomTabsCallback._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onRelationshipValidationResult(int i, android.net.Uri uri, boolean z, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    android.support.customtabs.ICustomTabsCallback._Parcel.writeTypedObject(parcelObtain, uri, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    android.support.customtabs.ICustomTabsCallback._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public android.os.Bundle extraCallbackWithResult(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeString(str);
                    android.support.customtabs.ICustomTabsCallback._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (android.os.Bundle) android.support.customtabs.ICustomTabsCallback._Parcel.readTypedObject(parcelObtain2, android.os.Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onActivityResized(int i, int i2, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    android.support.customtabs.ICustomTabsCallback._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onWarmupCompleted(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    android.support.customtabs.ICustomTabsCallback._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onActivityLayout(int i, int i2, int i3, int i4, int i5, android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeInt(i5);
                    android.support.customtabs.ICustomTabsCallback._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onMinimized(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    android.support.customtabs.ICustomTabsCallback._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(11, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onUnminimized(android.os.Bundle bundle) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    android.support.customtabs.ICustomTabsCallback._Parcel.writeTypedObject(parcelObtain, bundle, 0);
                    this.mRemote.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
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
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
