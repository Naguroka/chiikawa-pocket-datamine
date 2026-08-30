package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbx extends com.google.android.gms.internal.play_billing.zzbq implements java.util.Set {
    private transient com.google.android.gms.internal.play_billing.zzbt zza;

    zzbx() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return com.google.android.gms.internal.play_billing.zzcg.zza(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public com.google.android.gms.internal.play_billing.zzbt zzd() {
        com.google.android.gms.internal.play_billing.zzbt zzbtVar = this.zza;
        if (zzbtVar != null) {
            return zzbtVar;
        }
        com.google.android.gms.internal.play_billing.zzbt zzbtVarZzh = zzh();
        this.zza = zzbtVarZzh;
        return zzbtVarZzh;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zze */
    public abstract com.google.android.gms.internal.play_billing.zzch iterator();

    com.google.android.gms.internal.play_billing.zzbt zzh() {
        java.lang.Object[] array = toArray();
        int i = com.google.android.gms.internal.play_billing.zzbt.zzd;
        return com.google.android.gms.internal.play_billing.zzbt.zzi(array, array.length);
    }
}
