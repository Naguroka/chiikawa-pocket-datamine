package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzw {
    private final com.google.android.gms.internal.consent_sdk.zzx zza;
    private final com.google.android.gms.internal.consent_sdk.zzch zzb;
    private int zzc = 0;
    private com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus zzd = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;

    zzw(com.google.android.gms.internal.consent_sdk.zzx zzxVar, com.google.android.gms.internal.consent_sdk.zzch zzchVar) {
        this.zza = zzxVar;
        this.zzb = zzchVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    final com.google.android.gms.internal.consent_sdk.zzz zza() throws com.google.android.gms.internal.consent_sdk.zzg {
        java.lang.String str;
        int i = this.zzb.zzf;
        this.zza.zzc.zzh(i == 8);
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                this.zzc = 3;
                break;
            case 4:
                this.zzc = 2;
                break;
            case 5:
                this.zzc = 1;
                break;
            case 6:
                throw new com.google.android.gms.internal.consent_sdk.zzg(1, "Invalid response from server: ".concat(java.lang.String.valueOf(this.zzb.zzc)));
            case 7:
                throw new com.google.android.gms.internal.consent_sdk.zzg(3, "Publisher misconfiguration: ".concat(java.lang.String.valueOf(this.zzb.zzc)));
            default:
                throw new com.google.android.gms.internal.consent_sdk.zzg(1, "Invalid response from server.");
        }
        int i3 = this.zzb.zzg;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 1) {
            this.zzd = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
        } else {
            if (i4 != 2) {
                throw new com.google.android.gms.internal.consent_sdk.zzg(1, "Invalid response from server.");
            }
            this.zzd = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED;
        }
        com.google.android.gms.internal.consent_sdk.zzch zzchVar = this.zzb;
        java.lang.String str2 = zzchVar.zza;
        com.google.android.gms.internal.consent_sdk.zzbm zzbmVar = str2 == null ? null : new com.google.android.gms.internal.consent_sdk.zzbm(zzchVar.zzb, str2);
        this.zza.zzc.zzj(new java.util.HashSet(zzchVar.zzd));
        for (com.google.android.gms.internal.consent_sdk.zzcg zzcgVar : this.zzb.zze) {
            int i5 = zzcgVar.zzb;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 0) {
                str = null;
            } else if (i6 == 1) {
                str = "write";
            } else if (i6 != 2) {
                str = null;
            } else {
                str = "clear";
            }
            if (str != null) {
                com.google.android.gms.internal.consent_sdk.zzx zzxVar = this.zza;
                zzxVar.zza.zzb(str, zzcgVar.zza, zzxVar.zzb);
            }
        }
        return new com.google.android.gms.internal.consent_sdk.zzz(this.zzc, this.zzd, zzbmVar, null);
    }
}
