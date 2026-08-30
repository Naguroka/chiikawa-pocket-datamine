package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public interface ICommonPermissionListener extends android.os.IInterface {

    public static class Default implements com.bytedance.sdk.openadsdk.ICommonPermissionListener {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
        public void onDenied(java.lang.String str) throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
        public void onGranted() throws android.os.RemoteException {
        }
    }

    void onDenied(java.lang.String str) throws android.os.RemoteException;

    void onGranted() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.bytedance.sdk.openadsdk.ICommonPermissionListener {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.ICommonPermissionListener");
        }

        public static com.bytedance.sdk.openadsdk.ICommonPermissionListener asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof com.bytedance.sdk.openadsdk.ICommonPermissionListener)) {
                return (com.bytedance.sdk.openadsdk.ICommonPermissionListener) iInterfaceQueryLocalInterface;
            }
            return new com.bytedance.sdk.openadsdk.ICommonPermissionListener.Stub.bg(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                onGranted();
                parcel2.writeNoException();
                return true;
            }
            if (i != 2) {
                if (i == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
            onDenied(parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        private static class bg implements com.bytedance.sdk.openadsdk.ICommonPermissionListener {
            public static com.bytedance.sdk.openadsdk.ICommonPermissionListener bg;
            private android.os.IBinder IL;

            bg(android.os.IBinder iBinder) {
                this.IL = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.IL;
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
            public void onGranted() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    if (!this.IL.transact(1, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.ICommonPermissionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.ICommonPermissionListener.Stub.getDefaultImpl().onGranted();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
            public void onDenied(java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    parcelObtain.writeString(str);
                    if (!this.IL.transact(2, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.ICommonPermissionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.ICommonPermissionListener.Stub.getDefaultImpl().onDenied(str);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(com.bytedance.sdk.openadsdk.ICommonPermissionListener iCommonPermissionListener) {
            if (com.bytedance.sdk.openadsdk.ICommonPermissionListener.Stub.bg.bg != null || iCommonPermissionListener == null) {
                return false;
            }
            com.bytedance.sdk.openadsdk.ICommonPermissionListener.Stub.bg.bg = iCommonPermissionListener;
            return true;
        }

        public static com.bytedance.sdk.openadsdk.ICommonPermissionListener getDefaultImpl() {
            return com.bytedance.sdk.openadsdk.ICommonPermissionListener.Stub.bg.bg;
        }
    }
}
