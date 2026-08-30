package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public abstract class DataChunk extends androidx.media3.exoplayer.source.chunk.Chunk {
    private static final int READ_GRANULARITY = 16384;
    private byte[] data;
    private volatile boolean loadCanceled;

    protected abstract void consume(byte[] bArr, int i) throws java.io.IOException;

    public DataChunk(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, int i, androidx.media3.common.Format format, int i2, java.lang.Object obj, byte[] bArr) {
        super(dataSource, dataSpec, i, format, i2, obj, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
        this.data = bArr == null ? androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY : bArr;
    }

    public byte[] getDataHolder() {
        return this.data;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() throws java.io.IOException {
        try {
            this.dataSource.open(this.dataSpec);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.loadCanceled) {
                maybeExpandData(i2);
                i = this.dataSource.read(this.data, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.loadCanceled) {
                consume(this.data, i2);
            }
        } finally {
            androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
        }
    }

    private void maybeExpandData(int i) {
        byte[] bArr = this.data;
        if (bArr.length < i + 16384) {
            this.data = java.util.Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
