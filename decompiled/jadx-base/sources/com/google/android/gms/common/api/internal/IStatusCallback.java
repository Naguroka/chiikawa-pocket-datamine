package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface IStatusCallback extends android.os.IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
    public static abstract class Stub extends com.google.android.gms.internal.base.zab implements com.google.android.gms.common.api.internal.IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        public static com.google.android.gms.common.api.internal.IStatusCallback asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.api.internal.IStatusCallback ? (com.google.android.gms.common.api.internal.IStatusCallback) iInterfaceQueryLocalInterface : new com.google.android.gms.common.api.internal.zabw(iBinder);
        }

        @Override // com.google.android.gms.internal.base.zab
        protected final boolean zaa(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i != 1) {
                return false;
            }
            com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.base.zac.zaa(parcel, com.google.android.gms.common.api.Status.CREATOR);
            com.google.android.gms.internal.base.zac.zab(parcel);
            onResult(status);
            return true;
        }
    }

    void onResult(com.google.android.gms.common.api.Status status) throws android.os.RemoteException;
}
