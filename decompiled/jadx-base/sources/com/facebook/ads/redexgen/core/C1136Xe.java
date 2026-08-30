package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1136Xe extends com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer {
    public C1136Xe(java.lang.String str, int i) {
        super(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C1135Xd A01(int i, java.io.DataInputStream dataInputStream) throws java.io.IOException {
        android.net.Uri uri = android.net.Uri.parse(dataInputStream.readUTF());
        boolean z = dataInputStream.readBoolean();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        return new com.facebook.ads.redexgen.core.C1135Xd(uri, z, bArr, dataInputStream.readBoolean() ? dataInputStream.readUTF() : null);
    }
}
