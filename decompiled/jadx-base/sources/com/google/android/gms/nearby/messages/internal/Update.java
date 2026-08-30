package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public class Update extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.internal.Update> CREATOR = new com.google.android.gms.nearby.messages.internal.zzch();
    final int zza;
    final int zzb;
    public final com.google.android.gms.nearby.messages.Message zzc;
    public final com.google.android.gms.nearby.messages.internal.zze zzd;
    public final com.google.android.gms.nearby.messages.internal.zza zze;
    public final com.google.android.gms.internal.nearby.zzhj zzf;
    public final byte[] zzg;

    Update(int i, int i2, com.google.android.gms.nearby.messages.Message message, com.google.android.gms.nearby.messages.internal.zze zzeVar, com.google.android.gms.nearby.messages.internal.zza zzaVar, com.google.android.gms.internal.nearby.zzhj zzhjVar, byte[] bArr) {
        this.zza = i;
        boolean zZzb = zzb(i2, 2);
        bArr = true == zZzb ? null : bArr;
        zzhjVar = true == zZzb ? null : zzhjVar;
        zzaVar = true == zZzb ? null : zzaVar;
        zzeVar = true == zZzb ? null : zzeVar;
        this.zzb = true == zZzb ? 2 : i2;
        this.zzc = message;
        this.zzd = zzeVar;
        this.zze = zzaVar;
        this.zzf = zzhjVar;
        this.zzg = bArr;
    }

    public static boolean zzb(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.nearby.messages.internal.Update)) {
            return false;
        }
        com.google.android.gms.nearby.messages.internal.Update update = (com.google.android.gms.nearby.messages.internal.Update) obj;
        return this.zzb == update.zzb && com.google.android.gms.common.internal.Objects.equal(this.zzc, update.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, update.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, update.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, update.zzf) && java.util.Arrays.equals(this.zzg, update.zzg);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public final java.lang.String toString() {
        androidx.collection.ArraySet arraySet = new androidx.collection.ArraySet();
        if (zzb(this.zzb, 1)) {
            arraySet.add("FOUND");
        }
        if (zzb(this.zzb, 2)) {
            arraySet.add("LOST");
        }
        if (zzb(this.zzb, 4)) {
            arraySet.add("DISTANCE");
        }
        if (zzb(this.zzb, 8)) {
            arraySet.add("BLE_SIGNAL");
        }
        if (zzb(this.zzb, 16)) {
            arraySet.add("DEVICE");
        }
        if (zzb(this.zzb, 32)) {
            arraySet.add("BLE_RECORD");
        }
        java.lang.String strValueOf = java.lang.String.valueOf(arraySet);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.zzc);
        java.lang.String strValueOf3 = java.lang.String.valueOf(this.zzd);
        java.lang.String strValueOf4 = java.lang.String.valueOf(this.zze);
        java.lang.String strValueOf5 = java.lang.String.valueOf(this.zzf);
        java.lang.String strValueOf6 = java.lang.String.valueOf(com.google.android.gms.internal.nearby.zzhi.zza(this.zzg));
        int length = java.lang.String.valueOf(strValueOf).length();
        int length2 = java.lang.String.valueOf(strValueOf2).length();
        int length3 = java.lang.String.valueOf(strValueOf3).length();
        int length4 = java.lang.String.valueOf(strValueOf4).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 68 + length2 + length3 + length4 + java.lang.String.valueOf(strValueOf5).length() + java.lang.String.valueOf(strValueOf6).length());
        sb.append("Update{types=");
        sb.append(strValueOf);
        sb.append(", message=");
        sb.append(strValueOf2);
        sb.append(", distance=");
        sb.append(strValueOf3);
        sb.append(", bleSignal=");
        sb.append(strValueOf4);
        sb.append(", device=");
        sb.append(strValueOf5);
        sb.append(", bleRecord=");
        sb.append(strValueOf6);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 7, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza(int i) {
        return zzb(this.zzb, i);
    }
}
