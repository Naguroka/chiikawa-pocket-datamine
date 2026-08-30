package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public interface ICommonDialogListener extends android.os.IInterface {

    public static class Default implements com.bytedance.sdk.openadsdk.ICommonDialogListener {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogBtnNo() throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogBtnYes() throws android.os.RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
        public void onDialogCancel() throws android.os.RemoteException {
        }
    }

    void onDialogBtnNo() throws android.os.RemoteException;

    void onDialogBtnYes() throws android.os.RemoteException;

    void onDialogCancel() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.bytedance.sdk.openadsdk.ICommonDialogListener {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.ICommonDialogListener");
        }

        public static com.bytedance.sdk.openadsdk.ICommonDialogListener asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof com.bytedance.sdk.openadsdk.ICommonDialogListener)) {
                return (com.bytedance.sdk.openadsdk.ICommonDialogListener) iInterfaceQueryLocalInterface;
            }
            return new com.bytedance.sdk.openadsdk.ICommonDialogListener.Stub.bg(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                onDialogBtnYes();
                parcel2.writeNoException();
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                onDialogBtnNo();
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                if (i == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonDialogListener");
            onDialogCancel();
            parcel2.writeNoException();
            return true;
        }

        private static class bg implements com.bytedance.sdk.openadsdk.ICommonDialogListener {
            public static com.bytedance.sdk.openadsdk.ICommonDialogListener bg;
            private android.os.IBinder IL;

            bg(android.os.IBinder iBinder) {
                this.IL = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.IL;
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogBtnYes() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (!this.IL.transact(1, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.ICommonDialogListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.ICommonDialogListener.Stub.getDefaultImpl().onDialogBtnYes();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogBtnNo() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (!this.IL.transact(2, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.ICommonDialogListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.ICommonDialogListener.Stub.getDefaultImpl().onDialogBtnNo();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonDialogListener
            public void onDialogCancel() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonDialogListener");
                    if (!this.IL.transact(3, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.ICommonDialogListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.ICommonDialogListener.Stub.getDefaultImpl().onDialogCancel();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(com.bytedance.sdk.openadsdk.ICommonDialogListener iCommonDialogListener) {
            if (com.bytedance.sdk.openadsdk.ICommonDialogListener.Stub.bg.bg != null || iCommonDialogListener == null) {
                return false;
            }
            com.bytedance.sdk.openadsdk.ICommonDialogListener.Stub.bg.bg = iCommonDialogListener;
            return true;
        }

        public static com.bytedance.sdk.openadsdk.ICommonDialogListener getDefaultImpl() {
            return com.bytedance.sdk.openadsdk.ICommonDialogListener.Stub.bg.bg;
        }
    }
}
