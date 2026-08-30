package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
final class MetadataUtil {
    private static final int PICTURE_TYPE_FRONT_COVER = 3;
    private static final int SHORT_TYPE_ALBUM = 6384738;
    private static final int SHORT_TYPE_ARTIST = 4280916;
    private static final int SHORT_TYPE_COMMENT = 6516084;
    private static final int SHORT_TYPE_COMPOSER_1 = 6516589;
    private static final int SHORT_TYPE_COMPOSER_2 = 7828084;
    private static final int SHORT_TYPE_ENCODER = 7630703;
    private static final int SHORT_TYPE_GENRE = 6776174;
    private static final int SHORT_TYPE_LYRICS = 7108978;
    private static final int SHORT_TYPE_NAME_1 = 7233901;
    private static final int SHORT_TYPE_NAME_2 = 7631467;
    private static final int SHORT_TYPE_YEAR = 6578553;
    private static final java.lang.String TAG = "MetadataUtil";
    private static final int TYPE_ALBUM_ARTIST = 1631670868;
    private static final int TYPE_COMPILATION = 1668311404;
    private static final int TYPE_COVER_ART = 1668249202;
    private static final int TYPE_DISK_NUMBER = 1684632427;
    private static final int TYPE_GAPLESS_ALBUM = 1885823344;
    private static final int TYPE_GENRE = 1735291493;
    private static final int TYPE_GROUPING = 6779504;
    private static final int TYPE_INTERNAL = 757935405;
    private static final int TYPE_RATING = 1920233063;
    private static final int TYPE_SORT_ALBUM = 1936679276;
    private static final int TYPE_SORT_ALBUM_ARTIST = 1936679265;
    private static final int TYPE_SORT_ARTIST = 1936679282;
    private static final int TYPE_SORT_COMPOSER = 1936679791;
    private static final int TYPE_SORT_TRACK_NAME = 1936682605;
    private static final int TYPE_TEMPO = 1953329263;
    private static final int TYPE_TOP_BYTE_COPYRIGHT = 169;
    private static final int TYPE_TOP_BYTE_REPLACEMENT = 253;
    private static final int TYPE_TRACK_NUMBER = 1953655662;
    private static final int TYPE_TV_SHOW = 1953919848;
    private static final int TYPE_TV_SORT_SHOW = 1936683886;

    private MetadataUtil() {
    }

    public static void setFormatMetadata(int i, androidx.media3.common.Metadata metadata, androidx.media3.common.Format.Builder builder, androidx.media3.common.Metadata... metadataArr) {
        androidx.media3.common.Metadata metadata2 = new androidx.media3.common.Metadata(new androidx.media3.common.Metadata.Entry[0]);
        if (metadata != null) {
            for (int i2 = 0; i2 < metadata.length(); i2++) {
                androidx.media3.common.Metadata.Entry entry = metadata.get(i2);
                if (entry instanceof androidx.media3.container.MdtaMetadataEntry) {
                    androidx.media3.container.MdtaMetadataEntry mdtaMetadataEntry = (androidx.media3.container.MdtaMetadataEntry) entry;
                    if (!mdtaMetadataEntry.key.equals(androidx.media3.container.MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                        metadata2 = metadata2.copyWithAppendedEntries(mdtaMetadataEntry);
                    } else if (i == 2) {
                        metadata2 = metadata2.copyWithAppendedEntries(mdtaMetadataEntry);
                    }
                }
            }
        }
        for (androidx.media3.common.Metadata metadata3 : metadataArr) {
            metadata2 = metadata2.copyWithAppendedEntriesFrom(metadata3);
        }
        if (metadata2.length() > 0) {
            builder.setMetadata(metadata2);
        }
    }

    public static void setFormatGaplessInfo(int i, androidx.media3.extractor.GaplessInfoHolder gaplessInfoHolder, androidx.media3.common.Format.Builder builder) {
        if (i == 1 && gaplessInfoHolder.hasGaplessInfo()) {
            builder.setEncoderDelay(gaplessInfoHolder.encoderDelay).setEncoderPadding(gaplessInfoHolder.encoderPadding);
        }
    }

    public static androidx.media3.common.Metadata.Entry parseIlstElement(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition() + parsableByteArray.readInt();
        int i = parsableByteArray.readInt();
        int i2 = (i >> 24) & 255;
        try {
            if (i2 == 169 || i2 == TYPE_TOP_BYTE_REPLACEMENT) {
                int i3 = 16777215 & i;
                if (i3 == SHORT_TYPE_COMMENT) {
                    androidx.media3.extractor.metadata.id3.CommentFrame commentAttribute = parseCommentAttribute(i, parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return commentAttribute;
                }
                if (i3 == SHORT_TYPE_NAME_1 || i3 == SHORT_TYPE_NAME_2) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute = parseTextAttribute(i, "TIT2", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute;
                }
                if (i3 == SHORT_TYPE_COMPOSER_1 || i3 == SHORT_TYPE_COMPOSER_2) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute2 = parseTextAttribute(i, "TCOM", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute2;
                }
                if (i3 == SHORT_TYPE_YEAR) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute3 = parseTextAttribute(i, "TDRC", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute3;
                }
                if (i3 == SHORT_TYPE_ARTIST) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute4 = parseTextAttribute(i, "TPE1", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute4;
                }
                if (i3 == SHORT_TYPE_ENCODER) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute5 = parseTextAttribute(i, "TSSE", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute5;
                }
                if (i3 == SHORT_TYPE_ALBUM) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute6 = parseTextAttribute(i, "TALB", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute6;
                }
                if (i3 == SHORT_TYPE_LYRICS) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute7 = parseTextAttribute(i, "USLT", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute7;
                }
                if (i3 == SHORT_TYPE_GENRE) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute8 = parseTextAttribute(i, "TCON", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute8;
                }
                if (i3 == TYPE_GROUPING) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute9 = parseTextAttribute(i, "TIT1", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute9;
                }
            } else {
                if (i == TYPE_GENRE) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame standardGenreAttribute = parseStandardGenreAttribute(parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return standardGenreAttribute;
                }
                if (i == TYPE_DISK_NUMBER) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame indexAndCountAttribute = parseIndexAndCountAttribute(i, "TPOS", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return indexAndCountAttribute;
                }
                if (i == TYPE_TRACK_NUMBER) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame indexAndCountAttribute2 = parseIndexAndCountAttribute(i, "TRCK", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return indexAndCountAttribute2;
                }
                if (i == TYPE_TEMPO) {
                    androidx.media3.extractor.metadata.id3.Id3Frame integerAttribute = parseIntegerAttribute(i, "TBPM", parsableByteArray, true, false);
                    parsableByteArray.setPosition(position);
                    return integerAttribute;
                }
                if (i == TYPE_COMPILATION) {
                    androidx.media3.extractor.metadata.id3.Id3Frame integerAttribute2 = parseIntegerAttribute(i, "TCMP", parsableByteArray, true, true);
                    parsableByteArray.setPosition(position);
                    return integerAttribute2;
                }
                if (i == TYPE_COVER_ART) {
                    androidx.media3.extractor.metadata.id3.ApicFrame coverArt = parseCoverArt(parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return coverArt;
                }
                if (i == TYPE_ALBUM_ARTIST) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute10 = parseTextAttribute(i, "TPE2", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute10;
                }
                if (i == TYPE_SORT_TRACK_NAME) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute11 = parseTextAttribute(i, "TSOT", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute11;
                }
                if (i == TYPE_SORT_ALBUM) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute12 = parseTextAttribute(i, "TSOA", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute12;
                }
                if (i == TYPE_SORT_ARTIST) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute13 = parseTextAttribute(i, "TSOP", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute13;
                }
                if (i == TYPE_SORT_ALBUM_ARTIST) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute14 = parseTextAttribute(i, "TSO2", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute14;
                }
                if (i == TYPE_SORT_COMPOSER) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute15 = parseTextAttribute(i, "TSOC", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute15;
                }
                if (i == TYPE_RATING) {
                    androidx.media3.extractor.metadata.id3.Id3Frame integerAttribute3 = parseIntegerAttribute(i, "ITUNESADVISORY", parsableByteArray, false, false);
                    parsableByteArray.setPosition(position);
                    return integerAttribute3;
                }
                if (i == TYPE_GAPLESS_ALBUM) {
                    androidx.media3.extractor.metadata.id3.Id3Frame integerAttribute4 = parseIntegerAttribute(i, "ITUNESGAPLESS", parsableByteArray, false, true);
                    parsableByteArray.setPosition(position);
                    return integerAttribute4;
                }
                if (i == TYPE_TV_SORT_SHOW) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute16 = parseTextAttribute(i, "TVSHOWSORT", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute16;
                }
                if (i == TYPE_TV_SHOW) {
                    androidx.media3.extractor.metadata.id3.TextInformationFrame textAttribute17 = parseTextAttribute(i, "TVSHOW", parsableByteArray);
                    parsableByteArray.setPosition(position);
                    return textAttribute17;
                }
                if (i == TYPE_INTERNAL) {
                    androidx.media3.extractor.metadata.id3.Id3Frame internalAttribute = parseInternalAttribute(parsableByteArray, position);
                    parsableByteArray.setPosition(position);
                    return internalAttribute;
                }
            }
            androidx.media3.common.util.Log.d(TAG, "Skipped unknown metadata entry: " + androidx.media3.extractor.mp4.Atom.getAtomTypeString(i));
            parsableByteArray.setPosition(position);
            return null;
        } catch (java.lang.Throwable th) {
            parsableByteArray.setPosition(position);
            throw th;
        }
    }

    public static androidx.media3.container.MdtaMetadataEntry parseMdtaMetadataEntryFromIlst(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, java.lang.String str) {
        while (true) {
            int position = parsableByteArray.getPosition();
            if (position >= i) {
                return null;
            }
            int i2 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1684108385) {
                int i3 = parsableByteArray.readInt();
                int i4 = parsableByteArray.readInt();
                int i5 = i2 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                return new androidx.media3.container.MdtaMetadataEntry(str, bArr, i4, i3);
            }
            parsableByteArray.setPosition(position + i2);
        }
    }

    private static androidx.media3.extractor.metadata.id3.TextInformationFrame parseTextAttribute(int i, java.lang.String str, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            return new androidx.media3.extractor.metadata.id3.TextInformationFrame(str, (java.lang.String) null, com.google.common.collect.ImmutableList.of(parsableByteArray.readNullTerminatedString(i2 - 16)));
        }
        androidx.media3.common.util.Log.w(TAG, "Failed to parse text attribute: " + androidx.media3.extractor.mp4.Atom.getAtomTypeString(i));
        return null;
    }

    private static androidx.media3.extractor.metadata.id3.CommentFrame parseCommentAttribute(int i, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            java.lang.String nullTerminatedString = parsableByteArray.readNullTerminatedString(i2 - 16);
            return new androidx.media3.extractor.metadata.id3.CommentFrame(androidx.media3.common.C.LANGUAGE_UNDETERMINED, nullTerminatedString, nullTerminatedString);
        }
        androidx.media3.common.util.Log.w(TAG, "Failed to parse comment attribute: " + androidx.media3.extractor.mp4.Atom.getAtomTypeString(i));
        return null;
    }

    private static androidx.media3.extractor.metadata.id3.Id3Frame parseIntegerAttribute(int i, java.lang.String str, androidx.media3.common.util.ParsableByteArray parsableByteArray, boolean z, boolean z2) {
        int integerAttribute = parseIntegerAttribute(parsableByteArray);
        if (z2) {
            integerAttribute = java.lang.Math.min(1, integerAttribute);
        }
        if (integerAttribute < 0) {
            androidx.media3.common.util.Log.w(TAG, "Failed to parse uint8 attribute: " + androidx.media3.extractor.mp4.Atom.getAtomTypeString(i));
            return null;
        }
        if (z) {
            return new androidx.media3.extractor.metadata.id3.TextInformationFrame(str, (java.lang.String) null, com.google.common.collect.ImmutableList.of(java.lang.Integer.toString(integerAttribute)));
        }
        return new androidx.media3.extractor.metadata.id3.CommentFrame(androidx.media3.common.C.LANGUAGE_UNDETERMINED, str, java.lang.Integer.toString(integerAttribute));
    }

    private static int parseIntegerAttribute(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int i = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            int i2 = i - 16;
            if (i2 == 1) {
                return parsableByteArray.readUnsignedByte();
            }
            if (i2 == 2) {
                return parsableByteArray.readUnsignedShort();
            }
            if (i2 == 3) {
                return parsableByteArray.readUnsignedInt24();
            }
            if (i2 == 4 && (parsableByteArray.peekUnsignedByte() & 128) == 0) {
                return parsableByteArray.readUnsignedIntToInt();
            }
        }
        androidx.media3.common.util.Log.w(TAG, "Failed to parse data atom to int");
        return -1;
    }

    private static androidx.media3.extractor.metadata.id3.TextInformationFrame parseIndexAndCountAttribute(int i, java.lang.String str, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385 && i2 >= 22) {
            parsableByteArray.skipBytes(10);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (unsignedShort > 0) {
                java.lang.String str2 = "" + unsignedShort;
                int unsignedShort2 = parsableByteArray.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    str2 = str2 + "/" + unsignedShort2;
                }
                return new androidx.media3.extractor.metadata.id3.TextInformationFrame(str, (java.lang.String) null, com.google.common.collect.ImmutableList.of(str2));
            }
        }
        androidx.media3.common.util.Log.w(TAG, "Failed to parse index/count attribute: " + androidx.media3.extractor.mp4.Atom.getAtomTypeString(i));
        return null;
    }

    private static androidx.media3.extractor.metadata.id3.TextInformationFrame parseStandardGenreAttribute(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        java.lang.String strResolveV1Genre = androidx.media3.extractor.metadata.id3.Id3Util.resolveV1Genre(parseIntegerAttribute(parsableByteArray) - 1);
        if (strResolveV1Genre != null) {
            return new androidx.media3.extractor.metadata.id3.TextInformationFrame("TCON", (java.lang.String) null, com.google.common.collect.ImmutableList.of(strResolveV1Genre));
        }
        androidx.media3.common.util.Log.w(TAG, "Failed to parse standard genre code");
        return null;
    }

    private static androidx.media3.extractor.metadata.id3.ApicFrame parseCoverArt(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        java.lang.String str;
        int i = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            int fullAtomFlags = androidx.media3.extractor.mp4.Atom.parseFullAtomFlags(parsableByteArray.readInt());
            if (fullAtomFlags == 13) {
                str = androidx.media3.common.MimeTypes.IMAGE_JPEG;
            } else {
                str = fullAtomFlags == 14 ? androidx.media3.common.MimeTypes.IMAGE_PNG : null;
            }
            if (str == null) {
                androidx.media3.common.util.Log.w(TAG, "Unrecognized cover art flags: " + fullAtomFlags);
                return null;
            }
            parsableByteArray.skipBytes(4);
            int i2 = i - 16;
            byte[] bArr = new byte[i2];
            parsableByteArray.readBytes(bArr, 0, i2);
            return new androidx.media3.extractor.metadata.id3.ApicFrame(str, null, 3, bArr);
        }
        androidx.media3.common.util.Log.w(TAG, "Failed to parse cover art attribute");
        return null;
    }

    private static androidx.media3.extractor.metadata.id3.Id3Frame parseInternalAttribute(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        java.lang.String nullTerminatedString = null;
        java.lang.String nullTerminatedString2 = null;
        int i2 = -1;
        int i3 = -1;
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i4 = parsableByteArray.readInt();
            int i5 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            if (i5 == 1835360622) {
                nullTerminatedString = parsableByteArray.readNullTerminatedString(i4 - 12);
            } else if (i5 == 1851878757) {
                nullTerminatedString2 = parsableByteArray.readNullTerminatedString(i4 - 12);
            } else {
                if (i5 == 1684108385) {
                    i2 = position;
                    i3 = i4;
                }
                parsableByteArray.skipBytes(i4 - 12);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i2 == -1) {
            return null;
        }
        parsableByteArray.setPosition(i2);
        parsableByteArray.skipBytes(16);
        return new androidx.media3.extractor.metadata.id3.InternalFrame(nullTerminatedString, nullTerminatedString2, parsableByteArray.readNullTerminatedString(i3 - 16));
    }
}
