package com.google.common.net;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.net.ElementTypesAreNonnullByDefault
public final class MediaType {
    private static final java.lang.String APPLICATION_TYPE = "application";
    private static final java.lang.String AUDIO_TYPE = "audio";
    private static final java.lang.String CHARSET_ATTRIBUTE = "charset";
    private static final java.lang.String IMAGE_TYPE = "image";
    private static final java.lang.String TEXT_TYPE = "text";
    private static final java.lang.String VIDEO_TYPE = "video";
    private static final java.lang.String WILDCARD = "*";

    @com.google.errorprone.annotations.concurrent.LazyInit
    private int hashCode;
    private final com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> parameters;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private com.google.common.base.Optional<java.nio.charset.Charset> parsedCharset;
    private final java.lang.String subtype;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private java.lang.String toString;
    private final java.lang.String type;
    private static final com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> UTF_8_CONSTANT_PARAMETERS = com.google.common.collect.ImmutableListMultimap.of("charset", com.google.common.base.Ascii.toLowerCase(com.google.common.base.Charsets.UTF_8.name()));
    private static final com.google.common.base.CharMatcher TOKEN_MATCHER = com.google.common.base.CharMatcher.ascii().and(com.google.common.base.CharMatcher.javaIsoControl().negate()).and(com.google.common.base.CharMatcher.isNot(' ')).and(com.google.common.base.CharMatcher.noneOf("()<>@,;:\\\"/[]?="));
    private static final com.google.common.base.CharMatcher QUOTED_TEXT_MATCHER = com.google.common.base.CharMatcher.ascii().and(com.google.common.base.CharMatcher.noneOf("\"\\\r"));
    private static final com.google.common.base.CharMatcher LINEAR_WHITE_SPACE = com.google.common.base.CharMatcher.anyOf(" \t\r\n");
    private static final java.util.Map<com.google.common.net.MediaType, com.google.common.net.MediaType> KNOWN_TYPES = com.google.common.collect.Maps.newHashMap();
    public static final com.google.common.net.MediaType ANY_TYPE = createConstant("*", "*");
    public static final com.google.common.net.MediaType ANY_TEXT_TYPE = createConstant("text", "*");
    public static final com.google.common.net.MediaType ANY_IMAGE_TYPE = createConstant("image", "*");
    public static final com.google.common.net.MediaType ANY_AUDIO_TYPE = createConstant("audio", "*");
    public static final com.google.common.net.MediaType ANY_VIDEO_TYPE = createConstant("video", "*");
    public static final com.google.common.net.MediaType ANY_APPLICATION_TYPE = createConstant("application", "*");
    private static final java.lang.String FONT_TYPE = "font";
    public static final com.google.common.net.MediaType ANY_FONT_TYPE = createConstant(FONT_TYPE, "*");
    public static final com.google.common.net.MediaType CACHE_MANIFEST_UTF_8 = createConstantUtf8("text", "cache-manifest");
    public static final com.google.common.net.MediaType CSS_UTF_8 = createConstantUtf8("text", "css");
    public static final com.google.common.net.MediaType CSV_UTF_8 = createConstantUtf8("text", "csv");
    public static final com.google.common.net.MediaType HTML_UTF_8 = createConstantUtf8("text", "html");
    public static final com.google.common.net.MediaType I_CALENDAR_UTF_8 = createConstantUtf8("text", "calendar");
    public static final com.google.common.net.MediaType PLAIN_TEXT_UTF_8 = createConstantUtf8("text", "plain");
    public static final com.google.common.net.MediaType TEXT_JAVASCRIPT_UTF_8 = createConstantUtf8("text", "javascript");
    public static final com.google.common.net.MediaType TSV_UTF_8 = createConstantUtf8("text", "tab-separated-values");
    public static final com.google.common.net.MediaType VCARD_UTF_8 = createConstantUtf8("text", "vcard");
    public static final com.google.common.net.MediaType WML_UTF_8 = createConstantUtf8("text", "vnd.wap.wml");
    public static final com.google.common.net.MediaType XML_UTF_8 = createConstantUtf8("text", "xml");
    public static final com.google.common.net.MediaType VTT_UTF_8 = createConstantUtf8("text", "vtt");
    public static final com.google.common.net.MediaType BMP = createConstant("image", "bmp");
    public static final com.google.common.net.MediaType CRW = createConstant("image", "x-canon-crw");
    public static final com.google.common.net.MediaType GIF = createConstant("image", "gif");
    public static final com.google.common.net.MediaType ICO = createConstant("image", "vnd.microsoft.icon");
    public static final com.google.common.net.MediaType JPEG = createConstant("image", "jpeg");
    public static final com.google.common.net.MediaType PNG = createConstant("image", "png");
    public static final com.google.common.net.MediaType PSD = createConstant("image", "vnd.adobe.photoshop");
    public static final com.google.common.net.MediaType SVG_UTF_8 = createConstantUtf8("image", "svg+xml");
    public static final com.google.common.net.MediaType TIFF = createConstant("image", "tiff");
    public static final com.google.common.net.MediaType WEBP = createConstant("image", "webp");
    public static final com.google.common.net.MediaType HEIF = createConstant("image", "heif");
    public static final com.google.common.net.MediaType JP2K = createConstant("image", "jp2");
    public static final com.google.common.net.MediaType MP4_AUDIO = createConstant("audio", "mp4");
    public static final com.google.common.net.MediaType MPEG_AUDIO = createConstant("audio", "mpeg");
    public static final com.google.common.net.MediaType OGG_AUDIO = createConstant("audio", "ogg");
    public static final com.google.common.net.MediaType WEBM_AUDIO = createConstant("audio", "webm");
    public static final com.google.common.net.MediaType L16_AUDIO = createConstant("audio", "l16");
    public static final com.google.common.net.MediaType L24_AUDIO = createConstant("audio", "l24");
    public static final com.google.common.net.MediaType BASIC_AUDIO = createConstant("audio", "basic");
    public static final com.google.common.net.MediaType AAC_AUDIO = createConstant("audio", "aac");
    public static final com.google.common.net.MediaType VORBIS_AUDIO = createConstant("audio", "vorbis");
    public static final com.google.common.net.MediaType WMA_AUDIO = createConstant("audio", "x-ms-wma");
    public static final com.google.common.net.MediaType WAX_AUDIO = createConstant("audio", "x-ms-wax");
    public static final com.google.common.net.MediaType VND_REAL_AUDIO = createConstant("audio", "vnd.rn-realaudio");
    public static final com.google.common.net.MediaType VND_WAVE_AUDIO = createConstant("audio", "vnd.wave");
    public static final com.google.common.net.MediaType MP4_VIDEO = createConstant("video", "mp4");
    public static final com.google.common.net.MediaType MPEG_VIDEO = createConstant("video", "mpeg");
    public static final com.google.common.net.MediaType OGG_VIDEO = createConstant("video", "ogg");
    public static final com.google.common.net.MediaType QUICKTIME = createConstant("video", "quicktime");
    public static final com.google.common.net.MediaType WEBM_VIDEO = createConstant("video", "webm");
    public static final com.google.common.net.MediaType WMV = createConstant("video", "x-ms-wmv");
    public static final com.google.common.net.MediaType FLV_VIDEO = createConstant("video", "x-flv");
    public static final com.google.common.net.MediaType THREE_GPP_VIDEO = createConstant("video", "3gpp");
    public static final com.google.common.net.MediaType THREE_GPP2_VIDEO = createConstant("video", "3gpp2");
    public static final com.google.common.net.MediaType APPLICATION_XML_UTF_8 = createConstantUtf8("application", "xml");
    public static final com.google.common.net.MediaType ATOM_UTF_8 = createConstantUtf8("application", "atom+xml");
    public static final com.google.common.net.MediaType BZIP2 = createConstant("application", "x-bzip2");
    public static final com.google.common.net.MediaType DART_UTF_8 = createConstantUtf8("application", "dart");
    public static final com.google.common.net.MediaType APPLE_PASSBOOK = createConstant("application", "vnd.apple.pkpass");
    public static final com.google.common.net.MediaType EOT = createConstant("application", "vnd.ms-fontobject");
    public static final com.google.common.net.MediaType EPUB = createConstant("application", "epub+zip");
    public static final com.google.common.net.MediaType FORM_DATA = createConstant("application", "x-www-form-urlencoded");
    public static final com.google.common.net.MediaType KEY_ARCHIVE = createConstant("application", "pkcs12");
    public static final com.google.common.net.MediaType APPLICATION_BINARY = createConstant("application", "binary");
    public static final com.google.common.net.MediaType GEO_JSON = createConstant("application", "geo+json");
    public static final com.google.common.net.MediaType GZIP = createConstant("application", "x-gzip");
    public static final com.google.common.net.MediaType HAL_JSON = createConstant("application", "hal+json");
    public static final com.google.common.net.MediaType JAVASCRIPT_UTF_8 = createConstantUtf8("application", "javascript");
    public static final com.google.common.net.MediaType JOSE = createConstant("application", "jose");
    public static final com.google.common.net.MediaType JOSE_JSON = createConstant("application", "jose+json");
    public static final com.google.common.net.MediaType JSON_UTF_8 = createConstantUtf8("application", "json");
    public static final com.google.common.net.MediaType JWT = createConstant("application", "jwt");
    public static final com.google.common.net.MediaType MANIFEST_JSON_UTF_8 = createConstantUtf8("application", "manifest+json");
    public static final com.google.common.net.MediaType KML = createConstant("application", "vnd.google-earth.kml+xml");
    public static final com.google.common.net.MediaType KMZ = createConstant("application", "vnd.google-earth.kmz");
    public static final com.google.common.net.MediaType MBOX = createConstant("application", "mbox");
    public static final com.google.common.net.MediaType APPLE_MOBILE_CONFIG = createConstant("application", "x-apple-aspen-config");
    public static final com.google.common.net.MediaType MICROSOFT_EXCEL = createConstant("application", "vnd.ms-excel");
    public static final com.google.common.net.MediaType MICROSOFT_OUTLOOK = createConstant("application", "vnd.ms-outlook");
    public static final com.google.common.net.MediaType MICROSOFT_POWERPOINT = createConstant("application", "vnd.ms-powerpoint");
    public static final com.google.common.net.MediaType MICROSOFT_WORD = createConstant("application", "msword");
    public static final com.google.common.net.MediaType MEDIA_PRESENTATION_DESCRIPTION = createConstant("application", "dash+xml");
    public static final com.google.common.net.MediaType WASM_APPLICATION = createConstant("application", "wasm");
    public static final com.google.common.net.MediaType NACL_APPLICATION = createConstant("application", "x-nacl");
    public static final com.google.common.net.MediaType NACL_PORTABLE_APPLICATION = createConstant("application", "x-pnacl");
    public static final com.google.common.net.MediaType OCTET_STREAM = createConstant("application", "octet-stream");
    public static final com.google.common.net.MediaType OGG_CONTAINER = createConstant("application", "ogg");
    public static final com.google.common.net.MediaType OOXML_DOCUMENT = createConstant("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
    public static final com.google.common.net.MediaType OOXML_PRESENTATION = createConstant("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
    public static final com.google.common.net.MediaType OOXML_SHEET = createConstant("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    public static final com.google.common.net.MediaType OPENDOCUMENT_GRAPHICS = createConstant("application", "vnd.oasis.opendocument.graphics");
    public static final com.google.common.net.MediaType OPENDOCUMENT_PRESENTATION = createConstant("application", "vnd.oasis.opendocument.presentation");
    public static final com.google.common.net.MediaType OPENDOCUMENT_SPREADSHEET = createConstant("application", "vnd.oasis.opendocument.spreadsheet");
    public static final com.google.common.net.MediaType OPENDOCUMENT_TEXT = createConstant("application", "vnd.oasis.opendocument.text");
    public static final com.google.common.net.MediaType OPENSEARCH_DESCRIPTION_UTF_8 = createConstantUtf8("application", "opensearchdescription+xml");
    public static final com.google.common.net.MediaType PDF = createConstant("application", "pdf");
    public static final com.google.common.net.MediaType POSTSCRIPT = createConstant("application", "postscript");
    public static final com.google.common.net.MediaType PROTOBUF = createConstant("application", "protobuf");
    public static final com.google.common.net.MediaType RDF_XML_UTF_8 = createConstantUtf8("application", "rdf+xml");
    public static final com.google.common.net.MediaType RTF_UTF_8 = createConstantUtf8("application", "rtf");
    public static final com.google.common.net.MediaType SFNT = createConstant("application", "font-sfnt");
    public static final com.google.common.net.MediaType SHOCKWAVE_FLASH = createConstant("application", "x-shockwave-flash");
    public static final com.google.common.net.MediaType SKETCHUP = createConstant("application", "vnd.sketchup.skp");
    public static final com.google.common.net.MediaType SOAP_XML_UTF_8 = createConstantUtf8("application", "soap+xml");
    public static final com.google.common.net.MediaType TAR = createConstant("application", "x-tar");
    public static final com.google.common.net.MediaType WOFF = createConstant("application", "font-woff");
    public static final com.google.common.net.MediaType WOFF2 = createConstant("application", "font-woff2");
    public static final com.google.common.net.MediaType XHTML_UTF_8 = createConstantUtf8("application", "xhtml+xml");
    public static final com.google.common.net.MediaType XRD_UTF_8 = createConstantUtf8("application", "xrd+xml");
    public static final com.google.common.net.MediaType ZIP = createConstant("application", "zip");
    public static final com.google.common.net.MediaType FONT_COLLECTION = createConstant(FONT_TYPE, "collection");
    public static final com.google.common.net.MediaType FONT_OTF = createConstant(FONT_TYPE, "otf");
    public static final com.google.common.net.MediaType FONT_SFNT = createConstant(FONT_TYPE, "sfnt");
    public static final com.google.common.net.MediaType FONT_TTF = createConstant(FONT_TYPE, "ttf");
    public static final com.google.common.net.MediaType FONT_WOFF = createConstant(FONT_TYPE, "woff");
    public static final com.google.common.net.MediaType FONT_WOFF2 = createConstant(FONT_TYPE, "woff2");
    private static final com.google.common.base.Joiner.MapJoiner PARAMETER_JOINER = com.google.common.base.Joiner.on("; ").withKeyValueSeparator(com.ironsource.y8.i.b);

    private static com.google.common.net.MediaType createConstant(java.lang.String type, java.lang.String subtype) {
        com.google.common.net.MediaType mediaTypeAddKnownType = addKnownType(new com.google.common.net.MediaType(type, subtype, com.google.common.collect.ImmutableListMultimap.of()));
        mediaTypeAddKnownType.parsedCharset = com.google.common.base.Optional.absent();
        return mediaTypeAddKnownType;
    }

    private static com.google.common.net.MediaType createConstantUtf8(java.lang.String type, java.lang.String subtype) {
        com.google.common.net.MediaType mediaTypeAddKnownType = addKnownType(new com.google.common.net.MediaType(type, subtype, UTF_8_CONSTANT_PARAMETERS));
        mediaTypeAddKnownType.parsedCharset = com.google.common.base.Optional.of(com.google.common.base.Charsets.UTF_8);
        return mediaTypeAddKnownType;
    }

    private static com.google.common.net.MediaType addKnownType(com.google.common.net.MediaType mediaType) {
        KNOWN_TYPES.put(mediaType, mediaType);
        return mediaType;
    }

    private MediaType(java.lang.String type, java.lang.String subtype, com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> parameters) {
        this.type = type;
        this.subtype = subtype;
        this.parameters = parameters;
    }

    public java.lang.String type() {
        return this.type;
    }

    public java.lang.String subtype() {
        return this.subtype;
    }

    public com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> parameters() {
        return this.parameters;
    }

    private java.util.Map<java.lang.String, com.google.common.collect.ImmutableMultiset<java.lang.String>> parametersAsMap() {
        return com.google.common.collect.Maps.transformValues(this.parameters.asMap(), new com.google.common.base.Function() { // from class: com.google.common.net.MediaType$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.collect.ImmutableMultiset.copyOf((java.util.Collection) obj);
            }
        });
    }

    public com.google.common.base.Optional<java.nio.charset.Charset> charset() {
        com.google.common.base.Optional<java.nio.charset.Charset> optionalAbsent = this.parsedCharset;
        if (optionalAbsent == null) {
            optionalAbsent = com.google.common.base.Optional.absent();
            com.google.common.collect.UnmodifiableIterator<java.lang.String> it = this.parameters.get("charset").iterator();
            java.lang.String str = null;
            while (it.hasNext()) {
                java.lang.String next = it.next();
                if (str == null) {
                    optionalAbsent = com.google.common.base.Optional.of(java.nio.charset.Charset.forName(next));
                    str = next;
                } else if (!str.equals(next)) {
                    throw new java.lang.IllegalStateException("Multiple charset values defined: " + str + ", " + next);
                }
            }
            this.parsedCharset = optionalAbsent;
        }
        return optionalAbsent;
    }

    public com.google.common.net.MediaType withoutParameters() {
        return this.parameters.isEmpty() ? this : create(this.type, this.subtype);
    }

    public com.google.common.net.MediaType withParameters(com.google.common.collect.Multimap<java.lang.String, java.lang.String> parameters) {
        return create(this.type, this.subtype, parameters);
    }

    public com.google.common.net.MediaType withParameters(java.lang.String attribute, java.lang.Iterable<java.lang.String> values) {
        com.google.common.base.Preconditions.checkNotNull(attribute);
        com.google.common.base.Preconditions.checkNotNull(values);
        java.lang.String strNormalizeToken = normalizeToken(attribute);
        com.google.common.collect.ImmutableListMultimap.Builder builder = com.google.common.collect.ImmutableListMultimap.builder();
        com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = this.parameters.entries().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
            java.lang.String key = next.getKey();
            if (!strNormalizeToken.equals(key)) {
                builder.put(key, next.getValue());
            }
        }
        java.util.Iterator<java.lang.String> it2 = values.iterator();
        while (it2.hasNext()) {
            builder.put(strNormalizeToken, normalizeParameterValue(strNormalizeToken, it2.next()));
        }
        com.google.common.net.MediaType mediaType = new com.google.common.net.MediaType(this.type, this.subtype, builder.build());
        if (!strNormalizeToken.equals("charset")) {
            mediaType.parsedCharset = this.parsedCharset;
        }
        return (com.google.common.net.MediaType) com.google.common.base.MoreObjects.firstNonNull(KNOWN_TYPES.get(mediaType), mediaType);
    }

    public com.google.common.net.MediaType withParameter(java.lang.String attribute, java.lang.String value) {
        return withParameters(attribute, com.google.common.collect.ImmutableSet.of(value));
    }

    public com.google.common.net.MediaType withCharset(java.nio.charset.Charset charset) {
        com.google.common.base.Preconditions.checkNotNull(charset);
        com.google.common.net.MediaType mediaTypeWithParameter = withParameter("charset", charset.name());
        mediaTypeWithParameter.parsedCharset = com.google.common.base.Optional.of(charset);
        return mediaTypeWithParameter;
    }

    public boolean hasWildcard() {
        return "*".equals(this.type) || "*".equals(this.subtype);
    }

    public boolean is(com.google.common.net.MediaType mediaTypeRange) {
        return (mediaTypeRange.type.equals("*") || mediaTypeRange.type.equals(this.type)) && (mediaTypeRange.subtype.equals("*") || mediaTypeRange.subtype.equals(this.subtype)) && this.parameters.entries().containsAll(mediaTypeRange.parameters.entries());
    }

    public static com.google.common.net.MediaType create(java.lang.String type, java.lang.String subtype) {
        com.google.common.net.MediaType mediaTypeCreate = create(type, subtype, com.google.common.collect.ImmutableListMultimap.of());
        mediaTypeCreate.parsedCharset = com.google.common.base.Optional.absent();
        return mediaTypeCreate;
    }

    private static com.google.common.net.MediaType create(java.lang.String type, java.lang.String subtype, com.google.common.collect.Multimap<java.lang.String, java.lang.String> parameters) {
        com.google.common.base.Preconditions.checkNotNull(type);
        com.google.common.base.Preconditions.checkNotNull(subtype);
        com.google.common.base.Preconditions.checkNotNull(parameters);
        java.lang.String strNormalizeToken = normalizeToken(type);
        java.lang.String strNormalizeToken2 = normalizeToken(subtype);
        com.google.common.base.Preconditions.checkArgument(!"*".equals(strNormalizeToken) || "*".equals(strNormalizeToken2), "A wildcard type cannot be used with a non-wildcard subtype");
        com.google.common.collect.ImmutableListMultimap.Builder builder = com.google.common.collect.ImmutableListMultimap.builder();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : parameters.entries()) {
            java.lang.String strNormalizeToken3 = normalizeToken(entry.getKey());
            builder.put(strNormalizeToken3, normalizeParameterValue(strNormalizeToken3, entry.getValue()));
        }
        com.google.common.net.MediaType mediaType = new com.google.common.net.MediaType(strNormalizeToken, strNormalizeToken2, builder.build());
        return (com.google.common.net.MediaType) com.google.common.base.MoreObjects.firstNonNull(KNOWN_TYPES.get(mediaType), mediaType);
    }

    static com.google.common.net.MediaType createApplicationType(java.lang.String subtype) {
        return create("application", subtype);
    }

    static com.google.common.net.MediaType createAudioType(java.lang.String subtype) {
        return create("audio", subtype);
    }

    static com.google.common.net.MediaType createFontType(java.lang.String subtype) {
        return create(FONT_TYPE, subtype);
    }

    static com.google.common.net.MediaType createImageType(java.lang.String subtype) {
        return create("image", subtype);
    }

    static com.google.common.net.MediaType createTextType(java.lang.String subtype) {
        return create("text", subtype);
    }

    static com.google.common.net.MediaType createVideoType(java.lang.String subtype) {
        return create("video", subtype);
    }

    private static java.lang.String normalizeToken(java.lang.String token) {
        com.google.common.base.Preconditions.checkArgument(TOKEN_MATCHER.matchesAllOf(token));
        com.google.common.base.Preconditions.checkArgument(!token.isEmpty());
        return com.google.common.base.Ascii.toLowerCase(token);
    }

    private static java.lang.String normalizeParameterValue(java.lang.String attribute, java.lang.String value) {
        com.google.common.base.Preconditions.checkNotNull(value);
        com.google.common.base.Preconditions.checkArgument(com.google.common.base.CharMatcher.ascii().matchesAllOf(value), "parameter values must be ASCII: %s", value);
        return "charset".equals(attribute) ? com.google.common.base.Ascii.toLowerCase(value) : value;
    }

    public static com.google.common.net.MediaType parse(java.lang.String input) {
        java.lang.String strConsumeToken;
        com.google.common.base.Preconditions.checkNotNull(input);
        com.google.common.net.MediaType.Tokenizer tokenizer = new com.google.common.net.MediaType.Tokenizer(input);
        try {
            com.google.common.base.CharMatcher charMatcher = TOKEN_MATCHER;
            java.lang.String strConsumeToken2 = tokenizer.consumeToken(charMatcher);
            consumeSeparator(tokenizer, '/');
            java.lang.String strConsumeToken3 = tokenizer.consumeToken(charMatcher);
            com.google.common.collect.ImmutableListMultimap.Builder builder = com.google.common.collect.ImmutableListMultimap.builder();
            while (tokenizer.hasMore()) {
                consumeSeparator(tokenizer, ';');
                com.google.common.base.CharMatcher charMatcher2 = TOKEN_MATCHER;
                java.lang.String strConsumeToken4 = tokenizer.consumeToken(charMatcher2);
                consumeSeparator(tokenizer, '=');
                if ('\"' == tokenizer.previewChar()) {
                    tokenizer.consumeCharacter(kotlin.text.Typography.quote);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    while ('\"' != tokenizer.previewChar()) {
                        if ('\\' == tokenizer.previewChar()) {
                            tokenizer.consumeCharacter('\\');
                            sb.append(tokenizer.consumeCharacter(com.google.common.base.CharMatcher.ascii()));
                        } else {
                            sb.append(tokenizer.consumeToken(QUOTED_TEXT_MATCHER));
                        }
                    }
                    strConsumeToken = sb.toString();
                    tokenizer.consumeCharacter(kotlin.text.Typography.quote);
                } else {
                    strConsumeToken = tokenizer.consumeToken(charMatcher2);
                }
                builder.put(strConsumeToken4, strConsumeToken);
            }
            return create(strConsumeToken2, strConsumeToken3, builder.build());
        } catch (java.lang.IllegalStateException e) {
            throw new java.lang.IllegalArgumentException("Could not parse '" + input + "'", e);
        }
    }

    private static void consumeSeparator(com.google.common.net.MediaType.Tokenizer tokenizer, char c) {
        com.google.common.base.CharMatcher charMatcher = LINEAR_WHITE_SPACE;
        tokenizer.consumeTokenIfPresent(charMatcher);
        tokenizer.consumeCharacter(c);
        tokenizer.consumeTokenIfPresent(charMatcher);
    }

    private static final class Tokenizer {
        final java.lang.String input;
        int position = 0;

        Tokenizer(java.lang.String input) {
            this.input = input;
        }

        java.lang.String consumeTokenIfPresent(com.google.common.base.CharMatcher matcher) {
            com.google.common.base.Preconditions.checkState(hasMore());
            int i = this.position;
            this.position = matcher.negate().indexIn(this.input, i);
            return hasMore() ? this.input.substring(i, this.position) : this.input.substring(i);
        }

        java.lang.String consumeToken(com.google.common.base.CharMatcher matcher) {
            int i = this.position;
            java.lang.String strConsumeTokenIfPresent = consumeTokenIfPresent(matcher);
            com.google.common.base.Preconditions.checkState(this.position != i);
            return strConsumeTokenIfPresent;
        }

        char consumeCharacter(com.google.common.base.CharMatcher matcher) {
            com.google.common.base.Preconditions.checkState(hasMore());
            char cPreviewChar = previewChar();
            com.google.common.base.Preconditions.checkState(matcher.matches(cPreviewChar));
            this.position++;
            return cPreviewChar;
        }

        char consumeCharacter(char c) {
            com.google.common.base.Preconditions.checkState(hasMore());
            com.google.common.base.Preconditions.checkState(previewChar() == c);
            this.position++;
            return c;
        }

        char previewChar() {
            com.google.common.base.Preconditions.checkState(hasMore());
            return this.input.charAt(this.position);
        }

        boolean hasMore() {
            int i = this.position;
            return i >= 0 && i < this.input.length();
        }
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.common.net.MediaType)) {
            return false;
        }
        com.google.common.net.MediaType mediaType = (com.google.common.net.MediaType) obj;
        return this.type.equals(mediaType.type) && this.subtype.equals(mediaType.subtype) && parametersAsMap().equals(mediaType.parametersAsMap());
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = com.google.common.base.Objects.hashCode(this.type, this.subtype, parametersAsMap());
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public java.lang.String toString() {
        java.lang.String str = this.toString;
        if (str != null) {
            return str;
        }
        java.lang.String strComputeToString = computeToString();
        this.toString = strComputeToString;
        return strComputeToString;
    }

    private java.lang.String computeToString() {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder().append(this.type).append('/').append(this.subtype);
        if (!this.parameters.isEmpty()) {
            sbAppend.append("; ");
            PARAMETER_JOINER.appendTo(sbAppend, com.google.common.collect.Multimaps.transformValues((com.google.common.collect.ListMultimap) this.parameters, new com.google.common.base.Function() { // from class: com.google.common.net.MediaType$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return com.google.common.net.MediaType.lambda$computeToString$0((java.lang.String) obj);
                }
            }).entries());
        }
        return sbAppend.toString();
    }

    static /* synthetic */ java.lang.String lambda$computeToString$0(java.lang.String str) {
        return (!TOKEN_MATCHER.matchesAllOf(str) || str.isEmpty()) ? escapeAndQuote(str) : str;
    }

    private static java.lang.String escapeAndQuote(java.lang.String value) {
        java.lang.StringBuilder sbAppend = new java.lang.StringBuilder(value.length() + 16).append(kotlin.text.Typography.quote);
        for (int i = 0; i < value.length(); i++) {
            char cCharAt = value.charAt(i);
            if (cCharAt == '\r' || cCharAt == '\\' || cCharAt == '\"') {
                sbAppend.append('\\');
            }
            sbAppend.append(cCharAt);
        }
        return sbAppend.append(kotlin.text.Typography.quote).toString();
    }
}
