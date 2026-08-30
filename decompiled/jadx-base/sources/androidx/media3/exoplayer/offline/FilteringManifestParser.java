package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final class FilteringManifestParser<T extends androidx.media3.exoplayer.offline.FilterableManifest<T>> implements androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<T> {
    private final androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends T> parser;
    private final java.util.List<androidx.media3.common.StreamKey> streamKeys;

    public FilteringManifestParser(androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends T> parser, java.util.List<androidx.media3.common.StreamKey> list) {
        this.parser = parser;
        this.streamKeys = list;
    }

    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public T parse(android.net.Uri uri, java.io.InputStream inputStream) throws java.io.IOException {
        T t = this.parser.parse(uri, inputStream);
        java.util.List<androidx.media3.common.StreamKey> list = this.streamKeys;
        return (list == null || list.isEmpty()) ? t : (T) t.copy(this.streamKeys);
    }
}
