package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzat extends com.google.android.gms.internal.play_billing.zzaq implements com.google.android.gms.internal.play_billing.zzau {
    public static com.google.android.gms.internal.play_billing.zzau zzc(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.zzau ? (com.google.android.gms.internal.play_billing.zzau) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.zzas(iBinder);
    }
}
