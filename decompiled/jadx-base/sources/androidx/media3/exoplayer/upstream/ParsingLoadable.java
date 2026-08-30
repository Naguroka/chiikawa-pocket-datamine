package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class ParsingLoadable<T> implements androidx.media3.exoplayer.upstream.Loader.Loadable {
    private final androidx.media3.datasource.StatsDataSource dataSource;
    public final androidx.media3.datasource.DataSpec dataSpec;
    public final long loadTaskId;
    private final androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends T> parser;
    private volatile T result;
    public final int type;

    public interface Parser<T> {
        T parse(android.net.Uri uri, java.io.InputStream inputStream) throws java.io.IOException;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
    }

    public static <T> T load(androidx.media3.datasource.DataSource dataSource, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends T> parser, android.net.Uri uri, int i) throws java.io.IOException {
        androidx.media3.exoplayer.upstream.ParsingLoadable parsingLoadable = new androidx.media3.exoplayer.upstream.ParsingLoadable(dataSource, uri, i, parser);
        parsingLoadable.load();
        return (T) androidx.media3.common.util.Assertions.checkNotNull(parsingLoadable.getResult());
    }

    public static <T> T load(androidx.media3.datasource.DataSource dataSource, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends T> parser, androidx.media3.datasource.DataSpec dataSpec, int i) throws java.io.IOException {
        androidx.media3.exoplayer.upstream.ParsingLoadable parsingLoadable = new androidx.media3.exoplayer.upstream.ParsingLoadable(dataSource, dataSpec, i, parser);
        parsingLoadable.load();
        return (T) androidx.media3.common.util.Assertions.checkNotNull(parsingLoadable.getResult());
    }

    public ParsingLoadable(androidx.media3.datasource.DataSource dataSource, android.net.Uri uri, int i, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends T> parser) {
        this(dataSource, new androidx.media3.datasource.DataSpec.Builder().setUri(uri).setFlags(1).build(), i, parser);
    }

    public ParsingLoadable(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, int i, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends T> parser) {
        this.dataSource = new androidx.media3.datasource.StatsDataSource(dataSource);
        this.dataSpec = dataSpec;
        this.type = i;
        this.parser = parser;
        this.loadTaskId = androidx.media3.exoplayer.source.LoadEventInfo.getNewId();
    }

    public final T getResult() {
        return this.result;
    }

    public long bytesLoaded() {
        return this.dataSource.getBytesRead();
    }

    public android.net.Uri getUri() {
        return this.dataSource.getLastOpenedUri();
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.dataSource.getLastResponseHeaders();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() throws java.io.IOException {
        this.dataSource.resetBytesRead();
        androidx.media3.datasource.DataSourceInputStream dataSourceInputStream = new androidx.media3.datasource.DataSourceInputStream(this.dataSource, this.dataSpec);
        try {
            dataSourceInputStream.open();
            this.result = this.parser.parse((android.net.Uri) androidx.media3.common.util.Assertions.checkNotNull(this.dataSource.getUri()), dataSourceInputStream);
        } finally {
            androidx.media3.common.util.Util.closeQuietly(dataSourceInputStream);
        }
    }
}
