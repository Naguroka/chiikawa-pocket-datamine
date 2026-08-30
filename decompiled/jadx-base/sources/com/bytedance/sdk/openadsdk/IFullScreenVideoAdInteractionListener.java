package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public interface IFullScreenVideoAdInteractionListener extends android.os.IInterface {

    public static class Default implements com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
        public void onAdClose() throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
        public void onAdShow() throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
        public void onAdVideoBarClick() throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
        public void onDestroy() throws android.os.RemoteException {
        }
    }

    void onAdClose() throws android.os.RemoteException;

    void onAdShow() throws android.os.RemoteException;

    void onAdVideoBarClick() throws android.os.RemoteException;

    void onDestroy() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
        }

        public static com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener)) {
                return (com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener) iInterfaceQueryLocalInterface;
            }
            return new com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.bg(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                onDestroy();
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                onAdShow();
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                onAdVideoBarClick();
                parcel2.writeNoException();
                return true;
            }
            if (i != 4) {
                if (i == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
            onAdClose();
            parcel2.writeNoException();
            return true;
        }

        private static class bg implements com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener {
            public static com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener bg;
            private android.os.IBinder IL;

            bg(android.os.IBinder iBinder) {
                this.IL = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.IL;
            }

            @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
            public void onDestroy() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    if (!this.IL.transact(1, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.getDefaultImpl().onDestroy();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
            public void onAdShow() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    if (!this.IL.transact(2, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.getDefaultImpl().onAdShow();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
            public void onAdVideoBarClick() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    if (!this.IL.transact(3, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.getDefaultImpl().onAdVideoBarClick();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
            public void onAdClose() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener");
                    if (!this.IL.transact(4, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.getDefaultImpl().onAdClose();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener iFullScreenVideoAdInteractionListener) {
            if (com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.bg.bg != null || iFullScreenVideoAdInteractionListener == null) {
                return false;
            }
            com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.bg.bg = iFullScreenVideoAdInteractionListener;
            return true;
        }

        public static com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener getDefaultImpl() {
            return com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener.Stub.bg.bg;
        }
    }
}
