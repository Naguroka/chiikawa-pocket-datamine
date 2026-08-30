package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzu implements java.util.Comparator<com.google.android.gms.internal.ads.zzt>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzu> CREATOR = new com.google.android.gms.internal.ads.zzr();
    public final java.lang.String zza;
    public final int zzb;
    private final com.google.android.gms.internal.ads.zzt[] zzc;
    private int zzd;

    zzu(android.os.Parcel parcel) {
        this.zza = parcel.readString();
        com.google.android.gms.internal.ads.zzt[] zztVarArr = (com.google.android.gms.internal.ads.zzt[]) parcel.createTypedArray(com.google.android.gms.internal.ads.zzt.CREATOR);
        int i = com.google.android.gms.internal.ads.zzei.zza;
        com.google.android.gms.internal.ads.zzt[] zztVarArr2 = zztVarArr;
        this.zzc = zztVarArr2;
        this.zzb = zztVarArr2.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(com.google.android.gms.internal.ads.zzt zztVar, com.google.android.gms.internal.ads.zzt zztVar2) {
        com.google.android.gms.internal.ads.zzt zztVar3 = zztVar;
        com.google.android.gms.internal.ads.zzt zztVar4 = zztVar2;
        if (com.google.android.gms.internal.ads.zzh.zza.equals(zztVar3.zza)) {
            return !com.google.android.gms.internal.ads.zzh.zza.equals(zztVar4.zza) ? 1 : 0;
        }
        return zztVar3.zza.compareTo(zztVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzu zzuVar = (com.google.android.gms.internal.ads.zzu) obj;
            if (java.util.Objects.equals(this.zza, zzuVar.zza) && java.util.Arrays.equals(this.zzc, zzuVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final com.google.android.gms.internal.ads.zzt zza(int i) {
        return this.zzc[i];
    }

    public final com.google.android.gms.internal.ads.zzu zzb(java.lang.String str) {
        return java.util.Objects.equals(this.zza, str) ? this : new com.google.android.gms.internal.ads.zzu(str, false, this.zzc);
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        java.lang.String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + java.util.Arrays.hashCode(this.zzc);
        this.zzd = iHashCode;
        return iHashCode;
    }

    private zzu(java.lang.String str, boolean z, com.google.android.gms.internal.ads.zzt... zztVarArr) {
        this.zza = str;
        zztVarArr = z ? (com.google.android.gms.internal.ads.zzt[]) zztVarArr.clone() : zztVarArr;
        this.zzc = zztVarArr;
        this.zzb = zztVarArr.length;
        java.util.Arrays.sort(zztVarArr, this);
    }

    public zzu(java.lang.String str, com.google.android.gms.internal.ads.zzt... zztVarArr) {
        this(null, true, zztVarArr);
    }

    public zzu(java.util.List list) {
        this(null, false, (com.google.android.gms.internal.ads.zzt[]) list.toArray(new com.google.android.gms.internal.ads.zzt[0]));
    }
}
