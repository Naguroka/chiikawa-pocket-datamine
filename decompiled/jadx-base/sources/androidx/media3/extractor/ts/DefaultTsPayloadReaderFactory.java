package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultTsPayloadReaderFactory implements androidx.media3.extractor.ts.TsPayloadReader.Factory {
    private static final int DESCRIPTOR_TAG_CAPTION_SERVICE = 134;
    public static final int FLAG_ALLOW_NON_IDR_KEYFRAMES = 1;
    public static final int FLAG_DETECT_ACCESS_UNITS = 8;
    public static final int FLAG_ENABLE_HDMV_DTS_AUDIO_STREAMS = 64;
    public static final int FLAG_IGNORE_AAC_STREAM = 2;
    public static final int FLAG_IGNORE_H264_STREAM = 4;
    public static final int FLAG_IGNORE_SPLICE_INFO_STREAM = 16;
    public static final int FLAG_OVERRIDE_CAPTION_DESCRIPTORS = 32;
    private final java.util.List<androidx.media3.common.Format> closedCaptionFormats;
    private final int flags;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
        this(0);
    }

    public DefaultTsPayloadReaderFactory(int i) {
        this(i, com.google.common.collect.ImmutableList.of());
    }

    public DefaultTsPayloadReaderFactory(int i, java.util.List<androidx.media3.common.Format> list) {
        this.flags = i;
        this.closedCaptionFormats = list;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader.Factory
    public android.util.SparseArray<androidx.media3.extractor.ts.TsPayloadReader> createInitialPayloadReaders() {
        return new android.util.SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0057  */
    @Override // androidx.media3.extractor.ts.TsPayloadReader.Factory
    public androidx.media3.extractor.ts.TsPayloadReader createPayloadReader(int i, androidx.media3.extractor.ts.TsPayloadReader.EsInfo esInfo) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.MpegAudioReader(esInfo.language, esInfo.getRoleFlags()));
            }
            if (i == 21) {
                return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.Id3Reader());
            }
            if (i == 27) {
                if (isSet(4)) {
                    return null;
                }
                return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.H264Reader(buildSeiReader(esInfo), isSet(1), isSet(8)));
            }
            if (i == 36) {
                return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.H265Reader(buildSeiReader(esInfo)));
            }
            if (i == 45) {
                return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.MpeghReader());
            }
            if (i == 89) {
                return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.DvbSubtitleReader(esInfo.dvbSubtitleInfos));
            }
            if (i == 172) {
                return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.Ac4Reader(esInfo.language, esInfo.getRoleFlags()));
            }
            if (i != 257) {
                if (i != 138) {
                    if (i != 139) {
                        switch (i) {
                            case 15:
                                if (isSet(2)) {
                                    return null;
                                }
                                return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.AdtsReader(false, esInfo.language, esInfo.getRoleFlags()));
                            case 16:
                                return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.H263Reader(buildUserDataReader(esInfo)));
                            case 17:
                                if (isSet(2)) {
                                    return null;
                                }
                                return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.LatmReader(esInfo.language, esInfo.getRoleFlags()));
                            default:
                                switch (i) {
                                    case 128:
                                        break;
                                    case 129:
                                        return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.Ac3Reader(esInfo.language, esInfo.getRoleFlags()));
                                    case 130:
                                        if (!isSet(64)) {
                                            return null;
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 134:
                                                if (isSet(16)) {
                                                    return null;
                                                }
                                                return new androidx.media3.extractor.ts.SectionReader(new androidx.media3.extractor.ts.PassthroughSectionPayloadReader(androidx.media3.common.MimeTypes.APPLICATION_SCTE35));
                                            case 135:
                                                return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.Ac3Reader(esInfo.language, esInfo.getRoleFlags()));
                                            case 136:
                                                break;
                                            default:
                                                return null;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.DtsReader(esInfo.language, esInfo.getRoleFlags(), 5408));
                    }
                }
                return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.DtsReader(esInfo.language, esInfo.getRoleFlags(), 4096));
            }
            return new androidx.media3.extractor.ts.SectionReader(new androidx.media3.extractor.ts.PassthroughSectionPayloadReader(androidx.media3.common.MimeTypes.APPLICATION_AIT));
        }
        return new androidx.media3.extractor.ts.PesReader(new androidx.media3.extractor.ts.H262Reader(buildUserDataReader(esInfo)));
    }

    private androidx.media3.extractor.ts.SeiReader buildSeiReader(androidx.media3.extractor.ts.TsPayloadReader.EsInfo esInfo) {
        return new androidx.media3.extractor.ts.SeiReader(getClosedCaptionFormats(esInfo));
    }

    private androidx.media3.extractor.ts.UserDataReader buildUserDataReader(androidx.media3.extractor.ts.TsPayloadReader.EsInfo esInfo) {
        return new androidx.media3.extractor.ts.UserDataReader(getClosedCaptionFormats(esInfo));
    }

    private java.util.List<androidx.media3.common.Format> getClosedCaptionFormats(androidx.media3.extractor.ts.TsPayloadReader.EsInfo esInfo) {
        java.lang.String str;
        int i;
        java.util.List<byte[]> listBuildCea708InitializationData;
        if (isSet(32)) {
            return this.closedCaptionFormats;
        }
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(esInfo.descriptorBytes);
        java.util.List<androidx.media3.common.Format> arrayList = this.closedCaptionFormats;
        while (parsableByteArray.bytesLeft() > 0) {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
            if (unsignedByte == 134) {
                arrayList = new java.util.ArrayList<>();
                int unsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
                for (int i2 = 0; i2 < unsignedByte2; i2++) {
                    java.lang.String string = parsableByteArray.readString(3);
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    boolean z = (unsignedByte3 & 128) != 0;
                    if (z) {
                        i = unsignedByte3 & 63;
                        str = androidx.media3.common.MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = androidx.media3.common.MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte unsignedByte4 = (byte) parsableByteArray.readUnsignedByte();
                    parsableByteArray.skipBytes(1);
                    if (z) {
                        listBuildCea708InitializationData = androidx.media3.common.util.CodecSpecificDataUtil.buildCea708InitializationData((unsignedByte4 & 64) != 0);
                    } else {
                        listBuildCea708InitializationData = null;
                    }
                    arrayList.add(new androidx.media3.common.Format.Builder().setSampleMimeType(str).setLanguage(string).setAccessibilityChannel(i).setInitializationData(listBuildCea708InitializationData).build());
                }
            }
            parsableByteArray.setPosition(position);
        }
        return arrayList;
    }

    private boolean isSet(int i) {
        return (i & this.flags) != 0;
    }
}
