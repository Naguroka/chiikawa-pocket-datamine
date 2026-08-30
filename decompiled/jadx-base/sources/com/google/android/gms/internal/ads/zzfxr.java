package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfxr extends com.google.android.gms.internal.ads.zzfxg {

    @javax.annotation.CheckForNull
    java.lang.Object[] zzd;
    private int zze;

    public zzfxr() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfxg, com.google.android.gms.internal.ads.zzfxh
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzfxh zzb(java.lang.Object obj) {
        zzf(obj);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfxr zzg(java.lang.Object... objArr) {
        if (this.zzd != null) {
            for (int i = 0; i < 2; i++) {
                zzf(objArr[i]);
            }
        } else {
            zzd(objArr, 2);
        }
        return this;
    }

    zzfxr(int i, boolean z) {
        super(i);
        this.zzd = new java.lang.Object[com.google.android.gms.internal.ads.zzfxs.zzh(i)];
    }

    public final com.google.android.gms.internal.ads.zzfxr zzh(java.lang.Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzfxs zzi() {
        com.google.android.gms.internal.ads.zzfxs zzfxsVarZzv;
        int i = this.zzb;
        if (i == 0) {
            return com.google.android.gms.internal.ads.zzfzf.zza;
        }
        if (i == 1) {
            return new com.google.android.gms.internal.ads.zzfzq(java.util.Objects.requireNonNull(this.zza[0]));
        }
        if (this.zzd == null || com.google.android.gms.internal.ads.zzfxs.zzh(i) != this.zzd.length) {
            zzfxsVarZzv = com.google.android.gms.internal.ads.zzfxs.zzv(this.zzb, this.zza);
            this.zzb = zzfxsVarZzv.size();
        } else {
            int i2 = this.zzb;
            java.lang.Object[] objArrCopyOf = this.zza;
            if (com.google.android.gms.internal.ads.zzfxs.zzw(i2, objArrCopyOf.length)) {
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i2);
            }
            int i3 = this.zze;
            java.lang.Object[] objArr = this.zzd;
            zzfxsVarZzv = new com.google.android.gms.internal.ads.zzfzf(objArrCopyOf, i3, objArr, objArr.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzfxsVarZzv;
    }

    public final com.google.android.gms.internal.ads.zzfxr zzf(java.lang.Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzh = com.google.android.gms.internal.ads.zzfxs.zzh(this.zzb);
            java.lang.Object[] objArr = this.zzd;
            if (iZzh <= objArr.length) {
                java.util.Objects.requireNonNull(objArr);
                int length = this.zzd.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = com.google.android.gms.internal.ads.zzfxf.zza(iHashCode);
                while (true) {
                    int i = iZza & length;
                    java.lang.Object[] objArr2 = this.zzd;
                    java.lang.Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iZza = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zze += iHashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
