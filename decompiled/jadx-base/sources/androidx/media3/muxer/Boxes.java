package androidx.media3.muxer;

/* JADX INFO: loaded from: classes.dex */
final class Boxes {
    public static final int BOX_HEADER_SIZE = 8;
    private static final int BYTES_PER_INTEGER = 4;
    private static final int MAX_FIXED_LEAF_BOX_SIZE = 200;
    public static final int MFHD_BOX_CONTENT_SIZE = 8;
    private static final long MVHD_TIMEBASE = 10000;
    public static final int TFHD_BOX_CONTENT_SIZE = 16;
    private static final int TRUN_BOX_NON_SYNC_SAMPLE_FLAGS = 16842752;
    private static final int TRUN_BOX_SYNC_SAMPLE_FLAGS = 33554432;
    public static final com.google.common.collect.ImmutableList<java.lang.Byte> XMP_UUID = com.google.common.collect.ImmutableList.of((byte) -66, (byte) 122, (byte) -49, (byte) -53, (byte) -105, (byte) -87, (byte) 66, (byte) -24, (byte) -100, (byte) 113, (byte) -103, (byte) -108, (byte) -111, (byte) -29, (byte) -81, (byte) -84);

    public static int getTrunBoxContentSize(int i, boolean z) {
        return ((z ? 4 : 3) * i * 4) + 12;
    }

    private Boxes() {
    }

    public static java.nio.ByteBuffer tkhd(int i, long j, int i2, int i3, int i4, androidx.media3.common.Format format) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(7);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(i3);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt((int) vuFromUs(j, 10000L));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort(androidx.media3.common.MimeTypes.isAudio(format.sampleMimeType) ? (short) 256 : (short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put(rotationMatrixFromOrientation(i4));
        int i5 = format.width != -1 ? format.width : 0;
        int i6 = format.height != -1 ? format.height : 0;
        byteBufferAllocate.putInt(i5 << 16);
        byteBufferAllocate.putInt(i6 << 16);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("tkhd", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer mvhd(int i, int i2, int i3, long j) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(i3);
        byteBufferAllocate.putInt(10000);
        byteBufferAllocate.putInt((int) vuFromUs(j, 10000L));
        byteBufferAllocate.putInt(65536);
        byteBufferAllocate.putShort((short) 256);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        int[] iArr = {65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824};
        for (int i4 = 0; i4 < 9; i4++) {
            byteBufferAllocate.putInt(iArr[i4]);
        }
        for (int i5 = 0; i5 < 6; i5++) {
            byteBufferAllocate.putInt(0);
        }
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("mvhd", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer mdhd(long j, int i, int i2, int i3, java.lang.String str) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.putInt(i3);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putInt((int) j);
        byteBufferAllocate.putShort(languageCodeFromString(str));
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("mdhd", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer vmhd() {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("vmhd", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer smhd() {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("smhd", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer nmhd() {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("nmhd", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer textMetaDataSampleEntry(androidx.media3.common.Format format) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(200);
        byte[] utf8Bytes = androidx.media3.common.util.Util.getUtf8Bytes((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType));
        byteBufferAllocate.put(utf8Bytes);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put(utf8Bytes);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("mett", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer minf(java.nio.ByteBuffer... byteBufferArr) {
        return androidx.media3.muxer.BoxUtils.wrapBoxesIntoBox("minf", java.util.Arrays.asList(byteBufferArr));
    }

    public static java.nio.ByteBuffer dref(java.nio.ByteBuffer... byteBufferArr) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(byteBufferArr.length);
        byteBufferAllocate.flip();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(byteBufferAllocate);
        java.util.Collections.addAll(arrayList, byteBufferArr);
        return androidx.media3.muxer.BoxUtils.wrapBoxesIntoBox("dref", arrayList);
    }

    public static java.nio.ByteBuffer dinf(java.nio.ByteBuffer byteBuffer) {
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("dinf", byteBuffer);
    }

    public static java.nio.ByteBuffer localUrl() {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("url ", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer hdlr(java.lang.String str, java.lang.String str2) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(androidx.media3.common.util.Util.getUtf8Bytes(str));
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put(androidx.media3.common.util.Util.getUtf8Bytes(str2));
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("hdlr", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer mdia(java.nio.ByteBuffer... byteBufferArr) {
        return androidx.media3.muxer.BoxUtils.wrapBoxesIntoBox("mdia", java.util.Arrays.asList(byteBufferArr));
    }

    public static java.nio.ByteBuffer trak(java.nio.ByteBuffer... byteBufferArr) {
        return androidx.media3.muxer.BoxUtils.wrapBoxesIntoBox("trak", java.util.Arrays.asList(byteBufferArr));
    }

    public static java.nio.ByteBuffer udta(androidx.media3.container.Mp4LocationData mp4LocationData) {
        if (mp4LocationData == null) {
            return java.nio.ByteBuffer.allocate(0);
        }
        java.lang.String invariant = androidx.media3.common.util.Util.formatInvariant("%+.4f%+.4f/", java.lang.Float.valueOf(mp4LocationData.latitude), java.lang.Float.valueOf(mp4LocationData.longitude));
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(invariant.length() + 2 + 2);
        byteBufferAllocate.putShort((short) (byteBufferAllocate.capacity() - 4));
        byteBufferAllocate.putShort((short) 5575);
        byteBufferAllocate.put(androidx.media3.common.util.Util.getUtf8Bytes(invariant));
        androidx.media3.common.util.Assertions.checkState(byteBufferAllocate.limit() == byteBufferAllocate.capacity());
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("udta", androidx.media3.muxer.BoxUtils.wrapIntoBox(new byte[]{-87, 120, 121, 122}, byteBufferAllocate));
    }

    public static java.nio.ByteBuffer keys(java.util.List<androidx.media3.container.MdtaMetadataEntry> list) {
        int length = 0;
        for (int i = 0; i < list.size(); i++) {
            length += list.get(i).key.length() + 8;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(length + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            byteBufferAllocate.put(androidx.media3.muxer.BoxUtils.wrapIntoBox("mdta", java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.getUtf8Bytes(list.get(i2).key))));
        }
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox(com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, byteBufferAllocate);
    }

    public static java.nio.ByteBuffer ilst(java.util.List<androidx.media3.container.MdtaMetadataEntry> list) {
        int i = 0;
        int length = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            length += list.get(i2).value.length + 16 + 8;
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(length);
        while (i < list.size()) {
            int i3 = i + 1;
            androidx.media3.container.MdtaMetadataEntry mdtaMetadataEntry = list.get(i);
            java.nio.ByteBuffer byteBufferAllocate2 = java.nio.ByteBuffer.allocate(mdtaMetadataEntry.value.length + 8);
            byteBufferAllocate2.putInt(mdtaMetadataEntry.typeIndicator);
            byteBufferAllocate2.putInt(mdtaMetadataEntry.localeIndicator);
            byteBufferAllocate2.put(mdtaMetadataEntry.value);
            byteBufferAllocate2.flip();
            java.nio.ByteBuffer byteBufferWrapIntoBox = androidx.media3.muxer.BoxUtils.wrapIntoBox("data", byteBufferAllocate2);
            byteBufferAllocate.putInt(byteBufferWrapIntoBox.remaining() + 8);
            byteBufferAllocate.putInt(i3);
            byteBufferAllocate.put(byteBufferWrapIntoBox);
            i = i3;
        }
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("ilst", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer meta(java.nio.ByteBuffer... byteBufferArr) {
        return androidx.media3.muxer.BoxUtils.wrapBoxesIntoBox(com.adjust.sdk.Constants.REFERRER_API_META, java.util.Arrays.asList(byteBufferArr));
    }

    public static java.nio.ByteBuffer uuid(java.util.List<java.lang.Byte> list, java.nio.ByteBuffer byteBuffer) {
        androidx.media3.common.util.Assertions.checkArgument(byteBuffer.remaining() > 0);
        return androidx.media3.muxer.BoxUtils.wrapBoxesIntoBox("uuid", com.google.common.collect.ImmutableList.of(java.nio.ByteBuffer.wrap(com.google.common.primitives.Bytes.toArray(list)), byteBuffer));
    }

    public static java.nio.ByteBuffer moov(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, java.util.List<java.nio.ByteBuffer> list, java.nio.ByteBuffer byteBuffer4) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(byteBuffer);
        arrayList.add(byteBuffer2);
        arrayList.add(byteBuffer3);
        arrayList.addAll(list);
        arrayList.add(byteBuffer4);
        return androidx.media3.muxer.BoxUtils.wrapBoxesIntoBox("moov", arrayList);
    }

    public static java.nio.ByteBuffer audioSampleEntry(androidx.media3.common.Format format) {
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType);
        androidx.media3.common.util.Assertions.checkArgument(str.equals(androidx.media3.common.MimeTypes.AUDIO_AAC), "Unsupported audio format: " + str);
        androidx.media3.common.util.Assertions.checkArgument(!format.initializationData.isEmpty(), "csd-0 not found in the format.");
        byte[] bArr = format.initializationData.get(0);
        androidx.media3.common.util.Assertions.checkArgument(bArr.length > 0, "csd-0 is empty.");
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBufferWrap.limit() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) format.channelCount);
        byteBufferAllocate.putShort((short) 16);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putInt(format.sampleRate << 16);
        byteBufferAllocate.put(audioEsdsBox(byteBufferWrap, format.peakBitrate, format.averageBitrate));
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("mp4a", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer codecSpecificBox(androidx.media3.common.Format format) {
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType);
        str.hashCode();
        switch (str) {
            case "video/av01":
                return av1CBox(format);
            case "video/hevc":
                return hvcCBox(format);
            case "video/avc":
                return avcCBox(format);
            default:
                throw new java.lang.IllegalArgumentException("Unsupported video format: " + str);
        }
    }

    public static java.nio.ByteBuffer videoSampleEntry(androidx.media3.common.Format format) {
        java.nio.ByteBuffer byteBufferCodecSpecificBox = codecSpecificBox(format);
        java.lang.String strCodecSpecificFourcc = codecSpecificFourcc(format);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBufferCodecSpecificBox.limit() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort(format.width != -1 ? (short) format.width : (short) 0);
        byteBufferAllocate.putShort(format.height != -1 ? (short) format.height : (short) 0);
        byteBufferAllocate.putInt(4718592);
        byteBufferAllocate.putInt(4718592);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putLong(0L);
        byteBufferAllocate.putShort((short) 24);
        byteBufferAllocate.putShort((short) -1);
        byteBufferAllocate.put(byteBufferCodecSpecificBox);
        byteBufferAllocate.put(paspBox());
        if (format.colorInfo != null && (format.colorInfo.colorSpace != 0 || format.colorInfo.colorTransfer != 0 || format.colorInfo.colorRange != 0)) {
            byteBufferAllocate.put(colrBox(format.colorInfo));
        }
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox(strCodecSpecificFourcc, byteBufferAllocate);
    }

    public static java.util.List<java.lang.Long> convertPresentationTimestampsToDurationsVu(java.util.List<android.media.MediaCodec.BufferInfo> list, long j, int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
        if (list.isEmpty()) {
            return arrayList2;
        }
        long j2 = 0;
        int i3 = 0;
        boolean z = false;
        while (i3 < list.size()) {
            long j3 = list.get(i3).presentationTimeUs;
            arrayList.add(java.lang.Long.valueOf(j3));
            if (j3 < j2) {
                z = true;
            }
            i3++;
            j2 = j3;
        }
        if (z) {
            java.util.Collections.sort(arrayList);
        }
        long j4 = j;
        int i4 = 1;
        while (i4 < arrayList.size()) {
            long jLongValue = ((java.lang.Long) arrayList.get(i4)).longValue();
            long j5 = i;
            long jVuFromUs = vuFromUs(jLongValue, j5) - vuFromUs(j4, j5);
            if (jVuFromUs > 2147483647L) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "Timestamp delta %d doesn't fit into an int", java.lang.Long.valueOf(jVuFromUs)));
            }
            arrayList2.add(java.lang.Long.valueOf(jVuFromUs));
            i4++;
            j4 = jLongValue;
        }
        arrayList2.add(0L);
        adjustLastSampleDuration(arrayList2, i2);
        return arrayList2;
    }

    public static java.nio.ByteBuffer stts(java.util.List<java.lang.Long> list) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate((list.size() * 8) + 200);
        byteBufferAllocate.putInt(0);
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.putInt(0);
        int i = -1;
        long j = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue = list.get(i3).longValue();
            if (j != jLongValue) {
                int iPosition2 = byteBufferAllocate.position();
                byteBufferAllocate.putInt(1);
                byteBufferAllocate.putInt((int) jLongValue);
                i2++;
                i = iPosition2;
                j = jLongValue;
            } else {
                byteBufferAllocate.putInt(i, byteBufferAllocate.getInt(i) + 1);
            }
        }
        byteBufferAllocate.putInt(iPosition, i2);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("stts", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer ctts(java.util.List<android.media.MediaCodec.BufferInfo> list, java.util.List<java.lang.Long> list2, int i) {
        java.util.List<java.lang.Integer> listCalculateSampleCompositionTimeOffsets = calculateSampleCompositionTimeOffsets(list, list2, i);
        if (listCalculateSampleCompositionTimeOffsets.isEmpty()) {
            return java.nio.ByteBuffer.allocate(0);
        }
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate((listCalculateSampleCompositionTimeOffsets.size() * 2 * 4) + 8);
        byteBufferAllocate.putInt(1);
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.putInt(0);
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < listCalculateSampleCompositionTimeOffsets.size(); i5++) {
            int iIntValue = listCalculateSampleCompositionTimeOffsets.get(i5).intValue();
            if (i2 != iIntValue) {
                int iPosition2 = byteBufferAllocate.position();
                byteBufferAllocate.putInt(1);
                byteBufferAllocate.putInt(iIntValue);
                i4++;
                i3 = iPosition2;
                i2 = iIntValue;
            } else {
                byteBufferAllocate.putInt(i3, byteBufferAllocate.getInt(i3) + 1);
            }
        }
        byteBufferAllocate.putInt(iPosition, i4);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("ctts", byteBufferAllocate);
    }

    public static java.util.List<java.lang.Integer> calculateSampleCompositionTimeOffsets(java.util.List<android.media.MediaCodec.BufferInfo> list, java.util.List<java.lang.Long> list2, int i) {
        java.util.List<android.media.MediaCodec.BufferInfo> list3 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        if (list.isEmpty()) {
            return arrayList;
        }
        boolean z = false;
        long j = list3.get(0).presentationTimeUs;
        long jLongValue = 0;
        int i2 = 0;
        boolean z2 = false;
        long j2 = 0;
        while (i2 < list.size()) {
            long j3 = list3.get(i2).presentationTimeUs - j;
            long jVuFromUs = vuFromUs(j3, i) - jLongValue;
            if (jVuFromUs <= 2147483647L) {
                z = true;
            }
            androidx.media3.common.util.Assertions.checkState(z, "Only 32-bit offset is allowed");
            jLongValue += list2.get(i2).longValue();
            arrayList.add(java.lang.Integer.valueOf((int) jVuFromUs));
            if (j3 < j2) {
                z2 = true;
            }
            i2++;
            list3 = list;
            j2 = j3;
            z = false;
        }
        if (!z2) {
            arrayList.clear();
        }
        return arrayList;
    }

    public static java.nio.ByteBuffer stsz(java.util.List<android.media.MediaCodec.BufferInfo> list) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate((list.size() * 4) + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i = 0; i < list.size(); i++) {
            byteBufferAllocate.putInt(list.get(i).size);
        }
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("stsz", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer stsc(java.util.List<java.lang.Integer> list) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate((list.size() * 12) + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        int i = 1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iIntValue = list.get(i2).intValue();
            byteBufferAllocate.putInt(i);
            byteBufferAllocate.putInt(iIntValue);
            byteBufferAllocate.putInt(1);
            i++;
        }
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("stsc", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer stco(java.util.List<java.lang.Long> list) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate((list.size() * 4) + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i = 0; i < list.size(); i++) {
            long jLongValue = list.get(i).longValue();
            androidx.media3.common.util.Assertions.checkState(jLongValue <= androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE, "Only 32-bit chunk offset is allowed");
            byteBufferAllocate.putInt((int) jLongValue);
        }
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("stco", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer co64(java.util.List<java.lang.Long> list) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate((list.size() * 2 * 4) + 8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(list.size());
        for (int i = 0; i < list.size(); i++) {
            byteBufferAllocate.putLong(list.get(i).longValue());
        }
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("co64", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer stss(java.util.List<android.media.MediaCodec.BufferInfo> list) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate((list.size() * 4) + 200);
        byteBufferAllocate.putInt(0);
        int iPosition = byteBufferAllocate.position();
        byteBufferAllocate.putInt(list.size());
        int i = 0;
        int i2 = 1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if ((list.get(i3).flags & 1) > 0) {
                byteBufferAllocate.putInt(i2);
                i++;
            }
            i2++;
        }
        byteBufferAllocate.putInt(iPosition, i);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("stss", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer stsd(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBuffer.limit() + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("stsd", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer stbl(java.nio.ByteBuffer... byteBufferArr) {
        return androidx.media3.muxer.BoxUtils.wrapBoxesIntoBox("stbl", java.util.Arrays.asList(byteBufferArr));
    }

    public static java.nio.ByteBuffer ftyp() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.getUtf8Bytes("isom")));
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(131072);
        byteBufferAllocate.flip();
        arrayList.add(byteBufferAllocate);
        java.lang.String[] strArr = {"isom", "iso2", "mp41"};
        for (int i = 0; i < 3; i++) {
            arrayList.add(java.nio.ByteBuffer.wrap(androidx.media3.common.util.Util.getUtf8Bytes(strArr[i])));
        }
        return androidx.media3.muxer.BoxUtils.wrapBoxesIntoBox("ftyp", arrayList);
    }

    public static java.nio.ByteBuffer moof(java.nio.ByteBuffer byteBuffer, java.util.List<java.nio.ByteBuffer> list) {
        return androidx.media3.muxer.BoxUtils.wrapBoxesIntoBox("moof", new com.google.common.collect.ImmutableList.Builder().add(byteBuffer).addAll((java.lang.Iterable) list).build());
    }

    public static java.nio.ByteBuffer mfhd(int i) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("mfhd", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer traf(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2) {
        return androidx.media3.muxer.BoxUtils.wrapBoxesIntoBox("traf", com.google.common.collect.ImmutableList.of(byteBuffer, byteBuffer2));
    }

    public static java.nio.ByteBuffer tfhd(int i, long j) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(16);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("tfhd", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer trun(java.util.List<androidx.media3.muxer.FragmentedMp4Writer.SampleMetadata> list, int i, boolean z) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(getTrunBoxContentSize(list.size(), z));
        byteBufferAllocate.putInt(z ? 16781057 : 16779009);
        byteBufferAllocate.putInt(list.size());
        byteBufferAllocate.putInt(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            androidx.media3.muxer.FragmentedMp4Writer.SampleMetadata sampleMetadata = list.get(i2);
            byteBufferAllocate.putInt((int) sampleMetadata.durationVu);
            byteBufferAllocate.putInt(sampleMetadata.size);
            byteBufferAllocate.putInt((sampleMetadata.flags & 1) != 0 ? TRUN_BOX_SYNC_SAMPLE_FLAGS : 16842752);
            if (z) {
                byteBufferAllocate.putInt(sampleMetadata.compositionTimeOffsetVu);
            }
        }
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("trun", byteBufferAllocate);
    }

    public static java.nio.ByteBuffer mvex(java.util.List<java.nio.ByteBuffer> list) {
        return androidx.media3.muxer.BoxUtils.wrapBoxesIntoBox("mvex", list);
    }

    public static java.nio.ByteBuffer trex(int i) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(24);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("trex", byteBufferAllocate);
    }

    private static void adjustLastSampleDuration(java.util.List<java.lang.Long> list, int i) {
        if (list.size() <= 2) {
            return;
        }
        if (i == 0) {
            androidx.media3.common.util.Assertions.checkState(((java.lang.Long) com.google.common.collect.Iterables.getLast(list)).longValue() == 0);
        } else {
            if (i == 1) {
                list.set(list.size() - 1, list.get(list.size() - 2));
                return;
            }
            throw new java.lang.IllegalArgumentException("Unexpected value for the last frame duration behavior " + i);
        }
    }

    private static java.nio.ByteBuffer avcCBox(androidx.media3.common.Format format) {
        androidx.media3.common.util.Assertions.checkArgument(format.initializationData.size() >= 2, "csd-0 and/or csd-1 not found in the format.");
        byte[] bArr = format.initializationData.get(0);
        androidx.media3.common.util.Assertions.checkArgument(bArr.length > 0, "csd-0 is empty.");
        byte[] bArr2 = format.initializationData.get(1);
        androidx.media3.common.util.Assertions.checkArgument(bArr2.length > 0, "csd-1 is empty.");
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        java.nio.ByteBuffer byteBufferWrap2 = java.nio.ByteBuffer.wrap(bArr2);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBufferWrap.limit() + byteBufferWrap2.limit() + 200);
        byteBufferAllocate.put((byte) 1);
        com.google.common.collect.ImmutableList<java.nio.ByteBuffer> immutableListFindNalUnits = androidx.media3.muxer.AnnexBUtils.findNalUnits(byteBufferWrap);
        androidx.media3.common.util.Assertions.checkArgument(immutableListFindNalUnits.size() == 1, "SPS data not found in csd0.");
        java.nio.ByteBuffer byteBuffer = immutableListFindNalUnits.get(0);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr3 = new byte[iRemaining];
        byteBuffer.get(bArr3);
        byteBuffer.rewind();
        androidx.media3.container.NalUnitUtil.SpsData spsNalUnit = androidx.media3.container.NalUnitUtil.parseSpsNalUnit(bArr3, 0, iRemaining);
        byteBufferAllocate.put((byte) spsNalUnit.profileIdc);
        byteBufferAllocate.put((byte) spsNalUnit.constraintsFlagsAndReservedZero2Bits);
        byteBufferAllocate.put((byte) spsNalUnit.levelIdc);
        byteBufferAllocate.put((byte) -1);
        byteBufferAllocate.put((byte) -31);
        byteBufferAllocate.putShort((short) byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer);
        byteBuffer.rewind();
        com.google.common.collect.ImmutableList<java.nio.ByteBuffer> immutableListFindNalUnits2 = androidx.media3.muxer.AnnexBUtils.findNalUnits(byteBufferWrap2);
        androidx.media3.common.util.Assertions.checkState(immutableListFindNalUnits2.size() == 1, "PPS data not found in csd1.");
        byteBufferAllocate.put((byte) 1);
        java.nio.ByteBuffer byteBuffer2 = immutableListFindNalUnits2.get(0);
        byteBufferAllocate.putShort((short) byteBuffer2.remaining());
        byteBufferAllocate.put(byteBuffer2);
        byteBuffer2.rewind();
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("avcC", byteBufferAllocate);
    }

    private static java.nio.ByteBuffer hvcCBox(androidx.media3.common.Format format) {
        androidx.media3.common.util.Assertions.checkArgument(!format.initializationData.isEmpty(), "csd-0 not found in the format.");
        byte[] bArr = format.initializationData.get(0);
        androidx.media3.common.util.Assertions.checkArgument(bArr.length > 0, "csd-0 is empty.");
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBufferWrap.limit() + 200);
        com.google.common.collect.ImmutableList<java.nio.ByteBuffer> immutableListFindNalUnits = androidx.media3.muxer.AnnexBUtils.findNalUnits(byteBufferWrap);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < immutableListFindNalUnits.size(); i++) {
            arrayList.add(androidx.media3.muxer.AnnexBUtils.stripEmulationPrevention(immutableListFindNalUnits.get(i)));
        }
        byteBufferAllocate.put((byte) 1);
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) arrayList.get(0);
        if (byteBuffer.get(byteBuffer.position()) != 64) {
            throw new java.lang.IllegalArgumentException("First NALU in csd-0 is not the VPS.");
        }
        byteBufferAllocate.put(byteBuffer.get(6));
        byteBufferAllocate.putInt(byteBuffer.getInt(7));
        byteBufferAllocate.putInt(byteBuffer.getInt(11));
        byteBufferAllocate.putShort(byteBuffer.getShort(15));
        byteBufferAllocate.put(byteBuffer.get(17));
        byteBufferAllocate.putShort((short) -4096);
        byteBufferAllocate.put((byte) -4);
        java.nio.ByteBuffer byteBuffer2 = immutableListFindNalUnits.get(1);
        int iRemaining = byteBuffer2.remaining();
        byte[] bArr2 = new byte[iRemaining];
        byteBuffer2.get(bArr2);
        byteBuffer2.rewind();
        androidx.media3.container.NalUnitUtil.H265SpsData h265SpsNalUnit = androidx.media3.container.NalUnitUtil.parseH265SpsNalUnit(bArr2, 0, iRemaining);
        byte b = (byte) (h265SpsNalUnit.chromaFormatIdc | 252);
        byte b2 = (byte) (h265SpsNalUnit.bitDepthLumaMinus8 | 248);
        byte b3 = (byte) (h265SpsNalUnit.bitDepthChromaMinus8 | 248);
        byteBufferAllocate.put(b);
        byteBufferAllocate.put(b2);
        byteBufferAllocate.put(b3);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put((byte) 15);
        byteBufferAllocate.put((byte) immutableListFindNalUnits.size());
        for (int i2 = 0; i2 < immutableListFindNalUnits.size(); i2++) {
            java.nio.ByteBuffer byteBuffer3 = immutableListFindNalUnits.get(i2);
            byteBufferAllocate.put((byte) ((byteBuffer3.get(0) >> 1) & 63));
            byteBufferAllocate.putShort((short) 1);
            byteBufferAllocate.putShort((short) byteBuffer3.limit());
            byteBufferAllocate.put(byteBuffer3);
        }
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("hvcC", byteBufferAllocate);
    }

    private static java.nio.ByteBuffer av1CBox(androidx.media3.common.Format format) {
        androidx.media3.common.util.Assertions.checkArgument(!format.initializationData.isEmpty(), "csd-0 is not found in the format");
        byte[] bArr = format.initializationData.get(0);
        androidx.media3.common.util.Assertions.checkArgument(bArr.length > 0, "csd-0 is empty.");
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("av1C", java.nio.ByteBuffer.wrap(bArr));
    }

    private static java.nio.ByteBuffer paspBox() {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(65536);
        byteBufferAllocate.putInt(65536);
        byteBufferAllocate.rewind();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("pasp", byteBufferAllocate);
    }

    private static java.nio.ByteBuffer colrBox(androidx.media3.common.ColorInfo colorInfo) {
        short sShortValue;
        short sShortValue2;
        short sShortValue3;
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(20);
        byteBufferAllocate.put((byte) 110);
        byteBufferAllocate.put((byte) 99);
        byteBufferAllocate.put((byte) 108);
        byteBufferAllocate.put((byte) 120);
        byte b = 0;
        if (colorInfo.colorSpace != -1) {
            int i = colorInfo.colorSpace;
            if (i < 0 || i >= androidx.media3.muxer.ColorUtils.MEDIAFORMAT_STANDARD_TO_PRIMARIES_AND_MATRIX.size()) {
                throw new java.lang.IllegalArgumentException("Color standard not implemented: " + i);
            }
            sShortValue2 = androidx.media3.muxer.ColorUtils.MEDIAFORMAT_STANDARD_TO_PRIMARIES_AND_MATRIX.get(i).get(0).shortValue();
            sShortValue = androidx.media3.muxer.ColorUtils.MEDIAFORMAT_STANDARD_TO_PRIMARIES_AND_MATRIX.get(i).get(1).shortValue();
        } else {
            sShortValue = 0;
            sShortValue2 = 0;
        }
        if (colorInfo.colorTransfer != -1) {
            int i2 = colorInfo.colorTransfer;
            if (i2 < 0 || i2 >= androidx.media3.muxer.ColorUtils.MEDIAFORMAT_TRANSFER_TO_MP4_TRANSFER.size()) {
                throw new java.lang.IllegalArgumentException("Color transfer not implemented: " + i2);
            }
            sShortValue3 = androidx.media3.muxer.ColorUtils.MEDIAFORMAT_TRANSFER_TO_MP4_TRANSFER.get(i2).shortValue();
        } else {
            sShortValue3 = 0;
        }
        if (colorInfo.colorRange != -1) {
            int i3 = colorInfo.colorRange;
            if (i3 < 0 || i3 > 2) {
                throw new java.lang.IllegalArgumentException("Color range not implemented: " + i3);
            }
            if (i3 == 1) {
                b = -128;
            }
        }
        byteBufferAllocate.putShort(sShortValue2);
        byteBufferAllocate.putShort(sShortValue3);
        byteBufferAllocate.putShort(sShortValue);
        byteBufferAllocate.put(b);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("colr", byteBufferAllocate);
    }

    private static java.lang.String codecSpecificFourcc(androidx.media3.common.Format format) {
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType);
        str.hashCode();
        switch (str) {
            case "video/av01":
                return "av01";
            case "video/hevc":
                return "hvc1";
            case "video/avc":
                return "avc1";
            default:
                throw new java.lang.IllegalArgumentException("Unsupported video format: " + str);
        }
    }

    private static java.nio.ByteBuffer audioEsdsBox(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        int iLimit = byteBuffer.limit();
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(iLimit + 200);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.put((byte) 3);
        androidx.media3.common.util.Assertions.checkArgument(iLimit + 21 < 127, "CSD too long; we might need variable-length encoding?");
        byteBufferAllocate.put((byte) (iLimit + 23));
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.put((byte) 4);
        byteBufferAllocate.put((byte) (iLimit + 15));
        byteBufferAllocate.put((byte) 64);
        byteBufferAllocate.put((byte) 21);
        byteBufferAllocate.putShort((short) 3);
        byteBufferAllocate.put((byte) 0);
        if (i == -1) {
            i = 0;
        }
        byteBufferAllocate.putInt(i);
        if (i2 == -1) {
            i2 = 0;
        }
        byteBufferAllocate.putInt(i2);
        byteBufferAllocate.put((byte) 5);
        byteBufferAllocate.put((byte) iLimit);
        byteBufferAllocate.put(byteBuffer);
        byteBuffer.rewind();
        byteBufferAllocate.put((byte) 6);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) 2);
        byteBufferAllocate.flip();
        return androidx.media3.muxer.BoxUtils.wrapIntoBox("esds", byteBufferAllocate);
    }

    private static short languageCodeFromString(java.lang.String str) {
        if (str == null) {
            return (short) 0;
        }
        byte[] utf8Bytes = androidx.media3.common.util.Util.getUtf8Bytes(str);
        if (utf8Bytes.length != 3) {
            throw new java.lang.IllegalArgumentException("Non-length-3 language code: " + str);
        }
        int i = (utf8Bytes[2] & 31) + ((utf8Bytes[1] & 31) << 5) + ((utf8Bytes[0] & 31) << 10);
        androidx.media3.common.util.Assertions.checkState((32768 & i) == 0);
        return (short) (i & 65535);
    }

    private static byte[] rotationMatrixFromOrientation(int i) {
        if (i == 0) {
            return androidx.media3.common.util.Util.toByteArray(65536, 0, 0, 0, 65536, 0, 0, 0, 1073741824);
        }
        if (i == 90) {
            return androidx.media3.common.util.Util.toByteArray(0, 65536, 0, -65536, 0, 0, 0, 0, 1073741824);
        }
        if (i == 180) {
            return androidx.media3.common.util.Util.toByteArray(-65536, 0, 0, 0, -65536, 0, 0, 0, 1073741824);
        }
        if (i == 270) {
            return androidx.media3.common.util.Util.toByteArray(0, -65536, 0, 65536, 0, 0, 0, 0, 1073741824);
        }
        throw new java.lang.IllegalArgumentException("invalid orientation " + i);
    }

    private static long vuFromUs(long j, long j2) {
        return (j * j2) / 1000000;
    }
}
