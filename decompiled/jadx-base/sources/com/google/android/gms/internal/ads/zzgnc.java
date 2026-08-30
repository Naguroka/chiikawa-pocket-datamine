package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgnc {
    private final java.lang.Class zza;
    private com.google.android.gms.internal.ads.zzgnd zzd;
    private java.util.Map zzb = new java.util.HashMap();
    private final java.util.List zzc = new java.util.ArrayList();
    private com.google.android.gms.internal.ads.zzglo zze = com.google.android.gms.internal.ads.zzglo.zza;

    /* synthetic */ zzgnc(java.lang.Class cls, com.google.android.gms.internal.ads.zzgne zzgneVar) {
        this.zza = cls;
    }

    private final com.google.android.gms.internal.ads.zzgnc zze(java.lang.Object obj, com.google.android.gms.internal.ads.zzgdx zzgdxVar, com.google.android.gms.internal.ads.zzgsv zzgsvVar, boolean z) throws java.security.GeneralSecurityException {
        byte[] bArrZzc;
        if (this.zzb == null) {
            throw new java.lang.IllegalStateException("addEntry cannot be called after build");
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("`fullPrimitive` must not be null");
        }
        if (zzgsvVar.zzk() != 3) {
            throw new java.security.GeneralSecurityException("only ENABLED key is allowed");
        }
        int iOrdinal = zzgsvVar.zzf().ordinal();
        if (iOrdinal == 1) {
            bArrZzc = com.google.android.gms.internal.ads.zzgml.zzb(zzgsvVar.zza()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = com.google.android.gms.internal.ads.zzgml.zza(zzgsvVar.zza()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new java.security.GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = com.google.android.gms.internal.ads.zzgml.zza(zzgsvVar.zza()).zzc();
        } else {
            bArrZzc = com.google.android.gms.internal.ads.zzgds.zza;
        }
        com.google.android.gms.internal.ads.zzgnd zzgndVar = new com.google.android.gms.internal.ads.zzgnd(obj, com.google.android.gms.internal.ads.zzgvo.zzb(bArrZzc), zzgsvVar.zzk(), zzgsvVar.zzf(), zzgsvVar.zza(), zzgsvVar.zzb().zzg(), zzgdxVar, null);
        java.util.Map map = this.zzb;
        java.util.List list = this.zzc;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(zzgndVar);
        java.util.List list2 = (java.util.List) map.put(zzgndVar.zzb, java.util.Collections.unmodifiableList(arrayList));
        if (list2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(zzgndVar);
            map.put(zzgndVar.zzb, java.util.Collections.unmodifiableList(arrayList2));
        }
        list.add(zzgndVar);
        if (z) {
            if (this.zzd != null) {
                throw new java.lang.IllegalStateException("you cannot set two primary primitives");
            }
            this.zzd = zzgndVar;
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgnc zza(java.lang.Object obj, com.google.android.gms.internal.ads.zzgdx zzgdxVar, com.google.android.gms.internal.ads.zzgsv zzgsvVar) throws java.security.GeneralSecurityException {
        zze(obj, zzgdxVar, zzgsvVar, false);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgnc zzb(java.lang.Object obj, com.google.android.gms.internal.ads.zzgdx zzgdxVar, com.google.android.gms.internal.ads.zzgsv zzgsvVar) throws java.security.GeneralSecurityException {
        zze(obj, zzgdxVar, zzgsvVar, true);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgnc zzc(com.google.android.gms.internal.ads.zzglo zzgloVar) {
        if (this.zzb == null) {
            throw new java.lang.IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzgloVar;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgnf zzd() throws java.security.GeneralSecurityException {
        java.util.Map map = this.zzb;
        if (map == null) {
            throw new java.lang.IllegalStateException("build cannot be called twice");
        }
        com.google.android.gms.internal.ads.zzgnf zzgnfVar = new com.google.android.gms.internal.ads.zzgnf(map, this.zzc, this.zzd, this.zze, this.zza, null);
        this.zzb = null;
        return zzgnfVar;
    }
}
