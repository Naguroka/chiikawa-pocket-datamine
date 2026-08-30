package androidx.room;

/* JADX INFO: loaded from: classes3.dex */
public interface IMultiInstanceInvalidationService extends android.os.IInterface {
    void broadcastInvalidation(int i, java.lang.String[] strArr) throws android.os.RemoteException;

    int registerCallback(androidx.room.IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, java.lang.String str) throws android.os.RemoteException;

    void unregisterCallback(androidx.room.IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.room.IMultiInstanceInvalidationService {
        private static final java.lang.String DESCRIPTOR = "androidx.room.IMultiInstanceInvalidationService";
        static final int TRANSACTION_broadcastInvalidation = 3;
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_unregisterCallback = 2;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.room.IMultiInstanceInvalidationService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof androidx.room.IMultiInstanceInvalidationService)) {
                return (androidx.room.IMultiInstanceInvalidationService) iInterfaceQueryLocalInterface;
            }
            return new androidx.room.IMultiInstanceInvalidationService.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                int iRegisterCallback = registerCallback(androidx.room.IMultiInstanceInvalidationCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iRegisterCallback);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface(DESCRIPTOR);
                unregisterCallback(androidx.room.IMultiInstanceInvalidationCallback.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface(DESCRIPTOR);
                broadcastInvalidation(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        private static class Proxy implements androidx.room.IMultiInstanceInvalidationService {
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return androidx.room.IMultiInstanceInvalidationService.Stub.DESCRIPTOR;
            }

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public int registerCallback(androidx.room.IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, java.lang.String str) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.room.IMultiInstanceInvalidationService.Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMultiInstanceInvalidationCallback != null ? iMultiInstanceInvalidationCallback.asBinder() : null);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public void unregisterCallback(androidx.room.IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.room.IMultiInstanceInvalidationService.Stub.DESCRIPTOR);
                    parcelObtain.writeStrongBinder(iMultiInstanceInvalidationCallback != null ? iMultiInstanceInvalidationCallback.asBinder() : null);
                    parcelObtain.writeInt(i);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public void broadcastInvalidation(int i, java.lang.String[] strArr) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.room.IMultiInstanceInvalidationService.Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    this.mRemote.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }
}
