package androidx.media3.exoplayer.text;

/* JADX INFO: loaded from: classes.dex */
public interface TextOutput {
    void onCues(androidx.media3.common.text.CueGroup cueGroup);

    @java.lang.Deprecated
    default void onCues(java.util.List<androidx.media3.common.text.Cue> list) {
    }
}
