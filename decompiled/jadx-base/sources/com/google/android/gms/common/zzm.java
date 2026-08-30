package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzm extends com.google.android.gms.common.internal.zzy {
    private final int zza;

    protected zzm(byte[] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(bArr.length == 25);
        this.zza = java.util.Arrays.hashCode(bArr);
    }

    protected static byte[] zze(java.lang.String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzd;
        if (obj != null && (obj instanceof com.google.android.gms.common.internal.zzz)) {
            try {
                com.google.android.gms.common.internal.zzz zzzVar = (com.google.android.gms.common.internal.zzz) obj;
                if (zzzVar.zzc() == this.zza && (iObjectWrapperZzd = zzzVar.zzd()) != null) {
                    return java.util.Arrays.equals(zzf(), (byte[]) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzd));
                }
                return false;
            } catch (android.os.RemoteException e) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final int zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.zzz
    public final com.google.android.gms.dynamic.IObjectWrapper zzd() {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(zzf());
    }

    abstract byte[] zzf();
}
