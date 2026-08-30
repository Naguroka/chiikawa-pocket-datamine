package com.google.firebase.installations;

/* JADX INFO: loaded from: classes5.dex */
public class RandomFidGenerator {
    private static final int FID_LENGTH = 22;
    private static final byte FID_4BIT_PREFIX = java.lang.Byte.parseByte("01110000", 2);
    private static final byte REMOVE_PREFIX_MASK = java.lang.Byte.parseByte("00001111", 2);

    public java.lang.String createRandomFid() {
        byte[] bytesFromUUID = getBytesFromUUID(java.util.UUID.randomUUID(), new byte[17]);
        byte b = bytesFromUUID[0];
        bytesFromUUID[16] = b;
        bytesFromUUID[0] = (byte) ((b & REMOVE_PREFIX_MASK) | FID_4BIT_PREFIX);
        return encodeFidBase64UrlSafe(bytesFromUUID);
    }

    private static java.lang.String encodeFidBase64UrlSafe(byte[] bArr) {
        return new java.lang.String(android.util.Base64.encode(bArr, 11), java.nio.charset.Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] getBytesFromUUID(java.util.UUID uuid, byte[] bArr) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }
}
