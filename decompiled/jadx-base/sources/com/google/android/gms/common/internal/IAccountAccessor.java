package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface IAccountAccessor extends android.os.IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.IAccountAccessor {
        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static com.google.android.gms.common.internal.IAccountAccessor asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.IAccountAccessor ? (com.google.android.gms.common.internal.IAccountAccessor) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.zzv(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
            if (i != 2) {
                return false;
            }
            android.accounts.Account accountZzb = zzb();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.zzd(parcel2, accountZzb);
            return true;
        }
    }

    android.accounts.Account zzb() throws android.os.RemoteException;
}
