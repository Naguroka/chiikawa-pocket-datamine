package androidx.media3.exoplayer.hls.playlist;

/* JADX INFO: loaded from: classes.dex */
public final class HlsPlaylistParser implements androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<androidx.media3.exoplayer.hls.playlist.HlsPlaylist> {
    private static final java.lang.String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final java.lang.String BOOLEAN_FALSE = "NO";
    private static final java.lang.String BOOLEAN_TRUE = "YES";
    private static final java.lang.String KEYFORMAT_IDENTITY = "identity";
    private static final java.lang.String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final java.lang.String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final java.lang.String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final java.lang.String LOG_TAG = "HlsPlaylistParser";
    private static final java.lang.String METHOD_AES_128 = "AES-128";
    private static final java.lang.String METHOD_NONE = "NONE";
    private static final java.lang.String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final java.lang.String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final java.lang.String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final java.lang.String PLAYLIST_HEADER = "#EXTM3U";
    private static final java.lang.String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final java.lang.String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final java.lang.String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final java.lang.String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final java.lang.String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final java.lang.String TAG_GAP = "#EXT-X-GAP";
    private static final java.lang.String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final java.lang.String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final java.lang.String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final java.lang.String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final java.lang.String TAG_KEY = "#EXT-X-KEY";
    private static final java.lang.String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final java.lang.String TAG_MEDIA_DURATION = "#EXTINF";
    private static final java.lang.String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final java.lang.String TAG_PART = "#EXT-X-PART";
    private static final java.lang.String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final java.lang.String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final java.lang.String TAG_PREFIX = "#EXT";
    private static final java.lang.String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final java.lang.String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final java.lang.String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final java.lang.String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final java.lang.String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final java.lang.String TAG_SKIP = "#EXT-X-SKIP";
    private static final java.lang.String TAG_START = "#EXT-X-START";
    private static final java.lang.String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final java.lang.String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final java.lang.String TAG_VERSION = "#EXT-X-VERSION";
    private static final java.lang.String TYPE_AUDIO = "AUDIO";
    private static final java.lang.String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final java.lang.String TYPE_MAP = "MAP";
    private static final java.lang.String TYPE_PART = "PART";
    private static final java.lang.String TYPE_SUBTITLES = "SUBTITLES";
    private static final java.lang.String TYPE_VIDEO = "VIDEO";
    private final androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist multivariantPlaylist;
    private final androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist previousMediaPlaylist;
    private static final java.util.regex.Pattern REGEX_AVERAGE_BANDWIDTH = java.util.regex.Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_VIDEO = java.util.regex.Pattern.compile("VIDEO=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_AUDIO = java.util.regex.Pattern.compile("AUDIO=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_SUBTITLES = java.util.regex.Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_CLOSED_CAPTIONS = java.util.regex.Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_BANDWIDTH = java.util.regex.Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_CHANNELS = java.util.regex.Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_CODECS = java.util.regex.Pattern.compile("CODECS=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_RESOLUTION = java.util.regex.Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final java.util.regex.Pattern REGEX_FRAME_RATE = java.util.regex.Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_TARGET_DURATION = java.util.regex.Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_ATTR_DURATION = java.util.regex.Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_PART_TARGET_DURATION = java.util.regex.Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_VERSION = java.util.regex.Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_PLAYLIST_TYPE = java.util.regex.Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final java.util.regex.Pattern REGEX_CAN_SKIP_UNTIL = java.util.regex.Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_CAN_SKIP_DATE_RANGES = compileBooleanAttrPattern("CAN-SKIP-DATERANGES");
    private static final java.util.regex.Pattern REGEX_SKIPPED_SEGMENTS = java.util.regex.Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_HOLD_BACK = java.util.regex.Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_PART_HOLD_BACK = java.util.regex.Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_CAN_BLOCK_RELOAD = compileBooleanAttrPattern("CAN-BLOCK-RELOAD");
    private static final java.util.regex.Pattern REGEX_MEDIA_SEQUENCE = java.util.regex.Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_MEDIA_DURATION = java.util.regex.Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_MEDIA_TITLE = java.util.regex.Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final java.util.regex.Pattern REGEX_LAST_MSN = java.util.regex.Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_LAST_PART = java.util.regex.Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_TIME_OFFSET = java.util.regex.Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final java.util.regex.Pattern REGEX_BYTERANGE = java.util.regex.Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final java.util.regex.Pattern REGEX_ATTR_BYTERANGE = java.util.regex.Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final java.util.regex.Pattern REGEX_BYTERANGE_START = java.util.regex.Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_BYTERANGE_LENGTH = java.util.regex.Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final java.util.regex.Pattern REGEX_METHOD = java.util.regex.Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final java.util.regex.Pattern REGEX_KEYFORMAT = java.util.regex.Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_KEYFORMATVERSIONS = java.util.regex.Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_URI = java.util.regex.Pattern.compile("URI=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_IV = java.util.regex.Pattern.compile("IV=([^,.*]+)");
    private static final java.util.regex.Pattern REGEX_TYPE = java.util.regex.Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final java.util.regex.Pattern REGEX_PRELOAD_HINT_TYPE = java.util.regex.Pattern.compile("TYPE=(PART|MAP)");
    private static final java.util.regex.Pattern REGEX_LANGUAGE = java.util.regex.Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_NAME = java.util.regex.Pattern.compile("NAME=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_GROUP_ID = java.util.regex.Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_CHARACTERISTICS = java.util.regex.Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_INSTREAM_ID = java.util.regex.Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final java.util.regex.Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final java.util.regex.Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final java.util.regex.Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final java.util.regex.Pattern REGEX_INDEPENDENT = compileBooleanAttrPattern("INDEPENDENT");
    private static final java.util.regex.Pattern REGEX_GAP = compileBooleanAttrPattern("GAP");
    private static final java.util.regex.Pattern REGEX_PRECISE = compileBooleanAttrPattern("PRECISE");
    private static final java.util.regex.Pattern REGEX_VALUE = java.util.regex.Pattern.compile("VALUE=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_IMPORT = java.util.regex.Pattern.compile("IMPORT=\"(.+?)\"");
    private static final java.util.regex.Pattern REGEX_VARIABLE_REFERENCE = java.util.regex.Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends java.io.IOException {
    }

    public HlsPlaylistParser() {
        this(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.EMPTY, null);
    }

    public HlsPlaylistParser(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist hlsMultivariantPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist) {
        this.multivariantPlaylist = hlsMultivariantPlaylist;
        this.previousMediaPlaylist = hlsMediaPlaylist;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public androidx.media3.exoplayer.hls.playlist.HlsPlaylist parse(android.net.Uri uri, java.io.InputStream inputStream) throws java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        try {
            if (!checkPlaylistHeader(bufferedReader)) {
                throw androidx.media3.common.ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                java.lang.String line = bufferedReader.readLine();
                if (line != null) {
                    java.lang.String strTrim = line.trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.startsWith(TAG_STREAM_INF)) {
                            arrayDeque.add(strTrim);
                            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist multivariantPlaylist = parseMultivariantPlaylist(new androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.LineIterator(arrayDeque, bufferedReader), uri.toString());
                            androidx.media3.common.util.Util.closeQuietly(bufferedReader);
                            return multivariantPlaylist;
                        }
                        if (!strTrim.startsWith(TAG_TARGET_DURATION) && !strTrim.startsWith(TAG_MEDIA_SEQUENCE) && !strTrim.startsWith(TAG_MEDIA_DURATION) && !strTrim.startsWith(TAG_KEY) && !strTrim.startsWith(TAG_BYTERANGE) && !strTrim.equals(TAG_DISCONTINUITY) && !strTrim.equals(TAG_DISCONTINUITY_SEQUENCE) && !strTrim.equals(TAG_ENDLIST)) {
                            arrayDeque.add(strTrim);
                        }
                        arrayDeque.add(strTrim);
                        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist mediaPlaylist = parseMediaPlaylist(this.multivariantPlaylist, this.previousMediaPlaylist, new androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.LineIterator(arrayDeque, bufferedReader), uri.toString());
                        androidx.media3.common.util.Util.closeQuietly(bufferedReader);
                        return mediaPlaylist;
                    }
                } else {
                    androidx.media3.common.util.Util.closeQuietly(bufferedReader);
                    throw androidx.media3.common.ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
            }
        } catch (java.lang.Throwable th) {
            androidx.media3.common.util.Util.closeQuietly(bufferedReader);
            throw th;
        }
    }

    private static boolean checkPlaylistHeader(java.io.BufferedReader bufferedReader) throws java.io.IOException {
        int i = bufferedReader.read();
        if (i == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i = bufferedReader.read();
        }
        int iSkipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, i);
        for (int i2 = 0; i2 < 7; i2++) {
            if (iSkipIgnorableWhitespace != PLAYLIST_HEADER.charAt(i2)) {
                return false;
            }
            iSkipIgnorableWhitespace = bufferedReader.read();
        }
        return androidx.media3.common.util.Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, iSkipIgnorableWhitespace));
    }

    private static int skipIgnorableWhitespace(java.io.BufferedReader bufferedReader, boolean z, int i) throws java.io.IOException {
        while (i != -1 && java.lang.Character.isWhitespace(i) && (z || !androidx.media3.common.util.Util.isLinebreak(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:79:0x0329  */
    private static androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist parseMultivariantPlaylist(androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.LineIterator lineIterator, java.lang.String str) throws java.io.IOException {
        java.util.ArrayList arrayList;
        java.lang.String mediaMimeType;
        int i;
        java.lang.String str2;
        java.lang.String mediaMimeType2;
        int i2;
        int i3;
        android.net.Uri uriResolveToUri;
        java.util.HashMap map;
        int i4;
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.HashMap map3 = new java.util.HashMap();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            boolean zHasNext = lineIterator.hasNext();
            java.lang.String str3 = androidx.media3.common.MimeTypes.APPLICATION_M3U8;
            if (zHasNext) {
                java.lang.String next = lineIterator.next();
                if (next.startsWith(TAG_PREFIX)) {
                    arrayList9.add(next);
                }
                boolean zStartsWith = next.startsWith(TAG_I_FRAME_STREAM_INF);
                boolean z3 = z;
                if (next.startsWith(TAG_DEFINE)) {
                    map3.put(parseStringAttr(next, REGEX_NAME, map3), parseStringAttr(next, REGEX_VALUE, map3));
                } else {
                    if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                        map = map2;
                        arrayList4 = arrayList4;
                        arrayList5 = arrayList5;
                        z = true;
                    } else if (next.startsWith(TAG_MEDIA)) {
                        arrayList7.add(next);
                    } else if (next.startsWith(TAG_SESSION_KEY)) {
                        androidx.media3.common.DrmInitData.SchemeData drmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, map3), map3);
                        if (drmSchemeData != null) {
                            arrayList8.add(new androidx.media3.common.DrmInitData(parseEncryptionScheme(parseStringAttr(next, REGEX_METHOD, map3)), drmSchemeData));
                        }
                    } else if (next.startsWith(TAG_STREAM_INF) || zStartsWith) {
                        boolean zContains = z2 | next.contains(ATTR_CLOSED_CAPTIONS_NONE);
                        int i5 = zStartsWith ? 16384 : 0;
                        int intAttr = parseIntAttr(next, REGEX_BANDWIDTH);
                        int optionalIntAttr = parseOptionalIntAttr(next, REGEX_AVERAGE_BANDWIDTH, -1);
                        java.lang.String optionalStringAttr = parseOptionalStringAttr(next, REGEX_CODECS, map3);
                        java.lang.String optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_RESOLUTION, map3);
                        if (optionalStringAttr2 != null) {
                            java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(optionalStringAttr2, "x");
                            int i6 = java.lang.Integer.parseInt(strArrSplit[0]);
                            int i7 = java.lang.Integer.parseInt(strArrSplit[1]);
                            if (i6 <= 0 || i7 <= 0) {
                                i7 = -1;
                                i4 = -1;
                            } else {
                                i4 = i6;
                            }
                            i3 = i7;
                            i2 = i4;
                        } else {
                            i2 = -1;
                            i3 = -1;
                        }
                        java.lang.String optionalStringAttr3 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, map3);
                        float f = optionalStringAttr3 != null ? java.lang.Float.parseFloat(optionalStringAttr3) : -1.0f;
                        java.lang.String optionalStringAttr4 = parseOptionalStringAttr(next, REGEX_VIDEO, map3);
                        java.lang.String optionalStringAttr5 = parseOptionalStringAttr(next, REGEX_AUDIO, map3);
                        java.util.HashMap map4 = map2;
                        java.lang.String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_SUBTITLES, map3);
                        java.lang.String optionalStringAttr7 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, map3);
                        if (zStartsWith) {
                            uriResolveToUri = androidx.media3.common.util.UriUtil.resolveToUri(str, parseStringAttr(next, REGEX_URI, map3));
                        } else {
                            if (!lineIterator.hasNext()) {
                                throw androidx.media3.common.ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            uriResolveToUri = androidx.media3.common.util.UriUtil.resolveToUri(str, replaceVariableReferences(lineIterator.next(), map3));
                        }
                        arrayList2.add(new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant(uriResolveToUri, new androidx.media3.common.Format.Builder().setId(arrayList2.size()).setContainerMimeType(androidx.media3.common.MimeTypes.APPLICATION_M3U8).setCodecs(optionalStringAttr).setAverageBitrate(optionalIntAttr).setPeakBitrate(intAttr).setWidth(i2).setHeight(i3).setFrameRate(f).setRoleFlags(i5).build(), optionalStringAttr4, optionalStringAttr5, optionalStringAttr6, optionalStringAttr7));
                        map = map4;
                        java.util.ArrayList arrayList10 = (java.util.ArrayList) map.get(uriResolveToUri);
                        if (arrayList10 == null) {
                            arrayList10 = new java.util.ArrayList();
                            map.put(uriResolveToUri, arrayList10);
                        }
                        arrayList10.add(new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo(optionalIntAttr, intAttr, optionalStringAttr4, optionalStringAttr5, optionalStringAttr6, optionalStringAttr7));
                        z = z3;
                        z2 = zContains;
                    }
                    map2 = map;
                    arrayList8 = arrayList8;
                    arrayList6 = arrayList6;
                    arrayList9 = arrayList9;
                    arrayList5 = arrayList5;
                    arrayList4 = arrayList4;
                    arrayList3 = arrayList3;
                    arrayList7 = arrayList7;
                }
                map = map2;
                arrayList4 = arrayList4;
                arrayList5 = arrayList5;
                z = z3;
                map2 = map;
                arrayList8 = arrayList8;
                arrayList6 = arrayList6;
                arrayList9 = arrayList9;
                arrayList5 = arrayList5;
                arrayList4 = arrayList4;
                arrayList3 = arrayList3;
                arrayList7 = arrayList7;
            } else {
                java.util.HashMap map5 = map2;
                java.util.ArrayList arrayList11 = arrayList7;
                java.util.ArrayList arrayList12 = arrayList3;
                java.util.ArrayList arrayList13 = arrayList4;
                java.util.ArrayList arrayList14 = arrayList5;
                java.util.ArrayList arrayList15 = arrayList6;
                java.util.ArrayList arrayList16 = arrayList9;
                boolean z4 = z;
                java.util.ArrayList arrayList17 = arrayList8;
                java.util.ArrayList arrayList18 = new java.util.ArrayList();
                java.util.HashSet hashSet = new java.util.HashSet();
                for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                    androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variant = (androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant) arrayList2.get(i8);
                    if (hashSet.add(variant.url)) {
                        androidx.media3.common.util.Assertions.checkState(variant.format.metadata == null);
                        arrayList18.add(variant.copyWithFormat(variant.format.buildUpon().setMetadata(new androidx.media3.common.Metadata(new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry(null, null, (java.util.List) androidx.media3.common.util.Assertions.checkNotNull((java.util.ArrayList) map5.get(variant.url))))).build()));
                    }
                }
                android.net.Uri uri = null;
                java.util.ArrayList arrayList19 = null;
                androidx.media3.common.Format formatBuild = null;
                int i9 = 0;
                while (i9 < arrayList11.size()) {
                    java.util.ArrayList arrayList20 = arrayList11;
                    java.lang.String str4 = (java.lang.String) arrayList20.get(i9);
                    java.lang.String stringAttr = parseStringAttr(str4, REGEX_GROUP_ID, map3);
                    java.lang.String stringAttr2 = parseStringAttr(str4, REGEX_NAME, map3);
                    androidx.media3.common.Format.Builder language = new androidx.media3.common.Format.Builder().setId(stringAttr + ":" + stringAttr2).setLabel(stringAttr2).setContainerMimeType(str3).setSelectionFlags(parseSelectionFlags(str4)).setRoleFlags(parseRoleFlags(str4, map3)).setLanguage(parseOptionalStringAttr(str4, REGEX_LANGUAGE, map3));
                    java.lang.String optionalStringAttr8 = parseOptionalStringAttr(str4, REGEX_URI, map3);
                    android.net.Uri uriResolveToUri2 = optionalStringAttr8 == null ? uri : androidx.media3.common.util.UriUtil.resolveToUri(str, optionalStringAttr8);
                    arrayList11 = arrayList20;
                    java.lang.String str5 = str3;
                    androidx.media3.common.Metadata metadata = new androidx.media3.common.Metadata(new androidx.media3.exoplayer.hls.HlsTrackMetadataEntry(stringAttr, stringAttr2, java.util.Collections.emptyList()));
                    java.lang.String stringAttr3 = parseStringAttr(str4, REGEX_TYPE, map3);
                    stringAttr3.hashCode();
                    switch (stringAttr3) {
                        case "SUBTITLES":
                            formatBuild = formatBuild;
                            arrayList13 = arrayList13;
                            arrayList = arrayList12;
                            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variantWithSubtitleGroup = getVariantWithSubtitleGroup(arrayList2, stringAttr);
                            if (variantWithSubtitleGroup != null) {
                                java.lang.String codecsOfType = androidx.media3.common.util.Util.getCodecsOfType(variantWithSubtitleGroup.format.codecs, 3);
                                language.setCodecs(codecsOfType);
                                mediaMimeType = androidx.media3.common.MimeTypes.getMediaMimeType(codecsOfType);
                            } else {
                                mediaMimeType = null;
                            }
                            if (mediaMimeType == null) {
                                mediaMimeType = androidx.media3.common.MimeTypes.TEXT_VTT;
                            }
                            language.setSampleMimeType(mediaMimeType).setMetadata(metadata);
                            if (uriResolveToUri2 != null) {
                                androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition rendition = new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2);
                                arrayList14 = arrayList14;
                                arrayList14.add(rendition);
                                break;
                            } else {
                                arrayList14 = arrayList14;
                                androidx.media3.common.util.Log.w(LOG_TAG, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            }
                            break;
                        case "CLOSED-CAPTIONS":
                            formatBuild = formatBuild;
                            arrayList13 = arrayList13;
                            arrayList = arrayList12;
                            java.lang.String stringAttr4 = parseStringAttr(str4, REGEX_INSTREAM_ID, map3);
                            if (stringAttr4.startsWith("CC")) {
                                i = java.lang.Integer.parseInt(stringAttr4.substring(2));
                                str2 = androidx.media3.common.MimeTypes.APPLICATION_CEA608;
                            } else {
                                i = java.lang.Integer.parseInt(stringAttr4.substring(7));
                                str2 = androidx.media3.common.MimeTypes.APPLICATION_CEA708;
                            }
                            if (arrayList19 == null) {
                                arrayList19 = new java.util.ArrayList();
                            }
                            language.setSampleMimeType(str2).setAccessibilityChannel(i);
                            arrayList19.add(language.build());
                            arrayList14 = arrayList14;
                            break;
                        case "AUDIO":
                            arrayList = arrayList12;
                            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variantWithAudioGroup = getVariantWithAudioGroup(arrayList2, stringAttr);
                            if (variantWithAudioGroup != null) {
                                java.lang.String codecsOfType2 = androidx.media3.common.util.Util.getCodecsOfType(variantWithAudioGroup.format.codecs, 1);
                                language.setCodecs(codecsOfType2);
                                mediaMimeType2 = androidx.media3.common.MimeTypes.getMediaMimeType(codecsOfType2);
                            } else {
                                mediaMimeType2 = null;
                            }
                            java.lang.String optionalStringAttr9 = parseOptionalStringAttr(str4, REGEX_CHANNELS, map3);
                            if (optionalStringAttr9 != null) {
                                language.setChannelCount(java.lang.Integer.parseInt(androidx.media3.common.util.Util.splitAtFirst(optionalStringAttr9, "/")[0]));
                                if (androidx.media3.common.MimeTypes.AUDIO_E_AC3.equals(mediaMimeType2) && optionalStringAttr9.endsWith("/JOC")) {
                                    language.setCodecs(androidx.media3.common.MimeTypes.CODEC_E_AC3_JOC);
                                    mediaMimeType2 = androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC;
                                }
                            }
                            language.setSampleMimeType(mediaMimeType2);
                            if (uriResolveToUri2 != null) {
                                language.setMetadata(metadata);
                                arrayList13 = arrayList13;
                                arrayList13.add(new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2));
                            } else {
                                arrayList13 = arrayList13;
                                if (variantWithAudioGroup != null) {
                                    formatBuild = language.build();
                                }
                            }
                            arrayList14 = arrayList14;
                            break;
                        case "VIDEO":
                            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variantWithVideoGroup = getVariantWithVideoGroup(arrayList2, stringAttr);
                            if (variantWithVideoGroup != null) {
                                androidx.media3.common.Format format = variantWithVideoGroup.format;
                                java.lang.String codecsOfType3 = androidx.media3.common.util.Util.getCodecsOfType(format.codecs, 2);
                                language.setCodecs(codecsOfType3).setSampleMimeType(androidx.media3.common.MimeTypes.getMediaMimeType(codecsOfType3)).setWidth(format.width).setHeight(format.height).setFrameRate(format.frameRate);
                            }
                            if (uriResolveToUri2 != null) {
                                language.setMetadata(metadata);
                                arrayList = arrayList12;
                                arrayList.add(new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Rendition(uriResolveToUri2, language.build(), stringAttr, stringAttr2));
                            }
                        default:
                            arrayList = arrayList12;
                            break;
                    }
                    i9++;
                    arrayList14 = arrayList14;
                    arrayList13 = arrayList13;
                    arrayList12 = arrayList;
                    str3 = str5;
                    formatBuild = formatBuild;
                    uri = null;
                }
                return new androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist(str, arrayList16, arrayList18, arrayList12, arrayList13, arrayList14, arrayList15, formatBuild, z2 ? java.util.Collections.emptyList() : arrayList19, z4, map3, arrayList17);
            }
        }
    }

    private static androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant getVariantWithAudioGroup(java.util.ArrayList<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> arrayList, java.lang.String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant getVariantWithVideoGroup(java.util.ArrayList<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> arrayList, java.lang.String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant getVariantWithSubtitleGroup(java.util.ArrayList<androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant> arrayList, java.lang.String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist parseMediaPlaylist(androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist hlsMultivariantPlaylist, androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist hlsMediaPlaylist, androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.LineIterator lineIterator, java.lang.String str) throws java.io.IOException {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.lang.String str2;
        boolean z;
        int i;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment;
        java.lang.String optionalStringAttr;
        long j;
        long j2;
        long j3;
        long j4;
        boolean z2;
        java.lang.Object drmInitData;
        hlsMultivariantPlaylist = hlsMultivariantPlaylist;
        hlsMediaPlaylist = hlsMediaPlaylist;
        boolean z3 = hlsMultivariantPlaylist.hasIndependentSegments;
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl serverControl = new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl(androidx.media3.common.C.TIME_UNSET, false, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, false);
        java.util.TreeMap treeMap = new java.util.TreeMap();
        boolean z4 = false;
        java.lang.String str3 = "";
        boolean z5 = z3;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl serverControl2 = serverControl;
        int i2 = 0;
        boolean optionalBooleanAttribute = false;
        boolean z6 = false;
        int i3 = 0;
        boolean z7 = false;
        boolean z8 = false;
        int i4 = 0;
        boolean z9 = false;
        java.lang.String optionalStringAttr2 = str3;
        java.lang.String stringAttr = null;
        long doubleAttr = androidx.media3.common.C.TIME_UNSET;
        long jMsToUs = 0;
        long j5 = 0;
        int intAttr = 1;
        long intAttr2 = androidx.media3.common.C.TIME_UNSET;
        long doubleAttr2 = androidx.media3.common.C.TIME_UNSET;
        androidx.media3.common.DrmInitData playlistProtectionSchemes = null;
        long j6 = 0;
        java.lang.Object obj = null;
        long j7 = 0;
        long j8 = -1;
        java.lang.String str4 = null;
        java.lang.String encryptionScheme = null;
        long j9 = 0;
        long longAttr = 0;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment2 = null;
        long timeSecondsToUs = 0;
        long j10 = 0;
        java.util.ArrayList arrayList7 = arrayList4;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part2 = null;
        while (lineIterator.hasNext()) {
            java.lang.String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList6.add(next);
            }
            if (next.startsWith(TAG_PLAYLIST_TYPE)) {
                java.lang.String stringAttr2 = parseStringAttr(next, REGEX_PLAYLIST_TYPE, map);
                if ("VOD".equals(stringAttr2)) {
                    i2 = 1;
                } else if ("EVENT".equals(stringAttr2)) {
                    i2 = 2;
                }
            } else if (next.equals(TAG_IFRAME)) {
                z9 = true;
            } else if (next.startsWith(TAG_START)) {
                doubleAttr = (long) (parseDoubleAttr(next, REGEX_TIME_OFFSET) * 1000000.0d);
                optionalBooleanAttribute = parseOptionalBooleanAttribute(next, REGEX_PRECISE, z4);
            } else if (next.startsWith(TAG_SERVER_CONTROL)) {
                serverControl2 = parseServerControl(next);
            } else if (next.startsWith(TAG_PART_INF)) {
                doubleAttr2 = (long) (parseDoubleAttr(next, REGEX_PART_TARGET_DURATION) * 1000000.0d);
            } else if (next.startsWith(TAG_INIT_SEGMENT)) {
                java.lang.String stringAttr3 = parseStringAttr(next, REGEX_URI, map);
                java.lang.String optionalStringAttr3 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, map);
                if (optionalStringAttr3 != null) {
                    java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(optionalStringAttr3, "@");
                    j8 = java.lang.Long.parseLong(strArrSplit[z4 ? 1 : 0]);
                    if (strArrSplit.length > 1) {
                        j6 = java.lang.Long.parseLong(strArrSplit[1]);
                    }
                }
                if (j8 == -1) {
                    j6 = 0;
                }
                java.lang.String str5 = str4;
                if (stringAttr != null && str5 == null) {
                    throw androidx.media3.common.ParserException.createForMalformedManifest("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                }
                segment2 = new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment(stringAttr3, j6, j8, stringAttr, str5);
                if (j8 != -1) {
                    j6 += j8;
                }
                str4 = str5;
                j8 = -1;
            } else {
                java.lang.String str6 = str4;
                if (next.startsWith(TAG_TARGET_DURATION)) {
                    intAttr2 = 1000000 * ((long) parseIntAttr(next, REGEX_TARGET_DURATION));
                } else {
                    if (next.startsWith(TAG_MEDIA_SEQUENCE)) {
                        longAttr = parseLongAttr(next, REGEX_MEDIA_SEQUENCE);
                        str4 = str6;
                        j5 = longAttr;
                    } else if (next.startsWith(TAG_VERSION)) {
                        intAttr = parseIntAttr(next, REGEX_VERSION);
                    } else {
                        if (next.startsWith(TAG_DEFINE)) {
                            java.lang.String optionalStringAttr4 = parseOptionalStringAttr(next, REGEX_IMPORT, map);
                            if (optionalStringAttr4 != null) {
                                java.lang.String str7 = hlsMultivariantPlaylist.variableDefinitions.get(optionalStringAttr4);
                                if (str7 != null) {
                                    map.put(optionalStringAttr4, str7);
                                }
                            } else {
                                map.put(parseStringAttr(next, REGEX_NAME, map), parseStringAttr(next, REGEX_VALUE, map));
                            }
                            arrayList = arrayList7;
                            arrayList2 = arrayList6;
                            str2 = encryptionScheme;
                            z = false;
                            i = i2;
                        } else if (next.startsWith(TAG_MEDIA_DURATION)) {
                            timeSecondsToUs = parseTimeSecondsToUs(next, REGEX_MEDIA_DURATION);
                            optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_MEDIA_TITLE, str3, map);
                        } else {
                            java.lang.String str8 = str3;
                            if (next.startsWith(TAG_SKIP)) {
                                int intAttr3 = parseIntAttr(next, REGEX_SKIPPED_SEGMENTS);
                                androidx.media3.common.util.Assertions.checkState(hlsMediaPlaylist != null && arrayList3.isEmpty());
                                int i5 = (int) (j5 - ((androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist) androidx.media3.common.util.Util.castNonNull(hlsMediaPlaylist)).mediaSequence);
                                int i6 = intAttr3 + i5;
                                if (i5 < 0 || i6 > hlsMediaPlaylist.segments.size()) {
                                    throw new androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser.DeltaUpdateException();
                                }
                                str3 = str8;
                                java.lang.String str9 = str6;
                                long j11 = j9;
                                while (i5 < i6) {
                                    androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segmentCopyWith = hlsMediaPlaylist.segments.get(i5);
                                    java.util.ArrayList arrayList8 = arrayList7;
                                    java.util.ArrayList arrayList9 = arrayList6;
                                    if (j5 != hlsMediaPlaylist.mediaSequence) {
                                        segmentCopyWith = segmentCopyWith.copyWith(j11, (hlsMediaPlaylist.discontinuitySequence - i3) + segmentCopyWith.relativeDiscontinuitySequence);
                                    }
                                    arrayList3.add(segmentCopyWith);
                                    j11 += segmentCopyWith.durationUs;
                                    if (segmentCopyWith.byteRangeLength != -1) {
                                        j6 = segmentCopyWith.byteRangeOffset + segmentCopyWith.byteRangeLength;
                                    }
                                    int i7 = segmentCopyWith.relativeDiscontinuitySequence;
                                    androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment3 = segmentCopyWith.initializationSegment;
                                    androidx.media3.common.DrmInitData drmInitData2 = segmentCopyWith.drmInitData;
                                    java.lang.String str10 = segmentCopyWith.fullSegmentEncryptionKeyUri;
                                    if (segmentCopyWith.encryptionIV != null) {
                                        segment = segment3;
                                        if (!segmentCopyWith.encryptionIV.equals(java.lang.Long.toHexString(longAttr))) {
                                        }
                                        longAttr++;
                                        i5++;
                                        hlsMediaPlaylist = hlsMediaPlaylist;
                                        obj = drmInitData2;
                                        stringAttr = str10;
                                        j7 = j11;
                                        i6 = i6;
                                        i4 = i7;
                                        segment2 = segment;
                                        arrayList7 = arrayList8;
                                        arrayList6 = arrayList9;
                                    } else {
                                        segment = segment3;
                                    }
                                    str9 = segmentCopyWith.encryptionIV;
                                    longAttr++;
                                    i5++;
                                    hlsMediaPlaylist = hlsMediaPlaylist;
                                    obj = drmInitData2;
                                    stringAttr = str10;
                                    j7 = j11;
                                    i6 = i6;
                                    i4 = i7;
                                    segment2 = segment;
                                    arrayList7 = arrayList8;
                                    arrayList6 = arrayList9;
                                }
                                hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                hlsMediaPlaylist = hlsMediaPlaylist;
                                j9 = j11;
                                str4 = str9;
                            } else {
                                java.util.ArrayList arrayList10 = arrayList7;
                                arrayList2 = arrayList6;
                                str3 = str8;
                                if (next.startsWith(TAG_KEY)) {
                                    java.lang.String stringAttr4 = parseStringAttr(next, REGEX_METHOD, map);
                                    java.lang.String optionalStringAttr5 = parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, map);
                                    if (METHOD_NONE.equals(stringAttr4)) {
                                        treeMap.clear();
                                        optionalStringAttr = null;
                                        stringAttr = null;
                                    } else {
                                        optionalStringAttr = parseOptionalStringAttr(next, REGEX_IV, map);
                                        if (KEYFORMAT_IDENTITY.equals(optionalStringAttr5)) {
                                            if (METHOD_AES_128.equals(stringAttr4)) {
                                                stringAttr = parseStringAttr(next, REGEX_URI, map);
                                            }
                                            str4 = optionalStringAttr;
                                        } else {
                                            java.lang.String str11 = encryptionScheme;
                                            encryptionScheme = str11 == null ? parseEncryptionScheme(stringAttr4) : str11;
                                            androidx.media3.common.DrmInitData.SchemeData drmSchemeData = parseDrmSchemeData(next, optionalStringAttr5, map);
                                            if (drmSchemeData != null) {
                                                treeMap.put(optionalStringAttr5, drmSchemeData);
                                                stringAttr = null;
                                            }
                                            str4 = optionalStringAttr;
                                        }
                                        stringAttr = null;
                                        str4 = optionalStringAttr;
                                    }
                                    obj = stringAttr;
                                    str4 = optionalStringAttr;
                                } else {
                                    java.lang.String str12 = encryptionScheme;
                                    if (next.startsWith(TAG_BYTERANGE)) {
                                        java.lang.String[] strArrSplit2 = androidx.media3.common.util.Util.split(parseStringAttr(next, REGEX_BYTERANGE, map), "@");
                                        j8 = java.lang.Long.parseLong(strArrSplit2[0]);
                                        if (strArrSplit2.length > 1) {
                                            j6 = java.lang.Long.parseLong(strArrSplit2[1]);
                                        }
                                    } else if (next.startsWith(TAG_DISCONTINUITY_SEQUENCE)) {
                                        i3 = java.lang.Integer.parseInt(next.substring(next.indexOf(58) + 1));
                                        hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                        hlsMediaPlaylist = hlsMediaPlaylist;
                                        encryptionScheme = str12;
                                        str4 = str6;
                                        arrayList7 = arrayList10;
                                        arrayList6 = arrayList2;
                                        z4 = false;
                                        z6 = true;
                                    } else if (next.equals(TAG_DISCONTINUITY)) {
                                        i4++;
                                    } else {
                                        if (next.startsWith(TAG_PROGRAM_DATE_TIME)) {
                                            if (jMsToUs == 0) {
                                                jMsToUs = androidx.media3.common.util.Util.msToUs(androidx.media3.common.util.Util.parseXsDateTime(next.substring(next.indexOf(58) + 1))) - j9;
                                            } else {
                                                i = i2;
                                                str2 = str12;
                                            }
                                        } else if (next.equals(TAG_GAP)) {
                                            hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                            hlsMediaPlaylist = hlsMediaPlaylist;
                                            encryptionScheme = str12;
                                            str4 = str6;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z4 = false;
                                            z8 = true;
                                        } else if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                                            hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                            hlsMediaPlaylist = hlsMediaPlaylist;
                                            encryptionScheme = str12;
                                            str4 = str6;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z4 = false;
                                            z5 = true;
                                        } else if (next.equals(TAG_ENDLIST)) {
                                            hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                            hlsMediaPlaylist = hlsMediaPlaylist;
                                            encryptionScheme = str12;
                                            str4 = str6;
                                            arrayList7 = arrayList10;
                                            arrayList6 = arrayList2;
                                            z4 = false;
                                            z7 = true;
                                        } else if (next.startsWith(TAG_RENDITION_REPORT)) {
                                            i = i2;
                                            str2 = str12;
                                            arrayList5.add(new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport(android.net.Uri.parse(androidx.media3.common.util.UriUtil.resolve(str, parseStringAttr(next, REGEX_URI, map))), parseOptionalLongAttr(next, REGEX_LAST_MSN, -1L), parseOptionalIntAttr(next, REGEX_LAST_PART, -1)));
                                        } else {
                                            i = i2;
                                            str2 = str12;
                                            if (next.startsWith(TAG_PRELOAD_HINT)) {
                                                if (part2 == null && TYPE_PART.equals(parseStringAttr(next, REGEX_PRELOAD_HINT_TYPE, map))) {
                                                    java.lang.String stringAttr5 = parseStringAttr(next, REGEX_URI, map);
                                                    long optionalLongAttr = parseOptionalLongAttr(next, REGEX_BYTERANGE_START, -1L);
                                                    long optionalLongAttr2 = parseOptionalLongAttr(next, REGEX_BYTERANGE_LENGTH, -1L);
                                                    long j12 = longAttr;
                                                    java.lang.String segmentEncryptionIV = getSegmentEncryptionIV(j12, stringAttr, str6);
                                                    if (obj == null && !treeMap.isEmpty()) {
                                                        androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr = (androidx.media3.common.DrmInitData.SchemeData[]) treeMap.values().toArray(new androidx.media3.common.DrmInitData.SchemeData[0]);
                                                        androidx.media3.common.DrmInitData drmInitData3 = new androidx.media3.common.DrmInitData(str2, schemeDataArr);
                                                        if (playlistProtectionSchemes == null) {
                                                            playlistProtectionSchemes = getPlaylistProtectionSchemes(str2, schemeDataArr);
                                                        }
                                                        obj = drmInitData3;
                                                    }
                                                    if (optionalLongAttr == -1 || optionalLongAttr2 != -1) {
                                                        part2 = new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part(stringAttr5, segment2, 0L, i4, j7, obj, stringAttr, segmentEncryptionIV, optionalLongAttr != -1 ? optionalLongAttr : 0L, optionalLongAttr2, false, false, true);
                                                    }
                                                    hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                                    hlsMediaPlaylist = hlsMediaPlaylist;
                                                    longAttr = j12;
                                                    str4 = str6;
                                                    arrayList7 = arrayList10;
                                                    i2 = i;
                                                    arrayList6 = arrayList2;
                                                    encryptionScheme = str2;
                                                }
                                            } else {
                                                longAttr = longAttr;
                                                if (next.startsWith(TAG_PART)) {
                                                    java.lang.String segmentEncryptionIV2 = getSegmentEncryptionIV(longAttr, stringAttr, str6);
                                                    java.lang.String stringAttr6 = parseStringAttr(next, REGEX_URI, map);
                                                    long doubleAttr3 = (long) (parseDoubleAttr(next, REGEX_ATTR_DURATION) * 1000000.0d);
                                                    androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part3 = part2;
                                                    boolean optionalBooleanAttribute2 = parseOptionalBooleanAttribute(next, REGEX_INDEPENDENT, false) | (z5 && arrayList10.isEmpty());
                                                    boolean optionalBooleanAttribute3 = parseOptionalBooleanAttribute(next, REGEX_GAP, false);
                                                    java.lang.String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, map);
                                                    if (optionalStringAttr6 != null) {
                                                        java.lang.String[] strArrSplit3 = androidx.media3.common.util.Util.split(optionalStringAttr6, "@");
                                                        j2 = java.lang.Long.parseLong(strArrSplit3[0]);
                                                        if (strArrSplit3.length > 1) {
                                                            j10 = java.lang.Long.parseLong(strArrSplit3[1]);
                                                        }
                                                        j = -1;
                                                    } else {
                                                        j = -1;
                                                        j2 = -1;
                                                    }
                                                    if (j2 == j) {
                                                        j10 = 0;
                                                    }
                                                    if (obj == null && !treeMap.isEmpty()) {
                                                        androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr2 = (androidx.media3.common.DrmInitData.SchemeData[]) treeMap.values().toArray(new androidx.media3.common.DrmInitData.SchemeData[0]);
                                                        androidx.media3.common.DrmInitData drmInitData4 = new androidx.media3.common.DrmInitData(str2, schemeDataArr2);
                                                        if (playlistProtectionSchemes == null) {
                                                            playlistProtectionSchemes = getPlaylistProtectionSchemes(str2, schemeDataArr2);
                                                        }
                                                        obj = drmInitData4;
                                                    }
                                                    arrayList10.add(new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part(stringAttr6, segment2, doubleAttr3, i4, j7, obj, stringAttr, segmentEncryptionIV2, j10, j2, optionalBooleanAttribute3, optionalBooleanAttribute2, false));
                                                    j7 += doubleAttr3;
                                                    if (j2 != j) {
                                                        j10 += j2;
                                                    }
                                                    hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                                    hlsMediaPlaylist = hlsMediaPlaylist;
                                                    str4 = str6;
                                                    i2 = i;
                                                    part2 = part3;
                                                    longAttr = longAttr;
                                                    encryptionScheme = str2;
                                                    arrayList7 = arrayList10;
                                                    arrayList6 = arrayList2;
                                                } else {
                                                    part = part2;
                                                    arrayList = arrayList10;
                                                    if (next.startsWith("#")) {
                                                        z = false;
                                                        hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                                        str4 = str6;
                                                        i2 = i;
                                                        part2 = part;
                                                        longAttr = longAttr;
                                                        encryptionScheme = str2;
                                                        arrayList7 = arrayList;
                                                        arrayList6 = arrayList2;
                                                        z4 = z;
                                                        hlsMediaPlaylist = hlsMediaPlaylist;
                                                    } else {
                                                        java.lang.String segmentEncryptionIV3 = getSegmentEncryptionIV(longAttr, stringAttr, str6);
                                                        long j13 = longAttr + 1;
                                                        java.lang.String strReplaceVariableReferences = replaceVariableReferences(next, map);
                                                        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment segment4 = (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment) map2.get(strReplaceVariableReferences);
                                                        if (j8 == -1) {
                                                            j3 = 0;
                                                        } else {
                                                            if (z9 && segment2 == null && segment4 == null) {
                                                                segment4 = new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment(strReplaceVariableReferences, 0L, j6, null, null);
                                                                map2.put(strReplaceVariableReferences, segment4);
                                                            }
                                                            j3 = j6;
                                                        }
                                                        if (obj != null || treeMap.isEmpty()) {
                                                            j4 = j13;
                                                            z2 = false;
                                                            drmInitData = obj;
                                                        } else {
                                                            j4 = j13;
                                                            z2 = false;
                                                            androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr3 = (androidx.media3.common.DrmInitData.SchemeData[]) treeMap.values().toArray(new androidx.media3.common.DrmInitData.SchemeData[0]);
                                                            drmInitData = new androidx.media3.common.DrmInitData(str2, schemeDataArr3);
                                                            if (playlistProtectionSchemes == null) {
                                                                playlistProtectionSchemes = getPlaylistProtectionSchemes(str2, schemeDataArr3);
                                                            }
                                                        }
                                                        arrayList3.add(new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment(strReplaceVariableReferences, segment2 != null ? segment2 : segment4, optionalStringAttr2, timeSecondsToUs, i4, j9, drmInitData, stringAttr, segmentEncryptionIV3, j3, j8, z8, arrayList));
                                                        j7 = j9 + timeSecondsToUs;
                                                        arrayList7 = new java.util.ArrayList();
                                                        if (j8 != -1) {
                                                            j3 += j8;
                                                        }
                                                        j6 = j3;
                                                        hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                                                        z8 = z2;
                                                        str4 = str6;
                                                        obj = drmInitData;
                                                        optionalStringAttr2 = str3;
                                                        j9 = j7;
                                                        i2 = i;
                                                        part2 = part;
                                                        arrayList6 = arrayList2;
                                                        j8 = -1;
                                                        timeSecondsToUs = 0;
                                                        encryptionScheme = str2;
                                                        longAttr = j4;
                                                        hlsMediaPlaylist = hlsMediaPlaylist;
                                                        z4 = z8;
                                                    }
                                                }
                                            }
                                        }
                                        arrayList = arrayList10;
                                        z = false;
                                    }
                                    encryptionScheme = str12;
                                    str4 = str6;
                                }
                                arrayList7 = arrayList10;
                                arrayList6 = arrayList2;
                            }
                        }
                        part = part2;
                        hlsMultivariantPlaylist = hlsMultivariantPlaylist;
                        str4 = str6;
                        i2 = i;
                        part2 = part;
                        longAttr = longAttr;
                        encryptionScheme = str2;
                        arrayList7 = arrayList;
                        arrayList6 = arrayList2;
                        z4 = z;
                        hlsMediaPlaylist = hlsMediaPlaylist;
                    }
                    z4 = false;
                }
                str4 = str6;
                z4 = false;
            }
        }
        int i8 = i2;
        androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Part part4 = part2;
        java.util.ArrayList arrayList11 = arrayList7;
        java.util.ArrayList arrayList12 = arrayList6;
        java.lang.Object[] objArr = z4 ? 1 : 0;
        java.util.HashMap map3 = new java.util.HashMap();
        for (int i9 = objArr == true ? 1 : 0; i9 < arrayList5.size(); i9++) {
            androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport renditionReport = (androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport) arrayList5.get(i9);
            long size = renditionReport.lastMediaSequence;
            if (size == -1) {
                size = (j5 + ((long) arrayList3.size())) - (arrayList11.isEmpty() ? 1L : 0L);
            }
            int size2 = renditionReport.lastPartIndex;
            if (size2 == -1 && doubleAttr2 != androidx.media3.common.C.TIME_UNSET) {
                size2 = (arrayList11.isEmpty() ? ((androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Segment) com.google.common.collect.Iterables.getLast(arrayList3)).parts : arrayList11).size() - 1;
            }
            map3.put(renditionReport.playlistUri, new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.RenditionReport(renditionReport.playlistUri, size, size2));
        }
        if (part4 != null) {
            arrayList11.add(part4);
        }
        return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist(i8, str, arrayList12, doubleAttr, optionalBooleanAttribute, jMsToUs, z6, i3, j5, intAttr, intAttr2, doubleAttr2, z5, z7, jMsToUs != 0, playlistProtectionSchemes, arrayList3, arrayList11, serverControl2, map3);
    }

    private static androidx.media3.common.DrmInitData getPlaylistProtectionSchemes(java.lang.String str, androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr) {
        androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr2 = new androidx.media3.common.DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            schemeDataArr2[i] = schemeDataArr[i].copyWithData(null);
        }
        return new androidx.media3.common.DrmInitData(str, schemeDataArr2);
    }

    private static java.lang.String getSegmentEncryptionIV(long j, java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : java.lang.Long.toHexString(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int parseSelectionFlags(java.lang.String str) {
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false);
        ?? r0 = optionalBooleanAttribute;
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false)) {
            r0 = (optionalBooleanAttribute ? 1 : 0) | 2;
        }
        return parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false) ? r0 | 4 : r0;
    }

    private static int parseRoleFlags(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String optionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map);
        if (android.text.TextUtils.isEmpty(optionalStringAttr)) {
            return 0;
        }
        java.lang.String[] strArrSplit = androidx.media3.common.util.Util.split(optionalStringAttr, ",");
        int i = androidx.media3.common.util.Util.contains(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
        if (androidx.media3.common.util.Util.contains(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (androidx.media3.common.util.Util.contains(strArrSplit, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        return androidx.media3.common.util.Util.contains(strArrSplit, "public.easy-to-read") ? i | 8192 : i;
    }

    private static androidx.media3.common.DrmInitData.SchemeData parseDrmSchemeData(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) throws androidx.media3.common.ParserException {
        java.lang.String optionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, "1", map);
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            java.lang.String stringAttr = parseStringAttr(str, REGEX_URI, map);
            return new androidx.media3.common.DrmInitData.SchemeData(androidx.media3.common.C.WIDEVINE_UUID, androidx.media3.common.MimeTypes.VIDEO_MP4, android.util.Base64.decode(stringAttr.substring(stringAttr.indexOf(44)), 0));
        }
        if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            return new androidx.media3.common.DrmInitData.SchemeData(androidx.media3.common.C.WIDEVINE_UUID, "hls", androidx.media3.common.util.Util.getUtf8Bytes(str));
        }
        if (!KEYFORMAT_PLAYREADY.equals(str2) || !"1".equals(optionalStringAttr)) {
            return null;
        }
        java.lang.String stringAttr2 = parseStringAttr(str, REGEX_URI, map);
        return new androidx.media3.common.DrmInitData.SchemeData(androidx.media3.common.C.PLAYREADY_UUID, androidx.media3.common.MimeTypes.VIDEO_MP4, androidx.media3.extractor.mp4.PsshAtomUtil.buildPsshAtom(androidx.media3.common.C.PLAYREADY_UUID, android.util.Base64.decode(stringAttr2.substring(stringAttr2.indexOf(44)), 0)));
    }

    private static androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl parseServerControl(java.lang.String str) {
        double optionalDoubleAttr = parseOptionalDoubleAttr(str, REGEX_CAN_SKIP_UNTIL, -9.223372036854776E18d);
        long j = androidx.media3.common.C.TIME_UNSET;
        long j2 = optionalDoubleAttr == -9.223372036854776E18d ? -9223372036854775807L : (long) (optionalDoubleAttr * 1000000.0d);
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_CAN_SKIP_DATE_RANGES, false);
        double optionalDoubleAttr2 = parseOptionalDoubleAttr(str, REGEX_HOLD_BACK, -9.223372036854776E18d);
        long j3 = optionalDoubleAttr2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (optionalDoubleAttr2 * 1000000.0d);
        double optionalDoubleAttr3 = parseOptionalDoubleAttr(str, REGEX_PART_HOLD_BACK, -9.223372036854776E18d);
        if (optionalDoubleAttr3 != -9.223372036854776E18d) {
            j = (long) (optionalDoubleAttr3 * 1000000.0d);
        }
        return new androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.ServerControl(j2, optionalBooleanAttribute, j3, j, parseOptionalBooleanAttribute(str, REGEX_CAN_BLOCK_RELOAD, false));
    }

    private static java.lang.String parseEncryptionScheme(java.lang.String str) {
        return (METHOD_SAMPLE_AES_CENC.equals(str) || METHOD_SAMPLE_AES_CTR.equals(str)) ? androidx.media3.common.C.CENC_TYPE_cenc : androidx.media3.common.C.CENC_TYPE_cbcs;
    }

    private static int parseIntAttr(java.lang.String str, java.util.regex.Pattern pattern) throws androidx.media3.common.ParserException {
        return java.lang.Integer.parseInt(parseStringAttr(str, pattern, java.util.Collections.emptyMap()));
    }

    private static int parseOptionalIntAttr(java.lang.String str, java.util.regex.Pattern pattern, int i) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        return matcher.find() ? java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1))) : i;
    }

    private static long parseLongAttr(java.lang.String str, java.util.regex.Pattern pattern) throws androidx.media3.common.ParserException {
        return java.lang.Long.parseLong(parseStringAttr(str, pattern, java.util.Collections.emptyMap()));
    }

    private static long parseOptionalLongAttr(java.lang.String str, java.util.regex.Pattern pattern, long j) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        return matcher.find() ? java.lang.Long.parseLong((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1))) : j;
    }

    private static long parseTimeSecondsToUs(java.lang.String str, java.util.regex.Pattern pattern) throws androidx.media3.common.ParserException {
        return new java.math.BigDecimal(parseStringAttr(str, pattern, java.util.Collections.emptyMap())).multiply(new java.math.BigDecimal(1000000L)).longValue();
    }

    private static double parseDoubleAttr(java.lang.String str, java.util.regex.Pattern pattern) throws androidx.media3.common.ParserException {
        return java.lang.Double.parseDouble(parseStringAttr(str, pattern, java.util.Collections.emptyMap()));
    }

    private static java.lang.String parseStringAttr(java.lang.String str, java.util.regex.Pattern pattern, java.util.Map<java.lang.String, java.lang.String> map) throws androidx.media3.common.ParserException {
        java.lang.String optionalStringAttr = parseOptionalStringAttr(str, pattern, map);
        if (optionalStringAttr != null) {
            return optionalStringAttr;
        }
        throw androidx.media3.common.ParserException.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static java.lang.String parseOptionalStringAttr(java.lang.String str, java.util.regex.Pattern pattern, java.util.Map<java.lang.String, java.lang.String> map) {
        return parseOptionalStringAttr(str, pattern, null, map);
    }

    private static java.lang.String parseOptionalStringAttr(java.lang.String str, java.util.regex.Pattern pattern, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : replaceVariableReferences(str2, map);
    }

    private static double parseOptionalDoubleAttr(java.lang.String str, java.util.regex.Pattern pattern, double d) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        return matcher.find() ? java.lang.Double.parseDouble((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(matcher.group(1))) : d;
    }

    private static java.lang.String replaceVariableReferences(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.regex.Matcher matcher = REGEX_VARIABLE_REFERENCE.matcher(str);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        while (matcher.find()) {
            java.lang.String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, java.util.regex.Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static boolean parseOptionalBooleanAttribute(java.lang.String str, java.util.regex.Pattern pattern, boolean z) {
        java.util.regex.Matcher matcher = pattern.matcher(str);
        return matcher.find() ? BOOLEAN_TRUE.equals(matcher.group(1)) : z;
    }

    private static java.util.regex.Pattern compileBooleanAttrPattern(java.lang.String str) {
        return java.util.regex.Pattern.compile(str + "=(NO|YES)");
    }

    private static class LineIterator {
        private final java.util.Queue<java.lang.String> extraLines;
        private java.lang.String next;
        private final java.io.BufferedReader reader;

        public LineIterator(java.util.Queue<java.lang.String> queue, java.io.BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean hasNext() throws java.io.IOException {
            java.lang.String strTrim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                this.next = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(this.extraLines.poll());
                return true;
            }
            do {
                java.lang.String line = this.reader.readLine();
                this.next = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.next = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public java.lang.String next() throws java.io.IOException {
            if (hasNext()) {
                java.lang.String str = this.next;
                this.next = null;
                return str;
            }
            throw new java.util.NoSuchElementException();
        }
    }
}
