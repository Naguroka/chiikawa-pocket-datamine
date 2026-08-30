package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzai implements com.google.android.gms.internal.consent_sdk.zzat {
    private final com.google.android.gms.internal.consent_sdk.zzaf zza;
    private final com.google.android.gms.internal.consent_sdk.zzdn zzb;
    private final com.google.android.gms.internal.consent_sdk.zzdn zzc;
    private final com.google.android.gms.internal.consent_sdk.zzdn zzd;
    private final com.google.android.gms.internal.consent_sdk.zzdn zze;
    private final com.google.android.gms.internal.consent_sdk.zzdn zzf;

    /* synthetic */ zzai(com.google.android.gms.internal.consent_sdk.zzaf zzafVar, com.google.android.gms.internal.consent_sdk.zzbm zzbmVar, com.google.android.gms.internal.consent_sdk.zzaj zzajVar) {
        this.zza = zzafVar;
        com.google.android.gms.internal.consent_sdk.zzdn zzdnVarZzb = com.google.android.gms.internal.consent_sdk.zzdj.zzb(new com.google.android.gms.internal.consent_sdk.zzbu(zzafVar.zzb));
        this.zzb = zzdnVarZzb;
        com.google.android.gms.internal.consent_sdk.zzdk zzdkVarZzb = com.google.android.gms.internal.consent_sdk.zzdl.zzb(zzbmVar);
        this.zzc = zzdkVarZzb;
        com.google.android.gms.internal.consent_sdk.zzdi zzdiVar = new com.google.android.gms.internal.consent_sdk.zzdi();
        this.zzd = zzdiVar;
        com.google.android.gms.internal.consent_sdk.zzby zzbyVar = new com.google.android.gms.internal.consent_sdk.zzby(zzafVar.zzb, zzdnVarZzb, com.google.android.gms.internal.consent_sdk.zzao.zza, com.google.android.gms.internal.consent_sdk.zzaq.zza, zzafVar.zzh, zzafVar.zzi, zzdiVar, zzafVar.zzc);
        this.zze = zzbyVar;
        com.google.android.gms.internal.consent_sdk.zzbs zzbsVar = new com.google.android.gms.internal.consent_sdk.zzbs(zzdnVarZzb, com.google.android.gms.internal.consent_sdk.zzao.zza, zzbyVar);
        this.zzf = zzbsVar;
        com.google.android.gms.internal.consent_sdk.zzdi.zzb(zzdiVar, com.google.android.gms.internal.consent_sdk.zzdj.zzb(new com.google.android.gms.internal.consent_sdk.zzaz(zzafVar.zzb, zzafVar.zzd, zzdnVarZzb, zzafVar.zzc, zzdkVarZzb, zzbsVar)));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzat
    public final com.google.android.gms.internal.consent_sdk.zzay zza() {
        return (com.google.android.gms.internal.consent_sdk.zzay) this.zzd.zza();
    }
}
