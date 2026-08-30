package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzah extends com.google.android.gms.internal.common.zzae {
    public zzah() {
        super(4);
    }

    public final com.google.android.gms.internal.common.zzah zzb(java.lang.Object obj) {
        super.zza(obj);
        return this;
    }

    public final com.google.android.gms.internal.common.zzah zzc(java.util.Iterator it) {
        while (it.hasNext()) {
            super.zza(it.next());
        }
        return this;
    }

    public final com.google.android.gms.internal.common.zzal zzd() {
        this.zzc = true;
        return com.google.android.gms.internal.common.zzal.zzj(this.zza, this.zzb);
    }

    zzah(int i) {
        super(4);
    }
}
