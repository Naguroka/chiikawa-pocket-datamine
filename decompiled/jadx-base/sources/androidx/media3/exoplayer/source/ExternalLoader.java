package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public interface ExternalLoader {
    com.google.common.util.concurrent.ListenableFuture<?> load(androidx.media3.exoplayer.source.ExternalLoader.LoadRequest loadRequest);

    public static final class LoadRequest {
        public final android.net.Uri uri;

        public LoadRequest(android.net.Uri uri) {
            this.uri = uri;
        }
    }
}
