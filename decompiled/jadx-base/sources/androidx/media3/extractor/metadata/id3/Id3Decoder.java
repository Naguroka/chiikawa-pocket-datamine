package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class Id3Decoder extends androidx.media3.extractor.metadata.SimpleMetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    public static final androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate NO_FRAMES_PREDICATE = new androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate() { // from class: androidx.media3.extractor.metadata.id3.Id3Decoder$$ExternalSyntheticLambda0
        @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return androidx.media3.extractor.metadata.id3.Id3Decoder.lambda$static$0(i, i2, i3, i4, i5);
        }
    };
    private static final java.lang.String TAG = "Id3Decoder";
    private final androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate;

    public interface FramePredicate {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    private static int delimiterLength(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    static /* synthetic */ boolean lambda$static$0(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public Id3Decoder() {
        this(null);
    }

    public Id3Decoder(androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    protected androidx.media3.common.Metadata decode(androidx.media3.extractor.metadata.MetadataInputBuffer metadataInputBuffer, java.nio.ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public androidx.media3.common.Metadata decode(byte[] bArr, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(bArr, i);
        androidx.media3.extractor.metadata.id3.Id3Decoder.Id3Header id3HeaderDecodeHeader = decodeHeader(parsableByteArray);
        if (id3HeaderDecodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i2 = id3HeaderDecodeHeader.majorVersion == 2 ? 6 : 10;
        int iRemoveUnsynchronization = id3HeaderDecodeHeader.framesSize;
        if (id3HeaderDecodeHeader.isUnsynchronized) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, id3HeaderDecodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + iRemoveUnsynchronization);
        boolean z = false;
        if (!validateFrames(parsableByteArray, id3HeaderDecodeHeader.majorVersion, i2, false)) {
            if (id3HeaderDecodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i2, true)) {
                androidx.media3.common.util.Log.w(TAG, "Failed to validate ID3 tag with majorVersion=" + id3HeaderDecodeHeader.majorVersion);
                return null;
            }
            z = true;
        }
        while (parsableByteArray.bytesLeft() >= i2) {
            androidx.media3.extractor.metadata.id3.Id3Frame id3FrameDecodeFrame = decodeFrame(id3HeaderDecodeHeader.majorVersion, parsableByteArray, z, i2, this.framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new androidx.media3.common.Metadata(arrayList);
    }

    private static androidx.media3.extractor.metadata.id3.Id3Decoder.Id3Header decodeHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 10) {
            androidx.media3.common.util.Log.w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        boolean z = false;
        if (unsignedInt24 != 4801587) {
            androidx.media3.common.util.Log.w(TAG, "Unexpected first three bytes of ID3 tag header: 0x" + java.lang.String.format("%06X", java.lang.Integer.valueOf(unsignedInt24)));
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int synchSafeInt = parsableByteArray.readSynchSafeInt();
        if (unsignedByte == 2) {
            if ((unsignedByte2 & 64) != 0) {
                androidx.media3.common.util.Log.w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (unsignedByte == 3) {
            if ((unsignedByte2 & 64) != 0) {
                int i = parsableByteArray.readInt();
                parsableByteArray.skipBytes(i);
                synchSafeInt -= i + 4;
            }
        } else {
            if (unsignedByte != 4) {
                androidx.media3.common.util.Log.w(TAG, "Skipped ID3 tag with unsupported majorVersion=" + unsignedByte);
                return null;
            }
            if ((unsignedByte2 & 64) != 0) {
                int synchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(synchSafeInt2 - 4);
                synchSafeInt -= synchSafeInt2;
            }
            if ((unsignedByte2 & 16) != 0) {
                synchSafeInt -= 10;
            }
        }
        if (unsignedByte < 4 && (unsignedByte2 & 128) != 0) {
            z = true;
        }
        return new androidx.media3.extractor.metadata.id3.Id3Decoder.Id3Header(unsignedByte, z, synchSafeInt);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[PHI: r3
  0x0079: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:40:0x0086, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean validateFrames(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2, boolean z) {
        int unsignedInt24;
        long unsignedInt25;
        int unsignedShort;
        int i3;
        int position = parsableByteArray.getPosition();
        while (true) {
            try {
                boolean z2 = true;
                if (parsableByteArray.bytesLeft() < i2) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i >= 3) {
                    unsignedInt24 = parsableByteArray.readInt();
                    unsignedInt25 = parsableByteArray.readUnsignedInt();
                    unsignedShort = parsableByteArray.readUnsignedShort();
                } else {
                    unsignedInt24 = parsableByteArray.readUnsignedInt24();
                    unsignedInt25 = parsableByteArray.readUnsignedInt24();
                    unsignedShort = 0;
                }
                if (unsignedInt24 == 0 && unsignedInt25 == 0 && unsignedShort == 0) {
                    parsableByteArray.setPosition(position);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & unsignedInt25) != 0) {
                        parsableByteArray.setPosition(position);
                        return false;
                    }
                    unsignedInt25 = (((unsignedInt25 >> 24) & 255) << 21) | (unsignedInt25 & 255) | (((unsignedInt25 >> 8) & 255) << 7) | (((unsignedInt25 >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (unsignedShort & 64) != 0 ? 1 : 0;
                    if ((unsignedShort & 1) == 0) {
                        z2 = false;
                    }
                } else if (i == 3) {
                    i3 = (unsignedShort & 32) != 0 ? 1 : 0;
                    if ((unsignedShort & 128) == 0) {
                        z2 = false;
                    }
                } else {
                    i3 = 0;
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (unsignedInt25 < i3) {
                    parsableByteArray.setPosition(position);
                    return false;
                }
                if (parsableByteArray.bytesLeft() >= unsignedInt25) {
                    parsableByteArray.skipBytes((int) unsignedInt25);
                } else {
                    parsableByteArray.setPosition(position);
                    return false;
                }
            } catch (java.lang.Throwable th) {
                parsableByteArray.setPosition(position);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x019c  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x01af  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x01df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ee A[Catch: all -> 0x012c, Exception -> 0x012f, OutOfMemoryError -> 0x0132, TRY_LEAVE, TryCatch #2 {Exception -> 0x012f, OutOfMemoryError -> 0x0132, all -> 0x012c, blocks: (B:91:0x011a, B:93:0x0122, B:106:0x0141, B:108:0x0149, B:116:0x0163, B:125:0x017b, B:136:0x0196, B:143:0x01a8, B:149:0x01b7, B:154:0x01cf, B:160:0x01e9, B:161:0x01ee), top: B:171:0x0110 }] */
    private static androidx.media3.extractor.metadata.id3.Id3Frame decodeFrame(int i, androidx.media3.common.util.ParsableByteArray parsableByteArray, boolean z, int i2, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate) {
        int unsignedInt24;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        androidx.media3.extractor.metadata.id3.Id3Frame id3FrameDecodeBinaryFrame;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        int unsignedByte3 = parsableByteArray.readUnsignedByte();
        int unsignedByte4 = i >= 3 ? parsableByteArray.readUnsignedByte() : 0;
        if (i == 4) {
            unsignedInt24 = parsableByteArray.readUnsignedIntToInt();
            if (!z) {
                unsignedInt24 = (((unsignedInt24 >> 24) & 255) << 21) | (unsignedInt24 & 255) | (((unsignedInt24 >> 8) & 255) << 7) | (((unsignedInt24 >> 16) & 255) << 14);
            }
        } else if (i == 3) {
            unsignedInt24 = parsableByteArray.readUnsignedIntToInt();
        } else {
            unsignedInt24 = parsableByteArray.readUnsignedInt24();
        }
        int iRemoveUnsynchronization = unsignedInt24;
        int unsignedShort = i >= 3 ? parsableByteArray.readUnsignedShort() : 0;
        androidx.media3.extractor.metadata.id3.Id3Frame id3Frame = null;
        if (unsignedByte == 0 && unsignedByte2 == 0 && unsignedByte3 == 0 && unsignedByte4 == 0 && iRemoveUnsynchronization == 0 && unsignedShort == 0) {
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        int position = parsableByteArray.getPosition() + iRemoveUnsynchronization;
        if (position > parsableByteArray.limit()) {
            androidx.media3.common.util.Log.w(TAG, "Frame size exceeds remaining tag data");
            parsableByteArray.setPosition(parsableByteArray.limit());
            return null;
        }
        if (framePredicate != null) {
            i3 = position;
            if (!framePredicate.evaluate(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4)) {
                parsableByteArray.setPosition(i3);
                return null;
            }
        } else {
            i3 = position;
        }
        if (i == 3) {
            boolean z7 = (unsignedShort & 128) != 0;
            z6 = (unsignedShort & 64) != 0;
            z5 = false;
            z4 = z7;
            z3 = (unsignedShort & 32) != 0;
            z2 = z4;
        } else if (i == 4) {
            z3 = (unsignedShort & 64) != 0;
            boolean z8 = (unsignedShort & 8) != 0;
            boolean z9 = (unsignedShort & 4) != 0;
            z5 = (unsignedShort & 2) != 0;
            z6 = z9;
            boolean z10 = z8;
            z4 = (unsignedShort & 1) != 0;
            z2 = z10;
        } else {
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
        }
        if (z2 || z6) {
            androidx.media3.common.util.Log.w(TAG, "Skipping unsupported compressed or encrypted frame");
            parsableByteArray.setPosition(i3);
            return null;
        }
        if (z3) {
            iRemoveUnsynchronization--;
            parsableByteArray.skipBytes(1);
        }
        if (z4) {
            iRemoveUnsynchronization -= 4;
            parsableByteArray.skipBytes(4);
        }
        if (z5) {
            iRemoveUnsynchronization = removeUnsynchronization(parsableByteArray, iRemoveUnsynchronization);
        }
        try {
            if (unsignedByte == 84 && unsignedByte2 == 88 && unsignedByte3 == 88 && (i == 2 || unsignedByte4 == 88)) {
                id3FrameDecodeBinaryFrame = decodeTxxxFrame(parsableByteArray, iRemoveUnsynchronization);
            } else if (unsignedByte == 84) {
                id3FrameDecodeBinaryFrame = decodeTextInformationFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
            } else if (unsignedByte == 87 && unsignedByte2 == 88 && unsignedByte3 == 88 && (i == 2 || unsignedByte4 == 88)) {
                id3FrameDecodeBinaryFrame = decodeWxxxFrame(parsableByteArray, iRemoveUnsynchronization);
            } else if (unsignedByte == 87) {
                id3FrameDecodeBinaryFrame = decodeUrlLinkFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
            } else if (unsignedByte == 80 && unsignedByte2 == 82 && unsignedByte3 == 73 && unsignedByte4 == 86) {
                id3FrameDecodeBinaryFrame = decodePrivFrame(parsableByteArray, iRemoveUnsynchronization);
            } else if (unsignedByte == 71 && unsignedByte2 == 69 && unsignedByte3 == 79 && (unsignedByte4 == 66 || i == 2)) {
                id3FrameDecodeBinaryFrame = decodeGeobFrame(parsableByteArray, iRemoveUnsynchronization);
            } else if (i == 2) {
                if (unsignedByte == 80 && unsignedByte2 == 73 && unsignedByte3 == 67) {
                    id3FrameDecodeBinaryFrame = decodeApicFrame(parsableByteArray, iRemoveUnsynchronization, i);
                } else if (unsignedByte != 67 && unsignedByte2 == 79 && unsignedByte3 == 77 && (unsignedByte4 == 77 || i == 2)) {
                    id3FrameDecodeBinaryFrame = decodeCommentFrame(parsableByteArray, iRemoveUnsynchronization);
                } else if (unsignedByte != 67 && unsignedByte2 == 72 && unsignedByte3 == 65 && unsignedByte4 == 80) {
                    id3FrameDecodeBinaryFrame = decodeChapterFrame(parsableByteArray, iRemoveUnsynchronization, i, z, i2, framePredicate);
                } else if (unsignedByte != 67 && unsignedByte2 == 84 && unsignedByte3 == 79 && unsignedByte4 == 67) {
                    id3FrameDecodeBinaryFrame = decodeChapterTOCFrame(parsableByteArray, iRemoveUnsynchronization, i, z, i2, framePredicate);
                } else if (unsignedByte != 77 && unsignedByte2 == 76 && unsignedByte3 == 76 && unsignedByte4 == 84) {
                    id3FrameDecodeBinaryFrame = decodeMlltFrame(parsableByteArray, iRemoveUnsynchronization);
                } else {
                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                }
            } else if (unsignedByte == 65 && unsignedByte2 == 80 && unsignedByte3 == 73 && unsignedByte4 == 67) {
                id3FrameDecodeBinaryFrame = decodeApicFrame(parsableByteArray, iRemoveUnsynchronization, i);
            } else if (unsignedByte != 67) {
                if (unsignedByte != 67) {
                    if (unsignedByte != 67) {
                        if (unsignedByte != 77) {
                            id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                        } else {
                            id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                        }
                    } else if (unsignedByte != 77) {
                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    } else {
                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    }
                } else if (unsignedByte != 67) {
                    if (unsignedByte != 77) {
                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    } else {
                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    }
                } else if (unsignedByte != 77) {
                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                } else {
                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                }
            } else if (unsignedByte != 67) {
                if (unsignedByte != 67) {
                    if (unsignedByte != 77) {
                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    } else {
                        id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                    }
                } else if (unsignedByte != 77) {
                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                } else {
                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                }
            } else if (unsignedByte != 67) {
                if (unsignedByte != 77) {
                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                } else {
                    id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
                }
            } else if (unsignedByte != 77) {
                id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
            } else {
                id3FrameDecodeBinaryFrame = decodeBinaryFrame(parsableByteArray, iRemoveUnsynchronization, getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4));
            }
            parsableByteArray.setPosition(i3);
            id3Frame = id3FrameDecodeBinaryFrame;
            e = null;
        } catch (java.lang.Exception e) {
            e = e;
        } catch (java.lang.OutOfMemoryError e2) {
            e = e2;
        } finally {
            parsableByteArray.setPosition(i3);
        }
        if (id3Frame == null) {
            androidx.media3.common.util.Log.w(TAG, "Failed to decode frame: id=" + getFrameId(i, unsignedByte, unsignedByte2, unsignedByte3, unsignedByte4) + ", frameSize=" + iRemoveUnsynchronization, e);
        }
        return id3Frame;
    }

    private static androidx.media3.extractor.metadata.id3.TextInformationFrame decodeTxxxFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        if (i < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        return new androidx.media3.extractor.metadata.id3.TextInformationFrame("TXXX", new java.lang.String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte)), decodeTextInformationFrameValues(bArr, unsignedByte, iIndexOfTerminator + delimiterLength(unsignedByte)));
    }

    private static androidx.media3.extractor.metadata.id3.TextInformationFrame decodeTextInformationFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, java.lang.String str) {
        if (i < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new androidx.media3.extractor.metadata.id3.TextInformationFrame(str, (java.lang.String) null, decodeTextInformationFrameValues(bArr, unsignedByte, 0));
    }

    private static com.google.common.collect.ImmutableList<java.lang.String> decodeTextInformationFrameValues(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return com.google.common.collect.ImmutableList.of("");
        }
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        int iIndexOfTerminator = indexOfTerminator(bArr, i2, i);
        while (i2 < iIndexOfTerminator) {
            builder.add(new java.lang.String(bArr, i2, iIndexOfTerminator - i2, getCharset(i)));
            i2 = delimiterLength(i) + iIndexOfTerminator;
            iIndexOfTerminator = indexOfTerminator(bArr, i2, i);
        }
        com.google.common.collect.ImmutableList<java.lang.String> immutableListBuild = builder.build();
        return immutableListBuild.isEmpty() ? com.google.common.collect.ImmutableList.of("") : immutableListBuild;
    }

    private static androidx.media3.extractor.metadata.id3.UrlLinkFrame decodeWxxxFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        if (i < 1) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int iIndexOfTerminator = indexOfTerminator(bArr, 0, unsignedByte);
        java.lang.String str = new java.lang.String(bArr, 0, iIndexOfTerminator, getCharset(unsignedByte));
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new androidx.media3.extractor.metadata.id3.UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, iDelimiterLength, indexOfZeroByte(bArr, iDelimiterLength), com.google.common.base.Charsets.ISO_8859_1));
    }

    private static androidx.media3.extractor.metadata.id3.UrlLinkFrame decodeUrlLinkFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, java.lang.String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new androidx.media3.extractor.metadata.id3.UrlLinkFrame(str, null, new java.lang.String(bArr, 0, indexOfZeroByte(bArr, 0), com.google.common.base.Charsets.ISO_8859_1));
    }

    private static androidx.media3.extractor.metadata.id3.PrivFrame decodePrivFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new androidx.media3.extractor.metadata.id3.PrivFrame(new java.lang.String(bArr, 0, iIndexOfZeroByte, com.google.common.base.Charsets.ISO_8859_1), copyOfRangeIfValid(bArr, iIndexOfZeroByte + 1, i));
    }

    private static androidx.media3.extractor.metadata.id3.GeobFrame decodeGeobFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        java.nio.charset.Charset charset = getCharset(unsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
        java.lang.String strNormalizeMimeType = androidx.media3.common.MimeTypes.normalizeMimeType(new java.lang.String(bArr, 0, iIndexOfZeroByte, com.google.common.base.Charsets.ISO_8859_1));
        int i3 = iIndexOfZeroByte + 1;
        int iIndexOfTerminator = indexOfTerminator(bArr, i3, unsignedByte);
        java.lang.String strDecodeStringIfValid = decodeStringIfValid(bArr, i3, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        int iIndexOfTerminator2 = indexOfTerminator(bArr, iDelimiterLength, unsignedByte);
        return new androidx.media3.extractor.metadata.id3.GeobFrame(strNormalizeMimeType, strDecodeStringIfValid, decodeStringIfValid(bArr, iDelimiterLength, iIndexOfTerminator2, charset), copyOfRangeIfValid(bArr, iIndexOfTerminator2 + delimiterLength(unsignedByte), i2));
    }

    private static androidx.media3.extractor.metadata.id3.ApicFrame decodeApicFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2) {
        int iIndexOfZeroByte;
        java.lang.String str;
        int unsignedByte = parsableByteArray.readUnsignedByte();
        java.nio.charset.Charset charset = getCharset(unsignedByte);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + com.google.common.base.Ascii.toLowerCase(new java.lang.String(bArr, 0, 3, com.google.common.base.Charsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = androidx.media3.common.MimeTypes.IMAGE_JPEG;
            }
            iIndexOfZeroByte = 2;
        } else {
            iIndexOfZeroByte = indexOfZeroByte(bArr, 0);
            java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(new java.lang.String(bArr, 0, iIndexOfZeroByte, com.google.common.base.Charsets.ISO_8859_1));
            str = lowerCase.indexOf(47) == -1 ? "image/" + lowerCase : lowerCase;
        }
        int i4 = bArr[iIndexOfZeroByte + 1] & 255;
        int i5 = iIndexOfZeroByte + 2;
        int iIndexOfTerminator = indexOfTerminator(bArr, i5, unsignedByte);
        return new androidx.media3.extractor.metadata.id3.ApicFrame(str, new java.lang.String(bArr, i5, iIndexOfTerminator - i5, charset), i4, copyOfRangeIfValid(bArr, iIndexOfTerminator + delimiterLength(unsignedByte), i3));
    }

    private static androidx.media3.extractor.metadata.id3.CommentFrame decodeCommentFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        if (i < 4) {
            return null;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        java.nio.charset.Charset charset = getCharset(unsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        java.lang.String str = new java.lang.String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        parsableByteArray.readBytes(bArr2, 0, i2);
        int iIndexOfTerminator = indexOfTerminator(bArr2, 0, unsignedByte);
        java.lang.String str2 = new java.lang.String(bArr2, 0, iIndexOfTerminator, charset);
        int iDelimiterLength = iIndexOfTerminator + delimiterLength(unsignedByte);
        return new androidx.media3.extractor.metadata.id3.CommentFrame(str, str2, decodeStringIfValid(bArr2, iDelimiterLength, indexOfTerminator(bArr2, iDelimiterLength, unsignedByte), charset));
    }

    private static androidx.media3.extractor.metadata.id3.ChapterFrame decodeChapterFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate) {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        java.lang.String str = new java.lang.String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, com.google.common.base.Charsets.ISO_8859_1);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int i4 = parsableByteArray.readInt();
        int i5 = parsableByteArray.readInt();
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long j = unsignedInt == androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE ? -1L : unsignedInt;
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        long j2 = unsignedInt2 == androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE ? -1L : unsignedInt2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i6 = position + i;
        while (parsableByteArray.getPosition() < i6) {
            androidx.media3.extractor.metadata.id3.Id3Frame id3FrameDecodeFrame = decodeFrame(i2, parsableByteArray, z, i3, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new androidx.media3.extractor.metadata.id3.ChapterFrame(str, i4, i5, j, j2, (androidx.media3.extractor.metadata.id3.Id3Frame[]) arrayList.toArray(new androidx.media3.extractor.metadata.id3.Id3Frame[0]));
    }

    private static androidx.media3.extractor.metadata.id3.ChapterTocFrame decodeChapterTOCFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate framePredicate) {
        int position = parsableByteArray.getPosition();
        int iIndexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        java.lang.String str = new java.lang.String(parsableByteArray.getData(), position, iIndexOfZeroByte - position, com.google.common.base.Charsets.ISO_8859_1);
        parsableByteArray.setPosition(iIndexOfZeroByte + 1);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        boolean z2 = (unsignedByte & 2) != 0;
        boolean z3 = (unsignedByte & 1) != 0;
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        java.lang.String[] strArr = new java.lang.String[unsignedByte2];
        for (int i4 = 0; i4 < unsignedByte2; i4++) {
            int position2 = parsableByteArray.getPosition();
            int iIndexOfZeroByte2 = indexOfZeroByte(parsableByteArray.getData(), position2);
            strArr[i4] = new java.lang.String(parsableByteArray.getData(), position2, iIndexOfZeroByte2 - position2, com.google.common.base.Charsets.ISO_8859_1);
            parsableByteArray.setPosition(iIndexOfZeroByte2 + 1);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i5 = position + i;
        while (parsableByteArray.getPosition() < i5) {
            androidx.media3.extractor.metadata.id3.Id3Frame id3FrameDecodeFrame = decodeFrame(i2, parsableByteArray, z, i3, framePredicate);
            if (id3FrameDecodeFrame != null) {
                arrayList.add(id3FrameDecodeFrame);
            }
        }
        return new androidx.media3.extractor.metadata.id3.ChapterTocFrame(str, z2, z3, strArr, (androidx.media3.extractor.metadata.id3.Id3Frame[]) arrayList.toArray(new androidx.media3.extractor.metadata.id3.Id3Frame[0]));
    }

    private static androidx.media3.extractor.metadata.id3.MlltFrame decodeMlltFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedInt24 = parsableByteArray.readUnsignedInt24();
        int unsignedInt25 = parsableByteArray.readUnsignedInt24();
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedByte2 = parsableByteArray.readUnsignedByte();
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i2 = ((i - 10) * 8) / (unsignedByte + unsignedByte2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int bits = parsableBitArray.readBits(unsignedByte);
            int bits2 = parsableBitArray.readBits(unsignedByte2);
            iArr[i3] = bits;
            iArr2[i3] = bits2;
        }
        return new androidx.media3.extractor.metadata.id3.MlltFrame(unsignedShort, unsignedInt24, unsignedInt25, iArr, iArr2);
    }

    private static androidx.media3.extractor.metadata.id3.BinaryFrame decodeBinaryFrame(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, java.lang.String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new androidx.media3.extractor.metadata.id3.BinaryFrame(str, bArr);
    }

    private static int removeUnsynchronization(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int i2 = position;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= position + i) {
                return i;
            }
            if ((data[i2] & 255) == 255 && data[i3] == 0) {
                java.lang.System.arraycopy(data, i2 + 2, data, i3, (i - (i2 - position)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static java.nio.charset.Charset getCharset(int i) {
        if (i == 1) {
            return com.google.common.base.Charsets.UTF_16;
        }
        if (i == 2) {
            return com.google.common.base.Charsets.UTF_16BE;
        }
        if (i == 3) {
            return com.google.common.base.Charsets.UTF_8;
        }
        return com.google.common.base.Charsets.ISO_8859_1;
    }

    private static java.lang.String getFrameId(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? java.lang.String.format(java.util.Locale.US, "%c%c%c", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4)) : java.lang.String.format(java.util.Locale.US, "%c%c%c%c", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5));
    }

    private static int indexOfTerminator(byte[] bArr, int i, int i2) {
        int iIndexOfZeroByte = indexOfZeroByte(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iIndexOfZeroByte;
        }
        while (iIndexOfZeroByte < bArr.length - 1) {
            if ((iIndexOfZeroByte - i) % 2 == 0 && bArr[iIndexOfZeroByte + 1] == 0) {
                return iIndexOfZeroByte;
            }
            iIndexOfZeroByte = indexOfZeroByte(bArr, iIndexOfZeroByte + 1);
        }
        return bArr.length;
    }

    private static int indexOfZeroByte(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
        }
        return java.util.Arrays.copyOfRange(bArr, i, i2);
    }

    private static java.lang.String decodeStringIfValid(byte[] bArr, int i, int i2, java.nio.charset.Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new java.lang.String(bArr, i, i2 - i, charset);
    }

    private static final class Id3Header {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public Id3Header(int i, boolean z, int i2) {
            this.majorVersion = i;
            this.isUnsynchronized = z;
            this.framesSize = i2;
        }
    }
}
