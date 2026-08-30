package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzc extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.overlay.zzc> CREATOR = new com.google.android.gms.ads.internal.overlay.zzb();
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final java.lang.String zzd;
    public final java.lang.String zze;
    public final java.lang.String zzf;
    public final java.lang.String zzg;
    public final android.content.Intent zzh;
    public final com.google.android.gms.ads.internal.overlay.zzaa zzi;
    public final boolean zzj;

    public zzc(android.content.Intent intent, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar) {
        this(null, null, null, null, null, null, null, intent, com.google.android.gms.dynamic.ObjectWrapper.wrap(zzaaVar).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 10, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzi).asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzc(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, android.content.Intent intent, android.os.IBinder iBinder, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = intent;
        this.zzi = (com.google.android.gms.ads.internal.overlay.zzaa) com.google.android.gms.dynamic.ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder));
        this.zzj = z;
    }

    public zzc(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, com.google.android.gms.dynamic.ObjectWrapper.wrap(zzaaVar).asBinder(), false);
    }
}
