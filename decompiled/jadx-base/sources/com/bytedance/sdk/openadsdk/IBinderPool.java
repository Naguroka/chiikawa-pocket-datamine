package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public interface IBinderPool extends android.os.IInterface {

    public static class Default implements com.bytedance.sdk.openadsdk.IBinderPool {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public android.os.IBinder queryBinder(int i) throws android.os.RemoteException {
            return null;
        }
    }

    android.os.IBinder queryBinder(int i) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.bytedance.sdk.openadsdk.IBinderPool {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.IBinderPool");
        }

        public static com.bytedance.sdk.openadsdk.IBinderPool asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IBinderPool");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof com.bytedance.sdk.openadsdk.IBinderPool)) {
                return (com.bytedance.sdk.openadsdk.IBinderPool) iInterfaceQueryLocalInterface;
            }
            return new com.bytedance.sdk.openadsdk.IBinderPool.Stub.bg(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.openadsdk.IBinderPool");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.bytedance.sdk.openadsdk.IBinderPool");
            android.os.IBinder iBinderQueryBinder = queryBinder(parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(iBinderQueryBinder);
            return true;
        }

        private static class bg implements com.bytedance.sdk.openadsdk.IBinderPool {
            public static com.bytedance.sdk.openadsdk.IBinderPool bg;
            private android.os.IBinder IL;

            bg(android.os.IBinder iBinder) {
                this.IL = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.IL;
            }

            @Override // com.bytedance.sdk.openadsdk.IBinderPool
            public android.os.IBinder queryBinder(int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IBinderPool");
                    parcelObtain.writeInt(i);
                    if (!this.IL.transact(1, parcelObtain, parcelObtain2, 0) && com.bytedance.sdk.openadsdk.IBinderPool.Stub.getDefaultImpl() != null) {
                        return com.bytedance.sdk.openadsdk.IBinderPool.Stub.getDefaultImpl().queryBinder(i);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readStrongBinder();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static boolean setDefaultImpl(com.bytedance.sdk.openadsdk.IBinderPool iBinderPool) {
            if (com.bytedance.sdk.openadsdk.IBinderPool.Stub.bg.bg != null || iBinderPool == null) {
                return false;
            }
            com.bytedance.sdk.openadsdk.IBinderPool.Stub.bg.bg = iBinderPool;
            return true;
        }

        public static com.bytedance.sdk.openadsdk.IBinderPool getDefaultImpl() {
            return com.bytedance.sdk.openadsdk.IBinderPool.Stub.bg.bg;
        }
    }
}
