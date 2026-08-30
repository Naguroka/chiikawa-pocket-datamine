package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class ByteArrayDataSink implements androidx.media3.datasource.DataSink {
    private java.io.ByteArrayOutputStream stream;

    @Override // androidx.media3.datasource.DataSink
    public void open(androidx.media3.datasource.DataSpec dataSpec) {
        if (dataSpec.length == -1) {
            this.stream = new java.io.ByteArrayOutputStream();
        } else {
            androidx.media3.common.util.Assertions.checkArgument(dataSpec.length <= 2147483647L);
            this.stream = new java.io.ByteArrayOutputStream((int) dataSpec.length);
        }
    }

    @Override // androidx.media3.datasource.DataSink
    public void close() throws java.io.IOException {
        ((java.io.ByteArrayOutputStream) androidx.media3.common.util.Util.castNonNull(this.stream)).close();
    }

    @Override // androidx.media3.datasource.DataSink
    public void write(byte[] bArr, int i, int i2) {
        ((java.io.ByteArrayOutputStream) androidx.media3.common.util.Util.castNonNull(this.stream)).write(bArr, i, i2);
    }

    public byte[] getData() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = this.stream;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
