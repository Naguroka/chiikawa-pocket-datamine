package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public interface IDislikeClosedListener extends android.os.IInterface {

    public static class Default implements com.bytedance.sdk.openadsdk.IDislikeClosedListener {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
        public void onItemClickClosed() throws android.os.RemoteException {
        }
    }

    void onItemClickClosed() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.bytedance.sdk.openadsdk.IDislikeClosedListener {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IDislikeClosedListener");
        }

        public static com.bytedance.sdk.openadsdk.IDislikeClosedListener asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof com.bytedance.sdk.openadsdk.IDislikeClosedListener)) {
                return (com.bytedance.sdk.openadsdk.IDislikeClosedListener) iInterfaceQueryLocalInterface;
            }
            return new com.bytedance.sdk.openadsdk.IDislikeClosedListener.Stub.bg(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
            onItemClickClosed();
            parcel2.writeNoException();
            return true;
        }

        private static class bg implements com.bytedance.sdk.openadsdk.IDislikeClosedListener {
            public static com.bytedance.sdk.openadsdk.IDislikeClosedListener bg;
            private android.os.IBinder IL;

            bg(android.os.IBinder iBinder) {
                this.IL = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.IL;
            }

            @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
            public void onItemClickClosed() throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IDislikeClosedListener");
                    if (!this.IL.transact(1, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IDislikeClosedListener.Stub.getDefaultImpl() != null) {
                        com.bytedance.sdk.openadsdk.IDislikeClosedListener.Stub.getDefaultImpl().onItemClickClosed();
                    } else {
                        parcelObtain2.readException();
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(com.bytedance.sdk.openadsdk.IDislikeClosedListener iDislikeClosedListener) {
            if (com.bytedance.sdk.openadsdk.IDislikeClosedListener.Stub.bg.bg != null || iDislikeClosedListener == null) {
                return false;
            }
            com.bytedance.sdk.openadsdk.IDislikeClosedListener.Stub.bg.bg = iDislikeClosedListener;
            return true;
        }

        public static com.bytedance.sdk.openadsdk.IDislikeClosedListener getDefaultImpl() {
            return com.bytedance.sdk.openadsdk.IDislikeClosedListener.Stub.bg.bg;
        }
    }
}
