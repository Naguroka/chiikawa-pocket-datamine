package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzav extends com.google.android.gms.internal.play_billing.zzaq implements com.google.android.gms.internal.play_billing.zzaw {
    public zzav() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzaq
    protected final boolean zzb(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        int i3 = parcel.readInt();
        com.google.android.gms.internal.play_billing.zzar.zzb(parcel);
        zza(i3);
        return true;
    }
}
