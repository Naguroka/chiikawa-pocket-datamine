package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfrb {
    private static com.google.android.gms.internal.ads.zzfrb zzb;
    final com.google.android.gms.internal.ads.zzfrc zza;

    private zzfrb(android.content.Context context) {
        this.zza = com.google.android.gms.internal.ads.zzfrc.zzb(context);
    }

    public static final com.google.android.gms.internal.ads.zzfrb zza(android.content.Context context) {
        com.google.android.gms.internal.ads.zzfrb zzfrbVar;
        synchronized (com.google.android.gms.internal.ads.zzfrb.class) {
            if (zzb == null) {
                zzb = new com.google.android.gms.internal.ads.zzfrb(context);
            }
            zzfrbVar = zzb;
        }
        return zzfrbVar;
    }

    public final void zzb(boolean z) throws java.io.IOException {
        synchronized (com.google.android.gms.internal.ads.zzfrb.class) {
            this.zza.zzd("paidv2_user_option", java.lang.Boolean.valueOf(z));
        }
    }

    public final void zzc(boolean z) throws java.io.IOException {
        synchronized (com.google.android.gms.internal.ads.zzfrb.class) {
            this.zza.zzd("paidv2_publisher_option", java.lang.Boolean.valueOf(z));
            if (!z) {
                this.zza.zze("paidv2_creation_time");
                this.zza.zze("paidv2_id");
                this.zza.zze("vendor_scoped_gpid_v2_id");
                this.zza.zze("vendor_scoped_gpid_v2_creation_time");
            }
        }
    }

    public final boolean zzd() {
        boolean zZzf;
        synchronized (com.google.android.gms.internal.ads.zzfrb.class) {
            zZzf = this.zza.zzf("paidv2_publisher_option", true);
        }
        return zZzf;
    }

    public final boolean zze() {
        boolean zZzf;
        synchronized (com.google.android.gms.internal.ads.zzfrb.class) {
            zZzf = this.zza.zzf("paidv2_user_option", true);
        }
        return zZzf;
    }
}
