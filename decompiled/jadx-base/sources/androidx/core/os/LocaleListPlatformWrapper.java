package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
final class LocaleListPlatformWrapper implements androidx.core.os.LocaleListInterface {
    private final android.os.LocaleList mLocaleList;

    LocaleListPlatformWrapper(java.lang.Object obj) {
        this.mLocaleList = (android.os.LocaleList) obj;
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.lang.Object getLocaleList() {
        return this.mLocaleList;
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.util.Locale get(int i) {
        return this.mLocaleList.get(i);
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
        return this.mLocaleList.isEmpty();
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
        return this.mLocaleList.size();
    }

    @Override // androidx.core.os.LocaleListInterface
    public int indexOf(java.util.Locale locale) {
        return this.mLocaleList.indexOf(locale);
    }

    public boolean equals(java.lang.Object obj) {
        return this.mLocaleList.equals(((androidx.core.os.LocaleListInterface) obj).getLocaleList());
    }

    public int hashCode() {
        return this.mLocaleList.hashCode();
    }

    public java.lang.String toString() {
        return this.mLocaleList.toString();
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.lang.String toLanguageTags() {
        return this.mLocaleList.toLanguageTags();
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.util.Locale getFirstMatch(java.lang.String[] strArr) {
        return this.mLocaleList.getFirstMatch(strArr);
    }
}
