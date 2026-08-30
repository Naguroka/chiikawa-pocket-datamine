package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaa extends com.google.android.gms.internal.play_billing.zzaq implements com.google.android.gms.internal.play_billing.zzab {
    public zzaa() {
        super("com.android.vending.billing.IInAppBillingGetAlternativeBillingOnlyDialogIntentCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzaq
    protected final boolean zzb(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzar.zza(parcel, android.os.Bundle.CREATOR);
        com.google.android.gms.internal.play_billing.zzar.zzb(parcel);
        zza(bundle);
        return true;
    }
}
