package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
public class TokenData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.TokenData> CREATOR = new com.google.android.gms.auth.zzk();
    private final java.util.List<java.lang.String> zzaa;
    private final java.lang.String zzab;
    private final int zzv;
    private final java.lang.String zzw;
    private final java.lang.Long zzx;
    private final boolean zzy;
    private final boolean zzz;

    public static com.google.android.gms.auth.TokenData zza(android.os.Bundle bundle, java.lang.String str) {
        bundle.setClassLoader(com.google.android.gms.auth.TokenData.class.getClassLoader());
        android.os.Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(com.google.android.gms.auth.TokenData.class.getClassLoader());
        return (com.google.android.gms.auth.TokenData) bundle2.getParcelable("TokenData");
    }

    TokenData(int i, java.lang.String str, java.lang.Long l, boolean z, boolean z2, java.util.List<java.lang.String> list, java.lang.String str2) {
        this.zzv = i;
        this.zzw = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zzx = l;
        this.zzy = z;
        this.zzz = z2;
        this.zzaa = list;
        this.zzab = str2;
    }

    public final java.lang.String zzb() {
        return this.zzw;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.TokenData)) {
            return false;
        }
        com.google.android.gms.auth.TokenData tokenData = (com.google.android.gms.auth.TokenData) obj;
        return android.text.TextUtils.equals(this.zzw, tokenData.zzw) && com.google.android.gms.common.internal.Objects.equal(this.zzx, tokenData.zzx) && this.zzy == tokenData.zzy && this.zzz == tokenData.zzz && com.google.android.gms.common.internal.Objects.equal(this.zzaa, tokenData.zzaa) && com.google.android.gms.common.internal.Objects.equal(this.zzab, tokenData.zzab);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzw, this.zzx, java.lang.Boolean.valueOf(this.zzy), java.lang.Boolean.valueOf(this.zzz), this.zzaa, this.zzab);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzw, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 3, this.zzx, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zzz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 6, this.zzaa, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzab, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
