package androidx.media3.muxer;

/* JADX INFO: loaded from: classes.dex */
class Mp4MoovStructure {
    private final int lastFrameDurationBehavior;
    private final androidx.media3.muxer.MetadataCollector metadataCollector;

    public interface TrackMetadataProvider {
        androidx.media3.common.Format format();

        int videoUnitTimebase();

        com.google.common.collect.ImmutableList<java.lang.Long> writtenChunkOffsets();

        com.google.common.collect.ImmutableList<java.lang.Integer> writtenChunkSampleCounts();

        com.google.common.collect.ImmutableList<android.media.MediaCodec.BufferInfo> writtenSamples();
    }

    public Mp4MoovStructure(androidx.media3.muxer.MetadataCollector metadataCollector, int i) {
        this.metadataCollector = metadataCollector;
        this.lastFrameDurationBehavior = i;
    }

    public java.nio.ByteBuffer moovMetadataHeader(java.util.List<? extends androidx.media3.muxer.Mp4MoovStructure.TrackMetadataProvider> list, long j, boolean z) {
        java.nio.ByteBuffer byteBufferMeta;
        char c;
        java.nio.ByteBuffer byteBufferAllocate;
        java.nio.ByteBuffer byteBufferAllocate2;
        java.nio.ByteBuffer byteBufferCo64;
        int i;
        int i2;
        java.nio.ByteBuffer byteBuffer;
        java.lang.String str;
        java.lang.String str2;
        java.nio.ByteBuffer byteBuffer2;
        int i3;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.nio.ByteBuffer byteBufferSmhd;
        java.nio.ByteBuffer byteBufferStbl;
        java.lang.String str3;
        androidx.media3.muxer.Mp4MoovStructure mp4MoovStructure = this;
        int i4 = (int) mp4MoovStructure.metadataCollector.timestampData.creationTimestampSeconds;
        int i5 = (int) mp4MoovStructure.metadataCollector.timestampData.modificationTimestampSeconds;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        long jMax = 0;
        int i6 = 1;
        int i7 = 0;
        while (i7 < list.size()) {
            androidx.media3.muxer.Mp4MoovStructure.TrackMetadataProvider trackMetadataProvider = list.get(i7);
            if (z || !trackMetadataProvider.writtenSamples().isEmpty()) {
                androidx.media3.common.Format format = trackMetadataProvider.format();
                java.lang.String strBcp47LanguageTagToIso3 = bcp47LanguageTagToIso3(format.language);
                java.util.ArrayList arrayList5 = arrayList3;
                java.util.ArrayList arrayList6 = arrayList4;
                java.util.List<java.lang.Long> listConvertPresentationTimestampsToDurationsVu = androidx.media3.muxer.Boxes.convertPresentationTimestampsToDurationsVu(trackMetadataProvider.writtenSamples(), j, trackMetadataProvider.videoUnitTimebase(), mp4MoovStructure.lastFrameDurationBehavior);
                long jLongValue = 0;
                for (int i8 = 0; i8 < listConvertPresentationTimestampsToDurationsVu.size(); i8++) {
                    jLongValue += listConvertPresentationTimestampsToDurationsVu.get(i8).longValue();
                }
                long j2 = jMax;
                long jUsFromVu = usFromVu(jLongValue, trackMetadataProvider.videoUnitTimebase());
                int trackType = androidx.media3.common.MimeTypes.getTrackType(format.sampleMimeType);
                java.nio.ByteBuffer byteBufferStts = androidx.media3.muxer.Boxes.stts(listConvertPresentationTimestampsToDurationsVu);
                if (androidx.media3.common.MimeTypes.isVideo(format.sampleMimeType)) {
                    byteBufferAllocate2 = androidx.media3.muxer.Boxes.ctts(trackMetadataProvider.writtenSamples(), listConvertPresentationTimestampsToDurationsVu, trackMetadataProvider.videoUnitTimebase());
                } else {
                    byteBufferAllocate2 = java.nio.ByteBuffer.allocate(0);
                }
                java.nio.ByteBuffer byteBufferStsz = androidx.media3.muxer.Boxes.stsz(trackMetadataProvider.writtenSamples());
                java.nio.ByteBuffer byteBufferStsc = androidx.media3.muxer.Boxes.stsc(trackMetadataProvider.writtenChunkSampleCounts());
                if (z) {
                    byteBufferCo64 = androidx.media3.muxer.Boxes.stco(trackMetadataProvider.writtenChunkOffsets());
                } else {
                    byteBufferCo64 = androidx.media3.muxer.Boxes.co64(trackMetadataProvider.writtenChunkOffsets());
                }
                int i9 = i7;
                if (trackType == -1 || trackType == 5) {
                    java.nio.ByteBuffer byteBufferNmhd = androidx.media3.muxer.Boxes.nmhd();
                    i = 2;
                    i2 = 3;
                    java.nio.ByteBuffer byteBufferStbl2 = androidx.media3.muxer.Boxes.stbl(androidx.media3.muxer.Boxes.stsd(androidx.media3.muxer.Boxes.textMetaDataSampleEntry(format)), byteBufferStts, byteBufferStsz, byteBufferStsc, byteBufferCo64);
                    byteBuffer = byteBufferNmhd;
                    str = com.adjust.sdk.Constants.REFERRER_API_META;
                    str2 = "MetaHandle";
                    byteBuffer2 = byteBufferStbl2;
                } else {
                    if (trackType == 1) {
                        byteBufferSmhd = androidx.media3.muxer.Boxes.smhd();
                        byteBufferStbl = androidx.media3.muxer.Boxes.stbl(androidx.media3.muxer.Boxes.stsd(androidx.media3.muxer.Boxes.audioSampleEntry(format)), byteBufferStts, byteBufferStsz, byteBufferStsc, byteBufferCo64);
                        str3 = "soun";
                        str2 = "SoundHandle";
                    } else if (trackType == 2) {
                        byteBufferSmhd = androidx.media3.muxer.Boxes.vmhd();
                        byteBufferStbl = androidx.media3.muxer.Boxes.stbl(androidx.media3.muxer.Boxes.stsd(androidx.media3.muxer.Boxes.videoSampleEntry(format)), byteBufferStts, byteBufferAllocate2, byteBufferStsz, byteBufferStsc, byteBufferCo64, androidx.media3.muxer.Boxes.stss(trackMetadataProvider.writtenSamples()));
                        str3 = "vide";
                        str2 = "VideoHandle";
                    } else {
                        throw new java.lang.IllegalArgumentException("Unsupported track type");
                    }
                    byteBuffer2 = byteBufferStbl;
                    str = str3;
                    byteBuffer = byteBufferSmhd;
                    i2 = 3;
                    i = 2;
                }
                java.nio.ByteBuffer[] byteBufferArr = new java.nio.ByteBuffer[i];
                int i10 = mp4MoovStructure.metadataCollector.orientationData.orientation;
                int i11 = i2;
                int i12 = i6;
                i3 = i9;
                byteBufferArr[0] = androidx.media3.muxer.Boxes.tkhd(i6, jUsFromVu, i4, i5, i10, format);
                java.nio.ByteBuffer[] byteBufferArr2 = new java.nio.ByteBuffer[i11];
                byteBufferArr2[0] = androidx.media3.muxer.Boxes.mdhd(jLongValue, trackMetadataProvider.videoUnitTimebase(), i4, i5, strBcp47LanguageTagToIso3);
                byteBufferArr2[1] = androidx.media3.muxer.Boxes.hdlr(str, str2);
                java.nio.ByteBuffer[] byteBufferArr3 = new java.nio.ByteBuffer[i11];
                byteBufferArr3[0] = byteBuffer;
                byteBufferArr3[1] = androidx.media3.muxer.Boxes.dinf(androidx.media3.muxer.Boxes.dref(androidx.media3.muxer.Boxes.localUrl()));
                byteBufferArr3[2] = byteBuffer2;
                byteBufferArr2[2] = androidx.media3.muxer.Boxes.minf(byteBufferArr3);
                byteBufferArr[1] = androidx.media3.muxer.Boxes.mdia(byteBufferArr2);
                arrayList = arrayList5;
                arrayList.add(androidx.media3.muxer.Boxes.trak(byteBufferArr));
                jMax = java.lang.Math.max(j2, jUsFromVu);
                arrayList2 = arrayList6;
                arrayList2.add(androidx.media3.muxer.Boxes.trex(i12));
                i6 = i12 + 1;
            } else {
                i3 = i7;
                arrayList = arrayList3;
                arrayList2 = arrayList4;
            }
            i7 = i3 + 1;
            mp4MoovStructure = this;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        }
        java.util.ArrayList arrayList7 = arrayList3;
        java.util.ArrayList arrayList8 = arrayList4;
        java.nio.ByteBuffer byteBufferMvhd = androidx.media3.muxer.Boxes.mvhd(i6, i4, i5, jMax);
        java.nio.ByteBuffer byteBufferUdta = androidx.media3.muxer.Boxes.udta(this.metadataCollector.locationData);
        if (this.metadataCollector.metadataEntries.isEmpty()) {
            byteBufferMeta = java.nio.ByteBuffer.allocate(0);
        } else {
            byteBufferMeta = androidx.media3.muxer.Boxes.meta(androidx.media3.muxer.Boxes.hdlr("mdta", ""), androidx.media3.muxer.Boxes.keys(com.google.common.collect.Lists.newArrayList(this.metadataCollector.metadataEntries)), androidx.media3.muxer.Boxes.ilst(com.google.common.collect.Lists.newArrayList(this.metadataCollector.metadataEntries)));
        }
        if (z) {
            byteBufferAllocate = androidx.media3.muxer.Boxes.mvex(arrayList8);
            c = 0;
        } else {
            c = 0;
            byteBufferAllocate = java.nio.ByteBuffer.allocate(0);
        }
        java.nio.ByteBuffer byteBufferMoov = androidx.media3.muxer.Boxes.moov(byteBufferMvhd, byteBufferUdta, byteBufferMeta, arrayList7, byteBufferAllocate);
        if (this.metadataCollector.xmpData == null) {
            return byteBufferMoov;
        }
        java.nio.ByteBuffer[] byteBufferArr4 = new java.nio.ByteBuffer[2];
        byteBufferArr4[c] = byteBufferMoov;
        byteBufferArr4[1] = androidx.media3.muxer.Boxes.uuid(androidx.media3.muxer.Boxes.XMP_UUID, java.nio.ByteBuffer.wrap(this.metadataCollector.xmpData.data));
        return androidx.media3.muxer.BoxUtils.concatenateBuffers(byteBufferArr4);
    }

    private static java.lang.String bcp47LanguageTagToIso3(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.Locale localeForLanguageTag = androidx.media3.common.util.Util.SDK_INT >= 21 ? java.util.Locale.forLanguageTag(str) : new java.util.Locale(str);
        return localeForLanguageTag.getISO3Language().isEmpty() ? str : localeForLanguageTag.getISO3Language();
    }

    private static long usFromVu(long j, long j2) {
        return (j * 1000000) / j2;
    }
}
