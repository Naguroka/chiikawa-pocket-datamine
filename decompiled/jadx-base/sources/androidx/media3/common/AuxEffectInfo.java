package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class AuxEffectInfo {
    public static final int NO_AUX_EFFECT_ID = 0;
    public final int effectId;
    public final float sendLevel;

    public AuxEffectInfo(int i, float f) {
        this.effectId = i;
        this.sendLevel = f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.AuxEffectInfo auxEffectInfo = (androidx.media3.common.AuxEffectInfo) obj;
        return this.effectId == auxEffectInfo.effectId && java.lang.Float.compare(auxEffectInfo.sendLevel, this.sendLevel) == 0;
    }

    public int hashCode() {
        return ((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.effectId) * 31) + java.lang.Float.floatToIntBits(this.sendLevel);
    }
}
