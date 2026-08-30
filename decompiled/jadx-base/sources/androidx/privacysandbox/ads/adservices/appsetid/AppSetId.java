package androidx.privacysandbox.ads.adservices.appsetid;

/* JADX INFO: compiled from: AppSetId.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/privacysandbox/ads/adservices/appsetid/AppSetId;", "", "id", "", "scope", "", "(Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getScope", "()I", "equals", "", "other", "hashCode", "toString", "Companion", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppSetId {
    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;
    private final java.lang.String id;
    private final int scope;

    public AppSetId(java.lang.String id, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.scope = i;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (!z) {
            throw new java.lang.IllegalArgumentException("Scope undefined.".toString());
        }
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final int getScope() {
        return this.scope;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.appsetid.AppSetId)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.appsetid.AppSetId appSetId = (androidx.privacysandbox.ads.adservices.appsetid.AppSetId) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, appSetId.id) && this.scope == appSetId.scope;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + java.lang.Integer.hashCode(this.scope);
    }

    public java.lang.String toString() {
        return "AppSetId: id=" + this.id + ", scope=" + (this.scope == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
