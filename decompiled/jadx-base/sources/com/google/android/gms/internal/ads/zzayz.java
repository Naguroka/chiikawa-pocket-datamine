package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzayz {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final com.google.android.gms.internal.ads.zzazo zze;
    private final com.google.android.gms.internal.ads.zzazw zzf;
    private int zzn;
    private final java.lang.Object zzg = new java.lang.Object();
    private final java.util.ArrayList zzh = new java.util.ArrayList();
    private final java.util.ArrayList zzi = new java.util.ArrayList();
    private final java.util.ArrayList zzj = new java.util.ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private java.lang.String zzo = "";
    private java.lang.String zzp = "";
    private java.lang.String zzq = "";

    public zzayz(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = z;
        this.zze = new com.google.android.gms.internal.ads.zzazo(i4);
        this.zzf = new com.google.android.gms.internal.ads.zzazw(i5, i6, i7);
    }

    private final void zzm(java.lang.String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null) {
            if (str.length() < this.zzc) {
                return;
            }
            synchronized (this.zzg) {
                this.zzh.add(str);
                this.zzk += str.length();
                if (z) {
                    this.zzi.add(str);
                    this.zzj.add(new com.google.android.gms.internal.ads.zzazk(f, f2, f3, f4, this.zzi.size() - 1));
                }
            }
        }
    }

    private static final java.lang.String zzn(java.util.ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append((java.lang.String) arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        java.lang.String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzayz)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        java.lang.String str = ((com.google.android.gms.internal.ads.zzayz) obj).zzo;
        return str != null && str.equals(this.zzo);
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = this.zzh;
        return "ActivityContent fetchId: " + this.zzl + " score:" + this.zzn + " total_length:" + this.zzk + "\n text: " + zzn(arrayList, 100) + "\n viewableText" + zzn(this.zzi, 100) + "\n signture: " + this.zzo + "\n viewableSignture: " + this.zzp + "\n viewableSignatureForVertical: " + this.zzq;
    }

    final int zza(int i, int i2) {
        return this.zzd ? this.zzb : (i * this.zza) + (i2 * this.zzb);
    }

    final int zzb() {
        return this.zzk;
    }

    public final java.lang.String zzc() {
        return this.zzo;
    }

    public final java.lang.String zzd() {
        return this.zzq;
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzf() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzg(int i) {
        this.zzl = i;
    }

    public final void zzh(java.lang.String str, boolean z, float f, float f2, float f3, float f4) {
        zzm(str, z, f, f2, f3, f4);
    }

    public final void zzi(java.lang.String str, boolean z, float f, float f2, float f3, float f4) {
        zzm(str, z, f, f2, f3, f4);
        synchronized (this.zzg) {
            if (this.zzm < 0) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("ActivityContent: negative number of WebViews.");
            }
            zzj();
        }
    }

    public final void zzj() {
        synchronized (this.zzg) {
            int iZza = zza(this.zzk, this.zzl);
            if (iZza > this.zzn) {
                this.zzn = iZza;
                if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzK()) {
                    this.zzo = this.zze.zza(this.zzh);
                    this.zzp = this.zze.zza(this.zzi);
                }
                if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzL()) {
                    this.zzq = this.zzf.zza(this.zzi, this.zzj);
                }
            }
        }
    }

    public final void zzk() {
        synchronized (this.zzg) {
            int iZza = zza(this.zzk, this.zzl);
            if (iZza > this.zzn) {
                this.zzn = iZza;
            }
        }
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.zzg) {
            z = this.zzm == 0;
        }
        return z;
    }
}
