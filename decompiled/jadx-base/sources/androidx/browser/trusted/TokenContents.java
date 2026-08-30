package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
final class TokenContents {
    private final byte[] mContents;
    private java.util.List<byte[]> mFingerprints;
    private java.lang.String mPackageName;

    static androidx.browser.trusted.TokenContents deserialize(byte[] bArr) {
        return new androidx.browser.trusted.TokenContents(bArr);
    }

    private TokenContents(byte[] bArr) {
        this.mContents = bArr;
    }

    static androidx.browser.trusted.TokenContents create(java.lang.String str, java.util.List<byte[]> list) throws java.io.IOException {
        return new androidx.browser.trusted.TokenContents(createToken(str, list), str, list);
    }

    private TokenContents(byte[] bArr, java.lang.String str, java.util.List<byte[]> list) {
        this.mContents = bArr;
        this.mPackageName = str;
        this.mFingerprints = new java.util.ArrayList(list.size());
        for (byte[] bArr2 : list) {
            this.mFingerprints.add(java.util.Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public java.lang.String getPackageName() throws java.io.IOException {
        parseIfNeeded();
        java.lang.String str = this.mPackageName;
        if (str != null) {
            return str;
        }
        throw new java.lang.IllegalStateException();
    }

    public int getFingerprintCount() throws java.io.IOException {
        parseIfNeeded();
        java.util.List<byte[]> list = this.mFingerprints;
        if (list == null) {
            throw new java.lang.IllegalStateException();
        }
        return list.size();
    }

    public byte[] getFingerprint(int i) throws java.io.IOException {
        parseIfNeeded();
        java.util.List<byte[]> list = this.mFingerprints;
        if (list == null) {
            throw new java.lang.IllegalStateException();
        }
        return java.util.Arrays.copyOf(list.get(i), this.mFingerprints.get(i).length);
    }

    public byte[] serialize() {
        byte[] bArr = this.mContents;
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.mContents, ((androidx.browser.trusted.TokenContents) obj).mContents);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.mContents);
    }

    private static byte[] createToken(java.lang.String str, java.util.List<byte[]> list) throws java.io.IOException {
        java.util.Collections.sort(list, new java.util.Comparator() { // from class: androidx.browser.trusted.TokenContents$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.browser.trusted.TokenContents.compareByteArrays((byte[]) obj, (byte[]) obj2);
            }
        });
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] bArr : list) {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int compareByteArrays(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        for (int i = 0; i < java.lang.Math.min(bArr.length, bArr2.length); i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return 0;
    }

    private void parseIfNeeded() throws java.io.IOException {
        if (this.mPackageName != null) {
            return;
        }
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream(this.mContents));
        this.mPackageName = dataInputStream.readUTF();
        int i = dataInputStream.readInt();
        this.mFingerprints = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = dataInputStream.readInt();
            byte[] bArr = new byte[i3];
            if (dataInputStream.read(bArr) != i3) {
                throw new java.lang.IllegalStateException("Could not read fingerprint");
            }
            this.mFingerprints.add(bArr);
        }
    }
}
