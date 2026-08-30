package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzadb {
    private static final java.util.regex.Pattern zzc = java.util.regex.Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(java.lang.String str) {
        java.util.regex.Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            java.lang.String strGroup = matcher.group(1);
            int i = com.google.android.gms.internal.ads.zzei.zza;
            java.lang.String str2 = strGroup;
            int i2 = java.lang.Integer.parseInt(strGroup, 16);
            java.lang.String strGroup2 = matcher.group(2);
            java.lang.String str3 = strGroup2;
            int i3 = java.lang.Integer.parseInt(strGroup2, 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.zza = i2;
            this.zzb = i3;
            return true;
        } catch (java.lang.NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(com.google.android.gms.internal.ads.zzay zzayVar) {
        for (int i = 0; i < zzayVar.zza(); i++) {
            com.google.android.gms.internal.ads.zzax zzaxVarZzb = zzayVar.zzb(i);
            if (zzaxVarZzb instanceof com.google.android.gms.internal.ads.zzagb) {
                com.google.android.gms.internal.ads.zzagb zzagbVar = (com.google.android.gms.internal.ads.zzagb) zzaxVarZzb;
                if ("iTunSMPB".equals(zzagbVar.zzb) && zzc(zzagbVar.zzc)) {
                    return true;
                }
            } else if (zzaxVarZzb instanceof com.google.android.gms.internal.ads.zzagk) {
                com.google.android.gms.internal.ads.zzagk zzagkVar = (com.google.android.gms.internal.ads.zzagk) zzaxVarZzb;
                if ("com.apple.iTunes".equals(zzagkVar.zza) && "iTunSMPB".equals(zzagkVar.zzb) && zzc(zzagkVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
