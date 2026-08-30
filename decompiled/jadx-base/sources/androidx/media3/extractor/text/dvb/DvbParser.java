package androidx.media3.extractor.text.dvb;

/* JADX INFO: loaded from: classes.dex */
public final class DvbParser implements androidx.media3.extractor.text.SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int DATA_TYPE_24_TABLE_DATA = 32;
    private static final int DATA_TYPE_28_TABLE_DATA = 33;
    private static final int DATA_TYPE_2BP_CODE_STRING = 16;
    private static final int DATA_TYPE_48_TABLE_DATA = 34;
    private static final int DATA_TYPE_4BP_CODE_STRING = 17;
    private static final int DATA_TYPE_8BP_CODE_STRING = 18;
    private static final int DATA_TYPE_END_LINE = 240;
    private static final int OBJECT_CODING_PIXELS = 0;
    private static final int OBJECT_CODING_STRING = 1;
    private static final int PAGE_STATE_NORMAL = 0;
    private static final int REGION_DEPTH_4_BIT = 2;
    private static final int REGION_DEPTH_8_BIT = 3;
    private static final int SEGMENT_TYPE_CLUT_DEFINITION = 18;
    private static final int SEGMENT_TYPE_DISPLAY_DEFINITION = 20;
    private static final int SEGMENT_TYPE_OBJECT_DATA = 19;
    private static final int SEGMENT_TYPE_PAGE_COMPOSITION = 16;
    private static final int SEGMENT_TYPE_REGION_COMPOSITION = 17;
    private static final java.lang.String TAG = "DvbParser";
    private static final byte[] defaultMap2To4 = {0, 7, 8, 15};
    private static final byte[] defaultMap2To8 = {0, 119, -120, -1};
    private static final byte[] defaultMap4To8 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private android.graphics.Bitmap bitmap;
    private final android.graphics.Canvas canvas;
    private final androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition defaultClutDefinition;
    private final androidx.media3.extractor.text.dvb.DvbParser.DisplayDefinition defaultDisplayDefinition;
    private final android.graphics.Paint defaultPaint;
    private final android.graphics.Paint fillRegionPaint;
    private final androidx.media3.extractor.text.dvb.DvbParser.SubtitleService subtitleService;

    private static int getColor(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    public DvbParser(java.util.List<byte[]> list) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(list.get(0));
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.defaultPaint = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.fillRegionPaint = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.canvas = new android.graphics.Canvas();
        this.defaultDisplayDefinition = new androidx.media3.extractor.text.dvb.DvbParser.DisplayDefinition(androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        this.defaultClutDefinition = new androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition(0, generateDefault2BitClutEntries(), generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
        this.subtitleService = new androidx.media3.extractor.text.dvb.DvbParser.SubtitleService(unsignedShort, unsignedShort2);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void reset() {
        this.subtitleService.reset();
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i, int i2, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(bArr, i2 + i);
        parsableBitArray.setPosition(i);
        consumer.accept(parse(parsableBitArray));
    }

    private androidx.media3.extractor.text.CuesWithTiming parse(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        androidx.media3.extractor.text.dvb.DvbParser.DisplayDefinition displayDefinition;
        int i;
        while (parsableBitArray.bitsLeft() >= 48 && parsableBitArray.readBits(8) == 15) {
            parseSubtitlingSegment(parsableBitArray, this.subtitleService);
        }
        androidx.media3.extractor.text.dvb.DvbParser.PageComposition pageComposition = this.subtitleService.pageComposition;
        if (pageComposition == null) {
            return new androidx.media3.extractor.text.CuesWithTiming(com.google.common.collect.ImmutableList.of(), androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
        }
        if (this.subtitleService.displayDefinition != null) {
            displayDefinition = this.subtitleService.displayDefinition;
        } else {
            displayDefinition = this.defaultDisplayDefinition;
        }
        if (this.bitmap == null || displayDefinition.width + 1 != this.bitmap.getWidth() || displayDefinition.height + 1 != this.bitmap.getHeight()) {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(displayDefinition.width + 1, displayDefinition.height + 1, android.graphics.Bitmap.Config.ARGB_8888);
            this.bitmap = bitmapCreateBitmap;
            this.canvas.setBitmap(bitmapCreateBitmap);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.PageRegion> sparseArray = pageComposition.regions;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            this.canvas.save();
            androidx.media3.extractor.text.dvb.DvbParser.PageRegion pageRegionValueAt = sparseArray.valueAt(i2);
            androidx.media3.extractor.text.dvb.DvbParser.RegionComposition regionComposition = this.subtitleService.regions.get(sparseArray.keyAt(i2));
            int i3 = pageRegionValueAt.horizontalAddress + displayDefinition.horizontalPositionMinimum;
            int i4 = pageRegionValueAt.verticalAddress + displayDefinition.verticalPositionMinimum;
            this.canvas.clipRect(i3, i4, java.lang.Math.min(regionComposition.width + i3, displayDefinition.horizontalPositionMaximum), java.lang.Math.min(regionComposition.height + i4, displayDefinition.verticalPositionMaximum));
            androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition clutDefinition = this.subtitleService.cluts.get(regionComposition.clutId);
            if (clutDefinition == null && (clutDefinition = this.subtitleService.ancillaryCluts.get(regionComposition.clutId)) == null) {
                clutDefinition = this.defaultClutDefinition;
            }
            int i5 = 0;
            for (android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.RegionObject> sparseArray2 = regionComposition.regionObjects; i5 < sparseArray2.size(); sparseArray2 = sparseArray2) {
                int iKeyAt = sparseArray2.keyAt(i5);
                androidx.media3.extractor.text.dvb.DvbParser.RegionObject regionObjectValueAt = sparseArray2.valueAt(i5);
                androidx.media3.extractor.text.dvb.DvbParser.ObjectData objectData = this.subtitleService.objects.get(iKeyAt);
                androidx.media3.extractor.text.dvb.DvbParser.ObjectData objectData2 = objectData == null ? this.subtitleService.ancillaryObjects.get(iKeyAt) : objectData;
                if (objectData2 != null) {
                    paintPixelDataSubBlocks(objectData2, clutDefinition, regionComposition.depth, regionObjectValueAt.horizontalPosition + i3, i4 + regionObjectValueAt.verticalPosition, objectData2.nonModifyingColorFlag ? null : this.defaultPaint, this.canvas);
                }
                i5++;
            }
            if (regionComposition.fillFlag) {
                if (regionComposition.depth == 3) {
                    i = clutDefinition.clutEntries8Bit[regionComposition.pixelCode8Bit];
                } else if (regionComposition.depth == 2) {
                    i = clutDefinition.clutEntries4Bit[regionComposition.pixelCode4Bit];
                } else {
                    i = clutDefinition.clutEntries2Bit[regionComposition.pixelCode2Bit];
                }
                this.fillRegionPaint.setColor(i);
                this.canvas.drawRect(i3, i4, regionComposition.width + i3, regionComposition.height + i4, this.fillRegionPaint);
            }
            arrayList.add(new androidx.media3.common.text.Cue.Builder().setBitmap(android.graphics.Bitmap.createBitmap(this.bitmap, i3, i4, regionComposition.width, regionComposition.height)).setPosition(i3 / displayDefinition.width).setPositionAnchor(0).setLine(i4 / displayDefinition.height, 0).setLineAnchor(0).setSize(regionComposition.width / displayDefinition.width).setBitmapHeight(regionComposition.height / displayDefinition.height).build());
            this.canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            this.canvas.restore();
        }
        return new androidx.media3.extractor.text.CuesWithTiming(arrayList, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
    }

    private static void parseSubtitlingSegment(androidx.media3.common.util.ParsableBitArray parsableBitArray, androidx.media3.extractor.text.dvb.DvbParser.SubtitleService subtitleService) {
        androidx.media3.extractor.text.dvb.DvbParser.RegionComposition regionComposition;
        int bits = parsableBitArray.readBits(8);
        int bits2 = parsableBitArray.readBits(16);
        int bits3 = parsableBitArray.readBits(16);
        int bytePosition = parsableBitArray.getBytePosition() + bits3;
        if (bits3 * 8 > parsableBitArray.bitsLeft()) {
            androidx.media3.common.util.Log.w(TAG, "Data field length exceeds limit");
            parsableBitArray.skipBits(parsableBitArray.bitsLeft());
            return;
        }
        switch (bits) {
            case 16:
                if (bits2 == subtitleService.subtitlePageId) {
                    androidx.media3.extractor.text.dvb.DvbParser.PageComposition pageComposition = subtitleService.pageComposition;
                    androidx.media3.extractor.text.dvb.DvbParser.PageComposition pageComposition2 = parsePageComposition(parsableBitArray, bits3);
                    if (pageComposition2.state != 0) {
                        subtitleService.pageComposition = pageComposition2;
                        subtitleService.regions.clear();
                        subtitleService.cluts.clear();
                        subtitleService.objects.clear();
                    } else if (pageComposition != null && pageComposition.version != pageComposition2.version) {
                        subtitleService.pageComposition = pageComposition2;
                    }
                }
                break;
            case 17:
                androidx.media3.extractor.text.dvb.DvbParser.PageComposition pageComposition3 = subtitleService.pageComposition;
                if (bits2 == subtitleService.subtitlePageId && pageComposition3 != null) {
                    androidx.media3.extractor.text.dvb.DvbParser.RegionComposition regionComposition2 = parseRegionComposition(parsableBitArray, bits3);
                    if (pageComposition3.state == 0 && (regionComposition = subtitleService.regions.get(regionComposition2.id)) != null) {
                        regionComposition2.mergeFrom(regionComposition);
                    }
                    subtitleService.regions.put(regionComposition2.id, regionComposition2);
                }
                break;
            case 18:
                if (bits2 == subtitleService.subtitlePageId) {
                    androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition clutDefinition = parseClutDefinition(parsableBitArray, bits3);
                    subtitleService.cluts.put(clutDefinition.id, clutDefinition);
                } else if (bits2 == subtitleService.ancillaryPageId) {
                    androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition clutDefinition2 = parseClutDefinition(parsableBitArray, bits3);
                    subtitleService.ancillaryCluts.put(clutDefinition2.id, clutDefinition2);
                }
                break;
            case 19:
                if (bits2 == subtitleService.subtitlePageId) {
                    androidx.media3.extractor.text.dvb.DvbParser.ObjectData objectData = parseObjectData(parsableBitArray);
                    subtitleService.objects.put(objectData.id, objectData);
                } else if (bits2 == subtitleService.ancillaryPageId) {
                    androidx.media3.extractor.text.dvb.DvbParser.ObjectData objectData2 = parseObjectData(parsableBitArray);
                    subtitleService.ancillaryObjects.put(objectData2.id, objectData2);
                }
                break;
            case 20:
                if (bits2 == subtitleService.subtitlePageId) {
                    subtitleService.displayDefinition = parseDisplayDefinition(parsableBitArray);
                }
                break;
        }
        parsableBitArray.skipBytes(bytePosition - parsableBitArray.getBytePosition());
    }

    private static androidx.media3.extractor.text.dvb.DvbParser.DisplayDefinition parseDisplayDefinition(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        int i;
        int i2;
        int i3;
        int bits;
        parsableBitArray.skipBits(4);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int bits2 = parsableBitArray.readBits(16);
        int bits3 = parsableBitArray.readBits(16);
        if (bit) {
            int bits4 = parsableBitArray.readBits(16);
            int bits5 = parsableBitArray.readBits(16);
            int bits6 = parsableBitArray.readBits(16);
            bits = parsableBitArray.readBits(16);
            i3 = bits5;
            i2 = bits6;
            i = bits4;
        } else {
            i = 0;
            i2 = 0;
            i3 = bits2;
            bits = bits3;
        }
        return new androidx.media3.extractor.text.dvb.DvbParser.DisplayDefinition(bits2, bits3, i, i3, i2, bits);
    }

    private static androidx.media3.extractor.text.dvb.DvbParser.PageComposition parsePageComposition(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i) {
        int bits = parsableBitArray.readBits(8);
        int bits2 = parsableBitArray.readBits(4);
        int bits3 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i2 = i - 2;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        while (i2 > 0) {
            int bits4 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(8);
            i2 -= 6;
            sparseArray.put(bits4, new androidx.media3.extractor.text.dvb.DvbParser.PageRegion(parsableBitArray.readBits(16), parsableBitArray.readBits(16)));
        }
        return new androidx.media3.extractor.text.dvb.DvbParser.PageComposition(bits, bits2, bits3, sparseArray);
    }

    private static androidx.media3.extractor.text.dvb.DvbParser.RegionComposition parseRegionComposition(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i) {
        int bits;
        int bits2;
        int bits3 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(4);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int i2 = 16;
        int bits4 = parsableBitArray.readBits(16);
        int bits5 = parsableBitArray.readBits(16);
        int bits6 = parsableBitArray.readBits(3);
        int bits7 = parsableBitArray.readBits(3);
        int i3 = 2;
        parsableBitArray.skipBits(2);
        int bits8 = parsableBitArray.readBits(8);
        int bits9 = parsableBitArray.readBits(8);
        int bits10 = parsableBitArray.readBits(4);
        int bits11 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i4 = i - 10;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        while (i4 > 0) {
            int bits12 = parsableBitArray.readBits(i2);
            int bits13 = parsableBitArray.readBits(i3);
            int bits14 = parsableBitArray.readBits(i3);
            int bits15 = parsableBitArray.readBits(12);
            int i5 = bits11;
            parsableBitArray.skipBits(4);
            int bits16 = parsableBitArray.readBits(12);
            i4 -= 6;
            if (bits13 == 1 || bits13 == 2) {
                i4 -= 2;
                bits = parsableBitArray.readBits(8);
                bits2 = parsableBitArray.readBits(8);
            } else {
                bits = 0;
                bits2 = 0;
            }
            sparseArray.put(bits12, new androidx.media3.extractor.text.dvb.DvbParser.RegionObject(bits13, bits14, bits15, bits16, bits, bits2));
            bits11 = i5;
            i3 = 2;
            i2 = 16;
        }
        return new androidx.media3.extractor.text.dvb.DvbParser.RegionComposition(bits3, bit, bits4, bits5, bits6, bits7, bits8, bits9, bits10, bits11, sparseArray);
    }

    private static androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition parseClutDefinition(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i) {
        int[] iArr;
        int bits;
        int i2;
        int bits2;
        int bits3;
        int bits4;
        int i3 = 8;
        int bits5 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(8);
        int i4 = 2;
        int i5 = i - 2;
        int[] iArrGenerateDefault2BitClutEntries = generateDefault2BitClutEntries();
        int[] iArrGenerateDefault4BitClutEntries = generateDefault4BitClutEntries();
        int[] iArrGenerateDefault8BitClutEntries = generateDefault8BitClutEntries();
        while (i5 > 0) {
            int bits6 = parsableBitArray.readBits(i3);
            int bits7 = parsableBitArray.readBits(i3);
            int i6 = i5 - 2;
            if ((bits7 & 128) != 0) {
                iArr = iArrGenerateDefault2BitClutEntries;
            } else {
                iArr = (bits7 & 64) != 0 ? iArrGenerateDefault4BitClutEntries : iArrGenerateDefault8BitClutEntries;
            }
            if ((bits7 & 1) != 0) {
                bits3 = parsableBitArray.readBits(i3);
                bits4 = parsableBitArray.readBits(i3);
                bits = parsableBitArray.readBits(i3);
                bits2 = parsableBitArray.readBits(i3);
                i2 = i6 - 4;
            } else {
                int bits8 = parsableBitArray.readBits(6) << i4;
                int bits9 = parsableBitArray.readBits(4) << 4;
                bits = parsableBitArray.readBits(4) << 4;
                i2 = i6 - 2;
                bits2 = parsableBitArray.readBits(i4) << 6;
                bits3 = bits8;
                bits4 = bits9;
            }
            if (bits3 == 0) {
                bits2 = 255;
                bits4 = 0;
                bits = 0;
            }
            double d = bits3;
            double d2 = bits4 - 128;
            double d3 = bits - 128;
            iArr[bits6] = getColor((byte) (255 - (bits2 & 255)), androidx.media3.common.util.Util.constrainValue((int) (d + (1.402d * d2)), 0, 255), androidx.media3.common.util.Util.constrainValue((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), androidx.media3.common.util.Util.constrainValue((int) (d + (d3 * 1.772d)), 0, 255));
            i5 = i2;
            bits5 = bits5;
            i3 = 8;
            i4 = 2;
        }
        return new androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition(bits5, iArrGenerateDefault2BitClutEntries, iArrGenerateDefault4BitClutEntries, iArrGenerateDefault8BitClutEntries);
    }

    private static androidx.media3.extractor.text.dvb.DvbParser.ObjectData parseObjectData(androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        int bits = parsableBitArray.readBits(16);
        parsableBitArray.skipBits(4);
        int bits2 = parsableBitArray.readBits(2);
        boolean bit = parsableBitArray.readBit();
        parsableBitArray.skipBits(1);
        byte[] bArr = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
        byte[] bArr2 = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
        if (bits2 == 1) {
            parsableBitArray.skipBits(parsableBitArray.readBits(8) * 16);
        } else if (bits2 == 0) {
            int bits3 = parsableBitArray.readBits(16);
            int bits4 = parsableBitArray.readBits(16);
            if (bits3 > 0) {
                bArr = new byte[bits3];
                parsableBitArray.readBytes(bArr, 0, bits3);
            }
            if (bits4 > 0) {
                bArr2 = new byte[bits4];
                parsableBitArray.readBytes(bArr2, 0, bits4);
            } else {
                bArr2 = bArr;
            }
        }
        return new androidx.media3.extractor.text.dvb.DvbParser.ObjectData(bits, bit, bArr, bArr2);
    }

    private static int[] generateDefault2BitClutEntries() {
        return new int[]{0, -1, androidx.core.view.ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] generateDefault4BitClutEntries() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = getColor(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = getColor(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] generateDefault8BitClutEntries() {
        int i;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = getColor(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                int i4 = org.objectweb.asm.Opcodes.TABLESWITCH;
                if (i3 == 0) {
                    int i5 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i6 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = getColor(255, i5, i6, i + i4);
                } else if (i3 == 8) {
                    int i7 = ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0);
                    int i8 = ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0);
                    i = (i2 & 4) == 0 ? 0 : 85;
                    if ((i2 & 64) == 0) {
                        i4 = 0;
                    }
                    iArr[i2] = getColor(127, i7, i8, i + i4);
                } else if (i3 == 128) {
                    iArr[i2] = getColor(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = getColor(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static void paintPixelDataSubBlocks(androidx.media3.extractor.text.dvb.DvbParser.ObjectData objectData, androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition clutDefinition, int i, int i2, int i3, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = clutDefinition.clutEntries8Bit;
        } else if (i == 2) {
            iArr = clutDefinition.clutEntries4Bit;
        } else {
            iArr = clutDefinition.clutEntries2Bit;
        }
        int[] iArr2 = iArr;
        paintPixelDataSubBlock(objectData.topFieldData, iArr2, i, i2, i3, paint, canvas);
        paintPixelDataSubBlock(objectData.bottomFieldData, iArr2, i, i2, i3 + 1, paint, canvas);
    }

    private static void paintPixelDataSubBlock(byte[] bArr, int[] iArr, int i, int i2, int i3, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        androidx.media3.common.util.ParsableBitArray parsableBitArray = new androidx.media3.common.util.ParsableBitArray(bArr);
        int iPaint2BitPixelCodeString = i2;
        int i4 = i3;
        byte[] bArrBuildClutMapTable = null;
        byte[] bArrBuildClutMapTable2 = null;
        byte[] bArrBuildClutMapTable3 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int bits = parsableBitArray.readBits(8);
            if (bits != 240) {
                switch (bits) {
                    case 16:
                        if (i == 3) {
                            bArr3 = bArrBuildClutMapTable == null ? defaultMap2To8 : bArrBuildClutMapTable;
                        } else {
                            if (i == 2) {
                                bArr3 = bArrBuildClutMapTable3 == null ? defaultMap2To4 : bArrBuildClutMapTable3;
                            } else {
                                bArr2 = null;
                            }
                            iPaint2BitPixelCodeString = paint2BitPixelCodeString(parsableBitArray, iArr, bArr2, iPaint2BitPixelCodeString, i4, paint, canvas);
                            parsableBitArray.byteAlign();
                        }
                        bArr2 = bArr3;
                        iPaint2BitPixelCodeString = paint2BitPixelCodeString(parsableBitArray, iArr, bArr2, iPaint2BitPixelCodeString, i4, paint, canvas);
                        parsableBitArray.byteAlign();
                        break;
                    case 17:
                        if (i == 3) {
                            bArr4 = bArrBuildClutMapTable2 == null ? defaultMap4To8 : bArrBuildClutMapTable2;
                        } else {
                            bArr4 = null;
                        }
                        iPaint2BitPixelCodeString = paint4BitPixelCodeString(parsableBitArray, iArr, bArr4, iPaint2BitPixelCodeString, i4, paint, canvas);
                        parsableBitArray.byteAlign();
                        break;
                    case 18:
                        iPaint2BitPixelCodeString = paint8BitPixelCodeString(parsableBitArray, iArr, null, iPaint2BitPixelCodeString, i4, paint, canvas);
                        break;
                    default:
                        switch (bits) {
                            case 32:
                                bArrBuildClutMapTable3 = buildClutMapTable(4, 4, parsableBitArray);
                                break;
                            case 33:
                                bArrBuildClutMapTable = buildClutMapTable(4, 8, parsableBitArray);
                                break;
                            case 34:
                                bArrBuildClutMapTable2 = buildClutMapTable(16, 8, parsableBitArray);
                                break;
                        }
                        break;
                }
            } else {
                i4 += 2;
                iPaint2BitPixelCodeString = i2;
            }
        }
    }

    private static int paint2BitPixelCodeString(androidx.media3.common.util.ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i, int i2, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        int i3;
        int bits;
        int bits2;
        int i4 = i;
        boolean z = false;
        while (true) {
            int bits3 = parsableBitArray.readBits(2);
            if (bits3 != 0) {
                z = z;
                i3 = 1;
            } else {
                if (parsableBitArray.readBit()) {
                    bits = parsableBitArray.readBits(3) + 3;
                    bits2 = parsableBitArray.readBits(2);
                } else {
                    if (parsableBitArray.readBit()) {
                        i3 = 1;
                    } else {
                        int bits4 = parsableBitArray.readBits(2);
                        if (bits4 == 0) {
                            z = true;
                        } else if (bits4 == 1) {
                            i3 = 2;
                        } else if (bits4 == 2) {
                            bits = parsableBitArray.readBits(4) + 12;
                            bits2 = parsableBitArray.readBits(2);
                        } else if (bits4 != 3) {
                            z = z;
                        } else {
                            bits = parsableBitArray.readBits(8) + 29;
                            bits2 = parsableBitArray.readBits(2);
                        }
                        bits3 = 0;
                        i3 = 0;
                    }
                    bits3 = 0;
                }
                z = z;
                i3 = bits;
                bits3 = bits2;
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z = z;
        }
    }

    private static int paint4BitPixelCodeString(androidx.media3.common.util.ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i, int i2, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        int i3;
        int bits;
        int bits2;
        int i4 = i;
        boolean z = false;
        while (true) {
            int bits3 = parsableBitArray.readBits(4);
            if (bits3 != 0) {
                z = z;
                i3 = 1;
            } else if (!parsableBitArray.readBit()) {
                int bits4 = parsableBitArray.readBits(3);
                if (bits4 != 0) {
                    i3 = bits4 + 2;
                    bits3 = 0;
                } else {
                    z = true;
                    bits3 = 0;
                    i3 = 0;
                }
            } else {
                if (!parsableBitArray.readBit()) {
                    bits = parsableBitArray.readBits(2) + 4;
                    bits2 = parsableBitArray.readBits(4);
                } else {
                    int bits5 = parsableBitArray.readBits(2);
                    if (bits5 == 0) {
                        i3 = 1;
                    } else if (bits5 == 1) {
                        i3 = 2;
                    } else if (bits5 == 2) {
                        bits = parsableBitArray.readBits(4) + 9;
                        bits2 = parsableBitArray.readBits(4);
                    } else if (bits5 != 3) {
                        z = z;
                        bits3 = 0;
                        i3 = 0;
                    } else {
                        bits = parsableBitArray.readBits(8) + 25;
                        bits2 = parsableBitArray.readBits(4);
                    }
                    bits3 = 0;
                }
                z = z;
                i3 = bits;
                bits3 = bits2;
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    bits3 = bArr[bits3];
                }
                paint.setColor(iArr[bits3]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z = z;
        }
    }

    private static int paint8BitPixelCodeString(androidx.media3.common.util.ParsableBitArray parsableBitArray, int[] iArr, byte[] bArr, int i, int i2, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        boolean z;
        int bits;
        int i3 = i;
        boolean z2 = false;
        while (true) {
            int bits2 = parsableBitArray.readBits(8);
            if (bits2 != 0) {
                z = z2;
                bits = 1;
            } else if (!parsableBitArray.readBit()) {
                int bits3 = parsableBitArray.readBits(7);
                if (bits3 != 0) {
                    z = z2;
                    bits = bits3;
                    bits2 = 0;
                } else {
                    z = true;
                    bits2 = 0;
                    bits = 0;
                }
            } else {
                z = z2;
                bits = parsableBitArray.readBits(7);
                bits2 = parsableBitArray.readBits(8);
            }
            if (bits != 0 && paint != null) {
                if (bArr != null) {
                    bits2 = bArr[bits2];
                }
                paint.setColor(iArr[bits2]);
                canvas.drawRect(i3, i2, i3 + bits, i2 + 1, paint);
            }
            i3 += bits;
            if (z) {
                return i3;
            }
            z2 = z;
        }
    }

    private static byte[] buildClutMapTable(int i, int i2, androidx.media3.common.util.ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) parsableBitArray.readBits(i2);
        }
        return bArr;
    }

    private static final class SubtitleService {
        public final int ancillaryPageId;
        public androidx.media3.extractor.text.dvb.DvbParser.DisplayDefinition displayDefinition;
        public androidx.media3.extractor.text.dvb.DvbParser.PageComposition pageComposition;
        public final int subtitlePageId;
        public final android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.RegionComposition> regions = new android.util.SparseArray<>();
        public final android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition> cluts = new android.util.SparseArray<>();
        public final android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.ObjectData> objects = new android.util.SparseArray<>();
        public final android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.ClutDefinition> ancillaryCluts = new android.util.SparseArray<>();
        public final android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.ObjectData> ancillaryObjects = new android.util.SparseArray<>();

        public SubtitleService(int i, int i2) {
            this.subtitlePageId = i;
            this.ancillaryPageId = i2;
        }

        public void reset() {
            this.regions.clear();
            this.cluts.clear();
            this.objects.clear();
            this.ancillaryCluts.clear();
            this.ancillaryObjects.clear();
            this.displayDefinition = null;
            this.pageComposition = null;
        }
    }

    private static final class DisplayDefinition {
        public final int height;
        public final int horizontalPositionMaximum;
        public final int horizontalPositionMinimum;
        public final int verticalPositionMaximum;
        public final int verticalPositionMinimum;
        public final int width;

        public DisplayDefinition(int i, int i2, int i3, int i4, int i5, int i6) {
            this.width = i;
            this.height = i2;
            this.horizontalPositionMinimum = i3;
            this.horizontalPositionMaximum = i4;
            this.verticalPositionMinimum = i5;
            this.verticalPositionMaximum = i6;
        }
    }

    private static final class PageComposition {
        public final android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.PageRegion> regions;
        public final int state;
        public final int timeOutSecs;
        public final int version;

        public PageComposition(int i, int i2, int i3, android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.PageRegion> sparseArray) {
            this.timeOutSecs = i;
            this.version = i2;
            this.state = i3;
            this.regions = sparseArray;
        }
    }

    private static final class PageRegion {
        public final int horizontalAddress;
        public final int verticalAddress;

        public PageRegion(int i, int i2) {
            this.horizontalAddress = i;
            this.verticalAddress = i2;
        }
    }

    private static final class RegionComposition {
        public final int clutId;
        public final int depth;
        public final boolean fillFlag;
        public final int height;
        public final int id;
        public final int levelOfCompatibility;
        public final int pixelCode2Bit;
        public final int pixelCode4Bit;
        public final int pixelCode8Bit;
        public final android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.RegionObject> regionObjects;
        public final int width;

        public RegionComposition(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.RegionObject> sparseArray) {
            this.id = i;
            this.fillFlag = z;
            this.width = i2;
            this.height = i3;
            this.levelOfCompatibility = i4;
            this.depth = i5;
            this.clutId = i6;
            this.pixelCode8Bit = i7;
            this.pixelCode4Bit = i8;
            this.pixelCode2Bit = i9;
            this.regionObjects = sparseArray;
        }

        public void mergeFrom(androidx.media3.extractor.text.dvb.DvbParser.RegionComposition regionComposition) {
            android.util.SparseArray<androidx.media3.extractor.text.dvb.DvbParser.RegionObject> sparseArray = regionComposition.regionObjects;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.regionObjects.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    private static final class RegionObject {
        public final int backgroundPixelCode;
        public final int foregroundPixelCode;
        public final int horizontalPosition;
        public final int provider;
        public final int type;
        public final int verticalPosition;

        public RegionObject(int i, int i2, int i3, int i4, int i5, int i6) {
            this.type = i;
            this.provider = i2;
            this.horizontalPosition = i3;
            this.verticalPosition = i4;
            this.foregroundPixelCode = i5;
            this.backgroundPixelCode = i6;
        }
    }

    private static final class ClutDefinition {
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;
        public final int id;

        public ClutDefinition(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.id = i;
            this.clutEntries2Bit = iArr;
            this.clutEntries4Bit = iArr2;
            this.clutEntries8Bit = iArr3;
        }
    }

    private static final class ObjectData {
        public final byte[] bottomFieldData;
        public final int id;
        public final boolean nonModifyingColorFlag;
        public final byte[] topFieldData;

        public ObjectData(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.id = i;
            this.nonModifyingColorFlag = z;
            this.topFieldData = bArr;
            this.bottomFieldData = bArr2;
        }
    }
}
