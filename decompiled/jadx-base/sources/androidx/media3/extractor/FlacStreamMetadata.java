package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class FlacStreamMetadata {
    public static final int NOT_IN_LOOKUP_TABLE = -1;
    private static final java.lang.String TAG = "FlacStreamMetadata";
    public final int bitsPerSample;
    public final int bitsPerSampleLookupKey;
    public final int channels;
    public final int maxBlockSizeSamples;
    public final int maxFrameSize;
    private final androidx.media3.common.Metadata metadata;
    public final int minBlockSizeSamples;
    public final int minFrameSize;
    public final int sampleRate;
    public final int sampleRateLookupKey;
    public final androidx.media3.extractor.FlacStreamMetadata.SeekTable seekTable;
    public final long totalSamples;

    private static int getBitsPerSampleLookupKey(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int getSampleRateLookupKey(int i) {
        switch (i) {
            case 8000:
                return 4;
            case androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case androidx.media3.extractor.OpusUtil.SAMPLE_RATE /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    public static class SeekTable {
        public final long[] pointOffsets;
        public final long[] pointSampleNumbers;

        public SeekTable(long[] jArr, long[] jArr2) {
            this.pointSampleNumbers = jArr;
            this.pointOffsets = jArr2;
        }
    }

    public FlacStreamMetadata(byte[] bArr, int i) {
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(bArr);
        parsableBitArray.setPosition(i * 8);
        this.minBlockSizeSamples = parsableBitArray.readBits(16);
        this.maxBlockSizeSamples = parsableBitArray.readBits(16);
        this.minFrameSize = parsableBitArray.readBits(24);
        this.maxFrameSize = parsableBitArray.readBits(24);
        int bits = parsableBitArray.readBits(20);
        this.sampleRate = bits;
        this.sampleRateLookupKey = getSampleRateLookupKey(bits);
        this.channels = parsableBitArray.readBits(3) + 1;
        int bits2 = parsableBitArray.readBits(5) + 1;
        this.bitsPerSample = bits2;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(bits2);
        this.totalSamples = parsableBitArray.readBitsToLong(36);
        this.seekTable = null;
        this.metadata = null;
    }

    public FlacStreamMetadata(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<androidx.media3.extractor.metadata.flac.PictureFrame> arrayList2) {
        this(i, i2, i3, i4, i5, i6, i7, j, (androidx.media3.extractor.FlacStreamMetadata.SeekTable) null, concatenateVorbisMetadata(arrayList, arrayList2));
    }

    private FlacStreamMetadata(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, androidx.media3.extractor.FlacStreamMetadata.SeekTable seekTable, androidx.media3.common.Metadata metadata) {
        this.minBlockSizeSamples = i;
        this.maxBlockSizeSamples = i2;
        this.minFrameSize = i3;
        this.maxFrameSize = i4;
        this.sampleRate = i5;
        this.sampleRateLookupKey = getSampleRateLookupKey(i5);
        this.channels = i6;
        this.bitsPerSample = i7;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(i7);
        this.totalSamples = j;
        this.seekTable = seekTable;
        this.metadata = metadata;
    }

    public int getMaxDecodedFrameSize() {
        return this.maxBlockSizeSamples * this.channels * (this.bitsPerSample / 8);
    }

    public int getDecodedBitrate() {
        return this.bitsPerSample * this.sampleRate * this.channels;
    }

    public long getDurationUs() {
        long j = this.totalSamples;
        return j == 0 ? androidx.media3.common.C.TIME_UNSET : (j * 1000000) / ((long) this.sampleRate);
    }

    public long getSampleNumber(long j) {
        return androidx.media3.common.util.Util.constrainValue((j * ((long) this.sampleRate)) / 1000000, 0L, this.totalSamples - 1);
    }

    public long getApproxBytesPerFrame() {
        long j;
        long j2;
        int i = this.maxFrameSize;
        if (i > 0) {
            j = (((long) i) + ((long) this.minFrameSize)) / 2;
            j2 = 1;
        } else {
            int i2 = this.minBlockSizeSamples;
            j = ((((i2 != this.maxBlockSizeSamples || i2 <= 0) ? 4096L : i2) * ((long) this.channels)) * ((long) this.bitsPerSample)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public androidx.media3.common.Format getFormat(byte[] bArr, androidx.media3.common.Metadata metadata) {
        bArr[4] = -128;
        int i = this.maxFrameSize;
        if (i <= 0) {
            i = -1;
        }
        return new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_FLAC).setMaxInputSize(i).setChannelCount(this.channels).setSampleRate(this.sampleRate).setPcmEncoding(androidx.media3.common.util.Util.getPcmEncoding(this.bitsPerSample)).setInitializationData(java.util.Collections.singletonList(bArr)).setMetadata(getMetadataCopyWithAppendedEntriesFrom(metadata)).build();
    }

    public androidx.media3.common.Metadata getMetadataCopyWithAppendedEntriesFrom(androidx.media3.common.Metadata metadata) {
        androidx.media3.common.Metadata metadata2 = this.metadata;
        return metadata2 == null ? metadata : metadata2.copyWithAppendedEntriesFrom(metadata);
    }

    public androidx.media3.extractor.FlacStreamMetadata copyWithSeekTable(androidx.media3.extractor.FlacStreamMetadata.SeekTable seekTable) {
        return new androidx.media3.extractor.FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, seekTable, this.metadata);
    }

    public androidx.media3.extractor.FlacStreamMetadata copyWithVorbisComments(java.util.List<java.lang.String> list) {
        return new androidx.media3.extractor.FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(androidx.media3.extractor.VorbisUtil.parseVorbisComments(list)));
    }

    public androidx.media3.extractor.FlacStreamMetadata copyWithPictureFrames(java.util.List<androidx.media3.extractor.metadata.flac.PictureFrame> list) {
        return new androidx.media3.extractor.FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(new androidx.media3.common.Metadata(list)));
    }

    private static androidx.media3.common.Metadata concatenateVorbisMetadata(java.util.List<java.lang.String> list, java.util.List<androidx.media3.extractor.metadata.flac.PictureFrame> list2) {
        androidx.media3.common.Metadata vorbisComments = androidx.media3.extractor.VorbisUtil.parseVorbisComments(list);
        if (vorbisComments == null && list2.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.Metadata(list2).copyWithAppendedEntriesFrom(vorbisComments);
    }
}
