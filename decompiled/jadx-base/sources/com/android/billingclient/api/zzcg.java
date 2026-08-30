package com.android.billingclient.api;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzcg {
    public static final /* synthetic */ int zza = 0;

    static {
        int i = com.android.billingclient.api.zzch.zza;
    }

    public static java.lang.String zza(java.lang.Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            java.lang.String str = exc.getClass().getSimpleName() + ":" + com.google.android.gms.internal.play_billing.zzbj.zzb(exc.getMessage());
            int i = com.google.android.gms.internal.play_billing.zzc.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static com.google.android.gms.internal.play_billing.zzhx zzb(com.google.android.gms.internal.play_billing.zzie zzieVar, int i, com.android.billingclient.api.BillingResult billingResult, java.lang.String str, com.google.android.gms.internal.play_billing.zzil zzilVar) {
        try {
            com.google.android.gms.internal.play_billing.zzic zzicVarZzc = com.google.android.gms.internal.play_billing.zzig.zzc();
            zzicVarZzc.zzo(billingResult.getResponseCode());
            zzicVarZzc.zzl(billingResult.getDebugMessage());
            if (billingResult.getOnPurchasesUpdatedSubResponseCode() != 0) {
                zzicVarZzc.zzm(billingResult.getOnPurchasesUpdatedSubResponseCode());
            }
            if (zzieVar != null) {
                zzicVarZzc.zzn(zzieVar);
            }
            if (str != null) {
                zzicVarZzc.zza(str);
            }
            com.google.android.gms.internal.play_billing.zzhv zzhvVarZzc = com.google.android.gms.internal.play_billing.zzhx.zzc();
            zzhvVarZzc.zzl(zzicVarZzc);
            zzhvVarZzc.zzp(i);
            if (!zzilVar.equals(com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED)) {
                zzhvVarZzc.zza(zzilVar);
            }
            return (com.google.android.gms.internal.play_billing.zzhx) zzhvVarZzc.zze();
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static com.google.android.gms.internal.play_billing.zzib zzc(int i, com.google.android.gms.internal.play_billing.zzil zzilVar) {
        try {
            com.google.android.gms.internal.play_billing.zzhz zzhzVarZzc = com.google.android.gms.internal.play_billing.zzib.zzc();
            zzhzVarZzc.zzo(i);
            if (!zzilVar.equals(com.google.android.gms.internal.play_billing.zzil.BROADCAST_ACTION_UNSPECIFIED)) {
                zzhzVarZzc.zza(zzilVar);
            }
            return (com.google.android.gms.internal.play_billing.zzib) zzhzVarZzc.zze();
        } catch (java.lang.Exception e) {
            com.google.android.gms.internal.play_billing.zzc.zzo("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
