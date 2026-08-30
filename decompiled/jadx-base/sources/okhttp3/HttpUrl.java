package okhttp3;

/* JADX INFO: compiled from: HttpUrl.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002IJBa\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b!J\r\u0010\u0011\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\"J\r\u0010\u0012\u001a\u00020\u0003H\u0007¢\u0006\u0002\b#J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b$J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b%J\r\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0002\b&J\u0013\u0010'\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b)J\b\u0010*\u001a\u00020\bH\u0016J\r\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0002\b+J\u0006\u0010,\u001a\u00020-J\u0010\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b/J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0007¢\u0006\u0002\b0J\r\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0002\b1J\r\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\b2J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b3J\u0010\u00104\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u00020\u0003J\u000e\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\bJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001eH\u0007¢\u0006\u0002\b8J\u0010\u00109\u001a\u0004\u0018\u00010\u00032\u0006\u00107\u001a\u00020\bJ\u0016\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u00105\u001a\u00020\u0003J\r\u0010 \u001a\u00020\bH\u0007¢\u0006\u0002\b;J\u0006\u0010<\u001a\u00020\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u0010.\u001a\u00020\u0003J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b>J\b\u0010?\u001a\u00020\u0003H\u0016J\r\u0010@\u001a\u00020AH\u0007¢\u0006\u0002\bBJ\r\u0010C\u001a\u00020DH\u0007¢\u0006\u0002\b\rJ\b\u0010E\u001a\u0004\u0018\u00010\u0003J\r\u0010B\u001a\u00020AH\u0007¢\u0006\u0002\bFJ\r\u0010\r\u001a\u00020DH\u0007¢\u0006\u0002\bGJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\bHR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\n8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\f\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0013\u0010\u0006\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0019R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\u001a\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u00038G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0018\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001fR\u0011\u0010 \u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010¨\u0006K"}, d2 = {"Lokhttp3/HttpUrl;", "", "scheme", "", com.applovin.sdk.AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "password", "host", org.jacoco.core.runtime.AgentOptions.PORT, "", "pathSegments", "", "queryNamesAndValues", "fragment", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "encodedFragment", "()Ljava/lang/String;", "encodedPassword", "encodedPath", "encodedPathSegments", "()Ljava/util/List;", "encodedQuery", "encodedUsername", "isHttps", "", "()Z", "pathSize", "()I", "query", "queryParameterNames", "", "()Ljava/util/Set;", "querySize", "-deprecated_encodedFragment", "-deprecated_encodedPassword", "-deprecated_encodedPath", "-deprecated_encodedPathSegments", "-deprecated_encodedQuery", "-deprecated_encodedUsername", "equals", "other", "-deprecated_fragment", "hashCode", "-deprecated_host", "newBuilder", "Lokhttp3/HttpUrl$Builder;", "link", "-deprecated_password", "-deprecated_pathSegments", "-deprecated_pathSize", "-deprecated_port", "-deprecated_query", "queryParameter", "name", "queryParameterName", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "-deprecated_queryParameterNames", "queryParameterValue", "queryParameterValues", "-deprecated_querySize", "redact", "resolve", "-deprecated_scheme", "toString", "toUri", "Ljava/net/URI;", "uri", "toUrl", "Ljava/net/URL;", "topPrivateDomain", "-deprecated_uri", "-deprecated_url", "-deprecated_username", "Builder", "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HttpUrl {
    public static final java.lang.String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final java.lang.String FRAGMENT_ENCODE_SET = "";
    public static final java.lang.String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final java.lang.String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final java.lang.String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final java.lang.String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final java.lang.String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final java.lang.String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final java.lang.String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final java.lang.String QUERY_ENCODE_SET = " \"'<>#";
    public static final java.lang.String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final java.lang.String fragment;
    private final java.lang.String host;
    private final boolean isHttps;
    private final java.lang.String password;
    private final java.util.List<java.lang.String> pathSegments;
    private final int port;
    private final java.util.List<java.lang.String> queryNamesAndValues;
    private final java.lang.String scheme;
    private final java.lang.String url;
    private final java.lang.String username;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.HttpUrl.Companion INSTANCE = new okhttp3.HttpUrl.Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @kotlin.jvm.JvmStatic
    public static final int defaultPort(java.lang.String str) {
        return INSTANCE.defaultPort(str);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl get(java.lang.String str) {
        return INSTANCE.get(str);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl get(java.net.URI uri) {
        return INSTANCE.get(uri);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl get(java.net.URL url) {
        return INSTANCE.get(url);
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.HttpUrl parse(java.lang.String str) {
        return INSTANCE.parse(str);
    }

    public HttpUrl(java.lang.String scheme, java.lang.String username, java.lang.String password, java.lang.String host, int i, java.util.List<java.lang.String> pathSegments, java.util.List<java.lang.String> list, java.lang.String str, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "password");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i;
        this.pathSegments = pathSegments;
        this.queryNamesAndValues = list;
        this.fragment = str;
        this.url = url;
        this.isHttps = kotlin.jvm.internal.Intrinsics.areEqual(scheme, "https");
    }

    public final java.lang.String scheme() {
        return this.scheme;
    }

    public final java.lang.String username() {
        return this.username;
    }

    public final java.lang.String password() {
        return this.password;
    }

    public final java.lang.String host() {
        return this.host;
    }

    public final int port() {
        return this.port;
    }

    public final java.util.List<java.lang.String> pathSegments() {
        return this.pathSegments;
    }

    public final java.lang.String fragment() {
        return this.fragment;
    }

    /* JADX INFO: renamed from: isHttps, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    public final java.net.URL url() {
        try {
            return new java.net.URL(this.url);
        } catch (java.net.MalformedURLException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public final java.net.URI uri() {
        java.lang.String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new java.net.URI(string);
        } catch (java.net.URISyntaxException e) {
            try {
                java.net.URI uriCreate = java.net.URI.create(new kotlin.text.Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (java.lang.Exception unused) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    public final java.lang.String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        java.lang.String str = this.url;
        java.lang.String strSubstring = this.url.substring(length, okhttp3.internal.Util.delimiterOffset(str, ":@", length, str.length()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final java.lang.String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        java.lang.String strSubstring = this.url.substring(kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, ':', this.scheme.length() + 3, false, 4, (java.lang.Object) null) + 1, kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, '@', 0, false, 6, (java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final java.lang.String encodedPath() {
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (java.lang.Object) null);
        java.lang.String str = this.url;
        java.lang.String strSubstring = this.url.substring(iIndexOf$default, okhttp3.internal.Util.delimiterOffset(str, "?#", iIndexOf$default, str.length()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final java.util.List<java.lang.String> encodedPathSegments() {
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, '/', this.scheme.length() + 3, false, 4, (java.lang.Object) null);
        java.lang.String str = this.url;
        int iDelimiterOffset = okhttp3.internal.Util.delimiterOffset(str, "?#", iIndexOf$default, str.length());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (iIndexOf$default < iDelimiterOffset) {
            int i = iIndexOf$default + 1;
            int iDelimiterOffset2 = okhttp3.internal.Util.delimiterOffset(this.url, '/', i, iDelimiterOffset);
            java.lang.String strSubstring = this.url.substring(i, iDelimiterOffset2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iIndexOf$default = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final java.lang.String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, '?', 0, false, 6, (java.lang.Object) null) + 1;
        java.lang.String str = this.url;
        java.lang.String strSubstring = this.url.substring(iIndexOf$default, okhttp3.internal.Util.delimiterOffset(str, '#', iIndexOf$default, str.length()));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final java.lang.String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        INSTANCE.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final int querySize() {
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final java.lang.String queryParameter(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        kotlin.ranges.IntProgression intProgressionStep = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, list.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!kotlin.jvm.internal.Intrinsics.areEqual(name, this.queryNamesAndValues.get(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return this.queryNamesAndValues.get(first + 1);
        }
        return null;
    }

    public final java.util.Set<java.lang.String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        kotlin.ranges.IntProgression intProgressionStep = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                java.lang.String str = this.queryNamesAndValues.get(first);
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                linkedHashSet.add(str);
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        java.util.Set<java.lang.String> setUnmodifiableSet = java.util.Collections.unmodifiableSet(linkedHashSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final java.util.List<java.lang.String> queryParameterValues(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        if (this.queryNamesAndValues == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.ranges.IntProgression intProgressionStep = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, this.queryNamesAndValues.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(name, this.queryNamesAndValues.get(first))) {
                    arrayList.add(this.queryNamesAndValues.get(first + 1));
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        java.util.List<java.lang.String> listUnmodifiableList = java.util.Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final java.lang.String queryParameterName(int index) {
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        java.lang.String str = list.get(index * 2);
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        return str;
    }

    public final java.lang.String queryParameterValue(int index) {
        java.util.List<java.lang.String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return list.get((index * 2) + 1);
    }

    public final java.lang.String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        java.lang.String strSubstring = this.url.substring(kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.url, '#', 0, false, 6, (java.lang.Object) null) + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final java.lang.String redact() {
        okhttp3.HttpUrl.Builder builderNewBuilder = newBuilder("/...");
        kotlin.jvm.internal.Intrinsics.checkNotNull(builderNewBuilder);
        return builderNewBuilder.username("").password("").build().getUrl();
    }

    public final okhttp3.HttpUrl resolve(java.lang.String link) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "link");
        okhttp3.HttpUrl.Builder builderNewBuilder = newBuilder(link);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    public final okhttp3.HttpUrl.Builder newBuilder() {
        okhttp3.HttpUrl.Builder builder = new okhttp3.HttpUrl.Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != INSTANCE.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final okhttp3.HttpUrl.Builder newBuilder(java.lang.String link) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new okhttp3.HttpUrl.Builder().parse$okhttp(this, link);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof okhttp3.HttpUrl) && kotlin.jvm.internal.Intrinsics.areEqual(((okhttp3.HttpUrl) other).url, this.url);
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public java.lang.String getUrl() {
        return this.url;
    }

    public final java.lang.String topPrivateDomain() {
        if (okhttp3.internal.Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return okhttp3.internal.publicsuffix.PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(this.host);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @kotlin.ReplaceWith(expression = "toUrl()", imports = {}))
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final java.net.URL m2942deprecated_url() {
        return url();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @kotlin.ReplaceWith(expression = "toUri()", imports = {}))
    /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
    public final java.net.URI m2941deprecated_uri() {
        return uri();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "scheme", imports = {}))
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final java.lang.String getScheme() {
        return this.scheme;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedUsername", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final java.lang.String m2930deprecated_encodedUsername() {
        return encodedUsername();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = com.applovin.sdk.AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, imports = {}))
    /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPassword", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final java.lang.String m2926deprecated_encodedPassword() {
        return encodedPassword();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "password", imports = {}))
    /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final java.lang.String getPassword() {
        return this.password;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "host", imports = {}))
    /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final java.lang.String getHost() {
        return this.host;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = org.jacoco.core.runtime.AgentOptions.PORT, imports = {}))
    /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pathSize", imports = {}))
    /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m2935deprecated_pathSize() {
        return pathSize();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPath", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final java.lang.String m2927deprecated_encodedPath() {
        return encodedPath();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedPathSegments", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final java.util.List<java.lang.String> m2928deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "pathSegments", imports = {}))
    /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final java.util.List<java.lang.String> m2934deprecated_pathSegments() {
        return this.pathSegments;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedQuery", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final java.lang.String m2929deprecated_encodedQuery() {
        return encodedQuery();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "query", imports = {}))
    /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
    public final java.lang.String m2937deprecated_query() {
        return query();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "querySize", imports = {}))
    /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m2939deprecated_querySize() {
        return querySize();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "queryParameterNames", imports = {}))
    /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final java.util.Set<java.lang.String> m2938deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "encodedFragment", imports = {}))
    /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final java.lang.String m2925deprecated_encodedFragment() {
        return encodedFragment();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "fragment", imports = {}))
    /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final java.lang.String getFragment() {
        return this.fragment;
    }

    /* JADX INFO: compiled from: HttpUrl.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0017\u0018\u0000 V2\u00020\u0001:\u0001VB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0004J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u0018\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020\u001bH\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u00105\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0004J\u0010\u00106\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u00107\u001a\u00020\u00002\b\u00107\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0004J\u0010\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020\u0004H\u0002J\u0010\u0010:\u001a\u00020.2\u0006\u00109\u001a\u00020\u0004H\u0002J\u001f\u0010;\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u0001032\u0006\u00109\u001a\u00020\u0004H\u0000¢\u0006\u0002\b=J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020\u0004J\b\u0010?\u001a\u00020@H\u0002J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ0\u0010A\u001a\u00020@2\u0006\u00109\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020.2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010E\u001a\u00020\u00002\b\u0010E\u001a\u0004\u0018\u00010\u0004J\r\u0010F\u001a\u00020\u0000H\u0000¢\u0006\u0002\bGJ\u0010\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020\u0004H\u0002J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0004J\u000e\u0010K\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0004J\u000e\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001bJ \u0010N\u001a\u00020@2\u0006\u00109\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u001bH\u0002J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0004J\u0016\u0010P\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0004J\u0018\u0010Q\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0016\u0010R\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0004J\u0018\u0010S\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u00042\b\u00101\u001a\u0004\u0018\u00010\u0004J\b\u0010T\u001a\u00020\u0004H\u0016J\u000e\u0010U\u001a\u00020\u00002\u0006\u0010U\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\b¨\u0006W"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "()V", "encodedFragment", "", "getEncodedFragment$okhttp", "()Ljava/lang/String;", "setEncodedFragment$okhttp", "(Ljava/lang/String;)V", "encodedPassword", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "encodedPathSegments", "", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "encodedQueryNamesAndValues", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedUsername", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "host", "getHost$okhttp", "setHost$okhttp", org.jacoco.core.runtime.AgentOptions.PORT, "", "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "scheme", "getScheme$okhttp", "setScheme$okhttp", "addEncodedPathSegment", "encodedPathSegment", "addEncodedPathSegments", "addEncodedQueryParameter", "encodedName", "encodedValue", "addPathSegment", "pathSegment", "addPathSegments", "pathSegments", "alreadyEncoded", "", "addQueryParameter", "name", "value", "build", "Lokhttp3/HttpUrl;", "effectivePort", "encodedPath", "encodedQuery", "fragment", "isDot", "input", "isDotDot", "parse", androidx.media3.extractor.text.ttml.TtmlNode.RUBY_BASE, "parse$okhttp", "password", "pop", "", com.adjust.sdk.Constants.PUSH, "pos", "limit", "addTrailingSlash", "query", "reencodeForUri", "reencodeForUri$okhttp", "removeAllCanonicalQueryParameters", "canonicalName", "removeAllEncodedQueryParameters", "removeAllQueryParameters", "removePathSegment", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "resolvePath", "startPos", "setEncodedPathSegment", "setEncodedQueryParameter", "setPathSegment", "setQueryParameter", "toString", com.applovin.sdk.AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER, "Companion", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final okhttp3.HttpUrl.Builder.Companion INSTANCE = new okhttp3.HttpUrl.Builder.Companion(null);
        public static final java.lang.String INVALID_HOST = "Invalid URL host";
        private java.lang.String encodedFragment;
        private final java.util.List<java.lang.String> encodedPathSegments;
        private java.util.List<java.lang.String> encodedQueryNamesAndValues;
        private java.lang.String host;
        private java.lang.String scheme;
        private java.lang.String encodedUsername = "";
        private java.lang.String encodedPassword = "";
        private int port = -1;

        public Builder() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        /* JADX INFO: renamed from: getScheme$okhttp, reason: from getter */
        public final java.lang.String getScheme() {
            return this.scheme;
        }

        public final void setScheme$okhttp(java.lang.String str) {
            this.scheme = str;
        }

        /* JADX INFO: renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final java.lang.String getEncodedUsername() {
            return this.encodedUsername;
        }

        public final void setEncodedUsername$okhttp(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedUsername = str;
        }

        /* JADX INFO: renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final java.lang.String getEncodedPassword() {
            return this.encodedPassword;
        }

        public final void setEncodedPassword$okhttp(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedPassword = str;
        }

        /* JADX INFO: renamed from: getHost$okhttp, reason: from getter */
        public final java.lang.String getHost() {
            return this.host;
        }

        public final void setHost$okhttp(java.lang.String str) {
            this.host = str;
        }

        /* JADX INFO: renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final java.util.List<java.lang.String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final java.util.List<java.lang.String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(java.util.List<java.lang.String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        /* JADX INFO: renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final java.lang.String getEncodedFragment() {
            return this.encodedFragment;
        }

        public final void setEncodedFragment$okhttp(java.lang.String str) {
            this.encodedFragment = str;
        }

        public final okhttp3.HttpUrl.Builder scheme(java.lang.String scheme) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (kotlin.text.StringsKt.equals(scheme, androidx.webkit.ProxyConfig.MATCH_HTTP, true)) {
                this.scheme = androidx.webkit.ProxyConfig.MATCH_HTTP;
            } else {
                if (!kotlin.text.StringsKt.equals(scheme, "https", true)) {
                    throw new java.lang.IllegalArgumentException("unexpected scheme: " + scheme);
                }
                this.scheme = "https";
            }
            return this;
        }

        public final okhttp3.HttpUrl.Builder username(java.lang.String username) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "username");
            this.encodedUsername = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final okhttp3.HttpUrl.Builder encodedUsername(java.lang.String encodedUsername) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedUsername, "encodedUsername");
            this.encodedUsername = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final okhttp3.HttpUrl.Builder password(java.lang.String password) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "password");
            this.encodedPassword = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final okhttp3.HttpUrl.Builder encodedPassword(java.lang.String encodedPassword) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPassword, "encodedPassword");
            this.encodedPassword = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final okhttp3.HttpUrl.Builder host(java.lang.String host) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(host, "host");
            java.lang.String canonicalHost = okhttp3.internal.HostnamesKt.toCanonicalHost(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, host, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new java.lang.IllegalArgumentException("unexpected host: " + host);
            }
            this.host = canonicalHost;
            return this;
        }

        public final okhttp3.HttpUrl.Builder port(int port) {
            boolean z = false;
            if (1 <= port && port < 65536) {
                z = true;
            }
            if (!z) {
                throw new java.lang.IllegalArgumentException(("unexpected port: " + port).toString());
            }
            this.port = port;
            return this;
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            okhttp3.HttpUrl.Companion companion = okhttp3.HttpUrl.INSTANCE;
            java.lang.String str = this.scheme;
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            return companion.defaultPort(str);
        }

        public final okhttp3.HttpUrl.Builder addPathSegment(java.lang.String pathSegment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            push(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        public final okhttp3.HttpUrl.Builder addPathSegments(java.lang.String pathSegments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
            return addPathSegments(pathSegments, false);
        }

        public final okhttp3.HttpUrl.Builder addEncodedPathSegment(java.lang.String encodedPathSegment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            push(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        public final okhttp3.HttpUrl.Builder addEncodedPathSegments(java.lang.String encodedPathSegments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPathSegments, "encodedPathSegments");
            return addPathSegments(encodedPathSegments, true);
        }

        private final okhttp3.HttpUrl.Builder addPathSegments(java.lang.String pathSegments, boolean alreadyEncoded) {
            int i = 0;
            do {
                int iDelimiterOffset = okhttp3.internal.Util.delimiterOffset(pathSegments, "/\\", i, pathSegments.length());
                push(pathSegments, i, iDelimiterOffset, iDelimiterOffset < pathSegments.length(), alreadyEncoded);
                i = iDelimiterOffset + 1;
            } while (i <= pathSegments.length());
            return this;
        }

        public final okhttp3.HttpUrl.Builder setPathSegment(int index, java.lang.String pathSegment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            java.lang.String strCanonicalize$okhttp$default = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, pathSegment, 0, 0, okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (!((isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) ? false : true)) {
                throw new java.lang.IllegalArgumentException(("unexpected path segment: " + pathSegment).toString());
            }
            this.encodedPathSegments.set(index, strCanonicalize$okhttp$default);
            return this;
        }

        public final okhttp3.HttpUrl.Builder setEncodedPathSegment(int index, java.lang.String encodedPathSegment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            java.lang.String strCanonicalize$okhttp$default = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedPathSegment, 0, 0, okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(index, strCanonicalize$okhttp$default);
            if ((isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) ? false : true) {
                return this;
            }
            throw new java.lang.IllegalArgumentException(("unexpected path segment: " + encodedPathSegment).toString());
        }

        public final okhttp3.HttpUrl.Builder removePathSegment(int index) {
            this.encodedPathSegments.remove(index);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final okhttp3.HttpUrl.Builder encodedPath(java.lang.String encodedPath) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
            if (!kotlin.text.StringsKt.startsWith$default(encodedPath, "/", false, 2, (java.lang.Object) null)) {
                throw new java.lang.IllegalArgumentException(("unexpected encodedPath: " + encodedPath).toString());
            }
            resolvePath(encodedPath, 0, encodedPath.length());
            return this;
        }

        public final okhttp3.HttpUrl.Builder query(java.lang.String query) {
            java.lang.String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (query == null || (strCanonicalize$okhttp$default = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, query, 0, 0, okhttp3.HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null)) == null) ? null : okhttp3.HttpUrl.INSTANCE.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        public final okhttp3.HttpUrl.Builder encodedQuery(java.lang.String encodedQuery) {
            java.lang.String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (encodedQuery == null || (strCanonicalize$okhttp$default = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedQuery, 0, 0, okhttp3.HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null)) == null) ? null : okhttp3.HttpUrl.INSTANCE.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        public final okhttp3.HttpUrl.Builder addQueryParameter(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new java.util.ArrayList();
            }
            java.util.List<java.lang.String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            list.add(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, name, 0, 0, okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            java.util.List<java.lang.String> list2 = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
            list2.add(value != null ? okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, value, 0, 0, okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final okhttp3.HttpUrl.Builder addEncodedQueryParameter(java.lang.String encodedName, java.lang.String encodedValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new java.util.ArrayList();
            }
            java.util.List<java.lang.String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            list.add(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedName, 0, 0, okhttp3.HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            java.util.List<java.lang.String> list2 = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
            list2.add(encodedValue != null ? okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedValue, 0, 0, okhttp3.HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final okhttp3.HttpUrl.Builder setQueryParameter(java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, value);
            return this;
        }

        public final okhttp3.HttpUrl.Builder setEncodedQueryParameter(java.lang.String encodedName, java.lang.String encodedValue) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        public final okhttp3.HttpUrl.Builder removeAllQueryParameters(java.lang.String name) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, name, 0, 0, okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final okhttp3.HttpUrl.Builder removeAllEncodedQueryParameters(java.lang.String encodedName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedName, 0, 0, okhttp3.HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        private final void removeAllCanonicalQueryParameters(java.lang.String canonicalName) {
            java.util.List<java.lang.String> list = this.encodedQueryNamesAndValues;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            int size = list.size() - 2;
            int progressionLastElement = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return;
            }
            while (true) {
                java.util.List<java.lang.String> list2 = this.encodedQueryNamesAndValues;
                kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                if (kotlin.jvm.internal.Intrinsics.areEqual(canonicalName, list2.get(size))) {
                    java.util.List<java.lang.String> list3 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list3);
                    list3.remove(size + 1);
                    java.util.List<java.lang.String> list4 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list4);
                    list4.remove(size);
                    java.util.List<java.lang.String> list5 = this.encodedQueryNamesAndValues;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == progressionLastElement) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        public final okhttp3.HttpUrl.Builder fragment(java.lang.String fragment) {
            this.encodedFragment = fragment != null ? okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, fragment, 0, 0, "", false, false, false, true, null, org.objectweb.asm.Opcodes.NEW, null) : null;
            return this;
        }

        public final okhttp3.HttpUrl.Builder encodedFragment(java.lang.String encodedFragment) {
            this.encodedFragment = encodedFragment != null ? okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, encodedFragment, 0, 0, "", true, false, false, true, null, org.objectweb.asm.Opcodes.PUTSTATIC, null) : null;
            return this;
        }

        public final okhttp3.HttpUrl.Builder reencodeForUri$okhttp() {
            java.lang.String str = this.host;
            this.host = str != null ? new kotlin.text.Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                this.encodedPathSegments.set(i, okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, this.encodedPathSegments.get(i), 0, 0, okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            java.util.List<java.lang.String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    java.lang.String str2 = list.get(i2);
                    list.set(i2, str2 != null ? okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, str2, 0, 0, okhttp3.HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, org.objectweb.asm.Opcodes.MONITOREXIT, null) : null);
                }
            }
            java.lang.String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, str3, 0, 0, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, org.objectweb.asm.Opcodes.IF_ICMPGT, null) : null;
            return this;
        }

        public final okhttp3.HttpUrl build() {
            java.util.ArrayList arrayList;
            java.lang.String str = this.scheme;
            if (str == null) {
                throw new java.lang.IllegalStateException("scheme == null");
            }
            java.lang.String strPercentDecode$okhttp$default = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, this.encodedUsername, 0, 0, false, 7, null);
            java.lang.String strPercentDecode$okhttp$default2 = okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, this.encodedPassword, 0, 0, false, 7, null);
            java.lang.String str2 = this.host;
            if (str2 == null) {
                throw new java.lang.IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            java.util.List<java.lang.String> list = this.encodedPathSegments;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, (java.lang.String) it.next(), 0, 0, false, 7, null));
            }
            java.util.ArrayList arrayList3 = arrayList2;
            java.util.List<java.lang.String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                java.util.List<java.lang.String> list3 = list2;
                java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (java.lang.String str3 : list3) {
                    arrayList4.add(str3 != null ? okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            java.lang.String str4 = this.encodedFragment;
            return new okhttp3.HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList3, arrayList, str4 != null ? okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, str4, 0, 0, false, 7, null) : null, toString());
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0039  */
        /* JADX WARN: Code duplicated, block: B:20:0x0049  */
        /* JADX WARN: Code duplicated, block: B:22:0x004c  */
        /* JADX WARN: Code duplicated, block: B:38:0x009d  */
        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = this.scheme;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (this.encodedUsername.length() > 0) {
                sb.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb.append(':');
                    sb.append(this.encodedPassword);
                }
                sb.append('@');
            } else {
                if (this.encodedPassword.length() > 0) {
                    sb.append(this.encodedUsername);
                    if (this.encodedPassword.length() > 0) {
                        sb.append(':');
                        sb.append(this.encodedPassword);
                    }
                    sb.append('@');
                }
            }
            java.lang.String str2 = this.host;
            if (str2 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, ':', false, 2, (java.lang.Object) null)) {
                    sb.append('[');
                    sb.append(this.host);
                    sb.append(']');
                } else {
                    sb.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int iEffectivePort = effectivePort();
                if (this.scheme != null) {
                    okhttp3.HttpUrl.Companion companion = okhttp3.HttpUrl.INSTANCE;
                    java.lang.String str3 = this.scheme;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str3);
                    if (iEffectivePort != companion.defaultPort(str3)) {
                        sb.append(':');
                        sb.append(iEffectivePort);
                    }
                } else {
                    sb.append(':');
                    sb.append(iEffectivePort);
                }
            }
            okhttp3.HttpUrl.INSTANCE.toPathString$okhttp(this.encodedPathSegments, sb);
            if (this.encodedQueryNamesAndValues != null) {
                sb.append('?');
                okhttp3.HttpUrl.Companion companion2 = okhttp3.HttpUrl.INSTANCE;
                java.util.List<java.lang.String> list = this.encodedQueryNamesAndValues;
                kotlin.jvm.internal.Intrinsics.checkNotNull(list);
                companion2.toQueryString$okhttp(list, sb);
            }
            if (this.encodedFragment != null) {
                sb.append('#');
                sb.append(this.encodedFragment);
            }
            java.lang.String string = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final okhttp3.HttpUrl.Builder parse$okhttp(okhttp3.HttpUrl base, java.lang.String input) {
            int iDelimiterOffset;
            int i;
            int i2;
            boolean z;
            java.lang.String str;
            int i3;
            boolean z2;
            java.lang.String input2 = input;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input2, "input");
            int iIndexOfFirstNonAsciiWhitespace$default = okhttp3.internal.Util.indexOfFirstNonAsciiWhitespace$default(input2, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = okhttp3.internal.Util.indexOfLastNonAsciiWhitespace$default(input2, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            okhttp3.HttpUrl.Builder.Companion companion = INSTANCE;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(input2, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            java.lang.String str2 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z3 = true;
            byte b = -1;
            if (iSchemeDelimiterOffset != -1) {
                if (kotlin.text.StringsKt.startsWith(input2, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else if (kotlin.text.StringsKt.startsWith(input2, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = androidx.webkit.ProxyConfig.MATCH_HTTP;
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    java.lang.String strSubstring = input2.substring(0, iSchemeDelimiterOffset);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    throw new java.lang.IllegalArgumentException(sb.append(strSubstring).append('\'').toString());
                }
            } else if (base != null) {
                this.scheme = base.scheme();
            } else {
                if (input.length() > 6) {
                    input2 = kotlin.text.StringsKt.take(input2, 6) + "...";
                }
                throw new java.lang.IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + input2);
            }
            int iSlashCount = companion.slashCount(input2, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            byte b2 = okio.Utf8.REPLACEMENT_BYTE;
            byte b3 = 35;
            if (iSlashCount >= 2 || base == null || !kotlin.jvm.internal.Intrinsics.areEqual(base.scheme(), this.scheme)) {
                int i4 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    iDelimiterOffset = okhttp3.internal.Util.delimiterOffset(input2, "@/\\?#", i4, iIndexOfLastNonAsciiWhitespace$default);
                    byte bCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? input2.charAt(iDelimiterOffset) : b;
                    if (bCharAt == b || bCharAt == b3 || bCharAt == 47 || bCharAt == 92 || bCharAt == b2) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (!z4) {
                            int iDelimiterOffset2 = okhttp3.internal.Util.delimiterOffset(input2, ':', i4, iDelimiterOffset);
                            z = z3;
                            java.lang.String str3 = str2;
                            java.lang.String strCanonicalize$okhttp$default = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, i4, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, null);
                            if (z5) {
                                strCanonicalize$okhttp$default = this.encodedUsername + "%40" + strCanonicalize$okhttp$default;
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                this.encodedPassword = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, iDelimiterOffset2 + 1, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, null);
                                z2 = z;
                            } else {
                                z2 = z4;
                            }
                            z4 = z2;
                            str = str3;
                            z5 = z;
                            i3 = iDelimiterOffset;
                        } else {
                            z = z3;
                            str = str2;
                            i3 = iDelimiterOffset;
                            this.encodedPassword += "%40" + okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, i4, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, null);
                        }
                        i4 = i3 + 1;
                        z3 = z;
                        iIndexOfLastNonAsciiWhitespace$default = iIndexOfLastNonAsciiWhitespace$default;
                        str2 = str;
                        b3 = 35;
                        b2 = okio.Utf8.REPLACEMENT_BYTE;
                        b = -1;
                    }
                }
                boolean z6 = z3;
                java.lang.String str4 = str2;
                i = iIndexOfLastNonAsciiWhitespace$default;
                okhttp3.HttpUrl.Builder.Companion companion2 = INSTANCE;
                int iPortColonOffset = companion2.portColonOffset(input2, i4, iDelimiterOffset);
                int i5 = iPortColonOffset + 1;
                if (i5 < iDelimiterOffset) {
                    i2 = i4;
                    this.host = okhttp3.internal.HostnamesKt.toCanonicalHost(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, i4, iPortColonOffset, false, 4, null));
                    int port = companion2.parsePort(input2, i5, iDelimiterOffset);
                    this.port = port;
                    if (!(port != -1 ? z6 : false)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid URL port: \"");
                        java.lang.String strSubstring2 = input2.substring(i5, iDelimiterOffset);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, str4);
                        throw new java.lang.IllegalArgumentException(sb2.append(strSubstring2).append(kotlin.text.Typography.quote).toString().toString());
                    }
                } else {
                    i2 = i4;
                    this.host = okhttp3.internal.HostnamesKt.toCanonicalHost(okhttp3.HttpUrl.Companion.percentDecode$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, i2, iPortColonOffset, false, 4, null));
                    okhttp3.HttpUrl.Companion companion3 = okhttp3.HttpUrl.INSTANCE;
                    java.lang.String str5 = this.scheme;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str5);
                    this.port = companion3.defaultPort(str5);
                }
                if (!(this.host != null ? z6 : false)) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid URL host: \"");
                    java.lang.String strSubstring3 = input2.substring(i2, iPortColonOffset);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring3, str4);
                    throw new java.lang.IllegalArgumentException(sb3.append(strSubstring3).append(kotlin.text.Typography.quote).toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(base.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || input2.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
                i = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i6 = i;
            int iDelimiterOffset3 = okhttp3.internal.Util.delimiterOffset(input2, "?#", iIndexOfFirstNonAsciiWhitespace$default, i6);
            resolvePath(input2, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 < i6 && input2.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = okhttp3.internal.Util.delimiterOffset(input2, '#', iDelimiterOffset3, i6);
                this.encodedQueryNamesAndValues = okhttp3.HttpUrl.INSTANCE.toQueryNamesAndValues$okhttp(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, iDelimiterOffset3 + 1, iDelimiterOffset4, okhttp3.HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < i6 && input2.charAt(iDelimiterOffset3) == '#') {
                this.encodedFragment = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, iDelimiterOffset3 + 1, i6, "", true, false, false, true, null, org.objectweb.asm.Opcodes.ARETURN, null);
            }
            return this;
        }

        private final void resolvePath(java.lang.String input, int startPos, int limit) {
            if (startPos == limit) {
                return;
            }
            char cCharAt = input.charAt(startPos);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                startPos++;
            } else {
                java.util.List<java.lang.String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i = startPos;
                while (i < limit) {
                    startPos = okhttp3.internal.Util.delimiterOffset(input, "/\\", i, limit);
                    boolean z = startPos < limit;
                    push(input, i, startPos, z, true);
                    if (z) {
                        i = startPos + 1;
                    }
                }
                return;
            }
        }

        private final void push(java.lang.String input, int pos, int limit, boolean addTrailingSlash, boolean alreadyEncoded) {
            java.lang.String strCanonicalize$okhttp$default = okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, pos, limit, okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET, alreadyEncoded, false, false, false, null, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            java.util.List<java.lang.String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                java.util.List<java.lang.String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, strCanonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(strCanonicalize$okhttp$default);
            }
            if (addTrailingSlash) {
                this.encodedPathSegments.add("");
            }
        }

        private final boolean isDot(java.lang.String input) {
            return kotlin.jvm.internal.Intrinsics.areEqual(input, ".") || kotlin.text.StringsKt.equals(input, "%2e", true);
        }

        private final boolean isDotDot(java.lang.String input) {
            return kotlin.jvm.internal.Intrinsics.areEqual(input, "..") || kotlin.text.StringsKt.equals(input, "%2e.", true) || kotlin.text.StringsKt.equals(input, ".%2e", true) || kotlin.text.StringsKt.equals(input, "%2e%2e", true);
        }

        private final void pop() {
            java.util.List<java.lang.String> list = this.encodedPathSegments;
            if ((list.remove(list.size() - 1).length() == 0) && (!this.encodedPathSegments.isEmpty())) {
                java.util.List<java.lang.String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
            } else {
                this.encodedPathSegments.add("");
            }
        }

        /* JADX INFO: compiled from: HttpUrl.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u001c\u0010\f\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "()V", "INVALID_HOST", "", "parsePort", "", "input", "pos", "limit", "portColonOffset", "schemeDelimiterOffset", "slashCount", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(java.lang.String input, int pos, int limit) {
                if (limit - pos < 2) {
                    return -1;
                }
                char cCharAt = input.charAt(pos);
                if ((kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 97) >= 0 && kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 122) <= 0) || (kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 65) >= 0 && kotlin.jvm.internal.Intrinsics.compare((int) cCharAt, 90) <= 0)) {
                    for (int i = pos + 1; i < limit; i++) {
                        char cCharAt2 = input.charAt(i);
                        if (!(((((('a' <= cCharAt2 && cCharAt2 < '{') || ('A' <= cCharAt2 && cCharAt2 < '[')) || ('0' <= cCharAt2 && cCharAt2 < ':')) || cCharAt2 == '+') || cCharAt2 == '-') || cCharAt2 == '.')) {
                            if (cCharAt2 == ':') {
                                return i;
                            }
                            return -1;
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(java.lang.String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(java.lang.String input, int pos, int limit) {
                while (pos < limit) {
                    char cCharAt = input.charAt(pos);
                    if (cCharAt == '[') {
                        do {
                            pos++;
                            if (pos >= limit) {
                                break;
                            }
                        } while (input.charAt(pos) != ']');
                    } else if (cCharAt == ':') {
                        return pos;
                    }
                    pos++;
                }
                return limit;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(java.lang.String input, int pos, int limit) {
                try {
                    int i = java.lang.Integer.parseInt(okhttp3.HttpUrl.Companion.canonicalize$okhttp$default(okhttp3.HttpUrl.INSTANCE, input, pos, limit, "", false, false, false, false, null, 248, null));
                    boolean z = false;
                    if (1 <= i && i < 65536) {
                        z = true;
                    }
                    if (z) {
                        return i;
                    }
                    return -1;
                } catch (java.lang.NumberFormatException unused) {
                    return -1;
                }
            }
        }
    }

    /* JADX INFO: compiled from: HttpUrl.kt */
    @kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\b\u0018J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u001cJa\u0010\u001d\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0002\b(J\u001c\u0010)\u001a\u00020\"*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J/\u0010*\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\"H\u0000¢\u0006\u0002\b+J\u0011\u0010,\u001a\u00020\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0017H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u001aH\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u001bJ#\u0010.\u001a\u00020/*\b\u0012\u0004\u0012\u00020\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b4J\u0019\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000406*\u00020\u0004H\u0000¢\u0006\u0002\b7J%\u00108\u001a\u00020/*\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b9JV\u0010:\u001a\u00020/*\u00020;2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J,\u0010=\u001a\u00020/*\u00020;2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "()V", "FORM_ENCODE_SET", "", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "HEX_DIGITS", "", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "defaultPort", "", "scheme", "get", "Lokhttp3/HttpUrl;", "uri", "Ljava/net/URI;", "-deprecated_get", "url", "Ljava/net/URL;", "parse", "-deprecated_parse", "canonicalize", "pos", "limit", "encodeSet", "alreadyEncoded", "", "strict", "plusIsSpace", "unicodeAllowed", com.json.zb.M, "Ljava/nio/charset/Charset;", "canonicalize$okhttp", "isPercentEncoded", "percentDecode", "percentDecode$okhttp", "toHttpUrl", "toHttpUrlOrNull", "toPathString", "", "", "out", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "toPathString$okhttp", "toQueryNamesAndValues", "", "toQueryNamesAndValues$okhttp", "toQueryString", "toQueryString$okhttp", "writeCanonicalized", "Lokio/Buffer;", "input", "writePercentDecoded", "encoded", com.unity3d.services.core.network.core.OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final int defaultPort(java.lang.String scheme) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (kotlin.jvm.internal.Intrinsics.areEqual(scheme, androidx.webkit.ProxyConfig.MATCH_HTTP)) {
                return 80;
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        }

        public final void toPathString$okhttp(java.util.List<java.lang.String> list, java.lang.StringBuilder out) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                out.append('/');
                out.append(list.get(i));
            }
        }

        public final void toQueryString$okhttp(java.util.List<java.lang.String> list, java.lang.StringBuilder out) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
            kotlin.ranges.IntProgression intProgressionStep = kotlin.ranges.RangesKt.step(kotlin.ranges.RangesKt.until(0, list.size()), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                java.lang.String str = list.get(first);
                java.lang.String str2 = list.get(first + 1);
                if (first > 0) {
                    out.append(kotlin.text.Typography.amp);
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }

        public final java.util.List<java.lang.String> toQueryNamesAndValues$okhttp(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = 0;
            while (i <= str.length()) {
                java.lang.String str2 = str;
                int iIndexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, kotlin.text.Typography.amp, i, false, 4, (java.lang.Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = str.length();
                }
                int i2 = iIndexOf$default;
                int iIndexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, '=', i, false, 4, (java.lang.Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > i2) {
                    java.lang.String strSubstring = str.substring(i, i2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    java.lang.String strSubstring2 = str.substring(i, iIndexOf$default2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    java.lang.String strSubstring3 = str.substring(iIndexOf$default2 + 1, i2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i = i2 + 1;
            }
            return arrayList;
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl get(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            return new okhttp3.HttpUrl.Builder().parse$okhttp(null, str).build();
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl parse(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return get(str);
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl get(java.net.URL url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "<this>");
            java.lang.String string = url.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString()");
            return parse(string);
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.HttpUrl get(java.net.URI uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "<this>");
            java.lang.String string = uri.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString()");
            return parse(string);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m2944deprecated_get(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            return get(url);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final okhttp3.HttpUrl m2947deprecated_parse(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            return parse(url);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m2946deprecated_get(java.net.URL url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            return get(url);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.HttpUrl m2945deprecated_get(java.net.URI uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "uri");
            return get(uri);
        }

        public static /* synthetic */ java.lang.String percentDecode$okhttp$default(okhttp3.HttpUrl.Companion companion, java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        public final java.lang.String percentDecode$okhttp(java.lang.String str, int i, int i2, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            for (int i3 = i; i3 < i2; i3++) {
                char cCharAt = str.charAt(i3);
                if (cCharAt == '%' || (cCharAt == '+' && z)) {
                    okio.Buffer buffer = new okio.Buffer();
                    buffer.writeUtf8(str, i, i3);
                    writePercentDecoded(buffer, str, i3, i2, z);
                    return buffer.readUtf8();
                }
            }
            java.lang.String strSubstring = str.substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        private final void writePercentDecoded(okio.Buffer buffer, java.lang.String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                int iCodePointAt = str.codePointAt(i);
                if (iCodePointAt == 37 && (i3 = i + 2) < i2) {
                    int hexDigit = okhttp3.internal.Util.parseHexDigit(str.charAt(i + 1));
                    int hexDigit2 = okhttp3.internal.Util.parseHexDigit(str.charAt(i3));
                    if (hexDigit != -1 && hexDigit2 != -1) {
                        buffer.writeByte((hexDigit << 4) + hexDigit2);
                        i = java.lang.Character.charCount(iCodePointAt) + i3;
                    } else {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i += java.lang.Character.charCount(iCodePointAt);
                    }
                } else if (iCodePointAt == 43 && z) {
                    buffer.writeByte(32);
                    i++;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i += java.lang.Character.charCount(iCodePointAt);
                }
            }
        }

        private final boolean isPercentEncoded(java.lang.String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && okhttp3.internal.Util.parseHexDigit(str.charAt(i + 1)) != -1 && okhttp3.internal.Util.parseHexDigit(str.charAt(i3)) != -1;
        }

        public static /* synthetic */ java.lang.String canonicalize$okhttp$default(okhttp3.HttpUrl.Companion companion, java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset, int i3, java.lang.Object obj) {
            return companion.canonicalize$okhttp(str, (i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? str.length() : i2, str2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? null : charset);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0041  */
        public final java.lang.String canonicalize$okhttp(java.lang.String str, int i, int i2, java.lang.String encodeSet, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int iCharCount = i;
            while (true) {
                if (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) encodeSet, (char) iCodePointAt, false, 2, (java.lang.Object) null))) {
                        break;
                    }
                    if (iCodePointAt == 37) {
                        if (!z) {
                            break;
                        }
                        if (z2) {
                            if (isPercentEncoded(str, iCharCount, i2)) {
                            }
                        }
                        if (iCodePointAt == 43) {
                        }
                        iCharCount += java.lang.Character.charCount(iCodePointAt);
                    } else if (iCodePointAt == 43 || !z3) {
                        iCharCount += java.lang.Character.charCount(iCodePointAt);
                    }
                    okio.Buffer buffer = new okio.Buffer();
                    buffer.writeUtf8(str, i, iCharCount);
                    writeCanonicalized(buffer, str, iCharCount, i2, encodeSet, z, z2, z3, z4, charset);
                    return buffer.readUtf8();
                }
                java.lang.String strSubstring = str.substring(i, i2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            }
            okio.Buffer buffer2 = new okio.Buffer();
            buffer2.writeUtf8(str, i, iCharCount);
            writeCanonicalized(buffer2, str, iCharCount, i2, encodeSet, z, z2, z3, z4, charset);
            return buffer2.readUtf8();
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0061  */
        /* JADX WARN: Code duplicated, block: B:39:0x0066  */
        /* JADX WARN: Code duplicated, block: B:41:0x0069  */
        /* JADX WARN: Code duplicated, block: B:47:0x0082  */
        /* JADX WARN: Code duplicated, block: B:50:0x008b A[LOOP:1: B:48:0x0085->B:50:0x008b, LOOP_END] */
        private final void writeCanonicalized(okio.Buffer buffer, java.lang.String str, int i, int i2, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.nio.charset.Charset charset) {
            int iCharCount = i;
            okio.Buffer buffer2 = null;
            while (iCharCount < i2) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!z || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z3) {
                        buffer.writeUtf8(z ? "+" : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (char) iCodePointAt, false, 2, (java.lang.Object) null))) {
                        if (buffer2 == null) {
                            buffer2 = new okio.Buffer();
                        }
                        if (charset != null || kotlin.jvm.internal.Intrinsics.areEqual(charset, java.nio.charset.StandardCharsets.UTF_8)) {
                            buffer2.writeUtf8CodePoint(iCodePointAt);
                        } else {
                            buffer2.writeString(str, iCharCount, java.lang.Character.charCount(iCodePointAt) + iCharCount, charset);
                        }
                        while (!buffer2.exhausted()) {
                            int i3 = buffer2.readByte() & 255;
                            buffer.writeByte(37);
                            buffer.writeByte((int) okhttp3.HttpUrl.HEX_DIGITS[(i3 >> 4) & 15]);
                            buffer.writeByte((int) okhttp3.HttpUrl.HEX_DIGITS[i3 & 15]);
                        }
                    } else {
                        if (iCodePointAt == 37) {
                            if (z) {
                                if (z2) {
                                    if (!isPercentEncoded(str, iCharCount, i2)) {
                                    }
                                }
                            }
                            if (buffer2 == null) {
                                buffer2 = new okio.Buffer();
                            }
                            if (charset != null) {
                                buffer2.writeUtf8CodePoint(iCodePointAt);
                            } else {
                                buffer2.writeUtf8CodePoint(iCodePointAt);
                            }
                            while (!buffer2.exhausted()) {
                                int i4 = buffer2.readByte() & 255;
                                buffer.writeByte(37);
                                buffer.writeByte((int) okhttp3.HttpUrl.HEX_DIGITS[(i4 >> 4) & 15]);
                                buffer.writeByte((int) okhttp3.HttpUrl.HEX_DIGITS[i4 & 15]);
                            }
                        }
                        buffer.writeUtf8CodePoint(iCodePointAt);
                    }
                }
                iCharCount += java.lang.Character.charCount(iCodePointAt);
            }
        }
    }
}
