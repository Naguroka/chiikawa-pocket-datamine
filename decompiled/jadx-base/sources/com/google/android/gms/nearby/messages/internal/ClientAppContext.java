package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ClientAppContext extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.nearby.messages.internal.ClientAppContext> CREATOR = new com.google.android.gms.nearby.messages.internal.zzd();
    final int zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final boolean zzd;

    @java.lang.Deprecated
    public final int zze;
    public final java.lang.String zzf;

    ClientAppContext(int i, java.lang.String str, java.lang.String str2, boolean z, int i2, java.lang.String str3) {
        this.zza = i;
        this.zzb = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            android.util.Log.w("NearbyMessages", java.lang.String.format(java.util.Locale.US, "ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", str2, "0p:"));
            str2 = str2.length() != 0 ? "0p:".concat(str2) : new java.lang.String("0p:");
        }
        this.zzc = str2;
        this.zzd = z;
        this.zze = i2;
        this.zzf = str3;
    }

    static final com.google.android.gms.nearby.messages.internal.ClientAppContext zza(com.google.android.gms.nearby.messages.internal.ClientAppContext clientAppContext, java.lang.String str, java.lang.String str2, boolean z) {
        if (clientAppContext != null) {
            return clientAppContext;
        }
        if (str == null && str2 == null) {
            return null;
        }
        return new com.google.android.gms.nearby.messages.internal.ClientAppContext(1, str, str2, z, 0, null);
    }

    private static boolean zzb(java.lang.String str, java.lang.String str2) {
        return android.text.TextUtils.isEmpty(str) ? android.text.TextUtils.isEmpty(str2) : str.equals(str2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.nearby.messages.internal.ClientAppContext)) {
            return false;
        }
        com.google.android.gms.nearby.messages.internal.ClientAppContext clientAppContext = (com.google.android.gms.nearby.messages.internal.ClientAppContext) obj;
        return zzb(this.zzb, clientAppContext.zzb) && zzb(this.zzc, clientAppContext.zzc) && this.zzd == clientAppContext.zzd && zzb(this.zzf, clientAppContext.zzf) && this.zze == clientAppContext.zze;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, this.zzc, java.lang.Boolean.valueOf(this.zzd), this.zzf, java.lang.Integer.valueOf(this.zze));
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", this.zzb, this.zzc, java.lang.Boolean.valueOf(this.zzd), this.zzf, java.lang.Integer.valueOf(this.zze));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
