package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final class CompositeSequenceableLoader implements androidx.media3.exoplayer.source.SequenceableLoader {
    private long lastAudioVideoBufferedPositionUs;
    private final com.google.common.collect.ImmutableList<androidx.media3.exoplayer.source.CompositeSequenceableLoader.SequenceableLoaderWithTrackTypes> loadersWithTrackTypes;

    @java.lang.Deprecated
    public CompositeSequenceableLoader(androidx.media3.exoplayer.source.SequenceableLoader[] sequenceableLoaderArr) {
        this(com.google.common.collect.ImmutableList.copyOf(sequenceableLoaderArr), java.util.Collections.nCopies(sequenceableLoaderArr.length, com.google.common.collect.ImmutableList.of(-1)));
    }

    public CompositeSequenceableLoader(java.util.List<? extends androidx.media3.exoplayer.source.SequenceableLoader> list, java.util.List<java.util.List<java.lang.Integer>> list2) {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        androidx.media3.common.util.Assertions.checkArgument(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            builder.add(new androidx.media3.exoplayer.source.CompositeSequenceableLoader.SequenceableLoaderWithTrackTypes(list.get(i), list2.get(i)));
        }
        this.loadersWithTrackTypes = builder.build();
        this.lastAudioVideoBufferedPositionUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
            androidx.media3.exoplayer.source.CompositeSequenceableLoader.SequenceableLoaderWithTrackTypes sequenceableLoaderWithTrackTypes = this.loadersWithTrackTypes.get(i);
            long bufferedPositionUs = sequenceableLoaderWithTrackTypes.getBufferedPositionUs();
            if ((sequenceableLoaderWithTrackTypes.getTrackTypes().contains(1) || sequenceableLoaderWithTrackTypes.getTrackTypes().contains(2) || sequenceableLoaderWithTrackTypes.getTrackTypes().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                jMin = java.lang.Math.min(jMin, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin2 = java.lang.Math.min(jMin2, bufferedPositionUs);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.lastAudioVideoBufferedPositionUs = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.lastAudioVideoBufferedPositionUs;
        return j != androidx.media3.common.C.TIME_UNSET ? j : jMin2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
            long nextLoadPositionUs = this.loadersWithTrackTypes.get(i).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = java.lang.Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
            this.loadersWithTrackTypes.get(i).reevaluateBuffer(j);
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
        boolean zContinueLoading;
        boolean z = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                break;
            }
            zContinueLoading = false;
            for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
                long nextLoadPositionUs2 = this.loadersWithTrackTypes.get(i).getNextLoadPositionUs();
                boolean z2 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= loadingInfo.playbackPositionUs;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z2) {
                    zContinueLoading |= this.loadersWithTrackTypes.get(i).continueLoading(loadingInfo);
                }
            }
            z |= zContinueLoading;
        } while (zContinueLoading);
        return z;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public boolean isLoading() {
        for (int i = 0; i < this.loadersWithTrackTypes.size(); i++) {
            if (this.loadersWithTrackTypes.get(i).isLoading()) {
                return true;
            }
        }
        return false;
    }

    private static final class SequenceableLoaderWithTrackTypes implements androidx.media3.exoplayer.source.SequenceableLoader {
        private final androidx.media3.exoplayer.source.SequenceableLoader loader;
        private final com.google.common.collect.ImmutableList<java.lang.Integer> trackTypes;

        public SequenceableLoaderWithTrackTypes(androidx.media3.exoplayer.source.SequenceableLoader sequenceableLoader, java.util.List<java.lang.Integer> list) {
            this.loader = sequenceableLoader;
            this.trackTypes = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        }

        public com.google.common.collect.ImmutableList<java.lang.Integer> getTrackTypes() {
            return this.trackTypes;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.loader.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.loader.getNextLoadPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public boolean continueLoading(androidx.media3.exoplayer.LoadingInfo loadingInfo) {
            return this.loader.continueLoading(loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public boolean isLoading() {
            return this.loader.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public void reevaluateBuffer(long j) {
            this.loader.reevaluateBuffer(j);
        }
    }
}
