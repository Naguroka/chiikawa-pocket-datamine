package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzas extends com.google.android.gms.internal.play_billing.zzap implements com.google.android.gms.internal.play_billing.zzau {
    zzas(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzau
    public final void zza(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.play_billing.zzaw zzawVar) throws android.os.RemoteException {
        android.os.Parcel parcelZzs = zzs();
        parcelZzs.writeString(str);
        parcelZzs.writeString(str2);
        int i = com.google.android.gms.internal.play_billing.zzar.zza;
        parcelZzs.writeStrongBinder(zzawVar);
        zzv(1, parcelZzs);
    }
}
