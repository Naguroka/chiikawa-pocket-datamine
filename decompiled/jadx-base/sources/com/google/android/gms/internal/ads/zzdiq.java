package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdiq {
    public static final com.google.android.gms.internal.ads.zzdiq zza = new com.google.android.gms.internal.ads.zzdiq(new com.google.android.gms.internal.ads.zzdio());
    private final com.google.android.gms.internal.ads.zzbgx zzb;
    private final com.google.android.gms.internal.ads.zzbgu zzc;
    private final com.google.android.gms.internal.ads.zzbhk zzd;
    private final com.google.android.gms.internal.ads.zzbhh zze;
    private final com.google.android.gms.internal.ads.zzbmi zzf;
    private final androidx.collection.SimpleArrayMap zzg;
    private final androidx.collection.SimpleArrayMap zzh;

    private zzdiq(com.google.android.gms.internal.ads.zzdio zzdioVar) {
        this.zzb = zzdioVar.zza;
        this.zzc = zzdioVar.zzb;
        this.zzd = zzdioVar.zzc;
        this.zzg = new androidx.collection.SimpleArrayMap(zzdioVar.zzf);
        this.zzh = new androidx.collection.SimpleArrayMap(zzdioVar.zzg);
        this.zze = zzdioVar.zzd;
        this.zzf = zzdioVar.zze;
    }

    public final com.google.android.gms.internal.ads.zzbgu zza() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzbgx zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzbha zzc(java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzbha) this.zzh.get(str);
    }

    public final com.google.android.gms.internal.ads.zzbhd zzd(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return (com.google.android.gms.internal.ads.zzbhd) this.zzg.get(str);
    }

    public final com.google.android.gms.internal.ads.zzbhh zze() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.zzbhk zzf() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzbmi zzg() {
        return this.zzf;
    }

    public final java.util.ArrayList zzh() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zzg.size());
        for (int i = 0; i < this.zzg.size(); i++) {
            arrayList.add((java.lang.String) this.zzg.keyAt(i));
        }
        return arrayList;
    }

    public final java.util.ArrayList zzi() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.zzd != null) {
            arrayList.add(java.lang.Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(java.lang.Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(java.lang.Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(java.lang.Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(java.lang.Integer.toString(7));
        }
        return arrayList;
    }
}
