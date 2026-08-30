package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class Scope extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> CREATOR = new com.google.android.gms.common.api.zzd();
    final int zza;
    private final java.lang.String zzb;

    Scope(int i, java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "scopeUri must not be null or empty");
        this.zza = i;
        this.zzb = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.common.api.Scope) {
            return this.zzb.equals(((com.google.android.gms.common.api.Scope) obj).zzb);
        }
        return false;
    }

    public java.lang.String getScopeUri() {
        return this.zzb;
    }

    public int hashCode() {
        return this.zzb.hashCode();
    }

    public java.lang.String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getScopeUri(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public Scope(java.lang.String str) {
        this(1, str);
    }
}
