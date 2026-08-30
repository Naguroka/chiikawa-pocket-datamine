package com.google.ads.mediation.line;

/* JADX INFO: compiled from: LineExtras.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/google/ads/mediation/line/LineExtras;", "", com.google.ads.mediation.line.LineExtras.KEY_ENABLE_AD_SOUND, "", "(Z)V", "getEnableAdSound", "()Z", "build", "Landroid/os/Bundle;", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LineExtras {
    public static final java.lang.String KEY_ENABLE_AD_SOUND = "enableAdSound";
    private final boolean enableAdSound;

    public LineExtras() {
        this(false, 1, null);
    }

    public static /* synthetic */ com.google.ads.mediation.line.LineExtras copy$default(com.google.ads.mediation.line.LineExtras lineExtras, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = lineExtras.enableAdSound;
        }
        return lineExtras.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnableAdSound() {
        return this.enableAdSound;
    }

    public final com.google.ads.mediation.line.LineExtras copy(boolean enableAdSound) {
        return new com.google.ads.mediation.line.LineExtras(enableAdSound);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.google.ads.mediation.line.LineExtras) && this.enableAdSound == ((com.google.ads.mediation.line.LineExtras) other).enableAdSound;
    }

    public int hashCode() {
        boolean z = this.enableAdSound;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public java.lang.String toString() {
        return "LineExtras(enableAdSound=" + this.enableAdSound + ")";
    }

    public LineExtras(boolean z) {
        this.enableAdSound = z;
    }

    public /* synthetic */ LineExtras(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getEnableAdSound() {
        return this.enableAdSound;
    }

    public final android.os.Bundle build() {
        return androidx.core.os.BundleKt.bundleOf(kotlin.TuplesKt.to(KEY_ENABLE_AD_SOUND, java.lang.Boolean.valueOf(this.enableAdSound)));
    }
}
