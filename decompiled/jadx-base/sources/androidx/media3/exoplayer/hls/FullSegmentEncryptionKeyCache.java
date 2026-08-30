package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
final class FullSegmentEncryptionKeyCache {
    private final java.util.LinkedHashMap<android.net.Uri, byte[]> backingMap;

    public FullSegmentEncryptionKeyCache(final int i) {
        this.backingMap = new java.util.LinkedHashMap<android.net.Uri, byte[]>(i + 1, 1.0f, false) { // from class: androidx.media3.exoplayer.hls.FullSegmentEncryptionKeyCache.1
            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(java.util.Map.Entry<android.net.Uri, byte[]> entry) {
                return size() > i;
            }
        };
    }

    public byte[] get(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.backingMap.get(uri);
    }

    public byte[] put(android.net.Uri uri, byte[] bArr) {
        return this.backingMap.put((android.net.Uri) androidx.media3.common.util.Assertions.checkNotNull(uri), (byte[]) androidx.media3.common.util.Assertions.checkNotNull(bArr));
    }

    public boolean containsUri(android.net.Uri uri) {
        return this.backingMap.containsKey(androidx.media3.common.util.Assertions.checkNotNull(uri));
    }

    public byte[] remove(android.net.Uri uri) {
        return this.backingMap.remove(androidx.media3.common.util.Assertions.checkNotNull(uri));
    }
}
