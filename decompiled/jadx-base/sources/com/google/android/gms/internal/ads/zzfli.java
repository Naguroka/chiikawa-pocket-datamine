package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfli implements com.google.android.gms.internal.ads.zzfll {
    private static final com.google.android.gms.internal.ads.zzfli zza = new com.google.android.gms.internal.ads.zzfli(new com.google.android.gms.internal.ads.zzflm());
    private java.util.Date zzb;
    private boolean zzc;
    private final com.google.android.gms.internal.ads.zzflm zzd;
    private boolean zze;

    private zzfli(com.google.android.gms.internal.ads.zzflm zzflmVar) {
        this.zzd = zzflmVar;
    }

    public static com.google.android.gms.internal.ads.zzfli zza() {
        return zza;
    }

    public final java.util.Date zzb() {
        java.util.Date date = this.zzb;
        if (date != null) {
            return (java.util.Date) date.clone();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfll
    public final void zzc(boolean z) {
        if (!this.zze && z) {
            java.util.Date date = new java.util.Date();
            java.util.Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    java.util.Iterator it = com.google.android.gms.internal.ads.zzflk.zza().zzb().iterator();
                    while (it.hasNext()) {
                        ((com.google.android.gms.internal.ads.zzfkt) it.next()).zzg().zzg(zzb());
                    }
                }
            }
        }
        this.zze = z;
    }

    public final void zzd(android.content.Context context) {
        if (this.zzc) {
            return;
        }
        this.zzd.zzd(context);
        this.zzd.zze(this);
        this.zzd.zzf();
        this.zze = this.zzd.zza;
        this.zzc = true;
    }
}
