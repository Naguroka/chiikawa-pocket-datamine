package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public interface CompositeSequenceableLoaderFactory {
    androidx.media3.exoplayer.source.SequenceableLoader create(java.util.List<? extends androidx.media3.exoplayer.source.SequenceableLoader> list, java.util.List<java.util.List<java.lang.Integer>> list2);

    @java.lang.Deprecated
    androidx.media3.exoplayer.source.SequenceableLoader createCompositeSequenceableLoader(androidx.media3.exoplayer.source.SequenceableLoader... sequenceableLoaderArr);

    androidx.media3.exoplayer.source.SequenceableLoader empty();
}
