package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public class FilterHolder extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.FilterHolder> CREATOR = new com.google.android.gms.drive.query.internal.zzh();
    private final com.google.android.gms.drive.query.Filter zzbc;
    private final com.google.android.gms.drive.query.internal.zzb<?> zzmd;
    private final com.google.android.gms.drive.query.internal.zzd zzme;
    private final com.google.android.gms.drive.query.internal.zzr zzmf;
    private final com.google.android.gms.drive.query.internal.zzv zzmg;
    private final com.google.android.gms.drive.query.internal.zzp<?> zzmh;
    private final com.google.android.gms.drive.query.internal.zzt zzmi;
    private final com.google.android.gms.drive.query.internal.zzn zzmj;
    private final com.google.android.gms.drive.query.internal.zzl zzmk;
    private final com.google.android.gms.drive.query.internal.zzz zzml;

    FilterHolder(com.google.android.gms.drive.query.internal.zzb<?> zzbVar, com.google.android.gms.drive.query.internal.zzd zzdVar, com.google.android.gms.drive.query.internal.zzr zzrVar, com.google.android.gms.drive.query.internal.zzv zzvVar, com.google.android.gms.drive.query.internal.zzp<?> zzpVar, com.google.android.gms.drive.query.internal.zzt zztVar, com.google.android.gms.drive.query.internal.zzn<?> zznVar, com.google.android.gms.drive.query.internal.zzl zzlVar, com.google.android.gms.drive.query.internal.zzz zzzVar) {
        this.zzmd = zzbVar;
        this.zzme = zzdVar;
        this.zzmf = zzrVar;
        this.zzmg = zzvVar;
        this.zzmh = zzpVar;
        this.zzmi = zztVar;
        this.zzmj = zznVar;
        this.zzmk = zzlVar;
        this.zzml = zzzVar;
        if (zzbVar != null) {
            this.zzbc = zzbVar;
            return;
        }
        if (zzdVar != null) {
            this.zzbc = zzdVar;
            return;
        }
        if (zzrVar != null) {
            this.zzbc = zzrVar;
            return;
        }
        if (zzvVar != null) {
            this.zzbc = zzvVar;
            return;
        }
        if (zzpVar != null) {
            this.zzbc = zzpVar;
            return;
        }
        if (zztVar != null) {
            this.zzbc = zztVar;
            return;
        }
        if (zznVar != null) {
            this.zzbc = zznVar;
        } else if (zzlVar != null) {
            this.zzbc = zzlVar;
        } else {
            if (zzzVar == null) {
                throw new java.lang.IllegalArgumentException("At least one filter must be set.");
            }
            this.zzbc = zzzVar;
        }
    }

    public FilterHolder(com.google.android.gms.drive.query.Filter filter) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(filter, "Null filter.");
        com.google.android.gms.drive.query.internal.zzb<?> zzbVar = filter instanceof com.google.android.gms.drive.query.internal.zzb ? (com.google.android.gms.drive.query.internal.zzb) filter : null;
        this.zzmd = zzbVar;
        com.google.android.gms.drive.query.internal.zzd zzdVar = filter instanceof com.google.android.gms.drive.query.internal.zzd ? (com.google.android.gms.drive.query.internal.zzd) filter : null;
        this.zzme = zzdVar;
        com.google.android.gms.drive.query.internal.zzr zzrVar = filter instanceof com.google.android.gms.drive.query.internal.zzr ? (com.google.android.gms.drive.query.internal.zzr) filter : null;
        this.zzmf = zzrVar;
        com.google.android.gms.drive.query.internal.zzv zzvVar = filter instanceof com.google.android.gms.drive.query.internal.zzv ? (com.google.android.gms.drive.query.internal.zzv) filter : null;
        this.zzmg = zzvVar;
        com.google.android.gms.drive.query.internal.zzp<?> zzpVar = filter instanceof com.google.android.gms.drive.query.internal.zzp ? (com.google.android.gms.drive.query.internal.zzp) filter : null;
        this.zzmh = zzpVar;
        com.google.android.gms.drive.query.internal.zzt zztVar = filter instanceof com.google.android.gms.drive.query.internal.zzt ? (com.google.android.gms.drive.query.internal.zzt) filter : null;
        this.zzmi = zztVar;
        com.google.android.gms.drive.query.internal.zzn zznVar = filter instanceof com.google.android.gms.drive.query.internal.zzn ? (com.google.android.gms.drive.query.internal.zzn) filter : null;
        this.zzmj = zznVar;
        com.google.android.gms.drive.query.internal.zzl zzlVar = filter instanceof com.google.android.gms.drive.query.internal.zzl ? (com.google.android.gms.drive.query.internal.zzl) filter : null;
        this.zzmk = zzlVar;
        com.google.android.gms.drive.query.internal.zzz zzzVar = filter instanceof com.google.android.gms.drive.query.internal.zzz ? (com.google.android.gms.drive.query.internal.zzz) filter : null;
        this.zzml = zzzVar;
        if (zzbVar == null && zzdVar == null && zzrVar == null && zzvVar == null && zzpVar == null && zztVar == null && zznVar == null && zzlVar == null && zzzVar == null) {
            throw new java.lang.IllegalArgumentException("Invalid filter type.");
        }
        this.zzbc = filter;
    }

    public final com.google.android.gms.drive.query.Filter getFilter() {
        return this.zzbc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzmd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzme, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzmf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzmg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzmh, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzmi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzmj, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzmk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, this.zzml, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
