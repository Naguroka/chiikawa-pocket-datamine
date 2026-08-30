package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public interface MediaChunkIterator {
    public static final androidx.media3.exoplayer.source.chunk.MediaChunkIterator EMPTY = new androidx.media3.exoplayer.source.chunk.MediaChunkIterator() { // from class: androidx.media3.exoplayer.source.chunk.MediaChunkIterator.1
        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public boolean isEnded() {
            return true;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public boolean next() {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public void reset() {
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public androidx.media3.datasource.DataSpec getDataSpec() {
            throw new java.util.NoSuchElementException();
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            throw new java.util.NoSuchElementException();
        }

        @Override // androidx.media3.exoplayer.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            throw new java.util.NoSuchElementException();
        }
    };

    long getChunkEndTimeUs();

    long getChunkStartTimeUs();

    androidx.media3.datasource.DataSpec getDataSpec();

    boolean isEnded();

    boolean next();

    void reset();
}
