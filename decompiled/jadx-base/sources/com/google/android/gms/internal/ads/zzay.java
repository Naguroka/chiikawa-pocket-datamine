package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzay implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzay> CREATOR = new com.google.android.gms.internal.ads.zzaw();
    public final long zza;
    private final com.google.android.gms.internal.ads.zzax[] zzb;

    public zzay(long j, com.google.android.gms.internal.ads.zzax... zzaxVarArr) {
        this.zza = j;
        this.zzb = zzaxVarArr;
    }

    zzay(android.os.Parcel parcel) {
        this.zzb = new com.google.android.gms.internal.ads.zzax[parcel.readInt()];
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzax[] zzaxVarArr = this.zzb;
            if (i >= zzaxVarArr.length) {
                this.zza = parcel.readLong();
                return;
            } else {
                zzaxVarArr[i] = (com.google.android.gms.internal.ads.zzax) parcel.readParcelable(com.google.android.gms.internal.ads.zzax.class.getClassLoader());
                i++;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzay zzayVar = (com.google.android.gms.internal.ads.zzay) obj;
            if (java.util.Arrays.equals(this.zzb, zzayVar.zzb) && this.zza == zzayVar.zza) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = java.util.Arrays.hashCode(this.zzb) * 31;
        long j = this.zza;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.String str;
        long j = this.zza;
        java.lang.String string = java.util.Arrays.toString(this.zzb);
        if (j == androidx.media3.common.C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        return "entries=" + string + str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.zzb.length);
        for (com.google.android.gms.internal.ads.zzax zzaxVar : this.zzb) {
            parcel.writeParcelable(zzaxVar, 0);
        }
        parcel.writeLong(this.zza);
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final com.google.android.gms.internal.ads.zzax zzb(int i) {
        return this.zzb[i];
    }

    public final com.google.android.gms.internal.ads.zzay zzc(com.google.android.gms.internal.ads.zzax... zzaxVarArr) {
        int length = zzaxVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.zza;
        com.google.android.gms.internal.ads.zzax[] zzaxVarArr2 = this.zzb;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        int length2 = zzaxVarArr2.length;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(zzaxVarArr2, length2 + length);
        java.lang.System.arraycopy(zzaxVarArr, 0, objArrCopyOf, length2, length);
        return new com.google.android.gms.internal.ads.zzay(j, (com.google.android.gms.internal.ads.zzax[]) objArrCopyOf);
    }

    public final com.google.android.gms.internal.ads.zzay zzd(com.google.android.gms.internal.ads.zzay zzayVar) {
        return zzayVar == null ? this : zzc(zzayVar.zzb);
    }

    public zzay(java.util.List list) {
        this(androidx.media3.common.C.TIME_UNSET, (com.google.android.gms.internal.ads.zzax[]) list.toArray(new com.google.android.gms.internal.ads.zzax[0]));
    }
}
