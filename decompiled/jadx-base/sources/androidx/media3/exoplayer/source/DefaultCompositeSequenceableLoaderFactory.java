package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultCompositeSequenceableLoaderFactory implements androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory {
    @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    public androidx.media3.exoplayer.source.SequenceableLoader empty() {
        return new androidx.media3.exoplayer.source.CompositeSequenceableLoader(com.google.common.collect.ImmutableList.of(), com.google.common.collect.ImmutableList.of());
    }

    @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    @java.lang.Deprecated
    public androidx.media3.exoplayer.source.SequenceableLoader createCompositeSequenceableLoader(androidx.media3.exoplayer.source.SequenceableLoader... sequenceableLoaderArr) {
        return new androidx.media3.exoplayer.source.CompositeSequenceableLoader(sequenceableLoaderArr);
    }

    @Override // androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory
    public androidx.media3.exoplayer.source.SequenceableLoader create(java.util.List<? extends androidx.media3.exoplayer.source.SequenceableLoader> list, java.util.List<java.util.List<java.lang.Integer>> list2) {
        return new androidx.media3.exoplayer.source.CompositeSequenceableLoader(list, list2);
    }
}
