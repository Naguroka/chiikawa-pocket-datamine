package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzit<MessageType extends com.google.android.gms.internal.drive.zzit<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.drive.zziu<MessageType, BuilderType>> implements com.google.android.gms.internal.drive.zzlq {
    private static boolean zznf = false;
    protected int zzne = 0;

    @Override // com.google.android.gms.internal.drive.zzlq
    public final com.google.android.gms.internal.drive.zzjc zzbl() {
        try {
            com.google.android.gms.internal.drive.zzjk zzjkVarZzu = com.google.android.gms.internal.drive.zzjc.zzu(zzcx());
            zzb(zzjkVarZzu.zzby());
            return zzjkVarZzu.zzbx();
        } catch (java.io.IOException e) {
            java.lang.String name = getClass().getName();
            throw new java.lang.RuntimeException(new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 62 + "ByteString".length()).append("Serializing ").append(name).append(" to a ByteString threw an IOException (should never happen).").toString(), e);
        }
    }

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzcx()];
            com.google.android.gms.internal.drive.zzjr zzjrVarZzb = com.google.android.gms.internal.drive.zzjr.zzb(bArr);
            zzb(zzjrVarZzb);
            zzjrVarZzb.zzcb();
            return bArr;
        } catch (java.io.IOException e) {
            java.lang.String name = getClass().getName();
            throw new java.lang.RuntimeException(new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 62 + "byte array".length()).append("Serializing ").append(name).append(" to a byte array threw an IOException (should never happen).").toString(), e);
        }
    }

    int zzbm() {
        throw new java.lang.UnsupportedOperationException();
    }

    void zzo(int i) {
        throw new java.lang.UnsupportedOperationException();
    }
}
