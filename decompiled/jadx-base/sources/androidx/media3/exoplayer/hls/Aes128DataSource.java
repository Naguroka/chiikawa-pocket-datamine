package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
class Aes128DataSource implements androidx.media3.datasource.DataSource {
    private javax.crypto.CipherInputStream cipherInputStream;
    private final byte[] encryptionIv;
    private final byte[] encryptionKey;
    private final androidx.media3.datasource.DataSource upstream;

    public Aes128DataSource(androidx.media3.datasource.DataSource dataSource, byte[] bArr, byte[] bArr2) {
        this.upstream = dataSource;
        this.encryptionKey = bArr;
        this.encryptionIv = bArr2;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        androidx.media3.common.util.Assertions.checkNotNull(transferListener);
        this.upstream.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public final long open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        try {
            javax.crypto.Cipher cipherInstance = getCipherInstance();
            try {
                cipherInstance.init(2, new javax.crypto.spec.SecretKeySpec(this.encryptionKey, "AES"), new javax.crypto.spec.IvParameterSpec(this.encryptionIv));
                androidx.media3.datasource.DataSourceInputStream dataSourceInputStream = new androidx.media3.datasource.DataSourceInputStream(this.upstream, dataSpec);
                this.cipherInputStream = new javax.crypto.CipherInputStream(dataSourceInputStream, cipherInstance);
                dataSourceInputStream.open();
                return -1L;
            } catch (java.security.InvalidAlgorithmParameterException | java.security.InvalidKeyException e) {
                throw new java.lang.RuntimeException(e);
            }
        } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        androidx.media3.common.util.Assertions.checkNotNull(this.cipherInputStream);
        int i3 = this.cipherInputStream.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // androidx.media3.datasource.DataSource
    public final android.net.Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws java.io.IOException {
        if (this.cipherInputStream != null) {
            this.cipherInputStream = null;
            this.upstream.close();
        }
    }

    protected javax.crypto.Cipher getCipherInstance() throws javax.crypto.NoSuchPaddingException, java.security.NoSuchAlgorithmException {
        return javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
    }
}
