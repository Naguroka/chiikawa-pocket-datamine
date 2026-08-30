package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzglr {

    @javax.annotation.Nullable
    private java.util.ArrayList zza = new java.util.ArrayList();
    private com.google.android.gms.internal.ads.zzglo zzb = com.google.android.gms.internal.ads.zzglo.zza;

    @javax.annotation.Nullable
    private java.lang.Integer zzc = null;

    public final com.google.android.gms.internal.ads.zzglr zza(com.google.android.gms.internal.ads.zzgdz zzgdzVar, int i, java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = this.zza;
        if (arrayList == null) {
            throw new java.lang.IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new com.google.android.gms.internal.ads.zzgls(zzgdzVar, i, str, str2, null));
        return this;
    }

    public final com.google.android.gms.internal.ads.zzglr zzb(com.google.android.gms.internal.ads.zzglo zzgloVar) {
        if (this.zza == null) {
            throw new java.lang.IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzgloVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzglr zzc(int i) {
        if (this.zza == null) {
            throw new java.lang.IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = java.lang.Integer.valueOf(i);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzglu zzd() throws java.security.GeneralSecurityException {
        if (this.zza == null) {
            throw new java.lang.IllegalStateException("cannot call build() twice");
        }
        java.lang.Integer num = this.zzc;
        if (num != null) {
            int iIntValue = num.intValue();
            java.util.ArrayList arrayList = this.zza;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int iZza = ((com.google.android.gms.internal.ads.zzgls) arrayList.get(i)).zza();
                i++;
                if (iZza == iIntValue) {
                }
            }
            throw new java.security.GeneralSecurityException("primary key ID is not present in entries");
        }
        com.google.android.gms.internal.ads.zzglu zzgluVar = new com.google.android.gms.internal.ads.zzglu(this.zzb, java.util.Collections.unmodifiableList(this.zza), this.zzc, null);
        this.zza = null;
        return zzgluVar;
    }
}
