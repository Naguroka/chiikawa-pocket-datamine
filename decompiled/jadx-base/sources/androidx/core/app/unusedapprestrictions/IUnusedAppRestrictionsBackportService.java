package androidx.core.app.unusedapprestrictions;

/* JADX INFO: loaded from: classes.dex */
public interface IUnusedAppRestrictionsBackportService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";

    public static class Default implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws android.os.RemoteException {
        }
    }

    void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {
        static final int TRANSACTION_isPermissionRevocationEnabledForApp = 1;

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.DESCRIPTOR);
        }

        public static androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.DESCRIPTOR);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService)) {
                return (androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService) iInterfaceQueryLocalInterface;
            }
            return new androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.asInterface(parcel.readStrongBinder()));
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        private static class Proxy implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {
            private android.os.IBinder mRemote;

            public java.lang.String getInterfaceDescriptor() {
                return androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.DESCRIPTOR;
            }

            Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
            public void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) throws android.os.RemoteException {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.DESCRIPTOR);
                    parcelObtain.writeStrongInterface(iUnusedAppRestrictionsBackportCallback);
                    this.mRemote.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }
}
