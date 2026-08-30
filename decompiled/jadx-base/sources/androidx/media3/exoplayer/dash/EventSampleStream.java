package androidx.media3.exoplayer.dash;

/* JADX INFO: loaded from: classes.dex */
final class EventSampleStream implements androidx.media3.exoplayer.source.SampleStream {
    private int currentIndex;
    private androidx.media3.exoplayer.dash.manifest.EventStream eventStream;
    private boolean eventStreamAppendable;
    private long[] eventTimesUs;
    private boolean isFormatSentDownstream;
    private final androidx.media3.common.Format upstreamFormat;
    private final androidx.media3.extractor.metadata.emsg.EventMessageEncoder eventMessageEncoder = new androidx.media3.extractor.metadata.emsg.EventMessageEncoder();
    private long pendingSeekPositionUs = androidx.media3.common.C.TIME_UNSET;

    @Override // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public void maybeThrowError() throws java.io.IOException {
    }

    public EventSampleStream(androidx.media3.exoplayer.dash.manifest.EventStream eventStream, androidx.media3.common.Format format, boolean z) {
        this.upstreamFormat = format;
        this.eventStream = eventStream;
        this.eventTimesUs = eventStream.presentationTimesUs;
        updateEventStream(eventStream, z);
    }

    public java.lang.String eventStreamId() {
        return this.eventStream.id();
    }

    public void updateEventStream(androidx.media3.exoplayer.dash.manifest.EventStream eventStream, boolean z) {
        int i = this.currentIndex;
        long j = i == 0 ? -9223372036854775807L : this.eventTimesUs[i - 1];
        this.eventStreamAppendable = z;
        this.eventStream = eventStream;
        long[] jArr = eventStream.presentationTimesUs;
        this.eventTimesUs = jArr;
        long j2 = this.pendingSeekPositionUs;
        if (j2 != androidx.media3.common.C.TIME_UNSET) {
            seekToUs(j2);
        } else if (j != androidx.media3.common.C.TIME_UNSET) {
            this.currentIndex = androidx.media3.common.util.Util.binarySearchCeil(jArr, j, false, false);
        }
    }

    public void seekToUs(long j) {
        int iBinarySearchCeil = androidx.media3.common.util.Util.binarySearchCeil(this.eventTimesUs, j, true, false);
        this.currentIndex = iBinarySearchCeil;
        if (!(this.eventStreamAppendable && iBinarySearchCeil == this.eventTimesUs.length)) {
            j = androidx.media3.common.C.TIME_UNSET;
        }
        this.pendingSeekPositionUs = j;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int readData(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
        int i2 = this.currentIndex;
        boolean z = i2 == this.eventTimesUs.length;
        if (z && !this.eventStreamAppendable) {
            decoderInputBuffer.setFlags(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.isFormatSentDownstream) {
            formatHolder.format = this.upstreamFormat;
            this.isFormatSentDownstream = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.currentIndex = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrEncode = this.eventMessageEncoder.encode(this.eventStream.events[i2]);
            decoderInputBuffer.ensureSpaceForWrite(bArrEncode.length);
            decoderInputBuffer.data.put(bArrEncode);
        }
        decoderInputBuffer.timeUs = this.eventTimesUs[i2];
        decoderInputBuffer.setFlags(1);
        return -4;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public int skipData(long j) {
        int iMax = java.lang.Math.max(this.currentIndex, androidx.media3.common.util.Util.binarySearchCeil(this.eventTimesUs, j, true, false));
        int i = iMax - this.currentIndex;
        this.currentIndex = iMax;
        return i;
    }
}
