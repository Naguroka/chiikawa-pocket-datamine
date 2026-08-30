package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ironsource/ds;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "b", "Ljava/lang/String;", "url", "", "Ljava/util/List;", "storeUrls", "c", "Z", "withSecureCheck", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ds {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.util.List<java.lang.String> storeUrls;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean withSecureCheck;

    public ds(java.lang.String str, java.util.List<java.lang.String> list, boolean z) {
        this.url = str;
        this.storeUrls = list;
        this.withSecureCheck = z;
    }

    public /* synthetic */ ds(java.lang.String str, java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? false : z);
    }

    public final boolean a() {
        boolean z;
        boolean z2;
        if (this.withSecureCheck) {
            java.util.List<java.lang.String> list = this.storeUrls;
            if (list == null) {
                return false;
            }
            if (!list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    }
                    java.lang.String str = (java.lang.String) it.next();
                    java.lang.String str2 = this.url;
                    if (str2 != null && kotlin.text.StringsKt.startsWith$default(str2, str, false, 2, (java.lang.Object) null)) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            if (!z2) {
                return false;
            }
        } else {
            java.util.List<java.lang.String> list2 = this.storeUrls;
            if (list2 == null) {
                return false;
            }
            if (!list2.isEmpty()) {
                java.util.Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    java.lang.String str3 = (java.lang.String) it2.next();
                    java.lang.String str4 = this.url;
                    if (str4 != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str4, (java.lang.CharSequence) str3, false, 2, (java.lang.Object) null)) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }
}
