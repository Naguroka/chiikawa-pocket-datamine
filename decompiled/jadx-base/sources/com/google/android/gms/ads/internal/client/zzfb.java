package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zzfb> CREATOR = new com.google.android.gms.ads.internal.client.zzfc();
    private final int zza;
    private final int zzb;
    private final java.lang.String zzc;

    public zzfb() {
        this(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, 244410000, "23.6.0");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public final java.lang.String zzb() {
        return this.zzc;
    }

    public zzfb(int i, int i2, java.lang.String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }
}
