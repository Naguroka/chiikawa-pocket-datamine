package com.google.android.datatransport.cct;

/* JADX INFO: loaded from: classes4.dex */
public final class CCTDestination implements com.google.android.datatransport.runtime.EncodedDestination {
    private static final java.lang.String DEFAULT_API_KEY;
    static final java.lang.String DEFAULT_END_POINT;
    static final java.lang.String DESTINATION_NAME = "cct";
    private static final java.lang.String EXTRAS_DELIMITER = "\\";
    private static final java.lang.String EXTRAS_VERSION_MARKER = "1$";
    public static final com.google.android.datatransport.cct.CCTDestination INSTANCE;
    static final java.lang.String LEGACY_END_POINT;
    public static final com.google.android.datatransport.cct.CCTDestination LEGACY_INSTANCE;
    private static final java.util.Set<com.google.android.datatransport.Encoding> SUPPORTED_ENCODINGS;
    private final java.lang.String apiKey;
    private final java.lang.String endPoint;

    @Override // com.google.android.datatransport.runtime.Destination
    public java.lang.String getName() {
        return DESTINATION_NAME;
    }

    static {
        java.lang.String strMergeStrings = com.google.android.datatransport.cct.StringMerger.mergeStrings("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        DEFAULT_END_POINT = strMergeStrings;
        java.lang.String strMergeStrings2 = com.google.android.datatransport.cct.StringMerger.mergeStrings("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        LEGACY_END_POINT = strMergeStrings2;
        java.lang.String strMergeStrings3 = com.google.android.datatransport.cct.StringMerger.mergeStrings("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        DEFAULT_API_KEY = strMergeStrings3;
        SUPPORTED_ENCODINGS = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(com.google.android.datatransport.Encoding.of("proto"), com.google.android.datatransport.Encoding.of("json"))));
        INSTANCE = new com.google.android.datatransport.cct.CCTDestination(strMergeStrings, null);
        LEGACY_INSTANCE = new com.google.android.datatransport.cct.CCTDestination(strMergeStrings2, strMergeStrings3);
    }

    public CCTDestination(java.lang.String str, java.lang.String str2) {
        this.endPoint = str;
        this.apiKey = str2;
    }

    @Override // com.google.android.datatransport.runtime.Destination
    public byte[] getExtras() {
        return asByteArray();
    }

    @Override // com.google.android.datatransport.runtime.EncodedDestination
    public java.util.Set<com.google.android.datatransport.Encoding> getSupportedEncodings() {
        return SUPPORTED_ENCODINGS;
    }

    public java.lang.String getAPIKey() {
        return this.apiKey;
    }

    public java.lang.String getEndPoint() {
        return this.endPoint;
    }

    public byte[] asByteArray() {
        java.lang.String str = this.apiKey;
        if (str == null && this.endPoint == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = EXTRAS_VERSION_MARKER;
        objArr[1] = this.endPoint;
        objArr[2] = EXTRAS_DELIMITER;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return java.lang.String.format("%s%s%s%s", objArr).getBytes(java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING));
    }

    public static com.google.android.datatransport.cct.CCTDestination fromByteArray(byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING));
        if (!str.startsWith(EXTRAS_VERSION_MARKER)) {
            throw new java.lang.IllegalArgumentException("Version marker missing from extras");
        }
        java.lang.String[] strArrSplit = str.substring(2).split(java.util.regex.Pattern.quote(EXTRAS_DELIMITER), 2);
        if (strArrSplit.length != 2) {
            throw new java.lang.IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        java.lang.String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        java.lang.String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new com.google.android.datatransport.cct.CCTDestination(str2, str3);
    }

    static byte[] encodeString(java.lang.String str) {
        return str.getBytes(java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING));
    }

    static java.lang.String decodeExtras(byte[] bArr) {
        return new java.lang.String(bArr, java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING));
    }
}
