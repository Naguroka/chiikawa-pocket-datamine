package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class AccountAccessor extends com.google.android.gms.common.internal.IAccountAccessor.Stub {
    public static android.accounts.Account getAccountBinderSafe(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor) {
        android.accounts.Account accountZzb = null;
        if (iAccountAccessor != null) {
            long jClearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                try {
                    accountZzb = iAccountAccessor.zzb();
                } catch (android.os.RemoteException unused) {
                    android.util.Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                android.os.Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return accountZzb;
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final android.accounts.Account zzb() {
        throw null;
    }
}
