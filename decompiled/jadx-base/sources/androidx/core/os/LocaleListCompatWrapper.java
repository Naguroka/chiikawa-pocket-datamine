package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
final class LocaleListCompatWrapper implements androidx.core.os.LocaleListInterface {
    private final java.util.Locale[] mList;
    private final java.lang.String mStringRepresentation;
    private static final java.util.Locale[] sEmptyList = new java.util.Locale[0];
    private static final java.util.Locale LOCALE_EN_XA = new java.util.Locale("en", "XA");
    private static final java.util.Locale LOCALE_AR_XB = new java.util.Locale("ar", "XB");
    private static final java.util.Locale EN_LATN = androidx.core.os.LocaleListCompat.forLanguageTagCompat("en-Latn");

    @Override // androidx.core.os.LocaleListInterface
    public java.lang.Object getLocaleList() {
        return null;
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.util.Locale get(int i) {
        if (i >= 0) {
            java.util.Locale[] localeArr = this.mList;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
        return this.mList.length == 0;
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
        return this.mList.length;
    }

    @Override // androidx.core.os.LocaleListInterface
    public int indexOf(java.util.Locale locale) {
        int i = 0;
        while (true) {
            java.util.Locale[] localeArr = this.mList;
            if (i >= localeArr.length) {
                return -1;
            }
            if (localeArr[i].equals(locale)) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.core.os.LocaleListCompatWrapper)) {
            return false;
        }
        java.util.Locale[] localeArr = ((androidx.core.os.LocaleListCompatWrapper) obj).mList;
        if (this.mList.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            java.util.Locale[] localeArr2 = this.mList;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public int hashCode() {
        int iHashCode = 1;
        for (java.util.Locale locale : this.mList) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.ironsource.y8.i.d);
        int i = 0;
        while (true) {
            java.util.Locale[] localeArr = this.mList;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.mList.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append(com.ironsource.y8.i.e);
                return sb.toString();
            }
        }
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.lang.String toLanguageTags() {
        return this.mStringRepresentation;
    }

    LocaleListCompatWrapper(java.util.Locale... localeArr) {
        if (localeArr.length == 0) {
            this.mList = sEmptyList;
            this.mStringRepresentation = "";
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            java.util.Locale locale = localeArr[i];
            if (locale == null) {
                throw new java.lang.NullPointerException("list[" + i + "] is null");
            }
            if (!hashSet.contains(locale)) {
                java.util.Locale locale2 = (java.util.Locale) locale.clone();
                arrayList.add(locale2);
                toLanguageTag(sb, locale2);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.mList = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        this.mStringRepresentation = sb.toString();
    }

    static void toLanguageTag(java.lang.StringBuilder sb, java.util.Locale locale) {
        sb.append(locale.getLanguage());
        java.lang.String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append(org.objectweb.asm.signature.SignatureVisitor.SUPER);
        sb.append(locale.getCountry());
    }

    private static java.lang.String getLikelyScript(java.util.Locale locale) {
        java.lang.String script = androidx.core.os.LocaleListCompatWrapper.Api21Impl.getScript(locale);
        return !script.isEmpty() ? script : "";
    }

    private static boolean isPseudoLocale(java.util.Locale locale) {
        return LOCALE_EN_XA.equals(locale) || LOCALE_AR_XB.equals(locale);
    }

    private static int matchScore(java.util.Locale locale, java.util.Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || isPseudoLocale(locale) || isPseudoLocale(locale2)) {
            return 0;
        }
        java.lang.String likelyScript = getLikelyScript(locale);
        if (!likelyScript.isEmpty()) {
            return likelyScript.equals(getLikelyScript(locale2)) ? 1 : 0;
        }
        java.lang.String country = locale.getCountry();
        return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
    }

    private int findFirstMatchIndex(java.util.Locale locale) {
        int i = 0;
        while (true) {
            java.util.Locale[] localeArr = this.mList;
            if (i >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (matchScore(locale, localeArr[i]) > 0) {
                return i;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001e  */
    private int computeFirstMatchIndex(java.util.Collection<java.lang.String> collection, boolean z) {
        int iFindFirstMatchIndex;
        java.util.Locale[] localeArr = this.mList;
        if (localeArr.length == 1) {
            return 0;
        }
        if (localeArr.length == 0) {
            return -1;
        }
        if (z) {
            iFindFirstMatchIndex = findFirstMatchIndex(EN_LATN);
            if (iFindFirstMatchIndex == 0) {
                return 0;
            }
            if (iFindFirstMatchIndex >= Integer.MAX_VALUE) {
                iFindFirstMatchIndex = Integer.MAX_VALUE;
            }
        } else {
            iFindFirstMatchIndex = Integer.MAX_VALUE;
        }
        java.util.Iterator<java.lang.String> it = collection.iterator();
        while (it.hasNext()) {
            int iFindFirstMatchIndex2 = findFirstMatchIndex(androidx.core.os.LocaleListCompat.forLanguageTagCompat(it.next()));
            if (iFindFirstMatchIndex2 == 0) {
                return 0;
            }
            if (iFindFirstMatchIndex2 < iFindFirstMatchIndex) {
                iFindFirstMatchIndex = iFindFirstMatchIndex2;
            }
        }
        if (iFindFirstMatchIndex == Integer.MAX_VALUE) {
            return 0;
        }
        return iFindFirstMatchIndex;
    }

    private java.util.Locale computeFirstMatch(java.util.Collection<java.lang.String> collection, boolean z) {
        int iComputeFirstMatchIndex = computeFirstMatchIndex(collection, z);
        if (iComputeFirstMatchIndex == -1) {
            return null;
        }
        return this.mList[iComputeFirstMatchIndex];
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.util.Locale getFirstMatch(java.lang.String[] strArr) {
        return computeFirstMatch(java.util.Arrays.asList(strArr), false);
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static java.lang.String getScript(java.util.Locale locale) {
            return locale.getScript();
        }
    }
}
