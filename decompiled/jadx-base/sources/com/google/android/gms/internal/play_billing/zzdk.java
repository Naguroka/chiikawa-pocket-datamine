package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdk extends com.google.android.gms.internal.play_billing.zzfi implements com.google.android.gms.internal.play_billing.zzgm {
    private static final com.google.android.gms.internal.play_billing.zzdk zzb;
    private com.google.android.gms.internal.play_billing.zzfn zzd = zzr();

    static {
        com.google.android.gms.internal.play_billing.zzdk zzdkVar = new com.google.android.gms.internal.play_billing.zzdk();
        zzb = zzdkVar;
        com.google.android.gms.internal.play_billing.zzfi.zzw(com.google.android.gms.internal.play_billing.zzdk.class, zzdkVar);
    }

    private zzdk() {
    }

    public static com.google.android.gms.internal.play_billing.zzdj zza() {
        return (com.google.android.gms.internal.play_billing.zzdj) zzb.zzl();
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.play_billing.zzdk zzdkVar, java.lang.Iterable iterable) {
        com.google.android.gms.internal.play_billing.zzfn zzfnVar = zzdkVar.zzd;
        if (!zzfnVar.zzc()) {
            int size = zzfnVar.size();
            zzdkVar.zzd = zzfnVar.zzd(size + size);
        }
        com.google.android.gms.internal.play_billing.zzds.zzg(iterable, zzdkVar.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzt(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zzd", com.google.android.gms.internal.play_billing.zzdi.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzdk();
        }
        com.google.android.gms.internal.play_billing.zzdl zzdlVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzdj(zzdlVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
