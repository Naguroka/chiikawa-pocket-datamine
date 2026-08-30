package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zza {
    private static com.google.android.gms.internal.consent_sdk.zza zza;

    public static com.google.android.gms.internal.consent_sdk.zza zza(android.content.Context context) {
        com.google.android.gms.internal.consent_sdk.zza zzaVar;
        synchronized (com.google.android.gms.internal.consent_sdk.zza.class) {
            if (zza == null) {
                com.google.android.gms.internal.consent_sdk.zzag zzagVar = new com.google.android.gms.internal.consent_sdk.zzag(null);
                zzagVar.zzb((android.app.Application) context.getApplicationContext());
                zza = zzagVar.zza();
            }
            zzaVar = zza;
        }
        return zzaVar;
    }

    public abstract com.google.android.gms.internal.consent_sdk.zzj zzb();

    public abstract com.google.android.gms.internal.consent_sdk.zzbk zzc();
}
