package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgf {
    private static java.io.File zza;

    static com.google.android.gms.nearby.connection.Payload zza(android.content.Context context, com.google.android.gms.internal.nearby.zzgd zzgdVar) {
        long jZza = zzgdVar.zza();
        int iZzb = zzgdVar.zzb();
        if (iZzb == 1) {
            com.google.android.gms.internal.nearby.zzfz zzfzVarZzi = zzgdVar.zzi();
            return com.google.android.gms.nearby.connection.Payload.zza((byte[]) com.google.android.gms.internal.nearby.zzhz.zza(zzfzVarZzi != null ? zzfzVarZzi.zza() : zzgdVar.zzc(), "Payload bytes cannot be null if type is BYTES."), jZza);
        }
        if (iZzb != 2) {
            if (iZzb != 3) {
                android.util.Log.w("NearbyConnections", java.lang.String.format("Incoming ParcelablePayload %d has unknown type %d", java.lang.Long.valueOf(zzgdVar.zza()), java.lang.Integer.valueOf(zzgdVar.zzb())));
                return null;
            }
            android.os.ParcelFileDescriptor parcelFileDescriptorZzd = zzgdVar.zzd();
            com.google.android.gms.internal.nearby.zzhz.zza(parcelFileDescriptorZzd, "Data ParcelFileDescriptor cannot be null for type STREAM");
            return com.google.android.gms.nearby.connection.Payload.zzc(com.google.android.gms.nearby.connection.Payload.Stream.zzb(parcelFileDescriptorZzd), jZza);
        }
        java.lang.String strZze = zzgdVar.zze();
        android.net.Uri uriZzh = zzgdVar.zzh();
        if (strZze == null || uriZzh == null) {
            android.os.ParcelFileDescriptor parcelFileDescriptorZzd2 = zzgdVar.zzd();
            com.google.android.gms.internal.nearby.zzhz.zza(parcelFileDescriptorZzd2, "Data ParcelFileDescriptor cannot be null for type FILE");
            return com.google.android.gms.nearby.connection.Payload.zzb(com.google.android.gms.nearby.connection.Payload.File.zzb(parcelFileDescriptorZzd2), jZza);
        }
        try {
            android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uriZzh, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                return com.google.android.gms.nearby.connection.Payload.zzb(com.google.android.gms.nearby.connection.Payload.File.zza(new java.io.File(strZze), parcelFileDescriptorOpenFileDescriptor, zzgdVar.zzf(), uriZzh), jZza);
            }
            android.util.Log.w("NearbyConnections", java.lang.String.format("Failed to get ParcelFileDescriptor for %s", uriZzh));
            return null;
        } catch (java.io.FileNotFoundException e) {
            android.util.Log.w("NearbyConnections", java.lang.String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uriZzh, strZze), e);
            return null;
        }
    }

    public static void zzb(java.io.File file) {
        if (file == null) {
            android.util.Log.e("NearbyConnections", "Cannot set null temp directory");
        } else {
            zza = file;
        }
    }

    static java.io.File zzc() {
        return zza;
    }
}
