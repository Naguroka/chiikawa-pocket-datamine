package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzko<MessageType extends com.google.android.gms.internal.measurement.zzko<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.measurement.zzkn<MessageType, BuilderType>> implements com.google.android.gms.internal.measurement.zznh {
    protected int zza = 0;

    protected static void zzcc(java.lang.Iterable iterable, java.util.List list) {
        com.google.android.gms.internal.measurement.zzkn.zzaW(iterable, list);
    }

    int zzca(com.google.android.gms.internal.measurement.zzns zznsVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zznh
    public final com.google.android.gms.internal.measurement.zzld zzcb() {
        try {
            int iZzcf = zzcf();
            com.google.android.gms.internal.measurement.zzld zzldVar = com.google.android.gms.internal.measurement.zzld.zzb;
            byte[] bArr = new byte[iZzcf];
            int i = com.google.android.gms.internal.measurement.zzlk.zzb;
            com.google.android.gms.internal.measurement.zzlh zzlhVar = new com.google.android.gms.internal.measurement.zzlh(bArr, 0, iZzcf);
            zzcB(zzlhVar);
            zzlhVar.zzB();
            return new com.google.android.gms.internal.measurement.zzlb(bArr);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final byte[] zzcd() {
        try {
            int iZzcf = zzcf();
            byte[] bArr = new byte[iZzcf];
            int i = com.google.android.gms.internal.measurement.zzlk.zzb;
            com.google.android.gms.internal.measurement.zzlh zzlhVar = new com.google.android.gms.internal.measurement.zzlh(bArr, 0, iZzcf);
            zzcB(zzlhVar);
            zzlhVar.zzB();
            return bArr;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
