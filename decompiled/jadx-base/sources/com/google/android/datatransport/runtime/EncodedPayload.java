package com.google.android.datatransport.runtime;

/* JADX INFO: loaded from: classes4.dex */
public final class EncodedPayload {
    private final byte[] bytes;
    private final com.google.android.datatransport.Encoding encoding;

    public EncodedPayload(com.google.android.datatransport.Encoding encoding, byte[] bArr) {
        if (encoding == null) {
            throw new java.lang.NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new java.lang.NullPointerException("bytes is null");
        }
        this.encoding = encoding;
        this.bytes = bArr;
    }

    public com.google.android.datatransport.Encoding getEncoding() {
        return this.encoding;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.EncodedPayload)) {
            return false;
        }
        com.google.android.datatransport.runtime.EncodedPayload encodedPayload = (com.google.android.datatransport.runtime.EncodedPayload) obj;
        if (this.encoding.equals(encodedPayload.encoding)) {
            return java.util.Arrays.equals(this.bytes, encodedPayload.bytes);
        }
        return false;
    }

    public int hashCode() {
        return ((this.encoding.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.bytes);
    }

    public java.lang.String toString() {
        return "EncodedPayload{encoding=" + this.encoding + ", bytes=[...]}";
    }
}
