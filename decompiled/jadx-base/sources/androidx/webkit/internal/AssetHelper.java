package androidx.webkit.internal;

/* JADX INFO: loaded from: classes3.dex */
public class AssetHelper {
    public static final java.lang.String DEFAULT_MIME_TYPE = "text/plain";
    private android.content.Context mContext;

    public AssetHelper(android.content.Context context) {
        this.mContext = context;
    }

    private static java.io.InputStream handleSvgzStream(java.lang.String str, java.io.InputStream inputStream) throws java.io.IOException {
        return str.endsWith(".svgz") ? new java.util.zip.GZIPInputStream(inputStream) : inputStream;
    }

    private static java.lang.String removeLeadingSlash(java.lang.String str) {
        return (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
    }

    private int getFieldId(java.lang.String str, java.lang.String str2) {
        return this.mContext.getResources().getIdentifier(str2, str, this.mContext.getPackageName());
    }

    private int getValueType(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        this.mContext.getResources().getValue(i, typedValue, true);
        return typedValue.type;
    }

    public java.io.InputStream openResource(java.lang.String str) throws android.content.res.Resources.NotFoundException, java.io.IOException {
        java.lang.String strRemoveLeadingSlash = removeLeadingSlash(str);
        java.lang.String[] strArrSplit = strRemoveLeadingSlash.split("/", -1);
        if (strArrSplit.length != 2) {
            throw new java.lang.IllegalArgumentException("Incorrect resource path: " + strRemoveLeadingSlash);
        }
        java.lang.String str2 = strArrSplit[0];
        java.lang.String strSubstring = strArrSplit[1];
        int iLastIndexOf = strSubstring.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        int fieldId = getFieldId(str2, strSubstring);
        int valueType = getValueType(fieldId);
        if (valueType != 3) {
            throw new java.io.IOException(java.lang.String.format("Expected %s resource to be of TYPE_STRING but was %d", strRemoveLeadingSlash, java.lang.Integer.valueOf(valueType)));
        }
        return handleSvgzStream(strRemoveLeadingSlash, this.mContext.getResources().openRawResource(fieldId));
    }

    public java.io.InputStream openAsset(java.lang.String str) throws java.io.IOException {
        java.lang.String strRemoveLeadingSlash = removeLeadingSlash(str);
        return handleSvgzStream(strRemoveLeadingSlash, this.mContext.getAssets().open(strRemoveLeadingSlash, 2));
    }

    public static java.io.InputStream openFile(java.io.File file) throws java.io.IOException {
        return handleSvgzStream(file.getPath(), new java.io.FileInputStream(file));
    }

    public static java.io.File getCanonicalFileIfChild(java.io.File file, java.lang.String str) throws java.io.IOException {
        java.lang.String canonicalDirPath = getCanonicalDirPath(file);
        java.lang.String canonicalPath = new java.io.File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(canonicalDirPath)) {
            return new java.io.File(canonicalPath);
        }
        return null;
    }

    public static java.lang.String getCanonicalDirPath(java.io.File file) throws java.io.IOException {
        java.lang.String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath + "/" : canonicalPath;
    }

    public static java.io.File getDataDir(android.content.Context context) {
        return androidx.webkit.internal.ApiHelperForN.getDataDir(context);
    }

    public static java.lang.String guessMimeType(java.lang.String str) {
        java.lang.String mimeFromFileName = androidx.webkit.internal.MimeUtil.getMimeFromFileName(str);
        return mimeFromFileName == null ? DEFAULT_MIME_TYPE : mimeFromFileName;
    }
}
