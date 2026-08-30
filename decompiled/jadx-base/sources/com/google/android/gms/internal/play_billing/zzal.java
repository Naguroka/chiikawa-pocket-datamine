package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzal extends com.google.android.gms.internal.play_billing.zzaq implements com.google.android.gms.internal.play_billing.zzam {
    public static com.google.android.gms.internal.play_billing.zzam zzs(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.zzam ? (com.google.android.gms.internal.play_billing.zzam) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.zzak(iBinder);
    }
}
