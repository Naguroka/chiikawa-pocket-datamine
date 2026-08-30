package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public interface IRewardAdInteractionListener extends android.os.IInterface {

    public static class Default implements com.bytedance.sdk.openadsdk.IRewardAdInteractionListener {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
        public void onAdClose() throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
        public void onAdShow() throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
        public void onAdVideoBarClick() throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
        public void onDestroy() throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
        public void onRewardVerify(boolean z, int i, java.lang.String str, int i2, java.lang.String str2) throws android.os.RemoteException {
        }
    }

    void onAdClose() throws android.os.RemoteException;

    void onAdShow() throws android.os.RemoteException;

    void onAdVideoBarClick() throws android.os.RemoteException;

    void onDestroy() throws android.os.RemoteException;

    void onRewardVerify(boolean z, int i, java.lang.String str, int i2, java.lang.String str2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.bytedance.sdk.openadsdk.IRewardAdInteractionListener {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
        }

        public static com.bytedance.sdk.openadsdk.IRewardAdInteractionListener asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof com.bytedance.sdk.openadsdk.IRewardAdInteractionListener)) {
                return (com.bytedance.sdk.openadsdk.IRewardAdInteractionListener) iInterfaceQueryLocalInterface;
            }
            return new com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.bg(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                onDestroy();
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                onAdShow();
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                onAdVideoBarClick();
                parcel2.writeNoException();
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                onAdClose();
                parcel2.writeNoException();
                return true;
            }
            if (i != 5) {
                if (i == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
            onRewardVerify(parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }

        private static class bg implements com.bytedance.sdk.openadsdk.IRewardAdInteractionListener {
            public static com.bytedance.sdk.openadsdk.IRewardAdInteractionListener bg;
            private android.os.IBinder IL;

            bg(android.os.IBinder iBinder) {
                this.IL = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.IL;
            }

            @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
            public void onDestroy() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                    if (!this.IL.transact(1, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.getDefaultImpl().onDestroy();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
            public void onAdShow() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                    if (!this.IL.transact(2, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.getDefaultImpl().onAdShow();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
            public void onAdVideoBarClick() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                    if (!this.IL.transact(3, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.getDefaultImpl().onAdVideoBarClick();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
            public void onAdClose() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                    if (!this.IL.transact(4, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.getDefaultImpl().onAdClose();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
            public void onRewardVerify(boolean z, int i, java.lang.String str, int i2, java.lang.String str2) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IRewardAdInteractionListener");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeString(str2);
                    if (!this.IL.transact(5, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.getDefaultImpl().onRewardVerify(z, i, str, i2, str2);
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(com.bytedance.sdk.openadsdk.IRewardAdInteractionListener iRewardAdInteractionListener) {
            if (com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.bg.bg != null || iRewardAdInteractionListener == null) {
                return false;
            }
            com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.bg.bg = iRewardAdInteractionListener;
            return true;
        }

        public static com.bytedance.sdk.openadsdk.IRewardAdInteractionListener getDefaultImpl() {
            return com.bytedance.sdk.openadsdk.IRewardAdInteractionListener.Stub.bg.bg;
        }
    }
}
