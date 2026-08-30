package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzw extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzw> CREATOR = new com.google.android.gms.common.zzx();
    private final java.lang.String zza;

    @javax.annotation.Nullable
    private final com.google.android.gms.common.zzm zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzw(java.lang.String str, @javax.annotation.Nullable android.os.IBinder iBinder, boolean z, boolean z2) {
        this.zza = str;
        com.google.android.gms.common.zzn zznVar = null;
        if (iBinder != null) {
            try {
                com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzd = com.google.android.gms.common.internal.zzy.zzg(iBinder).zzd();
                byte[] bArr = iObjectWrapperZzd == null ? null : (byte[]) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzd);
                if (bArr != null) {
                    zznVar = new com.google.android.gms.common.zzn(bArr);
                } else {
                    android.util.Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (android.os.RemoteException e) {
                android.util.Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.zzb = zznVar;
        this.zzc = z;
        this.zzd = z2;
    }

    zzw(java.lang.String str, @javax.annotation.Nullable com.google.android.gms.common.zzm zzmVar, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zzmVar;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.zzm zzmVar = this.zzb;
        if (zzmVar == null) {
            android.util.Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzmVar = null;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzmVar, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
