package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public interface SequenceableLoader {

    public interface Callback<T extends androidx.media3.exoplayer.source.SequenceableLoader> {
        void onContinueLoadingRequested(T t);
    }

    boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j);
}
