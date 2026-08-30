package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public interface TargetPreloadStatusControl<T> {

    public interface PreloadStatus {
        int getStage();

        long getValue();
    }

    androidx.media3.exoplayer.source.preload.TargetPreloadStatusControl.PreloadStatus getTargetPreloadStatus(T t);
}
