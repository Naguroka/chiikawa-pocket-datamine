package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzglu {
    private final com.google.android.gms.internal.ads.zzglo zza;
    private final java.util.List zzb;

    @javax.annotation.Nullable
    private final java.lang.Integer zzc;

    /* synthetic */ zzglu(com.google.android.gms.internal.ads.zzglo zzgloVar, java.util.List list, java.lang.Integer num, com.google.android.gms.internal.ads.zzglt zzgltVar) {
        this.zza = zzgloVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzglu)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzglu zzgluVar = (com.google.android.gms.internal.ads.zzglu) obj;
        return this.zza.equals(zzgluVar.zza) && this.zzb.equals(zzgluVar.zzb) && java.util.Objects.equals(this.zzc, zzgluVar.zzc);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.zza, this.zzb);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
