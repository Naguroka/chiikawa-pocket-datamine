package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzs extends com.google.android.gms.internal.play_billing.zzo {
    final /* synthetic */ com.google.android.gms.internal.play_billing.zzt zzg;

    zzs(com.google.android.gms.internal.play_billing.zzt zztVar) {
        java.util.Objects.requireNonNull(zztVar);
        this.zzg = zztVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    protected final java.lang.String zza() {
        com.google.android.gms.internal.play_billing.zzp zzpVar = (com.google.android.gms.internal.play_billing.zzp) this.zzg.zza.get();
        if (zzpVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + java.lang.String.valueOf(zzpVar.zza) + com.ironsource.y8.i.e;
    }
}
