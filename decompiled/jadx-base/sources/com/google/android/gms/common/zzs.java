package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzs> CREATOR = new com.google.android.gms.common.zzt();
    private final java.lang.String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final android.content.Context zzd;
    private final boolean zze;
    private final boolean zzf;

    @javax.annotation.Nullable
    private final com.google.android.gms.common.zzr zzg;

    zzs(java.lang.String str, boolean z, boolean z2, android.os.IBinder iBinder, boolean z3, boolean z4, @javax.annotation.Nullable com.google.android.gms.common.zzr zzrVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder));
        this.zze = z3;
        this.zzf = z4;
        this.zzg = zzrVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 4, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzd), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
