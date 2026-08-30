package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzeu {
    static final com.google.android.gms.internal.play_billing.zzeu zza = new com.google.android.gms.internal.play_billing.zzeu(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile com.google.android.gms.internal.play_billing.zzeu zzd;
    private final java.util.Map zze;

    zzeu() {
        this.zze = new java.util.HashMap();
    }

    public static com.google.android.gms.internal.play_billing.zzeu zza() {
        com.google.android.gms.internal.play_billing.zzeu zzeuVar = zzd;
        if (zzeuVar != null) {
            return zzeuVar;
        }
        synchronized (com.google.android.gms.internal.play_billing.zzeu.class) {
            com.google.android.gms.internal.play_billing.zzeu zzeuVar2 = zzd;
            if (zzeuVar2 != null) {
                return zzeuVar2;
            }
            int i = com.google.android.gms.internal.play_billing.zzgs.zza;
            com.google.android.gms.internal.play_billing.zzeu zzeuVarZzb = com.google.android.gms.internal.play_billing.zzfc.zzb(com.google.android.gms.internal.play_billing.zzeu.class);
            zzd = zzeuVarZzb;
            return zzeuVarZzb;
        }
    }

    public final com.google.android.gms.internal.play_billing.zzfh zzb(com.google.android.gms.internal.play_billing.zzgl zzglVar, int i) {
        return (com.google.android.gms.internal.play_billing.zzfh) this.zze.get(new com.google.android.gms.internal.play_billing.zzet(zzglVar, i));
    }

    zzeu(boolean z) {
        this.zze = java.util.Collections.emptyMap();
    }
}
