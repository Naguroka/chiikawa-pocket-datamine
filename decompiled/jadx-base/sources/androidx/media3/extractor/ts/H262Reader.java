package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class H262Reader implements androidx.media3.extractor.ts.ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private static final int START_USER_DATA = 178;
    private final androidx.media3.extractor.ts.H262Reader.CsdBuffer csdBuffer;
    private java.lang.String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private androidx.media3.extractor.TrackOutput output;
    private long pesTimeUs;
    private final boolean[] prefixFlags;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;
    private final androidx.media3.extractor.ts.NalUnitTargetBuffer userData;
    private final androidx.media3.common.util.ParsableByteArray userDataParsable;
    private final androidx.media3.extractor.ts.UserDataReader userDataReader;

    public H262Reader() {
        this(null);
    }

    H262Reader(androidx.media3.extractor.ts.UserDataReader userDataReader) {
        this.userDataReader = userDataReader;
        this.prefixFlags = new boolean[4];
        this.csdBuffer = new androidx.media3.extractor.ts.H262Reader.CsdBuffer(128);
        if (userDataReader != null) {
            this.userData = new androidx.media3.extractor.ts.NalUnitTargetBuffer(178, 128);
            this.userDataParsable = new androidx.media3.common.util.ParsableByteArray();
        } else {
            this.userData = null;
            this.userDataParsable = null;
        }
        this.pesTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.sampleTimeUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void seek() {
        androidx.media3.container.NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        androidx.media3.extractor.ts.NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.reset();
        }
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
        this.pesTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.sampleTimeUs = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void createTracks(androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        androidx.media3.extractor.ts.UserDataReader userDataReader = this.userDataReader;
        if (userDataReader != null) {
            userDataReader.createTracks(extractorOutput, trackIdGenerator);
        }
    }

    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        this.pesTimeUs = j;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0114  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        boolean z;
        int i;
        androidx.media3.common.util.Assertions.checkStateNotNull(this.output);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        this.totalBytesWritten += (long) parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int iFindNalUnit = androidx.media3.container.NalUnitUtil.findNalUnit(data, position, iLimit, this.prefixFlags);
            if (iFindNalUnit == iLimit) {
                break;
            }
            int i2 = iFindNalUnit + 3;
            int i3 = parsableByteArray.getData()[i2] & 255;
            int i4 = iFindNalUnit - position;
            if (!this.hasOutputFormat) {
                if (i4 > 0) {
                    this.csdBuffer.onData(data, position, iFindNalUnit);
                }
                if (this.csdBuffer.onStartCode(i3, i4 < 0 ? -i4 : 0)) {
                    android.util.Pair<androidx.media3.common.Format, java.lang.Long> csdBuffer = parseCsdBuffer(this.csdBuffer, (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.formatId));
                    this.output.format((androidx.media3.common.Format) csdBuffer.first);
                    this.frameDurationUs = ((java.lang.Long) csdBuffer.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            androidx.media3.extractor.ts.NalUnitTargetBuffer nalUnitTargetBuffer = this.userData;
            if (nalUnitTargetBuffer != null) {
                if (i4 > 0) {
                    nalUnitTargetBuffer.appendToNalUnit(data, position, iFindNalUnit);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (this.userData.endNalUnit(i)) {
                    ((androidx.media3.common.util.ParsableByteArray) androidx.media3.common.util.Util.castNonNull(this.userDataParsable)).reset(this.userData.nalData, androidx.media3.container.NalUnitUtil.unescapeStream(this.userData.nalData, this.userData.nalLength));
                    ((androidx.media3.extractor.ts.UserDataReader) androidx.media3.common.util.Util.castNonNull(this.userDataReader)).consume(this.sampleTimeUs, this.userDataParsable);
                }
                if (i3 == 178 && parsableByteArray.getData()[iFindNalUnit + 2] == 1) {
                    this.userData.startNalUnit(i3);
                }
            }
            if (i3 == 0 || i3 == 179) {
                int i5 = iLimit - iFindNalUnit;
                if (this.sampleHasPicture && this.hasOutputFormat) {
                    long j = this.sampleTimeUs;
                    if (j != androidx.media3.common.C.TIME_UNSET) {
                        this.output.sampleMetadata(j, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i5, i5, null);
                    }
                }
                if (!this.startedFirstSample || this.sampleHasPicture) {
                    this.samplePosition = this.totalBytesWritten - ((long) i5);
                    long j2 = this.pesTimeUs;
                    if (j2 == androidx.media3.common.C.TIME_UNSET) {
                        long j3 = this.sampleTimeUs;
                        j2 = j3 != androidx.media3.common.C.TIME_UNSET ? j3 + this.frameDurationUs : -9223372036854775807L;
                    }
                    this.sampleTimeUs = j2;
                    this.sampleIsKeyframe = false;
                    this.pesTimeUs = androidx.media3.common.C.TIME_UNSET;
                    z = true;
                    this.startedFirstSample = true;
                } else {
                    z = true;
                }
                this.sampleHasPicture = i3 == 0 ? z : false;
            } else if (i3 == 184) {
                this.sampleIsKeyframe = true;
            }
            position = i2;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(data, position, iLimit);
        }
        androidx.media3.extractor.ts.NalUnitTargetBuffer nalUnitTargetBuffer2 = this.userData;
        if (nalUnitTargetBuffer2 != null) {
            nalUnitTargetBuffer2.appendToNalUnit(data, position, iLimit);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media3.extractor.ts.ElementaryStreamReader
    public void packetFinished(boolean z) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.output);
        if (z) {
            boolean z2 = this.sampleIsKeyframe;
            this.output.sampleMetadata(this.sampleTimeUs, z2 ? 1 : 0, (int) (this.totalBytesWritten - this.samplePosition), 0, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:20:0x0098  */
    private static android.util.Pair<androidx.media3.common.Format, java.lang.Long> parseCsdBuffer(androidx.media3.extractor.ts.H262Reader.CsdBuffer csdBuffer, java.lang.String str) {
        float f;
        int i;
        float f2;
        int i2;
        long j;
        double[] dArr;
        double d;
        int i3;
        int i4;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(csdBuffer.data, csdBuffer.length);
        int i5 = bArrCopyOf[4] & 255;
        int i6 = bArrCopyOf[5] & 255;
        int i7 = (i5 << 4) | (i6 >> 4);
        int i8 = ((i6 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i9 = (bArrCopyOf[7] & 240) >> 4;
        if (i9 == 2) {
            f = i8 * 4;
            i = i7 * 3;
        } else {
            if (i9 != 3) {
                if (i9 != 4) {
                    f2 = 1.0f;
                } else {
                    f = i8 * 121;
                    i = i7 * 100;
                }
                androidx.media3.common.Format formatBuild = new androidx.media3.common.Format.Builder().setId(str).setSampleMimeType(androidx.media3.common.MimeTypes.VIDEO_MPEG2).setWidth(i7).setHeight(i8).setPixelWidthHeightRatio(f2).setInitializationData(java.util.Collections.singletonList(bArrCopyOf)).build();
                i2 = (bArrCopyOf[7] & 15) - 1;
                if (i2 >= 0) {
                    dArr = FRAME_RATE_VALUES;
                    if (i2 < dArr.length) {
                        d = dArr[i2];
                        byte b = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                        i3 = (b & 96) >> 5;
                        i4 = b & 31;
                        if (i3 != i4) {
                            d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                        }
                        j = (long) (1000000.0d / d);
                    } else {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                return android.util.Pair.create(formatBuild, java.lang.Long.valueOf(j));
            }
            f = i8 * 16;
            i = i7 * 9;
        }
        f2 = f / i;
        androidx.media3.common.Format formatBuild2 = new androidx.media3.common.Format.Builder().setId(str).setSampleMimeType(androidx.media3.common.MimeTypes.VIDEO_MPEG2).setWidth(i7).setHeight(i8).setPixelWidthHeightRatio(f2).setInitializationData(java.util.Collections.singletonList(bArrCopyOf)).build();
        i2 = (bArrCopyOf[7] & 15) - 1;
        if (i2 >= 0) {
            dArr = FRAME_RATE_VALUES;
            if (i2 < dArr.length) {
                d = dArr[i2];
                byte b2 = bArrCopyOf[csdBuffer.sequenceExtensionPosition + 9];
                i3 = (b2 & 96) >> 5;
                i4 = b2 & 31;
                if (i3 != i4) {
                    d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                }
                j = (long) (1000000.0d / d);
            } else {
                j = 0;
            }
        } else {
            j = 0;
        }
        return android.util.Pair.create(formatBuild2, java.lang.Long.valueOf(j));
    }

    private static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public CsdBuffer(int i) {
            this.data = new byte[i];
        }

        public void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }

        public boolean onStartCode(int i, int i2) {
            if (this.isFilling) {
                int i3 = this.length - i2;
                this.length = i3;
                if (this.sequenceExtensionPosition == 0 && i == 181) {
                    this.sequenceExtensionPosition = i3;
                } else {
                    this.isFilling = false;
                    return true;
                }
            } else if (i == 179) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public void onData(byte[] bArr, int i, int i2) {
            if (this.isFilling) {
                int i3 = i2 - i;
                byte[] bArr2 = this.data;
                int length = bArr2.length;
                int i4 = this.length;
                if (length < i4 + i3) {
                    this.data = java.util.Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                java.lang.System.arraycopy(bArr, i, this.data, this.length, i3);
                this.length += i3;
            }
        }
    }
}
