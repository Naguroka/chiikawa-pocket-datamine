package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgj extends com.google.android.gms.internal.ads.zzfxd {
    private final java.util.Map zza;

    public zzgj(java.util.Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final java.util.Set entrySet() {
        return com.google.android.gms.internal.ads.zzfzp.zzc(this.zza.entrySet(), new com.google.android.gms.internal.ads.zzfuo() { // from class: com.google.android.gms.internal.ads.zzgh
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final boolean zza(java.lang.Object obj) {
                return ((java.util.Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return obj != null && super.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return (java.util.List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final int hashCode() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final java.util.Set keySet() {
        return com.google.android.gms.internal.ads.zzfzp.zzc(this.zza.keySet(), new com.google.android.gms.internal.ads.zzfuo() { // from class: com.google.android.gms.internal.ads.zzgi
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final boolean zza(java.lang.Object obj) {
                return ((java.lang.String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, com.google.android.gms.internal.ads.zzfxe
    protected final /* synthetic */ java.lang.Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxd
    protected final java.util.Map zzb() {
        return this.zza;
    }
}
