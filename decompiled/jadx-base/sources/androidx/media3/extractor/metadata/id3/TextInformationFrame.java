package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public final class TextInformationFrame extends androidx.media3.extractor.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.TextInformationFrame> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.id3.TextInformationFrame>() { // from class: androidx.media3.extractor.metadata.id3.TextInformationFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.TextInformationFrame createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.id3.TextInformationFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.id3.TextInformationFrame[] newArray(int i) {
            return new androidx.media3.extractor.metadata.id3.TextInformationFrame[i];
        }
    };
    public final java.lang.String description;

    @java.lang.Deprecated
    public final java.lang.String value;
    public final com.google.common.collect.ImmutableList<java.lang.String> values;

    public TextInformationFrame(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
        super(str);
        androidx.media3.common.util.Assertions.checkArgument(!list.isEmpty());
        this.description = str2;
        com.google.common.collect.ImmutableList<java.lang.String> immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        this.values = immutableListCopyOf;
        this.value = immutableListCopyOf.get(0);
    }

    @java.lang.Deprecated
    public TextInformationFrame(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(str, str2, com.google.common.collect.ImmutableList.of(str3));
    }

    private TextInformationFrame(android.os.Parcel parcel) {
        this((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(parcel.readString()), parcel.readString(), com.google.common.collect.ImmutableList.copyOf((java.lang.String[]) androidx.media3.common.util.Assertions.checkNotNull(parcel.createStringArray())));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        java.lang.String str = this.id;
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b = 11;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    b = 12;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b = 13;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b = 14;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b = 15;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b = 16;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b = 17;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b = 18;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b = 19;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b = 20;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b = 21;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b = 22;
                }
                break;
        }
        try {
            switch (b) {
                case 0:
                case 10:
                    builder.setAlbumTitle(this.values.get(0));
                    break;
                case 1:
                case 11:
                    builder.setComposer(this.values.get(0));
                    break;
                case 2:
                case 13:
                    java.lang.String str2 = this.values.get(0);
                    builder.setRecordingMonth(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2.substring(2, 4)))).setRecordingDay(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    builder.setArtist(this.values.get(0));
                    break;
                case 4:
                case 19:
                    builder.setAlbumArtist(this.values.get(0));
                    break;
                case 5:
                case 20:
                    builder.setConductor(this.values.get(0));
                    break;
                case 6:
                case 21:
                    java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(this.values.get(0), "/");
                    builder.setTrackNumber(java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrSplit[0]))).setTotalTrackCount(strArrSplit.length > 1 ? java.lang.Integer.valueOf(java.lang.Integer.parseInt(strArrSplit[1])) : null);
                    break;
                case 7:
                case 17:
                    builder.setTitle(this.values.get(0));
                    break;
                case 8:
                case 16:
                    builder.setWriter(this.values.get(0));
                    break;
                case 9:
                case 22:
                    builder.setRecordingYear(java.lang.Integer.valueOf(java.lang.Integer.parseInt(this.values.get(0))));
                    break;
                case 12:
                    java.lang.Integer numTryParse = com.google.common.primitives.Ints.tryParse(this.values.get(0));
                    if (numTryParse == null) {
                        builder.setGenre(this.values.get(0));
                    } else {
                        java.lang.String strResolveV1Genre = androidx.media3.extractor.metadata.id3.Id3Util.resolveV1Genre(numTryParse.intValue());
                        if (strResolveV1Genre != null) {
                            builder.setGenre(strResolveV1Genre);
                        }
                    }
                    break;
                case 14:
                    java.util.List<java.lang.Integer> id3v2point4TimestampFrameForDate = parseId3v2point4TimestampFrameForDate(this.values.get(0));
                    int size = id3v2point4TimestampFrameForDate.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                builder.setRecordingDay(id3v2point4TimestampFrameForDate.get(2));
                            }
                        }
                        builder.setRecordingMonth(id3v2point4TimestampFrameForDate.get(1));
                    }
                    builder.setRecordingYear(id3v2point4TimestampFrameForDate.get(0));
                    break;
                case 15:
                    java.util.List<java.lang.Integer> id3v2point4TimestampFrameForDate2 = parseId3v2point4TimestampFrameForDate(this.values.get(0));
                    int size2 = id3v2point4TimestampFrameForDate2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                builder.setReleaseDay(id3v2point4TimestampFrameForDate2.get(2));
                            }
                        }
                        builder.setReleaseMonth(id3v2point4TimestampFrameForDate2.get(1));
                    }
                    builder.setReleaseYear(id3v2point4TimestampFrameForDate2.get(0));
                    break;
            }
        } catch (java.lang.NumberFormatException | java.lang.StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.id3.TextInformationFrame textInformationFrame = (androidx.media3.extractor.metadata.id3.TextInformationFrame) obj;
        return androidx.media3.common.util.Util.areEqual(this.id, textInformationFrame.id) && androidx.media3.common.util.Util.areEqual(this.description, textInformationFrame.description) && this.values.equals(textInformationFrame.values);
    }

    public int hashCode() {
        int iHashCode = (com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.id.hashCode()) * 31;
        java.lang.String str = this.description;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.values.hashCode();
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public java.lang.String toString() {
        return this.id + ": description=" + this.description + ": values=" + this.values;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.description);
        parcel.writeStringArray((java.lang.String[]) this.values.toArray(new java.lang.String[0]));
    }

    private static java.util.List<java.lang.Integer> parseId3v2point4TimestampFrameForDate(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (java.lang.NumberFormatException unused) {
            return new java.util.ArrayList();
        }
    }
}
