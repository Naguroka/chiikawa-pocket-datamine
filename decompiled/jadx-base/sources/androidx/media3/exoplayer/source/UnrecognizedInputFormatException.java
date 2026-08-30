package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public class UnrecognizedInputFormatException extends androidx.media3.common.ParserException {
    public final com.google.common.collect.ImmutableList<androidx.media3.extractor.SniffFailure> sniffFailures;
    public final android.net.Uri uri;

    @java.lang.Deprecated
    public UnrecognizedInputFormatException(java.lang.String str, android.net.Uri uri) {
        this(str, uri, com.google.common.collect.ImmutableList.of());
    }

    public UnrecognizedInputFormatException(java.lang.String str, android.net.Uri uri, java.util.List<? extends androidx.media3.extractor.SniffFailure> list) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
    }
}
