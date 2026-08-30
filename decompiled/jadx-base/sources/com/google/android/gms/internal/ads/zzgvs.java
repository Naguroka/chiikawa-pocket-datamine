package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgvs<MessageType extends com.google.android.gms.internal.ads.zzgvs<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.ads.zzgvr<MessageType, BuilderType>> implements com.google.android.gms.internal.ads.zzgzc {
    protected int zzq = 0;

    protected static <T> void zzaQ(java.lang.Iterable<T> iterable, java.util.List<? super T> list) {
        com.google.android.gms.internal.ads.zzgvr.zzbd(iterable, list);
    }

    protected static void zzaR(com.google.android.gms.internal.ads.zzgwj zzgwjVar) throws java.lang.IllegalArgumentException {
        if (!zzgwjVar.zzp()) {
            throw new java.lang.IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private java.lang.String zzdF(java.lang.String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    int zzaL() {
        throw new java.lang.UnsupportedOperationException();
    }

    int zzaM(com.google.android.gms.internal.ads.zzgzv zzgzvVar) {
        return zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzgzc
    public com.google.android.gms.internal.ads.zzgwj zzaN() {
        try {
            int iZzaY = zzaY();
            com.google.android.gms.internal.ads.zzgwj zzgwjVar = com.google.android.gms.internal.ads.zzgwj.zzb;
            byte[] bArr = new byte[iZzaY];
            com.google.android.gms.internal.ads.zzgws zzgwsVar = new com.google.android.gms.internal.ads.zzgws(bArr, 0, iZzaY);
            zzcY(zzgwsVar);
            zzgwsVar.zzF();
            return new com.google.android.gms.internal.ads.zzgwg(bArr);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(zzdF("ByteString"), e);
        }
    }

    public com.google.android.gms.internal.ads.zzgzh zzaO() {
        throw new java.lang.UnsupportedOperationException("mutableCopy() is not implemented.");
    }

    com.google.android.gms.internal.ads.zzhag zzaP() {
        return new com.google.android.gms.internal.ads.zzhag(this);
    }

    void zzaS(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void zzaT(java.io.OutputStream outputStream) throws java.io.IOException {
        int iZzaY = zzaY();
        com.google.android.gms.internal.ads.zzgwu zzgwuVar = new com.google.android.gms.internal.ads.zzgwu(outputStream, com.google.android.gms.internal.ads.zzgww.zzB(com.google.android.gms.internal.ads.zzgww.zzD(iZzaY) + iZzaY));
        zzgwuVar.zzu(iZzaY);
        zzcY(zzgwuVar);
        zzgwuVar.zzK();
    }

    public void zzaU(java.io.OutputStream outputStream) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzgwu zzgwuVar = new com.google.android.gms.internal.ads.zzgwu(outputStream, com.google.android.gms.internal.ads.zzgww.zzB(zzaY()));
        zzcY(zzgwuVar);
        zzgwuVar.zzK();
    }

    public byte[] zzaV() {
        try {
            int iZzaY = zzaY();
            byte[] bArr = new byte[iZzaY];
            com.google.android.gms.internal.ads.zzgws zzgwsVar = new com.google.android.gms.internal.ads.zzgws(bArr, 0, iZzaY);
            zzcY(zzgwsVar);
            zzgwsVar.zzF();
            return bArr;
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(zzdF("byte array"), e);
        }
    }
}
