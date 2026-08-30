package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public interface IAppOpenAdInteractionListener extends android.os.IInterface {

    public static class Default implements com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdClicked() throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdShow() throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdSkip() throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdTimeOver() throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onDestroy() throws android.os.RemoteException {
        }
    }

    void onAdClicked() throws android.os.RemoteException;

    void onAdShow() throws android.os.RemoteException;

    void onAdSkip() throws android.os.RemoteException;

    void onAdTimeOver() throws android.os.RemoteException;

    void onDestroy() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
        }

        public static com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener)) {
                return (com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener) iInterfaceQueryLocalInterface;
            }
            return new com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.bg(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                onDestroy();
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                onAdShow();
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                onAdClicked();
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                onAdSkip();
                parcel2.writeNoException();
                return true;
            }
            if (i != 5) {
                if (i == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
            onAdTimeOver();
            parcel2.writeNoException();
            return true;
        }

        private static class bg implements com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener {
            public static com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener bg;
            private android.os.IBinder IL;

            bg(android.os.IBinder iBinder) {
                this.IL = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.IL;
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onDestroy() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.IL.transact(1, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.getDefaultImpl().onDestroy();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdShow() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.IL.transact(2, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.getDefaultImpl().onAdShow();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdClicked() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.IL.transact(3, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.getDefaultImpl().onAdClicked();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdSkip() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.IL.transact(4, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.getDefaultImpl().onAdSkip();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdTimeOver() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.IL.transact(5, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.getDefaultImpl().onAdTimeOver();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener iAppOpenAdInteractionListener) {
            if (com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.bg.bg != null || iAppOpenAdInteractionListener == null) {
                return false;
            }
            com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.bg.bg = iAppOpenAdInteractionListener;
            return true;
        }

        public static com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener getDefaultImpl() {
            return com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener.Stub.bg.bg;
        }
    }
}
