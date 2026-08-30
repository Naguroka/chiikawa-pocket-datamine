package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
abstract class SampleExporter {
    private final androidx.media3.common.Metadata metadata;
    private final androidx.media3.transformer.MuxerWrapper muxerWrapper;
    private boolean muxerWrapperTrackAdded;
    private final int outputTrackType;

    public abstract androidx.media3.transformer.GraphInput getInput(androidx.media3.transformer.EditedMediaItem editedMediaItem, androidx.media3.common.Format format, int i) throws androidx.media3.transformer.ExportException;

    protected abstract androidx.media3.decoder.DecoderInputBuffer getMuxerInputBuffer() throws androidx.media3.transformer.ExportException;

    protected abstract androidx.media3.common.Format getMuxerInputFormat() throws androidx.media3.transformer.ExportException;

    protected abstract boolean isMuxerInputEnded();

    protected boolean processDataUpToMuxer() throws androidx.media3.transformer.ExportException {
        return false;
    }

    public abstract void release();

    protected abstract void releaseMuxerInputBuffer() throws androidx.media3.transformer.ExportException;

    public SampleExporter(androidx.media3.common.Format format, androidx.media3.transformer.MuxerWrapper muxerWrapper) {
        this.muxerWrapper = muxerWrapper;
        this.metadata = format.metadata;
        this.outputTrackType = androidx.media3.transformer.TransformerUtil.getProcessedTrackType(format.sampleMimeType);
    }

    public final boolean processData() throws androidx.media3.transformer.ExportException {
        return feedMuxer() || (!isMuxerInputEnded() && processDataUpToMuxer());
    }

    private boolean feedMuxer() throws androidx.media3.transformer.ExportException {
        if (!this.muxerWrapperTrackAdded) {
            androidx.media3.common.Format muxerInputFormat = getMuxerInputFormat();
            if (muxerInputFormat == null) {
                return false;
            }
            if (this.metadata != null) {
                muxerInputFormat = muxerInputFormat.buildUpon().setMetadata(this.metadata).build();
            }
            try {
                this.muxerWrapper.addTrackFormat(muxerInputFormat);
                this.muxerWrapperTrackAdded = true;
            } catch (androidx.media3.muxer.Muxer.MuxerException e) {
                throw androidx.media3.transformer.ExportException.createForMuxer(e, 7001);
            } catch (androidx.media3.transformer.MuxerWrapper.AppendTrackFormatException e2) {
                throw androidx.media3.transformer.ExportException.createForMuxer(e2, 7003);
            }
        }
        if (isMuxerInputEnded()) {
            this.muxerWrapper.endTrack(this.outputTrackType);
            return false;
        }
        androidx.media3.decoder.DecoderInputBuffer muxerInputBuffer = getMuxerInputBuffer();
        if (muxerInputBuffer == null) {
            return false;
        }
        try {
            if (!this.muxerWrapper.writeSample(this.outputTrackType, (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkStateNotNull(muxerInputBuffer.data), muxerInputBuffer.isKeyFrame(), muxerInputBuffer.timeUs)) {
                return false;
            }
            releaseMuxerInputBuffer();
            return true;
        } catch (androidx.media3.muxer.Muxer.MuxerException e3) {
            throw androidx.media3.transformer.ExportException.createForMuxer(e3, 7001);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static java.lang.String findSupportedMimeTypeForEncoderAndMuxer(androidx.media3.common.Format format, java.util.List<java.lang.String> list) throws androidx.media3.transformer.ExportException {
        boolean zIsVideo = androidx.media3.common.MimeTypes.isVideo((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType));
        com.google.common.collect.ImmutableSet.Builder builderAdd = new com.google.common.collect.ImmutableSet.Builder().add(format.sampleMimeType);
        if (zIsVideo) {
            builderAdd.add("video/hevc").add("video/avc");
        }
        builderAdd.addAll((java.lang.Iterable) list);
        com.google.common.collect.ImmutableList immutableListAsList = builderAdd.build().asList();
        for (int i = 0; i < immutableListAsList.size(); i++) {
            java.lang.String str = (java.lang.String) immutableListAsList.get(i);
            if (list.contains(str)) {
                if (zIsVideo && androidx.media3.common.ColorInfo.isTransferHdr(format.colorInfo)) {
                    if (!androidx.media3.transformer.EncoderUtil.getSupportedEncodersForHdrEditing(str, format.colorInfo).isEmpty()) {
                        return str;
                    }
                } else if (!androidx.media3.transformer.EncoderUtil.getSupportedEncoders(str).isEmpty()) {
                    return str;
                }
            }
        }
        throw createNoSupportedMimeTypeException(format);
    }

    private static androidx.media3.transformer.ExportException createNoSupportedMimeTypeException(androidx.media3.common.Format format) {
        boolean zIsVideo = androidx.media3.common.MimeTypes.isVideo(format.sampleMimeType);
        return androidx.media3.transformer.ExportException.createForCodec(new java.lang.IllegalArgumentException((zIsVideo && androidx.media3.common.ColorInfo.isTransferHdr(format.colorInfo)) ? "No MIME type is supported by both encoder and muxer. Requested HDR colorInfo: " + format.colorInfo : "No MIME type is supported by both encoder and muxer."), 4003, new androidx.media3.transformer.ExportException.CodecInfo(format.toString(), zIsVideo, false, null));
    }
}
