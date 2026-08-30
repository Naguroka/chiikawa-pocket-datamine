package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppMuxer implements androidx.media3.muxer.Muxer {
    private final java.util.Set<androidx.media3.common.Metadata.Entry> metadataEntries;
    private final androidx.media3.transformer.InAppMuxer.MetadataProvider metadataProvider;
    private final androidx.media3.muxer.Muxer muxer;

    public interface MetadataProvider {
        void updateMetadataEntries(java.util.Set<androidx.media3.common.Metadata.Entry> set);
    }

    public static final class Factory implements androidx.media3.muxer.Muxer.Factory {
        private final long fragmentDurationMs;
        private final androidx.media3.transformer.InAppMuxer.MetadataProvider metadataProvider;
        private final boolean outputFragmentedMp4;
        private static final com.google.common.collect.ImmutableList<java.lang.String> SUPPORTED_VIDEO_SAMPLE_MIME_TYPES = com.google.common.collect.ImmutableList.of("video/avc", "video/hevc", "video/av01");
        private static final com.google.common.collect.ImmutableList<java.lang.String> SUPPORTED_AUDIO_SAMPLE_MIME_TYPES = com.google.common.collect.ImmutableList.of(androidx.media3.common.MimeTypes.AUDIO_AAC);

        public static final class Builder {
            private long fragmentDurationMs = androidx.media3.common.C.TIME_UNSET;
            private androidx.media3.transformer.InAppMuxer.MetadataProvider metadataProvider;
            private boolean outputFragmentedMp4;

            public androidx.media3.transformer.InAppMuxer.Factory.Builder setMetadataProvider(androidx.media3.transformer.InAppMuxer.MetadataProvider metadataProvider) {
                this.metadataProvider = metadataProvider;
                return this;
            }

            public androidx.media3.transformer.InAppMuxer.Factory.Builder setOutputFragmentedMp4(boolean z) {
                this.outputFragmentedMp4 = z;
                return this;
            }

            public androidx.media3.transformer.InAppMuxer.Factory.Builder setFragmentDurationMs(long j) {
                this.fragmentDurationMs = j;
                return this;
            }

            public androidx.media3.transformer.InAppMuxer.Factory build() {
                return new androidx.media3.transformer.InAppMuxer.Factory(this.metadataProvider, this.outputFragmentedMp4, this.fragmentDurationMs);
            }
        }

        private Factory(androidx.media3.transformer.InAppMuxer.MetadataProvider metadataProvider, boolean z, long j) {
            this.metadataProvider = metadataProvider;
            this.outputFragmentedMp4 = z;
            this.fragmentDurationMs = j;
        }

        @Override // androidx.media3.muxer.Muxer.Factory
        public androidx.media3.transformer.InAppMuxer create(java.lang.String str) throws androidx.media3.muxer.Muxer.MuxerException {
            androidx.media3.muxer.Muxer muxerBuild;
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str);
                if (!this.outputFragmentedMp4) {
                    muxerBuild = new androidx.media3.muxer.Mp4Muxer.Builder(fileOutputStream).build();
                } else if (this.fragmentDurationMs != androidx.media3.common.C.TIME_UNSET) {
                    muxerBuild = new androidx.media3.muxer.FragmentedMp4Muxer.Builder(fileOutputStream).setFragmentDurationMs(this.fragmentDurationMs).build();
                } else {
                    muxerBuild = new androidx.media3.muxer.FragmentedMp4Muxer.Builder(fileOutputStream).build();
                }
                return new androidx.media3.transformer.InAppMuxer(muxerBuild, this.metadataProvider);
            } catch (java.io.FileNotFoundException e) {
                throw new androidx.media3.muxer.Muxer.MuxerException("Error creating file output stream", e);
            }
        }

        @Override // androidx.media3.muxer.Muxer.Factory
        public com.google.common.collect.ImmutableList<java.lang.String> getSupportedSampleMimeTypes(int i) {
            if (i == 2) {
                return SUPPORTED_VIDEO_SAMPLE_MIME_TYPES;
            }
            if (i == 1) {
                return SUPPORTED_AUDIO_SAMPLE_MIME_TYPES;
            }
            return com.google.common.collect.ImmutableList.of();
        }
    }

    private InAppMuxer(androidx.media3.muxer.Muxer muxer, androidx.media3.transformer.InAppMuxer.MetadataProvider metadataProvider) {
        this.muxer = muxer;
        this.metadataProvider = metadataProvider;
        this.metadataEntries = new java.util.LinkedHashSet();
    }

    @Override // androidx.media3.muxer.Muxer
    public androidx.media3.muxer.Muxer.TrackToken addTrack(androidx.media3.common.Format format) throws androidx.media3.muxer.Muxer.MuxerException {
        androidx.media3.muxer.Muxer.TrackToken trackTokenAddTrack = this.muxer.addTrack(format);
        if (androidx.media3.common.MimeTypes.isVideo(format.sampleMimeType)) {
            this.muxer.addMetadataEntry(new androidx.media3.container.Mp4OrientationData(format.rotationDegrees));
        }
        return trackTokenAddTrack;
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(androidx.media3.muxer.Muxer.TrackToken trackToken, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) throws androidx.media3.muxer.Muxer.MuxerException {
        this.muxer.writeSampleData(trackToken, byteBuffer, bufferInfo);
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(androidx.media3.common.Metadata.Entry entry) {
        if (androidx.media3.muxer.Mp4Utils.isMetadataSupported(entry)) {
            this.metadataEntries.add(entry);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void close() throws androidx.media3.muxer.Muxer.MuxerException {
        writeMetadata();
        this.muxer.close();
    }

    private void writeMetadata() {
        if (this.metadataProvider != null) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(this.metadataEntries);
            this.metadataProvider.updateMetadataEntries(linkedHashSet);
            this.metadataEntries.clear();
            this.metadataEntries.addAll(linkedHashSet);
        }
        java.util.Iterator<androidx.media3.common.Metadata.Entry> it = this.metadataEntries.iterator();
        while (it.hasNext()) {
            this.muxer.addMetadataEntry(it.next());
        }
    }
}
